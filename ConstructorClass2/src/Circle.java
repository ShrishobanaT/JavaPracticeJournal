
class Circle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 c1=new Circle1();
		Circle1 c2=new Circle1();
		c1.x=3.0;
		c1.y=4.0;
		c1.r=5.0;
		c2.x=2.0;
		c2.y=2.0;
		c2.r=2.0;
		System.out.println("Circumference of Circle:" + c1.circumference());
		System.out.println("Area of Circle:" + c1.Area());
		System.out.println("Circumference of Circle:" + c2.circumference());
		System.out.println("Area of Circle:" + c2.Area());					
		}

}

