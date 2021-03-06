package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class AOrBinOp extends PBinOp
{
	private TOr _or_;

	public AOrBinOp()
	{
	}
	public AOrBinOp(
		TOr _or_)
	{
		setOr(_or_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAOrBinOp(this);
	}
	public Object clone()
	{
		return new AOrBinOp(
			(TOr) cloneNode(_or_));
	}
	public TOr getOr()
	{
		return _or_;
	}
	void removeChild(Node child)
	{
		if(_or_ == child)
		{
			_or_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_or_ == oldChild)
		{
			setOr((TOr) newChild);
			return;
		}

	}
	public void setOr(TOr node)
	{
		if(_or_ != null)
		{
			_or_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_or_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_or_);
	}
}
