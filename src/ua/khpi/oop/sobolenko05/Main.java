package ua.khpi.oop.sobolenko05;

import java.util.Iterator;

/**
 * Task: implement string container
 * 
 * @author Sergey Sobolenko, KN-921v
 * @version 1.0
 *
 */
public class Main {
	
	/**
	 * Entry point
	 * @param args arguments from command line
	 */
    public static void main(String[] args) {
        StringContainer container = new StringContainer();
        
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
        
        StringContainer container2 = new StringContainer();
        container2.add("BBB");
        container2.add("CCC");
        System.out.println(container.containsAll(container2));
        System.out.println(container2.containsAll(container));
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
    }
}