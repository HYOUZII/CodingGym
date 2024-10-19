import java.util.*;

class Main(){
	public static void obesity(double tall, double weight){
		double standard, obe_val;
		
		if(tall<150){	standard = tall - 100;
		else if(tall>=160){ standard = (double)(tall-100)*0.9;}
		else{ (double)(standard-150)/2 + 50;}

		obe_val = (double)((weight - standard)*100/standard);
		
		if(obe_val<=10){System.out.printf("정상\n");}
		else if(obe_val>20){System.out.printf("비만\n");}
		else{System.out.printf("과체중\n");}
	}

	public static void BMI(){
		double tall, weight;
		Scanner input = new Scanner(System.in);
		tall = input.nextInt();	//입력받기
		weight = input.nextInt();

		obesity(tall, weight);

	}

	public static void main(String[] args){
		BMI();
	}
}
