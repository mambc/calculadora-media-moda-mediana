package br.com.codenation;

import java.util.Arrays;

public class StatisticUtil {

	public static int average(int[] elements) {
		Integer soma = 0;
		for (int num:elements) {
			soma += num;
		}
		return soma/elements.length;
	}

	public static int mode(int[] elements) {
		int indexModa = 0;
		int maiorFrequencia = 0;
		int ocorrencias[] = new int[elements.length];

		for(int i=0; i<elements.length; i++){
			for(int j=0; j<elements.length; j++){
				if(elements[i]==elements[j]){
					ocorrencias[i]++;
				}
			}
		}
		for(int i=0; i<elements.length; i++){
			if (ocorrencias[i]>maiorFrequencia){
				indexModa = i;
				maiorFrequencia = ocorrencias[i];
			}
		}
		return elements[indexModa];
	}

	public static int median(int[] elements) {
		Arrays.sort(elements);
		if(elements.length % 2 != 0){
			return elements[(int)Math.floor(elements.length/2)];
		} else{
			return Math.round((elements[elements.length/2] + elements[elements.length/2 -1])/2);
		}
		
	}
}