package ca.mcgill.sable.soot.jimple;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Jimple, a 3-address code Java(TM) bytecode representation.        *
 * Copyright (C) 1997, 1998 Raja Vallee-Rai (kor@sable.mcgill.ca)    *
 * All rights reserved.                                              *
 *                                                                   *
 * Modifications by Etienne Gagnon (gagnon@sable.mcgill.ca) are      *
 * Copyright (C) 1998 Etienne Gagnon (gagnon@sable.mcgill.ca).  All  *
 * rights reserved.                                                  *
 *                                                                   *
 * Modifications by Patrick Lam (plam@sable.mcgill.ca) are           *
 * Copyright (C) 1999 Patrick Lam.  All rights reserved.             *
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

 - Modified on March 1, 1999 by Raja Vallee-Rai (rvalleerai@sable.mcgill.ca) (*)
   Temporarily took out the NextNextRef until the jsrs are fixed.
   
 - Modified on February 3, 1999 by Patrick Lam (plam@sable.mcgill.ca) (*)
   Added changes in support of the Grimp intermediate
   representation (with aggregated-expressions).

 - Modified on November 2, 1998 by Raja Vallee-Rai (kor@sable.mcgill.ca) (*)
   Repackaged all source files and performed extensive modifications.
   First initial release of Soot.

 - Modified on September 12, 1998 by Raja Vallee-Rai (kor@sable.mcgill.ca (*)
   Changed PrintStream to PrintWriter.

 - Modified on 31-Aug-1998 by Raja Vallee-Rai (kor@sable.mcgill.ca). (*)
   Minor print changes.

 - Modified on 23-Jul-1998 by Raja Vallee-Rai (kor@sable.mcgill.ca). (*)
   Changed Hashtable to HashMap.

 - Modified on July 5, 1998 by Etienne Gagnon (gagnon@sable.mcgill.ca). (*)
   Changed caseDefault to defaultCase, to avoid name conflicts (and conform
   to the standard).

 - Modified on 15-Jun-1998 by Raja Vallee-Rai (kor@sable.mcgill.ca). (*)
   First internal release (Version 0.1).
*/

import ca.mcgill.sable.soot.*;
import ca.mcgill.sable.util.*;
import java.io.*;

/**
	The Jimple class contains all the constructors for the components of the Jimple
	grammar for the Jimple body. <br><br>

	Immediate -> Local | Constant <br>
	RValue -> Local | Constant | ConcreteRef | Expr<br>
	Variable -> Local | ArrayRef | InstanceFieldRef | StaticFieldRef <br>
 */


public class Jimple implements BodyRepresentation
{
	private static Jimple jimpleRepresentation = new Jimple();

	protected Jimple()
	{
	}
	public Body buildBodyOfFrom(SootMethod m, Body b, int buildBodyOptions)
	{
		return new JimpleBody(m, b, buildBodyOptions);
	}
	/**
		Constructs a AddExpr(Immediate, Immediate) grammar chunk.
	 */

	public AddExpr newAddExpr(Value op1, Value op2)
	{
		return new JAddExpr(op1, op2);
	}
	/**
		Constructs a AndExpr(Immediate, Immediate) grammar chunk.
	 */

	public AndExpr newAndExpr(Value op1, Value op2)
	{
		return new JAndExpr(op1, op2);
	}
	public ValueBox newArgBox(Value value)
	{
		return new ImmediateBox(value);
	}
	/**
		Constructs a ArrayRef(Local, Immediate) grammar chunk.
	 */

	public ArrayRef newArrayRef(Value base, Value index)
	{
		return new JArrayRef(base, index);
	}
	/**
		Constructs a AssignStmt(Variable, RValue) grammar chunk.
	 */

	public AssignStmt newAssignStmt(Value variable, Value rvalue)
	{
		return new JAssignStmt(variable, rvalue);
	}
	/**
		Constructs an empty JimpleBody for the given method.
	 */
	 
	public Body newBody(SootMethod m)
	{
		return new JimpleBody(m);
	}
	/**
		Constructs a BreakpointStmt() grammar chunk.
	 */

	public BreakpointStmt newBreakpointStmt()
	{
		return new JBreakpointStmt();
	}
	/**
		Constructs a CastExpr(Immediate, Type) grammar chunk.
	 */

	public CastExpr newCastExpr(Value op1, Type t)
	{
		return new JCastExpr(op1, t);
	}
	/**
		Constructs a CaughtExceptionRef() grammar chunk.
	 */

	public CaughtExceptionRef newCaughtExceptionRef(JimpleBody b)
	{
		return new JCaughtExceptionRef(b);
	}
	/**
		Constructs a CmpExpr(Immediate, Immediate) grammar chunk.
	 */

	public CmpExpr newCmpExpr(Value op1, Value op2)
	{
		return new JCmpExpr(op1, op2);
	}
	/**
		Constructs a CmpgExpr(Immediate, Immediate) grammar chunk.
	 */

	public CmpgExpr newCmpgExpr(Value op1, Value op2)
	{
		return new JCmpgExpr(op1, op2);
	}
	/**
		Constructs a CmplExpr(Immediate, Immediate) grammar chunk.
	 */

	public CmplExpr newCmplExpr(Value op1, Value op2)
	{
		return new JCmplExpr(op1, op2);
	}
	public ValueBox newConditionExprBox(Value value)
	{
		return new ConditionExprBox(value);
	}
	/**
		Constructs a DivExpr(Immediate, Immediate) grammar chunk.
	 */

	public DivExpr newDivExpr(Value op1, Value op2)
	{
		return new JDivExpr(op1, op2);
	}
	/**
		Constructs a EnterMonitorStmt(Immediate) grammar chunk.
	 */

	public EnterMonitorStmt newEnterMonitorStmt(Value op)
	{
		return new JEnterMonitorStmt(op);
	}
	/**
		Constructs a EqExpr(Immediate, Immediate) grammar chunk.
	 */

	public EqExpr newEqExpr(Value op1, Value op2)
	{
		return new JEqExpr(op1, op2);
	}
	/**
		Constructs a ExitMonitorStmt(Immediate) grammar chunk
	 */

	public ExitMonitorStmt newExitMonitorStmt(Value op)
	{
		return new JExitMonitorStmt(op);
	}
	/**
		Constructs a GeExpr(Immediate, Immediate) grammar chunk.
	 */

	public GeExpr newGeExpr(Value op1, Value op2)
	{
		return new JGeExpr(op1, op2);
	}
	/**
		Constructs a GotoStmt(Stmt) grammar chunk.
	 */

	public GotoStmt newGotoStmt(Unit target)
	{
		return new JGotoStmt(target);
	}
	/**
		Constructs a GtExpr(Immediate, Immediate) grammar chunk.
	 */

	public GtExpr newGtExpr(Value op1, Value op2)
	{
		return new JGtExpr(op1, op2);
	}
	public ValueBox newIdentityRefBox(Value value)
	{
		return new IdentityRefBox(value);
	}
	/**
		Constructs a IdentityStmt(Local, IdentityRef) grammar chunk.
	 */

	public IdentityStmt newIdentityStmt(Value local, Value identityRef)
	{
		return new JIdentityStmt(local, identityRef);
	}
	/**
		Constructs a IfStmt(Condition, Stmt) grammar chunk.
	 */

	public IfStmt newIfStmt(Value condition, Unit target)
	{
		return new JIfStmt(condition, target);
	}
	public ValueBox newImmediateBox(Value value)
	{
		return new ImmediateBox(value);
	}
	/**
		Constructs a NextNextStmtRef() grammar chunk.
	 */

	 /*
	public NextNextStmtRef newNextNextStmtRef()
	{
		return new NextNextStmtRef();
	}
*/

	/**
		Constructs a InstanceFieldRef(Value, SootField) grammar chunk.
	 */

	public InstanceFieldRef newInstanceFieldRef(Value base, SootField f)
	{
		return new JInstanceFieldRef(base, f);
	}
	/**
		Constructs a InstanceOfExpr(Immediate, Type)
		grammar chunk.
	 */

	public InstanceOfExpr newInstanceOfExpr(Value op1, Type t)
	{
		return new JInstanceOfExpr(op1, t);
	}
	/**
		Constructs a NewInterfaceInvokeExpr(Local base, SootMethod method, List of Immediate) grammar chunk.
	 */

	public InterfaceInvokeExpr newInterfaceInvokeExpr(Local base, SootMethod method, List args)
	{
		return new JInterfaceInvokeExpr(base, method, args);
	}
	public ValueBox newInvokeExprBox(Value value)
	{
		return new InvokeExprBox(value);
	}
	/**
		Constructs a InvokeStmt(InvokeExpr) grammar chunk.
	 */

	public InvokeStmt newInvokeStmt(Value op)
	{
		return new JInvokeStmt(op);
	}
	/**
		Constructs a LeExpr(Immediate, Immediate) grammar chunk.
	 */

	public LeExpr newLeExpr(Value op1, Value op2)
	{
		return new JLeExpr(op1, op2);
	}
	/**
		Constructs a LengthExpr(Immediate) grammar chunk.
	 */

	public LengthExpr newLengthExpr(Value op)
	{
		return new JLengthExpr(op);
	}
	/**
		Constructs a Local with the given name and type.
	*/

	public Local newLocal(String name, Type t)
	{
		return new Local(name, t);
	}
	public ValueBox newLocalBox(Value value)
	{
		return new LocalBox(value);
	}
	/**
		Constructs a LookupSwitchStmt(Immediate, List of Immediate, List of Unit, Stmt) grammar chunk.
	 */

	public LookupSwitchStmt newLookupSwitchStmt(Value key, List lookupValues, List targets, Unit defaultTarget)
	{
		return new JLookupSwitchStmt(key, lookupValues, targets, defaultTarget);
	}
	/**
		Constructs a LtExpr(Immediate, Immediate) grammar chunk.
	 */

	public LtExpr newLtExpr(Value op1, Value op2)
	{
		return new JLtExpr(op1, op2);
	}
	/**
		Constructs a MulExpr(Immediate, Immediate) grammar chunk.
	 */

	public MulExpr newMulExpr(Value op1, Value op2)
	{
		return new JMulExpr(op1, op2);
	}
	/**
		Constructs a NeExpr(Immediate, Immediate) grammar chunk.
	 */

	public NeExpr newNeExpr(Value op1, Value op2)
	{
		return new JNeExpr(op1, op2);
	}
	/**
		Constructs a NegExpr(Immediate, Immediate) grammar chunk.
	 */

	public NegExpr newNegExpr(Value op)
	{
		return new JNegExpr(op);
	}
	/**
		Constructs a NewArrayExpr(Type, Immediate) grammar chunk.
	 */

	public NewArrayExpr newNewArrayExpr(Type type, Value size)
	{
		return new JNewArrayExpr(type, size);
	}
	/**
		Constructs a NewExpr(RefType) grammar chunk.
	 */

	public NewExpr newNewExpr(RefType type)
	{
		return new JNewExpr(type);
	}
	/**
		Constructs a NewMultiArrayExpr(ArrayType, List of Immediate) grammar chunk.
	 */

	public NewMultiArrayExpr newNewMultiArrayExpr(ArrayType type, List sizes)
	{
		return new JNewMultiArrayExpr(type, sizes);
	}
	/**
		Constructs a NopStmt() grammar chunk.
	 */

	public NopStmt newNopStmt()
	{
		return new JNopStmt();
	}
	/**
		Constructs a OrExpr(Immediate, Immediate) grammar chunk.
	 */

	public OrExpr newOrExpr(Value op1, Value op2)
	{
		return new JOrExpr(op1, op2);
	}
	/**
		Constructs a ParameterRef(SootMethod, int) grammar chunk.
	 */

	public ParameterRef newParameterRef(SootMethod m, int number)
	{
		return new ParameterRef(m, number);
	}
	/**
		Constructs a RemExpr(Immediate, Immediate) grammar chunk.
	 */

	public RemExpr newRemExpr(Value op1, Value op2)
	{
		return new JRemExpr(op1, op2);
	}
	/**
		Constructs a RetStmt(Local) grammar chunk.
	 */

	public RetStmt newRetStmt(Value stmtAddress)
	{
		return new JRetStmt(stmtAddress);
	}
	/**
		Constructs a ReturnStmt(Immediate) grammar chunk.
	 */

	public ReturnStmt newReturnStmt(Value op)
	{
		return new JReturnStmt(op);
	}
	/**
		Constructs a ReturnVoidStmt() grammar chunk.
	 */

	public ReturnVoidStmt newReturnVoidStmt()
	{
		return new JReturnVoidStmt();
	}
	public ValueBox newRValueBox(Value value)
	{
		return new RValueBox(value);
	}
	/**
		Constructs a ShlExpr(Immediate, Immediate) grammar chunk.
	 */

	public ShlExpr newShlExpr(Value op1, Value op2)
	{
		return new JShlExpr(op1, op2);
	}
	/**
		Constructs a ShrExpr(Immediate, Immediate) grammar chunk.
	 */

	public ShrExpr newShrExpr(Value op1, Value op2)
	{
		return new JShrExpr(op1, op2);
	}
	/**
		Constructs a NewSpecialInvokeExpr(Local base, SootMethod method, List of Immediate) grammar chunk.
	 */

	public SpecialInvokeExpr newSpecialInvokeExpr(Local base, SootMethod method, List args)
	{
		return new JSpecialInvokeExpr(base, method, args);
	}
	/**
		Constructs a StaticFieldRef(SootField) grammar chunk.
	 */

	public StaticFieldRef newStaticFieldRef(SootField f)
	{
		return new StaticFieldRef(f);
	}
	/**
		Constructs a NewStaticInvokeExpr(ArrayType, List of Immediate) grammar chunk.
	 */

	public StaticInvokeExpr newStaticInvokeExpr(SootMethod method, List args)
	{
		return new JStaticInvokeExpr(method, args);
	}
	public UnitBox newStmtBox(Unit unit)
	{
		return new StmtBox((Stmt) unit);
	}
	/**
		Constructs a SubExpr(Immediate, Immediate) grammar chunk.
	 */

	public SubExpr newSubExpr(Value op1, Value op2)
	{
		return new JSubExpr(op1, op2);
	}
	/**
		Constructs a TableSwitchStmt(Immediate, int, int, List of Unit, Stmt) grammar chunk.
	 */

	public TableSwitchStmt newTableSwitchStmt(Value key, int lowIndex, int highIndex, List targets, Unit defaultTarget)
	{
		return new JTableSwitchStmt(key, lowIndex, highIndex, targets, defaultTarget);
	}
	/**
		Constructs a ThisRef(SootClass) grammar chunk.
	 */

	public ThisRef newThisRef(SootClass c)
	{
		return new ThisRef(c);
	}
	/**
		Constructs a ThrowStmt(Immediate) grammar chunk.
	 */

	public ThrowStmt newThrowStmt(Value op)
	{
		return new JThrowStmt(op);
	}
	/**
		Constructs a new JTrap for the given exception on the given Stmt range with the given Stmt handler.
	*/

	public Trap newTrap(SootClass exception, Unit beginStmt, Unit endStmt, Unit handlerStmt)
	{
		return new JTrap(exception, beginStmt, endStmt, handlerStmt);
	}
	/**
		Constructs a UshrExpr(Immediate, Immediate) grammar chunk.
	 */

	public UshrExpr newUshrExpr(Value op1, Value op2)
	{
		return new JUshrExpr(op1, op2);
	}
	public ValueBox newVariableBox(Value value)
	{
		return new VariableBox(value);
	}
	/**
		Constructs a NewVirtualInvokeExpr(Local base, SootMethod method, List of Immediate) grammar chunk.
	 */

	public VirtualInvokeExpr newVirtualInvokeExpr(Local base, SootMethod method, List args)
	{
		return new JVirtualInvokeExpr(base, method, args);
	}
	/**
		Constructs a XorExpr(Immediate, Immediate) grammar chunk.
	 */

	public XorExpr newXorExpr(Value op1, Value op2)
	{
		return new JXorExpr(op1, op2);
	}
	public static Jimple v()
	{
		return jimpleRepresentation;
	}
}
