public class Main {
	static int n = 1000;
	static int b = 2500;
	static int tel = 14000;
	static int pr = 5;
	static int g = 0;
	public static void main(String[] args) {
		while(tel>n){
			n = mes(n);
			g++;
		}
		System.out.println(g);
	}
	static int mes(int a){
		return a+2500+a*pr/100;
		
	}
}