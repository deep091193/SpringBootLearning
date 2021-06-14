package com.test;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {

	Enumeration enume;
	
	
	public EnumerationIterator(Enumeration enume) {
		super();
		this.enume = enume;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enume.hasMoreElements();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return enume.nextElement();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
