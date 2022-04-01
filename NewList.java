
public interface NewList<A> extends Iterable<A> {


    boolean add(A a); /* Метод добавления */

    void delete(int a); /* Метод удаления */

    A get(int a); /* Метод получения нужно элемента */

    int size(); /* Метод получения размера */

    void update(int b, A a); /* Метод изменения элемента */
}
