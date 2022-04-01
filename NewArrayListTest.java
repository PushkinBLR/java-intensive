import static org.junit.jupiter.api.Assertions.*;

class NewArrayListTest {


    @org.junit.jupiter.api.Test
    void add() {
        NewArrayList newArrayList = new NewArrayList();

        newArrayList.add("leon");

        assertEquals(true, newArrayList.add(0));

    }

    @org.junit.jupiter.api.Test
    void delete() {
        NewArrayList newArrayList = new NewArrayList();
        newArrayList.add("leon");
        newArrayList.add("tiger");
        newArrayList.add("dog");

        newArrayList.delete(1);

        assertEquals(2, newArrayList.size());

    }

    @org.junit.jupiter.api.Test
    void get() {
        NewArrayList newArrayList = new NewArrayList();
        newArrayList.add("leon");
        newArrayList.add("tiger");
        newArrayList.add("dog");

        newArrayList.get(2);

        assertEquals("dog", newArrayList.get(2));
    }

    @org.junit.jupiter.api.Test
    void size() {
        NewArrayList newArrayList = new NewArrayList();
        newArrayList.add("leon");
        newArrayList.add("tiger");
        newArrayList.add("dog");

        newArrayList.size();

        assertEquals(3, newArrayList.size());
    }

    @org.junit.jupiter.api.Test
    void update() {
        NewArrayList newArrayList = new NewArrayList();
        newArrayList.add("leon");
        newArrayList.add("tiger");
        newArrayList.add("dog");

        newArrayList.update(1, "cat");

        assertEquals("cat", "cat");
    }


}