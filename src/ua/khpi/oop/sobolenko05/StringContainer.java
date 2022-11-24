package ua.khpi.oop.sobolenko05;

import java.util.Arrays;
import java.util.Iterator;

class StringContainer implements Iterable<String> {
	/**
	 * Array of strings
	 */
    private String[] array = new String[0];
    
    /**
     * Convert array to string
     */
    @Override
    public String toString() {
        return Arrays.toString(array);
    }
    
    /**
     * Add an element to the end of the container
     * @param element value of new element
     */
    public void add(String element) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
    }
    
    /**
     * Clear container
     */
    public void clear() {
        array = new String[0];
    }
    
    /**
     * Remove the first element with given value
     * 
     * @param string element to remove
     * @return removed element
     */
    public String remove(String string) {
    	int index = -1;
    	
    	for (int i = 0; i < array.length; i++) {
    		if (array[i] == string) {
    			index = i;
    			break;
    		}
    	}
    	
        String[] newArray = new String[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, newArray.length - index);
        String removed = array[index];
        array = newArray;
        return removed;
    }
    
    /**
     * Get array of the container
     * 
     * @return array of strings
     */
    public String[] toArray() {
    	return array;
    }
    
    /**
     * Size of array
     * @return
     */
    public int size() {
        return array.length;
    }

    /**
     * Check if element with given value exists in container
     * 
     * @param string given value
     * @return result of check
     */
    public boolean contains(String string) {
    	for (int i = 0; i < array.length; i++) {
    		if (array[i] == string) {
    			return true;
    		}
    	}
    	return false;
    }
    
    /**
     * Check if container has all elements as in given container
     * 
     * @param container given container
     * @return result of check
     */
    public boolean containsAll(StringContainer container) {
    	String[] tempArray = container.toArray();
    	
    	for (int i = 0; i < container.size(); i++) {
    		if (!contains(tempArray[i])) {
    			return false;
    		}
    	}
    	return true;
    }
    
    @Override
    public Iterator<String> iterator() {
        return new StringArrayIterator();
    }
    
    private class StringArrayIterator implements Iterator<String> {
        int cursor = 0;
        String lastRet = "";
        
        @Override
        public boolean hasNext() {
            return cursor < array.length;
        }
        
        @Override
        public String next() {
        	lastRet = array[cursor];
            return array[cursor++];
        }
        
        public void remove() {
            StringContainer.this.remove(lastRet);
            cursor--;
            lastRet = "";
        }
    }
}
