package classPokemon;

import java.util.Objects;

public abstract class Pokemon {
    private String nome;
    private int level;
    private String habilidade;
    private String imagem;

    public Pokemon(String nome, int level, String habilidade, String imagem) {
        this.nome = nome;
        this.level = level;
        this.habilidade = habilidade;
        this.imagem = imagem;
    }

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

    public abstract void ataque();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pokemon pokemon = (Pokemon) obj;
        return Objects.equals(nome, pokemon.nome); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
