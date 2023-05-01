package com.CFWVectorlist;

import java.util.Vector;

public class Vector_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector V=new Vector();
		System.out.println("Before Adding Vector: "+ V);
		V.add("Hyderabad");
		V.add("Secendrabad");
		V.add("Mumbai");
		V.add("Banglore");
		V.add("Delhi");
		System.out.println("After Adding Vector: "+ V);
		//	public synchronized void trimToSize();
		V.trimToSize();
		System.out.println("Vector Tirmsize is: "+V);
		//	public synchronized void ensureCapacity(int);
		V.ensureCapacity(0);
		System.out.println("Minimum capacit of vectorlist 0 is :"+V);
		//  public synchronized void setSize(int);
		V.setSize(6);
		System.out.println("Vector list setSize 6 is: "+V);
		//  public synchronized int capacity();
		System.out.println("Capacity of vector list is: "+V.capacity());
		//  public synchronized int size();
		System.out.println("Size of vectorlist is: "+V.size());;
		//  public synchronized boolean isEmpty();
		System.out.println("Vector is Empty: "+V.isEmpty());
		//  public java.util.Enumeration<E> elements();
		System.out.println("Elements in list is: "+V.elements());;
		//  public boolean contains(java.lang.Object);
		Boolean re1=V.contains("Hyderabad");
		System.out.println("Hyderabad contains in list: "+re1);
		Boolean re2=V.contains("Kolkata");		
		System.out.println("Kolkata contains in list: "+re2);
		//  public int indexOf(java.lang.Object);
		//  public synchronized int indexOf(java.lang.Object, int);
		//  public synchronized int lastIndexOf(java.lang.Object);
		//  public synchronized int lastIndexOf(java.lang.Object, int);
		System.out.println("Index of Dehil in list is: "+V.indexOf("Delhi"));;
		System.out.println(V.indexOf("Hyderabad", 3));
		System.out.println(V.lastIndexOf(V));;
		//	public synchronized E elementAt(int);
		Vector con=new Vector();
		con.add("India");
		con.add("Australia");
		con.add("US");
		con.add("England");
		con.add("Paris");
		con.add("Porchugal");
		System.out.println("Country list: "+con);
		System.out.println("Country at Index elementAt(0) is: "+con.elementAt(0));;
		//  public synchronized E firstElement();
		System.out.println("First element of the list is: "+con.firstElement());;
		//  public synchronized E lastElement();
		System.out.println("Last element of the list is: "+con.lastElement());
		//  public synchronized void setElementAt(E, int);
		con.setElementAt("Italy", 5);
		System.out.println(con);
		//  public synchronized void removeElementAt(int);
		con.removeElementAt(3);
		System.out.println("After removeElementAt(3) England :  "+con);
		//  public synchronized void insertElementAt(E, int);
		con.insertElementAt("Germany", 3);
		System.out.println("After Inserting Germany: "+con);
		//  public synchronized void addElement(E);
		con.addElement("Spain");
		System.out.println("After adding country is: "+con);
		//  public synchronized boolean removeElement(java.lang.Object);
		System.out.println("Remove US from list: "+con.removeElement("US"));
		System.out.println("After Removing: "+con);
		//  public synchronized void removeAllElements();
		con.removeAllElements();
		System.out.println("After removeAllElements from list: "+con);
	}

}
/*
  protected java.lang.Object[] elementData;
  protected int elementCount;
  protected int capacityIncrement;
  public java.util.Vector(int, int);
  public java.util.Vector(int);
  public java.util.Vector();
  public java.util.Vector(java.util.Collection<? extends E>);
  public synchronized void copyInto(java.lang.Object[]);
  public synchronized void trimToSize();
  public synchronized void ensureCapacity(int);
  public synchronized void setSize(int);
  public synchronized int capacity();
  public synchronized int size();
  public synchronized boolean isEmpty();
  public java.util.Enumeration<E> elements();
  public boolean contains(java.lang.Object);
  public int indexOf(java.lang.Object);
  public synchronized int indexOf(java.lang.Object, int);
  public synchronized int lastIndexOf(java.lang.Object);
  public synchronized int lastIndexOf(java.lang.Object, int);
  public synchronized E elementAt(int);
  public synchronized E firstElement();
  public synchronized E lastElement();
  public synchronized void setElementAt(E, int);
  public synchronized void removeElementAt(int);
  public synchronized void insertElementAt(E, int);
  public synchronized void addElement(E);
  public synchronized boolean removeElement(java.lang.Object);
  public synchronized void removeAllElements();
  public synchronized java.lang.Object clone();
  public synchronized java.lang.Object[] toArray();
  public synchronized <T> T[] toArray(T[]);
  E elementData(int);
  static <E> E elementAt(java.lang.Object[], int);
  public synchronized E get(int);
  public synchronized E set(int, E);
  public synchronized boolean add(E);
  public boolean remove(java.lang.Object);
  public void add(int, E);
  public synchronized E remove(int);
  public void clear();
  public synchronized boolean containsAll(java.util.Collection<?>);
  public boolean addAll(java.util.Collection<? extends E>);
  public boolean removeAll(java.util.Collection<?>);
  public boolean retainAll(java.util.Collection<?>);
  public boolean removeIf(java.util.function.Predicate<? super E>);
  public synchronized boolean addAll(int, java.util.Collection<? extends E>);
  public synchronized boolean equals(java.lang.Object);
  public synchronized int hashCode();
  public synchronized java.lang.String toString();
  public synchronized java.util.List<E> subList(int, int);
  protected synchronized void removeRange(int, int);
  public synchronized java.util.ListIterator<E> listIterator(int);
  public synchronized java.util.ListIterator<E> listIterator();
  public synchronized java.util.Iterator<E> iterator();
  public synchronized void forEach(java.util.function.Consumer<? super E>);
  public synchronized void replaceAll(java.util.function.UnaryOperator<E>);
  public synchronized void sort(java.util.Comparator<? super E>);
  public java.util.Spliterator<E> spliterator();
  void checkInvariants();
}

 
*/