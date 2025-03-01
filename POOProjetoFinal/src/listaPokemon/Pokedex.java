package listaPokemon;

import java.util.ArrayList;
import java.util.List;

import classPokemon.Pokemon;

public class Pokedex {
    private List<Pokemon> pokedex;

    public Pokedex() {
        this.pokedex = new ArrayList<>();
    }

    // Método para adicionar Pokémon à Pokédex
    public void adicionarPokemon(Pokemon pokemon) {
        if (!pokedex.contains(pokemon)) {
            pokedex.add(pokemon);
            System.out.println(pokemon.getNome() + " foi adicionado à sua Pokédex!");
        }
    }

    // Método para acessar a Pokédex
    public List<Pokemon> getPokedex() {
        return pokedex;
    }
}
