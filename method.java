//method overloading
class method1
{
void add(int a, int b)
{
int c;
c=a+b;
System.out.println(c);
}

void add(double a, double b)
{
double c;
c=a+b;
System.out.println(c);
}
public static void main(String aa[])
{
method1 o=new method1();
o.add(10,20);
o.add(10.5,20.5);
}
}