package edu.ksu.cis.bandera.specification.pattern.parser;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Bandera, a Java(TM) analysis and transformation toolkit           *
 * Copyright (C) 1998-2001 SAnToS Laboratories (santos@cis.ksu.edu)  *

 * All rights reserved.                                              *
 *                                                                   *
 * This work was done as a project in the SAnToS Laboratory,         *
 * Department of Computing and Information Sciences, Kansas State    *
 * University, USA (http://www.cis.ksu.edu/santos).                  *
 * It is understood that any modification not identified as such is  *
 * not covered by the preceding statement.                           *
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
 * License along with this toolkit; if not, write to the             *
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,      *
 * Boston, MA  02111-1307, USA.                                      *
 *                                                                   *
 * Java is a trademark of Sun Microsystems, Inc.                     *
 *                                                                   *
 * To submit a bug report, send a comment, or get the latest news on *
 * this project and other SAnToS projects, please visit the web-site *
 *                http://www.cis.ksu.edu/santos                      *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
/* This file was generated by SableCC (http://www.sable.mcgill.ca/sablecc/). */

import edu.ksu.cis.bandera.specification.pattern.node.*;
import edu.ksu.cis.bandera.specification.pattern.analysis.*;

class TokenIndex extends AnalysisAdapter
{
	int index;

	public void caseEOF(EOF node)
	{
		index = 8;
	}
	public void caseTComma(TComma node)
	{
		index = 2;
	}
	public void caseTEqual(TEqual node)
	{
		index = 4;
	}
	public void caseTId(TId node)
	{
		index = 7;
	}
	public void caseTLBrace(TLBrace node)
	{
		index = 0;
	}
	public void caseTPattern(TPattern node)
	{
		index = 5;
	}
	public void caseTPlus(TPlus node)
	{
		index = 3;
	}
	public void caseTRBrace(TRBrace node)
	{
		index = 1;
	}
	public void caseTStringLiteral(TStringLiteral node)
	{
		index = 6;
	}
}
