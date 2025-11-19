public class Arithmetic {

    public int first;
    public int second;
    private String finaly;

    public Arithmetic (int first, int second){
        this.first = first;
        this.second = second;
    }

    public int sum (){
    return (first + second);
    }

    public int mus () {
    return (first * second);
    }

    public int big () {
        if(first >= second){
            return first;
        } return second;
    }

    public int min () {
        if(first <= second){
            return first;
        } return second;
    }


    public void print(){
        System.out.println(finaly);
    }
}
