import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.println("����� ����� ������:");
	   double r = Double.parseDouble(br.readLine()); // r - �����
	    double P = 3.14;
	    
	    System.out.println("�������� = "  + (2*P*r));
	    System.out.println("����� = " + (P*r*r));

}
}

