/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import java.util.*;
import edu.ksu.cis.bandera.birp.analysis.*;

public final class AThreadtestExpr0 extends PExpr0
{
    private PThreadtest _threadtest_;

    public AThreadtestExpr0()
    {
    }

    public AThreadtestExpr0(
        PThreadtest _threadtest_)
    {
        setThreadtest(_threadtest_);

    }
    public Object clone()
    {
        return new AThreadtestExpr0(
            (PThreadtest) cloneNode(_threadtest_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAThreadtestExpr0(this);
    }

    public PThreadtest getThreadtest()
    {
        return _threadtest_;
    }

    public void setThreadtest(PThreadtest node)
    {
        if(_threadtest_ != null)
        {
            _threadtest_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _threadtest_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_threadtest_);
    }

    void removeChild(Node child)
    {
        if(_threadtest_ == child)
        {
            _threadtest_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_threadtest_ == oldChild)
        {
            setThreadtest((PThreadtest) newChild);
            return;
        }

    }
}
