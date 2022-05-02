package practice.cycledependcy;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class CycleDependcyDemo {

//	private static Map<String, Object> beansMap = new HashMap<>();
//
//	public static void main(String[] args) throws Exception {
//
//		beansMap.put("instanceA", InstanceA.class);
//		beansMap.put("instanceB", InstanceA.class);
//
//		InstanceA instanceA = (InstanceA) getBean("instanceA");
//	}
//
//	public static Object getBean(String beanName) throws Exception {
//
//		Class clazz = (Class) beansMap.get(beanName);
//		Object instance = clazz.newInstance();
//
//		for (Field field : clazz.getFields()) {
//
//			if (field.isAnnotationPresent(Autowired.class)) {
//				field.setAccessible(true);
//				Object fieldObject = getBean(field.getName());
//				field.set(instance, fieldObject);
//			}
//		}
//
//		return instance;
//
//	}
}
