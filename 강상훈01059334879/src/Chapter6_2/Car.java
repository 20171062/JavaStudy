package Chapter6_2;

public class Car {
	private String company; // ȸ��
	private String model; // �𵨸�
	private String color; // ����
	private int year; // ����
	
	//get�� �Ű�����x ��ȯ��o
	//set�� �Ű�����o ��ȯ��x
	
	public void setCompany(String company) {
		this.company = company;
		
		
	}
	public String getCompany() {
		return company;
	}
	
	public String getModel(String model) {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getYear() {
		return year-1;
	}
	public void setYear(int year) {
		this.year = year+1;
	}	
}
