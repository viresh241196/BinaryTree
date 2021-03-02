package binary;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {
    @Test
    public void given3numbersWhenAddedToBinarySearchShouldReturnSizeThree() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        System.out.println(size);
        Assert.assertEquals(3,size);

    }
}
