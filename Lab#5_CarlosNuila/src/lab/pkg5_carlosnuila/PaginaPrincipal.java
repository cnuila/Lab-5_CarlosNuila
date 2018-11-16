/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5_carlosnuila;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Carlos Nuila
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipal
     */
    public PaginaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_CrearEmpresa = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jt_nombreEmpresa = new javax.swing.JTextField();
        cb_tipoEmpresa = new javax.swing.JComboBox<>();
        jt_ubicacionEmpresa = new javax.swing.JTextField();
        jd_fechaFundacion = new com.toedter.calendar.JDateChooser();
        jt_idSucursal = new javax.swing.JTextField();
        jt_pinAccesoCrear = new javax.swing.JTextField();
        jb_crearEmpresa = new javax.swing.JButton();
        jd_interfazUsuario = new javax.swing.JDialog();
        jl_nombreEmpresa = new javax.swing.JLabel();
        jl_idempresa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_empresa = new javax.swing.JTree();
        jb_crearEmpleado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_listaEmpleados = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jd_CrearEmpleado = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jt_nombreEmpleado = new javax.swing.JTextField();
        jd_fechaNacimiento = new com.toedter.calendar.JDateChooser();
        jt_correo = new javax.swing.JTextField();
        cb_cargo = new javax.swing.JComboBox<>();
        jb_crearEmpleado2 = new javax.swing.JButton();
        popMenu_empleado = new javax.swing.JPopupMenu();
        jmi_modificar = new javax.swing.JMenuItem();
        jmi_eliminar = new javax.swing.JMenuItem();
        jmi_detalles = new javax.swing.JMenuItem();
        jmi_contratar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jt_idEmpresa = new javax.swing.JTextField();
        jb_Entrar = new javax.swing.JButton();
        jl_crearEmpresa = new javax.swing.JLabel();
        pf_pinacceso = new javax.swing.JPasswordField();

        jLabel3.setText("Nombre: ");

        jLabel5.setText("Tipo de Empresa: ");

        jLabel6.setText("Ubicación:");

        jLabel7.setText("Fecha de Fundación:");

        jLabel8.setText("ID Sucursal:");

        jLabel9.setText("PIN Acceso:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel10.setText("Crear Empresa");

        cb_tipoEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Micro", "Mediana", "Gran" }));

        jt_idSucursal.setToolTipText("");

        jb_crearEmpresa.setText("Crear");
        jb_crearEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearEmpresaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_CrearEmpresaLayout = new javax.swing.GroupLayout(jd_CrearEmpresa.getContentPane());
        jd_CrearEmpresa.getContentPane().setLayout(jd_CrearEmpresaLayout);
        jd_CrearEmpresaLayout.setHorizontalGroup(
            jd_CrearEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearEmpresaLayout.createSequentialGroup()
                .addGroup(jd_CrearEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_CrearEmpresaLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel10))
                    .addGroup(jd_CrearEmpresaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jd_CrearEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jd_CrearEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_tipoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_nombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(jt_ubicacionEmpresa)))
                    .addGroup(jd_CrearEmpresaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_CrearEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGroup(jd_CrearEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_CrearEmpresaLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jd_fechaFundacion, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_CrearEmpresaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jd_CrearEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_CrearEmpresaLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jt_pinAccesoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jt_idSucursal))))))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_CrearEmpresaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jb_crearEmpresa)
                .addGap(29, 29, 29))
        );
        jd_CrearEmpresaLayout.setVerticalGroup(
            jd_CrearEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(24, 24, 24)
                .addGroup(jd_CrearEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jt_nombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jd_CrearEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_tipoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jd_CrearEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jt_ubicacionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jd_CrearEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jd_fechaFundacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jt_idSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CrearEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jt_pinAccesoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_crearEmpresa)
                .addContainerGap())
        );

        jl_nombreEmpresa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jl_idempresa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jt_empresa.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_empresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_empresaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_empresa);

        jb_crearEmpleado.setText("Crear Empleado");
        jb_crearEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearEmpleadoMouseClicked(evt);
            }
        });

        jl_listaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_listaEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jl_listaEmpleados);

        jLabel11.setText("Lista Empleados");

        javax.swing.GroupLayout jd_interfazUsuarioLayout = new javax.swing.GroupLayout(jd_interfazUsuario.getContentPane());
        jd_interfazUsuario.getContentPane().setLayout(jd_interfazUsuarioLayout);
        jd_interfazUsuarioLayout.setHorizontalGroup(
            jd_interfazUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_interfazUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_interfazUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_interfazUsuarioLayout.createSequentialGroup()
                        .addComponent(jl_nombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jl_idempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jd_interfazUsuarioLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jd_interfazUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_crearEmpleado)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(0, 18, Short.MAX_VALUE))))
        );
        jd_interfazUsuarioLayout.setVerticalGroup(
            jd_interfazUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_interfazUsuarioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jd_interfazUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_nombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_idempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_interfazUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_interfazUsuarioLayout.createSequentialGroup()
                        .addComponent(jb_crearEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("Crear Empleado");

        jLabel13.setText("Nombre Completo: ");

        jLabel14.setText("Fecha de Nacimiento:");

        jLabel15.setText("Correo:");

        jLabel16.setText("Cargo:");

        cb_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniero", "Médico", "Estudiante", "Licenciado", "Maestro" }));

        jb_crearEmpleado2.setText("Crear Empleado");
        jb_crearEmpleado2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearEmpleado2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_CrearEmpleadoLayout = new javax.swing.GroupLayout(jd_CrearEmpleado.getContentPane());
        jd_CrearEmpleado.getContentPane().setLayout(jd_CrearEmpleadoLayout);
        jd_CrearEmpleadoLayout.setHorizontalGroup(
            jd_CrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearEmpleadoLayout.createSequentialGroup()
                .addGroup(jd_CrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CrearEmpleadoLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_CrearEmpleadoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jd_CrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_CrearEmpleadoLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(26, 26, 26)
                                .addComponent(jd_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_CrearEmpleadoLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(26, 26, 26)
                                .addComponent(jt_nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_CrearEmpleadoLayout.createSequentialGroup()
                                .addGroup(jd_CrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(18, 18, 18)
                                .addGroup(jd_CrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_CrearEmpleadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jb_crearEmpleado2)
                .addGap(65, 65, 65))
        );
        jd_CrearEmpleadoLayout.setVerticalGroup(
            jd_CrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CrearEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_CrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_CrearEmpleadoLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jd_CrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jt_nombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel14))
                    .addComponent(jd_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jd_CrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jd_CrearEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_crearEmpleado2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jmi_modificar.setText("Modificar");
        popMenu_empleado.add(jmi_modificar);

        jmi_eliminar.setText("Eliminar");
        popMenu_empleado.add(jmi_eliminar);

        jmi_detalles.setText("Ver Detalles");
        popMenu_empleado.add(jmi_detalles);

        jmi_contratar.setText("Contratar");
        jmi_contratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_contratarActionPerformed(evt);
            }
        });
        popMenu_empleado.add(jmi_contratar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenido");

        jLabel2.setText("ID de Empresa:");

        jLabel4.setText("PIN de Acceso:");

        jb_Entrar.setText("Entrar");
        jb_Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_EntrarMouseClicked(evt);
            }
        });

        jl_crearEmpresa.setForeground(new java.awt.Color(51, 51, 255));
        jl_crearEmpresa.setText("Crear Empresa");
        jl_crearEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_crearEmpresaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(pf_pinacceso))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jt_idEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jb_Entrar)
                        .addGap(57, 57, 57)
                        .addComponent(jl_crearEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jt_idEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pf_pinacceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_Entrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_crearEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jl_crearEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_crearEmpresaMouseClicked
        // TODO add your handling code here:
        jd_CrearEmpresa.pack();
        jd_CrearEmpresa.setModal(true);
        jd_CrearEmpresa.setLocationRelativeTo(this);
        jd_CrearEmpresa.setVisible(true);
    }//GEN-LAST:event_jl_crearEmpresaMouseClicked

    private void jb_crearEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearEmpresaMouseClicked
        // TODO add your handling code here:
        try {
            String nombreEmpresa = jt_nombreEmpresa.getText();
            String tipoEmpresa = (String) cb_tipoEmpresa.getSelectedItem();
            double capital = 0;
            if (tipoEmpresa.equals("Micro")) {
                capital = 80000;
            }
            if (tipoEmpresa.equals("Mediana")) {
                capital = 80000;
            }
            if (tipoEmpresa.equals("Gran")) {
                capital = 80000;
            }
            String ubicacion = jt_ubicacionEmpresa.getText();
            Date fechaFundacion = jd_fechaFundacion.getDate();
            int idSucursal = Integer.parseInt(jt_idSucursal.getText());
            String pinAcceso = jt_pinAccesoCrear.getText();

            int nombre = -1;
            int idsuc = -1;
            for (int i = 0; i < listaEmpresas.size(); i++) {
                if (nombreEmpresa.equals(listaEmpresas.get(i).getNombreEmpresa())) {
                    nombre = 1;
                    JOptionPane.showMessageDialog(jd_CrearEmpresa, "Ya existe una empresa con ese nombre");
                }
                if (idSucursal == listaEmpresas.get(i).getIdSucursal()) {
                    idsuc = 1;
                    JOptionPane.showMessageDialog(jd_CrearEmpresa, "Ya existe una empresa con ese ID");
                }
            }
            if (nombre == -1 && idsuc == -1) {
                DefaultTreeModel modeloArbol = (DefaultTreeModel) jt_empresa.getModel();
                DefaultMutableTreeNode raiz_empresa = new DefaultMutableTreeNode(new Empresa(nombreEmpresa, capital, fechaFundacion, ubicacion, idSucursal, pinAcceso));
                modeloArbol.setRoot(raiz_empresa);
                listaEmpresas.add(new Empresa(nombreEmpresa, capital, fechaFundacion, ubicacion, idSucursal, pinAcceso, modeloArbol));
                JOptionPane.showMessageDialog(jd_CrearEmpresa, "Empresa Creada Existosamente");
                jt_idSucursal.setText("");
                jt_nombreEmpresa.setText("");
                jt_pinAccesoCrear.setText("");
                jt_ubicacionEmpresa.setText("");
                jd_fechaFundacion.setDate(new Date());
                cb_tipoEmpresa.setSelectedIndex(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_CrearEmpresa, "Ocurrio un error Fatal");
        }
    }//GEN-LAST:event_jb_crearEmpresaMouseClicked

    private void jb_EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_EntrarMouseClicked
        // TODO add your handling code here:
        int nombreEmpresa = -1;
        int pinAcceso = -1;
        for (int i = 0; i < listaEmpresas.size(); i++) {
            String s1 = jt_idEmpresa.getText();
            String s2 = listaEmpresas.get(i).getIdSucursal() + "";
            if (s1.equals(s2)) {
                nombreEmpresa = 1;
            }
            if (pf_pinacceso.getText().equals(listaEmpresas.get(i).getPinAcceso())) {
                pinAcceso = 1;
            }
            if (nombreEmpresa == 1 && pinAcceso == 1) {
                empresaActual = listaEmpresas.get(i);
            }
        }
        if (nombreEmpresa == 1 && pinAcceso == 1) {
            jd_interfazUsuario.pack();
            jd_interfazUsuario.setModal(true);
            jd_interfazUsuario.setLocationRelativeTo(this);
            jl_nombreEmpresa.setText(empresaActual.getNombreEmpresa());
            jl_idempresa.setText(String.valueOf("ID " + empresaActual.getIdSucursal()));
            DefaultTreeModel modeloArbol = (DefaultTreeModel) jt_empresa.getModel();
            modeloArbol = empresaActual.getModelo_Empresa();
            jd_interfazUsuario.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña Incorrecto");
        }
    }//GEN-LAST:event_jb_EntrarMouseClicked

    private void jb_crearEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearEmpleadoMouseClicked
        // TODO add your handling code here:
        jd_CrearEmpleado.pack();
        jd_CrearEmpleado.setModal(true);
        jd_CrearEmpleado.setLocationRelativeTo(jd_interfazUsuario);
        jd_CrearEmpleado.setVisible(true);
    }//GEN-LAST:event_jb_crearEmpleadoMouseClicked

    private void jb_crearEmpleado2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearEmpleado2MouseClicked
        // TODO add your handling code here:
        try {
            String nombreEmpleado = jt_nombreEmpleado.getText();
            Date fechaNacimiento = jd_fechaNacimiento.getDate();
            String correo = jt_correo.getText();
            String cargo = (String) cb_cargo.getSelectedItem();
            double salario = 0;
            if (cargo.equals("Ingeniero")) {
                salario = 22000;
            }
            if (cargo.equals("Médico")) {
                salario = 18000;
            }
            if (cargo.equals("Estudiante")) {
                salario = 7600;
            }
            if (cargo.equals("Licenciado")) {
                salario = 12000;
            }
            if (cargo.equals("Maestro")) {
                salario = 2000;
            }
            DefaultListModel modeloLista = (DefaultListModel) jl_listaEmpleados.getModel();
            modeloLista.addElement(new Empleado(nombreEmpleado, fechaNacimiento, correo, cargo, salario));
            jl_listaEmpleados.setModel(modeloLista);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jd_CrearEmpleado, "Ocurrio un error Fatal");
        }
    }//GEN-LAST:event_jb_crearEmpleado2MouseClicked

    private void jl_listaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_listaEmpleadosMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            popMenu_empleado.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jl_listaEmpleadosMouseClicked

    private void jmi_contratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_contratarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jmi_contratarActionPerformed

    private void jt_empresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_empresaMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {

        } else {
            int row = jt_empresa.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_empresa.setSelectionRow(row);
            Object v1 = jt_empresa.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            if (nodo_seleccionado.getUserObject() instanceof Empresa) {
                 = (Personas) nodo_seleccionado.getUserObject();
                menu_popup.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }

    }//GEN-LAST:event_jt_empresaMouseClicked

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_cargo;
    private javax.swing.JComboBox<String> cb_tipoEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_Entrar;
    private javax.swing.JButton jb_crearEmpleado;
    private javax.swing.JButton jb_crearEmpleado2;
    private javax.swing.JButton jb_crearEmpresa;
    private javax.swing.JDialog jd_CrearEmpleado;
    private javax.swing.JDialog jd_CrearEmpresa;
    private com.toedter.calendar.JDateChooser jd_fechaFundacion;
    private com.toedter.calendar.JDateChooser jd_fechaNacimiento;
    private javax.swing.JDialog jd_interfazUsuario;
    private javax.swing.JLabel jl_crearEmpresa;
    private javax.swing.JLabel jl_idempresa;
    private javax.swing.JList<String> jl_listaEmpleados;
    private javax.swing.JLabel jl_nombreEmpresa;
    private javax.swing.JMenuItem jmi_contratar;
    private javax.swing.JMenuItem jmi_detalles;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_modificar;
    private javax.swing.JTextField jt_correo;
    private javax.swing.JTree jt_empresa;
    private javax.swing.JTextField jt_idEmpresa;
    private javax.swing.JTextField jt_idSucursal;
    private javax.swing.JTextField jt_nombreEmpleado;
    private javax.swing.JTextField jt_nombreEmpresa;
    private javax.swing.JTextField jt_pinAccesoCrear;
    private javax.swing.JTextField jt_ubicacionEmpresa;
    private javax.swing.JPasswordField pf_pinacceso;
    private javax.swing.JPopupMenu popMenu_empleado;
    // End of variables declaration//GEN-END:variables
    ArrayList<Empresa> listaEmpresas = new ArrayList();
    Empresa empresaActual;
    DefaultMutableTreeNode nodo_seleccionado;
}
