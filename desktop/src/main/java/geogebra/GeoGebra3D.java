package geogebra;

// Wrapper for backward compatibility for auto-updating under Windows.

public class GeoGebra3D {
	public static void main(String[] cmdArgs) {	
		org.geogebra.desktop.GeoGebra3D.main(cmdArgs);
	}
}
