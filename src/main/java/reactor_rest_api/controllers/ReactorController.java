package reactor_rest_api.controllers;

import reactor_rest_api.models.Reactor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/reactors")
public class ReactorController {

    @GetMapping()
    Reactor getReactorByTeam(@RequestParam(value = "team") String team) {
        if(team.equals("L2")){
            return new Reactor("Jan Kowalski", "jan.kowalski@mail.com", "123456789");
        } else {
            return new Reactor("Adam Nowak", "adam.nowak@mail.com", "987654321");
        }
    }
}
