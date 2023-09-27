package universidadulp.vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Principal extends javax.swing.JFrame {

    Fondopantalla frame = new Fondopantalla();
    
    public Principal() {
        this.setLocationRelativeTo(null);
        this.setContentPane(frame);
        initComponents();
        jbAlumno.setToolTipText("Puedes agregar y/o Modificar Alumno");
        jbMateria.setToolTipText("Puedes agregar y/o Modificar Materia");
        jbAdminis.setToolTipText("Puedes Inscribir Alumnos en las diferentes Materias");
        jbConsultas.setToolTipText("Puedes controlar la cantidad de Alumnos por Materia");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbAlumno = new javax.swing.JButton();
        jbMateria = new javax.swing.JButton();
        jbAdminis = new javax.swing.JButton();
        jbConsultas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "PROYECTO49", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 204, 255))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("  Universidad ULP");

        jbAlumno.setBackground(new java.awt.Color(153, 204, 255));
        jbAlumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbAlumno.setForeground(new java.awt.Color(0, 0, 0));
        jbAlumno.setText("ALUMNO ");
        jbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlumnoActionPerformed(evt);
            }
        });

        jbMateria.setBackground(new java.awt.Color(153, 204, 255));
        jbMateria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbMateria.setForeground(new java.awt.Color(0, 0, 0));
        jbMateria.setText("MATERIA");
        jbMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMateriaActionPerformed(evt);
            }
        });

        jbAdminis.setBackground(new java.awt.Color(153, 204, 255));
        jbAdminis.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbAdminis.setForeground(new java.awt.Color(0, 0, 0));
        jbAdminis.setText("ADMINISTRACIÓN");
        jbAdminis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdminisActionPerformed(evt);
            }
        });

        jbConsultas.setBackground(new java.awt.Color(153, 204, 255));
        jbConsultas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbConsultas.setForeground(new java.awt.Color(0, 0, 0));
        jbConsultas.setText("CONSULTAS");
        jbConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultasActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/emI.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(170, 207));
        jLabel2.setPreferredSize(new java.awt.Dimension(1125, 1022));

        jbSalir.setBackground(new java.awt.Color(153, 204, 255));
        jbSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(0, 0, 0));
        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbAdminis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jbAlumno)
                        .addGap(18, 18, 18)
                        .addComponent(jbMateria)
                        .addGap(20, 20, 20)
                        .addComponent(jbAdminis)
                        .addGap(18, 18, 18)
                        .addComponent(jbConsultas)
                        .addGap(24, 24, 24)
                        .addComponent(jbSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAdminisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdminisActionPerformed

        FormularioInscr pantalla = new FormularioInscr();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_jbAdminisActionPerformed

    private void jbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlumnoActionPerformed

        FormularioAlumno pantalla = new FormularioAlumno();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_jbAlumnoActionPerformed

    private void jbMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMateriaActionPerformed

        FormularioMateria pantalla = new FormularioMateria();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_jbMateriaActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultasActionPerformed
        Consulta pantalla = new Consulta();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_jbConsultasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAdminis;
    private javax.swing.JButton jbAlumno;
    private javax.swing.JButton jbConsultas;
    private javax.swing.JButton jbMateria;
    private javax.swing.JButton jbSalir;
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
}
