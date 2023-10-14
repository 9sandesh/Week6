package fall2023;

public class construct {
	int marks;
	String course;
construct()
{
	System.out.println("Example for Constructor");
}


construct(int a, String b )
{
	System.out.println("age is "+ a);
	System.out.println("name is "+ b);
}
construct(String a, int marks)
{
	course=a;
	System.out.println("course name is "+ course);
	System.out.println("score is "+ marks);
}
public static void main(String[] args) {
	construct r=new construct();
	construct z=new construct(20,"joe");
	construct t=new construct("java",40);
}
}