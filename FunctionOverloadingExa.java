class FunctionOverloadingExa
{
  
  static int add(int a,int b)
  {
   return a+b;
   }
  static int add(int a,int b,int c)
  {
   return a+b+c;
   }
  static double add(double a,double b)
  {
   return a+b;
   }

  static int add(int y[])
  {
    int l=y.length;
    int sum=0;
   for (int i=0;i<l;i++)
   {
     sum=sum+y[i];
   }
  return sum;
}
 public static void main(String args[])
  {
   System.out.println("5+2="+add(5,2));
   System.out.println("10+10+10="+add(10,10,10));
 System.out.println(" 5.5+2.5="+add(5.5,2.5));

  int x[]={1,2,3,4,5,6,7,8,9,10};
  int sum=add(x);
  System.out.println("1+2+..+10 = "+sum);

  }
}