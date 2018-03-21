package mainmenuproject;
import javax.swing.*;

public class GameEnd
{
    JFrame f;
    TempLevel tl;
    afterGame ag;
    Music ee;
    long here;
    youLost yl;
    GameEnd(JFrame f)
    {
        this.f=f;
        ag = new afterGame(f);
        ag.here=here;
        f.add(ag);
        Action.foundD=false;
        Action.foundP=false;
        Action.foundE=false;
        Action.foundR=false;
        Corner.foundA=false;
        Corner2.foundT=false;
        Corner3.foundP2=false;
    }
    GameEnd(JFrame f, Music ee)
    {
        this.f=f;
        this.ee=ee;
        ag = new afterGame(f, ee);
        ag.here=here;
        f.add(ag);
        Action.foundD=false;
        Action.foundP=false;
        Action.foundE=false;
        Action.foundR=false;
        Corner.foundA=false;
        Corner2.foundT=false;
        Corner3.foundP2=false;
    }
    GameEnd(JFrame f, String a)
    {
        this.f=f;
        yl = new youLost(f);
        f.add(yl);
        Action.foundD=false;
        Action.foundP=false;
        Action.foundE=false;
        Action.foundR=false;
        Corner.foundA=false;
        Corner2.foundT=false;
        Corner3.foundP2=false;
    }
}
