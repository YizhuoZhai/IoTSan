package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class AStaticParams extends PParams
{
	private PParamList _paramList_;

	public AStaticParams()
	{
	}
	public AStaticParams(
		PParamList _paramList_)
	{
		setParamList(_paramList_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAStaticParams(this);
	}
	public Object clone()
	{
		return new AStaticParams(
			(PParamList) cloneNode(_paramList_));
	}
	public PParamList getParamList()
	{
		return _paramList_;
	}
	void removeChild(Node child)
	{
		if(_paramList_ == child)
		{
			_paramList_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_paramList_ == oldChild)
		{
			setParamList((PParamList) newChild);
			return;
		}

	}
	public void setParamList(PParamList node)
	{
		if(_paramList_ != null)
		{
			_paramList_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_paramList_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_paramList_);
	}
}
