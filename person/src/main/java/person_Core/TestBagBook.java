package person_Core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestBagBook {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("BagBook.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Bag bag = (Bag) beanFactory.getBean("myBag");
		System.out.println("Name is "+bag.getName());
		System.out.println("Feature is "+bag.getFeature());
		System.out.println("Book Name is "+bag.getB().getBookname());
		System.out.println("Brand is "+bag.getB().getBrand());
		
	}

}
