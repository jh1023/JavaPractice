package com.jh.algo;

public class FArrayList<T> implements FList {
	
	private Object[] array;
	
	public FArrayList() {
		array = new Object[0];
	}
	
	@Override
	public void add(Object v) {
		int size = size();		
		Object[] temp = array;		
		
		array = new Object[size + 1];		
		for(int i=0; i<temp.length; i++) {
			array[i] = temp[i];
		}
		
		array[temp.length] = v;	
	}
	
	@Override
	public T get(int idx) {	
		return (T)array[idx];
	}	

	@Override
	public int size() {		
		return array.length;
	}

	@Override
	public void remove(int idx) {
		Object[] temp = array;
		
		array = new Object[size() - 1];
		
		for(int i=0; i<idx; i++) {
			array[i] = temp[i];
		}
		
		for(int i=idx+1; i<temp.length; i++) {
			array[i-1] = temp[i];
		}
	}

}
