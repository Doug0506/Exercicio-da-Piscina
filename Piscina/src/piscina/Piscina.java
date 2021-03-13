package piscina;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 

public class Piscina extends JFrame implements ActionListener{
  JLabel lbllargura, lblprofundidade,lblcomprimento, lblvalor, lblcalcular;
  JTextField txtlargura, txtprofundidade, txtvalor, txtcomprimento;
  JButton btncalcular, btnsair, btnlimpar;     

 


    public static void main(String[] args) 
    {
     JFrame janela = new Piscina();
     janela.setUndecorated(true);
     janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
     janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     janela.setVisible(true);

 

    }
    
    Piscina()
    {
      setTitle("VALOR PISCINA");
      setBounds(300,50,350,90);
      getContentPane().setBackground(new Color(135,206,235));
      getContentPane().setLayout(new GridLayout(3,4));

 

          
      lbllargura =  new JLabel("Largura");
      lbllargura.setForeground (Color.black);
      lbllargura.setFont(new Font("",Font.BOLD,12));
      lblprofundidade = new JLabel("Profundidade");
      lblprofundidade.setForeground (Color.black);
      lblprofundidade.setFont(new Font("",Font.BOLD,12));
      lblcomprimento = new JLabel("Comprimento");
      lblcomprimento.setFont(new Font("",Font.BOLD,12));
      lblcomprimento.setForeground(Color.black);
      lblcalcular = new JLabel("Calcular");
      lblcalcular.setForeground (Color.black);
      lblcalcular.setFont(new Font("",Font.BOLD,12));
      lblvalor = new JLabel("Valor da Piscina");
      lblvalor.setForeground(Color.BLACK);
      lblvalor.setFont(new Font("",Font.BOLD,12));
      
      btncalcular = new  JButton("Calcular"); btncalcular.addActionListener(this);
      btnsair = new JButton("Sair");          btnsair.addActionListener(this);
      btnlimpar = new JButton("Limpar");      btnlimpar.addActionListener(this);
      
      txtlargura = new JTextField();
      txtcomprimento = new JTextField();
      txtprofundidade = new JTextField();
      txtvalor = new JTextField();
      txtvalor.setEditable(false);
      
      getContentPane().add(lblcomprimento); getContentPane().add(txtcomprimento);
      getContentPane().add(lbllargura); getContentPane().add(txtlargura);
      getContentPane().add(lblprofundidade); getContentPane().add(txtprofundidade);
      getContentPane().add(lblcalcular); getContentPane().add(btncalcular);
      getContentPane().add(lblvalor); getContentPane().add(txtvalor);
      getContentPane().add(btnlimpar);
      getContentPane().add(btnsair);
     
      
      
  }
  public void actionPerformed(ActionEvent e)
  {
       if (e.getSource()==btnsair)
      {
          System.exit(0);
          return;
          
      }
      if (e.getSource()==btnlimpar)
      {
          txtlargura.setText("");
          txtcomprimento.setText("");
          txtprofundidade.setText("");
          txtvalor.setText("");
          return;
      }
      
      double largura=0, comprimento=0, profundidade=0, valor=0;
      try
      {
          largura = Double.parseDouble(txtlargura.getText());
          comprimento = Double.parseDouble(txtcomprimento.getText());
          profundidade = Double.parseDouble(txtprofundidade.getText());
      }
      catch(NumberFormatException erro)
      {
          txtvalor.setText("Apenas Números");
          return;
         
      }
      
     if(e.getSource()== btncalcular) valor = (largura*comprimento*profundidade) * 300;
     txtvalor.setText(""+ valor);



    }
 }
