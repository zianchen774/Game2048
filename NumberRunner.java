import info.gridworld.actor.*;
import info.gridworld.grid.*;

import java.awt.Color;

public class NumberRunner{
    public static void main(String[] args){
        BWorld world = new BWorld(new BoundedGrid<Actor>(4,4));
        world.add(new Two());
        world.add(new Two());
        world.show();
    }
}