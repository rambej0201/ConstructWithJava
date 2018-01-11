class TestFive 
{
	int eid;
	String ename;
	double esal;
	void display(){
		System.out.println("Employee Id is "+eid);
		System.out.println("Employee Salary is "+esal);
		System.out.println("Employee name is "+ename);
	}
	TestFive(){
		eid = 20;
		ename = "Ram";
		esal = 4859.87;
	}
	public static void main(String[] args) 
	{
		TestFive t1 = new TestFive();
		t1.display();
		System.out.println("Hello World!");
	}
}
