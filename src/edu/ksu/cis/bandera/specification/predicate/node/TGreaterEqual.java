package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class TGreaterEqual extends Token
{
	public TGreaterEqual()
	{
		super.setText(">=");
	}
	public TGreaterEqual(int line, int pos)
	{
		super.setText(">=");
		setLine(line);
		setPos(pos);
	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseTGreaterEqual(this);
	}
	public Object clone()
	{
	  return new TGreaterEqual(getLine(), getPos());
	}
	public void setText(String text)
	{
		throw new RuntimeException("Cannot change TGreaterEqual text.");
	}
}
