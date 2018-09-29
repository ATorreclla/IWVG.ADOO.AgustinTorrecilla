package es.upm.miw.iwvg.adoo.controllers;

import java.util.regex.Matcher;

import es.upm.miw.iwvg.adoo.models.ColorBallSet;

import es.upm.miw.iwvg.adoo.utils.Constants;

import java.util.regex.Pattern;

public abstract class ColorSetGeneratorController {

    protected IOController ioController;



    public abstract ColorBallSet generateColorBallSet();



    protected String patternShow;



    public ColorSetGeneratorController( IOController ioController, String patternShow) {
        this.ioController = ioController;
        this.patternShow = patternShow;
    }



    protected boolean isCorrectPlayerPlaySet(String template) {
        Pattern pattern = Pattern.compile(String.format(this.patternShow, Constants.NUMBER_BALL_GUESS));
        Matcher matcher = pattern.matcher(template);
        return matcher.matches();
    }







}