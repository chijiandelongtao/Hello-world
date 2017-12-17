package cn.youjian.ly.test;

public class Car {
	
	private Integer id;
	private String name;
	private Double price;
	public Car(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	/*@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", price=" + price + "]";
	}*/
	
	public static void main(String[] args) {
		Car car = new Car(100,"aa",344d);
		System.out.println(car);
	}
}
