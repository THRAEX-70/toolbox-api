package org.thraex.toolbox.text.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 鬼王
 * @date 2020/04/10 16:23
 */
@RestController
@RequestMapping("cc")
public class ChineseCharacterController {

    @GetMapping("s2t")
    public String s2t() {
        return "Simplified to Traditional.";
    }

    @GetMapping("t2s")
    public String t2s() {
        return "Traditional to Simplified.";
    }

}
