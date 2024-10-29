// Solution 1

class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                insertZero(arr, i+1);
                i++;
            }
        }
    }
    public void insertZero(int[] arr, int index){
        for(int i = arr.length-1 ; i > index ; i--){
            arr[i] = arr[i-1];
        }
        if(index < arr.length){
            arr[index] = 0;
        }
    }
}

// Solution 2

class Solution {
    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        int count = 0;
        int index = len - 1;

        for (int i = 0; i < len; i++) {
            count += (arr[i] == 0) ? 2 : 1;
            if (count >= len) {
                index = i;
                break;
            }
        }

        int temp = 0;
	
	// handle count > size of array

        if (count > len) {
            arr[len - 1] = 0;
            index--;
            temp = 1;
        }

        for (int i = len - 1 - temp; i >= 0; i--) {
            if (index < 0) break;

            arr[i] = arr[index]; 
            if (arr[index] == 0 && i - 1 >= 0) {
                arr[--i] = 0;
            }
            index--;
        }
    }
}
