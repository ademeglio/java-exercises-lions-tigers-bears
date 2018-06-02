package org.wecancodeit.exercise.ohmy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class OhMyIterator implements Iterator<String> {

	
	private List<String> animals = new ArrayList<String>();
	int i;
	
	public OhMyIterator() {
		animals.add("lions");
		animals.add("tigers");
		animals.add("bears");
	}
	
	// constructor
	public OhMyIterator(List<String> animals) {
		this.animals = animals;
		i = 0;
	}

	@Override
	public boolean hasNext() {
		return i < animals.size();	
	}

	@Override
	public String next() {
		
		if (!this.hasNext()) {
			throw new NoSuchElementException();
		}
		
		String thisanimal = animals.get(i);
		i++;
		return thisanimal;
	}
}
