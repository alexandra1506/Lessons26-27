package model.comparators;

import model.SuperInfo;

import java.util.Comparator;

public class SuperInfoComparatorByString implements Comparator<SuperInfo> {

    int direction;

    public SuperInfoComparatorByString(boolean direction) {
        this.direction = direction?1:-1;
    }

    public SuperInfoComparatorByString() {

    }

    @Override
    public int compare(SuperInfo superinfo1, SuperInfo superinfo2) {
        return superinfo1.getString().compareTo(superinfo2.getString())*direction;
    }
}
