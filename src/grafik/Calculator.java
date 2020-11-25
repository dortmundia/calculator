package grafik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    JPanel panel;
    JButton szamol,sorzas,osszeadas,kivonas,osztas,maradekos;
    JLabel felirat,felirat1, felirat2, vegeredmeny, muvelet;
    JTextField a, b;
    int aa,bb;

    public Calculator(){
        init();
    }

    private void init() {
        this.setTitle("Számológép");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel =(JPanel)(this.getContentPane());
        this.panel.setBackground(new Color(100,100,100));
        this.setLayout(null);
        /* szamol = new JButton();
        szamol.setText("Művelet elvégzése");
        szamol.setBounds(70,210,150,50);
        panel.add(szamol);*/

        a=new JTextField();
        b=new JTextField();
        a.setBounds(100,40,110,40);
        b.setBounds(100,110,110,40);
        panel.add(a);
        panel.add(b);

        felirat=new JLabel();
        felirat1=new JLabel();
        felirat2=new JLabel();
        vegeredmeny=new JLabel();
        vegeredmeny.setText("Eredmeny: ");
        vegeredmeny.setBounds(30,300,200,50);
        panel.add(vegeredmeny);
        muvelet=new JLabel();
        muvelet.setText("müvelet: ");
        muvelet.setBounds(30,200,200,50);
        panel.add(muvelet);

        felirat.setText("A:");
        felirat1.setText("B:");
        felirat.setBounds(20,40,50,40);
        felirat1.setBounds(20,110,50,40);


        felirat2.setText("művelet:");
        panel.add(felirat);
        panel.add(felirat1);
        panel.add(felirat2);

        felirat2.setBounds(320,10,100,30);

        sorzas = new JButton();
        sorzas.setText("*");
        sorzas.setBounds(320,40,50,50);
        panel.add(sorzas);

        osszeadas = new JButton();
        osszeadas.setText("+");
        osszeadas.setBounds(320,110,50,50);
        panel.add(osszeadas);

        kivonas = new JButton();
        kivonas.setText("-");
        kivonas.setBounds(320,180,50,50);
        panel.add(kivonas);

        osztas = new JButton();
        osztas.setText(":");
        osztas.setBounds(320,250,50,50);
        panel.add(osztas);

        maradekos = new JButton();
        maradekos.setText("%");
        maradekos.setBounds(320,320,50,50);
        panel.add(maradekos);

        aa=0;
        bb=0;


        sorzas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aa=Integer.parseInt(a.getText());
                bb=Integer.parseInt(b.getText());
                muvelet.setText("művelet: " +aa +" * "+bb);
                vegeredmeny.setText("Eredmeny: " + (aa*bb) );
            }
        });


        osszeadas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aa=Integer.parseInt(a.getText());
                bb=Integer.parseInt(b.getText());
                muvelet.setText("művelet: " +aa +" + "+bb);
                vegeredmeny.setText("Eredmeny: " + (aa+bb) );
            }
        });


        kivonas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aa=Integer.parseInt(a.getText());
                bb=Integer.parseInt(b.getText());
                muvelet.setText("művelet: " +aa +" - "+bb);
                vegeredmeny.setText("Eredmeny: " + (aa-bb) );
            }
        });


        osztas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aa=Integer.parseInt(a.getText());
                bb=Integer.parseInt(b.getText());
                muvelet.setText("művelet: " +aa +" : "+bb);
                vegeredmeny.setText("Eredmeny: " + (aa/bb) );
            }
        });


        maradekos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aa=Integer.parseInt(a.getText());
                bb=Integer.parseInt(b.getText());
                muvelet.setText("művelet: " +aa +" % "+bb);
                vegeredmeny.setText("Eredmeny: " + (aa%bb) );
            }
        });

        //PUSH PLS


        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
