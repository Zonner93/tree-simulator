package com.example;

public class ConiferousTree extends Tree{


    protected ConiferousTree(int trunk, int branches, int leaves) {
        super(trunk, branches, leaves);
    }

    @Override
    public void grow() {
        int trunk = this.getTrunk();
        int branches = this.getBranches();
        int leaves = this.getLeaves();
        System.out.println("Coniferous tree growing...");

        trunk+=2;
        branches+=2;
        leaves+=10;
        this.setTrunk(trunk);
        this.setBranches(branches);
        this.setLeaves(leaves);
        System.out.println("Trunk size: " + trunk);
        System.out.println("Branches count: "+ branches);
        System.out.println("Leaves count: " + leaves);
    }

    @Override
    public void sheddingLeaves() {
        System.out.println("Coniferous tree shedding leaves");
        int leaves = this.getLeaves();
        leaves *=0.8;
        this.setLeaves(leaves);
        System.out.println("After shedding leaves count: "+ this.getLeaves());
    }


}
