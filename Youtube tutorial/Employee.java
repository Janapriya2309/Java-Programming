import java.io.*;
import java.util.*;
public class Employee {
    int empno;
    String ename;
    float basic;
    float hra;
    float da;
    float netpay;
    Employee(int empno,String ename,float basic,float da,float hra)
    {
        this.empno=empno;
        this.ename=ename;
        this.basic=basic;
        this.da=da;
        this.hra=hra;
    }
    float calculate()
    {
        return basic+da+hra;
    }
    public String display()
    {
        return empno+":"+ename+":"+basic+":"+da+":"+hra+":"+calculate();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Employee obj=new Employee(sc.nextInt(),sc.next(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
       System.out.print( obj.display());
    }


    
}
