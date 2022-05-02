package practice.cycledependcy;

import org.springframework.beans.factory.annotation.Autowired;

public class InstanceA {

	@Autowired
	private InstanceB instanceB;

}
