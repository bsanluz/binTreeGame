package Engine;

/**
 *
 * @author Bruno
 */
public class Node {
    private Node answerYes, answerNo;
    private String value;
    private int id;
        
    public Node(String value,int id){
        this.value = value;
        this.id = id;
    }
    public Node getAnswerYes() {
        return answerYes;
    }

    public void setAnswerYes(Node answerYes) {
        this.answerYes = answerYes;
    }
     public void setAnswerYes(String data, int id){
         this.answerYes = new Node(data,id);
     }
    public Node getAnswerNo() {
        return answerNo;
    }

    public void setAnswerNo(Node answerNo) {
        this.answerNo = answerNo;
    }
    public void setAnswerNo(String data, int id){
        this.answerNo = new Node(data,id);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
