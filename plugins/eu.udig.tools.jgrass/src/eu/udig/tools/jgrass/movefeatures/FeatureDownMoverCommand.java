/*
 * JGrass - Free Open Source Java GIS http://www.jgrass.org 
 * (C) HydroloGIS - www.hydrologis.com 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package eu.udig.tools.jgrass.movefeatures;

import net.refractions.udig.ui.operations.IOp;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.geotools.data.FeatureSource;

import eu.udig.tools.jgrass.utils.AbstractHandlerCommand;

/**
 * Command for moving features.
 * 
 * @author Andrea Antonello (www.hydrologis.com)
 */
public class FeatureDownMoverCommand extends AbstractHandlerCommand {

    public Object execute( ExecutionEvent event ) throws ExecutionException {
        final IOp op = new FeatureDownMover();
        try {
            runOp(op, FeatureSource.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
