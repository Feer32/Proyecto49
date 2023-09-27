package universidadulp.vistas;

import com.sun.source.tree.BreakTree;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Date;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import universidadulp.Entidades.Alumno;
import universidadulp.accesoADatos.AlumnoData;

public class FormularioAlumno extends javax.swing.JFrame {

    AlumnoData aluData = new AlumnoData();
    Fondopantalla frame = new Fondopantalla();

    public FormularioAlumno() {
        this.setContentPane(frame);
        initComponents();
        jbBuscar.setToolTipText("Para buscar un Alumno debe Ingresar un Dni en la casilla -Documento-");
        jbLista.setToolTipText("Permite visualizar la lista de alumnos completa permitiendo modificar el que desee");
        jbNuevo.setToolTipText("Permite registrar un Alumno con los datos previamente ingresados en las casillas");
        jbLimpiar.setToolTipText("Flac@ el boton dice lo que hace");

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
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "DATOS ALUMNO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("ALUMNO");

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setOpaque(false);

        jLabel2.setBackground(new java.awt.Color(153, 204, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DOCUMENTO:");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("APELLIDO:");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(153, 204, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("NOMBRE:");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(153, 204, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ESTADO:");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(153, 204, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("FECHA NAC:");
        jLabel6.setOpaque(true);

        jtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDocumentoActionPerformed(evt);
            }
        });

        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "ACTIVO", "NO ACTIVO" }));

        jbBuscar.setBackground(new java.awt.Color(153, 204, 255));
        jbBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jbBuscar.setText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setBackground(new java.awt.Color(153, 204, 255));
        jbNuevo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbNuevo.setForeground(new java.awt.Color(0, 0, 0));
        jbNuevo.setText("NUEVO");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(153, 204, 255));
        jbSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbSalir.setText("ATRAS");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jdFechaNac.setDateFormatString("dd MM yyyy");

        jbLimpiar.setBackground(new java.awt.Color(153, 204, 255));
        jbLimpiar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        jbLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Estudiante\\Pictures\\imagenes proyec\\escobitaaaaa.png")); // NOI18N
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbLista.setBackground(new java.awt.Color(153, 204, 255));
        jbLista.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbLista.setForeground(new java.awt.Color(0, 0, 0));
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
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jbNuevo))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                .addComponent(jtApellido)
                                .addComponent(jtNombre))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jdFechaNac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addComponent(jcEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jbLista)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jbSalir)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar))
                        .addGap(63, 63, 63))))
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
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbLista)
                    .addComponent(jbSalir))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDocumentoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            if (!jtDocumento.getText().isEmpty()) {
                int documento = Integer.parseInt(jtDocumento.getText());
                Alumno alu = new Alumno();
                if (aluData.buscarAlumnoPorDni(documento) != null) {
                    alu = aluData.buscarAlumnoPorDni(documento);
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
                } else {
                    jtDocumento.setText("");
                    jtNombre.setText("");
                    jtApellido.setText("");
                    jcEstado.setSelectedIndex(0);
                    jdFechaNac.setDate(null);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese un Documento ");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "INSERTE SOLO NUMEROS PORFAVOR");
            jtDocumento.setText("");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        int error = 0;
        try {
            if (jtDocumento.getText().isEmpty()
                    || jtNombre.getText().isEmpty()
                    || jtApellido.getText().isEmpty()
                    || jcEstado.getSelectedIndex() == 0
                    || jdFechaNac.getDate() == null) {
                if (jdFechaNac.getDate() == null) {
                    JOptionPane.showMessageDialog(this, "La fecha fue ingresada incorrectamente porfavor"
                            + " utilice el calendario al lado de la casilla Fecha de Nacimiento");
                } else {
                    JOptionPane.showMessageDialog(this, "FLAC@!! RELLENA CORRECTAMENTE LAS CASILLAS");
                }
            } else {
                AlumnoData alu = new AlumnoData();
                int repetido = 0;
                for (Alumno alumno : alu.listaCompletaDeAlumnos()) {
                    if (alumno.getDni() == Integer.parseInt(jtDocumento.getText())) {
                        JOptionPane.showMessageDialog(this, "No pueden existir alumnos con el mismo DOCUMENTO");
                       jtDocumento.setText("");
                        repetido = 1;
                    }
                }
                if (repetido == 0) {

                    Alumno alumno = new Alumno();
                    if (soloLetras(jtNombre.getText()) == true) {
                        alumno.setNombre(jtNombre.getText());
                    } else {
                        JOptionPane.showMessageDialog(this, "Error de tipeo en la casilla NOMBRE");
                        jtNombre.setText("");
                        error = 1;
                    }
                    if (soloLetras(jtApellido.getText()) == true) {
                        alumno.setApellido(jtApellido.getText());
                    } else {
                        JOptionPane.showMessageDialog(this, "Error de tipio en la casilla APELLIDO");
                        jtApellido.setText("");
                        error = 1;
                    }

                    alumno.setDni(Integer.parseInt(jtDocumento.getText()));

                    switch (jcEstado.getSelectedIndex()) {
                        case 1:
                            alumno.setEstado(true);
                            break;
                        case 2:
                            alumno.setEstado(false);
                            break;
                    }

                    alumno.setFechaNac(jdFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                    
                    if (error == 0) {
                        alu.guardarAlumno(alumno);
                        jtDocumento.setText("");
                        jtNombre.setText("");
                        jtApellido.setText("");
                        jcEstado.setSelectedIndex(0);
                        jdFechaNac.setDate(null);

                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese correctamente el DOCUMENTO");
            jtDocumento.setText("");
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

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        Principal pantalla = new Principal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


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

    public class Fondopantalla extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/imagenes/panel.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

    public static boolean soloLetras(String cadena) {

        Pattern pattern = Pattern.compile("[0-9!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]+");
        Matcher matcher = pattern.matcher(cadena);

        return !matcher.find();
    }
}
