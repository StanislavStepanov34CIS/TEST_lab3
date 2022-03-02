package brokenrobotgame.model.events;

import java.util.EventObject;

public class RobotActionEvent extends EventObject {
    public RobotActionEvent(Object source) { 
        super(source); 
    } 

    private int doSmth(){return 4;} 

    public void newAction(){doSmth();}
} 
