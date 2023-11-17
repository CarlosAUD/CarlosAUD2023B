public class HolaMundo {

	public static void main(String[] args) {		
		Scanner sc =new Scanner(System.in);
		Scanner vr = new Scanner(System.in);
		int a = (int) ((Math.random()*12)+1);
		int b;
		int j;
		int c = (int) ((Math.random()*31)+1);
		Scanner mivariable=new Scanner(System.in);
                System.out.println("Ingrese su nombre: Mi nombre es Carlos Ushiña ");
                String nombre= mivariable.nextLine();
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
        if ((b == 3 && j > 20) || (b == 4 && j < 20)) {
		System.out.print("Tu signo zodiacal es Aries: " + b + "-" + j);
	} else if ((b >= 4 && j <= 20) || (b == 5 && j <= 20)) {
		System.out.print("Tu signo zodiacal es Tauro: " + b + "-" + j);
	} else if ((b >= 5 && j <= 21) || (b == 6 && j <= 20)) {
		System.out.print("Tu signo zodiacal es Geminis: " + b + "-" + j);
	} else if ((b >= 6 && j <= 21) || (b == 7 && j <= 22)) {
		System.out.print("Tu signo zodiacal es Cancer: " + b + "-" + j);
	} else if ((b >= 7 && j <= 23) || (b == 8 && j <= 22)) {
		System.out.print("Tu signo zodiacal es Leo: " + b + "-" + j);
	} else if ((b >= 8 && j <= 23) || (b == 9 && j <= 22)) {
		System.out.print("Tu signo zodiacal es Virgo: " + b + "-" + j);
	} else if ((b >= 9 && j <= 23) || (b == 10 && j <= 22)) {
		System.out.print("Tu signo zodiacal es Libra: " + b + "-" + j);
	} else if ((b >= 10 && j <= 23) || (b == 11 && j <= 21)) {
		System.out.print("Tu signo zodiacal es Escorpio: " + b + "-" + j);
	} else if ((b >= 11 && j <= 22) || (b == 12 && j <= 21)) {
		System.out.print("Tu signo zodiacal es Sagitario: " + b + "-" + j);
	} else if ((b >= 12 && j <= 22) || (b == 1 && j <= 19)) {
		System.out.print("Tu signo zodiacal es Capricornio: " + b + "-" + j);
	} else if ((b >= 1 && j <= 20) || (b == 2 && j <= 18)) {
		System.out.print("Tu signo zodiacal es Acuario: " + b + "-" + j);
	} else if ((b >= 2 && j <= 19) || (b == 3 && j <= 20)) {
		System.out.print("Tu signo zodiacal es Piscis: " + b + "-" + j);
		}
	System.out.println("Su nombre es: " + nombre "Carlos Ushiña" );
	}
}
		
