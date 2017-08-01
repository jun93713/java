public abstract class PokemonAbstract implements PokemonInterface {
    @Override
    public void attackPokemon(Pokemon pokemon) {
        pokemon.setHealth(pokemon.getHealth() - 10);
    }

    @Override
    public Pokemon createPokemon(String name, int health, String type) {
        return new Pokemon(name, health, type);
    }
}
