package edu.ksu.cis.bandera.specification.nnf.ltl;


//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Tue Jul 17 20:49:43 CDT 2001
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java.util.*;

/** CUP v0.10k generated parser.
  * @version Tue Jul 17 20:49:43 CDT 2001
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Production table. */
  protected static final short _production_table[][] = 
	unpackFromStrings(new String[] {
	"\000\014\000\002\003\003\000\002\002\004\000\002\004" +
	"\003\000\002\004\005\000\002\004\005\000\002\004\005" +
	"\000\002\004\005\000\002\004\004\000\002\004\004\000" +
	"\002\004\004\000\002\004\004\000\002\004\005" });

  /** Parse-action table. */
  protected static final short[][] _action_table = 
	unpackFromStrings(new String[] {
	"\000\030\000\016\004\012\005\011\006\013\010\010\015" +
	"\007\022\004\001\002\000\016\002\uffff\007\uffff\011\uffff" +
	"\012\uffff\013\uffff\014\uffff\001\002\000\014\002\001\007" +
	"\017\012\015\013\020\014\016\001\002\000\004\002\032" +
	"\001\002\000\016\004\012\005\011\006\013\010\010\015" +
	"\007\022\004\001\002\000\016\004\012\005\011\006\013" +
	"\010\010\015\007\022\004\001\002\000\016\004\012\005" +
	"\011\006\013\010\010\015\007\022\004\001\002\000\016" +
	"\004\012\005\011\006\013\010\010\015\007\022\004\001" +
	"\002\000\016\004\012\005\011\006\013\010\010\015\007" +
	"\022\004\001\002\000\016\002\ufff8\007\ufff8\011\ufff8\012" +
	"\ufff8\013\ufff8\014\ufff8\001\002\000\016\004\012\005\011" +
	"\006\013\010\010\015\007\022\004\001\002\000\016\004" +
	"\012\005\011\006\013\010\010\015\007\022\004\001\002" +
	"\000\016\004\012\005\011\006\013\010\010\015\007\022" +
	"\004\001\002\000\016\004\012\005\011\006\013\010\010" +
	"\015\007\022\004\001\002\000\016\002\ufffc\007\017\011" +
	"\ufffc\012\ufffc\013\ufffc\014\016\001\002\000\016\002\ufff6" +
	"\007\ufff6\011\ufff6\012\ufff6\013\ufff6\014\ufff6\001\002\000" +
	"\016\002\ufffb\007\017\011\ufffb\012\ufffb\013\ufffb\014\ufffb" +
	"\001\002\000\016\002\ufffd\007\017\011\ufffd\012\ufffd\013" +
	"\020\014\016\001\002\000\016\002\ufff9\007\ufff9\011\ufff9" +
	"\012\ufff9\013\ufff9\014\ufff9\001\002\000\016\002\ufff7\007" +
	"\ufff7\011\ufff7\012\ufff7\013\ufff7\014\ufff7\001\002\000\014" +
	"\007\017\011\030\012\015\013\020\014\016\001\002\000" +
	"\016\002\ufffe\007\ufffe\011\ufffe\012\ufffe\013\ufffe\014\ufffe" +
	"\001\002\000\016\002\ufffa\007\017\011\ufffa\012\ufffa\013" +
	"\ufffa\014\ufffa\001\002\000\004\002\000\001\002" });

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
	unpackFromStrings(new String[] {
	"\000\030\000\006\003\005\004\004\001\001\000\002\001" +
	"\001\000\002\001\001\000\002\001\001\000\004\004\030" +
	"\001\001\000\004\004\026\001\001\000\004\004\025\001" +
	"\001\000\004\004\024\001\001\000\004\004\013\001\001" +
	"\000\002\001\001\000\004\004\023\001\001\000\004\004" +
	"\022\001\001\000\004\004\021\001\001\000\004\004\020" +
	"\001\001\000\002\001\001\000\002\001\001\000\002\001" +
	"\001\000\002\001\001\000\002\001\001\000\002\001\001" +
	"\000\002\001\001\000\002\001\001\000\002\001\001\000" +
	"\002\001\001" });

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

		public static Node tree;

  /** Default constructor. */
  public parser() {super();}  
  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}  
  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}  
  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
	int                        act_num,
	java_cup.runtime.lr_parser parser,
	java.util.Stack            stack,
	int                        top)
	throws java.lang.Exception
  {
	/* call code in generated class */
	return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }  
  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}  
  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}  
  /** Action encapsulation object initializer. */
  protected void init_actions()
	{
	  action_obj = new CUP$parser$actions(this);
	}
  /** Access to production table. */
  public short[][] production_table() {return _production_table;}  
  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}  
		public void report_error(String message, Object info)
				{       System.err.print("Line: "+
								((Yylex) getScanner()).line() +" ");
						System.err.print(message);
						System.err.println("");
				}
  /** Indicates start production. */
  public int start_production() {return 1;}  
  /** Indicates start state. */
  public int start_state() {return 0;}  
}
