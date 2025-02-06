public enum Direction {
    EAST(90, 1), WEST(270, -1), NORTH(360, 2), SOUTH(180, -2), ; 

    private int angle;
    private int value;
    private Direction(int angle, int value){
        this.angle = angle;
        this.value = value;
    }
    public int getAngle(){
      return this.angle;
    }
    //north.opposite -> south
    public Direction opposite(){
        for(Direction d : values()){
            if (d.value == this.value * -1) {
              return d;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Direction angle1 = Direction.NORTH;
    }
}
