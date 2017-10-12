package gradbots.GradBotWrappers;

import java.awt.Graphics2D;

import gradbots.GradBot;
import robocode.AdvancedRobot;

/**
 * This class exposes all of the relevant 'get' methods of GradBot
 * 
 * @author KAHX
 *
 */
public class RobotInfoWrapper 
{
	protected GradBot robot;
	
	public RobotInfoWrapper(GradBot r)
	{
		robot = r;
	}
	
	//================================================================================
    // Gun
    //================================================================================
	
	/**
	 * @see AdvancedRobot#getGunTurnRemaining
	 */
	public double getGunTurnRemaining()
	{
		return robot.getGunTurnRemaining();
	}
	
	/**
	 * @see AdvancedRobot#getGunHeading
	 */
	public double getGunHeading()
	{
		return robot.getGunHeading();
	}
	
	/**
	 * @see AdvancedRobot#getGunCoolingRate
	 */
	public double getGunCoolingRate()
	{
		return robot.getGunCoolingRate();
	}
	
	/**
	 * @see AdvancedRobot#getGunHeat
	 */
	public double getGunHeat()
	{
		return robot.getGunHeat();
	}
	
	//================================================================================
    // Movement
    //================================================================================
	
	/**
	 * @see AdvancedRobot#getDistanceRemaining
	 */
	public double getDistanceRemaining()
	{
		return robot.getDistanceRemaining();
	}
	
	/**
	 * @see AdvancedRobot#getVelocity
	 */
	public double getVelocity()
	{
		return robot.getVelocity();
	}
	
	/**
	 * @see AdvancedRobot#getTurnRemaining
	 */
	public double getTurnRemaining()
	{
		return robot.getTurnRemaining();
	}
	
	/**
	 * @see AdvancedRobot#getHeading
	 */
	public double getHeading()
	{
		return robot.getHeading();
	}
	
	//================================================================================
    // Radar
    //================================================================================
	
	/**
	 * @see AdvancedRobot#getRadarTurnRemaining
	 */
	public double getRadarTurnRemaining()
	{
		return robot.getRadarTurnRemaining();
	}
	
	/**
	 * @see AdvancedRobot#getRadarHeading
	 */
	public double getRadarHeading()
	{
		return robot.getRadarHeading();
	}
	
	//================================================================================
    // Miscellaneous
    //================================================================================
	
	/**
	 * @see AdvancedRobot#getBattleFieldHeight
	 */
	public double getBattleFieldHeight()
	{
		return robot.getBattleFieldHeight();
	}
	
	/**
	 * @see AdvancedRobot#getBattleFieldWidth
	 */
	public double getBattleFieldWidth()
	{
		return robot.getBattleFieldWidth();
	}
	
	/**
	 * @see AdvancedRobot#getEnergy
	 */
	public double getEnergy()
	{
		return robot.getEnergy();
	}
	
	/**
	 * @see AdvancedRobot#getGraphics
	 */
	public Graphics2D getGraphics()
	{
		return robot.getGraphics();
	}
	
	/**
	 * @see AdvancedRobot#getHeight
	 */
	public double getHeight()
	{
		return robot.getHeight();
	}
	
	/**
	 * @see AdvancedRobot#getWidth
	 */
	public double getWidth()
	{
		return robot.getWidth();
	}
	
	/**
	 * @see AdvancedRobot#getName
	 */
	public String getName()
	{
		return robot.getName();
	}
	
	/**
	 * @see AdvancedRobot#getX
	 */
	public double getX()
	{
		return robot.getX();
	}
	
	/**
	 * @see AdvancedRobot#getY
	 */
	public double getY()
	{
		return robot.getY();
	}
	
	/**
	 * @see AdvancedRobot#getNumRounds
	 */
	public double getNumRounds()
	{
		return robot.getNumRounds();
	}
	
	/**
	 * @see AdvancedRobot#getNumSentries
	 */
	public double getNumSentries()
	{
		return robot.getNumSentries();
	}
	
	/**
	 * @see AdvancedRobot#getOthers
	 */
	public double getOthers()
	{
		return robot.getOthers();
	}
	
	/**
	 * @see AdvancedRobot#getRoundNum
	 */
	public double getRoundNum()
	{
		return robot.getRoundNum();
	}
	
	/**
	 * @see AdvancedRobot#getSentryBorderSize
	 */
	public double getSentryBorderSize()
	{
		return robot.getSentryBorderSize();
	}
	
	/**
	 * @see AdvancedRobot#getTime
	 */
	public double getTime()
	{
		return robot.getTime();
	}
	
	
	
}
