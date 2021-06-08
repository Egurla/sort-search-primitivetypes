package com.nisum.customarraylist;

public class CustomArrayList_Test {
	public static void main(String[] args) {
		
	
	CustomArrayList<Integer> list = new CustomArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(3);
    list.add(4);

   
    System.out.println( list.get(6));
    
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(1);
    list.add(2);
    
    list.display();
    System.out.println("\n element at index in customarraylist > " + 1 + " = " + list.get(1));

    //Remove element
    System.out.println("element removed from index " + 1 + " = "
                 + list.remove(1));

    //Again display custom ArrayList
    System.out
            .println("\nlet's display custom ArrayList again after removal at index 1");

    list.display();
}
}


