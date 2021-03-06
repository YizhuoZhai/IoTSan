package edu.ksu.cis.bandera.bui.session.node;

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
import edu.ksu.cis.bandera.bui.session.analysis.*;

public final class ASession extends PSession
{
	private TSession _session_;
	private TId _id_;
	private TLBrace _lBrace_;
	private final LinkedList _resource_ = new TypedLinkedList(new Resource_Cast());
	private TRBrace _rBrace_;

	private class Resource_Cast implements Cast
	{
		public Object cast(Object o)
		{
			PResource node = (PResource) o;

			if((node.parent() != null) &&
				(node.parent() != ASession.this))
			{
				node.parent().removeChild(node);
			}

			if((node.parent() == null) ||
				(node.parent() != ASession.this))
			{
				node.parent(ASession.this);
			}

			return node;
		}
	}
	public ASession()
	{
	}
	public ASession(
		TSession _session_,
		TId _id_,
		TLBrace _lBrace_,
		XPResource _resource_,
		TRBrace _rBrace_)
	{
		setSession(_session_);

		setId(_id_);

		setLBrace(_lBrace_);

		if(_resource_ != null)
		{
			while(_resource_ instanceof X1PResource)
			{
				this._resource_.addFirst(((X1PResource) _resource_).getPResource());
				_resource_ = ((X1PResource) _resource_).getXPResource();
			}
			this._resource_.addFirst(((X2PResource) _resource_).getPResource());
		}

		setRBrace(_rBrace_);

	}
	public ASession(
		TSession _session_,
		TId _id_,
		TLBrace _lBrace_,
		List _resource_,
		TRBrace _rBrace_)
	{
		setSession(_session_);

		setId(_id_);

		setLBrace(_lBrace_);

		{
			Object temp[] = _resource_.toArray();
			for(int i = 0; i < temp.length; i++)
			{
				this._resource_.add(temp[i]);
			}
		}

		setRBrace(_rBrace_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseASession(this);
	}
	public Object clone()
	{
		return new ASession(
			(TSession) cloneNode(_session_),
			(TId) cloneNode(_id_),
			(TLBrace) cloneNode(_lBrace_),
			cloneList(_resource_),
			(TRBrace) cloneNode(_rBrace_));
	}
	public TId getId()
	{
		return _id_;
	}
	public TLBrace getLBrace()
	{
		return _lBrace_;
	}
	public TRBrace getRBrace()
	{
		return _rBrace_;
	}
	public LinkedList getResource()
	{
		return _resource_;
	}
	public TSession getSession()
	{
		return _session_;
	}
	void removeChild(Node child)
	{
		if(_session_ == child)
		{
			_session_ = null;
			return;
		}

		if(_id_ == child)
		{
			_id_ = null;
			return;
		}

		if(_lBrace_ == child)
		{
			_lBrace_ = null;
			return;
		}

		if(_resource_.remove(child))
		{
			return;
		}

		if(_rBrace_ == child)
		{
			_rBrace_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_session_ == oldChild)
		{
			setSession((TSession) newChild);
			return;
		}

		if(_id_ == oldChild)
		{
			setId((TId) newChild);
			return;
		}

		if(_lBrace_ == oldChild)
		{
			setLBrace((TLBrace) newChild);
			return;
		}

		for(ListIterator i = _resource_.listIterator(); i.hasNext();)
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

		if(_rBrace_ == oldChild)
		{
			setRBrace((TRBrace) newChild);
			return;
		}

	}
	public void setId(TId node)
	{
		if(_id_ != null)
		{
			_id_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_id_ = node;
	}
	public void setLBrace(TLBrace node)
	{
		if(_lBrace_ != null)
		{
			_lBrace_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_lBrace_ = node;
	}
	public void setRBrace(TRBrace node)
	{
		if(_rBrace_ != null)
		{
			_rBrace_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_rBrace_ = node;
	}
	public void setResource(List list)
	{
		Object temp[] = list.toArray();
		for(int i = 0; i < temp.length; i++)
		{
			_resource_.add(temp[i]);
		}
	}
	public void setSession(TSession node)
	{
		if(_session_ != null)
		{
			_session_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_session_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_session_)
			+ toString(_id_)
			+ toString(_lBrace_)
			+ toString(_resource_)
			+ toString(_rBrace_);
	}
}
