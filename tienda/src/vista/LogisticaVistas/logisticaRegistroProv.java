package vista.LogisticaVistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author orlan
 */
public class logisticaRegistroProv extends javax.swing.JFrame {

   FondoPanel FondoPanel=new FondoPanel();
    public logisticaRegistroProv() {
        this.setLocationRelativeTo(null);
        this.setContentPane(FondoPanel);
        setIconImage(new ImageIcon(getClass().getResource("/image/logoDiscord.png")).getImage());
        initComponents();
        
        ImageIcon fondoboton=new ImageIcon(getClass().getResource("/image/exit.png"));
        Icon fondo1=new ImageIcon(fondoboton.getImage().getScaledInstance(66,56, Image.SCALE_AREA_AVERAGING));
        Icon fondo1press=new ImageIcon(fondoboton.getImage().getScaledInstance(60,50, Image.SCALE_AREA_AVERAGING));
        botonSalirLogRegProv.setIcon(fondo1);
        botonSalirLogRegProv.setPressedIcon(fondo1press);
        botonSalirLogRegProv.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new userSilueta();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(1318, 373));

        jPanel2.setBackground(new java.awt.Color(90, 250, 210, 120));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 55));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Razón Social");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Representante");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Teléfono");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Distrito");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Descripción");

        textRazonSocial.setBackground(new java.awt.Color(196, 196, 196));
        textRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textRazonSocialKeyTyped(evt);
            }
        });

        textTelefono.setBackground(new java.awt.Color(196, 196, 196));
        textTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textTelefonoKeyTyped(evt);
            }
        });

        textRepresentante.setBackground(new java.awt.Color(196, 196, 196));
        textRepresentante.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        textRepresentante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textRepresentanteKeyTyped(evt);
            }
        });

        textDistrito.setBackground(new java.awt.Color(196, 196, 196));
        textDistrito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textDistritoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("RUC");

        textRUC.setBackground(new java.awt.Color(196, 196, 196));
        textRUC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textRUCKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Estado");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Dirección");

        comboBoxEstadoCivil.setBackground(new java.awt.Color(196, 196, 196));
        comboBoxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Activo", "Inactivo" }));

        textEmail.setBackground(new java.awt.Color(196, 196, 196));
        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });
        textEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textEmailKeyTyped(evt);
            }
        });

        textDireccion.setBackground(new java.awt.Color(196, 196, 196));
        textDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textDireccionKeyTyped(evt);
            }
        });

        textAreaDescripcion.setBackground(new java.awt.Color(196, 196, 196));
        textAreaDescripcion.setColumns(20);
        textAreaDescripcion.setRows(5);
        textAreaDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAreaDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textAreaDescripcion);

        botonRegistrarLogisiticaProveedor.setBackground(new java.awt.Color(0, 0, 0));
        botonRegistrarLogisiticaProveedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonRegistrarLogisiticaProveedor.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrarLogisiticaProveedor.setText("¡Registrar!");
        botonRegistrarLogisiticaProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarLogisiticaProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(30, 30, 30)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(56, 56, 56)
                                    .addComponent(textRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(43, 43, 43)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addGap(38, 38, 38)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(botonRegistrarLogisiticaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(textRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel7)
                        .addComponent(comboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textRepresentante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(botonRegistrarLogisiticaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setText("Registro de Proveedores");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(72, 104, 218));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(285, 486));

        registrarProveedorLogistica.setBackground(new java.awt.Color(72, 104, 218));
        registrarProveedorLogistica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registrarProveedorLogistica.setForeground(new java.awt.Color(255, 255, 255));
        registrarProveedorLogistica.setHideActionText(true);
        registrarProveedorLogistica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registrarProveedorLogistica.setText("<html><p>REGISTRAR</p><p>PROVEEDOR</p></html>");
        registrarProveedorLogistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProveedorLogisticaActionPerformed(evt);
            }
        });

        modificarEliminarBuscarProveedor.setBackground(new java.awt.Color(72, 104, 218));
        modificarEliminarBuscarProveedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modificarEliminarBuscarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        modificarEliminarBuscarProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modificarEliminarBuscarProveedor.setPreferredSize(new java.awt.Dimension(153, 23));
        modificarEliminarBuscarProveedor.setText("<html><center><p>    MODIFICAR/</p><p>ELIMINAR PROVEEDOR</p></center></html>");
        modificarEliminarBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarEliminarBuscarProveedorActionPerformed(evt);
            }
        });

        registrarProductoLogistica.setBackground(new java.awt.Color(72, 104, 218));
        registrarProductoLogistica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registrarProductoLogistica.setForeground(new java.awt.Color(255, 255, 255));
        registrarProductoLogistica.setText("REGISTRAR PRODUCTO");
        registrarProductoLogistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProductoLogisticaActionPerformed(evt);
            }
        });

        editarProductoLogistica.setBackground(new java.awt.Color(72, 104, 218));
        editarProductoLogistica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editarProductoLogistica.setForeground(new java.awt.Color(255, 255, 255));
        editarProductoLogistica.setText("MODIFICAR/ELIMINAR PRODUCTO");
        editarProductoLogistica.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        editarProductoLogistica.setText("<html><CENTER><p>MODIFICAR</p><p>ELIMINAR PRODUCTO</p></center></html>");

        jPanel6.setPreferredSize(new java.awt.Dimension(77, 71));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("(Logisitica)");

        registrarCategorialogisticaRProv.setBackground(new java.awt.Color(72, 104, 218));
        registrarCategorialogisticaRProv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registrarCategorialogisticaRProv.setForeground(new java.awt.Color(255, 255, 255));
        registrarCategorialogisticaRProv.setText("Añadir Categoría Productos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonSalirLogRegProv, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(editarProductoLogistica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(registrarProductoLogistica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registrarProveedorLogistica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificarEliminarBuscarProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registrarCategorialogisticaRProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(57, 57, 57)
                .addComponent(registrarProveedorLogistica, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(modificarEliminarBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(registrarProductoLogistica, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(editarProductoLogistica, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrarCategorialogisticaRProv, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalirLogRegProv, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(410, 66));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DE COMPRAS! - STORE ");
        jLabel12.setMaximumSize(new java.awt.Dimension(369, 44));
        jLabel12.setMinimumSize(new java.awt.Dimension(369, 44));
        jLabel12.setPreferredSize(new java.awt.Dimension(369, 44));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0, 90));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1318, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1318, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 32, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        setBounds(0, 0, 1334, 804);
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarLogisiticaProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarLogisiticaProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegistrarLogisiticaProveedorActionPerformed

    private void registrarProveedorLogisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProveedorLogisticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarProveedorLogisticaActionPerformed

    private void registrarProductoLogisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProductoLogisticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarProductoLogisticaActionPerformed

    private void modificarEliminarBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarEliminarBuscarProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarEliminarBuscarProveedorActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void textRUCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRUCKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"Ingresar solo números");
        }
        if(textRUC.getText().length()>=11){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"El RUC es de 11 dígitos.");
        }
    }//GEN-LAST:event_textRUCKeyTyped

    private void textRazonSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRazonSocialKeyTyped
        if(textRazonSocial.getText().length()>=99){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"La razón social no debe exceder de 100 caracteres.");
        }
    }//GEN-LAST:event_textRazonSocialKeyTyped

    private void textRepresentanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textRepresentanteKeyTyped
        if(textRepresentante.getText().length()>=99){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"El nombre del Representante no debe exceder de 100 caracteres.");
        }
    }//GEN-LAST:event_textRepresentanteKeyTyped

    private void textTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTelefonoKeyTyped
         char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"Ingresar solo números");
        }
         if(textTelefono.getText().length()>=9){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"El teléfono no debe exceder de 9 digitos.");
        }
    }//GEN-LAST:event_textTelefonoKeyTyped

    private void textAreaDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaDescripcionKeyTyped
        
        if(textAreaDescripcion.getText().length()>=100){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"La descripción no debe exceder de 100 caracteres.");
        }     
    }//GEN-LAST:event_textAreaDescripcionKeyTyped

    private void textEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textEmailKeyTyped
        if(textEmail.getText().length()>=40){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"El email no debe exceder de 40 caracteres.");
        }     
    }//GEN-LAST:event_textEmailKeyTyped

    private void textDistritoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDistritoKeyTyped
        if(textDistrito.getText().length()>=100){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"El distrito no debe exceder de 100 caracteres.");
        } 
    }//GEN-LAST:event_textDistritoKeyTyped

    private void textDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDireccionKeyTyped
        
        if(textDireccion.getText().length()>=100){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"La dirección no debe exceder de 100 caracteres.");
        } 
    }//GEN-LAST:event_textDireccionKeyTyped

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
            java.util.logging.Logger.getLogger(logisticaRegistroProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logisticaRegistroProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logisticaRegistroProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logisticaRegistroProv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logisticaRegistroProv().setVisible(true);
            }
        });
    }
    
    class FondoPanel extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/image/FondoPrincipal.jpg")).getImage();
            
            g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
    class userSilueta extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/image/userSilueta.png")).getImage();
            
            g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JButton botonRegistrarLogisiticaProveedor = new javax.swing.JButton();
    public static final javax.swing.JButton botonSalirLogRegProv = new javax.swing.JButton();
    public final javax.swing.JComboBox<String> comboBoxEstadoCivil = new javax.swing.JComboBox<>();
    public static final javax.swing.JButton editarProductoLogistica = new javax.swing.JButton();
    private javax.swing.JButton jButton1;
    private static final javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    private static final javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private static final javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
    private static final javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
    private static final javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
    private static final javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
    private static final javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
    private static final javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
    private static final javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
    private static final javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    public static final javax.swing.JButton modificarEliminarBuscarProveedor = new javax.swing.JButton();
    public static final javax.swing.JButton registrarCategorialogisticaRProv = new javax.swing.JButton();
    public static final javax.swing.JButton registrarProductoLogistica = new javax.swing.JButton();
    public static final javax.swing.JButton registrarProveedorLogistica = new javax.swing.JButton();
    public final javax.swing.JTextArea textAreaDescripcion = new javax.swing.JTextArea();
    public final javax.swing.JTextField textDireccion = new javax.swing.JTextField();
    public final javax.swing.JTextField textDistrito = new javax.swing.JTextField();
    public final javax.swing.JTextField textEmail = new javax.swing.JTextField();
    public final javax.swing.JTextField textRUC = new javax.swing.JTextField();
    public final javax.swing.JTextField textRazonSocial = new javax.swing.JTextField();
    public final javax.swing.JTextField textRepresentante = new javax.swing.JTextField();
    public final javax.swing.JTextField textTelefono = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
