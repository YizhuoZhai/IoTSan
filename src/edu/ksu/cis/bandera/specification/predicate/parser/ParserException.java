package edu.ksu.cis.bandera.specification.predicate.parser;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.predicate.node.*;

public class ParserException extends Exception
{
	Token token;

	public ParserException(Token token, String  message)
	{
		super(message);
		this.token = token;
	}
	public Token getToken()
	{
		return token;
	}
}
