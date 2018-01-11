class TestSix 
{
	TestSix(){
		this(5);
		System.out.println("Sunna Arguement Constructor");
	}
	TestSix(int x){
		this(10, 11);
		System.out.println("Okka Arguement Constructor");
	}
	TestSix(int a, int b){
		System.out.println("Rendu Arguement onstructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		TestSix ts1 = new TestSix();
		TestSix ts2 = new TestSix(5);
		TestSix ts3 = new TestSix(10, 11);
	}
}
