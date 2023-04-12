package com.example.homework2;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class HwController {

    private Map<Integer, String> phrases = new HashMap<>();

    {
        phrases.put(1, "Жизнь - это то, что происходит с нами, когда мы заняты планированием других вещей");
        phrases.put(2, "Будьте изменением, которое вы хотели бы видеть в мире");
        phrases.put(3, "Человек не является ничем большим, чем тем, что он делает из себя");
        phrases.put(4, "Успех - это способность проходить от неудачи к неудаче, не теряя энтузиазма");
        phrases.put(5, "Счастье не заключается в наличии всего, а в том, чтобы находить радость в каждом моменте");
        phrases.put(6, "Самая большая слабость в жизни - это отступление. Единственный способ справиться с жизнью - это бороться, никогда не отступая");
        phrases.put(7, "Если вы хотите жить жизнью, наполненной радостью, освободитесь от гнева, обид и ревности");
        phrases.put(8, "Не стоит сравнивать свою жизнь с жизнью других. Мы все находимся на разных этапах своего пути");
        phrases.put(9, "Возможности появляются тогда, когда мы смело движемся вперед, несмотря на страх и неопределенность");
    }

    @GetMapping("/phrases/{id}")
    public String getPhrase(@PathVariable int id) {
        return phrases.get(id);
    }
    @GetMapping("/phrases/")
    public Map<Integer, String> AllPhrases(){
        return phrases;
    }



}


