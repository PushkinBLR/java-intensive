import java.util.Iterator;

public class MyIterator<A> implements Iterator<A> {
    private int index = 0;
    private A[] values;

    public MyIterator(A[] values) {
        this.values = values;
    }

    public boolean hasNext() {
        return this.index < this.values.length;
    }

    public A next() {
        return this.values[this.index++];
    }
}
