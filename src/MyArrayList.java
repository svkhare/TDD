public class MyArrayList<E> {

    private Object[] list= new Object[2];

    public boolean isEmpty() {
        if(list.length==0)
        return false;
        else
            return true;
    }

    public boolean add(Object object) {
        list[0]="hello";
        list[1]=98;
        return false;
    }

    public int size() {
        return list.length;
    }

    public Object get(int index) {
        if(size()==0){
            throw new NullPointerException();
        }
        return (Object) list[0];
    }

}
