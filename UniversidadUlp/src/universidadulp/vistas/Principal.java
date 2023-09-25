package universidadulp.vistas;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
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
        jbConsultas1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "PROYECTO49", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 204, 255))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("  Universidad ULP");

        jbAlumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbAlumno.setText("ALUMNO ");
        jbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlumnoActionPerformed(evt);
            }
        });

        jbMateria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbMateria.setText("MATERIA");
        jbMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMateriaActionPerformed(evt);
            }
        });

        jbAdminis.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbAdminis.setText("ADMINISTRACIÓN");
        jbAdminis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdminisActionPerformed(evt);
            }
        });

        jbConsultas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbConsultas.setText("CONSULTAS");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\angel\\Desktop\\GitHub\\Proyecto49\\UniversidadUlp\\emI.png")); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(170, 207));
        jLabel2.setPreferredSize(new java.awt.Dimension(1125, 1022));

        jbConsultas1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbConsultas1.setText("SALIR");
        jbConsultas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultas1ActionPerformed(evt);
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
                    .addComponent(jbConsultas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jbConsultas1))
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

    private void jbConsultas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultas1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbConsultas1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAdminis;
    private javax.swing.JButton jbAlumno;
    private javax.swing.JButton jbConsultas;
    private javax.swing.JButton jbConsultas1;
    private javax.swing.JButton jbMateria;
    // End of variables declaration//GEN-END:variables

}
