
package Ncep;


import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class tela_ncep extends javax.swing.JFrame {

   
    public tela_ncep() {
        initComponents();

         this.getContentPane().setBackground(Color.white);
         this.setSize(800, 565);
         textArea1.setEditable(false); //outputtext
        // textArea1.setFocusable(false); //outputtext
         
         int min = 0;
         int max = 20;
       //  int max = 511376936;
         jProgressBar1.setMinimum(min);
         jProgressBar1.setMaximum(max);
         jProgressBar1.setStringPainted(true);

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        textArea1 = new java.awt.TextArea();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cyborg");
        setName("tela_ncep"); // NOI18N
        setResizable(false);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 510));
        jPanel1.setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 105, 800, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ncep/logo_cptec.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(28, 28, 80, 63);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ncep/inpe.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(660, 30, 80, 63);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel3.setText("NCEP");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(336, 40, 66, 29);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton2.setText("Ping   &  Curl");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 173, 120, 23);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton3.setText("Traceroute");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 214, 120, 23);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton5.setText("Teste de Porta");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(20, 255, 120, 23);

        textArea1.setBackground(new java.awt.Color(0, 0, 0));
        textArea1.setFont(new java.awt.Font("Dialog", 1, 12));
        textArea1.setForeground(new java.awt.Color(0, 255, 0));
        jPanel1.add(textArea1);
        textArea1.setBounds(240, 170, 510, 200);

        jProgressBar1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(240, 390, 510, 19);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ncep/btn_atualizar.png"))); // NOI18N
        jButton1.setText("Listar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 296, 120, 25);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ncep/btn_atualizar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(730, 120, 40, 25);

        jScrollPane1.setViewportView(jPanel1);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



private void aquiSim(){
 // jProgressBar1.setString("Puxando");

  jProgressBar1.setStringPainted(true);
  int i= 1;
  while (i <= 20){
      File f = new File ("C:\\teste.txt");
      long tamanho = f.length();
     // i = (int)tamanho;
    //  if ((long)i != tamanho){
     //   throw new IllegalArgumentException(tamanho + " cannot be cast to int without changing its value.");
      //}
      jProgressBar1.setValue(i);
      try {
            Thread.sleep(200);
           } catch (Exception ex) {
            ;
        }
      i++;
      }
  jProgressBar1.setString("Puxado!!");
  textArea1.append("\nArquivo puxado com sucesso\n\n") ;
}


private void correBarra() {
   new Thread() {
   @Override
   public void run() {
     aquiSim();
    }
  }.start();
}


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

  
  String command = "ping www.ncep.noaa.gov";
        try {
            Process pr = Runtime.getRuntime().exec(command);
            InputStream in = pr.getInputStream();
            //850 do input stream é do DOS (faz ter acento no ouptut)
            BufferedReader entrada = new BufferedReader(new InputStreamReader(in,"850"));
            String aux = null;
           

            while ((aux= entrada.readLine())!= null)
            {
             //char temp[] = new char[aux.length()];
             //aux.getChars(0, aux.length(), temp, 0);
               textArea1.append((aux)+"\n");
              
            }

        } catch (IOException ex) { System.err.println("Erro de Entrada / Saida");}


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String command = "tracert www.ncep.noaa.gov";
        try {
            Process pr = Runtime.getRuntime().exec(command);
            InputStream in = pr.getInputStream();
            BufferedReader entrada = new BufferedReader(new InputStreamReader(in,"850"));
            String aux = null;
            
          while ((aux= entrada.readLine())!= null)
            {
              textArea1.append((aux)+"\n");
             
            }
      } catch (IOException ex) {
            System.err.println("Erro de Entrada / Saida");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

       
        //no linux funciona pois funciona teste de ICMP
        //verifica se o host esta atingivel
        try {
       InetAddress address = InetAddress.getByName("www.ncep.noaa.gov");
       textArea1.append("Host:  " + address.getHostName());
       textArea1.append("\nAddr:  " + address.getHostAddress());
      // textArea1.append("\nReach:  " + address.isReachable(1000));

 //      System.out.println("Name: " + address.getHostName());
 //      System.out.println("Addr: " + address.getHostAddress());
 //      System.out.println("Reach: " + address.isReachable(1000));
     }

     catch (IOException e) {
       System.err.println("Unable to reach web.mit.edu");
     }
//teste de porta
            int porta = 21; //21 ftp
            String host = "ftp://ftpprd.ncep.noaa.gov/pub/data/nccf/com/gfs";
                try {
                        Socket s = new Socket(host, porta);
                        boolean t = s.isConnected();
                        textArea1.append("\nPort:  "+porta);
                         textArea1.append("\nStatus:  Available\n\n");
                      //  System.out.println("Servidor está esperando conexão na porta " + porta + " de " + host);
                      //   System.out.println("Esta conectado ? "+t);
                        s.close();
                } catch (IOException ex) {
                 
                        textArea1.append("\nPort "+porta);
                         textArea1.append("\nStatus: Unavailable\n");
                
  }

 //    try {
     //  InetAddress address = InetAddress.getByName("140.90.198.133");
   // InetAddress address = InetAddress.getByName("200.221.2.45");
  //   InetAddress address = InetAddress.getByName("web.mit.edu");

       
    
 //    boolean reachable = address.isReachable(9000);
  //      System.out.println("Is host reachable? " + reachable);
       
 //     } catch (IOException ex){ System.err.println("Erro de Entrada / Saida");}

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    String homeDir = "C:/"; //alterar
    File file;
    String fileList[];

   

    // File arquivo = new File ("c:\\temp\\arquivo.txt");
    //pegando o arquivo
    File f = new File ("C:\\teste.txt");
    long tamanho = f.length();
    if (tamanho ==0){
         textArea1.append("Arquivo nao puxado") ;
       }
     else
     
        correBarra();

 textArea1.append("Listando arquivo gblav.........") ;


             try {
                  FileReader reader = new FileReader(f);
                  BufferedReader input = new BufferedReader(reader);
                  String linha;
                  while ((linha = input.readLine()) != null) {

                    boolean equals = linha.contains("Ok");
                    System.out.println(linha);
                      if (equals == true){
                          System.out.println("okkkk");
                      }//else {
                       //   System.out.println("erroo");
                     // }
                    

                  }
                  input.close();
                } catch (IOException ioe) {
                   System.out.println(ioe);
                }
//System.out.println("O arquivo \"" + arquivo.getAbsolutePath() + "\" possui " + tamanho + " bytes");

    //Get file names of the current directory
 //   file = new File( homeDir );
  //  fileList = file.list();
  //  if( fileList == null )
 //   {
  //    System.out.println("ls.ls - Error accessing current directory.");
   
 //   }

    //List the files in the current directory. One file per line.
  //  for(int i = 0; i < fileList.length; i++)
 //   {
 //     System.out.println(fileList[i]);
 //     if (fileList[i].equalsIgnoreCase("teste.txt")){
 //         textArea1.append(fileList[i]+"\n");
 //     }
 //   }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        textArea1.setText(null);
      jProgressBar1.setValue(0);
      jProgressBar1.setString(null);

    }//GEN-LAST:event_jButton4ActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_ncep().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables

}
