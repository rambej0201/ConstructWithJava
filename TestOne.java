class TestOne 
{
	void m1(){
		System.out.println("M1 Method");
	}
	/*
	default constructor 
	TestOne()
	{
		//empty implementation, compiler creates this
		}

	*/

	public static void main(String[] args) 
	{
		TestOne t = new TestOne();
		t.m1();
	}
}
