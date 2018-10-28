package com.varun.alexa.hanumanchalisa.handler;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;

public class HanumanChalisaStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HanumanChalisaIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new FallbackIntentHandler())
                .withSkillId("amzn1.ask.skill.b9521883-f5c6-480e-8d26-eb044c4edfab")
                .build();
    }

    public HanumanChalisaStreamHandler() {
        super(getSkill());
    }

}
