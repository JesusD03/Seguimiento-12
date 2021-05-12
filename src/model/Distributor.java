package model;

public class Distributor{
	private String name;
	private String address;
	private String phone;
	//contructor
	public Distributor(String name, String address, String phone){
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	//set
	public void setName(String name){
		this.name = name;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	//get
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getPhone(){
		return phone;
	}
	//toString
	public String toString(){
		String answer = "\n Nombre: " + name + "\n Direccion: " + address + "\n Telefono: " + phone;
		return answer;
	}
}