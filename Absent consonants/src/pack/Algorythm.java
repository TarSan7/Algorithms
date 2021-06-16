package pack;

import java.util.*;

public class Algorythm {
	private boolean consonants[] = {false, true, true, true, false, true, true, true, false, true, true, true, 
			true, true, false, true, true, true, true, true, false, true, true, true, false, true};	 //масив перевірки наявності символів
	private StringBuilder sentence = new StringBuilder();		//строка всіх символів
	
	public Algorythm(String str){
		str = str.toLowerCase();			//перевод в нижній регістр
		for(int i = 0; i < str.length(); i++) {		//додавання в строку букв
			if(str.charAt(i) >= 'a' && str.charAt(i) <='z') {
				sentence.insert(sentence.length(), str.charAt(i));
			}
		}
	}
	
	public void check(){
		for(int i = 0; i < sentence.length(); i++) {		//відмічаємо які символи є в строці
			if(consonants[(int)sentence.charAt(i) - 97]) consonants[(int)sentence.charAt(i) - 97] = false; 
		}
		System.out.print("\nAbsent consonants: ");			
		for(int i = 0; i < consonants.length; i++) {
			if(consonants[i]) System.out.print((char)(i + 97) + " ");		//на місцях де стоїть 1, відсутні букви
		}
		
	}
}
