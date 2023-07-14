package org.springframework.learn;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author dbj
 */
@Service("a")
public class ServiceA implements IService {

	private IService b;

	public void setB(IService b) {
		this.b = b;
	}

	@Transactional
	public void tr() {

	}

}
