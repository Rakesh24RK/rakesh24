package com.ty;

import java.util.Comparator;

public class Id implements Comparator<Book>{
	public int compare(Book o1, Book o2) {

		return o1.getId().compareTo(o2.getId());
	}


}
