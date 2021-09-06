package mutlithreading.exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();

        List<Action> friendAction = new ArrayList<>();
        friendAction.add(Action.NOJNICI);
        friendAction.add(Action.BUMAGA);
        friendAction.add(Action.NOJNICI);

        List<Action> myAction = new ArrayList<>();
        myAction.add(Action.BUMAGA);
        myAction.add(Action.KAMEN);
        myAction.add(Action.KAMEN);

        new BestFriend("Vanya",friendAction,exchanger);
        new BestFriend("Igor",myAction,exchanger);
    }
}

enum Action{
    KAMEN,NOJNICI,BUMAGA;
}
class BestFriend extends Thread{
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction){
        if((myAction == Action.KAMEN && friendsAction == Action.NOJNICI)
                ||  (myAction == Action.NOJNICI && friendsAction == Action.BUMAGA)
                || (myAction == Action.BUMAGA && friendsAction==Action.KAMEN))
        {
            System.out.println(name + " WINS!!!");
        }
    }
    public void run(){
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action,reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

