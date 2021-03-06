package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class AMultAddExp extends PAddExp
{
	private PMultExp _multExp_;

	public AMultAddExp()
	{
	}
	public AMultAddExp(
		PMultExp _multExp_)
	{
		setMultExp(_multExp_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAMultAddExp(this);
	}
	public Object clone()
	{
		return new AMultAddExp(
			(PMultExp) cloneNode(_multExp_));
	}
	public PMultExp getMultExp()
	{
		return _multExp_;
	}
	void removeChild(Node child)
	{
		if(_multExp_ == child)
		{
			_multExp_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_multExp_ == oldChild)
		{
			setMultExp((PMultExp) newChild);
			return;
		}

	}
	public void setMultExp(PMultExp node)
	{
		if(_multExp_ != null)
		{
			_multExp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_multExp_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_multExp_);
	}
}
