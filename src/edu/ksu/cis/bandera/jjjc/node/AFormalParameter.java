package edu.ksu.cis.bandera.jjjc.node;

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
import ca.mcgill.sable.util.*;
import edu.ksu.cis.bandera.jjjc.analysis.*;

public final class AFormalParameter extends PFormalParameter
{
	private final LinkedList _modifier_ = new TypedLinkedList(new Modifier_Cast());
	private PType _type_;
	private PVariableDeclaratorId _variableDeclaratorId_;

	private class Modifier_Cast implements Cast
	{
		public Object cast(Object o)
		{
			PModifier node = (PModifier) o;

			if((node.parent() != null) &&
				(node.parent() != AFormalParameter.this))
			{
				node.parent().removeChild(node);
			}

			if((node.parent() == null) ||
				(node.parent() != AFormalParameter.this))
			{
				node.parent(AFormalParameter.this);
			}

			return node;
		}
	}
	public AFormalParameter()
	{
	}
	public AFormalParameter(
		List _modifier_,
		PType _type_,
		PVariableDeclaratorId _variableDeclaratorId_)
	{
		{
			Object temp[] = _modifier_.toArray();
			for(int i = 0; i < temp.length; i++)
			{
				this._modifier_.add(temp[i]);
			}
		}

		setType(_type_);

		setVariableDeclaratorId(_variableDeclaratorId_);

	}
	public AFormalParameter(
		XPModifier _modifier_,
		PType _type_,
		PVariableDeclaratorId _variableDeclaratorId_)
	{
		if(_modifier_ != null)
		{
			while(_modifier_ instanceof X1PModifier)
			{
				this._modifier_.addFirst(((X1PModifier) _modifier_).getPModifier());
				_modifier_ = ((X1PModifier) _modifier_).getXPModifier();
			}
			this._modifier_.addFirst(((X2PModifier) _modifier_).getPModifier());
		}

		setType(_type_);

		setVariableDeclaratorId(_variableDeclaratorId_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAFormalParameter(this);
	}
	public Object clone()
	{
		return new AFormalParameter(
			cloneList(_modifier_),
			(PType) cloneNode(_type_),
			(PVariableDeclaratorId) cloneNode(_variableDeclaratorId_));
	}
	public LinkedList getModifier()
	{
		return _modifier_;
	}
	public PType getType()
	{
		return _type_;
	}
	public PVariableDeclaratorId getVariableDeclaratorId()
	{
		return _variableDeclaratorId_;
	}
	void removeChild(Node child)
	{
		if(_modifier_.remove(child))
		{
			return;
		}

		if(_type_ == child)
		{
			_type_ = null;
			return;
		}

		if(_variableDeclaratorId_ == child)
		{
			_variableDeclaratorId_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		for(ListIterator i = _modifier_.listIterator(); i.hasNext();)
		{
			if(i.next() == oldChild)
			{
				if(newChild != null)
				{
					i.set(newChild);
					oldChild.parent(null);
					return;
				}

				i.remove();
				oldChild.parent(null);
				return;
			}
		}

		if(_type_ == oldChild)
		{
			setType((PType) newChild);
			return;
		}

		if(_variableDeclaratorId_ == oldChild)
		{
			setVariableDeclaratorId((PVariableDeclaratorId) newChild);
			return;
		}

	}
	public void setModifier(List list)
	{
		Object temp[] = list.toArray();
		for(int i = 0; i < temp.length; i++)
		{
			_modifier_.add(temp[i]);
		}
	}
	public void setType(PType node)
	{
		if(_type_ != null)
		{
			_type_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_type_ = node;
	}
	public void setVariableDeclaratorId(PVariableDeclaratorId node)
	{
		if(_variableDeclaratorId_ != null)
		{
			_variableDeclaratorId_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_variableDeclaratorId_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_modifier_)
			+ toString(_type_)
			+ toString(_variableDeclaratorId_);
	}
}
