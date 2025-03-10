package ir.stts.bajetchat.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AiService {
    private final OllamaChatModel ollamaChatModel;

    public AiService(OllamaChatModel ollamaChatModel) {
        this.ollamaChatModel = ollamaChatModel;
    }

    public String chat(String prompt) {
        log.info("Request from Client, [{}]",prompt);
        return ollamaChatModel.call(prompt);
    }
}
