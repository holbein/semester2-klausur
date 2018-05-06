public class Leaf extends TreeElem {
    public Leaf() {
    }
    
    TreeElem delete(DataContainer content) {
        return this;
    }
    
    TreeElem insert(DataContainer content) {
        return new Node(content, new Leaf(), new Leaf());
    }
    
    boolean isNode() {
        return false;
    }
}