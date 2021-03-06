package ca.mcgill.sable.soot.grimp;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Grimp, an aggregated-expression Java(TM) bytecode representation. *
 * Copyright (C) 1999 Patrick Lam (plam@sable.mcgill.ca)             *
 * All rights reserved.                                              *
 *                                                                   *
 * Portions by Raja Vallee-Rai (rvalleerai@sable.mcgill.ca) are      *
 * Copyright (C) 1998 Raja Vallee-Rai (rvalleerai@sable.mcgill.ca).  *
 * All rights reserved.                                              *
 *                                                                   *
 * Portions by Etienne Gagnon (gagnon@sable.mcgill.ca) are           *
 * Copyright (C) 1998 Etienne Gagnon (gagnon@sable.mcgill.ca).  All  *
 * rights reserved.                                                  *
 *                                                                   *
 * This work was done as a project of the Sable Research Group,      *
 * School of Computer Science, McGill University, Canada             *
 * (http://www.sable.mcgill.ca/).  It is understood that any         *
 * modification not identified as such is not covered by the         *
 * preceding statement.                                              *
 *                                                                   *
 * This work is free software; you can redistribute it and/or        *
 * modify it under the terms of the GNU Library General Public       *
 * License as published by the Free Software Foundation; either      *
 * version 2 of the License, or (at your option) any later version.  *
 *                                                                   *
 * This work is distributed in the hope that it will be useful,      *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of    *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU *
 * Library General Public License for more details.                  *
 *                                                                   *
 * You should have received a copy of the GNU Library General Public *
 * License along with this library; if not, write to the             *
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,      *
 * Boston, MA  02111-1307, USA.                                      *
 *                                                                   *
 * Java is a trademark of Sun Microsystems, Inc.                     *
 *                                                                   *
 * To submit a bug report, send a comment, or get the latest news on *
 * this project and other Sable Research Group projects, please      *
 * visit the web site: http://www.sable.mcgill.ca/                   *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

/*
 Reference Version
 -----------------
 This is the latest official version on which this file is based.
 The reference version is: $SootVersion: 1.beta.4 $

 Change History
 --------------
 A) Notes:

 Please use the following template.  Most recent changes should
 appear at the top of the list.

 - Modified on [date (March 1, 1900)] by [name]. [(*) if appropriate]
   [description of modification].

 Any Modification flagged with "(*)" was done as a project of the
 Sable Research Group, School of Computer Science,
 McGill University, Canada (http://www.sable.mcgill.ca/).

 You should add your copyright, using the following template, at
 the top of this file, along with other copyrights.

 *                                                                   *
 * Modifications by [name] are                                       *
 * Copyright (C) [year(s)] [your name (or company)].  All rights     *
 * reserved.                                                         *
 *                                                                   *

 B) Changes:

 - Modified on February 3, 1999 by Patrick Lam (plam@sable.mcgill.ca). (*)
   First release of Grimp.
*/

import ca.mcgill.sable.soot.*;
import ca.mcgill.sable.soot.jimple.*;
import ca.mcgill.sable.util.*;
import java.io.*;

public class Main
{
	static boolean naiveJimplification;
	static boolean onlyJimpleOutput;
	public static boolean isVerbose;
	static boolean onlyJasminOutput;
	static boolean isProfilingOptimization;
	static boolean oldTyping;
	static boolean isInDebugMode;
	static boolean usePackedLive;
	static boolean usePackedDefs = true;
	static boolean isTestingPerformance;

	public static String jimpleClassPath;

	static boolean produceJimpleFile,
		produceJasminFile,
		produceJimpFile,
	produceGrimpleFile,
	produceGrimpFile = true;

	static Timer copiesTimer = new Timer(),
		defsTimer = new Timer(),
		usesTimer = new Timer(),
		liveTimer = new Timer(),
		splitTimer = new Timer(),
		packTimer = new Timer(),
		cleanup1Timer = new Timer(),
		cleanup2Timer = new Timer(),
		conversionTimer = new Timer(),
		cleanupAlgorithmTimer = new Timer(),
		graphTimer = new Timer(),
		assignTimer = new Timer(),
		resolveTimer = new Timer(),
	aggregationTimer = new Timer(),
		totalTimer = new Timer();

	static int conversionLocalCount,
		cleanup1LocalCount,
		splitLocalCount,
		assignLocalCount,
		packLocalCount,
		cleanup2LocalCount;

	static int conversionStmtCount,
		cleanup1StmtCount,
		splitStmtCount,
		assignStmtCount,
		packStmtCount,
		cleanup2StmtCount;


	private static void handleClass(SootClass c, String postFix, PrintWriter writerOut, int buildBodyOptions)
	{
		if(postFix.equals(".jasmin"))
			new JasminClass(c, new BuildBody(Grimp.v(), new StoredBody(ClassFile.v()))).print(writerOut);
		else if(postFix.equals(".jimp") || postFix.equals(".grimp"))
		{
			c.printTo(new BuildBody(Grimp.v(), new StoredBody(ClassFile.v()), buildBodyOptions),
				writerOut, PrintGrimpBodyOption.USE_ABBREVIATIONS);
		}
		else
			c.printTo(new BuildBody(Grimp.v(), new StoredBody(ClassFile.v()), buildBodyOptions),
				writerOut);
	}
	public static void main(String[] args) throws RuntimeException
	{
		int firstNonOption = 0;
		long stmtCount = 0;
		int buildBodyOptions = 0;

		totalTimer.start();

		SootClassManager cm = new SootClassManager();

		if(args.length == 0)
		{
// $Format: "            System.out.println(\"Grimp version $ProjectVersion$\");"$
			System.out.println("Grimp version 1.beta.4");
			System.out.println("Copyright (C) 1999 Patrick Lam (plam@sable.mcgill.ca).");
			System.out.println("All rights reserved.");
			System.out.println("Portions copyright (C) 1997, 1998 Raja Vallee-Rai (kor@sable.mcgill.ca).");
			System.out.println("All rights reserved.");
			System.out.println("");
			System.out.println("Portions copyright (C) 1997 Clark Verbrugge (clump@sable.mcgill.ca).");
			System.out.println("All rights reserved.");
			System.out.println("");
			System.out.println("Modifications are copyright (C) 1997, 1998 by their respective contributors.");
			System.out.println("See individual source files for details.");
			System.out.println("");
			System.out.println("Grimp comes with ABSOLUTELY NO WARRANTY.  This is free software,");
			System.out.println("and you are welcome to redistribute it under certain conditions.");
			System.out.println("See the accompanying file 'COPYING' for details.");
			System.out.println("");
			System.out.println("Syntax: java ca.mcgill.sable.soot.grimp.Main [options] class");
			System.out.println("");
			System.out.println("Classpath Option:");
			System.out.println("    -jimpleClassPath <path>   uses <path> as classpath for finding classes");
			System.out.println("");
			System.out.println("Output Options:");
	    System.out.println("    -grimple                  produce .grimple code");
	    System.out.println("    -grimp                    produce .grimp (short .grimple) code [default]");
			System.out.println("    -jasmin                   produce .jasmin code");
			System.out.println("");
			System.out.println("Jimplification Options:");
			System.out.println("    -nocleanup                no constant or copy propagation is performed");
			System.out.println("    -nosplitting              no splitting of variables is performed");
			System.out.println("    -nocleanup                no constant or copy propagation is performed");
			System.out.println("    -oldtyping                use old typing algorithm");
			System.out.println("    -typeless                 do not assign types.  Cannot be used with -jasmin");
			System.out.println("                              or -nolocalpacking ");
			System.out.println("    -nolocalpacking           do not re-use locals after jimplification");
			System.out.println("    -noaggregating            do not perform any Jimple-level aggregation");
			System.out.println("");
			System.out.println("Profiling/Debugging Options:");
			System.out.println("    -timetransform            perform full transformation and print timings");
			System.out.println("    -verbose                  print out jimplification process");
			System.out.println("    -debug                    avoid catching errors during jimplification");
			System.out.println("                              does not throw exception if error in typing");
			System.exit(0);
		}

		// Handle all the options
			for(int i = 0; i < args.length; i++)
			{
				if(args[i].equals("-jimple"))
		    {
			produceJimpleFile = true;
			buildBodyOptions|=BuildGrimpBodyOption.NO_AGGREGATING;
		    }
				else if(args[i].equals("-jasmin"))
					{
			produceJasminFile = true;
			buildBodyOptions|=BuildGrimpBodyOption.NO_AGGREGATING;
		    }
				else if(args[i].equals("-jimp"))
		    {
			produceJimpFile = true;
			buildBodyOptions|=BuildGrimpBodyOption.NO_AGGREGATING;
		    }
		else if(args[i].equals("-grimple"))
		    produceGrimpleFile = true;
		else if(args[i].equals("-grimp"))
		    produceGrimpFile = true;
				else if(args[i].equals("-nocleanup"))
					buildBodyOptions |= BuildGrimpBodyOption.NO_CLEANUP;
				else if(args[i].equals("-typeless"))
					buildBodyOptions |= BuildGrimpBodyOption.NO_TYPING;
				else if(args[i].equals("-nolocalpacking"))
					buildBodyOptions |= BuildGrimpBodyOption.NO_PACKING;
				else if(args[i].equals("-usepackedlive"))
					usePackedLive = true;
				else if(args[i].equals("-usepackeddefs"))
					usePackedDefs = true;    
				else if(args[i].equals("-testperf"))
				{
					isProfilingOptimization = true;
					isTestingPerformance = true;
				}
				else if(args[i].equals("-timetransform"))
					isProfilingOptimization = true;
				else if(args[i].equals("-verbose"))
					isVerbose = true;
				else if(args[i].equals("-nosplitting"))
					buildBodyOptions |= BuildGrimpBodyOption.NO_SPLITTING;
				else if(args[i].equals("-oldtyping"))
					oldTyping = true;
				else if(args[i].equals("-jimpleClassPath"))
				{   if(++i < args.length)
						jimpleClassPath = args[i];
				}
				else if(args[i].equals("-debug"))
					isInDebugMode = true;
				else if(args[i].startsWith("-"))
				{
					System.out.println("Unrecognized option: " + args[i]);
					System.exit(0);
				}
				else
					break;

				firstNonOption = i + 1;
			}

		// Handle all the classes
		{
			int numFailed = 0;
			int numSuccess = 0;

			List listBodies = new ArrayList();

			for(int i = firstNonOption; i < args.length; i++)
			{
				SootClass c = cm.getClass(args[i]);
				String postFix;
				PrintWriter writerOut = null;
				FileOutputStream streamOut = null;

				System.out.print("Jimplifying " + c.getName() + "... " );
				System.out.flush();

				// Open output file.
				{
					if(produceJasminFile)
						postFix = ".jasmin";
					else if(produceJimpleFile)
						postFix = ".jimple";
		    else if(produceJimpFile)
						postFix = ".jimp";
		    else if(produceGrimpleFile)
			postFix = ".grimple";
					else
			postFix = ".grimp";

					try {
						streamOut = new FileOutputStream(c.getName() + postFix);
						writerOut = new PrintWriter(streamOut);
					}
					catch (IOException e)
					{
						System.out.println("Cannot output file " + c.getName() + postFix);
					}
				}

				if(isProfilingOptimization)
				{
					Iterator methodIt = c.getMethods().iterator();
					long localStmtCount = 0;

					try {
						while(methodIt.hasNext())
						{
							SootMethod m = (SootMethod) methodIt.next();
							GrimpBody listBody = new GrimpBody(m);

							listBodies.add(listBody);
							localStmtCount += listBody.getStmtList().size();
						}

						stmtCount += localStmtCount;

						System.out.println(localStmtCount + " stmts  ");
						numSuccess++;
					}
					catch(Exception e)
					{
						System.out.println("failed due to: " + e);
						numFailed++;
					}
				}

				// Produce the file
				{
					if(!isInDebugMode)
					{
						  try {
							handleClass(c, postFix, writerOut, buildBodyOptions);
						  }
						  catch(Exception e)
						  {
							  System.out.println("failed due to: " + e);
						  }
					}
					else {
						handleClass(c, postFix, writerOut, buildBodyOptions);
					}
					System.out.println("node count: "+
									   ca.mcgill.sable.soot.jimple.Transformations.nodeCount);
					System.out.println("aggregation count: "+
									   ca.mcgill.sable.soot.jimple.Transformations.aggrCount);

					try {
						writerOut.flush();
						streamOut.close();
					}
					catch(IOException e )
					{
						System.out.println("Cannot close output file " + c.getName() + postFix);
					}

					System.out.println();
				}
			}
			
			if(isProfilingOptimization)
			{
				System.out.println("Successfully jimplified " + numSuccess + " classfiles; failed on " + numFailed + ".");

				// Count number of statements stored
				{
					Iterator bodyIt = listBodies.iterator();
					long storedStmtCount = 0;

					while(bodyIt.hasNext())
					{
						GrimpBody listBody = (GrimpBody) bodyIt.next();
						storedStmtCount += listBody.getStmtList().size();
					}

					System.out.println("Confirmed " + storedStmtCount + " stored statements.");
					System.out.println();
				}

				System.out.println("graphTimer: " + graphTimer.getTime());
				System.out.println("defsTimer: " + defsTimer.getTime());
				System.out.println("usesTimer: " + usesTimer.getTime());
				System.out.println("cleanupAlgorithmTimer: " + cleanupAlgorithmTimer.getTime());
				System.out.println("copiesTimer: " + copiesTimer.getTime());
				System.out.println("liveTimer: " + liveTimer.getTime());
				System.out.println("resolveTimer: " + resolveTimer.getTime());

				System.out.println();

				// Print out time stats.
				{
					long conversionTime = conversionTimer.getTime();
					long cleanup1Time = cleanup1Timer.getTime();
					long splitTime = splitTimer.getTime();
					long assignTime = assignTimer.getTime();
					long packTime = packTimer.getTime();
					long cleanup2Time = cleanup2Timer.getTime();

					totalTimer.end();
					long totalTime = totalTimer.getTime();
					float timeInSecs;

					System.out.println("conversionTimer: " + conversionTime +
						"(" + (conversionTime * 100 / totalTime) + "%) " +
						conversionLocalCount + " locals  " + conversionStmtCount + " stmts");
					System.out.println("cleanup1Timer:   " + cleanup1Time +
						"(" + (cleanup1Time * 100 / totalTime) + "%) " +
						cleanup1LocalCount + " locals  " + cleanup1StmtCount + " stmts");
					System.out.println("splitTimer:      " + splitTime +
						"(" + (splitTime * 100 / totalTime) + "%) " +
						splitLocalCount + " locals  " + splitStmtCount + " stmts");
					System.out.println("assignTimer:     " + assignTime +
						"(" + (assignTime * 100 / totalTime) + "%) " +
						assignLocalCount + " locals  " + assignStmtCount + " stmts");
					System.out.println("packTimer:       " + packTime +
						"(" + (packTime * 100 / totalTime) + "%) " +
						packLocalCount + " locals  " + packStmtCount + " stmts");
					System.out.println("cleanup2Timer:   " + cleanup2Time +
						"(" + (cleanup2Time * 100 / totalTime) + "%) " +
						cleanup2LocalCount + " locals  " + cleanup2StmtCount + " stmts");

					timeInSecs = (float) totalTime / 1000.0f;
					float memoryUsed = (float) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1000.0f;

					System.out.println("stmts created: " + stmtCount);

					System.out.println("totalTime:" + timeInSecs + "s  " + (float) stmtCount / timeInSecs + " (stmts/sec)");
					System.out.println("totalMemory:" + memoryUsed + "k  " + (float) memoryUsed / stmtCount+ " (k/stmt)");

				}
			}
	}

	}
}
