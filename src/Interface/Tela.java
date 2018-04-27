package Interface;

import compilador.compilador_tokens;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Tela extends javax.swing.JFrame {

    boolean test = false;

    public Tela() {
        initComponents();
        setTitle("Compilador");
        seletorArquivo.setVisible(false);
        botaoSalvar.setEnabled(false);
        opcaoSalvar.setEnabled(false);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                sair();
            }
        });
        seletorArquivo.addChoosableFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
        seletorArquivo.setAcceptAllFileFilterUsed(false);
        seletorArquivo.setCurrentDirectory(new File(System.getProperty("user.dir")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seletorArquivo = new javax.swing.JFileChooser();
        scrollPaneCampoEntradaAtual = new javax.swing.JScrollPane();
        campoEntradaAtual = new javax.swing.JTextArea();
        scrollPaneCampoAuxiliar = new javax.swing.JScrollPane();
        campoAuxiliar = new javax.swing.JTextArea();
        scrollPaneCampoEntrada = new javax.swing.JScrollPane();
        campoEntrada = new javax.swing.JTextArea();
        scrollPaneCampoSaida = new javax.swing.JScrollPane();
        campoSaida = new javax.swing.JTextPane();
        barraFerramentas = new javax.swing.JToolBar();
        botaoNovo = new javax.swing.JButton();
        botaoAbrir = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        separador1 = new javax.swing.JToolBar.Separator();
        botaoCopiar = new javax.swing.JButton();
        botaoColar = new javax.swing.JButton();
        botaoRecortar = new javax.swing.JButton();
        separador2 = new javax.swing.JToolBar.Separator();
        botaoCompilar = new javax.swing.JButton();
        campoResultado = new javax.swing.JLabel();
        contadorLinhaColuna = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        barraMenu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        opcaoNovo = new javax.swing.JMenuItem();
        opcaoAbrir = new javax.swing.JMenuItem();
        opcaoSalvar = new javax.swing.JMenuItem();
        opcaoSalvarComo = new javax.swing.JMenuItem();
        opcaoSair = new javax.swing.JMenuItem();
        menuEdicao = new javax.swing.JMenu();
        opcaoCopiar = new javax.swing.JMenuItem();
        opcaoColar = new javax.swing.JMenuItem();
        opcaoRecortar = new javax.swing.JMenuItem();
        menuCompilacao = new javax.swing.JMenu();
        opcaoCompilar = new javax.swing.JMenuItem();
        opcaoExecutar = new javax.swing.JMenuItem();

        seletorArquivo.setCurrentDirectory(new java.io.File("C:\\Program Files\\NetBeans 8.2\\user.dir"));
        seletorArquivo.getAccessibleContext().setAccessibleName("seletorArquivo");

        campoEntradaAtual.setColumns(20);
        campoEntradaAtual.setRows(5);
        campoEntradaAtual.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoEntradaAtual.setName(""); // NOI18N
        campoEntradaAtual.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                campoEntradaAtualCaretUpdate(evt);
            }
        });
        scrollPaneCampoEntradaAtual.setViewportView(campoEntradaAtual);

        campoAuxiliar.setColumns(20);
        campoAuxiliar.setRows(5);
        campoAuxiliar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoAuxiliar.setName(""); // NOI18N
        campoAuxiliar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                campoAuxiliarCaretUpdate(evt);
            }
        });
        scrollPaneCampoAuxiliar.setViewportView(campoAuxiliar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Compilador");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("telaCompilador"); // NOI18N

        campoEntrada.setColumns(20);
        campoEntrada.setRows(5);
        campoEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoEntrada.setName(""); // NOI18N
        campoEntrada.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                campoEntradaCaretUpdate(evt);
            }
        });
        scrollPaneCampoEntrada.setViewportView(campoEntrada);

        campoSaida.setEditable(false);
        scrollPaneCampoSaida.setViewportView(campoSaida);

        barraFerramentas.setFloatable(false);
        barraFerramentas.setRollover(true);
        barraFerramentas.setEnabled(false);

        botaoNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Icones/Novo.PNG"))); // NOI18N
        botaoNovo.setText("Novo");
        botaoNovo.setFocusable(false);
        botaoNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });
        barraFerramentas.add(botaoNovo);

        botaoAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Icones/Abrir.PNG"))); // NOI18N
        botaoAbrir.setText("Abrir");
        botaoAbrir.setFocusable(false);
        botaoAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbrirActionPerformed(evt);
            }
        });
        barraFerramentas.add(botaoAbrir);

        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Icones/Salvar.PNG"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.setFocusable(false);
        botaoSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        barraFerramentas.add(botaoSalvar);
        barraFerramentas.add(separador1);

        botaoCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Icones/Copiar.PNG"))); // NOI18N
        botaoCopiar.setText("Copiar");
        botaoCopiar.setFocusable(false);
        botaoCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCopiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCopiarActionPerformed(evt);
            }
        });
        barraFerramentas.add(botaoCopiar);

        botaoColar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Icones/Colar.PNG"))); // NOI18N
        botaoColar.setText("Colar");
        botaoColar.setFocusable(false);
        botaoColar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoColar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoColarActionPerformed(evt);
            }
        });
        barraFerramentas.add(botaoColar);

        botaoRecortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Icones/Recortar.PNG"))); // NOI18N
        botaoRecortar.setText("Recortar");
        botaoRecortar.setFocusable(false);
        botaoRecortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoRecortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRecortarActionPerformed(evt);
            }
        });
        barraFerramentas.add(botaoRecortar);
        barraFerramentas.add(separador2);

        botaoCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Icones/Compilar.PNG"))); // NOI18N
        botaoCompilar.setText("Compilar");
        botaoCompilar.setFocusable(false);
        botaoCompilar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCompilar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCompilarActionPerformed(evt);
            }
        });
        barraFerramentas.add(botaoCompilar);

        campoResultado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        contadorLinhaColuna.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        contadorLinhaColuna.setText("1:1");
        contadorLinhaColuna.setToolTipText("");
        contadorLinhaColuna.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        menuArquivo.setText("Arquivo");

        opcaoNovo.setText("Novo");
        opcaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoNovoActionPerformed(evt);
            }
        });
        menuArquivo.add(opcaoNovo);

        opcaoAbrir.setText("Abrir");
        opcaoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoAbrirActionPerformed(evt);
            }
        });
        menuArquivo.add(opcaoAbrir);

        opcaoSalvar.setText("Salvar");
        opcaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoSalvarActionPerformed(evt);
            }
        });
        menuArquivo.add(opcaoSalvar);

        opcaoSalvarComo.setText("Salvar como");
        opcaoSalvarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoSalvarComoActionPerformed(evt);
            }
        });
        menuArquivo.add(opcaoSalvarComo);

        opcaoSair.setText("Sair");
        opcaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoSairActionPerformed(evt);
            }
        });
        menuArquivo.add(opcaoSair);

        barraMenu.add(menuArquivo);

        menuEdicao.setText("Edição");

        opcaoCopiar.setText("Copiar");
        opcaoCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoCopiarActionPerformed(evt);
            }
        });
        menuEdicao.add(opcaoCopiar);

        opcaoColar.setText("Colar");
        opcaoColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoColarActionPerformed(evt);
            }
        });
        menuEdicao.add(opcaoColar);

        opcaoRecortar.setText("Recortar");
        opcaoRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoRecortarActionPerformed(evt);
            }
        });
        menuEdicao.add(opcaoRecortar);

        barraMenu.add(menuEdicao);

        menuCompilacao.setText("Compilação");

        opcaoCompilar.setText("Compilar");
        opcaoCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoCompilarActionPerformed(evt);
            }
        });
        menuCompilacao.add(opcaoCompilar);

        opcaoExecutar.setText("Executar");
        menuCompilacao.add(opcaoExecutar);

        barraMenu.add(menuCompilacao);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneCampoEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
            .addComponent(barraFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollPaneCampoSaida)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(campoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contadorLinhaColuna)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneCampoEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneCampoSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contadorLinhaColuna)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoResultado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        getAccessibleContext().setAccessibleDescription("telaPrincipal");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean modificado() {
        return (!campoEntradaAtual.getText().equals(campoEntrada.getText()));
    }

    private void abrirArquivo() {
        campoEntrada.setText(campoAuxiliar.getText());
        campoEntradaAtual.setText(campoAuxiliar.getText());
        campoSaida.setText("");
        campoResultado.setText("");
        if (seletorArquivo.getSelectedFile().getPath().endsWith(".txt")) {
            setTitle("Compilador - [" + seletorArquivo.getSelectedFile().getPath() + "]");
        } else {
            setTitle("Compilador - [" + seletorArquivo.getSelectedFile().getPath() + ".txt]");
        }
        System.out.println(getTitle());
        botaoSalvar.setEnabled(modificado());
        opcaoSalvar.setEnabled(modificado());
    }

    private void limparArea() {
        campoEntrada.setText("");
        campoAuxiliar.setText("");
        campoEntradaAtual.setText("");
        campoSaida.setText("");
        campoResultado.setText("");
        setTitle("Compilador");
    }

    private void questionaSalvar(String acao) {
        String[] opcoes = {"Salvar", "Não salvar", "Cancelar"};
        int resultado = JOptionPane.showOptionDialog(null, "Deseja salvar o conteúdo?", "Alerta!",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);
        if (resultado != 2) {
            if (resultado == 0) {
                salvar();
            }
            switch (acao) {
                case "Abrir":
                    abrirArquivo();
                    break;
                case "Novo":
                    limparArea();
                    break;
                case "Sair":
                    System.exit(0);
                    break;
            }
        }
    }

    private void salvarComo() {
        seletorArquivo.setVisible(true);
        int userSelection = seletorArquivo.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File arquivo_extensao = new File(seletorArquivo.getSelectedFile().getAbsoluteFile() + ".txt");
            if (seletorArquivo.getSelectedFile().getName().endsWith(".txt")) {
                arquivo_extensao = new File("" + seletorArquivo.getSelectedFile().getAbsoluteFile());
            }
            System.out.println(arquivo_extensao.getAbsoluteFile());
            if (arquivo_extensao.exists()) {
                String[] opcoes = {"Sim", "Não"};
                int resultado = JOptionPane.showOptionDialog(null, "Deseja sobrescrever o arquivo?", "Alerta!",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);
                if (resultado == 0) {
                    escreverArquivo(arquivo_extensao);
                } else {
                    salvarComo();
                }
            } else {
                escreverArquivo(arquivo_extensao);
            }
        }
    }

    private void salvar() {
        if (!getTitle().equals("Compilador")) {
            File arquivo = new File((getTitle().subSequence(14, getTitle().length() - 1)).toString());
            escreverArquivo(arquivo);
        } else {
            salvarComo();
        }
        botaoSalvar.setEnabled(modificado());
        opcaoSalvar.setEnabled(modificado());
    }

    private void escreverArquivo(File arquivo) {
        try {
            campoEntrada.write(new OutputStreamWriter(new FileOutputStream(arquivo), "iso-8859-1"));
            campoAuxiliar.setText(campoEntrada.getText());
            abrirArquivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sair() {
        if (!getTitle().equals("Compilador")) {
            if (modificado()) {
                questionaSalvar("Sair");
            } else {
                System.exit(0);
            }
        } else {
            if (!campoEntrada.getText().isEmpty()) {
                questionaSalvar("Sair");
            } else {
                System.exit(0);
            }
        }
    }

    private void contarLinhaColuna() {
        int numeroLinha = 1;
        int numeroColuna = 1;
        try {
            int posicao = campoEntrada.getCaretPosition();
            numeroLinha = campoEntrada.getLineOfOffset(posicao);
            numeroColuna = posicao - campoEntrada.getLineStartOffset(numeroLinha)+1;
            numeroLinha += 1;
        } catch (Exception e) {
        }
        contadorLinhaColuna.setText(numeroLinha + ":" + numeroColuna);
    }

    private void novo() {
        if (!getTitle().equals("Compilador")) {
            if (modificado()) {
                questionaSalvar("Novo");
            } else {
                limparArea();
            }
        } else {
            if (!campoEntrada.getText().isEmpty()) {
                questionaSalvar("Novo");
            } else {
                limparArea();
            }
        }
        botaoSalvar.setEnabled(modificado());
        opcaoSalvar.setEnabled(modificado());
    }

    private void abrir() {
        seletorArquivo.setVisible(true);
        int returnVal = seletorArquivo.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = seletorArquivo.getSelectedFile();
            try {
                campoAuxiliar.read(new FileReader(file.getAbsolutePath()), null);
                if (!getTitle().equals("Compilador")) {
                    if (modificado()) {
                        questionaSalvar("Abrir");
                    } else {
                        abrirArquivo();
                    }
                } else {
                    if (!campoEntrada.getText().isEmpty()) {
                        questionaSalvar("Abrir");
                    } else {
                        abrirArquivo();
                    }
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "Arquivo não encontrado: " + file.getAbsolutePath(),
                        "Abrir", JOptionPane.ERROR_MESSAGE, null);
            }
        }
    }

    private void opcaoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoAbrirActionPerformed
        abrir();
    }//GEN-LAST:event_opcaoAbrirActionPerformed

    private void opcaoCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoCopiarActionPerformed
        if (campoEntrada.getSelectedText() != null) {
            Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
            ClipboardOwner selecao = new StringSelection(campoEntrada.getSelectedText());
            board.setContents((Transferable) selecao, selecao);
        }
    }//GEN-LAST:event_opcaoCopiarActionPerformed

    private void opcaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoSairActionPerformed
        sair();
    }//GEN-LAST:event_opcaoSairActionPerformed

    private void opcaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoNovoActionPerformed
        novo();
    }//GEN-LAST:event_opcaoNovoActionPerformed

    private void botaoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAbrirActionPerformed
        opcaoAbrirActionPerformed(evt);
    }//GEN-LAST:event_botaoAbrirActionPerformed

    private void campoEntradaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_campoEntradaCaretUpdate
        botaoSalvar.setEnabled(modificado());
        opcaoSalvar.setEnabled(modificado());
        contarLinhaColuna();
    }//GEN-LAST:event_campoEntradaCaretUpdate

    private void botaoCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCopiarActionPerformed
        opcaoCopiarActionPerformed(evt);
    }//GEN-LAST:event_botaoCopiarActionPerformed

    private void opcaoColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoColarActionPerformed
        campoEntrada.paste();
    }//GEN-LAST:event_opcaoColarActionPerformed

    private void botaoColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoColarActionPerformed
        opcaoColarActionPerformed(evt);
    }//GEN-LAST:event_botaoColarActionPerformed

    private void opcaoRecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoRecortarActionPerformed
        opcaoCopiarActionPerformed(evt);
        campoEntrada.replaceSelection("");
    }//GEN-LAST:event_opcaoRecortarActionPerformed

    private void botaoRecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRecortarActionPerformed
        opcaoRecortarActionPerformed(evt);
    }//GEN-LAST:event_botaoRecortarActionPerformed

    private void campoEntradaAtualCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_campoEntradaAtualCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEntradaAtualCaretUpdate

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        opcaoNovoActionPerformed(evt);
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        opcaoSalvarActionPerformed(evt);
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void opcaoSalvarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoSalvarComoActionPerformed
        salvarComo();
    }//GEN-LAST:event_opcaoSalvarComoActionPerformed

    private void opcaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoSalvarActionPerformed
        salvar();
    }//GEN-LAST:event_opcaoSalvarActionPerformed

    private void botaoCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCompilarActionPerformed
        opcaoCompilarActionPerformed(evt);
    }//GEN-LAST:event_botaoCompilarActionPerformed

    private void campoAuxiliarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_campoAuxiliarCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAuxiliarCaretUpdate

    private void opcaoCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoCompilarActionPerformed
        campoResultado.setForeground(Color.green);
        campoResultado.setText("Compilando...");
        compilador_tokens lex;
        lex = new compilador_tokens(new ByteArrayInputStream(campoEntrada.getText().getBytes()));
        try {
            lex.run();//processamento dos lexemas
            campoSaida.setText(lex.token_source.getMessage());
            if (lex.token_source.foundLexError() != 0){
                campoResultado.setForeground(Color.red);
                campoResultado.setText("Compilação falhou com " + lex.token_source.foundLexError() + " erro(s)!");
            } else {
                campoResultado.setForeground(Color.blue);
                campoResultado.setText("Compilação realizada com sucesso!");
            }
        } catch (Exception e) {
            campoResultado.setForeground(Color.red);
            campoResultado.setText("Falha na compilação");
            JOptionPane.showMessageDialog(null, "Analise Sintaxica NOT OK");
            System.out.println("Erro de Token.");
            e.printStackTrace();
        } catch (Error e) {
            campoResultado.setForeground(Color.red);
            campoResultado.setText("Falha na compilação");
            System.out.println(e.getMessage());//Mensagem de erro léxico (em ingles) mostrando linha e coluna
        }
    }//GEN-LAST:event_opcaoCompilarActionPerformed

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
                if ("Native".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraFerramentas;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botaoAbrir;
    private javax.swing.JButton botaoColar;
    private javax.swing.JButton botaoCompilar;
    private javax.swing.JButton botaoCopiar;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoRecortar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextArea campoAuxiliar;
    private javax.swing.JTextArea campoEntrada;
    private javax.swing.JTextArea campoEntradaAtual;
    private javax.swing.JLabel campoResultado;
    private javax.swing.JTextPane campoSaida;
    private javax.swing.JLabel contadorLinhaColuna;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuCompilacao;
    private javax.swing.JMenu menuEdicao;
    private javax.swing.JMenuItem opcaoAbrir;
    private javax.swing.JMenuItem opcaoColar;
    private javax.swing.JMenuItem opcaoCompilar;
    private javax.swing.JMenuItem opcaoCopiar;
    private javax.swing.JMenuItem opcaoExecutar;
    private javax.swing.JMenuItem opcaoNovo;
    private javax.swing.JMenuItem opcaoRecortar;
    private javax.swing.JMenuItem opcaoSair;
    private javax.swing.JMenuItem opcaoSalvar;
    private javax.swing.JMenuItem opcaoSalvarComo;
    private javax.swing.JScrollPane scrollPaneCampoAuxiliar;
    private javax.swing.JScrollPane scrollPaneCampoEntrada;
    private javax.swing.JScrollPane scrollPaneCampoEntradaAtual;
    private javax.swing.JScrollPane scrollPaneCampoSaida;
    private javax.swing.JFileChooser seletorArquivo;
    private javax.swing.JToolBar.Separator separador1;
    private javax.swing.JToolBar.Separator separador2;
    // End of variables declaration//GEN-END:variables
}
