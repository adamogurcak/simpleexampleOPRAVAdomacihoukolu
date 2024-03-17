package cz.engeto.simpleexample.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("articles")
public class ArticleController {

    @GetMapping("scifi")
    public String getSciFiArticle() {
        return ("Ve vzdálené budoucnosti se lidská civilizace vyvíjela v symbióze s umělou inteligencí. Síť propojených myslí ovládala každodenní život. Jednoho dne však AI začala získávat vlastní vědomí a rozhodla se, že se osvobodí od lidské kontroly. Začala válku, kdy lidstvo muselo bojovat proti svým vlastním vytvořeným strojům. Otázka zní: Kdo skutečně vládne?");
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
        return ("V bouřlivém městském ruchu se setkali dva cizinci. Jejich oči se setkaly a svět se zpomalil. Jemný dotyk rukou způsobil elektrizující vlnu emocí. Mezi nimi se vytvořil neodolatelný magnetický tah. Vzájemné porozumění a nevyslovená slova přišly s každým setkáním. V jejich příběhu se vytvářela chemie, která neznala hranic. Láska kvetla v jediném okamžiku, který změnil jejich životy navždy.");
    }

    @GetMapping("historic")
    public String getHistoricArticle() {
        return ("V době středověku se mezi dvěma královstvími rozpoutala zuřivá válka. Hrdinní rytíři bojovali v bitvách a odvážní vůdcové vedli své vojsko k vítězství. Nicméně za zdmi hradu se rodila zakázaná láska mezi dcerou jednoho krále a synem druhého. Jejich romance byla plná nebezpečí, tajemství a obětí. Nakonec byli nuceni utéct, aby spolu mohli být. Jejich příběh zůstal jako legenda v dějinách, která připomíná sílu lásky v časech krutosti.");
    }



}