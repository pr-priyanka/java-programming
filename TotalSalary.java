import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
		int basic,allow;
        char grade;
        basic=s.nextInt();
        grade = s.next().charAt(0);
        double hra=(0.2)*basic;
        double da=(0.5)*basic;
        double pf=(0.11)*basic;
        if(grade== 'A')
        {
            allow=1700;
        }
        else if(grade=='B')
        {
            allow=1500;
        }
        else
        {
            allow=1300;
        }
        
        double totalSalary;
        totalSalary =basic + hra + da + allow - pf;
        totalSalary= (int)(totalSalary+0.5);
        System.out.println(Math.round(totalSalary));

	}
}
