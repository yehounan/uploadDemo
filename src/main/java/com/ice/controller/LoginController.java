package com.ice.controller;

import com.ice.util.QRBarCodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
public class LoginController {

    @RequestMapping(value = "/showHome", method = RequestMethod.GET)
    public ModelAndView showHome(ModelAndView model) {
        model.setViewName("index");
        return model;
    }

    @RequestMapping(value = "/showQr", method = RequestMethod.GET)
    public void qr(HttpServletRequest request, HttpServletResponse response) {
        BufferedImage bufferedImage = QRBarCodeUtil.createCodeToFile("http://www.baidu.com", null, null, response);
        try {
//            ImageIO.write(bufferedImage, "png", response.getOutputStream());
            Graphics2D graphics = (Graphics2D) bufferedImage.getGraphics();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
