package _01_Custom_ArrayList;

import java.awt.List;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	T[] arr;
	public ArrayList() {
	 	arr = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		if (loc < 0 || loc >= arr.length) throw new IndexOutOfBoundsException();
		return arr[loc];
	}
	
	public void add(T val) {
		T[] arr2 = (T[]) new Object[arr.length + 1];
		for (int i = 0; i < arr.length; i++)
		{
			arr2[i] = arr[i];
		}
		arr2[arr.length] = val;
		arr = arr2;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if (loc < 0 || loc >= arr.length) throw new IndexOutOfBoundsException();
		T[] arr2 = (T[]) new Object[arr.length + 1];
		for (int i = 0; i < arr2.length; i++)
		{
			if (i < loc)
			{
				arr2[i] = arr[i];
			}
			else if (i == loc)
			{
				arr2[i] = val;
			}
			else
			{
				arr2[i] = arr[i - 1];
			}
		}
		arr = arr2;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		if (loc < 0 || loc >= arr.length) throw new IndexOutOfBoundsException();
		T[] arr2 = (T[]) new Object[arr.length];
		for (int i = 0; i < arr2.length; i++)
		{
			if (i == loc)
			{
				arr2[i] = val;
			}
			else
			{
				arr2[i] = arr[i];
			}
		}
		arr = arr2;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		if (loc < 0 || loc >= arr.length) throw new IndexOutOfBoundsException();
		T[] arr2 = (T[]) new Object[arr.length - 1];
		for (int i = 0; i < arr.length; i++)
		{
			if (i < loc)
			{
				arr2[i] = arr[i];
			}
			else if (i == loc){ }
			else
			{
				arr2[i - 1] = arr[i];
			}
		}
		arr = arr2;
	}
	
	public boolean contains(T val) {
		for (T a : arr)
		{
			if (a == val) return true;
		}
		return false;
	}

	public int size() {
		return arr.length;
	}
}