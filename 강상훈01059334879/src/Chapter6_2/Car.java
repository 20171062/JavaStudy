package Chapter6_2;

public class Car {
	private String company; // 회사
	private String model; // 모델명
	private String color; // 색상
	private int year; // 연식
	
	//get은 매개변수x 반환형o
	//set은 매개변수o 반환형x
	
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
