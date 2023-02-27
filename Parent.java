class Parent
{
	String a="from parent";
}
 class child extends Parent
 {
 	String a="from child";

 
 public void m1()
 {
 	String a="from child local";
 	System.out.println(a);
 	System.out.println(this.a);
 	System.out.println(super.a);
 }
  public static void main(String[] args)
   {
  	child b=new child();
  	b.m1();

  }
}
