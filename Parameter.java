class parameters{
 public static int add(int a,int b){
 int sum;
  sum=a+b;
return sum;}
public static int sub(int a,int b){
 int difference;
  difference=a-b;
return difference;}
public static int product(int a,int b){
 int multi;
  multi=a*b;
return multi;}
public static int quotient(int a,int b){
 int q;
  q=a/b;
return q;}
public static void main(String[] args){
 int sum=add(3,8);
System.out.println("Addition :"+sum);
int sub=sub(4,1);
System.out.println("Difference:"+sub);
int res=product(4,5);
System.out.println("Multiplication:"+res);
int q=quotient(8,2);
System.out.println("Quotient:"+q);
}
}