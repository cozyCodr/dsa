package codewithbright.Array;

import java.util.ArrayList;

public class Array {

    private int length;
    private int[] items;
    private int count;

    public Array(){}

    public Array(int length){
        this.items = new int[length];
    }

    public void insert(int item){
        //if items if full resize it
        if (items.length == count){
            //Create a new array (twice the size)
            int[] increaseItems = new int[count * 2];

            //Copy all items to this new array
            for(int x = 0; x < count; x++){
                increaseItems[x] = items[x];
            }

            //Set items to Increased Array
            items = increaseItems;
        }

        //Add the new item to the end
        items[count++] = item;
    }

    public void removeAt(int index){
        // Validate index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++){
            items [i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item){
        for (int i=0; i < count; i++){
            if (items[i] == i)
                return i;
        }
        return -1;
    }

    public void print(){
        for(int x = 0; x < count; x++){
            System.out.println(items[x]);
        }
    }
}
