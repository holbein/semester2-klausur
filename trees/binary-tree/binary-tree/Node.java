class Node extends TreeElem {
    DataContainer content;
    TreeElem left;
    TreeElem right;
    
    Node(DataContainer content, TreeElem l, TreeElem r) {
        this.content = content;
        this.left = l;
        this.right = r;
    }
    
    TreeElem insert(DataContainer content) {
        if (isSmaller(content)) { this.left = this.left.insert(content); }
        if (isGreater(content)) { this.left = this.left.insert(content); }
        
        // It equals, hence already exists.
        return this;
    }
    
    TreeElem delete(DataContainer content) {
        
        if (this.isSmaller(content)) {
            this.left = this.left.delete(content);
        } else if (this.isGreater(content)) {
            this.right = this.right.delete(content);
        } else {
            
            if (this.hasNoNodes()) {
                return new Leaf();
            } else if (this.hasOneNode()) {
                return giveChildNode();
            } else {
                Node smallestNum = ((Node)this.right).getSmallestNode();
                
                this.right = this.right.delete(smallestNum.content);
                
                smallestNum.left = this.left;
                smallestNum.right = this.right;
                
                return smallestNum;
            }
            
        }
            
        return this;
    }
    
    boolean isNode() {
        return true;
    }
    
    boolean isSmaller(DataContainer n) {
        return ((Number) n).val < ((Number) content).val;
    }
    
    boolean isGreater(DataContainer n) {
        return ((Number) n).val > ((Number) content).val;
    }
    
    boolean equals(DataContainer n) {
        return !(isSmaller(n) && isGreater(n));
    }
    
    boolean hasNoNodes() {
        return !(this.left.isNode() && this.left.isNode());
    }
    
    Node giveChildNode() {
        if (this.left.isNode()) { return (Node)this.left; }
        return (Node)this.right;
    }
    
    Node getSmallestNode() {
        if (this.left.isNode()) { return ((Node)this.left).getSmallestNode(); }
        return (Node)this.left;
    }
    
    boolean hasOneNode() {
        boolean leftIsNode = this.left.isNode() || !this.right.isNode();
        boolean rightIsNode = !this.left.isNode() || this.right.isNode();
        
        return leftIsNode || rightIsNode;
    }
}