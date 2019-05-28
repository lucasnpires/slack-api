package br.com.lucas.slackapi;

import lombok.Data;

@Data
public class SlackTeam {
    private final String id;
    private final String name;
    private final String domain;
}
