import java.io.*;

import java.util.*;

class StudentAvg

{

public static void main(String args[])

{

int sm1, sm2, sm3, sm4,sm5;

double Avg:

Scanner sc=new Scanner(System.in);

System.out.println("Enter marks of 5 subjects");

sm1=sc.nextInt();

sm2=sc.nextInt();

sm3=sc.nextInt();

sm4=sc.nextInt();

sm5=sc.nextInt();

Avg=(double) ((sm1+sm2+sm3+sm4+sm5)/5);

System.out.println("StudentAvg is"+Avg);

if (Avg>=80)

{

System.out.println("Student passed in distinction");

}

else

if (Avg>=70 && Avg<80)

System.out.println("Student passed in 1st class");

{

}

else

if(Avg>=50 && Avg<70)

System.out.println("Student passed in 2nd class");

{

}

else

if(Avg>40 && Avg<50)

System.out.println("Student passed in 3rd class");}

else

{

System.out.println("Student failed"); 
}

}

}
