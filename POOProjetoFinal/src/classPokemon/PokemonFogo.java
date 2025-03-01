package classPokemon;

public class PokemonFogo extends Pokemon {
    public String superEfetivo;
    public String fraqueza;

    // Construtor
    public PokemonFogo(String nome, int level, String habilidade, String superEfetivo, String fraqueza, String imagemPath) {
        super(nome, level, habilidade, imagemPath); // Chama o construtor da classe Pokemon
        this.superEfetivo = superEfetivo;
        this.fraqueza = fraqueza;
    }

    @Override
    public void ataque() {
        System.out.println(getNome() + " usou ataque de Fogo!");
    }
}
