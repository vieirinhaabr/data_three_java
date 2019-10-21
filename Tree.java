package arvore;

public class Tree {
private Node raiz; //root

public Tree(){
    raiz = null;  }

public void insereNode(int insertValue){
    if (raiz == null)
      raiz = new Node(insertValue);
    else
      raiz.insereNode(insertValue);
  }

 public void preorderTraversal(     ){
    preorderHelper(raiz);   }

 private void preorderHelper(Node node){
    if (node == null)
      return ;

    System.out.print(node.info + " , ");
    preorderHelper(node.esquerdaNode);
    preorderHelper(node.direitaNode);
  }

 public void inorderTraversal(){
    inorderHelper(raiz);   }

 private void inorderHelper(Node node){
    if (node == null)
      return ;
    inorderHelper(node.esquerdaNode);
    System.out.print(node.info + " , ");
    inorderHelper(node.direitaNode);
  }

public void postorderTraversal(){
    postorderHelper(raiz);   }

private void postorderHelper(Node node){
    if (node == null)
      return ;
    postorderHelper(node.esquerdaNode);
    postorderHelper(node.direitaNode);
    System.out.print(node.info + " , ");
  }

public void folhasTraversal(){
    folhasHelper(raiz);   }

 private void folhasHelper(Node node){
    if (node == null)
      return ;
    folhasHelper(node.esquerdaNode);
    
    if (node.esquerdaNode == null && node.direitaNode == null)
        System.out.print(node.info + " , ");
    
    folhasHelper(node.direitaNode);
  }
 
public void internosTraversal(){
    internosHelper(raiz);   }

 private void internosHelper(Node node){
    if (node == null)
      return ;
    internosHelper(node.esquerdaNode);
    
    if (node.esquerdaNode != null || node.direitaNode != null)
        System.out.print(node.info + " , ");
    
    internosHelper(node.direitaNode);
  }
 
 public void grauTraversal(){
    grauHelper(raiz);   }

  private void grauHelper(Node node){
    if (node == null)
      return ;
    
    if(node.direitaNode != null && node.esquerdaNode != null)
        System.out.print(node.info + " é grau 2 , ");
    else if(node.direitaNode != null || node.esquerdaNode != null)
        System.out.print(node.info + " é grau 1 , ");
    else
        System.out.print(node.info + " é grau 0 , ");
    grauHelper(node.esquerdaNode);
    grauHelper(node.direitaNode);
 }

public void nodeGrausTransversal() {
        nodeGraus(raiz);    }
private void nodeGraus(Node node) {
        if (node == null) {
            return;        }
        nodeGraus(node.esquerdaNode);
        int i = 0;
        if (node.direitaNode != null) {
            i++;        }
        if (node.esquerdaNode != null) {
            i++;        }
        System.out.print(node.info + " - grau " + i + " , \n");
        nodeGraus(node.direitaNode);
    }  


public void nivelTransversal() {
        nodeNivel(raiz, 1);    
}
private void nodeNivel(Node node, int nivel) {
        if (node == null) {
            return;}
        System.out.print(node.info + " - nivel " + nivel + " , ");
        nivel++;
        nodeNivel(node.esquerdaNode, nivel);
        nodeNivel(node.direitaNode , nivel);
}  

public int somaTransversal() {
        return nodeSoma(raiz);    
}
private int nodeSoma(Node node) {
 if (node == null) {
    return 0;}
 else 
    return node.info + nodeSoma(node.esquerdaNode) + nodeSoma(node.direitaNode);
}  

public boolean pesquisaTransversal(int procurado) {
    return nodePesquisa(raiz, procurado);    
        
}
//errado em analise......
private boolean nodePesquisa(Node node, int procurado) {
 boolean r = false;
 if (node == null) 
    r = false;
 else
 if (node.info > procurado)
    r = nodePesquisa(node.esquerdaNode, procurado);
 else if (node.info < procurado)
       r =  nodePesquisa(node.direitaNode, procurado);
      else
        r = true;
 return r;
}
}
