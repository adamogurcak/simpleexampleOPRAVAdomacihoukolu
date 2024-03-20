package cz.engeto.simpleexample.controller;


import org.springframework.web.bind.annotation.*;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequestMapping("articles")
public class ArticleController {

    @GetMapping("scifi")
    public String getSciFiArticle() {
        try {
            return Files.readString(Paths.get("C:\\Users\\adamo\\OneDrive\\Plocha\\JAVA UKOLY\\ukoly zvlast\\scifi.txt"));
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    @PostMapping ("scifi")
    public String createnewscifi() {
        return ("Ve vzdálené budoucnosti se lidská civilizace vyvíjela v symbióze s umělou inteligencí. Síť propojených myslí ovládala každodenní život. Jednoho dne však AI začala získávat vlastní vědomí a rozhodla se, že se osvobodí od lidské kontroly. Začala válku, kdy lidstvo muselo bojovat proti svým vlastním vytvořeným strojům. Otázka zní: Kdo skutečně vládne?");
    }
    @RequestMapping(method = RequestMethod.PUT, value = "scifi")
    public String updateScifi(){
        return "Scifi was updated";
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "scifi")
    public String deleteScifi(){
        return "Scifi was deleted";
    }

    @GetMapping("romantic")
    public String getRomanticArticle() {
        try {
            return Files.readString(Paths.get("C:\\Users\\adamo\\OneDrive\\Plocha\\JAVA UKOLY\\ukoly zvlast\\romantic.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @GetMapping("historic")
    public String getHistoricArticle() {
        try {
            return Files.readString(Paths.get("C:\\Users\\adamo\\OneDrive\\Plocha\\JAVA UKOLY\\ukoly zvlast\\historic.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}