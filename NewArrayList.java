import java.util.Iterator;

public class NewArrayList<A> implements NewList<A> {

    private A[] values = (A[]) new Object[0];

    public NewArrayList() {
    }

    public boolean add(A a) {
        try {
            A[] temp = this.values;
            this.values = (A[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, this.values, 0, temp.length); /* Копируем наш массив в новый массив  */
            this.values[this.values.length - 1] = a;
            return true;
        } catch (ClassCastException exception) {
            exception.printStackTrace();
            return false;
        }
    }

    public void delete(int index) {
        try {
            A[] temp = this.values;
            this.values = (A[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, this.values, 0, index); /* Копируем часть нашего массива в новый массив  */
            int amountElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, this.values, index, amountElementsAfterIndex); /* Копируем вторую часть массива в новый массив  */
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }

    }

    public A get(int index) {
        return this.values[index];
    }

    public int size() {
        return this.values.length;
    }

    public void update(int index, A a) {
        this.values[index] = a;
    }

    public Iterator<A> iterator() {
        return new MyIterator(this.values);
    }
}