class Parent{

	void print(){
		System.out.println("This is a parentclass.");
	}

	public static void main(String[] args) {
		Parent obj1=new Parent();
		Sub obj2=new Sub();

		obj1.print();
		obj2.printSubText();
		obj2.print();
	}

}

class Sub extends Parent{
	void printSubText(){
		System.out.println("This is a subclass.");

	}

}
