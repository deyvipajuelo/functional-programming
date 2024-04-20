package superfunctions.v3_genericos.interfaces;

public interface Reducer<T, R, V> {
    V reduce(T numberOne, R numberTwo);
}
