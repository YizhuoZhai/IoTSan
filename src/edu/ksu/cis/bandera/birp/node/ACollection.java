/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import java.util.*;
import edu.ksu.cis.bandera.birp.analysis.*;

public final class ACollection extends PCollection
{
    private TId _id_;
    private TColon _colon_;
    private TCollection _collection_;
    private TLbrack _lbrack_;
    private PConst _const_;
    private TRbrack _rbrack_;
    private TOf _of_;
    private PType _type_;
    private TSemicolon _semicolon_;

    public ACollection()
    {
    }

    public ACollection(
        TId _id_,
        TColon _colon_,
        TCollection _collection_,
        TLbrack _lbrack_,
        PConst _const_,
        TRbrack _rbrack_,
        TOf _of_,
        PType _type_,
        TSemicolon _semicolon_)
    {
        setId(_id_);

        setColon(_colon_);

        setCollection(_collection_);

        setLbrack(_lbrack_);

        setConst(_const_);

        setRbrack(_rbrack_);

        setOf(_of_);

        setType(_type_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new ACollection(
            (TId) cloneNode(_id_),
            (TColon) cloneNode(_colon_),
            (TCollection) cloneNode(_collection_),
            (TLbrack) cloneNode(_lbrack_),
            (PConst) cloneNode(_const_),
            (TRbrack) cloneNode(_rbrack_),
            (TOf) cloneNode(_of_),
            (PType) cloneNode(_type_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACollection(this);
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

    public TColon getColon()
    {
        return _colon_;
    }

    public void setColon(TColon node)
    {
        if(_colon_ != null)
        {
            _colon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _colon_ = node;
    }

    public TCollection getCollection()
    {
        return _collection_;
    }

    public void setCollection(TCollection node)
    {
        if(_collection_ != null)
        {
            _collection_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _collection_ = node;
    }

    public TLbrack getLbrack()
    {
        return _lbrack_;
    }

    public void setLbrack(TLbrack node)
    {
        if(_lbrack_ != null)
        {
            _lbrack_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lbrack_ = node;
    }

    public PConst getConst()
    {
        return _const_;
    }

    public void setConst(PConst node)
    {
        if(_const_ != null)
        {
            _const_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _const_ = node;
    }

    public TRbrack getRbrack()
    {
        return _rbrack_;
    }

    public void setRbrack(TRbrack node)
    {
        if(_rbrack_ != null)
        {
            _rbrack_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rbrack_ = node;
    }

    public TOf getOf()
    {
        return _of_;
    }

    public void setOf(TOf node)
    {
        if(_of_ != null)
        {
            _of_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _of_ = node;
    }

    public PType getType()
    {
        return _type_;
    }

    public void setType(PType node)
    {
        if(_type_ != null)
        {
            _type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _type_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return _semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(_semicolon_ != null)
        {
            _semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _semicolon_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_id_)
            + toString(_colon_)
            + toString(_collection_)
            + toString(_lbrack_)
            + toString(_const_)
            + toString(_rbrack_)
            + toString(_of_)
            + toString(_type_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if(_id_ == child)
        {
            _id_ = null;
            return;
        }

        if(_colon_ == child)
        {
            _colon_ = null;
            return;
        }

        if(_collection_ == child)
        {
            _collection_ = null;
            return;
        }

        if(_lbrack_ == child)
        {
            _lbrack_ = null;
            return;
        }

        if(_const_ == child)
        {
            _const_ = null;
            return;
        }

        if(_rbrack_ == child)
        {
            _rbrack_ = null;
            return;
        }

        if(_of_ == child)
        {
            _of_ = null;
            return;
        }

        if(_type_ == child)
        {
            _type_ = null;
            return;
        }

        if(_semicolon_ == child)
        {
            _semicolon_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(_colon_ == oldChild)
        {
            setColon((TColon) newChild);
            return;
        }

        if(_collection_ == oldChild)
        {
            setCollection((TCollection) newChild);
            return;
        }

        if(_lbrack_ == oldChild)
        {
            setLbrack((TLbrack) newChild);
            return;
        }

        if(_const_ == oldChild)
        {
            setConst((PConst) newChild);
            return;
        }

        if(_rbrack_ == oldChild)
        {
            setRbrack((TRbrack) newChild);
            return;
        }

        if(_of_ == oldChild)
        {
            setOf((TOf) newChild);
            return;
        }

        if(_type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }
}
