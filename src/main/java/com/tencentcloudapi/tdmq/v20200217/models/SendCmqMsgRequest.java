/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendCmqMsgRequest extends AbstractModel {

    /**
    * Queue name
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Message content
    */
    @SerializedName("MsgContent")
    @Expose
    private String MsgContent;

    /**
    * Delay time
    */
    @SerializedName("DelaySeconds")
    @Expose
    private Long DelaySeconds;

    /**
     * Get Queue name 
     * @return QueueName Queue name
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set Queue name
     * @param QueueName Queue name
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get Message content 
     * @return MsgContent Message content
     */
    public String getMsgContent() {
        return this.MsgContent;
    }

    /**
     * Set Message content
     * @param MsgContent Message content
     */
    public void setMsgContent(String MsgContent) {
        this.MsgContent = MsgContent;
    }

    /**
     * Get Delay time 
     * @return DelaySeconds Delay time
     */
    public Long getDelaySeconds() {
        return this.DelaySeconds;
    }

    /**
     * Set Delay time
     * @param DelaySeconds Delay time
     */
    public void setDelaySeconds(Long DelaySeconds) {
        this.DelaySeconds = DelaySeconds;
    }

    public SendCmqMsgRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendCmqMsgRequest(SendCmqMsgRequest source) {
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.MsgContent != null) {
            this.MsgContent = new String(source.MsgContent);
        }
        if (source.DelaySeconds != null) {
            this.DelaySeconds = new Long(source.DelaySeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "MsgContent", this.MsgContent);
        this.setParamSimple(map, prefix + "DelaySeconds", this.DelaySeconds);

    }
}

