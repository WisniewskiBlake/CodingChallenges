package DesignHashmap;

import java.util.ArrayList;
import java.util.List;

public class DesignHashmap {
    private int key_space;
    private List<Bucket> hash_table;

    public DesignHashmap() {
        this.key_space = 2069;
        this.hash_table = new ArrayList<Bucket>();
        for (int i = 0; i < this.key_space; ++i) {
            this.hash_table.add(new Bucket());
        }
    }

}
