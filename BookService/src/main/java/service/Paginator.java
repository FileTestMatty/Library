package service;

import java.io.Serializable;

public class Paginator implements Serializable {

    int size;
    int page;

    public Paginator() {

    }

    public Paginator ( int size, int page ){

        this.size = size;
        this.page = page;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
