public class Tree {
    TreeElem root;
    
    Tree() {
        //this.root = new Leaf();
    }
    
    void delete(DataContainer content) {
        this.root = root.insert(content);
    }
    
    void insert(DataContainer content) {
        this.root = root.insert(content);
    }
}