package com.acme.prime.eval.api;

import org.osgi.annotation.versioning.ProviderType;

/**
 * A services that evaluates an expression and returns the result.
 */
@ProviderType
public interface Eval {
	
	/**
	 * Evaluates an expression and returns the result.
	 */
	double eval(String expression) throws Exception;
}
