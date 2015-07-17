package com.github.lbroudoux.dsl.eip.design.services;

import org.eclipse.emf.ecore.EObject;

import com.github.lbroudoux.dsl.eip.Endpoint;

/**
 * EIP odesign java services
 * @author yanngv29
 *
 */
public class EipDesignService {

	
	
	/**
	 * make sure that source And target are in the same container ( useful for Channel or ConditionalRoute )
	 * @param objectTarget
	 * @param objectSource
	 * @return
	 */
	public boolean inTheSameContainerPrecondition(EObject objectTarget,EObject objectSource) {
		
		if (objectTarget instanceof Endpoint) {
			if (objectTarget.eContainer().equals(objectSource.eContainer()))
				return true;
		}
		return false;
	}


}
