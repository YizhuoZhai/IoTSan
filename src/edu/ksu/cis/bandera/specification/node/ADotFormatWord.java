package edu.ksu.cis.bandera.specification.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.analysis.*;

public final class ADotFormatWord extends PFormatWord
{
	private TDot _dot_;

	public ADotFormatWord()
	{
	}
	public ADotFormatWord(
		TDot _dot_)
	{
		setDot(_dot_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseADotFormatWord(this);
	}
	public Object clone()
	{
		return new ADotFormatWord(
			(TDot) cloneNode(_dot_));
	}
	public TDot getDot()
	{
		return _dot_;
	}
	void removeChild(Node child)
	{
		if(_dot_ == child)
		{
			_dot_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_dot_ == oldChild)
		{
			setDot((TDot) newChild);
			return;
		}

	}
	public void setDot(TDot node)
	{
		if(_dot_ != null)
		{
			_dot_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_dot_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_dot_);
	}
}
