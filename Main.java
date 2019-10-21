package three_java;

public class Main {

    public static void main(String[] args) {
        Tree t = new Tree();
        t.insertNode(20);
        t.insertNode(10);
        t.insertNode(50);
        t.insertNode(30);
        t.insertNode(18);
        t.insertNode(42);
        System.out.println("Pre");
        t.preorderTraversal();
        System.out.println("\nIn");
        t.inorderTraversal();
        System.out.println("\nlevel");
        t.levelTransversal();
        System.out.println("sum"+t.sumTransversal());
        System.out.println("procurando "+t.searchTransversal(70));
                
    }
    
}
