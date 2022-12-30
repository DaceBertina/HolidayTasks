package holiday.tasks;

public class MergeSort {

    private int [] sortArray;
    private int [] tempMergArr;
    private int length;

    public static void main (String [] args) {

        int [] myArr = {2, 25, 26, 27, 28, 47, 4, 6, 9, 14, 18, 23,};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(myArr);
        System.out.println("\nMergeSort work: ");
        for (int i : myArr) {
            System.out.print(i + " ");
        }
    }
    int [] sort(int [] myArr) {
        this.sortArray = myArr;
        this.length = myArr.length;
        this.tempMergArr = new int[length];
        myArr = doMergeSort(0, length - 1);
        return myArr;
    }

    int [] doMergeSort(int lowerIndex, int higherIndex) {
        int [] arrayToBeMerged = new int[0];
        if(lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle+1, higherIndex);
            arrayToBeMerged = mergeParts(lowerIndex, middle, higherIndex);
        }
        return arrayToBeMerged;
    }

    int [] mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = sortArray[i];
        }

        int i = lowerIndex; //tempMergArr
        int j = middle + 1;
        int k = lowerIndex; //sortArray
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                sortArray[k] = tempMergArr[i];
                i++;
            } else {
                sortArray[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            sortArray[k] = tempMergArr[i];
            k++;
            i++;
        }
        return sortArray;
    }
}
