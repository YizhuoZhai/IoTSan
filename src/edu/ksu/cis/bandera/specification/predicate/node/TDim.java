package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class TDim extends Token
{
	public TDim()
	{
		super.setText("[]");
	}
	public TDim(int line, int pos)
	{
		super.setText("[]");
		setLine(line);
		setPos(pos);
	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseTDim(this);
	}
	public Object clone()
	{
	  return new TDim(getLine(), getPos());
	}
	public void setText(String text)
	{
		throw new RuntimeException("Cannot change TDim text.");
	}
}
