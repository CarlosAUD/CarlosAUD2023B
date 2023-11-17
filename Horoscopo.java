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
				System.out.println("Lo siento has perdido, el numero correcto era: " + a);
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
				System.out.print("Intentalo de nuevo: ");
				b = sc.nextInt();}
			else if(i>=3){
				System.out.print("Ultimo intento: ");
				b = sc.nextInt();}
		}
		System.out.print("tienes 5 mas intentos. Escribe un numero del 1 al 31: ");
		j = vr.nextInt();
		for (i=0;i<=4;i++){
			if(c==j){
				System.out.println("Has acertado");
				break;}
			else if(i==4){
				System.out.println("Lo siento has perdido, el numero correcto era: " + c);
				break;}
			else if(c>j){
				System.out.println("El numero secreto es Mayor que " + j);}
			else if(c<j){
				System.out.println("El numero secreto es Menor que " + j);}
			if(i<=1){
				System.out.println("Otro intento: ");
				j = vr.nextInt();}
			else if(i==2){
				int y = (int) (c/10);
				System.out.println("una pista, la primera cifra es: " + y);
				System.out.print("Intentalo de nuevo: ");
				j = vr.nextInt();}
			else if(i>=3){
				System.out.print("Ultimo intento: ");
				j = vr.nextInt();}
		}
			











































	}

}
