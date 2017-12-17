package cn.youjian.ly.test;

import java.lang.reflect.Constructor;

public class Cartwo {
	
	private Integer id;
	private String name;
	private Double price;
	public Cartwo() {
		super();
		this.id = 1;
		this.name = "haha";
		this.price = 56d;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	public static void main(String[] args) throws Exception {
		//Cartwo car = new Cartwo(100,"aa",344d);
		
		Cartwo car = new Cartwo();
		//Cartwo car2 = Cartwo.class.newInstance();
		/*Class car2 = Cartwo.class;
		System.out.println(car2);*/
		
		Class<?> clazz2;
		try {
			clazz2 = Class.forName("cn.youjian.ly.test.Cartwo");
			Constructor<?> constructor = clazz2.getConstructor();
			Object object = constructor.newInstance();
			System.out.println(object);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
}
