package practice.cycledependcy;

import org.springframework.beans.factory.annotation.Autowired;

public class InstanceB {

	@Autowired
	private InstanceA instanceA;
}
