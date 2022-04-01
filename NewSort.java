public class NewSort<A extends Comparable<? super A>> {
    public NewSort() {
    }

    public void quickSort(A[] array, int startIndex, int endIndex) { /* Сортировка нашего массива  */
        if (startIndex < endIndex) {
            int wallIndex = this.part(array, startIndex, endIndex);
            this.quickSort(array, startIndex, wallIndex);
            this.quickSort(array, wallIndex + 1, endIndex);
        }

    }

    public int part(A[] array, int startIndex, int endIndex) {
        int wallIndex = (startIndex + endIndex) / 2;
        A wallValue = array[wallIndex];
        --startIndex;
        ++endIndex;

        while (true) {
            do {
                ++startIndex;
            } while (array[startIndex].compareTo(wallValue) < 0);

            do {
                --endIndex;
            } while (array[endIndex].compareTo(wallValue) > 0);

            if (startIndex >= endIndex) {
                return endIndex;
            }

            A temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
        }
    }
}