class book{
	String title;
	String author;
	String type;
	
	book(String title, String author, String type){
		this.title = title;
		this.author = author;
		this.type = type;
	}
	
	void displayBookInfo() {
		System.out.println("Title: " + this.title);
		System.out.println("Autor: " + this.author);
		System.out.println("Type: " + this.type);
	}
}

class technical extends book{
	String course;
	float price;
	
	technical(String title, String author, String type, String course, float price){
		super(title, author, type);
		this.course = course;
		this.price = price;
	}
	
	void displayTechnical() {
		System.out.println("Course: " + this.course);
		System.out.println("Price: " + this.price);
	}
	
	float setPrice() {
		return this.price - 1f/20f * this.price;
	}
}

class nonTechnical extends book{
	String course;
	float price;
	
	nonTechnical(String title, String author, String type, String course, float price){
		super(title, author, type);
		this.course = course;
		this.price = price;
	}
	
	void displayNonTechnical() {
		System.out.println("Course: " + this.course);
		System.out.println("Price: " + this.price);
	}
	
	float setPrice() {
		return this.price - 1f/10f * this.price;
	}
}