package ua.khpi.oop.sobolenko06;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * Task: rewrite program using built-in libraries and add some methods
 * 
 * @author Sergey Sobolenko, KN-921v
 * @version 1.0
 */

public class Main {
	public static void main(String[] args) {
		
		ArrayList<String> container = new ArrayList<> ();
        
        container.add(new String("aaa"));
        container.add(new String("bbb"));
        container.add("ccc");
        System.out.println(container);
        System.out.println(container.size());
        System.out.println("---");
        
        container.clear();
        System.out.println(container);
        System.out.println(container.size());
        System.out.println("---");
        
        container.add("AAA");
        container.add("BBB");
        container.add("CCC");
        System.out.println(container.contains("AAA"));
        System.out.println(container);
        System.out.println("---");
                
        Iterator<String> iterator = container.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        System.out.println("---");
        
        for (String element : container) {
            System.out.println(element);
        }
        System.out.println("---");
        
        iterator = container.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element == "BBB") {
            	iterator.remove();
            }
        }
        System.out.println(container);
        System.out.println(container.size());
        System.out.println("---");
        
        StringContainer container2 = new StringContainer();
        container2.add("CCC");
        container2.add("BBB");
        System.out.println(container2);
        container2.sort();
        System.out.println(container2);
        System.out.println("---");
        
        System.out.println(container2.lookFor("CCC"));
    }
}
