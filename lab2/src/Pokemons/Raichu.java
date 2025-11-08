package Pokemons;

import Attacks.*;
import ru.ifmo.se.pokemon.*;

public final class Raichu extends Pikachu {
    public Raichu(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(60, 90, 55, 90, 80, 110);
        addMove(new QuickAttack());
    }
}
