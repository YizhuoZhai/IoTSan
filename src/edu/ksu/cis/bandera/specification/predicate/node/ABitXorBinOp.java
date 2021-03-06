package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class ABitXorBinOp extends PBinOp
{
	private TBitXor _bitXor_;

	public ABitXorBinOp()
	{
	}
	public ABitXorBinOp(
		TBitXor _bitXor_)
	{
		setBitXor(_bitXor_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseABitXorBinOp(this);
	}
	public Object clone()
	{
		return new ABitXorBinOp(
			(TBitXor) cloneNode(_bitXor_));
	}
	public TBitXor getBitXor()
	{
		return _bitXor_;
	}
	void removeChild(Node child)
	{
		if(_bitXor_ == child)
		{
			_bitXor_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_bitXor_ == oldChild)
		{
			setBitXor((TBitXor) newChild);
			return;
		}

	}
	public void setBitXor(TBitXor node)
	{
		if(_bitXor_ != null)
		{
			_bitXor_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_bitXor_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_bitXor_);
	}
}
