package swingPokemon;

import javax.swing.*;
import classPokemon.Pokemon;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import listaPokemon.*;

public class SwingPokemon {
    private static List<Pokemon> pokedex = new ArrayList<>();
    private static JButton button6;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Troca de Painéis com Botões");
        frame.setSize(1080, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setLayout(new BorderLayout());

        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        JPanel painelPrincipal = new JPanel(null);
        painelPrincipal.setBackground(new Color(240, 240, 240));

        JPanel panel2 = new JPanel(null);
        JPanel panel3 = new JPanel(null);

        JButton button1 = new JButton();
        button1.setBounds(125, 271, 223, 114);
        configurarBotao(button1, "POKEDEX");
        button1.addActionListener(e -> {
            atualizarPokedex(panel2, cardLayout, cardPanel);
            cardLayout.show(cardPanel, "panel2");
        });

        JButton button2 = new JButton();
        button2.setBounds(28, 540, 223, 114);
        configurarBotao(button2, "VOLTAR");
        button2.addActionListener(e -> cardLayout.show(cardPanel, "panel1"));

        JButton button3 = new JButton();
        button3.setBounds(712, 271, 223, 114);
        configurarBotao(button3, "CAÇAR");
        button3.addActionListener(e -> cardLayout.show(cardPanel, "panel3"));

        JButton button4 = new JButton();
        button4.setBounds(28, 540, 223, 114);
        configurarBotao(button4, "VOLTAR");
        button4.addActionListener(e -> cardLayout.show(cardPanel, "panel1"));

        JButton button5 = new JButton();
        button5.setBounds(420, 540, 223, 114);
        configurarBotao(button5, "PROCURAR");
        button5.addActionListener(e -> procurarPokemon(frame, panel3));

        panel3.add(button5);

        button6 = new JButton();
        button6.setBounds(807, 540, 223, 114);
        configurarBotao(button6, "CAPTURAR");
        button6.setVisible(false);

        panel3.add(button6);

        JLabel lblTitulo = new JLabel();
        ImageIcon iconTitulo = new ImageIcon("C:\\Users\\davvi\\OneDrive\\Documentos\\ProjetosPOO\\ImagensProjetos\\Pokemon-Yellow-Logo-PNG-Pic-Background.png");
        lblTitulo.setIcon(new ImageIcon(iconTitulo.getImage().getScaledInstance(600, 200, Image.SCALE_SMOOTH)));
        lblTitulo.setBounds(227, 32, 600, 200);
        painelPrincipal.add(lblTitulo);

        JLabel fundoLabel = new JLabel(new ImageIcon("C:\\Users\\davvi\\Downloads\\sr2f745bc58f2aws3.gif"));
        fundoLabel.setBounds(0, 0, 1080, 730);

        painelPrincipal.add(button1);
        painelPrincipal.add(button3);
        painelPrincipal.add(fundoLabel);
        panel2.add(button2);
        panel3.add(button4);

        cardPanel.add(painelPrincipal, "panel1");
        cardPanel.add(panel2, "panel2");
        cardPanel.add(panel3, "panel3");

        JLabel fundoLabel1 = new JLabel(new ImageIcon("C:\\Users\\davvi\\Downloads\\sr2f745bc58f2aws3.gif"));
        fundoLabel1.setBounds(0, 0, 1080, 730);
        panel2.add(fundoLabel1);

        JLabel fundoLabel2 = new JLabel(new ImageIcon("C:\\Users\\davvi\\Downloads\\sr2f745bc58f2aws3.gif"));
        fundoLabel2.setBounds(0, 0, 1080, 730);
        panel3.add(fundoLabel2);
        panel3.setComponentZOrder(fundoLabel2, panel3.getComponentCount() - 1);

        frame.getContentPane().add(cardPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static void atualizarPokedex(JPanel panel2, CardLayout cardLayout, JPanel cardPanel) {
        panel2.removeAll(); 
        panel2.setLayout(null); 

        JLabel fundoLabel = new JLabel(new ImageIcon("C:\\Users\\davvi\\Downloads\\sr2f745bc58f2aws3.gif"));
        fundoLabel.setBounds(0, 0, 1080, 730);
        panel2.add(fundoLabel);

        int y = 50;
        for (Pokemon p : pokedex) {
        	
            JLabel nomePokemon = new JLabel(p.getNome());
            nomePokemon.setFont(new Font("Rockwell", Font.BOLD, 20));
            nomePokemon.setBounds(50, y, 200, 30);

            ImageIcon icon = new ImageIcon(p.getImagem());
            JLabel imgLabel = new JLabel(new ImageIcon(icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
            imgLabel.setBounds(300, y, 100, 100);

            panel2.add(nomePokemon);
            panel2.add(imgLabel);

            y += 120;
        }

        JButton botaoVoltar = new JButton();
        botaoVoltar.setBounds(28, 540, 223, 114);  
        configurarBotao(botaoVoltar, "VOLTAR");
        botaoVoltar.addActionListener(e -> cardLayout.show(cardPanel, "panel1"));

        panel2.add(botaoVoltar);

        panel2.setComponentZOrder(fundoLabel, panel2.getComponentCount() - 1); 

        panel2.revalidate();
        panel2.repaint();
    }

    private static void configurarBotao(JButton botao, String texto) {
        ImageIcon icon = new ImageIcon("C:\\Users\\davvi\\OneDrive\\Documentos\\ProjetosPOO\\ImagensProjetos\\9726803-botoes-de-madeira-pixel-art-para-jogo-e-app-interface-icone-para-jogo-de-8-bits-em-fundo-branco-vetor-removebg-preview.png");
        botao.setIcon(new ImageIcon(icon.getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH)));
        botao.setText(texto);
        botao.setHorizontalTextPosition(SwingConstants.CENTER);
        botao.setVerticalTextPosition(SwingConstants.CENTER);
        botao.setFont(new Font("Rockwell", Font.BOLD, 28));
        botao.setForeground(new Color(128, 64, 0));
        botao.setOpaque(false);
        botao.setBorderPainted(false);
        botao.setContentAreaFilled(false);
    }

    private static void procurarPokemon(JFrame frame, JPanel panel3) {
        ListaPokemonsSelvagens lista = new ListaPokemonsSelvagens();

        if (lista.getPokemons().isEmpty()) {
            JLabel fundoLabel = new JLabel(new ImageIcon("C:\\Caminho\\Para\\Sua\\Imagem\\de\\fundo.png"));
            fundoLabel.setBounds(0, 0, 1080, 730);
            panel3.removeAll(); 
            panel3.add(fundoLabel);
            JOptionPane.showMessageDialog(frame, "Nenhum Pokémon nas redondezas!");
            panel3.revalidate();
            panel3.repaint();
            return;
        }

        List<Pokemon> pokemonsNaoCapturados = new ArrayList<>();
        for (Pokemon p : lista.getPokemons()) {
            if (!pokedex.contains(p)) {
                pokemonsNaoCapturados.add(p);
            }
        }

        if (pokemonsNaoCapturados.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Você já capturou todos os Pokémon!");
            return;
        }

        int indiceAleatorio = (int) (Math.random() * pokemonsNaoCapturados.size());
        Pokemon pokemon = pokemonsNaoCapturados.get(indiceAleatorio);

        for (Component comp : panel3.getComponents()) {
            if (comp instanceof JLabel && comp != panel3.getComponent(panel3.getComponentCount() - 1)) {
                panel3.remove(comp);  
            }
        }

        String caminhoImagem = pokemon.getImagem();
        ImageIcon imageIcon = new ImageIcon(caminhoImagem);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(286, 20, 500, 500);

        panel3.add(label);
        panel3.setComponentZOrder(label, 0);
        panel3.revalidate();
        panel3.repaint();

        final boolean[] capturado = {false};  
        final boolean[] fuga = {false};     

        button6.setVisible(true);
        button6.addActionListener(e -> {
            if (capturado[0] || fuga[0]) {
                return;
            }

            for (int i = 1; i <= 3; i++) {
                int chance = (int) (Math.random() * 100);
                if (chance < 30) {
                    JOptionPane.showMessageDialog(frame, "Tentativa " + i + "/3: Você capturou " + pokemon.getNome() + "!");
                    pokedex.add(pokemon);
                    lista.getPokemons().remove(pokemon); 
                    capturado[0] = true; 
                    break;
                } else {
                    JOptionPane.showMessageDialog(frame, "Tentativa " + i + "/3: Falha na captura!");
                }
            }

            panel3.remove(label);
            panel3.revalidate();
            panel3.repaint();

            if (!capturado[0]) {
                JOptionPane.showMessageDialog(frame, pokemon.getNome() + " fugiu!");
                fuga[0] = true;  
            }

            button6.setVisible(false);
        });
    }

}
