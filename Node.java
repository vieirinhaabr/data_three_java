package arvore;
public class Node {
  Node esquerdaNode;
  int info;
  Node direitaNode;

  public Node(int nodeInfo){
    info = nodeInfo;
    esquerdaNode = direitaNode = null;
  }

  public void insereNode(int insertValue){
    if (insertValue < info){
      if (esquerdaNode == null)
       esquerdaNode = new Node(insertValue);
      else
       esquerdaNode.insereNode(insertValue);
    }
    else if (insertValue > info){
      if (direitaNode == null)
	direitaNode = new Node(insertValue);
      else
	direitaNode.insereNode(insertValue);
    }
  }
}
