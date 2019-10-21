package arvore;

public class Arvore {

    public static void main(String[] args) {
        Tree t = new Tree();
        t.insereNode(20);
        t.insereNode(10);
        t.insereNode(50);
        t.insereNode(30);
        t.insereNode(18);
        t.insereNode(42);
        System.out.println("Pre");
        t.preorderTraversal();
        System.out.println("\nIn");
        t.inorderTraversal();
        System.out.println("\nNivel");
        t.nivelTransversal();
        System.out.println("Soma"+t.somaTransversal());
        System.out.println("procurando "+t.pesquisaTransversal(70));
                
    }
    
}
