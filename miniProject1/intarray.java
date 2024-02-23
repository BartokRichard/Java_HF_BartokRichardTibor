package miniProject1;

public class intarray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,2,3,4};
        int[] array3 = {4,5,6,7};
         
        arrayEqual(array1, array2);
        arrayEqual(array1, array3);
        arrayEqual(array2, array3);
    
    }
    public static void arrayEqual(int[] arr1, int[] arr2) {
        boolean isEqual = true; 
    
        if (arr1.length != arr2.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isEqual = false;
                    break; 
                }
            }
        }
    
        if (isEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
    
}
