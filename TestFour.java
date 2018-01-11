class TestFour 
{
	//instance variable
	int eid;
	String ename;
	double esal;
	
	void display(){
		System.out.println("Employee Id is "+eid);
		System.out.println("Employee Name is "+ename);
		System.out.println("Employee Salary is "+esal);
	}
	public static void main(String[] args) 
	{
		TestFour t1 = new TestFour();
		t1.display();
		System.out.println("Namasthe Office"); //compiler created 0 default constructor

	}
}
