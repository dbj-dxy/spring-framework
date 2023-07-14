package org.springframework.learn;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author dbj
 */
@Service("b")
public class ServiceB implements IService {

	private IService a;

	public void setA(IService a) {
		this.a = a;
	}

	@Transactional
	public void tr() {

	}

}
