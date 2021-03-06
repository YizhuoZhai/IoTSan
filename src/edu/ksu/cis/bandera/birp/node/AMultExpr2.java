/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import java.util.*;
import edu.ksu.cis.bandera.birp.analysis.*;

public final class AMultExpr2 extends PExpr2
{
    private PExpr2 _expr2_;
    private TMult _mult_;
    private PExpr1 _expr1_;

    public AMultExpr2()
    {
    }

    public AMultExpr2(
        PExpr2 _expr2_,
        TMult _mult_,
        PExpr1 _expr1_)
    {
        setExpr2(_expr2_);

        setMult(_mult_);

        setExpr1(_expr1_);

    }
    public Object clone()
    {
        return new AMultExpr2(
            (PExpr2) cloneNode(_expr2_),
            (TMult) cloneNode(_mult_),
            (PExpr1) cloneNode(_expr1_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultExpr2(this);
    }

    public PExpr2 getExpr2()
    {
        return _expr2_;
    }

    public void setExpr2(PExpr2 node)
    {
        if(_expr2_ != null)
        {
            _expr2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expr2_ = node;
    }

    public TMult getMult()
    {
        return _mult_;
    }

    public void setMult(TMult node)
    {
        if(_mult_ != null)
        {
            _mult_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _mult_ = node;
    }

    public PExpr1 getExpr1()
    {
        return _expr1_;
    }

    public void setExpr1(PExpr1 node)
    {
        if(_expr1_ != null)
        {
            _expr1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expr1_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_expr2_)
            + toString(_mult_)
            + toString(_expr1_);
    }

    void removeChild(Node child)
    {
        if(_expr2_ == child)
        {
            _expr2_ = null;
            return;
        }

        if(_mult_ == child)
        {
            _mult_ = null;
            return;
        }

        if(_expr1_ == child)
        {
            _expr1_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_expr2_ == oldChild)
        {
            setExpr2((PExpr2) newChild);
            return;
        }

        if(_mult_ == oldChild)
        {
            setMult((TMult) newChild);
            return;
        }

        if(_expr1_ == oldChild)
        {
            setExpr1((PExpr1) newChild);
            return;
        }

    }
}
