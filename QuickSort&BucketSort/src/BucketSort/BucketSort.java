package second;

import java.util.ArrayList;
import java.util.List;

public class BucketSort {
	private List<Integer> array = new ArrayList(), rezult = new ArrayList();
	private int numBuckets;
	
	public BucketSort(int mas[]){	//����������� � ������� �������
		for(int i = 0; i < mas.length; i++)
			array.add(mas[i]);
		numBuckets = mas.length;
	}
	
	public BucketSort(int n){		//����������� � ����� ����� ������������ ����������� ����������
		numBuckets = n;
		for(int i = 0; i < n; i++) {
			array.add((int)(Math.random() * n));
		}
	}
	
	public BucketSort(int kol, boolean otsort){		//����� ������������ ����������� ���������� � �����������/���������� �������
		numBuckets = kol;
		if(otsort == true) {
			for(int i = 0; i < kol; i++) {
				array.add(i);
			}
		}else {
			for(int i = 0; i < kol; i++) {
				array.add(kol - i);
			}
		}
	}
	
	public void display() {		//���� ����������� ������
		for(int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i) + " ");
		}
		System.out.print("\n");
	}
	
	public void displayRez() {		//���� ������������� ������ 
		for(int i = 0; i < rezult.size(); i++) {
			System.out.print(rezult.get(i) + " ");
		}
		System.out.print("\n");
	}
	
	public void startSort() {		//������� ����������
		bucketSort(array, minimum(array), maximum(array));
		
	}
	
	public void enter(List<Integer> l) {		
		if(l != null) {
			for(int i = 0; i < l.size(); i++) {		//��������� ������������ �������� � ������������ �����
				rezult.add(l.get(i));
			}
		}
	}
	
	public int minimum(List<Integer> l) {	//������� ��������� ������� ������
		int min = l.get(0);
		for(int i = 0; i < l.size(); i++) {
			if(l.get(i) < min) min = l.get(i);
		}
		return min;
	}
	
	public int maximum(List<Integer> l) { //������� ������������ ������� ������
		int max = l.get(0);
		for(int i = 1; i < l.size(); i++) {
			if(l.get(i) > max) max = l.get(i);
		}
		return max;
	}
	
	 public List<Integer> bucketSort(List<Integer> arr, int min, int max) {		//������� ����������
		if(arr.size() < 2 || min == max) {		//�������� �� ����� ���������� ������
			return arr;
		}
		List<Integer> buckets[] = new ArrayList[numBuckets];
	    for (int i = 0; i < arr.size(); i++) {		//�������� �������� � ������ 
	    	int temp = Math.abs((int)((arr.get(i) - min) * numBuckets) / (max - min));
	        if(temp >= numBuckets) temp = numBuckets - 1;
	        if (buckets[temp] == null) {		//���� � ������ ���� ��������, ��������� ����
	            buckets[temp] = new ArrayList<Integer>();
	        }
	        buckets[temp].add(arr.get(i));
	    }
	    // ������� �������� ����� ������
	    for (int j = 0; j < numBuckets; j++) {
	        if(buckets[j] != null) {
	        	buckets[j] = bucketSort(buckets[j], minimum(buckets[j]), maximum(buckets[j]));
	        	enter(buckets[j]);        // �������� �������� � ������������ �����
	        }
	    }
	    return null; 	//����� � ������� ����������
	}
}
