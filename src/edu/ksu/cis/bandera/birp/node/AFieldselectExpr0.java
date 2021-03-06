/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import java.util.*;
import edu.ksu.cis.bandera.birp.analysis.*;

public final class AFieldselectExpr0 extends PExpr0
{
    private PExpr0 _expr0_;
    private TDot _dot_;
    private TId _id_;

    public AFieldselectExpr0()
    {
    }

    public AFieldselectExpr0(
        PExpr0 _expr0_,
        TDot _dot_,
        TId _id_)
    {
        setExpr0(_expr0_);

        setDot(_dot_);

        setId(_id_);

    }
    public Object clone()
    {
        return new AFieldselectExpr0(
            (PExpr0) cloneNode(_expr0_),
            (TDot) cloneNode(_dot_),
            (TId) cloneNode(_id_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFieldselectExpr0(this);
    }

    public PExpr0 getExpr0()
    {
        return _expr0_;
    }

    public void setExpr0(PExpr0 node)
    {
        if(_expr0_ != null)
        {
            _expr0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expr0_ = node;
    }

    public TDot getDot()
    {
        return _dot_;
    }

    public void setDot(TDot node)
    {
        if(_dot_ != null)
        {
            _dot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _dot_ = node;
    }

    public TId getId()
    {
        return _id_;
    }

    public void setId(TId node)
    {
        if(_id_ != null)
        {
            _id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _id_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_expr0_)
            + toString(_dot_)
            + toString(_id_);
    }

    void removeChild(Node child)
    {
        if(_expr0_ == child)
        {
            _expr0_ = null;
            return;
        }

        if(_dot_ == child)
        {
            _dot_ = null;
            return;
        }

        if(_id_ == child)
        {
            _id_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_expr0_ == oldChild)
        {
            setExpr0((PExpr0) newChild);
            return;
        }

        if(_dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        if(_id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

    }
}
