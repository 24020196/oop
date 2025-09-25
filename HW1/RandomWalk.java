public class RandomWalk {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();

        int x = 0, y = 0;
        int steps = 0,temp=0;
        while (Math.abs(x) <= n && Math.abs(y) <= n) {
            StdDraw.setPenColor(StdDraw.WHITE);
            while((x>-temp)&&(Math.abs(x) <= n && Math.abs(y) <= n)){
                StdDraw.filledSquare(x, y, 0.45);
                x--;
                StdDraw.show();
                StdDraw.pause(20);
                steps++;
            }
            while((y<temp)&&(Math.abs(x) <= n && Math.abs(y) <= n)){
                StdDraw.filledSquare(x, y, 0.45);
                y++;
                StdDraw.show();
                StdDraw.pause(20);
                steps++;
            }
            while((x<temp)&&(Math.abs(x) <= n && Math.abs(y) <= n)){
                StdDraw.filledSquare(x, y, 0.45);
                x++;
                StdDraw.show();
                StdDraw.pause(20);
                steps++;
            }
            while((y>-temp)&&(Math.abs(x) <= n && Math.abs(y) <= n)){
                StdDraw.filledSquare(x, y, 0.45);
                y--;
                StdDraw.show();
                StdDraw.pause(20);
                steps++;
            }
            temp++;
        }
        StdOut.println("Total steps = " + steps);
    }
}
