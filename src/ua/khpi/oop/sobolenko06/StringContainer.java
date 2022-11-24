package ua.khpi.oop.sobolenko06;


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
    
    /**
     * Sort array with Bubble method
     */
    public void sort() {
    	for (int i = 0; i < array.length - 1; i++){
			for (int j = 0; j < array.length - i - 1; j++) {
    			if(stringCompare(array[j], array[j + 1])) {
    				String temp = array[j];
    				array[j] = array[j + 1];
    				array[j + 1] = temp;
    			}
    		}
    	}
    }
    
    /**
     * Check if str1 greater than str2
     * 
     * @param str1 first string
     * @param str2 second string
     * @return result of check
     */
    private static boolean stringCompare(String str1, String str2) {
  
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);
  
        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);
  
            if (str1_ch != str2_ch) {
                return (str1_ch - str2_ch) > 0;
            }
        }
 
        if (l1 != l2) {
            return (l1 - l2) > 0;
        }
        
        return false;
    }
    
    /**
     * Get index of element
     * 
     * @param string value to find
     * @return index
     */
    public int lookFor(String string) {
    	for (int i = 0; i < array.length; i++) {
    		if (array[i] == string) {
    			return i;
    		}
    	}
    	return -1;
    }
}
