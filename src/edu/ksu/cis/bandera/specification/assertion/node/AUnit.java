package edu.ksu.cis.bandera.specification.assertion.node;

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

import java.util.*;
import edu.ksu.cis.bandera.specification.assertion.analysis.*;

public final class AUnit extends PUnit
{
	private PName _name_;
	private final LinkedList _comment_ = new TypedLinkedList(new Comment_Cast());
	private final LinkedList _assertion_ = new TypedLinkedList(new Assertion_Cast());

	private class Comment_Cast implements Cast
	{
		public Object cast(Object o)
		{
			PComment node = (PComment) o;

			if((node.parent() != null) &&
				(node.parent() != AUnit.this))
			{
				node.parent().removeChild(node);
			}

			if((node.parent() == null) ||
				(node.parent() != AUnit.this))
			{
				node.parent(AUnit.this);
			}

			return node;
		}
	}

	private class Assertion_Cast implements Cast
	{
		public Object cast(Object o)
		{
			PAssertion node = (PAssertion) o;

			if((node.parent() != null) &&
				(node.parent() != AUnit.this))
			{
				node.parent().removeChild(node);
			}

			if((node.parent() == null) ||
				(node.parent() != AUnit.this))
			{
				node.parent(AUnit.this);
			}

			return node;
		}
	}
	public AUnit()
	{
	}
	public AUnit(
		PName _name_,
		XPComment _comment_,
		XPAssertion _assertion_)
	{
		setName(_name_);

		if(_comment_ != null)
		{
			while(_comment_ instanceof X1PComment)
			{
				this._comment_.addFirst(((X1PComment) _comment_).getPComment());
				_comment_ = ((X1PComment) _comment_).getXPComment();
			}
			this._comment_.addFirst(((X2PComment) _comment_).getPComment());
		}

		if(_assertion_ != null)
		{
			while(_assertion_ instanceof X1PAssertion)
			{
				this._assertion_.addFirst(((X1PAssertion) _assertion_).getPAssertion());
				_assertion_ = ((X1PAssertion) _assertion_).getXPAssertion();
			}
			this._assertion_.addFirst(((X2PAssertion) _assertion_).getPAssertion());
		}

	}
	public AUnit(
		PName _name_,
		List _comment_,
		List _assertion_)
	{
		setName(_name_);

		{
			Object temp[] = _comment_.toArray();
			for(int i = 0; i < temp.length; i++)
			{
				this._comment_.add(temp[i]);
			}
		}

		{
			Object temp[] = _assertion_.toArray();
			for(int i = 0; i < temp.length; i++)
			{
				this._assertion_.add(temp[i]);
			}
		}

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAUnit(this);
	}
	public Object clone()
	{
		return new AUnit(
			(PName) cloneNode(_name_),
			cloneList(_comment_),
			cloneList(_assertion_));
	}
	public LinkedList getAssertion()
	{
		return _assertion_;
	}
	public LinkedList getComment()
	{
		return _comment_;
	}
	public PName getName()
	{
		return _name_;
	}
	void removeChild(Node child)
	{
		if(_name_ == child)
		{
			_name_ = null;
			return;
		}

		if(_comment_.remove(child))
		{
			return;
		}

		if(_assertion_.remove(child))
		{
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_name_ == oldChild)
		{
			setName((PName) newChild);
			return;
		}

		for(ListIterator i = _comment_.listIterator(); i.hasNext();)
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

		for(ListIterator i = _assertion_.listIterator(); i.hasNext();)
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

	}
	public void setAssertion(List list)
	{
		Object temp[] = list.toArray();
		for(int i = 0; i < temp.length; i++)
		{
			_assertion_.add(temp[i]);
		}
	}
	public void setComment(List list)
	{
		Object temp[] = list.toArray();
		for(int i = 0; i < temp.length; i++)
		{
			_comment_.add(temp[i]);
		}
	}
	public void setName(PName node)
	{
		if(_name_ != null)
		{
			_name_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_name_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_name_)
			+ toString(_comment_)
			+ toString(_assertion_);
	}
}
