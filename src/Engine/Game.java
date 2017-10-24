package Engine;

import javax.swing.JOptionPane;
/**
 *
 * @author Bruno
 */
public class Game extends BinTree{
    public static int index = 3;   
    public Game(){
         JOptionPane.showMessageDialog(null, "Pense em um Animal");
         while(true){
            if(JOptionPane.showConfirmDialog(null,"Deseja jogar?", "jogo", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 1) {
                break;
            }
             Node element = this.father;
             question(element);
         }      
    }
    protected boolean question(Node element) {
        int answer;
        answer = JOptionPane.showConfirmDialog(null,element.getValue()+"?","", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if(answer == 0){
            if(element.getAnswerYes().getAnswerYes()== null){
                answer = JOptionPane.showConfirmDialog(null, "O animal que você pensou foi o(a) " + element.getAnswerYes().getValue()+"?", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if(answer == 0){
                    JOptionPane.showMessageDialog(null, "Acertei de novo!");
                    return true;
                }else{
                wrongQuestion(element.getAnswerYes());
                }
            }else{
            return question(element.getAnswerYes());
            }
        }else{
            if(element.getAnswerNo().getAnswerNo()== null){
                answer = JOptionPane.showConfirmDialog(null, "O animal que você pensou foi o(a) " + element.getAnswerNo().getValue()+"?", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if(answer == 0){
                    JOptionPane.showMessageDialog(null, "Acertei de novo!");
                    return true;
                }else{
                wrongQuestion(element.getAnswerNo());
                }
            }else{
                return question(element.getAnswerNo());
            }   
        }
        return false;
    }

    private void wrongQuestion(Node element) {
        ++index;
        String aux = JOptionPane.showInputDialog(null, "Qual animal que você pensou?");
        ++index;
        String aux2 = JOptionPane.showInputDialog("Um(a) "+ aux + "______ mas um(a) "+ element.getValue() +" não.");
        String str = element.getValue();
        element.setValue(aux2);
        element.setAnswerYes(aux, index);
        element.setAnswerNo(str, index);
    }
}
