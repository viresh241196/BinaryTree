package binary;

public class MyBinaryTree <K extends Comparable<K>>{

    private MyBinaryNode<K> root;

    public void add(K key){
        this.root = this.addRecursively(root, key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current ==null)
            return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return current;
        if(compareResult < 0){
            current.left = addRecursively(current.left,key);
        }else{
            current.right = addRecursively(current.right,key);
        }
        return current;
    }

    public int getSize() {
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(MyBinaryNode<K> current) {
        return current == null ? 0: 1+ this.getSizeRecursive(current.left)+ this.getSizeRecursive(current.right);
    }

    public K search(K key){
        K find = nodeSearch(root,key);
        return find;
    }

    public K nodeSearch(MyBinaryNode<K> current, K key) {
        if (current == null || current.key == key)
            return key;
        int result = key.compareTo(current.key);
        if (result < 0)
            return nodeSearch(current.left, key);
        else
            return nodeSearch(current.right, key);
    }
}
