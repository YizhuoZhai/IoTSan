package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class TLBrace extends Token
{
	public TLBrace()
	{
		super.setText("{");
	}
	public TLBrace(int line, int pos)
	{
		super.setText("{");
		setLine(line);
		setPos(pos);
	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseTLBrace(this);
	}
	public Object clone()
	{
	  return new TLBrace(getLine(), getPos());
	}
	public void setText(String text)
	{
		throw new RuntimeException("Cannot change TLBrace text.");
	}
}
