# Binary Tree

## Definition
A binary tree is a tree, in which every (data) node references up to two
tree elements (node or leaf).

## Terminology: Object structure
* *(Inner) Node*: Tree elements that reference other elements
* *Leaf*: Tree elements that do not reference other elements
* *Child node*: A node that is being referenced
* *Parent node*: A node that references another element

## Traversion
Traversion means 'Iteration of a binary tree'

### Three operations
#### Short-hand notation
* v: Give value
* LN: Go to left node
* RN: Go to right node

#### The operations
1. Preorder: w-LN-RN
2. Inorder: LN-w-RN
3. Postorder: LN-RN-w

## Deletion
In the process of deletion there are three cases:

1. Node has no children:

A Leaf is returned

2. Node has one child:

The single child is returned

3. Has two children:

3.1. Find the node you are looking for. Then search the smallest
element in the right subtree; it will be in place of the node meant to be 
deleted at a later point of time
3.2. Delete the smallest element using the first or second method for deletion

 
