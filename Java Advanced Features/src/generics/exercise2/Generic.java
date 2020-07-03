package generics.exercise2;

// Create a simple Generic class, that will give
// a possibility to store any kind of value within.

public class Generic<E, T, N> {

    private Object[] arrayOfObjects;

    public Object[] getArrayOfObjects() {
        return arrayOfObjects;
    }

    public void setArrayOfObjects(E obj1, T obj2, N obj3) {
        arrayOfObjects = new Object[3];
        arrayOfObjects[0] = obj1;
        arrayOfObjects[1] = obj2;
        arrayOfObjects[2] = obj3;
    }
}