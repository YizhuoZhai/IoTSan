/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import edu.ksu.cis.bandera.birp.analysis.*;

public final class TLe extends Token
{
    public TLe()
    {
        super.setText("<=");
    }

    public TLe(int line, int pos)
    {
        super.setText("<=");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TLe(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLe(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TLe text.");
    }
}
