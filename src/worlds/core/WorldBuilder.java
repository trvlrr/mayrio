/*
 * This file is part of mayrio.
 *
 * mayrio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mayrio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mayrio.  If not, see <https://www.gnu.org/licenses/>.
 */

package worlds.core;

import actors.characters.Ground;
import actors.core.Coordinate;
import actors.core.GroundType;
import core.Grid;
import mayflower.Mayflower;
import mayflower.World;

public class WorldBuilder {
    private static World world;

    public static void setWorld(World world) {
        WorldBuilder.world = world;
    }

    /**
     * Creates flat ground
     */
    public static void createFlatGround() {
        for (int x = 0; x < Grid.getCellsX(); x++) {
            Ground ground1 = new Ground(GroundType.FLAT_TOP);
            Ground ground2 = new Ground(GroundType.MIDDLE);
            Coordinate coords = Grid.toScreen(x, 0);
            world.addObject(ground1, coords.x(), Mayflower.getHeight() - ground1.getImage().getHeight() * 3);
            world.addObject(ground2, coords.x(), Mayflower.getHeight() - ground1.getImage().getHeight() * 2);
        }
    }

    /**
     * Creates a ground with a pitfall
     *
     * @param startCell Cell to start the pitfall at
     * @param endCell   Cell to end the pitfall at
     */
    public static void createPitfall(int startCell, int endCell) {
        for (int x = 0; x < Grid.getCellsX(); x++) {
            if (x >= startCell && x <= endCell) {
                continue;
            }
            Ground ground1 = new Ground(GroundType.FLAT_TOP);
            Ground ground2 = new Ground(GroundType.MIDDLE);
            Coordinate coords = Grid.toScreen(x, 0);
            world.addObject(ground1, coords.x(), Mayflower.getHeight() - ground1.getImage().getHeight() * 3);
            world.addObject(ground2, coords.x(), Mayflower.getHeight() - ground1.getImage().getHeight() * 2);
        }
    }
}