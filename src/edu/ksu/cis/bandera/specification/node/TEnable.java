package edu.ksu.cis.bandera.specification.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.analysis.*;

public final class TEnable extends Token
{
	public TEnable()
	{
		super.setText("enable");
	}
	public TEnable(int line, int pos)
	{
		super.setText("enable");
		setLine(line);
		setPos(pos);
	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseTEnable(this);
	}
	public Object clone()
	{
	  return new TEnable(getLine(), getPos());
	}
	public void setText(String text)
	{
		throw new RuntimeException("Cannot change TEnable text.");
	}
}
