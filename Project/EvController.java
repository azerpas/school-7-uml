import java.util.ArrayList;

@Controller
@RequestMapping(value = "/ev")
public class EvController {

    @GetMapping
    public Ev createEv() {

        Ev ev = new Ev();
        ev.isRunning = false;
        ev.os = "Unix";
        ev.tools = new ArrayList<String>(){  };
        ev.tools.add("Docker");

        return ev;
    }

    @GetMapping(value = "/ev/{evId}")
    public @ResponseBody Student getTestData(@PathVariable Integer evId) {
        // Ev ev = EvRepository.find(evId);
        Ev ev = new Ev();

        return ev;
    }
}