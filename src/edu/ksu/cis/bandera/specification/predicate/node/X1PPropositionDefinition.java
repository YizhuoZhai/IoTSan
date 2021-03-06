package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class X1PPropositionDefinition extends XPPropositionDefinition
{
	private XPPropositionDefinition _xPPropositionDefinition_;
	private PPropositionDefinition _pPropositionDefinition_;

	public X1PPropositionDefinition()
	{
	}
	public X1PPropositionDefinition(
		XPPropositionDefinition _xPPropositionDefinition_,
		PPropositionDefinition _pPropositionDefinition_)
	{
		setXPPropositionDefinition(_xPPropositionDefinition_);
		setPPropositionDefinition(_pPropositionDefinition_);
	}
	public void apply(Switch sw)
	{
		throw new RuntimeException("Switch not supported.");
	}
	public Object clone()
	{
		throw new RuntimeException("Unsupported Operation");
	}
	public PPropositionDefinition getPPropositionDefinition()
	{
		return _pPropositionDefinition_;
	}
	public XPPropositionDefinition getXPPropositionDefinition()
	{
		return _xPPropositionDefinition_;
	}
	void removeChild(Node child)
	{
		if(_xPPropositionDefinition_ == child)
		{
			_xPPropositionDefinition_ = null;
		}

		if(_pPropositionDefinition_ == child)
		{
			_pPropositionDefinition_ = null;
		}
	}
	void replaceChild(Node oldChild, Node newChild)
	{
	}
	public void setPPropositionDefinition(PPropositionDefinition node)
	{
		if(_pPropositionDefinition_ != null)
		{
			_pPropositionDefinition_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_pPropositionDefinition_ = node;
	}
	public void setXPPropositionDefinition(XPPropositionDefinition node)
	{
		if(_xPPropositionDefinition_ != null)
		{
			_xPPropositionDefinition_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_xPPropositionDefinition_ = node;
	}
	public String toString()
	{
		return "" +
			toString(_xPPropositionDefinition_) +
			toString(_pPropositionDefinition_);
	}
}
