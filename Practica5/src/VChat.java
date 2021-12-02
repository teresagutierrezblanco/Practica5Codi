
import java.rmi.RemoteException;
import java.util.List;
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
public class VChat extends javax.swing.JDialog {

    /**
     * Creates new form VChat
     */
    private Usuario usuario;
    private VAutentificacion padre;
    private ServerInterface serv;
    private Usuario amigoChat;

    public VChat(java.awt.Frame padre, ServerInterface serv) {
        super(padre);
        initComponents();

        this.padre = (VAutentificacion) padre;
        this.serv = serv;
        enviar.setEnabled(false);
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        saludoCliente.setText("¡Hola " + usuario.getNombre().toUpperCase() + "!");
        ModeloTablaUsuarios chats;
        chats = (ModeloTablaUsuarios) jTablaAmigos.getModel();

        for (String nombre : usuario.getAmigos().keySet()) {
            chats.anadirFila(nombre);

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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jMensajeEnviar = new javax.swing.JTextPane();
        enviar = new javax.swing.JButton();
        solicitudes = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jChat = new java.awt.TextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablaAmigos = new javax.swing.JTable();
        saludoCliente = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setMinimumSize(new java.awt.Dimension(32767, 32767));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(244, 249, 255));
        jPanel1.setFont(new java.awt.Font("OCR A Extended", 0, 16)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(244, 242, 255));
        jPanel3.setFont(new java.awt.Font("OCR A Extended", 0, 16)); // NOI18N

        jMensajeEnviar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMensajeEnviarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jMensajeEnviarKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jMensajeEnviar);

        enviar.setBackground(new java.awt.Color(244, 242, 255));
        enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-enviar-mensaje-48.png"))); // NOI18N
        enviar.setBorder(null);
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        solicitudes.setBackground(new java.awt.Color(252, 246, 220));
        solicitudes.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        solicitudes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-invitación-30.png"))); // NOI18N
        solicitudes.setText("SOLICITUDES");
        solicitudes.setToolTipText("");
        solicitudes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        solicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitudesActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jLabel8.setText("CHAT:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jChat, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(solicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(solicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jChat, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jTablaAmigos.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jTablaAmigos.setModel(new ModeloTablaUsuarios());
        jTablaAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaAmigosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTablaAmigos);

        saludoCliente.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jLabel10.setText("CONECTADOS:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(saludoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(178, 178, 178))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saludoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        // TODO add your handling code here:
        jChat.append(usuario.getNombre()+":  "+jMensajeEnviar.getText()+"\n");
        try {
            amigoChat.getInterfaz().recibirMensaje(usuario.getNombre()+":  "+jMensajeEnviar.getText()+"\n",usuario.getNombre());
        } catch (RemoteException ex) {
            Logger.getLogger(VChat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enviarActionPerformed

    public void recibirMensaje(String mensaje, String nombreU) {
        if (amigoChat.getNombre().equals(nombreU)) {
            jChat.append(mensaje);
        }
    }

    private void solicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitudesActionPerformed
        // TODO add your handling code here:
        VSolicitudes sol;
        try {
            sol = new VSolicitudes(this, usuario, serv);
            sol.setVisible(true);
        } catch (RemoteException ex) {
            Logger.getLogger(VChat.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_solicitudesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            this.serv.unregisterForCallback(usuario.getInterfaz(), usuario);
        } catch (RemoteException ex) {
            Logger.getLogger(VChat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jTablaAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaAmigosMouseClicked
        // TODO add your handling code here:

        ModeloTablaUsuarios amigosUsuario;
        amigosUsuario = (ModeloTablaUsuarios) jTablaAmigos.getModel();
        this.amigoChat = usuario.getAmigos().get((String) amigosUsuario.getValueAt(jTablaAmigos.getSelectedRow(), 0));
        jChat.setText("");

    }//GEN-LAST:event_jTablaAmigosMouseClicked

    private void jMensajeEnviarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMensajeEnviarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMensajeEnviarKeyPressed

    private void jMensajeEnviarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMensajeEnviarKeyReleased
        // TODO add your handling code here:
        if (jMensajeEnviar.getText().isEmpty() && this.amigoChat==null) {
            enviar.setEnabled(false);
        } else {
            enviar.setEnabled(true);
        }
    }//GEN-LAST:event_jMensajeEnviarKeyReleased

    public void actualizarNuevosChats(Usuario u) throws RemoteException {

        usuario.setAmigos(u);
        ModeloTablaUsuarios chats;
        chats = (ModeloTablaUsuarios) jTablaAmigos.getModel();
        chats.anadirFila(u.getNombre());

    }

    public void borrarChats(Usuario u) throws RemoteException {

        usuario.borrarAmigos(u);
        ModeloTablaUsuarios chats;

        chats = (ModeloTablaUsuarios) jTablaAmigos.getModel();
        chats.borrarTabla();
        chats.setFilas(usuario.getAmigos().keySet());

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enviar;
    private java.awt.TextArea jChat;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextPane jMensajeEnviar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTablaAmigos;
    private javax.swing.JLabel saludoCliente;
    private javax.swing.JButton solicitudes;
    // End of variables declaration//GEN-END:variables
}
