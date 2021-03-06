/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import java.util.*;
import edu.ksu.cis.bandera.birp.analysis.*;

public final class AParenexprExpr0 extends PExpr0
{
    private TLparen _lparen_;
    private PExpr _expr_;
    private TRparen _rparen_;

    public AParenexprExpr0()
    {
    }

    public AParenexprExpr0(
        TLparen _lparen_,
        PExpr _expr_,
        TRparen _rparen_)
    {
        setLparen(_lparen_);

        setExpr(_expr_);

        setRparen(_rparen_);

    }
    public Object clone()
    {
        return new AParenexprExpr0(
            (TLparen) cloneNode(_lparen_),
            (PExpr) cloneNode(_expr_),
            (TRparen) cloneNode(_rparen_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParenexprExpr0(this);
    }

    public TLparen getLparen()
    {
        return _lparen_;
    }

    public void setLparen(TLparen node)
    {
        if(_lparen_ != null)
        {
            _lparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lparen_ = node;
    }

    public PExpr getExpr()
    {
        return _expr_;
    }

    public void setExpr(PExpr node)
    {
        if(_expr_ != null)
        {
            _expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expr_ = node;
    }

    public TRparen getRparen()
    {
        return _rparen_;
    }

    public void setRparen(TRparen node)
    {
        if(_rparen_ != null)
        {
            _rparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rparen_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_lparen_)
            + toString(_expr_)
            + toString(_rparen_);
    }

    void removeChild(Node child)
    {
        if(_lparen_ == child)
        {
            _lparen_ = null;
            return;
        }

        if(_expr_ == child)
        {
            _expr_ = null;
            return;
        }

        if(_rparen_ == child)
        {
            _rparen_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_lparen_ == oldChild)
        {
            setLparen((TLparen) newChild);
            return;
        }

        if(_expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(_rparen_ == oldChild)
        {
            setRparen((TRparen) newChild);
            return;
        }

    }
}
