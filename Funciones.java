
package ventanas;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import javax.swing.ImageIcon;

public class Funciones extends javax.swing.JFrame {
int x, y;
    public Funciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtotrasfunciones = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jButtonMinimizarMenu = new javax.swing.JButton();
        jButtonVolverAMenu = new javax.swing.JButton();
        btnTraceroute = new javax.swing.JButton();
        btnconexionesactivas1 = new javax.swing.JButton();
        btnHacerPing = new javax.swing.JButton();
        btnPathping = new javax.swing.JButton();
        btnTablaARP = new javax.swing.JButton();
        btnTablaDeEnrutamiento = new javax.swing.JButton();
        txtPathping = new javax.swing.JTextField();
        txtCurl = new javax.swing.JTextField();
        txtTraceroute = new javax.swing.JTextField();
        txtHacerPing = new javax.swing.JTextField();
        jLabelVersionMenu = new javax.swing.JLabel();
        jLabelLogo2 = new javax.swing.JLabel();
        jLabelMiNombre = new javax.swing.JLabel();
        jLabelMoverFrame = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        txtotrasfunciones.setEditable(false);
        txtotrasfunciones.setColumns(20);
        txtotrasfunciones.setRows(5);
        jScrollPane1.setViewportView(txtotrasfunciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 810, 310));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 810, 10));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 10, 150));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 10, 150));

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

        jButtonVolverAMenu.setBackground(new java.awt.Color(153, 153, 153));
        jButtonVolverAMenu.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButtonVolverAMenu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVolverAMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.jpg"))); // NOI18N
        jButtonVolverAMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVolverAMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverAMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolverAMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 110, 40));

        btnTraceroute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/traceroute.jpg"))); // NOI18N
        btnTraceroute.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTraceroute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTracerouteMouseClicked(evt);
            }
        });
        btnTraceroute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTracerouteActionPerformed(evt);
            }
        });
        getContentPane().add(btnTraceroute, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 30));

        btnconexionesactivas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/curl.jpg"))); // NOI18N
        btnconexionesactivas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconexionesactivas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnconexionesactivas1MouseClicked(evt);
            }
        });
        btnconexionesactivas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconexionesactivas1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnconexionesactivas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 260, 30));

        btnHacerPing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hacerping.jpg"))); // NOI18N
        btnHacerPing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHacerPing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHacerPingMouseClicked(evt);
            }
        });
        btnHacerPing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHacerPingActionPerformed(evt);
            }
        });
        getContentPane().add(btnHacerPing, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, 30));

        btnPathping.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pathping.jpg"))); // NOI18N
        btnPathping.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPathping.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPathpingMouseClicked(evt);
            }
        });
        btnPathping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPathpingActionPerformed(evt);
            }
        });
        getContentPane().add(btnPathping, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 260, 30));

        btnTablaARP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arp.JPG"))); // NOI18N
        btnTablaARP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTablaARP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablaARPActionPerformed(evt);
            }
        });
        getContentPane().add(btnTablaARP, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 150, 60));

        btnTablaDeEnrutamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tabladeenrutamiento.jpg"))); // NOI18N
        btnTablaDeEnrutamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTablaDeEnrutamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablaDeEnrutamientoActionPerformed(evt);
            }
        });
        getContentPane().add(btnTablaDeEnrutamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 150, 60));

        txtPathping.setText("Inserte una IP o dirección web. (Demora demasiado)");
        txtPathping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPathpingActionPerformed(evt);
            }
        });
        getContentPane().add(txtPathping, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 260, 30));

        txtCurl.setText("Inserte una IP o dirección web.");
        txtCurl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurlActionPerformed(evt);
            }
        });
        getContentPane().add(txtCurl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 260, 30));

        txtTraceroute.setText("Inserte una IP o dirección web. (Puede demorar)");
        txtTraceroute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTracerouteActionPerformed(evt);
            }
        });
        getContentPane().add(txtTraceroute, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, 30));

        txtHacerPing.setText("Inserte una IP o dirección web.");
        getContentPane().add(txtHacerPing, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 260, 30));

        jLabelVersionMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelVersionMenu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVersionMenu.setText("v-Final");
        getContentPane().add(jLabelVersionMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, -1, -1));

        jLabelLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabelLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, -1, 180));

        jLabelMiNombre.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabelMiNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMiNombre.setText("Lautaro Culic'");
        getContentPane().add(jLabelMiNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 450, 80, -1));

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
        getContentPane().add(jLabelMoverFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 510));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondohacker.jpg"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 1130, 580));

        pack();
    }// </editor-fold>                        

    private void jButtonVolverAMenuActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        this.dispose();
        Menu abrir =new Menu();
        abrir.setVisible(true);
    }                                                  

    private void jButtonMinimizarMenuActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        this.setExtendedState(ICONIFIED);
    }                                                    

    private void btnTracerouteMouseClicked(java.awt.event.MouseEvent evt) {                                           

    }                                          

    private void btnTracerouteActionPerformed(java.awt.event.ActionEvent evt) {                                              

        if (Desktop.isDesktopSupported()) {
            try {
                Process process = Runtime.getRuntime().exec("tracert -d "+txtTraceroute.getText());

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
                        txtotrasfunciones.append(line+"\n");}
                   
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }

    }                                             

    private void btnconexionesactivas1MouseClicked(java.awt.event.MouseEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void btnconexionesactivas1ActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        
        if (Desktop.isDesktopSupported()) {
            try {
                Process process = Runtime.getRuntime().exec("curl "+txtCurl.getText());

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
                        txtotrasfunciones.append(line+"\n");}
                   
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        
    }                                                     

    private void btnHacerPingMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void btnHacerPingActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        if (Desktop.isDesktopSupported()) {
            try {
                Process process = Runtime.getRuntime().exec("ping "+txtHacerPing.getText());

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
                        txtotrasfunciones.append(line+"\n");}
                   
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        
    }                                            

    private void btnPathpingMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnPathpingActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
        if (Desktop.isDesktopSupported()) {
            try {
                Process process = Runtime.getRuntime().exec("pathping "+txtPathping.getText());

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
                        txtotrasfunciones.append(line+"\n");}
                   
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        
    }                                           

    private void btnTablaARPActionPerformed(java.awt.event.ActionEvent evt) {                                            

        if (Desktop.isDesktopSupported()) {
            try {
                Process process = Runtime.getRuntime().exec("arp -a");

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
                        txtotrasfunciones.append(line+"\n");}
                   
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        
    }                                           

    private void btnTablaDeEnrutamientoActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        
        if (Desktop.isDesktopSupported()) {
            try {
                Process process = Runtime.getRuntime().exec("route PRINT");

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
                        txtotrasfunciones.append(line+"\n");}
                   
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        
    }                                                      

    private void txtTracerouteActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void txtPathpingActionPerformed(java.awt.event.ActionEvent evt) {                                            
         // TODO add your handling code here:
    }                                           

    private void txtCurlActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void jLabelMoverFrameMouseDragged(java.awt.event.MouseEvent evt) {                                              

        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);

    }                                             

    private void jLabelMoverFrameMousePressed(java.awt.event.MouseEvent evt) {                                              

        x = evt.getX();
        y = evt.getY();

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
            java.util.logging.Logger.getLogger(Funciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Funciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Funciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Funciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Funciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnHacerPing;
    private javax.swing.JButton btnPathping;
    private javax.swing.JButton btnTablaARP;
    private javax.swing.JButton btnTablaDeEnrutamiento;
    private javax.swing.JButton btnTraceroute;
    private javax.swing.JButton btnconexionesactivas1;
    private javax.swing.JButton jButtonMinimizarMenu;
    private javax.swing.JButton jButtonVolverAMenu;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLogo2;
    private javax.swing.JLabel jLabelMiNombre;
    private javax.swing.JLabel jLabelMoverFrame;
    private javax.swing.JLabel jLabelVersionMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField txtCurl;
    private javax.swing.JTextField txtHacerPing;
    private javax.swing.JTextField txtPathping;
    private javax.swing.JTextField txtTraceroute;
    private javax.swing.JTextArea txtotrasfunciones;
    // End of variables declaration                   
}
