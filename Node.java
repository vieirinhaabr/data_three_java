package three_java;

public class Node {
  Node leftNode;
  int data;
  Node rightNode;

  public Node(int nodedata){
    data = nodedata;
    leftNode = rightNode = null;
  }

  public void insertNode(int insertValue){
    if (insertValue < data){
      if (leftNode == null)
       leftNode = new Node(insertValue);
      else
       leftNode.insertNode(insertValue);
    }
    else if (insertValue > data){
      if (rightNode == null)
	rightNode = new Node(insertValue);
      else
	rightNode.insertNode(insertValue);
    }
  }
}
