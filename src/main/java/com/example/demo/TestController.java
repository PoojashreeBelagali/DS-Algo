package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequiredArgsConstructor
public class TestController {


    @GetMapping("/test")
    public ResponseEntity<?> test(@RequestParam String format){
        Map<String , String> map = new HashMap<>();
        map.put("status","Ok");


        if(null==format || format.isEmpty()){
            return new ResponseEntity<>(BAD_REQUEST);
        }
        if(format.equals("short")){
            return new ResponseEntity<>(map, OK);
        }
       else if(format.equals("full")){
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:sss'Z'");
           map.put("currentTime", dateFormat.format(new Date()));
            return new ResponseEntity<>(map, OK);
        } else
        {
            return new ResponseEntity<>(BAD_REQUEST);
        }


    }

    @PutMapping("/test-put")
    public void testPut(@RequestParam String format){
       // Future
    }
}


