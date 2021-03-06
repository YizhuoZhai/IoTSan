package edu.ksu.cis.bandera.jext;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Bandera, a Java(TM) analysis and transformation toolkit           *
 * Copyright (C) 1998, 1999   Shawn Laubach (laubach@acm.org)        *
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
//AbstractBanderaValueSwitch.java
import ca.mcgill.sable.soot.jimple.*;

/**
 * The extension to the value switch to handle all the nex expressions.
 *
 * @author <a href="mailto:laubach@cis.ksu.edu">Shawn Laubach</a>
 *
 * @version 0.1
 */
public abstract class AbstractBanderaValueSwitch 
  extends AbstractJimpleValueSwitch  implements BanderaValueSwitch
{
/**
 * This method was created in VisualAge.
 * @param v edu.ksu.cis.bandera.jext.ChooseExpr
 */
public void caseChooseExpr(ChooseExpr v) {
	defaultCase(v);
}
public void caseExternalChooseExpr(ExternalChooseExpr v) {
	defaultCase(v);
}
/**
 * 
 * @param expr edu.ksu.cis.bandera.jext.ComplementExpr
 */
public void caseComplementExpr(ComplementExpr expr) {
	defaultCase(expr);
}
/**
 * This method was created in VisualAge.
 * @param v edu.ksu.cis.bandera.jext.InExpr
 */
public void caseInExpr(InExpr v) {
	defaultCase(v);
}
/**
 * 
 * @param v edu.ksu.cis.bandera.jext.LocalExpr
 */
public void caseLocalExpr(LocalExpr v) {
	defaultCase(v);
}
/**
 * 
 * @param e edu.ksu.cis.bandera.jext.LocationTestExpr
 */
public void caseLocationTestExpr(LocationTestExpr e) {
	defaultCase(e);
}
/**
 * 
 * @param expr edu.ksu.cis.bandera.jext.LogicalAndExpr
 */
public void caseLogicalAndExpr(LogicalAndExpr expr) {
	defaultCase(expr);
}
/**
 * 
 * @param expr edu.ksu.cis.bandera.jext.LogicalOrExpr
 */
public void caseLogicalOrExpr(LogicalOrExpr expr) {
	defaultCase(expr);
}
/**
 * 
 * @param exp edu.ksu.cis.bandera.jext.ThreadExpr
 */
public void caseThreadExpr(ThreadExpr exp) {
	defaultCase(exp);
}
}
