package DesignHashmap;

import java.util.LinkedList;
import java.util.List;

public class Bucket {
    private List<Pair<Integer, Integer>> bucket;

    public Bucket() {
        this.bucket = new LinkedList<Pair<Integer, Integer>>();
    }

    public Integer get(Integer key) {
        for (Pair<Integer, Integer> pair : this.bucket) {
            if (pair.first.equals(key))
                return pair.second;
        }
        return -1;
    }
}
