package edu.ksu.cis.bandera.specification.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.analysis.*;

public final class APredicateImport extends PImport
{
	private TImport _import_;
	private TPredicate _predicate_;
	private PImportNames _importNames_;
	private TSemicolon _semicolon_;

	public APredicateImport()
	{
	}
	public APredicateImport(
		TImport _import_,
		TPredicate _predicate_,
		PImportNames _importNames_,
		TSemicolon _semicolon_)
	{
		setImport(_import_);

		setPredicate(_predicate_);

		setImportNames(_importNames_);

		setSemicolon(_semicolon_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAPredicateImport(this);
	}
	public Object clone()
	{
		return new APredicateImport(
			(TImport) cloneNode(_import_),
			(TPredicate) cloneNode(_predicate_),
			(PImportNames) cloneNode(_importNames_),
			(TSemicolon) cloneNode(_semicolon_));
	}
	public TImport getImport()
	{
		return _import_;
	}
	public PImportNames getImportNames()
	{
		return _importNames_;
	}
	public TPredicate getPredicate()
	{
		return _predicate_;
	}
	public TSemicolon getSemicolon()
	{
		return _semicolon_;
	}
	void removeChild(Node child)
	{
		if(_import_ == child)
		{
			_import_ = null;
			return;
		}

		if(_predicate_ == child)
		{
			_predicate_ = null;
			return;
		}

		if(_importNames_ == child)
		{
			_importNames_ = null;
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
		if(_import_ == oldChild)
		{
			setImport((TImport) newChild);
			return;
		}

		if(_predicate_ == oldChild)
		{
			setPredicate((TPredicate) newChild);
			return;
		}

		if(_importNames_ == oldChild)
		{
			setImportNames((PImportNames) newChild);
			return;
		}

		if(_semicolon_ == oldChild)
		{
			setSemicolon((TSemicolon) newChild);
			return;
		}

	}
	public void setImport(TImport node)
	{
		if(_import_ != null)
		{
			_import_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_import_ = node;
	}
	public void setImportNames(PImportNames node)
	{
		if(_importNames_ != null)
		{
			_importNames_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_importNames_ = node;
	}
	public void setPredicate(TPredicate node)
	{
		if(_predicate_ != null)
		{
			_predicate_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_predicate_ = node;
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
			+ toString(_import_)
			+ toString(_predicate_)
			+ toString(_importNames_)
			+ toString(_semicolon_);
	}
}
