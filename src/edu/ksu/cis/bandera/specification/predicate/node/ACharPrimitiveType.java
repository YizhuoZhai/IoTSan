package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class ACharPrimitiveType extends PPrimitiveType
{
	private TChar _char_;

	public ACharPrimitiveType()
	{
	}
	public ACharPrimitiveType(
		TChar _char_)
	{
		setChar(_char_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseACharPrimitiveType(this);
	}
	public Object clone()
	{
		return new ACharPrimitiveType(
			(TChar) cloneNode(_char_));
	}
	public TChar getChar()
	{
		return _char_;
	}
	void removeChild(Node child)
	{
		if(_char_ == child)
		{
			_char_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_char_ == oldChild)
		{
			setChar((TChar) newChild);
			return;
		}

	}
	public void setChar(TChar node)
	{
		if(_char_ != null)
		{
			_char_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_char_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_char_);
	}
}
