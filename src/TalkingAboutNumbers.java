package com.vogella.junit.first;

import java.util.*;
public class TalkingAboutNumbers {

	public void printWord(int n, String ch) {
		String  oneAlone[] = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String  one[] = {" ", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};
		String  oneHyphen[] = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};

		String ten[] = {" ", " ",  " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"};

		if(n > 19) { 
			if(n % 10!=0){
				System.out.print(ten[n / 10]+ "-" + oneHyphen[n % 10]);
			} else {
				System.out.print(ten[n / 10]);
			}
		} else {
			System.out.print(one[n]);
		}

		if(n > 0) {
			System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n == 0) {
			System.out.print("zero");
		}

		TalkingAboutNumbers a = new TalkingAboutNumbers();
		if((((n / 100000000) % 10)!=0)&&(((n / 1000000) % 100)!=0)){
			if((((n / 100000) % 10)!=0)&&(((n / 1000) % 100)!=0)){
				a.printWord(((n / 100000000) % 10), " hundred");
				a.printWord(((n / 1000000) % 100), " million");
			} else{
				a.printWord(((n / 100000000) % 10), " hundred");
				a.printWord(((n / 1000000) % 100), " million and");
			}
		}
		else if((((n / 100000000) % 100)!=0)){
			if((((n / 100000) % 10)!=0)&&(((n / 1000) % 100)!=0)){
				a.printWord(((n / 100000000) % 100), " hundred million,");
			} else{
				a.printWord(((n / 100000000) % 100), " hundred million and");
			}
		}
		else if((((n / 1000000) % 100)!=0)){
			if((((n / 100000) % 10)!=0)&&(((n / 1000) % 100)!=0)){
				a.printWord(((n / 1000000) % 100), " million,");
			}else{
				a.printWord(((n / 1000000) % 100), " million and");
			}
		}
		//middle 3-digit section
		if((((n / 100000) % 10)!=0)&&(((n / 1000) % 100)!=0)&&((n/100000000)%10)==0){
			if((((n/1000) % 100)!=0)&&((n/1000) % 100)<100){				
				a.printWord(((n / 100000) % 10), " hundred and");
				//a.printWord(((n / 1000) % 100), " thousand and");
			}else if((((n / 100) % 100)<10)&&((n / 100) % 100)!=0){
				a.printWord(((n / 100000) % 10), " hundred and");
				a.printWord(((n / 1000) % 100), " thousand,");
			} else if((((n / 10000) % 10)<10)&&((n / 10000) % 10)!=0){
				a.printWord(((n / 100000) % 10), " hundred and");
				a.printWord(((n / 1000) % 100), " thousand");
			} else{
				a.printWord(((n / 100000) % 10), " hundred thousand");
			
			}
		} else if((((n / 10000) % 10)<1)){
			if((((n/100) % 100)!=0)&&((n/100) % 100)<10){
				a.printWord(((n / 10000) % 100), " thousand and");
			} else if((((n / 1000) % 10)<10)&&((n / 1000) % 10)!=0){
				a.printWord(((n / 10000) % 100), " thousand,");
			} else{
				a.printWord(((n / 100000) % 10), " hundred thousand");
			}
		} if((((n / 1000) % 100)!=0)){
			if((((n/10) % 100)!=0)&&((n/10) % 100)<10){
				a.printWord(((n / 1000) % 100), " thousand and");
			} else if((((n / 1000) % 10)<10)&&((n / 1000) % 10)!=0){
				a.printWord(((n / 1000) % 100), " thousand,");
			} else {
				a.printWord(((n / 1000) % 100), " thousand");
			}
		}
		if(((n / 100) % 10)!=0){
			if((((n/10) % 10)>=0)&&(((n/10) % 10)<10)){
				a.printWord(((n / 100) % 10), " hundred and");
			} else if(((n/10)%10)==0){
				a.printWord(((n / 100) % 10), " hundred");
			}
		}

		a.printWord((n % 100), "");
	}
}
