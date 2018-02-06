class emp
{
int salary;
emp()
{
salary=15000;
}
void salarychange(int s)
{
salary=s;
}
public static void main(String[] args)
{
emp e1=new emp();
System.out.println(e1.salary);
e1.salarychange(30000);
System.out.println(e1.salary);

}
}
