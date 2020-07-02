import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ArrayListDemoTest {

    @Test
    public void whenEmpty(){
        MyArrayList<Object> list = new MyArrayList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void whenNotEmpty(){
        MyArrayList<Object> list = new MyArrayList<>();
        list.add(new Object());
        assertFalse(list.isEmpty());
    }

    @Test
    public void returnSize(){
        MyArrayList<Object> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        assertEquals(2,list.size());
    }

    @Test
    public void givenListWithAnElement_whenGet_thenThatElementIsReturned() {
        MyArrayList<Object> list = new MyArrayList<>();
        list.add("hello");
        Object element = list.get(0);
        assertEquals("hello",element);
    }

}
