package edu.ksu.cis.bandera.specification.predicate.analysis;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.predicate.node.*;

public interface Analysis extends Switch
{
	void caseAAddExpShiftExp(AAddExpShiftExp node);
	void caseAAndAndExp(AAndAndExp node);
	void caseAAndBinOp(AAndBinOp node);
	void caseAAndBitAndExp(AAndBitAndExp node);
	void caseAAndExclusiveOrExp(AAndExclusiveOrExp node);
	void caseAAndOrExp(AAndOrExp node);
	void caseAArrayAccessPrimaryExp(AArrayAccessPrimaryExp node);
	void caseABinaryExp(ABinaryExp node);
	void caseABitAndBinOp(ABitAndBinOp node);
	void caseABitComplementExp(ABitComplementExp node);
	void caseABitComplementUnaryNotPlusMinusExp(ABitComplementUnaryNotPlusMinusExp node);
	void caseABitOrBinOp(ABitOrBinOp node);
	void caseABitXorBinOp(ABitXorBinOp node);
	void caseABooleanPrimitiveType(ABooleanPrimitiveType node);
	void caseABytePrimitiveType(ABytePrimitiveType node);
	void caseACastUnaryNotPlusMinusExp(ACastUnaryNotPlusMinusExp node);
	void caseACharLiteral(ACharLiteral node);
	void caseACharPrimitiveType(ACharPrimitiveType node);
	void caseAColonExp(AColonExp node);
	void caseAComplementExp(AComplementExp node);
	void caseAComplementUnaryNotPlusMinusExp(AComplementUnaryNotPlusMinusExp node);
	void caseAConditionalExp(AConditionalExp node);
	void caseACpl(ACpl node);
	void caseADecIntLiteral(ADecIntLiteral node);
	void caseADecLongLiteral(ADecLongLiteral node);
	void caseADoubleLiteral(ADoubleLiteral node);
	void caseADoublePrimitiveType(ADoublePrimitiveType node);
	void caseAEndOfLineComment(AEndOfLineComment node);
	void caseAEqBitAndExp(AEqBitAndExp node);
	void caseAEqEqExp(AEqEqExp node);
	void caseAEqualBinOp(AEqualBinOp node);
	void caseAExpressionPropositionDefinition(AExpressionPropositionDefinition node);
	void caseAFalseLiteral(AFalseLiteral node);
	void caseAFieldAccessPrimaryExp(AFieldAccessPrimaryExp node);
	void caseAFloatLiteral(AFloatLiteral node);
	void caseAFloatPrimitiveType(AFloatPrimitiveType node);
	void caseAGreaterBinOp(AGreaterBinOp node);
	void caseAGreaterEqualBinOp(AGreaterEqualBinOp node);
	void caseAGreaterEqualRelExp(AGreaterEqualRelExp node);
	void caseAGreaterRelExp(AGreaterRelExp node);
	void caseAHexIntLiteral(AHexIntLiteral node);
	void caseAHexLongLiteral(AHexLongLiteral node);
	void caseAInclusiveOrAndExp(AInclusiveOrAndExp node);
	void caseAInstanceofExp(AInstanceofExp node);
	void caseAInstanceofRelExp(AInstanceofRelExp node);
	void caseAInstanceParams(AInstanceParams node);
	void caseAIntPrimitiveType(AIntPrimitiveType node);
	void caseAInvokePropositionDefinition(AInvokePropositionDefinition node);
	void caseALeftShiftExp(ALeftShiftExp node);
	void caseALessBinOp(ALessBinOp node);
	void caseALessEqualBinOp(ALessEqualBinOp node);
	void caseALessEqualRelExp(ALessEqualRelExp node);
	void caseALessRelExp(ALessRelExp node);
	void caseALiteralExp(ALiteralExp node);
	void caseALiteralPrimaryExp(ALiteralPrimaryExp node);
	void caseALocationPropositionDefinition(ALocationPropositionDefinition node);
	void caseALongPrimitiveType(ALongPrimitiveType node);
	void caseAMinusAddExp(AMinusAddExp node);
	void caseAMinusBinOp(AMinusBinOp node);
	void caseAMinusUnaryExp(AMinusUnaryExp node);
	void caseAMultAddExp(AMultAddExp node);
	void caseANameExp(ANameExp node);
	void caseANamePostfixExp(ANamePostfixExp node);
	void caseANavigationExp(ANavigationExp node);
	void caseANegativeExp(ANegativeExp node);
	void caseANeqEqExp(ANeqEqExp node);
	void caseANotEqualBinOp(ANotEqualBinOp node);
	void caseANullLiteral(ANullLiteral node);
	void caseAOctIntLiteral(AOctIntLiteral node);
	void caseAOctLongLiteral(AOctLongLiteral node);
	void caseAOrBinOp(AOrBinOp node);
	void caseAOrConditionalExp(AOrConditionalExp node);
	void caseAOrInclusiveOrExp(AOrInclusiveOrExp node);
	void caseAOrOrExp(AOrOrExp node);
	void caseAParamParamList(AParamParamList node);
	void caseAParamsParamList(AParamsParamList node);
	void caseAParenExp(AParenExp node);
	void caseAParenPrimaryExp(AParenPrimaryExp node);
	void caseAPlusAddExp(APlusAddExp node);
	void caseAPlusBinOp(APlusBinOp node);
	void caseAPlusUnaryExp(APlusUnaryExp node);
	void caseAPostfixUnaryNotPlusMinusExp(APostfixUnaryNotPlusMinusExp node);
	void caseAPrimaryPostfixExp(APrimaryPostfixExp node);
	void caseAQualifiedName(AQualifiedName node);
	void caseAQuestionConditionalExp(AQuestionConditionalExp node);
	void caseAQuestionExp(AQuestionExp node);
	void caseARelEqExp(ARelEqExp node);
	void caseAReturnPropositionDefinition(AReturnPropositionDefinition node);
	void caseAReturnValueExp(AReturnValueExp node);
	void caseAReturnValuePrimaryExp(AReturnValuePrimaryExp node);
	void caseAShiftLeftBinOp(AShiftLeftBinOp node);
	void caseAShiftRelExp(AShiftRelExp node);
	void caseAShortPrimitiveType(AShortPrimitiveType node);
	void caseASignedRightShiftExp(ASignedRightShiftExp node);
	void caseASignedShiftRightBinOp(ASignedShiftRightBinOp node);
	void caseASimpleName(ASimpleName node);
	void caseAStaticParams(AStaticParams node);
	void caseAStringLiteral(AStringLiteral node);
	void caseAStrongArrayNavigation(AStrongArrayNavigation node);
	void caseAStrongCastExp(AStrongCastExp node);
	void caseAStrongDivBinOp(AStrongDivBinOp node);
	void caseAStrongDivMultExp(AStrongDivMultExp node);
	void caseAStrongExpArrayAccess(AStrongExpArrayAccess node);
	void caseAStrongExpCastExp(AStrongExpCastExp node);
	void caseAStrongModBinOp(AStrongModBinOp node);
	void caseAStrongModMultExp(AStrongModMultExp node);
	void caseAStrongNameArrayAccess(AStrongNameArrayAccess node);
	void caseAStrongNameCastExp(AStrongNameCastExp node);
	void caseAStrongObjectFieldAccess(AStrongObjectFieldAccess node);
	void caseAStrongObjectNavigation(AStrongObjectNavigation node);
	void caseAStrongPrimitiveCastExp(AStrongPrimitiveCastExp node);
	void caseAThisExp(AThisExp node);
	void caseAThisPrimaryExp(AThisPrimaryExp node);
	void caseAThreadExp(AThreadExp node);
	void caseAThreadPrimaryExp(AThreadPrimaryExp node);
	void caseATimesBinOp(ATimesBinOp node);
	void caseATimesMultExp(ATimesMultExp node);
	void caseATrueLiteral(ATrueLiteral node);
	void caseAUnaryExpMultExp(AUnaryExpMultExp node);
	void caseAUnaryNotPlusMinusUnaryExp(AUnaryNotPlusMinusUnaryExp node);
	void caseAUnit(AUnit node);
	void caseAUnsignedRightShiftExp(AUnsignedRightShiftExp node);
	void caseAUnsignedShiftRightBinOp(AUnsignedShiftRightBinOp node);
	void caseAXorExclusiveOrExp(AXorExclusiveOrExp node);
	void caseAXorInclusiveOrExp(AXorInclusiveOrExp node);
	void caseEOF(EOF node);
	void caseStart(Start node);
	void caseTAnd(TAnd node);
	void caseTBitAnd(TBitAnd node);
	void caseTBitComplement(TBitComplement node);
	void caseTBitOr(TBitOr node);
	void caseTBitXor(TBitXor node);
	void caseTBoolean(TBoolean node);
	void caseTByte(TByte node);
	void caseTChar(TChar node);
	void caseTCharLiteral(TCharLiteral node);
	void caseTColon(TColon node);
	void caseTComma(TComma node);
	void caseTDecIntLiteral(TDecIntLiteral node);
	void caseTDecLongLiteral(TDecLongLiteral node);
	void caseTDim(TDim node);
	void caseTDocumentationComment(TDocumentationComment node);
	void caseTDot(TDot node);
	void caseTDouble(TDouble node);
	void caseTDoubleLiteral(TDoubleLiteral node);
	void caseTEndOfLineComment(TEndOfLineComment node);
	void caseTEqual(TEqual node);
	void caseTExpression(TExpression node);
	void caseTFalse(TFalse node);
	void caseTFloat(TFloat node);
	void caseTFloatLiteral(TFloatLiteral node);
	void caseTGreater(TGreater node);
	void caseTGreaterEqual(TGreaterEqual node);
	void caseTHexIntLiteral(THexIntLiteral node);
	void caseTHexLongLiteral(THexLongLiteral node);
	void caseTId(TId node);
	void caseTInstanceof(TInstanceof node);
	void caseTInt(TInt node);
	void caseTInvoke(TInvoke node);
	void caseTLBrace(TLBrace node);
	void caseTLBracket(TLBracket node);
	void caseTLess(TLess node);
	void caseTLessEqual(TLessEqual node);
	void caseTLocation(TLocation node);
	void caseTLong(TLong node);
	void caseTLParen(TLParen node);
	void caseTMinus(TMinus node);
	void caseTNot(TNot node);
	void caseTNotEqual(TNotEqual node);
	void caseTNull(TNull node);
	void caseTOctIntLiteral(TOctIntLiteral node);
	void caseTOctLongLiteral(TOctLongLiteral node);
	void caseTOr(TOr node);
	void caseTPlus(TPlus node);
	void caseTQuestion(TQuestion node);
	void caseTRBrace(TRBrace node);
	void caseTRBracket(TRBracket node);
	void caseTReturn(TReturn node);
	void caseTRetVal(TRetVal node);
	void caseTRParen(TRParen node);
	void caseTSemicolon(TSemicolon node);
	void caseTShiftLeft(TShiftLeft node);
	void caseTShort(TShort node);
	void caseTSignedShiftRight(TSignedShiftRight node);
	void caseTStar(TStar node);
	void caseTStringLiteral(TStringLiteral node);
	void caseTStrongDiv(TStrongDiv node);
	void caseTStrongMod(TStrongMod node);
	void caseTThis(TThis node);
	void caseTThread(TThread node);
	void caseTTraditionalComment(TTraditionalComment node);
	void caseTTrue(TTrue node);
	void caseTUnsignedShiftRight(TUnsignedShiftRight node);
	void caseTWeakDiv(TWeakDiv node);
	void caseTWeakMod(TWeakMod node);
	void caseTWhiteSpace(TWhiteSpace node);
	Object getIn(Node node);
	Object getOut(Node node);
	void setIn(Node node, Object in);
	void setOut(Node node, Object out);
}
