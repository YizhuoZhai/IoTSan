package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class TDot extends Token
{
	public TDot()
	{
		super.setText(".");
	}
	public TDot(int line, int pos)
	{
		super.setText(".");
		setLine(line);
		setPos(pos);
	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseTDot(this);
	}
	public Object clone()
	{
	  return new TDot(getLine(), getPos());
	}
	public void setText(String text)
	{
		throw new RuntimeException("Cannot change TDot text.");
	}
}
