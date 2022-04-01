import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        NewArrayList<String> myArrayList = new NewArrayList(); /* Создаем новую коллекцию Strings */
        myArrayList.add("cat"); /* Добавляем элементы */
        myArrayList.add("dog");
        myArrayList.add("duck");
        myArrayList.add("bird");
        myArrayList.add("leon");
        myArrayList.update(2, "tiger"); /* Изменяем элемент */
        myArrayList.delete(1); /* Удаляем элемент */

        System.out.println((String)myArrayList.get(2)); /* Получаем нужный элемент */
        System.out.println(myArrayList.size()); /* Размер наших элементов */

        String[] myArrayStrings = new String[]{"cat", "dog", "duck", "bird", "leon"}; /* Создаем массив элементов  */
        NewSort<String> mySortString = new NewSort();
        mySortString.quickSort(myArrayStrings, 0, myArrayStrings.length - 1);
        System.out.println(Arrays.toString(myArrayStrings)); /* Выводим список отсортированных элементов  */

        Double[] myArrayDoubles = new Double[]{0.87D, 0.45D, 1.16D, 0.11D, 0.79D,  }; /* Создаем массив чисел  */
        NewSort<Double> mySortDouble = new NewSort();
        mySortDouble.quickSort(myArrayDoubles, 0, myArrayDoubles.length - 1);
        System.out.println(Arrays.toString(myArrayDoubles)); /* Выводим список отсортированных чисел  */
    }
}
