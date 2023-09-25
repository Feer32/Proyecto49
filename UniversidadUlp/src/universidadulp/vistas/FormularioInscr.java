
package universidadulp.vistas;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadulp.Entidades.Alumno;
import universidadulp.Entidades.Inscripcion;
import universidadulp.Entidades.Materia;
import universidadulp.accesoADatos.AlumnoData;
import universidadulp.accesoADatos.InscripcionData;
import universidadulp.accesoADatos.MateriaData;


public class FormularioInscr extends javax.swing.JFrame {
AlumnoData aluData=new AlumnoData();
MateriaData materiadata=new MateriaData();
InscripcionData inscripcionData=new InscripcionData();
    
    public FormularioInscr() {
        initComponents();
        llenarCombo();
        crearCabecera();
    }
  public DefaultTableModel modelo = new DefaultTableModel() {
 
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcSelecAlumno = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaInsc = new javax.swing.JTable();
        jrbMateriaNoInsc = new javax.swing.JRadioButton();
        jrbMateriasInsc = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jbInscribir = new javax.swing.JButton();
        jbAnularInscripcion = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtfBucarDni = new javax.swing.JTextField();
        jbIconoBuscar = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("FORMULARIO DE INSCRIPCIÓN");

        jLabel3.setText("SELECCIONE UN ALUMNO:");

        jcSelecAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSelecAlumnoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtTablaInsc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtTablaInsc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtTablaInsc);

        jrbMateriaNoInsc.setText("Materias No Inscriptas");
        jrbMateriaNoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriaNoInscActionPerformed(evt);
            }
        });

        jrbMateriasInsc.setText("Materias Inscriptas");
        jrbMateriasInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateriasInscActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("LISTADO DE MATERIAS");

        jbInscribir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbInscribir.setText("INSCRIBIR");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnularInscripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbAnularInscripcion.setText("ANULAR INSCRIPCION");
        jbAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInscripcionActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jrbMateriasInsc)
                        .addGap(107, 107, 107)
                        .addComponent(jrbMateriaNoInsc))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel4)))
                .addGap(128, 274, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbAnularInscripcion)
                            .addComponent(jbInscribir))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addGap(34, 34, 34))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbMateriaNoInsc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jrbMateriasInsc, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jbInscribir)
                                .addGap(26, 26, 26)
                                .addComponent(jbAnularInscripcion))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalir)
                        .addGap(122, 122, 122))))
        );

        jLabel5.setText("BUSCAR POR DNI: ");

        jbIconoBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Desktop\\GitHub\\Proyecto49\\UniversidadUlp\\LUPITA.png")); // NOI18N
        jbIconoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIconoBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jcSelecAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jtfBucarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbIconoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jcSelecAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfBucarDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbIconoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void jbIconoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIconoBuscarActionPerformed
        // TODO add your handling code here:
        try {

            if (!jtfBucarDni.getText().isEmpty()) {

                Alumno alumnoSeleccionado = aluData.buscarAlumnoPorDni(Integer.parseInt(jtfBucarDni.getText()));
//             jcSelecAlumno.setSelectedItem(alumnoSeleccioado);
                if (alumnoSeleccionado == null) {
                    jtfBucarDni.setText("");
                } else {
                    int contador = -1;
                    for (Alumno alumno : aluData.listarAlumnosActivos()) {
                        contador += 1;
                        if (alumno.getIdAlumno() == alumnoSeleccionado.getIdAlumno()) {
                            jcSelecAlumno.setSelectedIndex(contador);
                            jtfBucarDni.setText("");
                            break;
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "INSERTE UN DNI");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "PORFAVOR SOLO INGRESE NUMEROS");
            jtfBucarDni.setText("");
        }
    }//GEN-LAST:event_jbIconoBuscarActionPerformed

    private void jrbMateriasInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriasInscActionPerformed
        // TODO add your handling code here:
        if (jrbMateriasInsc.isSelected() == true) {
               jrbMateriaNoInsc.setSelected(false);
               jbInscribir.setVisible(false);
               jbAnularInscripcion.setVisible(true);
               borrarLista();
               cargarMateriasInscriptas();
            }
        
    }//GEN-LAST:event_jrbMateriasInscActionPerformed

    private void jrbMateriaNoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateriaNoInscActionPerformed
        // TODO add your handling code here:
             if (jrbMateriaNoInsc.isSelected() == true) {
               jrbMateriasInsc.setSelected(false);
               jbInscribir.setVisible(true );
               jbAnularInscripcion.setVisible(false);
               borrarLista();
               cargarMateriasNOInscriptas();
            }
    }//GEN-LAST:event_jrbMateriaNoInscActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        if (jrbMateriaNoInsc.isSelected() == false && jrbMateriasInsc.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Selecciona que materias deseas inscriptas o no inscriptas");
        } else {
            if (jtTablaInsc.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "Selecciona una materia");
            } else {
                Alumno alumno = (Alumno) jcSelecAlumno.getSelectedItem();
                int fila = jtTablaInsc.getSelectedRow();
                int dato = (Integer) modelo.getValueAt(fila, 0);
                Materia materia = materiadata.buscarMateria(dato);
                Inscripcion inscripcion = new Inscripcion(alumno, materia, 0);
                inscripcionData.GuardarInscripcion(inscripcion);
                borrarLista();
                cargarMateriasNOInscriptas();
            }
        }
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInscripcionActionPerformed
        if (jrbMateriaNoInsc.isSelected() == false && jrbMateriasInsc.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Selecciona que materias deseas inscriptas o no inscriptas");
        } else {
            if (jtTablaInsc.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "Selecciona una materia");
            } else {
                Alumno alumno = (Alumno) jcSelecAlumno.getSelectedItem();
                int fila = jtTablaInsc.getSelectedRow();
                int dato = (Integer) modelo.getValueAt(fila, 0);
                Materia materia = materiadata.buscarMateria(dato);
                inscripcionData.eliminarInscripcionMateriaAlumno(alumno.getIdAlumno(), materia.getIdMateria());
                borrarLista();
                cargarMateriasInscriptas();
            }
        }
    }//GEN-LAST:event_jbAnularInscripcionActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        Principal pantalla= new Principal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed
    
//    private int numero=0;
    private void jcSelecAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSelecAlumnoActionPerformed
        int numero = 1;
        if (jrbMateriasInsc.isSelected() == false && 
            jrbMateriaNoInsc.isSelected() == false ) {
//                &&
//            numero >= 2) {
            JOptionPane.showMessageDialog(this, "Seleccione si desea una lista de materias a las que esta inscripto o no");
        } else {
            if (jrbMateriasInsc.isSelected() == true && numero >= 2) {
                borrarLista();
                cargarMateriasInscriptas();
            } else {
                if (jrbMateriaNoInsc.isSelected() == true && numero >= 2) {
                    borrarLista();
                    cargarMateriasNOInscriptas();
                }
            }
        }
        numero = 2;
    }//GEN-LAST:event_jcSelecAlumnoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnularInscripcion;
    private javax.swing.JButton jbIconoBuscar;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcSelecAlumno;
    private javax.swing.JRadioButton jrbMateriaNoInsc;
    private javax.swing.JRadioButton jrbMateriasInsc;
    private javax.swing.JTable jtTablaInsc;
    private javax.swing.JTextField jtfBucarDni;
    // End of variables declaration//GEN-END:variables
    
    private void crearCabecera(){
        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("AÑO");
        jtTablaInsc.setModel(modelo);
    }
    
    private void cargarMateriasInscriptas() {
        Alumno alumno = (Alumno) jcSelecAlumno.getSelectedItem();
        for (Materia obtenerMateriasCursada : inscripcionData.obtenerMateriasCursadas(alumno.getIdAlumno())) {
            modelo.addRow(new Object [] {
            obtenerMateriasCursada.getIdMateria(),
            obtenerMateriasCursada.getNombre(),
            obtenerMateriasCursada.getAnio()
            } );
        }
    }
    
    private void cargarMateriasNOInscriptas() {
        Alumno alumno = (Alumno) jcSelecAlumno.getSelectedItem();
        for (Materia obtenerMateriasNOCursada : inscripcionData.obtenerMateriasNoCursadas(alumno.getIdAlumno())) {
            modelo.addRow(new Object [] {
            obtenerMateriasNOCursada.getIdMateria(),
            obtenerMateriasNOCursada.getNombre(),
            obtenerMateriasNOCursada.getAnio()
            } );
        }
    }
    
    private void borrarLista() {
        int fila = jtTablaInsc.getRowCount() - 1;
        if (fila != -1) {
            for (; fila >= 0; fila--) {
                modelo.removeRow(fila);
            }
        }
    }

    private void llenarCombo() {
        for (Alumno alumno : aluData.listarAlumnosActivos()) {
            jcSelecAlumno.addItem(alumno);
        }
    }
}

