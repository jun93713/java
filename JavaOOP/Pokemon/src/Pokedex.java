public abstract class Pokedex extends PokemonAbstract {
    @Override
    public String pokemonInfo(Pokemon pokemon) {
        return "name: " + pokemon.getName() + ", type: " + pokemon.getType() + ", health: " + pokemon.getHealth();
    }
}
