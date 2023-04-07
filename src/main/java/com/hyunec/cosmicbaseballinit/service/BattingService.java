package com.hyunec.cosmicbaseballinit.service;

import com.hyunec.cosmicbaseballinit.model.BattingResult;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class BattingService {

    public BattingResult batting() {

        Random random = new Random();

        int value = random.nextInt(3);

        switch (value) {
            case 0:
                return BattingResult.STRIKE;
            case 1:
                return BattingResult.BALL;
            default:
                return BattingResult.HIT;
        }
    }
}
