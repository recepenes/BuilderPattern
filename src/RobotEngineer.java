public class RobotEngineer {

    private IRobotBuilder robotBuilder;

    // OldRobotBuilder specification is sent to the engineer

    public RobotEngineer(IRobotBuilder robotBuilder){

        this.robotBuilder = robotBuilder;

    }

    // Return the Robot made from the OldRobotBuilder spec

    public Robot getRobot(){

        return this.robotBuilder.getRobot();

    }

    // Execute the methods specific to the RobotBuilder
    // that implements RobotBuilder (OldRobotBuilder)

    public void makeRobot() {

        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();

    }
}
