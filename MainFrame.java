import java.awt.*;
import java.awt.event.*;

public class MainFrame extends Frame{
    private Button btnExit = new Button("Exit");
    private Button btnAdd = new Button("Add");
    private Button btnSub = new Button("Sub");
    private Label lab = new Label("0");
    private int x = 0;

   public MainFrame(){
       init();
   }
   private void init(){
       this.setLayout(null);
       this.setLocation(100,50);
       this.setSize(400,300);
       
       btnExit.setBounds(80,200,50,25);
       btnAdd.setBounds(150,200,50,25);
       btnSub.setBounds(220,200,50,25);
       lab.setBounds(200,70,50,50);

       this.add(btnExit);
       this.add(btnAdd);
       this.add(btnSub);
       this.add(lab);

       btnExit.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae){
               System.exit(0);
           }
       });
       btnAdd.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            if(x<20){
                lab.setText(Integer.toString(++x));
            }
        }
    });
    btnSub.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            if(x>0){
                lab.setText(Integer.toString(--x));
            }
        }
    });
   }
}