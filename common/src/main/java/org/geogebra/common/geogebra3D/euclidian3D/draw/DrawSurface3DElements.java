package org.geogebra.common.geogebra3D.euclidian3D.draw;

import org.geogebra.common.awt.GColor;
import org.geogebra.common.geogebra3D.euclidian3D.EuclidianView3D;
import org.geogebra.common.geogebra3D.euclidian3D.openGL.PlotterSurface;
import org.geogebra.common.geogebra3D.euclidian3D.openGL.PlotterSurfaceElements;
import org.geogebra.common.geogebra3D.euclidian3D.printer3D.ExportToPrinter3D;
import org.geogebra.common.geogebra3D.euclidian3D.printer3D.Geometry3DGetterManager;
import org.geogebra.common.kernel.geos.GeoElement;
import org.geogebra.common.kernel.kernelND.SurfaceEvaluable;
import org.geogebra.common.kernel.matrix.Coords3;
import org.geogebra.common.plugin.Geometry3DGetter.GeometryType;

/**
 * Draw 3D surface with GL drawElements()
 * 
 * @author mathieu
 *
 */
public class DrawSurface3DElements extends DrawSurface3D {
	private int lastIndex;

	/**
	 * constructor
	 * 
	 * @param a_view3d
	 *            view
	 * @param surface
	 *            surface
	 */
	public DrawSurface3DElements(EuclidianView3D a_view3d,
			SurfaceEvaluable surface) {
		super(a_view3d, surface);
	}

	@Override
	protected void drawTriangle(PlotterSurface surface, CornerAndCenter cc,
			Corner c1, Corner c2) {

		if (checkIdsAreNotShort(cornerBuilder.getCornerListIndex() + cc.id, c1.id, c2.id)) {
			return;
		}

		((PlotterSurfaceElements) surface).drawIndex
				(cornerBuilder.getCornerListIndex() + cc.id);
		((PlotterSurfaceElements) surface).drawIndex(c2.id);
		((PlotterSurfaceElements) surface).drawIndex(c1.id);
	}

	@Override
	protected void drawCornersAndCenters(PlotterSurface surface) {
		cornerBuilder.drawCornersAndCenters(surface, drawListIndex, drawList);
		lastIndex = cornerBuilder.getCornerListIndex() + drawListIndex;

	}

	@Override
	protected void drawTriangle(PlotterSurface surface, Coords3 p0, Coords3 n0,
			Corner c1, Corner c2) {

		if (checkIdsAreNotShort(lastIndex, c1.id, c2.id)) {
			return;
		}

		// add normal and vertex, and create new index
		draw(surface, p0, n0);
		draw(surface, c2);
		draw(surface, c1);

	}

	private void draw(PlotterSurface surface, Coords3 p0, Coords3 n0) {
		// add normal and vertex
		surface.normalDirect(n0);
		surface.vertexDirect(p0);

		// set indices for new triangle
		((PlotterSurfaceElements) surface).drawIndex(lastIndex);
		lastIndex++;
	}

	private void draw(PlotterSurface surface, Corner c) {

		if (c.id < 0) { // needs new id
			draw(surface, c.p, c.normal);
		} else {
			((PlotterSurfaceElements) surface).drawIndex(c.id);
		}

	}

	private static boolean checkIdsAreNotShort(int id1, int id2, int id3) {
		return checkIdIsNotShort(id1) || checkIdIsNotShort(id2) || checkIdIsNotShort(id3);
	}

	private static boolean checkIdIsNotShort(int id) {
		return id >= Short.MAX_VALUE;
	}

	@Override
	public void exportToPrinter3D(ExportToPrinter3D exportToPrinter3D, boolean exportSurface) {
		if (isVisible()) {
			exportToPrinter3D.export(this, exportSurface);
		}
	}

	@Override
	public void export(Geometry3DGetterManager manager, boolean exportSurface) {
		if (isVisible()) {
			GeoElement geo = getGeoElement();
			if (exportSurface) {
				manager.export(geo, getSurfaceIndex(), geo.getObjectColor(),
						geo.getAlphaValue(), GeometryType.SURFACE);
			} else {
				manager.export(geo, getGeometryIndex(), GColor.BLACK, 1,
						GeometryType.CURVE);
			}
		}
	}

}
