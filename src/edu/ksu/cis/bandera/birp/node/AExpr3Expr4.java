/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import java.util.*;
import edu.ksu.cis.bandera.birp.analysis.*;

public final class AExpr3Expr4 extends PExpr4
{
    private PExpr3 _expr3_;

    public AExpr3Expr4()
    {
    }

    public AExpr3Expr4(
        PExpr3 _expr3_)
    {
        setExpr3(_expr3_);

    }
    public Object clone()
    {
        return new AExpr3Expr4(
            (PExpr3) cloneNode(_expr3_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpr3Expr4(this);
    }

    public PExpr3 getExpr3()
    {
        return _expr3_;
    }

    public void setExpr3(PExpr3 node)
    {
        if(_expr3_ != null)
        {
            _expr3_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expr3_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_expr3_);
    }

    void removeChild(Node child)
    {
        if(_expr3_ == child)
        {
            _expr3_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_expr3_ == oldChild)
        {
            setExpr3((PExpr3) newChild);
            return;
        }

    }
}
