
package InterfazAlumno;

import Clases.Alumno;
import Clases.Fecha;
import Clases.Prestamo;
import Conexion.MetodosConexionPrestamoTesis;

import Conexion.MetodosConexionTesis;
import EstructuraLista_PrestamoTesis.Lista_Prestamo;
import EstructuraLista_PrestamoTesis.Nodo_Prestamo;


import EstructuraLista_Tesis.Lista_Tesis;
import EstructuraLista_Tesis.Nodo_Tesis;
import java.awt.HeadlessException;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;


public class InterfazPrestamoTesis extends javax.swing.JFrame {
   //  ArbolAVL arbolA=new ArbolAVL();
    public Alumno a;
 //lista de tesis
   Lista_Tesis listaTesis = new Lista_Tesis();
   //lista de prestamos
 Lista_Prestamo listaPrestamos=new Lista_Prestamo();
   
   
    public InterfazPrestamoTesis() {
        
    initComponents();
     //centra la pantalla
     this.setLocationRelativeTo(null);
      cargarImagen();

        
    //no se carga los datos al arbolpor que no modifica
    //ni elimino tesis ,solo se hace busqueda,y se hace por todos sus datos
   // no solo por el codigo en el que esta ordenado el arbol)
   //a diferencia de lalista doble de las tesis que se ordena segun lo que solicites
   //y lo busca segun lo que requieras
    MetodosConexionTesis.extraerDatosTesisBaseDatosListaDoble(listaTesis);
   
   MetodosConexionPrestamoTesis.extraerDatosPrestamosBaseDatosLista(listaPrestamos);
         
      mostrarTesis();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 204));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Nombre Autor", "Apellido Autor", "Nombre Asesor", "Apellido Asesor", "Facultad", "Año Publicacion", "Tipo de Tesis", "Estado"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("REGISTRAR PRESTAMO");
        jButton8.setToolTipText("guardado en una lista");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSQUEDA POR:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setToolTipText("busquedas por listas");
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setText("TODO");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("CODIGO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("TITULO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("AUTOR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("ASESOR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("FACULTAD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("TIPO DE TESIS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("AÑO DE PUBLICACION");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton16.setText("DETALLES DE TESIS");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jButton8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(996, 996, 996))
        );

        jTabbedPane1.addTab("SOLICITUD DE TESIS", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Tesis", "Titulo de Tesis", "Dia Prestamo", "Mes Prestamo", "Año Prestamo"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Codigo:");

        jTextField1.setText("jTextField1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        jTextField2.setText("jTextField2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Apellido:");

        jTextField3.setText("jTextField3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Facultad:");

        jTextField4.setText("jTextField4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Año de Ingreso:");

        jTextField5.setText("jTextField5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel1))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel4)))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Cantidad:");

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ORDENAR POR:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel6.setToolTipText("ordenar por listas");
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setText("CODIGO");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11);

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setText("TITULO");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12);

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton13.setText("DIA");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton13);

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.setText("MES");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton14);

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton15.setText("AÑO");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton15);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("HISTORIAL DE PRESTAMOS", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("VOLVER");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton9))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        MetodosConexionTesis.guardarTesisBaseDatosListaDoble(listaTesis);
      // MetodosConexionPrestamoTesis.guardarPestamosBaseDatosLista(listaPrestamos);
        LoginAlumno lA=new LoginAlumno();
        lA.setVisible(true);
        dispose();


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        mostrarTesis();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //buca por autor
        String au=JOptionPane.showInputDialog("Ingrese Apellido del Autor:");
        mostrarTesisAutor(au);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String f=JOptionPane.showInputDialog("Ingrese facultad:\n1.Software\n2.Sistemas");
        mostrarTesisFacultad(f);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //buca por titulo
        String t=JOptionPane.showInputDialog("Ingrese Titulo de la Tesis: ");
        mostrarTesisTitulo(t);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //buca por codigo de Tesis
        int c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Codigo Tesis:"));
        mostrarTesisCodigo(c);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        //buca por año de publicacion
        int aa=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Año Publicaion:"));
        mostrarTesisAnio(aa);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //buca por asesor
        String as=JOptionPane.showInputDialog("Ingrese Apellido del Asesor:");
        mostrarTesisAsesor(as);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //buca por tipo de tesis
        String t=JOptionPane.showInputDialog("Ingrese Tipo de Tesis:\n1.Pregrado\n2.Postgrado");
        mostrarTesisTipo(t);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        
     prestamoTesis();
     //actualiza las tesis
     mostrarTesis();
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
 mostrarPrestamos(Integer.parseInt(jTextField1.getText()));


     
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked



           
      
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed

    }//GEN-LAST:event_jTable1KeyPressed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

detallesTesis();
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
            listaPrestamos.ordenarPorBurbujaCodigoTesis();
         mostrarPrestamos(Integer.parseInt(jTextField1.getText()));

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
listaPrestamos.ordenarPorBurbujaTitulo();
         mostrarPrestamos(Integer.parseInt(jTextField1.getText()));



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
listaPrestamos.ordenarPorBurbujaDia();
         mostrarPrestamos(Integer.parseInt(jTextField1.getText()));
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

listaPrestamos.ordenarPorBurbujaMes();
         mostrarPrestamos(Integer.parseInt(jTextField1.getText()));
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
      listaPrestamos.ordenarPorBurbujaAnio();
         mostrarPrestamos(Integer.parseInt(jTextField1.getText()));
    }//GEN-LAST:event_jButton15ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazPrestamoTesis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrestamoTesis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrestamoTesis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrestamoTesis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrestamoTesis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
//------------prestamo de tesis----------
     private void prestamoTesis(){
         
          //FECHA DEL SISTEMA
         Date sistFecha = new Date();
        SimpleDateFormat d=new SimpleDateFormat("d");
        SimpleDateFormat m=new SimpleDateFormat("M");
         SimpleDateFormat aa=new SimpleDateFormat("Y");
     
        int dia=Integer.parseInt(d.format(sistFecha));
       int mes=Integer.parseInt(m.format(sistFecha));
        int anio=Integer.parseInt(aa.format(sistFecha));
        
  int filaseleccionada;
        try{
            //Guardamos en un entero la fila seleccionada.
            filaseleccionada = jTable1.getSelectedRow();
            if (filaseleccionada == -1){
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila!");
            } else {
  
                int codigo = (int)jTable1.getValueAt(filaseleccionada, 0);
                String titulo = (String)jTable1.getValueAt(filaseleccionada, 1);
              int estado = (int)jTable1.getValueAt(filaseleccionada, 9);
                
                  
                  
                if(estado==0){
    JOptionPane.showMessageDialog(null,"Tesis Prestada,Elegir otra Tesis!");
                   
                  
                }else{
                    Fecha f=new Fecha(dia,mes,anio);
                    Prestamo p =new Prestamo(Integer.parseInt(jTextField1.getText()),
                     codigo,titulo,f);
                    
                    
                    listaPrestamos.insertarAlInicio(p);
                    listaTesis.modificarPorEstado(codigo);//de 1 a 0
                    
                    JOptionPane.showMessageDialog(null,"Prestamo Exitoso!");
                }

            }
        }catch (HeadlessException ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex+"\nInténtelo nuevamente", " .::Error En la Operacion::." ,JOptionPane.ERROR_MESSAGE);
        } 

    }
//--------------------detalles de libro----------------------
   private void detallesTesis(){
      
  int filaseleccionada;
        try{
            //Guardamos en un entero la fila seleccionada.
            filaseleccionada = jTable1.getSelectedRow();
            if (filaseleccionada == -1){
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila!");
            } else {
  
                int codigo = (int)jTable1.getValueAt(filaseleccionada, 0);
                String titulo = (String)jTable1.getValueAt(filaseleccionada, 1);
                String nomAutor = (String)jTable1.getValueAt(filaseleccionada, 2);
                String apeAutor = (String)jTable1.getValueAt(filaseleccionada, 3);
               String nomAsesor = (String)jTable1.getValueAt(filaseleccionada, 4);
                String apeAsesor = (String)jTable1.getValueAt(filaseleccionada, 5);
                String facultad = (String)jTable1.getValueAt(filaseleccionada, 6);
                int anio = (int)jTable1.getValueAt(filaseleccionada, 7);
                 String tipo = (String)jTable1.getValueAt(filaseleccionada, 8);
                  int estado = (int)jTable1.getValueAt(filaseleccionada, 9);
                  
                  
                if(estado==0){
    JOptionPane.showMessageDialog(null,"Codigo: "+codigo+"\n"
            + "titulo: "+titulo+"\nNombre Autor: "+nomAutor+"\nApellido Autor: "
            + apeAutor+"\nNombre Asesor: "+nomAsesor+"\n"
            + "Apellido Asesor: "+apeAsesor+"\nFacultad: "+facultad+"\n"
                    + "Año de Publicacion: "+anio+"\nTipo de Tesis: "+
            tipo+"\nEstado: Tesis Prestada");
                   
                  
                }else{
             JOptionPane.showMessageDialog(null,"Codigo: "+codigo+"\n"
            + "titulo: "+titulo+"\nNombre Autor: "+nomAutor+"\nApellido Autor: "
            + apeAutor+"\nNombre Asesor: "+nomAsesor+"\n"
            + "Apellido Asesor: "+apeAsesor+"\nFacultad: "+facultad+"\n"
                    + "Año de Publicacion: "+anio+"\nTipo de Tesis: "+
            tipo+"\nEstado: Tesis No Prestada");
                }

            }
        }catch (HeadlessException ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex+"\nInténtelo nuevamente", " .::Error En la Operacion::." ,JOptionPane.ERROR_MESSAGE);
        } 

    }

//---------------codigo para mostraar prestmos de un alumno--------
    private void mostrarPrestamos(int cod){
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
       int cont=0;
        dtm.setRowCount(0);
        
        
        Nodo_Prestamo aux=listaPrestamos.cabecera;
        while(aux!=null){
           if(aux.p.codigoAlumno==cod){
            dtm.addRow(new Object[]{aux.p.codigoTesis,
            aux.p.titulo,aux.p.fechaPrestamo.dia
                    ,aux.p.fechaPrestamo.mes,aux.p.fechaPrestamo.año});
            cont++;
           }
        aux=aux.sig;
        
        }
        jTextField6.setText(String.valueOf(cont));
        
    }
    //-------------------------codigos para mostrar en la tabla de tesis----------
private void mostrarTesis(){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
       
        dtm.setRowCount(0);
        
        
        Nodo_Tesis aux=listaTesis.cabecera;
        while(aux!=null){
           
            dtm.addRow(new Object[]{aux.t.codigoTesis,
                aux.t.titulo, aux.t.autor.nombre, 
                aux.t.autor.apellido,aux.t.asesor.nombre,
            aux.t.asesor.apellido,aux.t.facultad,
            aux.t.publicacion.año,aux.t.tipoTesis,aux.t.estado});
         
        aux=aux.sig;
        
        
        
        }
        
    }

private void mostrarTesisCodigo(int a){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
       
        dtm.setRowCount(0);
        
        
        Nodo_Tesis aux=listaTesis.cabecera;
        while(aux!=null){
            if(aux.t.codigoTesis==a){
            
            dtm.addRow(new Object[]{aux.t.codigoTesis,
                aux.t.titulo, aux.t.autor.nombre, 
                aux.t.autor.apellido,aux.t.asesor.nombre,
            aux.t.asesor.apellido,aux.t.facultad,
            aux.t.publicacion.año,aux.t.tipoTesis,aux.t.estado});
            }
        aux=aux.sig;
        
        
        
        }
        
    }
private void mostrarTesisTitulo(String e){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
       
        dtm.setRowCount(0);
        
        
        Nodo_Tesis aux=listaTesis.cabecera;
        while(aux!=null){
            if(aux.t.titulo.equalsIgnoreCase(e)){
            
            dtm.addRow(new Object[]{aux.t.codigoTesis,
                aux.t.titulo, aux.t.autor.nombre, 
                aux.t.autor.apellido,aux.t.asesor.nombre,
            aux.t.asesor.apellido,aux.t.facultad,
            aux.t.publicacion.año,aux.t.tipoTesis,aux.t.estado});
            }
        aux=aux.sig;
        
        
        
        }
        
    }
private void mostrarTesisAutor(String e){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
       
        dtm.setRowCount(0);
        
        
        Nodo_Tesis aux=listaTesis.cabecera;
        while(aux!=null){
            if(aux.t.autor.getApellido().equalsIgnoreCase(e)){
            
            dtm.addRow(new Object[]{aux.t.codigoTesis,
                aux.t.titulo, aux.t.autor.nombre, 
                aux.t.autor.apellido,aux.t.asesor.nombre,
            aux.t.asesor.apellido,aux.t.facultad,
            aux.t.publicacion.año,aux.t.tipoTesis,aux.t.estado});
            }
        aux=aux.sig;
        
        
        
        }
        
    }
private void mostrarTesisFacultad(String e){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
       
        dtm.setRowCount(0);
        
        
        Nodo_Tesis aux=listaTesis.cabecera;
        while(aux!=null){
            if(aux.t.facultad.equalsIgnoreCase(e)){
            
            dtm.addRow(new Object[]{aux.t.codigoTesis,
                aux.t.titulo, aux.t.autor.nombre, 
                aux.t.autor.apellido,aux.t.asesor.nombre,
            aux.t.asesor.apellido,aux.t.facultad,
            aux.t.publicacion.año,aux.t.tipoTesis,aux.t.estado});
            }
        aux=aux.sig;
        
        
        
        }
        
    }

private void mostrarTesisAsesor(String e){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
       
        dtm.setRowCount(0);
        
        
        Nodo_Tesis aux=listaTesis.cabecera;
        while(aux!=null){
            if(aux.t.asesor.apellido.equalsIgnoreCase(e)){
            
            dtm.addRow(new Object[]{aux.t.codigoTesis,
                aux.t.titulo, aux.t.autor.nombre, 
                aux.t.autor.apellido,aux.t.asesor.nombre,
            aux.t.asesor.apellido,aux.t.facultad,
            aux.t.publicacion.año,aux.t.tipoTesis,aux.t.estado});
            }
        aux=aux.sig;
        
        
        
        }
        
    }

private void mostrarTesisTipo(String e){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
       
        dtm.setRowCount(0);
        
        
        Nodo_Tesis aux=listaTesis.cabecera;
        while(aux!=null){
            if(aux.t.tipoTesis.equalsIgnoreCase(e)){
            
            dtm.addRow(new Object[]{aux.t.codigoTesis,
                aux.t.titulo, aux.t.autor.nombre, 
                aux.t.autor.apellido,aux.t.asesor.nombre,
            aux.t.asesor.apellido,aux.t.facultad,
            aux.t.publicacion.año,aux.t.tipoTesis,aux.t.estado});
            }
        aux=aux.sig;
        
        
        
        }
        
    }

private void mostrarTesisAnio (int a){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
       
        dtm.setRowCount(0);
        
        
        Nodo_Tesis aux=listaTesis.cabecera;
        while(aux!=null){
            if(aux.t.publicacion.año==a){
            
            dtm.addRow(new Object[]{aux.t.codigoTesis,
                aux.t.titulo, aux.t.autor.nombre, 
                aux.t.autor.apellido,aux.t.asesor.nombre,
            aux.t.asesor.apellido,aux.t.facultad,
            aux.t.publicacion.año,aux.t.tipoTesis,aux.t.estado});
            }
        aux=aux.sig;
        
        
        
        }
        
    }
//-------------------muestra los datos del alumno actual-------------------
public void mostrarDatosAlumnoActual(){
        jTextField1.setText(String.valueOf(a.codigoAlumno));
         jTextField2.setText(a.nombre);
         jTextField3.setText(a.apellido);
         jTextField4.setText(a.facultad);
         jTextField5.setText(String.valueOf(a.anioIngreso));
}
//-------------------------------carga la imagen de usuario y lo ajusta a label-------
private void cargarImagen(){

    ImageIcon fot = new ImageIcon("src/Imagenes/usuario.png");
    Icon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_DEFAULT));
    jLabel6.setIcon(icono);
    this.repaint();
}
}
