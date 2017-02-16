package org.geogebra.desktop.main;

import org.geogebra.common.awt.GRectangle2D;
import org.geogebra.common.euclidian.EuclidianController;
import org.geogebra.common.euclidian.EuclidianView;
import org.geogebra.common.kernel.Kernel;
import org.geogebra.common.main.App;

public class EuclidianControllerNoGui extends EuclidianController {

	public EuclidianControllerNoGui(App app, Kernel kernel1) {
		super(app);
		kernel = kernel1;
	}

	@Override
	protected void initToolTipManager() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void resetToolTipManager() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setView(EuclidianView view) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void setDynamicStylebarVisible(boolean visible,
			GRectangle2D gRectangle2D) {
		// TODO Auto-generated method stub

	}

}
