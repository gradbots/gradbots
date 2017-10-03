package gradbots;

import robocode.Robot;

public class DefensiveMode {
	
	private Robot _myRobot;
	private Robot _trackedRobot;
	
	public DefensiveMode(Robot robot)
	{
		_myRobot = robot;
	}
	
	public void SetMyRobot(Robot robot)
	{
		_myRobot = robot;
	}
	
	public Robot GetMyRobot(Robot robot)
	{
		return _myRobot;
	}
	
	public void SetTrackedRobot(Robot robot)
	{
		_trackedRobot = robot;
	}
	
	public Robot GetTrackedRobot()
	{
		return _trackedRobot;
	}
}
