/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import edu.ksu.cis.bandera.birp.analysis.*;

public final class X2PChoicetail extends XPChoicetail
{
    private PChoicetail _pChoicetail_;

    public X2PChoicetail()
    {
    }

    public X2PChoicetail(
        PChoicetail _pChoicetail_)
    {
        setPChoicetail(_pChoicetail_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PChoicetail getPChoicetail()
    {
        return _pChoicetail_;
    }

    public void setPChoicetail(PChoicetail node)
    {
        if(_pChoicetail_ != null)
        {
            _pChoicetail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pChoicetail_ = node;
    }

    void removeChild(Node child)
    {
        if(_pChoicetail_ == child)
        {
            _pChoicetail_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pChoicetail_);
    }
}
