package com.example;

public class DeciduousTree extends Tree{

    protected DeciduousTree(int trunk, int branches, int leaves) {
        super(trunk, branches, leaves);
    }

    @Override
    public void grow() {
        int trunk = this.getTrunk();
        int branches = this.getBranches();
        int leaves = this.getLeaves();
        System.out.println("Decidous tree growing...");
        trunk++;
        branches++;
        leaves++;
        this.setTrunk(trunk);
        this.setBranches(branches);
        this.setLeaves(leaves);
        System.out.println("Trunk size: " + trunk);
        System.out.println("Branches count: "+ branches);
        System.out.println("Leaves count: " + leaves);
    }

    @Override
    public void sheddingLeaves() {
        System.out.println("Decidous tree shedding leaves");
        this.setLeaves(0);
        System.out.println("After shedding leaves count: "+ this.getLeaves());
    }


}
