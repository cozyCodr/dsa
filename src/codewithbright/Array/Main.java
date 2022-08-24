package codewithbright.Array;

import codewithbright.Array.Array;

public class Main {
    public static void main(String[] args){
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(12);
        numbers.insert(23);
        numbers.removeAt(2);
        numbers.print();
    }
}
