package io.sandromax.domain.misc;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestField {
    public static void main(String[] args) {
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll("House", "Yard", "+");
        System.out.println("sorted: " + list.sorted());
        System.out.println("after sorted: " + list);


        list.remove("+");
        System.out.println("after remove: " + list);
        list.add("+");
        System.out.println("after add: " + list);

        System.out.println(list);
    }
}
