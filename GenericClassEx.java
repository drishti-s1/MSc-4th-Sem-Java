//generic class in Java
class GenericClassEx <T>
{
T obj;
GenericClassEx (T obj)
{
this.obj=obj;
}
T getobj()
{
return obj;
}
}
class Gen1
{
public static void main(String[] args)
{
Integer i = 12;
GenericClassEx<Integer> obj = new GenericClassEx<Integer>(i);
System.out.println("You stored: " + obj.getobj());

Float f = 12.132f;
Myclass<Float> obj1 = new Myclass<Float>(f);
System.out.println("You stored: " + obj1.getobj());

Myclass<String> obj2 = new Myclass<String>("Ravi");
System.out.println("You stored: " + obj2.getobj());
}
}