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

    public boolean addBook(Book book) {
        if (countBooks >= CAPACITY) {
            return false;
        }
        books[countBooks] = book;
        int length = books[countBooks].getLength();
        if (maxLength < length) {
            maxLength = length;
        }
        countBooks++;
        return true;
    }

    public Book findBook(String title) {
        int index = findIndex(title);
        return (index == -1) ? null : books[index];
    }

    public boolean removeBook(String title) {
        int index = findIndex(title);
        if (index != -1) {
            int length = books[index].getLength();
            if (index + 1 == countBooks) {
                clearShelf(index);
            } else {
                System.arraycopy(books, index + 1, books, index, countBooks - (index + 1));
            }
            countBooks--;
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
            clearShelf(i);
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

    private void clearShelf(int number) {
        books[number] = null;
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