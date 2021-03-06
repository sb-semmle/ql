package com.semmle.js.ast;

import java.util.List;

import com.semmle.ts.ast.ITypeExpression;

/**
 * A function call expression such as <code>f(1, 1)</code>.
 */
public class CallExpression extends InvokeExpression {
	public CallExpression(SourceLocation loc, Expression callee, List<ITypeExpression> typeArguments, List<Expression> arguments) {
		super("CallExpression", loc, callee, typeArguments, arguments);
	}

	@Override
	public <Q, A> A accept(Visitor<Q, A> v, Q q) {
		return v.visit(this, q);
	}
}
