package com.github.jdo;

import java.util.List;

/**
 *
 * MColumnDescriptor.
 * A wrapper around a list of columns.
 */
public class MColumnDescriptor {
    private List<MFieldSchema> cols;

    public MColumnDescriptor() {}

    /**
     *
     * @param cols
     */
    public MColumnDescriptor(List<MFieldSchema> cols) {
        this.cols = cols;
    }

    public List<MFieldSchema> getCols() {
        return cols;
    }

    public void setCols(List<MFieldSchema> cols) {
        this.cols = cols;
    }
}
