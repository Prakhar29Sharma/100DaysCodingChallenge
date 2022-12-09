package array;

public class Duplicate {
    public static void findDuplicate(int arr[]) {

        int i, j, counter;
        int visited[] = new int[arr.length];
        int d = 0;

        for(i = 0; i < arr.length; i++) {

            boolean isVisited = false;
            int current = arr[i];

            for(j = 0; j <= d; j++) {
                if(current == visited[j]) {
                    isVisited = true;
                }
            }

            if(!isVisited) {
                d++;
                visited[d] = current;
                counter = 0;
                for(int k = 0; k < arr.length; k++) {
                    if(current == arr[k]) {
                        counter+=1;
                    }
                }
                if(counter >= 2) {
                    System.out.printf("%d is a duplicate!, repeated %d times", current, counter);
                    System.out.println("");
                } else {
                    System.out.printf("%d is not a duplicate!\n", current);
                }
            }
        }
    }

    public static int[] removeDuplicates(int arr[]) {
        if(arr.length <= 1) {
            return arr;
        } else {
            int visited[] = new int[arr.length];
            int k = 0;

            for(int i = 0; i < arr.length; i++) {
                int current = arr[i];
                boolean isVisited = false;
                for(int j = 0; j < k; j++) {
                    if(visited[j] == current) {
                        isVisited = true;
                    }
                }
                if(!isVisited) {
                    visited[k] = current;
                    k++;
                }
            }

            int temp[] = new int[k];
            for(int i = 0; i < k; i++) {
                temp[i] = visited[i];
            }

            return temp;
        }
    }

    public static void display(int array[]) {
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("");
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,2,4,1,2,3,4,5,6,7,8};
        findDuplicate(arr);
        int array[] = removeDuplicates(arr);
        display(array);

    }
}
