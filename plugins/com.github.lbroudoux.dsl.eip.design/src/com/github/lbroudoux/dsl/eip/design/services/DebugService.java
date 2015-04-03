package com.github.lbroudoux.dsl.eip.design.services;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.tools.api.interpreter.InterpreterUtil;
/**
 * Base service for tracing and debugging Sirius views.
 * @author laurent
 */
public class DebugService {

	public EObject traceWithVariables(Object context) {
		EObject interpreterContext = null;
		if (context instanceof EObject){
			interpreterContext = (EObject) context;
		}
		
		if (interpreterContext != null){
			IInterpreter interpreter = InterpreterUtil.getInterpreter(interpreterContext);
			for (String var : interpreter.getVariables().keySet()) {
				System.out.println(var + " : " + interpreter.getVariables().get(var));
			}
		}
		return interpreterContext;
	}
}
