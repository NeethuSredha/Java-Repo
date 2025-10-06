package assignment3;

public class ConstructorChaining {
	int val;
	ConstructorChaining(){
		this(10);
		System.out.println("Inside Default constructor");
	}
	ConstructorChaining(int val){
		this.val=val;
		System.out.println("Single parameter constructor is called");
	}
	void display() {
		System.out.println("value is:"+val);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChaining c=new ConstructorChaining();
		c.display();
	}

}
