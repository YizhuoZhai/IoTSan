/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.analysis;

import edu.ksu.cis.bandera.birp.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object in);
    Object getOut(Node node);
    void setOut(Node node, Object out);

    void caseStart(Start node);
    void caseAProgram(AProgram node);
    void caseAProcess(AProcess node);
    void caseAConstantDefinition(AConstantDefinition node);
    void caseATypedefDefinition(ATypedefDefinition node);
    void caseARangeTypespec(ARangeTypespec node);
    void caseABooleanTypespec(ABooleanTypespec node);
    void caseATidTypespec(ATidTypespec node);
    void caseAEnumeratedTypespec(AEnumeratedTypespec node);
    void caseARecordTypespec(ARecordTypespec node);
    void caseAArrayTypespec(AArrayTypespec node);
    void caseARefTypespec(ARefTypespec node);
    void caseALockTypespec(ALockTypespec node);
    void caseATypespecType(ATypespecType node);
    void caseADefinedType(ADefinedType node);
    void caseANameEnumconst(ANameEnumconst node);
    void caseANamevalueEnumconst(ANamevalueEnumconst node);
    void caseAEnumdeftail(AEnumdeftail node);
    void caseAField(AField node);
    void caseAReftail(AReftail node);
    void caseAIntConst(AIntConst node);
    void caseAIdConst(AIdConst node);
    void caseASubtype(ASubtype node);
    void caseAVariableGlobal(AVariableGlobal node);
    void caseACollectionGlobal(ACollectionGlobal node);
    void caseACollection(ACollection node);
    void caseAVariable(AVariable node);
    void caseAOneParameters(AOneParameters node);
    void caseAManyParameters(AManyParameters node);
    void caseAParameter(AParameter node);
    void caseAInitializer(AInitializer node);
    void caseAIntegerValue(AIntegerValue node);
    void caseABoolValue(ABoolValue node);
    void caseAIdValue(AIdValue node);
    void caseANullValue(ANullValue node);
    void caseARefValue(ARefValue node);
    void caseAFalseBool(AFalseBool node);
    void caseATrueBool(ATrueBool node);
    void caseAThread(AThread node);
    void caseALocation(ALocation node);
    void caseATransformation(ATransformation node);
    void caseAEmptyLiveset(AEmptyLiveset node);
    void caseANonemptyLiveset(ANonemptyLiveset node);
    void caseALivevar(ALivevar node);
    void caseAExpr(AExpr node);
    void caseAExpr6Expr7(AExpr6Expr7 node);
    void caseAOrExpr7(AOrExpr7 node);
    void caseAExpr5Expr6(AExpr5Expr6 node);
    void caseAAndExpr6(AAndExpr6 node);
    void caseAExpr4Expr5(AExpr4Expr5 node);
    void caseAEqExpr5(AEqExpr5 node);
    void caseANoteqExpr5(ANoteqExpr5 node);
    void caseAExpr3Expr4(AExpr3Expr4 node);
    void caseALtExpr4(ALtExpr4 node);
    void caseALeExpr4(ALeExpr4 node);
    void caseAGtExpr4(AGtExpr4 node);
    void caseAGeExpr4(AGeExpr4 node);
    void caseAExpr2Expr3(AExpr2Expr3 node);
    void caseAPlusExpr3(APlusExpr3 node);
    void caseAMinusExpr3(AMinusExpr3 node);
    void caseAExpr1Expr2(AExpr1Expr2 node);
    void caseAMultExpr2(AMultExpr2 node);
    void caseADivExpr2(ADivExpr2 node);
    void caseAModExpr2(AModExpr2 node);
    void caseAExpr0Expr1(AExpr0Expr1 node);
    void caseAPlusExpr1(APlusExpr1 node);
    void caseAMinusExpr1(AMinusExpr1 node);
    void caseANotExpr1(ANotExpr1 node);
    void caseAValueExpr0(AValueExpr0 node);
    void caseALocktestExpr0(ALocktestExpr0 node);
    void caseAThreadtestExpr0(AThreadtestExpr0 node);
    void caseAFieldselectExpr0(AFieldselectExpr0 node);
    void caseAArrayselectExpr0(AArrayselectExpr0 node);
    void caseAArraylengthExpr0(AArraylengthExpr0 node);
    void caseAInstanceofExpr0(AInstanceofExpr0 node);
    void caseARemoterefExpr0(ARemoterefExpr0 node);
    void caseAParenexprExpr0(AParenexprExpr0 node);
    void caseAValueLhs(AValueLhs node);
    void caseAFieldselectLhs(AFieldselectLhs node);
    void caseAArrayselectLhs(AArrayselectLhs node);
    void caseAArraylengthLhs(AArraylengthLhs node);
    void caseAAssignmentAction(AAssignmentAction node);
    void caseAPrintactionAction(APrintactionAction node);
    void caseAAssertactionAction(AAssertactionAction node);
    void caseAChoiceAction(AChoiceAction node);
    void caseAAllocationAction(AAllocationAction node);
    void caseALockupdateAction(ALockupdateAction node);
    void caseAThreadupdateAction(AThreadupdateAction node);
    void caseAAssignment(AAssignment node);
    void caseAPrintaction(APrintaction node);
    void caseAOnePrintargs(AOnePrintargs node);
    void caseAMorePrintargs(AMorePrintargs node);
    void caseAStringPrintarg(AStringPrintarg node);
    void caseAVarPrintarg(AVarPrintarg node);
    void caseAAssertaction(AAssertaction node);
    void caseAInternChoice(AInternChoice node);
    void caseAExternChoice(AExternChoice node);
    void caseAForallChoice(AForallChoice node);
    void caseAChoicetail(AChoicetail node);
    void caseAAllocation(AAllocation node);
    void caseAArraylength(AArraylength node);
    void caseALockupdate(ALockupdate node);
    void caseALockLockOp(ALockLockOp node);
    void caseAUnlockLockOp(AUnlockLockOp node);
    void caseAWaitLockOp(AWaitLockOp node);
    void caseAUnwaitLockOp(AUnwaitLockOp node);
    void caseANotifyLockOp(ANotifyLockOp node);
    void caseANotifyallLockOp(ANotifyallLockOp node);
    void caseALocktest(ALocktest node);
    void caseALockavailableLocktestop(ALockavailableLocktestop node);
    void caseAHaslockLocktestop(AHaslockLocktestop node);
    void caseAWasnotifiedLocktestop(AWasnotifiedLocktestop node);
    void caseAStartThreadupdate(AStartThreadupdate node);
    void caseAExitThreadupdate(AExitThreadupdate node);
    void caseALhsAssign(ALhsAssign node);
    void caseAOneStartargs(AOneStartargs node);
    void caseAMoreStartargs(AMoreStartargs node);
    void caseAStartarg(AStartarg node);
    void caseATerminatedThreadtest(ATerminatedThreadtest node);
    void caseAAtlocationThreadtest(AAtlocationThreadtest node);
    void caseAPredicates(APredicates node);
    void caseAPredicate(APredicate node);

    void caseTSemicolon(TSemicolon node);
    void caseTColon(TColon node);
    void caseTLbrace(TLbrace node);
    void caseTRbrace(TRbrace node);
    void caseTLparen(TLparen node);
    void caseTRparen(TRparen node);
    void caseTLbrack(TLbrack node);
    void caseTRbrack(TRbrack node);
    void caseTBar(TBar node);
    void caseTAt(TAt node);
    void caseTComma(TComma node);
    void caseTDot(TDot node);
    void caseTDotdot(TDotdot node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTAnd(TAnd node);
    void caseTOr(TOr node);
    void caseTEq(TEq node);
    void caseTEquals(TEquals node);
    void caseTNot(TNot node);
    void caseTNoteq(TNoteq node);
    void caseTLt(TLt node);
    void caseTGt(TGt node);
    void caseTLe(TLe node);
    void caseTGe(TGe node);
    void caseTAssign(TAssign node);
    void caseTAssert(TAssert node);
    void caseTBoolean(TBoolean node);
    void caseTTid(TTid node);
    void caseTTrue(TTrue node);
    void caseTFalse(TFalse node);
    void caseTProcess(TProcess node);
    void caseTEnd(TEnd node);
    void caseTRange(TRange node);
    void caseTLock(TLock node);
    void caseTReentrant(TReentrant node);
    void caseTArray(TArray node);
    void caseTOf(TOf node);
    void caseTLength(TLength node);
    void caseTExtendz(TExtendz node);
    void caseTInstanceof(TInstanceof node);
    void caseTRecord(TRecord node);
    void caseTCollection(TCollection node);
    void caseTRef(TRef node);
    void caseTNew(TNew node);
    void caseTNull(TNull node);
    void caseTEnum(TEnum node);
    void caseTMain(TMain node);
    void caseTThread(TThread node);
    void caseTLoc(TLoc node);
    void caseTLive(TLive node);
    void caseTWhen(TWhen node);
    void caseTDo(TDo node);
    void caseTInvisible(TInvisible node);
    void caseTGoto(TGoto node);
    void caseTUnlock(TUnlock node);
    void caseTWait(TWait node);
    void caseTUnwait(TUnwait node);
    void caseTNotify(TNotify node);
    void caseTNotifyall(TNotifyall node);
    void caseTLockavailable(TLockavailable node);
    void caseTStart(TStart node);
    void caseTJoin(TJoin node);
    void caseTExit(TExit node);
    void caseTThreadterminated(TThreadterminated node);
    void caseTInternchoose(TInternchoose node);
    void caseTExternchoose(TExternchoose node);
    void caseTForall(TForall node);
    void caseTHaslock(THaslock node);
    void caseTWasnotified(TWasnotified node);
    void caseTPrintln(TPrintln node);
    void caseTPredicates(TPredicates node);
    void caseTId(TId node);
    void caseTInt(TInt node);
    void caseTString(TString node);
    void caseTWhitespace(TWhitespace node);
    void caseTComment(TComment node);
    void caseEOF(EOF node);
}
