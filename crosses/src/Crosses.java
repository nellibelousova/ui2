import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Crosses extends JPanel
{
    static JFrame a;
    static List<JButton> b;
    static JLabel v;
    static String[]n;
    static String h;
    static boolean s;

    static  int cellValue;
    public static void main (String[] args )
    {
        a=new JFrame();
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Crosses crosses=new Crosses();
        a.add(crosses);
        a.setContentPane(crosses);
        a.setVisible(true);

        b=new ArrayList<JButton>();
        v=new JLabel("Добро пожаловать ляляля");

        n=new String[9];
        h="x";
        s=false;
        cellValue=0;
        Game();
    }

    private static void Game()
    {
        a.setLayout(null);
        v.setBounds(10,160,400,400);
        a.add(v);
        int xIne=0;
        int vIne=-100;
        for (int i = 0;i<9;i++)n[i]="empty";
        for (int y=0;y<3;y++)
        {
            int xIne=0;
            int vIne=-100;
            for (int y=0;y<3;y++)
            {
                b.add(new JButton(""));
                b.get(cellValue).setBounds(xIne,yInc,100,100);
                a.add(b.get((cellValue));
                b.get((cellValue).addActionListener(new ActionListener());
                {
                    int value=cellValue;
                    @Override
                    public void

            }
            }
            }
        }
    }


}
