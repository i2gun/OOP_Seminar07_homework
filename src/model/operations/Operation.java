package model.operations;

public interface Operation<T> {
    T execute(T num1, T num2);
}