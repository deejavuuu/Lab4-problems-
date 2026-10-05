package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int numIntegers;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        numIntegers = list.length;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;

    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<numIntegers; i++)
            System.out.println(i + ":\t" + list[i]);
    }


    public int[] increaseSize(){
        return new int[list.length*2];
    }

    public void addElement( int newVal){
        if(numIntegers == list.length){
            int[] newList = this.increaseSize();
            for(int i = 0; i<list.length;i++){
                newList[i] = list[i];
            }
            list = newList;
        }
        list[numIntegers] = newVal;
        numIntegers++;

    }

    public void removeFirst(int newVal){
        int index = -1;
        for(int i = 0; i< numIntegers; i++){
            if(newVal == list[i]){
                index = i;
                break;
            }
        }
        if(index >= 0){
            for(int i = index; i<numIntegers-1;i++){
                list[i] = list[i+1];
            }
            numIntegers--;
        }
    }


    public void removeAll(int newVal){
        int occur = 0;
        for(int i =0; i<numIntegers;i++){
            if(list[i] == newVal){
                occur++;
            }
        }
        for(int i = 0; i<occur;i++){
            removeFirst(newVal);
        }
    }





}