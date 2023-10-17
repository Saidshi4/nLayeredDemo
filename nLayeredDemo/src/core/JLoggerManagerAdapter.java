package core;

import jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{
    private final JLoggerManager jLoggerManager;

    public JLoggerManagerAdapter(JLoggerManager jLoggerManager){
        super();
        this.jLoggerManager = jLoggerManager;
    }

    @Override
    public void logToSystem(String message) {
       // JLoggerManager jLoggerManager = new JLoggerManager();
        jLoggerManager.log(message);

    }
}
