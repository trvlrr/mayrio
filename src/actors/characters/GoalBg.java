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

package actors.characters;

import actors.core.StaticActor;
import core.sprites.Dimension;
import core.sprites.SpriteSheet;

public class GoalBg extends StaticActor {
    static SpriteSheet sheet;

    static {
        sheet = new SpriteSheet(new Dimension(16, 40), "/sprites/blocks/goal_bg.png");
    }

    GoalBg() {
        super(sheet.getSprite(0), false);
    }
}