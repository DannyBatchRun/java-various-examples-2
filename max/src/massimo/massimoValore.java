package massimo;

public class massimoValore {

	public static void main(String[] args) {
		
		int valoreMax;
		int posizioneMax;
		int[] numeriInteri = {10, 77, 5, 4, 55, 8, 3, 89, 24, 3}; //numeri.length = 10
		valoreMax = massimoNumero(numeriInteri);
		System.out.println("Il valore massimo è " + valoreMax);
		posizioneMax = numeroPosizione(numeriInteri);
		System.out.println("e la sua posizione è la numero " + posizioneMax);
	}
	
	//Nel metodo, ogni volta che il valore di un numero di Array è superiore a MaxNum
	//(partendo da 0) allora maxNum si sostituisce con il valore più alto
	public static int massimoNumero(int[] a) {
		int maxNum = 0;
		for (int i=0; i < a.length; i++) {
			if (a[i] > maxNum) {
				maxNum = a[i];
		}
		}
		return maxNum;
	}
	
	public static int numeroPosizione(int[] a) {
		int maxPos = 0;
		int maxNumero = 0;
		for (int i=0; i < a.length; i++) {
			if (maxPos < a[i]) {
				maxNumero = a[i];
				maxPos = i;
			}
		}
		return maxPos;
	}
}
