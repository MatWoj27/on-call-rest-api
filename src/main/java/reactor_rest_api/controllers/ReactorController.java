package reactor_rest_api.controllers;

import reactor_rest_api.models.Reactor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController("/api/reactors")
public class ReactorController {

    @GetMapping()
    Reactor getReactorByTeam(@RequestParam(defaultValue = "") String team) {
        String csvPath = "reactor";
        if (!team.isEmpty()) {
            csvPath += "_" + team.toLowerCase();
        }
        csvPath += ".txt";
        return Reactor.fromCSV(new File(csvPath));
    }
}
