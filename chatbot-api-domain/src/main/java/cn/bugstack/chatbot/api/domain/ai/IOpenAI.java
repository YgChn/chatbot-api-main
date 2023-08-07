package cn.bugstack.chatbot.api.domain.ai;

import java.io.IOException;

/**
 * @author YgChn
 * @description
 * @github https://github.com/YgChn
 */
public interface IOpenAI {

    String doChatGPT(String openAiKey, String question) throws IOException;

}
