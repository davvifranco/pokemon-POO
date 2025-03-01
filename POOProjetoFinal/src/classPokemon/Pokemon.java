package classPokemon;

import java.util.Objects;

public abstract class Pokemon {
    private String nome;
    private int level;
    private String habilidade;
    private String imagem;

    // Construtor para inicializar nome, level e habilidade
    public Pokemon(String nome, int level, String habilidade, String imagem) {
        this.nome = nome;
        this.level = level;
        this.habilidade = habilidade;
        this.imagem = imagem;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void ataque();

    // Adicionando equals para comparar Pokémon com base no nome (ou outros atributos)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pokemon pokemon = (Pokemon) obj;
        return Objects.equals(nome, pokemon.nome); // Compara o nome (ou outros atributos)
    }

    // Adicionando hashCode para garantir que seja consistente com equals
    @Override
    public int hashCode() {
        return Objects.hash(nome); // Usa o nome para o código hash
    }
}
