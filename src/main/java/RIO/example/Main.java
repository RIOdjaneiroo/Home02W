package RIO.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("Hello and welcome! в РіоДеЖанейро");
        Human human = new Human("Ivor", "Rudenko");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(human);
        System.out.println(json);
    }
}