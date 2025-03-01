package listaPokemon;

import java.util.ArrayList;
import java.util.List;
import classPokemon.*;

public class ListaPokemonsSelvagens {
    private List<Pokemon> pokemons;

    public ListaPokemonsSelvagens() {
        pokemons = new ArrayList<>();
        inicializarPokemons();
    }

    private void inicializarPokemons() {
        pokemons.add(new PokemonFogo("Charizard", 80, "Blaze", "Água", "Terra", "C:\\Users\\davvi\\OneDrive\\Documentos\\ProjetosPOO\\ImagensProjetos\\charizard.png"));
        pokemons.add(new PokemonFogo("Flareon", 10, "Flash Fire", "Água", "Terra", "C:\\Users\\davvi\\OneDrive\\Documentos\\ProjetosPOO\\ImagensProjetos\\flareon.png"));
        pokemons.add(new PokemonFogo("Moltres", 75, "Pressure", "Água", "Terra", "C:\\Users\\davvi\\OneDrive\\Documentos\\ProjetosPOO\\ImagensProjetos\\moltres.png"));
        pokemons.add(new PokemonFogo("Arcanine", 35, "Justified", "Água", "Terra", "C:\\Users\\davvi\\OneDrive\\Documentos\\ProjetosPOO\\ImagensProjetos\\Arcanine.png"));
        pokemons.add(new PokemonFogo("Ninetales", 40, "Drought", "Água", "Terra", "C:\\Users\\davvi\\OneDrive\\Documentos\\ProjetosPOO\\ImagensProjetos\\NINETALES.png"));
    }

    // Adicionando o getter para acessar a lista
    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
