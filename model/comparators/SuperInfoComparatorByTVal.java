package model.comparators;

import model.SuperInfo;

import java.util.Comparator;

public class SuperInfoComparatorByTVal implements Comparator<SuperInfo> {

    int direction;

    public SuperInfoComparatorByTVal(boolean direction) {
      this.direction = direction?1:-1;
    }

    public SuperInfoComparatorByTVal() {
    }

    @Override
    public int compare(SuperInfo superinfo1, SuperInfo superinfo2) {
        return superinfo1.gettVal().compareTo(superinfo2.gettVal())*direction;
    }
}
