package holiday.tasks.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class BinaryTreeTest {

    private BinaryTree tree;

    @BeforeEach
    public void init(){
        tree = createBinaryTree();
    }

    @Test
    public void containsAddedElementsTest() {

        Assertions.assertTrue(tree.containsNode(2));
        Assertions.assertTrue(tree.containsNode(6));

        Assertions.assertFalse(tree.containsNode(1));
    }

    @Test
    public void containsDeletedElementTest() {

        Assertions.assertTrue(tree.containsNode(6));
        tree.delete(6);
        Assertions.assertFalse(tree.containsNode(6));
    }

    @Test
    public void findElementTest() {

        tree.root = tree.findNode(tree.root, 23);
        assertEquals(23, tree.root.value);
    }
    private BinaryTree createBinaryTree() {
        BinaryTree tree = new BinaryTree();
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(18);
        tree.add(14);
        tree.add(23);
        tree.add(28);
        tree.add(25);

        return tree;

    }
}
