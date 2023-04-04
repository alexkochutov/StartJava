package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    public final static int CAPACITY = 10;

    private final Book[] books = new Book[CAPACITY];
    private int countBooks;
    private int maxLength;

    public int getCountBooks() {
        return countBooks;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public boolean add(Book book) {
        if (countBooks >= CAPACITY) {
            return false;
        }
        books[countBooks] = book;
        countBooks++;
        calcMaxLength();
        return true;
    }

    public Book find(String title) {
        int index = findIndex(title);
        return (index > -1) ? books[index] : null;
    }

    public boolean remove(String title) {
        int index = findIndex(title);
        if (index > -1) {
            int length = books[index].getLength();
            countBooks--;
            System.arraycopy(books, index + 1, books, index, countBooks - index);
            books[countBooks] = null;
            if (maxLength == length) {
                calcMaxLength();
            }
            return true;
        }
        return false;
    }

    public Book[] getAllBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    public int getEmptyShelves() {
        return CAPACITY - countBooks;
    }

    public boolean clearShelves() {
        if (countBooks == 0) {
            return false;
        }
        for (int i = 0; i < countBooks; i++) {
            books[i] = null;
        }
        countBooks = 0;
        maxLength = 0;
        return true;
    }

    private int findIndex(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    private void calcMaxLength() {
        maxLength = 0;
        for (int i = 0; i < countBooks; i++) {
            if (maxLength < books[i].getLength()) {
                maxLength = books[i].getLength();
            }
        }
    }
}