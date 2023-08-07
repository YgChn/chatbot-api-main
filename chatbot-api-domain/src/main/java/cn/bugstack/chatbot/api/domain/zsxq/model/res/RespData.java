package cn.bugstack.chatbot.api.domain.zsxq.model.res;

import cn.bugstack.chatbot.api.domain.zsxq.model.vo.Topics;

import java.util.List;

/**
 * @author YgChn
 * @description
 * @github https://github.com/YgChn
 */
public class RespData {

    private List<Topics> topics;

    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }

}
