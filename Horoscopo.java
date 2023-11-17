public class HolaMundo {

	public static void main(String[] args) {		
		Scanner sc =new Scanner(System.in);
		Scanner vr = new Scanner(System.in);
		int a = (int) ((Math.random()*12)+1);
		int b;
		int j;
		int c = (int) ((Math.random()*31)+1);
		System.out.println("El juego consiste en averigurar la fecha secreta: ");
		b = sc.nextInt();
		for (i=0;i<=4;i++){
			if(a==b){
				System.out.println("Has acertado");
				break;}
			else if(i==4){
				System.out.println("Lo siento has perdido, el numero correcto era: ");
				break;}
			else if(a>b){
				System.out.println("El numero secreto es Mayor que " + b);}
			else if(a<b){
				System.out.println("El numero secreto es Menor que " + b);}
			if(i<=1){
				System.out.println("Otro intento: ");
				b = sc.nextInt();}
			else if(i==2){
				int x = (int) (a/10);
				System.out.println("una pista, la primera cifra es: " + x);
				System
				break;}











































	}

}
