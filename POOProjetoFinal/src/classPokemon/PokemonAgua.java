package classPokemon;

public class PokemonAgua extends Pokemon {
    public String superEfetivo;
    public String fraqueza;

    public PokemonAgua(String nome, int level, String habilidade, String superEfetivo, String fraqueza, String imagemPath) {
        super(nome, level, habilidade, imagemPath);
        this.superEfetivo = superEfetivo;
        this.fraqueza = fraqueza;
    }

    @Override
    public void ataque() {
        System.out.println(getNome() + " usou ataque de Água!");
    }
}
