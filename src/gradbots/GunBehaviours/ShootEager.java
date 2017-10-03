package gradbots.GunBehaviours;

import java.util.ArrayList;

import gradbots.GradBot;
import gradbots.Interfaces.IGunBehaviour;
import javafx.geometry.Point2D;
import robocode.RobotDeathEvent;
import robocode.ScannedRobotEvent;

/**
 * @author dxst and jash
 *
 */
public class ShootEager extends GunBehaviourBase {

	private boolean hasTarget = false;
	private GradBot robot;
	private ArrayList<Point2D> robotPosList = new ArrayList<Point2D>();
	
	public ShootEager(GradBot r) {
		super(r);
	}
	
	@Override
	public void doDefault() {
	}

	@Override
	public void onRobotDeath(RobotDeathEvent e) {
	}

	@Override
	public void onScannedRobot(ScannedRobotEvent e) {
	}
	
}
