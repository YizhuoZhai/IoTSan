package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class TStringLiteral extends Token
{
	public TStringLiteral(String text)
	{
		setText(text);
	}
	public TStringLiteral(String text, int line, int pos)
	{
		setText(text);
		setLine(line);
		setPos(pos);
	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseTStringLiteral(this);
	}
	public Object clone()
	{
	  return new TStringLiteral(getText(), getLine(), getPos());
	}
}
