class  TestTwo
{
	void M1(){
		System.out.println("M oka Method");
	}
	TestTwo(){
		System.out.println("0 arguemtn default constructor");
	}
	TestTwo(int a){
		System.out.println("1 arguement user defined constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Namasthe rabhay");
		TestTwo t = new TestTwo();
			t.M1();

		TestTwo t1 = new TestTwo(8);
			t1.M1();
	}

}
