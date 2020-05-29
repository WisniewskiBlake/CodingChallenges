package DesignHashmap;

import java.util.LinkedList;
import java.util.List;

public class Bucket {
    private List<Pair<Integer, Integer>> bucket;

    public Bucket() {
        this.bucket = new LinkedList<Pair<Integer, Integer>>();
    }
}
