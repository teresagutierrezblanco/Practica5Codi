
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author diana
 */
public class VSolicitudes extends javax.swing.JDialog {

    /**
     * Creates new form VSolicitudes
     */
    public Usuario usuario;
    public VChat padre;
    private ArrayList<String> solicitudes;
    private ServerInterface serv;

    public VSolicitudes(VChat padre, Usuario usuario, ServerInterface serv) throws RemoteException {
        super(padre);
        initComponents();
        this.usuario = usuario;
        this.padre = padre;
        this.solicitudes = new ArrayList<>();
        this.serv = serv;
        ModeloTablaUsuarios solicitudesUsuario;
        solicitudesUsuario = (ModeloTablaUsuarios) jpendientes.getModel();
        solicitudes = serv.solicitudesAmistad(usuario.getNombre());
        for (String nombre : solicitudes) {
            solicitudesUsuario.anadirFila(nombre);

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jBuscarNombre = new javax.swing.JTextPane();
        jBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaUsuarios = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jpendientes = new javax.swing.JTable();
        anadirAmigo = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSolicitar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 238, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel10.setText("ENVIAR SOLICITUD:");

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 0, 16)); // NOI18N
        jLabel7.setText("Busca por el nombre de usuario:");

        jScrollPane1.setViewportView(jBuscarNombre);

        jBuscar.setBackground(new java.awt.Color(255, 224, 255));
        jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-búsqueda-24.png"))); // NOI18N
        jBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jTablaUsuarios.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jTablaUsuarios.setModel(new ModeloTablaUsuarios());
        jTablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablaUsuarios);

        jPanel3.setBackground(new java.awt.Color(244, 242, 255));

        jpendientes.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jpendientes.setModel(new ModeloTablaUsuarios());
        jpendientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpendientesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jpendientes);

        anadirAmigo.setBackground(new java.awt.Color(221, 222, 255));
        anadirAmigo.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        anadirAmigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-añadir-50.png"))); // NOI18N
        anadirAmigo.setText("AÑADIR AMIGO");
        anadirAmigo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        anadirAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirAmigoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel9.setText("TUS SOLICITUDES:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anadirAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(anadirAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jSolicitar.setBackground(new java.awt.Color(255, 219, 239));
        jSolicitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-pregunta-30.png"))); // NOI18N
        jSolicitar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSolicitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSolicitar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSolicitar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        // TODO add your handling code here:
        if (jBuscarNombre.getText().length() >= 3) {
            try {
                ModeloTablaUsuarios tablaUsuarios;
                tablaUsuarios = (ModeloTablaUsuarios) jTablaUsuarios.getModel();
                if (tablaUsuarios.getRowCount() > 0) {
                    tablaUsuarios.borrarTabla();
                }
                ArrayList<String> usuarios = this.serv.buscarUsuario(jBuscarNombre.getText(), usuario.getNombre());
                for (String nombre : usuarios) {
                    tablaUsuarios.anadirFila(nombre);
                }
            } catch (RemoteException ex) {
                Logger.getLogger(VSolicitudes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void anadirAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirAmigoActionPerformed
        // TODO add your handling code here:
        ModeloTablaUsuarios solicitudesUsuario;
        solicitudesUsuario = (ModeloTablaUsuarios) jpendientes.getModel();
        try {
            serv.aceptarAmistad(usuario.getNombre(), (String) solicitudesUsuario.getValueAt(jpendientes.getSelectedRow(), 0));
        } catch (RemoteException ex) {
            Logger.getLogger(VSolicitudes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_anadirAmigoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        padre.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_formWindowClosing

    private void jpendientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpendientesMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jpendientesMouseClicked

    private void jSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSolicitarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        ModeloTablaUsuarios solicitudesUsuario;
        solicitudesUsuario = (ModeloTablaUsuarios) jTablaUsuarios.getModel();
        try {
            serv.solicitarAmistad(usuario.getNombre(), (String) solicitudesUsuario.getValueAt(jTablaUsuarios.getSelectedRow(), 0));
            serv.buscarUsuario(jBuscarNombre.getText(), usuario.getNombre());
            ModeloTablaUsuarios tablaUsuarios;
            tablaUsuarios = (ModeloTablaUsuarios) jTablaUsuarios.getModel();
            if (tablaUsuarios.getRowCount() > 0) {
                tablaUsuarios.borrarTabla();
            }
            ArrayList<String> usuarios = this.serv.buscarUsuario(jBuscarNombre.getText(), usuario.getNombre());
            for (String nombre : usuarios) {
//                if (serv.buscarAmigosySolicitudes(usuario.getNombre()).contains(nombre)) {
//                    
//                    tablaUsuarios.borrarFila(nombre);
//                }
                tablaUsuarios.anadirFila(nombre);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(VSolicitudes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jSolicitarActionPerformed

    private void jTablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaUsuariosMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTablaUsuariosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anadirAmigo;
    private javax.swing.JButton jBuscar;
    private javax.swing.JTextPane jBuscarNombre;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jSolicitar;
    private javax.swing.JTable jTablaUsuarios;
    private javax.swing.JTable jpendientes;
    // End of variables declaration//GEN-END:variables
}
