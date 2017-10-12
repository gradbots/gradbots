package gradbots.BehaviourProfiles;

import gradbots.GradBot;
import gradbots.GradBotWrappers.GunWrapper;
import gradbots.GradBotWrappers.MovementWrapper;
import gradbots.GradBotWrappers.RadarWrapper;
import gradbots.GunBehaviours.GunBehaviourBase;
import gradbots.Interfaces.IBehaviourProfile;
import gradbots.Interfaces.IGunBehaviour;
import gradbots.Interfaces.IMovementBehaviour;
import gradbots.Interfaces.IRadarBehaviour;
import gradbots.MovementBehaviours.MovementBehaviourBase;
import gradbots.MovementBehaviours.RandomMovementBehaviour;
import gradbots.RadarBehaviours.RadarBehaviourBase;
import robocode.BattleEndedEvent;
import robocode.BulletHitBulletEvent;
import robocode.BulletHitEvent;
import robocode.BulletMissedEvent;
import robocode.DeathEvent;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.RobotDeathEvent;
import robocode.RoundEndedEvent;
import robocode.ScannedRobotEvent;
import robocode.SkippedTurnEvent;
import robocode.StatusEvent;
import robocode.WinEvent;

/**
 * Default collection of gun, movement and radar behaviours.
 * 
 * @author KAHX
 *
 */
public class BehaviourProfileBase implements IBehaviourProfile
{
	public IGunBehaviour      gunBehaviour;
	public IMovementBehaviour movementBehaviour;
	public IRadarBehaviour    radarBehaviour;
	
	protected GradBot robot;
	
	public BehaviourProfileBase(GradBot r)
	{
		GunWrapper      gunWrapper      = new GunWrapper(r);
		MovementWrapper movementWrapper = new MovementWrapper(r);
		RadarWrapper    radarWrapper    = new RadarWrapper(r);
		
		gunBehaviour      = new GunBehaviourBase(gunWrapper);
		movementBehaviour = new MovementBehaviourBase(movementWrapper);
		radarBehaviour    = new RadarBehaviourBase(radarWrapper);
	}
	
	public void setGunBehaviour(IGunBehaviour newGunBehaviour) 
	{
		gunBehaviour = newGunBehaviour;
	}

	public void setMovementBehaviour(IMovementBehaviour newMovementBehaviour) 
	{
		movementBehaviour = newMovementBehaviour;
	}

	public void setRadarBehaviour(IRadarBehaviour newRadarBehaviour) 
	{
		radarBehaviour = newRadarBehaviour;
	}
	
	public void doDefault()
	{
		gunBehaviour.doDefault();
		movementBehaviour.doDefault();
		radarBehaviour.doDefault();
	}
	
	public void onBattleEnded(BattleEndedEvent e)
	{
		gunBehaviour.onBattleEnded(e);
		movementBehaviour.onBattleEnded(e);
		radarBehaviour.onBattleEnded(e);
	}
	
	public void onBulletHit(BulletHitEvent e)
	{
		gunBehaviour.onBulletHit(e);
		movementBehaviour.onBulletHit(e);
		radarBehaviour.onBulletHit(e);
	}
	
	public void onBulletHitBullet(BulletHitBulletEvent e)
	{
		gunBehaviour.onBulletHitBullet(e);
		movementBehaviour.onBulletHitBullet(e);
		radarBehaviour.onBulletHitBullet(e);
	}
	
	public void onBulletMissed(BulletMissedEvent e)
	{
		gunBehaviour.onBulletMissed(e);
		movementBehaviour.onBulletMissed(e);
		radarBehaviour.onBulletMissed(e);
	}
	
	public void onDeath(DeathEvent e)
	{
		gunBehaviour.onDeath(e);
		movementBehaviour.onDeath(e);
		radarBehaviour.onDeath(e);
	}
	
	public void onHitByBullet(HitByBulletEvent e)
	{
		gunBehaviour.onHitByBullet(e);
		movementBehaviour.onHitByBullet(e);
		radarBehaviour.onHitByBullet(e);
	}
	
	public void onHitRobot(HitRobotEvent e)
	{
		gunBehaviour.onHitRobot(e);
		movementBehaviour.onHitRobot(e);
		radarBehaviour.onHitRobot(e);
	}
	
	public void onHitWall(HitWallEvent e)
	{
		gunBehaviour.onHitWall(e);
		movementBehaviour.onHitWall(e);
		radarBehaviour.onHitWall(e);
	}
	
	public void onRobotDeath(RobotDeathEvent e)
	{
		gunBehaviour.onRobotDeath(e);
		movementBehaviour.onRobotDeath(e);
		radarBehaviour.onRobotDeath(e);
	}
	
	public void onRoundEnded(RoundEndedEvent e)
	{
		gunBehaviour.onRoundEnded(e);
		movementBehaviour.onRoundEnded(e);
		radarBehaviour.onRoundEnded(e);
	}
	
	public void onScannedRobot(ScannedRobotEvent e)
	{
		gunBehaviour.onScannedRobot(e);
		movementBehaviour.onScannedRobot(e);
		radarBehaviour.onScannedRobot(e);
	}
	
	public void onStatus(StatusEvent e)
	{
		gunBehaviour.onStatus(e);
		movementBehaviour.onStatus(e);
		radarBehaviour.onStatus(e);
	}
	
	public void onWin(WinEvent e)
	{
		gunBehaviour.onWin(e);
		movementBehaviour.onWin(e);
		radarBehaviour.onWin(e);
	}
	
	public void onSkippedTurn(SkippedTurnEvent e)
	{
		gunBehaviour.onSkippedTurn(e);
		movementBehaviour.onSkippedTurn(e);
		radarBehaviour.onSkippedTurn(e);
	}
	
}
