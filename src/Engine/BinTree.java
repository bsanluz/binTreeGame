package Engine;
/**
 * @author Bruno
 */
public class BinTree {
    Node father;
    
    public BinTree(){
        this.init();
    }

    private void init(){
        this.father = new Node("O animal que você pensou vive na água?",1);
        this.father.setAnswerNo("Macaco",2);
        this.father.setAnswerYes("Tubarão",3);
    }
    
}
