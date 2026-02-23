// Compile :- javac prg.java
//run :- java prg.java

class piyush{
 public static void main(String[] args)
  { 
   int a = 2, b= 3;
   int number = a+b;
   number +=5; 
   String name = "Piyush roy";
   if(number >= 5)
    {
   System.out.println("number is greator then 5");
   }else{
   System.out.println("number is less then 5");
   }

   double x=25;
    var y = Math.sqrt(x);
    var c =(int)y;
   System.out.println(c);
     
   System.out.println("Hello World "+number+ name + (a+b));
   System.out.println(name.toLowerCase());
   System.out.println(name.toUpperCase());
   System.out.println(name.length());

   System.out.println(name.substring(4));
   System.out.println(name.trim());
   System.out.println(name.substring(4,8));
   for (int i=1; i<=8; i++)
    {
     System.out.println(i);
     }
  }}
