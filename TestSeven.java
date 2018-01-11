class TestSeven{

	TestSeven(){
		System.out.println("Sunna Arguement");
	}
	TestSeven(int a){
		System.out.println("Okka Arguement");
	}
	TestSeven(int x, int y){
		System.out.println("Rendo Arguement");
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		new TestSeven(); //nameless object1
		new TestSeven(5); //nameless object2
		new TestSeven(4,3);//nameless object3
	}
}
