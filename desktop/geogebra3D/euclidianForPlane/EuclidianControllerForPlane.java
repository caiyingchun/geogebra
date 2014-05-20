package geogebra3D.euclidianForPlane;

import geogebra.common.euclidian.EuclidianController;
import geogebra.common.euclidian.EuclidianControllerCreator;
import geogebra.common.euclidian.event.AbstractEvent;
import geogebra.common.geogebra3D.kernel3D.geos.GeoPoint3D;
import geogebra.common.kernel.Path;
import geogebra.common.kernel.Region;
import geogebra.common.kernel.Matrix.Coords;
import geogebra.common.kernel.geos.GeoElement;
import geogebra.common.kernel.geos.GeoNumberValue;
import geogebra.common.kernel.kernelND.GeoPointND;
import geogebra.common.main.App;

import java.util.ArrayList;

/**
 * Controler for 2D view created from a plane
 * @author matthieu
 *
 */
public abstract class EuclidianControllerForPlane extends EuclidianController {

	public EuclidianControllerForPlane(App app) {
		super(app);
	}
	
	@Override
	protected EuclidianControllerCreator newCreator(){
		return new EuclidianControllerCreatorForPlane(this);
	}
	
	
	
	private Coords getCoordsFromView(double x, double y){
		return ((EuclidianViewForPlane) view).getCoordsFromView(x,y);
	}
		
	@Override
	protected void movePoint(boolean repaint, AbstractEvent event) {
		
		Coords coords = getCoordsFromView(xRW,yRW);
		
		//Application.debug("xRW, yRW= "+xRW+", "+yRW+"\n3D coords:\n"+coords);
		
		//cancel 3D controller stuff
		if (((GeoElement) movedGeoPoint).isGeoElement3D()){
			((GeoPoint3D) movedGeoPoint).setWillingCoords(null);	
			((GeoPoint3D) movedGeoPoint).setWillingDirection(null);
		}
		
		movedGeoPoint.setCoords(coords, true);
		((GeoElement) movedGeoPoint).updateCascade();
		
		movedGeoPointDragged = true;

		if (repaint)
			kernel.notifyRepaint();
	}	
	
	@Override
	protected GeoPointND createNewPoint(boolean forPreviewable, boolean complex){
	
		Coords coords = getCoordsFromView(xRW,yRW);
		
		GeoPointND ret = kernel.getManager3D().Point3DIn(null, view.getPlaneContaining(), coords, !forPreviewable, false);
		return ret;
	}
	
	@Override
	protected GeoPointND createNewPoint(boolean forPreviewable, Path path, boolean complex){
		Coords coords = getCoordsFromView(xRW,yRW);
		return creator.createNewPoint(null, forPreviewable, path, coords.getX(), coords.getY(), coords.getZ(), complex, false);
	}
	
	@Override
	protected GeoPointND createNewPoint(boolean forPreviewable, Region region, boolean complex){
		Coords coords = getCoordsFromView(xRW,yRW);
		return createNewPoint(null, forPreviewable, region, coords.getX(), coords.getY(), coords.getZ(), complex, false);
	}

	



	
	@Override
	protected void processModeLock(GeoPointND point){
		Coords coords = view.getCoordsForView(point.getInhomCoordsInD(3));
		xRW = coords.getX();
		yRW = coords.getY();
	}
	
	@Override
	protected void processModeLock(Path path){
		GeoPointND p = createNewPoint(true, path, false);
		((GeoElement) p).update();
		Coords coords = view.getCoordsForView(p.getInhomCoordsInD(3));
		xRW = coords.getX();
		yRW = coords.getY();
	}

	@Override
	protected ArrayList<GeoElement> removeParentsOfView(ArrayList<GeoElement> list){
		ArrayList<GeoElement> ret = new ArrayList<GeoElement>();
		for (GeoElement geo : list)
			if (view.isMoveable(geo))
				ret.add(geo);
		return ret;
	}
	
	
	@Override
	public boolean viewOrientationForClockwise(boolean clockwise){
		return ((EuclidianViewForPlane) view).viewOrientationForClockwise(clockwise);
	}
	
	@Override
	public GeoElement[] rotateByAngle(GeoElement geoRot, GeoNumberValue phi, GeoPointND Q) {

		return kernel.getManager3D().Rotate3D(null, geoRot, phi, Q, view.getDirection());

	}
}
