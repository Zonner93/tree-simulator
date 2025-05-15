package com.example;

public class Main {
    public static void main(String[] args) {
        Tree decidousTree = new DeciduousTree(0, 0, 0);
        Tree coniferousTree = new ConiferousTree(0, 0, 0);

        for (int i = 0; i < 5; i++) {
            decidousTree.grow();
            coniferousTree.grow();
        }

        decidousTree.sheddingLeaves();
        coniferousTree.sheddingLeaves();

    }
}