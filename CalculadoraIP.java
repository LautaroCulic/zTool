
package ventanas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CalculadoraIP extends javax.swing.JFrame {
int x, y;
    public CalculadoraIP() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButtonMinimizarMenu = new javax.swing.JButton();
        jButtonVolverAMenu = new javax.swing.JButton();
        jLabelVersionMenu = new javax.swing.JLabel();
        q1 = new javax.swing.JTextField();
        mask = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        q3 = new javax.swing.JTextField();
        q4 = new javax.swing.JTextField();
        avalibleHost = new javax.swing.JTextField();
        avalibleNet = new javax.swing.JTextField();
        decBroadcast = new javax.swing.JTextField();
        decNetwork = new javax.swing.JTextField();
        decMask = new javax.swing.JTextField();
        decAddress = new javax.swing.JTextField();
        binBroadcast = new javax.swing.JTextField();
        binNetwork = new javax.swing.JTextField();
        binMask = new javax.swing.JTextField();
        binAddress = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        clearBtn = new javax.swing.JButton();
        calculateBtn = new javax.swing.JButton();
        jLabelIP = new javax.swing.JLabel();
        jLabelIP2 = new javax.swing.JLabel();
        jLabelIP3 = new javax.swing.JLabel();
        jLabelIP4 = new javax.swing.JLabel();
        jLabelq4 = new javax.swing.JLabel();
        jLabelq3 = new javax.swing.JLabel();
        jLabelq2 = new javax.swing.JLabel();
        jLabelq1 = new javax.swing.JLabel();
        JLabelTHD = new javax.swing.JLabel();
        jLabelIP5 = new javax.swing.JLabel();
        jLabelClase = new javax.swing.JLabel();
        jLabelBinario = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelMascara = new javax.swing.JLabel();
        jLabelNetwork = new javax.swing.JLabel();
        jLabelBroadcast = new javax.swing.JLabel();
        jLabelDecimal = new javax.swing.JLabel();
        jLabelDireccion2 = new javax.swing.JLabel();
        jLabelMascara2 = new javax.swing.JLabel();
        jLabelNetwork2 = new javax.swing.JLabel();
        jLabelBroadcast2 = new javax.swing.JLabel();
        jLabelRTD = new javax.swing.JLabel();
        jLabelLogo2 = new javax.swing.JLabel();
        jLabelMiNombre = new javax.swing.JLabel();
        jLabelMoverFrame = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabelVersionMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelVersionMenu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVersionMenu.setText("v-Final");
        getContentPane().add(jLabelVersionMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, -1, -1));

        q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1ActionPerformed(evt);
            }
        });
        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 60, -1));
        getContentPane().add(mask, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 60, -1));
        getContentPane().add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 60, -1));
        getContentPane().add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 60, -1));
        getContentPane().add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 60, -1));

        avalibleHost.setEditable(false);
        avalibleHost.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(avalibleHost, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 380, -1));

        avalibleNet.setEditable(false);
        avalibleNet.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(avalibleNet, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 380, -1));

        decBroadcast.setEditable(false);
        decBroadcast.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(decBroadcast, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 380, -1));

        decNetwork.setEditable(false);
        decNetwork.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(decNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 380, -1));

        decMask.setEditable(false);
        decMask.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(decMask, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 380, -1));

        decAddress.setEditable(false);
        decAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(decAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 380, -1));

        binBroadcast.setEditable(false);
        binBroadcast.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(binBroadcast, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 380, -1));

        binNetwork.setEditable(false);
        binNetwork.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(binNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 380, -1));

        binMask.setEditable(false);
        binMask.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(binMask, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 380, -1));

        binAddress.setEditable(false);
        binAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(binAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 380, -1));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 630, 10));

        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.jpg"))); // NOI18N
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtnMouseClicked(evt);
            }
        });
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 140, 50));

        calculateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calcular.jpg"))); // NOI18N
        calculateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calculateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateBtnMouseClicked(evt);
            }
        });
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(calculateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 140, 50));

        jLabelIP.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelIP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIP.setText("/");
        getContentPane().add(jLabelIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 10, 20));

        jLabelIP2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelIP2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIP2.setText(".");
        getContentPane().add(jLabelIP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 20, 10));

        jLabelIP3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelIP3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIP3.setText(".");
        getContentPane().add(jLabelIP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 10, 10));

        jLabelIP4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelIP4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIP4.setText(".");
        getContentPane().add(jLabelIP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 10, 10));

        jLabelq4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelq4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelq4.setText("0-255");
        getContentPane().add(jLabelq4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 40, -1));

        jLabelq3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelq3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelq3.setText("0-255");
        getContentPane().add(jLabelq3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 40, -1));

        jLabelq2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelq2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelq2.setText("0-255");
        getContentPane().add(jLabelq2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 40, -1));

        jLabelq1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelq1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelq1.setText("1-255");
        getContentPane().add(jLabelq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 40, -1));

        JLabelTHD.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        JLabelTHD.setForeground(new java.awt.Color(255, 255, 255));
        JLabelTHD.setText("TOTAL DE HOST DISPONIBLES:");
        getContentPane().add(JLabelTHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabelIP5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelIP5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIP5.setText("IP:");
        getContentPane().add(jLabelIP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jLabelClase.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabelClase.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabelBinario.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabelBinario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBinario.setText("BINARIO");
        getContentPane().add(jLabelBinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabelDireccion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDireccion.setText("DIRECCIÓN:");
        getContentPane().add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabelMascara.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelMascara.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMascara.setText("MÁSCARA:");
        getContentPane().add(jLabelMascara, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabelNetwork.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelNetwork.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNetwork.setText("NETWORK:");
        getContentPane().add(jLabelNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabelBroadcast.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelBroadcast.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBroadcast.setText("BROADCAST:");
        getContentPane().add(jLabelBroadcast, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabelDecimal.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabelDecimal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDecimal.setText("DECIMAL");
        getContentPane().add(jLabelDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        jLabelDireccion2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelDireccion2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDireccion2.setText("DIRECCIÓN:");
        getContentPane().add(jLabelDireccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabelMascara2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelMascara2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMascara2.setText("MÁSCARA:");
        getContentPane().add(jLabelMascara2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabelNetwork2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelNetwork2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNetwork2.setText("NETWORK:");
        getContentPane().add(jLabelNetwork2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabelBroadcast2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelBroadcast2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBroadcast2.setText("BROADCAST:");
        getContentPane().add(jLabelBroadcast2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabelRTD.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelRTD.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRTD.setText("TOTAL DE RED DISPONIBLE:");
        getContentPane().add(jLabelRTD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

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
        jLabelLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 1130, 580));

        pack();
    }// </editor-fold>                        

    private void jButtonMinimizarMenuActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        this.setExtendedState(ICONIFIED);
    }                                                    

    private void jButtonVolverAMenuActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        this.dispose();
        Menu abrir =new Menu();
        abrir.setVisible(true);
    }                                                  

    private void q1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        
    }                                  

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         

    }                                        

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {                                             

    }                                            

    private void calculateBtnMouseClicked(java.awt.event.MouseEvent evt) {                                          
    
        String bq1 = Integer.toBinaryString(Integer.parseInt(q1.getText()));
        String bq2 = Integer.toBinaryString(Integer.parseInt(q2.getText()));
        String bq3 = Integer.toBinaryString(Integer.parseInt(q3.getText()));
        String bq4 = Integer.toBinaryString(Integer.parseInt(q4.getText()));
        
        String ipByte1 = String.format("%08d", Integer.parseInt(bq1));
        String ipByte2 = String.format("%08d", Integer.parseInt(bq2));
        String ipByte3 = String.format("%08d", Integer.parseInt(bq3));
        String ipByte4 = String.format("%08d", Integer.parseInt(bq4));
        
        int bitMask = Integer.valueOf(mask.getText());
        
        int ipBin = Integer.parseInt(ipByte1+ipByte2+ipByte3,2);
        
        ipBin = (ipBin << 8) + Integer.parseInt(ipByte4,2);
        
        int maskBin = ~0 << (32-bitMask);
        
        int netBin = ipBin & maskBin;
        
        int bcBin = ipBin | ~maskBin;
        
        String strIpBin = Integer.toBinaryString(ipBin);
        strIpBin = String.format("%32s", strIpBin).replace(" ", "0");
        String[] printIpBin =strIpBin.split("(?<=\\G........)");
        
            String strMaskBin = Integer.toBinaryString(maskBin);
            strMaskBin = String.format("%32s", strMaskBin).replace(" ", "0");
            String[] printMaskBin =strMaskBin.split("(?<=\\G........)");
        
                String strNetBin = Integer.toBinaryString(netBin);
                strNetBin = String.format("%32s", strNetBin).replace(" ", "0");
                String[] printNetBin =strNetBin.split("(?<=\\G........)");
                
                String strBcBin = Integer.toBinaryString(bcBin);
                strBcBin = String.format("%32s", strBcBin).replace(" ", "0");
                String[] printBcBin =strBcBin.split("(?<=\\G........)");
                
        binAddress.setText(printBcBin[0]+"."+printIpBin[1]+"."+printIpBin[2]+"."+printIpBin[3]);
        
            binMask.setText(printMaskBin[0]+"."+printMaskBin[1]+"."+printMaskBin[2]+"."+printMaskBin[3]);
                
                binNetwork.setText(printNetBin[0]+"."+printNetBin[1]+"."+printNetBin[2]+"."+printNetBin[3]);
                
                binBroadcast.setText(printBcBin[0]+"."+printBcBin[1]+"."+printBcBin[2]+"."+printBcBin[3]);
        
                
                
        decAddress.setText(
                q1.getText()+"."+
                q2.getText()+"."+
                q3.getText()+"."+
                q4.getText()
        );
        
        decMask.setText(
                String.valueOf(Integer.parseInt(printMaskBin[0],2)) + "."+
                String.valueOf(Integer.parseInt(printMaskBin[1],2)) + "."+
                String.valueOf(Integer.parseInt(printMaskBin[2],2)) + "."+
                String.valueOf(Integer.parseInt(printMaskBin[3],2))
        );
        
        decNetwork.setText(
                String.valueOf(Integer.parseInt(printNetBin[0],2)) + "."+
                String.valueOf(Integer.parseInt(printNetBin[1],2)) + "."+
                String.valueOf(Integer.parseInt(printNetBin[2],2)) + "."+
                String.valueOf(Integer.parseInt(printNetBin[3],2))
        );
        
        decBroadcast.setText(
                String.valueOf(Integer.parseInt(printBcBin[0],2)) + "."+
                String.valueOf(Integer.parseInt(printBcBin[1],2)) + "."+
                String.valueOf(Integer.parseInt(printBcBin[2],2)) + "."+
                String.valueOf(Integer.parseInt(printBcBin[3],2))
        );
        
        
        avalibleHost.setText(String.valueOf(~maskBin -1));
        avalibleNet.setText(String.valueOf( ~ (~0 << bitMask) +1 ));
        
        int[] oct ={
            Integer.valueOf(q1.getText()),
            Integer.valueOf(q2.getText()),
            Integer.valueOf(q3.getText()),
            Integer.valueOf(q4.getText())
        };
               
        
        
        if ((oct[0]>=1) && (oct[0]<=126)){
            jLabelClase.setText("CLASE A");
        }else if((oct[0]>=127) && (oct[0]<=191)){
            jLabelClase.setText("CLASE B");
        }else if((oct[0]>=192) && (oct[0]<=223)){
            jLabelClase.setText("CLASE C");
        }else if((oct[0]>=224) && (oct[0]<=239)){
            jLabelClase.setText("CLASE D");
        }else if((oct[0]>=240) && (oct[0]<=255)){
            jLabelClase.setText("CLASE E");
        }
        
        if ((oct[0]==0) || (oct[0]>255) || (oct[1]>255) || (oct[2]>255) || (oct[3]>255)){
            JOptionPane.showMessageDialog(null, "No existe en el rango de IPv4.");
        }
    }                                         

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {                                      
        binAddress.setText("");
        binMask.setText("");
        binNetwork.setText("");
        binBroadcast.setText("");
        
            decAddress.setText("");
            decMask.setText("");
            decNetwork.setText("");
            decBroadcast.setText("");
            
                avalibleHost.setText("");
                avalibleNet.setText("");
                
                    q1.setText("");
                    q2.setText("");
                    q3.setText("");
                    q4.setText("");
                    mask.setText("");
                    
                        jLabelClase.setText("");
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
            java.util.logging.Logger.getLogger(CalculadoraIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraIP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel JLabelTHD;
    private javax.swing.JTextField avalibleHost;
    private javax.swing.JTextField avalibleNet;
    private javax.swing.JTextField binAddress;
    private javax.swing.JTextField binBroadcast;
    private javax.swing.JTextField binMask;
    private javax.swing.JTextField binNetwork;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField decAddress;
    private javax.swing.JTextField decBroadcast;
    private javax.swing.JTextField decMask;
    private javax.swing.JTextField decNetwork;
    private javax.swing.JButton jButtonMinimizarMenu;
    private javax.swing.JButton jButtonVolverAMenu;
    private javax.swing.JLabel jLabelBinario;
    private javax.swing.JLabel jLabelBroadcast;
    private javax.swing.JLabel jLabelBroadcast2;
    private javax.swing.JLabel jLabelClase;
    private javax.swing.JLabel jLabelDecimal;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelDireccion2;
    private javax.swing.JLabel jLabelIP;
    private javax.swing.JLabel jLabelIP2;
    private javax.swing.JLabel jLabelIP3;
    private javax.swing.JLabel jLabelIP4;
    private javax.swing.JLabel jLabelIP5;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLogo2;
    private javax.swing.JLabel jLabelMascara;
    private javax.swing.JLabel jLabelMascara2;
    private javax.swing.JLabel jLabelMiNombre;
    private javax.swing.JLabel jLabelMoverFrame;
    private javax.swing.JLabel jLabelNetwork;
    private javax.swing.JLabel jLabelNetwork2;
    private javax.swing.JLabel jLabelRTD;
    private javax.swing.JLabel jLabelVersionMenu;
    private javax.swing.JLabel jLabelq1;
    private javax.swing.JLabel jLabelq2;
    private javax.swing.JLabel jLabelq3;
    private javax.swing.JLabel jLabelq4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField mask;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    // End of variables declaration                   
}
