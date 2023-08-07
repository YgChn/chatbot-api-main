package cn.bugstack.chatbot.api.domain.zsxq.model.req;

/**
 * @author YgChn
 * @description
 * @github https://github.com/YgChn
 */
public class AnswerReq {

    private ReqData req_data;

    public AnswerReq(ReqData req_data) {
        this.req_data = req_data;
    }

    public ReqData getReq_data() {
        return req_data;
    }

    public void setReq_data(ReqData req_data) {
        this.req_data = req_data;
    }

}
