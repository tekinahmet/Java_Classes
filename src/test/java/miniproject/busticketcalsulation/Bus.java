package miniproject.busticketcalsulation;
import java.util.ArrayList;
import java.util.List;
public class Bus {
    //bus number, seats,
    public String busNum;
    public List<String> seats = new ArrayList<>();

    public Bus(String busNum) {//constructor
        this.busNum = busNum;
        for (int i = 1; i < 33; i++) {
            seats.add(i + "");//String.valueOf(i)
        }
    }
}
