# 🌳 Tree Growth Simulation

This project demonstrates an object-oriented simulation of two types of trees:

- 🍁 **Deciduous Tree**
- 🌲 **Coniferous Tree**

## 🧠 Concept

Each tree has the following properties:

- **Trunk** (`trunk`) – size of the trunk
- **Branches** (`branches`) – number of branches
- **Leaves** (`leaves`) – number of leaves (or needles in case of conifers)

These values evolve over time using two actions:

---

## 🌱 `grow()` – Tree Growth

Simulates the growth of the tree.

### Deciduous Tree
- Trunk: +1
- Branches: +1
- Leaves: +1

### Coniferous Tree
- Trunk: +2 (faster growth)
- Branches: +2
- Leaves: +10 (produces more leaves)

---

## 🍂 `sheddingLeaves()` – Shedding Leaves

Simulates seasonal behavior (e.g., autumn).

### Deciduous Tree
- Drops all leaves
- Result: `leaves = 0`

### Coniferous Tree
- Drops 20% of needles
- Result: `leaves *= 0.8`

---
