package gradbots.Interfaces;

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
 * This interface contains handlers for all of the default events
 *   published during a battle.
 * 
 * @author KAHX
 *
 */
public interface IEventHandler 
{
	public default void onBattleEnded(BattleEndedEvent e) {}
	
	public default void onBulletHit(BulletHitEvent e) {}
	
	public default void onBulletHitBullet(BulletHitBulletEvent e) {}
	
	public default void onBulletMissed(BulletMissedEvent e) {}
	
	public default void onDeath(DeathEvent e) {}
	
	public default void onHitByBullet(HitByBulletEvent e) {}
	
	public default void onHitRobot(HitRobotEvent e) {}
	
	public default void onHitWall(HitWallEvent e) {}
	
	public default void onRobotDeath(RobotDeathEvent e) {}
	
	public default void onRoundEnded(RoundEndedEvent e) {}
	
	public default void onScannedRobot(ScannedRobotEvent e) {}
	
	public default void onStatus(StatusEvent e) {}
	
	public default void onWin(WinEvent e) {}
	
	public default void onSkippedTurn(SkippedTurnEvent e) {}
}
