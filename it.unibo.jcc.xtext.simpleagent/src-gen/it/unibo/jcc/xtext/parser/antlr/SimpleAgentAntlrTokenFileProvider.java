/*
 * generated by Xtext 2.18.0.M3
 */
package it.unibo.jcc.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SimpleAgentAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("it/unibo/jcc/xtext/parser/antlr/internal/InternalSimpleAgent.tokens");
	}
}
