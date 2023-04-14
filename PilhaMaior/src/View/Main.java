package View;

import Controllor.Pilha;
import PilhaInt.PilhaI;

public class Main {
	

	public static void main(String[] args) {
		
		PilhaI PMain = new PilhaI();
		Pilha P = new Pilha();
		P.NumPilha(PMain);
		while (PMain.size() !=1) {
			try {
				int A = PMain.pop();
				int B = PMain.pop();
				
				if (A>B) {
					PMain.push(A);
				}else {
					PMain.push(B);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
			System.out.println("O maior valor é: "+PMain.top());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
