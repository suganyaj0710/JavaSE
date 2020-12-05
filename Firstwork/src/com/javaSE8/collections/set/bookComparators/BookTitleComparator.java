package com.javaSE8.collections.set.bookComparators;

import com.javaSE8.collections.set.Book;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.compareTo(o2);
    }
}

