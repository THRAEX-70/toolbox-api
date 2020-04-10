package org.thraex.toolbox.image.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 鬼王
 * @date 2020/04/10 16:07
 */
@RestController
@RequestMapping("image")
public class ImageController {

    @PostMapping("compression")
    public String compression() {
        return "Image Compression";
    }

}
