package ventanas;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.net.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.lang.*;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {
int x, y;
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButtonSalirMenu = new javax.swing.JButton();
        jButtonMinimizarMenu = new javax.swing.JButton();
        jButtonInformacionMiIp = new javax.swing.JButton();
        jLabelVersionMenu = new javax.swing.JLabel();
        jLabelIcono = new javax.swing.JLabel();
        jLabelMiNombre = new javax.swing.JLabel();
        btnpenlace = new javax.swing.JButton();
        txtOtraIp = new javax.swing.JTextField();
        jButtonOtraIp = new javax.swing.JButton();
        btniphost = new javax.swing.JButton();
        btnippublica = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtconexionesactivas = new javax.swing.JTextArea();
        jButtonCalculadoraIP = new javax.swing.JButton();
        jButtonOtrasFunciones = new javax.swing.JButton();
        btnconexionesactivas = new javax.swing.JButton();
        txtiphost = new javax.swing.JTextField();
        txtippublica = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txturl = new javax.swing.JTextField();
        btnurlaip = new javax.swing.JButton();
        txtipdeurl = new javax.swing.JTextField();
        jLabelMoverFrame = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalirMenu.setBackground(new java.awt.Color(153, 153, 153));
        jButtonSalirMenu.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButtonSalirMenu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalirMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoboton.JPG"))); // NOI18N
        jButtonSalirMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalirMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 110, 40));

        jButtonMinimizarMenu.setBackground(new java.awt.Color(153, 153, 153));
        jButtonMinimizarMenu.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButtonMinimizarMenu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMinimizarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnminim.jpg"))); // NOI18N
        jButtonMinimizarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMinimizarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMinimizarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 40, 40));

        jButtonInformacionMiIp.setBackground(new java.awt.Color(153, 153, 153));
        jButtonInformacionMiIp.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButtonInformacionMiIp.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInformacionMiIp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/informaciondemiiip.jpg"))); // NOI18N
        jButtonInformacionMiIp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonInformacionMiIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformacionMiIpActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInformacionMiIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 260, 30));

        jLabelVersionMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelVersionMenu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVersionMenu.setText("v-Final");
        getContentPane().add(jLabelVersionMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 380, -1, -1));

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabelIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, -1, 160));

        jLabelMiNombre.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabelMiNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMiNombre.setText("Lautaro Culic'");
        getContentPane().add(jLabelMiNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 470, 80, -1));

        btnpenlace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/detallesdemiip.jpg"))); // NOI18N
        btnpenlace.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpenlace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpenlaceMouseClicked(evt);
            }
        });
        btnpenlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpenlaceActionPerformed(evt);
            }
        });
        getContentPane().add(btnpenlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 30));
        getContentPane().add(txtOtraIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 140, 30));

        jButtonOtraIp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/otraip.jpg"))); // NOI18N
        jButtonOtraIp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOtraIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOtraIpActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOtraIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 110, 30));

        btniphost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iphost.jpg"))); // NOI18N
        btniphost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btniphost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btniphostMouseClicked(evt);
            }
        });
        btniphost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniphostActionPerformed(evt);
            }
        });
        getContentPane().add(btniphost, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 110, 30));

        btnippublica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ippublica.jpg"))); // NOI18N
        btnippublica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnippublica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnippublicaMouseClicked(evt);
            }
        });
        getContentPane().add(btnippublica, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 110, 30));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txtconexionesactivas.setEditable(false);
        txtconexionesactivas.setColumns(20);
        txtconexionesactivas.setRows(5);
        jScrollPane1.setViewportView(txtconexionesactivas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 550, 300));

        jButtonCalculadoraIP.setBackground(new java.awt.Color(153, 153, 153));
        jButtonCalculadoraIP.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButtonCalculadoraIP.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCalculadoraIP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculadoraip.jpg"))); // NOI18N
        jButtonCalculadoraIP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCalculadoraIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalculadoraIPActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCalculadoraIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 240, 70));

        jButtonOtrasFunciones.setBackground(new java.awt.Color(153, 153, 153));
        jButtonOtrasFunciones.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButtonOtrasFunciones.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOtrasFunciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/otrasfunciones.jpg"))); // NOI18N
        jButtonOtrasFunciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOtrasFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOtrasFuncionesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOtrasFunciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 240, 70));

        btnconexionesactivas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/conexionesactivas.jpg"))); // NOI18N
        btnconexionesactivas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconexionesactivas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnconexionesactivasMouseClicked(evt);
            }
        });
        btnconexionesactivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconexionesactivasActionPerformed(evt);
            }
        });
        getContentPane().add(btnconexionesactivas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, 30));

        txtiphost.setEditable(false);
        getContentPane().add(txtiphost, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 30));

        txtippublica.setEditable(false);
        getContentPane().add(txtippublica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 10, 480));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 260, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 240, 20));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 10, 170));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 260, 20));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 240, 20));

        txturl.setText("www.*.com");
        txturl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txturlActionPerformed(evt);
            }
        });
        getContentPane().add(txturl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 150, 30));

        btnurlaip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/urlaip.jpg"))); // NOI18N
        btnurlaip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnurlaip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnurlaipActionPerformed(evt);
            }
        });
        getContentPane().add(btnurlaip, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 100, 30));

        txtipdeurl.setEditable(false);
        getContentPane().add(txtipdeurl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 260, 30));

        jLabelMoverFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelMoverFrame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelMoverFrameMouseDragged(evt);
            }
        });
        jLabelMoverFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMoverFrameMousePressed(evt);
            }
        });
        getContentPane().add(jLabelMoverFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 500));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondohacker.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 1140, 527));

        pack();
    }// </editor-fold>                        

    private void jButtonSalirMenuActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        System.exit(0);
    }                                                
  
    private void btnpenlaceMouseClicked(java.awt.event.MouseEvent evt) {                                        
    
    }                                       
  
    private void btniphostMouseClicked(java.awt.event.MouseEvent evt) {                                       
      
    }                                      

    private void btnippublicaMouseClicked(java.awt.event.MouseEvent evt) {                                          
        try {
            URL whatismyip = new URL("http://checkip.amazonaws.com");

            BufferedReader in = new BufferedReader(new InputStreamReader(

                    whatismyip.openStream()));     

            String ip = in.readLine();     
            txtippublica.setText(ip);
            in.close();

        } catch (MalformedURLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }                                         

    private void btniphostActionPerformed(java.awt.event.ActionEvent evt) {                                          
           try{
           InetAddress IP = InetAddress.getLocalHost();
           txtiphost.setText(IP.getHostAddress());
        } catch (UnknownHostException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                         

    private void btnconexionesactivasMouseClicked(java.awt.event.MouseEvent evt) {                                                  
       
    }                                                 
  
    private void btnconexionesactivasActionPerformed(java.awt.event.ActionEvent evt) {                                                     
       
         if (Desktop.isDesktopSupported()) {
            try {
                Process process = Runtime.getRuntime().exec("netstat -a");

                try (BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(process.getInputStream()))) {

                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        String DEFAULT_GATEWAY = "Default Gateway";
                        if (line.trim().startsWith(DEFAULT_GATEWAY)) {
                            String ipAddress = line.substring(line.indexOf(":") + 1).trim(),
                                    routerURL = String.format("http://%s", ipAddress);

                            Desktop.getDesktop().browse(new URI(routerURL));
                        }
                        
                        while ((line = bufferedReader.readLine()) != null) {
                        txtconexionesactivas.append(line+"\n");}
                        
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
   
    }                                                    

    private void btnurlaipActionPerformed(java.awt.event.ActionEvent evt) {                                          
       String host;
       host = txturl.getText();
       try{
           InetAddress address = InetAddress.getByName(host);
           txtipdeurl.setText(address.toString());
       }catch(UnknownHostException x){
           x.printStackTrace();
       }
    }                                         

    private void txturlActionPerformed(java.awt.event.ActionEvent evt) {                                       

    }                                      

    private void jButtonMinimizarMenuActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        this.setExtendedState(ICONIFIED);
    }                                                    

    private void jButtonInformacionMiIpActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        if (java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop =java.awt.Desktop.getDesktop();
            
                if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                    try{
                        java.net.URI uri = new java.net.URI("https://ipapi.co/json/");
                        desktop.browse(uri);
                    }catch (URISyntaxException | IOException ex){}
                }
            
        }
    }                                                      

    private void jButtonOtraIpActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if (java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop =java.awt.Desktop.getDesktop();
            
                if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                    try{
                        java.net.URI uri = new java.net.URI("https://ipapi.co/"+txtOtraIp.getText()+"/json/");
                        desktop.browse(uri);
                    }catch (URISyntaxException | IOException ex){}
                }
            
        }
    }                                             

    private void btnpenlaceActionPerformed(java.awt.event.ActionEvent evt) {                                           

        if (Desktop.isDesktopSupported()) {
            try {
                Process process = Runtime.getRuntime().exec("ipconfig");

                try (BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(process.getInputStream()))) {

                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        String DEFAULT_GATEWAY = "Default Gateway";
                        if (line.trim().startsWith(DEFAULT_GATEWAY)) {
                            String ipAddress = line.substring(line.indexOf(":") + 1).trim(),
                                    routerURL = String.format("http://%s", ipAddress);

                            Desktop.getDesktop().browse(new URI(routerURL));
                        }
                        
                        while ((line = bufferedReader.readLine()) != null) {
                        txtconexionesactivas.append(line+"\n");}
                        
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }                                          

    private void jButtonOtrasFuncionesActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        this.dispose();
        Funciones abrir =new Funciones();
        abrir.setVisible(true);
    }                                                     

    private void jButtonCalculadoraIPActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        this.dispose();
        CalculadoraIP abrir =new CalculadoraIP();
        abrir.setVisible(true);
    }                                                    

    private void jLabelMoverFrameMousePressed(java.awt.event.MouseEvent evt) {                                              
        
        x = evt.getX();
        y = evt.getY();
        
    }                                             

    private void jLabelMoverFrameMouseDragged(java.awt.event.MouseEvent evt) {                                              
       
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
        
    }                                             
    public static void main(String args[]) {       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnconexionesactivas;
    private javax.swing.JButton btniphost;
    private javax.swing.JButton btnippublica;
    private javax.swing.JButton btnpenlace;
    private javax.swing.JButton btnurlaip;
    private javax.swing.JButton jButtonCalculadoraIP;
    private javax.swing.JButton jButtonInformacionMiIp;
    private javax.swing.JButton jButtonMinimizarMenu;
    private javax.swing.JButton jButtonOtraIp;
    private javax.swing.JButton jButtonOtrasFunciones;
    private javax.swing.JButton jButtonSalirMenu;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JLabel jLabelMiNombre;
    private javax.swing.JLabel jLabelMoverFrame;
    private javax.swing.JLabel jLabelVersionMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txtOtraIp;
    private javax.swing.JTextArea txtconexionesactivas;
    private javax.swing.JTextField txtipdeurl;
    private javax.swing.JTextField txtiphost;
    private javax.swing.JTextField txtippublica;
    private javax.swing.JTextField txturl;
    // End of variables declaration                   
}
