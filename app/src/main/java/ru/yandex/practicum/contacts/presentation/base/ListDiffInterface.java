package ru.yandex.practicum.contacts.presentation.base;
    //Шаг 1 +
public interface ListDiffInterface<T> {
    boolean theSameAs(T o);

    @Override
    boolean equals(Object o);

}
