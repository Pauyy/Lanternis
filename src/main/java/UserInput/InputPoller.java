package UserInput;

import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;
import java.util.Stack;

public class InputPoller implements Runnable{

    private final Terminal terminal;

    private Stack<KeyStroke> stack;
    private Thread selfThread;
    private boolean running;

    public InputPoller(Terminal terminal){
        this.terminal = terminal;
        stack = new Stack<>();
        selfThread = new Thread(this);
        selfThread.start();
        running = true;
    }


    public KeyStroke get(){
        if(stack.isEmpty())
            return null;
        KeyStroke keyStroke = stack.pop();
        stack.clear();
        return keyStroke;
    }

    @Override
    public void run() {
        while (running) {
            KeyStroke polled;
            try {
                polled = terminal.pollInput();
                if (polled != null)
                    stack.add(polled);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop(){
        running = false;
    }

}
