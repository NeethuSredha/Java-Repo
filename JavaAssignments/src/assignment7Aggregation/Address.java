package assignment7Aggregation;

class Student {
	String studentName;
	int rollNum;
	Address address;

	public Student(String name, int rollNo, Address address) {
		this.studentName = name;
		this.rollNum = rollNo;
		this.address = address;
	}
}

class Address {
	String city, state, country;

	public Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public static void main(String[] args) {
		Address address = new Address("Kochi", "Kerala", "India");
		Student stud = new Student("Joe", 15, address);
		System.out.println("-------Student Details-----\n");
		System.out.println("Student Name :" + stud.studentName + "\n" + "Roll Number :" + stud.rollNum + "\n");
		System.out.println("--Address--");
		System.out.println(
				"City :" + address.city + "\n" + "State :" + address.state + "\n" + "Country :" + address.country);
	}

}
