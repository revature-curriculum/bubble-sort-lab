public class BubbleSort {


    public static Integer[] sort(Integer[] integers){
        boolean swapped = false;

        do{
            swapped = false;
            for(int i=0; i < integers.length - 1; i++){
                if(integers[i] > integers[i+1]){
                    int low = integers[i+1];
                    integers[i+1] = integers[i];
                    integers[i] = low;

                    swapped = true;
                }
            }
        } while(swapped);

        return integers;
    }
}
