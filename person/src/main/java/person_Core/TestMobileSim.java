package person_Core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMobileSim {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("MobileSim.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Mobile mobile = (Mobile) beanFactory.getBean("myMobile");
		
		System.out.println("Mobile: "+mobile.getName());
		System.out.println("Mobile Cost: "+mobile.getCost());
		System.out.println("Sim Provider: "+mobile.getS().getProvider());
		System.out.println("Sim Type: "+mobile.getS().getType());
		
	}

}
