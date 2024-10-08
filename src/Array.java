public class Array {

    public int findLast (int[] arr, int x){
        for(int i = arr.length -1; i>=0; i--){
            if (arr[i]==x)
                return i;
        }
        return -1;
    }

    public int[]add (int[] arr, int x, int pos){
        if (pos < 0 || pos > arr.length)
            System.out.println("Недопустимая позиция:" + pos);
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < pos; i++){
            newArr[i] = arr[i];
        }
        newArr[pos]=x;
        for (int i = pos; i< arr.length; i++){
            newArr[i+1]= arr[i];
        }
        return newArr;
    }

    public static void reverse(int[] arr){
        int left = 0; // Указатель на начало массива
        int right = arr.length - 1; // Указатель на конец массива

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            // Сдвигаем указатели
            left++;
            right--;
        }
    }

    public int[] contact(int[]arr1, int[] arr2){
        int[] newArr = new int[arr1.length + arr2.length];

        // Копируем элементы 1 массива
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        // Копируем элементы 2 массива
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }
        return newArr;
    }

    public int[] deleteNegative (int[] arr){
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
        }

        // Создаем новый массив для положительных элементов
        int[] newArr = new int[count];
        int index = 0;

        // Заполняем новый массив только с полож. элементами
        for (int num : arr) {
            if (num >= 0) {
                newArr[index] = num;
                index++;
            }
        }
        return newArr;
    }
}
