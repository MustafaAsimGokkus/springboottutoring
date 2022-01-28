package reastapi1controller;

import org.springframework.stereotype.Component;

@Component
public class StudentBean02 implements StudentInterface {
	private String name;
	private int age;
	private String id;
	
	
	public StudentBean02() {
		System.out.println("StudentBean02 object created");
	}


	public StudentBean02(String name, int age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "StudentBean02 [name=" + name + ", age=" + age + ", id=" + id + "]";
	}


	@Override
	public String study() {
		// TODO Auto-generated method stub
		return "It comes from StudentBean02";
	}
	
	
	
	
}
