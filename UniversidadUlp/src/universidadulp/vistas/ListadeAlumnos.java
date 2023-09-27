package universidadulp.vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import universidadulp.Entidades.Alumno;
import universidadulp.accesoADatos.AlumnoData;
import static universidadulp.vistas.FormularioAlumno.soloLetras;

public class ListadeAlumnos extends javax.swing.JFrame {

    Fondopantalla frame = new Fondopantalla();

    public ListadeAlumnos() {
        this.setLocationRelativeTo(null);
        this.setContentPane(frame);
        initComponents();
        ArmarCabecera();
        RellenarLista();
        jbEliminar.setToolTipText("Permite Eliminar un Alumno anteriormente seleccionado en la Lista");
        jbModificar.setToolTipText("Permite Modificar un Alumno anteriormente seleccionado en la Lista");
        jdFechaNac.getDateEditor().getUiComponent().setEnabled(false);
        jdFechaNac.getDateEditor().getUiComponent().setOpaque(false);
        jtCalendario.setEditable(false);
        jtCalendario.setOpaque(false);
    }

    AlumnoData aluData = new AlumnoData();

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean IsCellEditable(int Fila, int Columna) {
            return false;
        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLista = new javax.swing.JTable();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbAtras = new javax.swing.JButton();
        jtDocumento = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcEstado = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jdFechaNac = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jtCalendario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setOpaque(false);

        jtLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtLista);

        jbEliminar.setBackground(new java.awt.Color(153, 204, 255));
        jbEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jbEliminar.setText("ELIMINAR");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbModificar.setBackground(new java.awt.Color(153, 204, 255));
        jbModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(0, 0, 0));
        jbModificar.setText("MODIFICAR");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbAtras.setBackground(new java.awt.Color(153, 204, 255));
        jbAtras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbAtras.setForeground(new java.awt.Color(0, 0, 0));
        jbAtras.setText("ATRAS");
        jbAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtrasActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Documento");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(153, 204, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        jLabel2.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(153, 204, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido");
        jLabel4.setOpaque(true);

        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "ACTIVO", "NO ACTIVO" }));

        jLabel5.setBackground(new java.awt.Color(153, 204, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha de nacimiento");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(153, 204, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Estado");
        jLabel6.setOpaque(true);

        jdFechaNac.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaNacPropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Lista de Alumnos");

        jtCalendario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtCalendario.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbAtras)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDocumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jdFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbEliminar)
                                    .addComponent(jtCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jbModificar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jcEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(9, 9, 9)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jbAtras))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbModificar)
                            .addComponent(jbEliminar))))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        int fila = jtLista.getSelectedRow();
        if (fila != -1) {
            aluData.eliminarAlumno((Integer) modelo.getValueAt(fila, 0));
            modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(this, "No haz seleccionado ningun Alumno");
        }

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtrasActionPerformed
        
        FormularioAlumno pantalla = new FormularioAlumno();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_jbAtrasActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        int fila = jtLista.getSelectedRow();
        int error = 0;
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un alumno porfavor");
        } else {
            Alumno alumno = new Alumno();
            int data = (Integer) modelo.getValueAt(fila, 0);
            if (jtDocumento.getText().isEmpty()
                    || jtNombre.getText().isEmpty()
                    || jtApellido.getText().isEmpty()
                    || jcEstado.getSelectedIndex() == 0
                    || jdFechaNac.getDate() == null
                    || fila == -1) {
                if (jdFechaNac.getDate() == null) {
                    JOptionPane.showMessageDialog(this, "La fecha fue ingresada incorrectamente porfavor"
                            + " utilice el calendario al lado de la casilla Fecha de Nacimiento");
                } else {
                    JOptionPane.showMessageDialog(this, "FLAC@!! RELLENA CORRECTAMENTE LAS CASILLAS");
                }
            } else {
                AlumnoData alu = new AlumnoData();

                for (Alumno student : alu.listaCompletaDeAlumnos()) {
                    if (student.getIdAlumno() == data) {
                        alumno.setIdAlumno(data);
                        
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
                        try {
                            if (Integer.parseInt(jtDocumento.getText()) != student.getDni()) {
                                alumno.setDni(Integer.parseInt(jtDocumento.getText()));
                            } else {
                                alumno.setDni(student.getDni());
                            }
                        } catch (NumberFormatException e) {
                            error = 1;
                            
                            JOptionPane.showMessageDialog(this, "Por favor solo ingrese numeros en la casilla de DOCUMENTO");
                            jtDocumento.setText("");
                            break;
                            
                        }
                        switch (jcEstado.getSelectedIndex()) {
                            case 1:
                                alumno.setEstado(true);
                                break;
                            case 2:
                                alumno.setEstado(false);
                                break;
                        }
                        alumno.setFechaNac(jdFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                        

                    }
                    
                    
                }
                if (error == 0) {
                        alu.modificarAlumno(alumno);
                        Borrarfila();
                        RellenarLista();
                        jtDocumento.setText("");
                        jtNombre.setText("");
                        jtApellido.setText("");
                        jcEstado.setSelectedIndex(0);
                        jdFechaNac.setDate(null);
                        jtCalendario.setText("");
                }
                
            }
        }


    }//GEN-LAST:event_jbModificarActionPerformed

    private void jtListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListaMouseClicked
        
        int fila = jtLista.getSelectedRow();
        Alumno alu = new Alumno();
        int data = (Integer) modelo.getValueAt(fila, 0);
//        System.out.println(data);
        alu = aluData.buscarAlumnoPorId(data);
        if (fila != -1) {
            jtDocumento.setText(alu.getDni() + "");
            jtNombre.setText(alu.getNombre());
            jtApellido.setText(alu.getApellido());
            if (alu.isEstado() == true) {
                jcEstado.setSelectedIndex(1);
            } else {
                jcEstado.setSelectedIndex(2);
            }
            jdFechaNac.setDate(Date.valueOf(alu.getFechaNac()));
        }
    }//GEN-LAST:event_jtListaMouseClicked

    private void jdFechaNacPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaNacPropertyChange
        if (jdFechaNac.getDate() != null) {
            LocalDate fecha = jdFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            jtCalendario.setText(fecha + "");
        }
    }//GEN-LAST:event_jdFechaNacPropertyChange
    private void ArmarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha de Nac.");
        modelo.addColumn("Estado");
        jtLista.setModel(modelo);
    }

    private void Borrarfila() {
        int fila = modelo.getRowCount() - 1;
        for (; fila >= 0; fila--) {
            modelo.removeRow(fila);
        }
    }

    private void RellenarLista() {
        for (Alumno listarAlumno : aluData.listaCompletaDeAlumnos()) {
            modelo.addRow(new Object[]{
                listarAlumno.getIdAlumno(),
                listarAlumno.getDni(),
                listarAlumno.getApellido(),
                listarAlumno.getNombre(),
                listarAlumno.getFechaNac(),
                listarAlumno.isEstado()
            });
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtras;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<String> jcEstado;
    private com.toedter.calendar.JDateChooser jdFechaNac;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCalendario;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTable jtLista;
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
