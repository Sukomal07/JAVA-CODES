public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer{
    public void moves(){
        System.out.println(" up");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("down");
    }
}
class King implements Chessplayer{
    public void moves(){
        System.out.println("right");
    }
}
class Pwan implements Chessplayer{
    public void moves(){
        System.out.println("left");
    }
}

