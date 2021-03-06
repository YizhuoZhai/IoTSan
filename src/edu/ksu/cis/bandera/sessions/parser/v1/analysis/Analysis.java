/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.sessions.parser.v1.analysis;

import edu.ksu.cis.bandera.sessions.parser.v1.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object in);
    Object getOut(Node node);
    void setOut(Node node, Object out);

    void caseStart(Start node);
    void caseAUnit(AUnit node);
    void caseASession(ASession node);
    void caseAStringResource(AStringResource node);
    void caseAStringStrings(AStringStrings node);
    void caseAStringsStrings(AStringsStrings node);

    void caseTWhiteSpace(TWhiteSpace node);
    void caseTLBrace(TLBrace node);
    void caseTRBrace(TRBrace node);
    void caseTPlus(TPlus node);
    void caseTEqual(TEqual node);
    void caseTSession(TSession node);
    void caseTStringLiteral(TStringLiteral node);
    void caseTId(TId node);
    void caseEOF(EOF node);
}
