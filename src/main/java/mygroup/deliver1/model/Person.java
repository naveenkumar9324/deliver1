package mygroup.deliver1.model;

public class Person {
	private String kurzbezeichnung;
	private int id;
	private String strassenbezeichnung;
	
	
	public Person(String kurzbezeichnung, int id, String strassenbezeichnung) {
		super();
		this.kurzbezeichnung = kurzbezeichnung;
		this.id = id;
		this.strassenbezeichnung = strassenbezeichnung;
	}
	public String getKurzbezeichnung() {
		return kurzbezeichnung;
	}
	public void setKurzbezeichnung(String kurzbezeichnung) {
		this.kurzbezeichnung = kurzbezeichnung;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStrassenbezeichnung() {
		return strassenbezeichnung;
	}
	public void setStrassenbezeichnung(String strassenbezeichnung) {
		this.strassenbezeichnung = strassenbezeichnung;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [kurzbezeichnung=" + kurzbezeichnung + ", id=" + id + ", strassenbezeichnung="
				+ strassenbezeichnung + "]";
	}
	
	

}
