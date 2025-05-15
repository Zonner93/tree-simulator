package com.example;

public abstract class Tree {
    private int trunk;
    private int branches;
    private int leaves;

    public abstract void grow();
    public abstract void sheddingLeaves();

    protected Tree(int trunk, int branches, int leaves) {
        this.trunk = trunk;
        this.branches = branches;
        this.leaves = leaves;
    }

    public int getTrunk() {
        return trunk;
    }

    public void setTrunk(int trunk) {
        this.trunk = trunk;
    }

    public int getBranches() {
        return branches;
    }

    public void setBranches(int branches) {
        this.branches = branches;
    }

    public int getLeaves() {
        return leaves;
    }

    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }
}
