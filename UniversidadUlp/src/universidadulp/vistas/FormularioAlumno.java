package universidadulp.vistas;


import java.sql.Date;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import universidadulp.Entidades.Alumno;
import universidadulp.accesoADatos.AlumnoData;

public class FormularioAlumno extends javax.swing.JFrame {

    AlumnoData aluData = new AlumnoData();

    public FormularioAlumno() {
        initComponents();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtDocumento = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jcEstado = new javax.swing.JComboBox<>();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jdFechaNac = new com.toedter.calendar.JDateChooser();
        jbLimpiar = new javax.swing.JButton();
        jbLista = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "DATOS ALUMNO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setText("ALUMNO");

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setText("DOCUMENTO:");

        jLabel3.setText("APELLIDO:");

        jLabel4.setText("NOMBRE:");

        jLabel5.setText("ESTADO:");

        jLabel6.setText("FECHA NAC:");

        jtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDocumentoActionPerformed(evt);
            }
        });

        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "ACTIVO", "NO ACTIVO" }));

        jbBuscar.setText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setText("NUEVO");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbSalir.setText("SALIR");

        jdFechaNac.setDateFormatString("dd MM yyyy");

        jbLimpiar.setText("LIMPIAR");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbLista.setText("LISTA DE ALUMNOS");
        jbLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jbNuevo)))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jdFechaNac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, 145, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                .addComponent(jtApellido)
                                .addComponent(jtNombre))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jbLista)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jbSalir)
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbLimpiar)
                                    .addComponent(jbBuscar))
                                .addGap(33, 33, 33))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiar))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbSalir)
                    .addComponent(jbLista))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDocumentoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        int documento = Integer.parseInt(jtDocumento.getText());
        Alumno alu = new Alumno();
        if (aluData.buscarAlumnoPorDni(documento) != null) {
            alu = aluData.buscarAlumnoPorDni(documento);
//            if (documento == alu.getDni()) {
                jtNombre.setText(alu.getNombre());
                jtApellido.setText(alu.getApellido());
                if (alu.isEstado() == true) {
                    jcEstado.setSelectedIndex(1);
                } else {
                    jcEstado.setSelectedIndex(2);
                }
                jdFechaNac.setDate(Date.valueOf(alu.getFechaNac()));
//         Formato Argentino para mostrar la fecha     
//         DateTimeFormatter formatoPatronFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
//         System.out.println(alu.getFechaNac().format(formatoPatronFecha));
//            }
        } else {
            jtDocumento.setText("");
            jtNombre.setText("");
            jtApellido.setText("");
            jcEstado.setSelectedIndex(0);
            jdFechaNac.setDate(null);
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        if (jtDocumento.getText().isEmpty() || 
            jtNombre.getText().isEmpty() || 
            jtApellido.getText().isEmpty() || 
            jcEstado.getSelectedIndex() == 0 || 
            jdFechaNac.getDate() == null) {
             JOptionPane.showMessageDialog(this, "RELLENAME TODOS LOS CAMPO FLAC@!!");
        }else {
            AlumnoData alu = new AlumnoData();
            int repetido=0;
            for (Alumno alumno : alu.listaCompletaDeAlumnos()) {
                if(alumno.getDni() == Integer.parseInt(jtDocumento.getText())){
                    JOptionPane.showMessageDialog(this, "No pueden existir alumnos con el mismo DOCUMENTO");
                    repetido=1;
                }
            }
            if (repetido==0) {
                Alumno alumno = new Alumno();
                alumno.setNombre(jtNombre.getText());
                alumno.setApellido(jtApellido.getText());
                alumno.setDni(Integer.parseInt(jtDocumento.getText()));
                switch (jcEstado.getSelectedIndex()) {
                    case 1: alumno.setEstado(true);   break;
                    case 2: alumno.setEstado(false);   break;
               }
               alumno.setFechaNac(jdFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
               alu.guardarAlumno(alumno);
            }
        }
         
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
          jtDocumento.setText("");
            jtNombre.setText("");
            jtApellido.setText("");
            jcEstado.setSelectedIndex(0);
            jdFechaNac.setDate(null);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListaActionPerformed
        // TODO add your handling code here:
        ListadeAlumnos pantalla = new ListadeAlumnos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_jbListaActionPerformed


//            if (jtDocumento.getText().isEmpty()
//            || jtNombre.getText().isEmpty()
//            || jtApellido.getText().isEmpty()
//            || jcEstado.getSelectedIndex() == 0
//            || jdFechaNac.getDate() == null) {
//            JOptionPane.showMessageDialog(this, "RELLENAME TODOS LOS CAMPO FLAC@!!");
//        } else {
//            AlumnoData alu = new AlumnoData();
//            Alumno alumno = new Alumno();
//            int registo = 0;
//            for (Alumno student : alu.listarAlumnos()) {
//                if (student.getDni() == Integer.parseInt(jtDocumento.getText())) {
//                    alumno.setIdAlumno(student.getIdAlumno());
//                    alumno.setNombre(jtNombre.getText());
//                    alumno.setApellido(jtApellido.getText());
//                    alumno.setDni(Integer.parseInt(jtDocumento.getText()));
//                    switch (jcEstado.getSelectedIndex()) {
//                        case 1:
//                        alumno.setEstado(true);
//                        break;
//                        case 2:
//                        alumno.setEstado(false);
//                        break;
//                    }
//                    alumno.setFechaNac(jdFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
//                    alu.modificarAlumno(alumno);
//                    registo = 1;
//                }
//
//            }
//            if (registo == 0) {
//                JOptionPane.showMessageDialog(this, "Solo se puede modificar alumnos anteriormente registrados");
//            }
//        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbLista;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcEstado;
    private com.toedter.calendar.JDateChooser jdFechaNac;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

}
