public class Ejercicio1{

	public static void main(String[] args){
		doNotCodeThis(1);
	}

	public static void doNotCodeThis(int num){
		System.out.println("I got here " +num);
		doNotCodeThis(++num);
		System.out.println(num);
	}
}
