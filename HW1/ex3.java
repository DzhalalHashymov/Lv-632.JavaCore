import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex3 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    double c1 = 2.5, c2 = 4, c3=4.7; // ������� ������ 
	  	    
	    System.out.println("������ ������ ������ ������ � ������?");
	    double t1 = Double.parseDouble(br.readLine());
	    double cost1=t1*c1;
	    
	    System.out.println("������ ������ ������ ������ � ��������?");
	    double t2 = Double.parseDouble(br.readLine());
	    double cost2=t2*c2;
	    
	    System.out.println("������ ������ ������ ������ � ���������?");
	    double t3 = Double.parseDouble(br.readLine());
	    double cost3=t3*c3;
	    
	    System.out.println("������� ������ � ������ - " +cost1);
	    System.out.println("������� ������ � �������� - " +cost2);
	    System.out.println("������� ������ � ��������� - " +cost3);
	    System.out.println("�������� ������� ������ " +(cost1+cost2+cost3));
}
}
