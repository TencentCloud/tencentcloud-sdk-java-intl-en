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

public class RocketMQMsgLog extends AbstractModel {

    /**
    * Message ID
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * Message tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgTag")
    @Expose
    private String MsgTag;

    /**
    * Message key.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgKey")
    @Expose
    private String MsgKey;

    /**
    * Specifies the client ip address.
    */
    @SerializedName("ProducerAddr")
    @Expose
    private String ProducerAddr;

    /**
    * Message Sending Time
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

    /**
    * Pulsar Message ID
    */
    @SerializedName("PulsarMsgId")
    @Expose
    private String PulsarMsgId;

    /**
    * Dead-letter resend count
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeadLetterResendTimes")
    @Expose
    private Long DeadLetterResendTimes;

    /**
    * Dead Letter Resend Success Count
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResendSuccessCount")
    @Expose
    private Long ResendSuccessCount;

    /**
     * Get Message ID 
     * @return MsgId Message ID
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set Message ID
     * @param MsgId Message ID
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get Message tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MsgTag Message tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgTag() {
        return this.MsgTag;
    }

    /**
     * Set Message tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MsgTag Message tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgTag(String MsgTag) {
        this.MsgTag = MsgTag;
    }

    /**
     * Get Message key.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MsgKey Message key.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgKey() {
        return this.MsgKey;
    }

    /**
     * Set Message key.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MsgKey Message key.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgKey(String MsgKey) {
        this.MsgKey = MsgKey;
    }

    /**
     * Get Specifies the client ip address. 
     * @return ProducerAddr Specifies the client ip address.
     */
    public String getProducerAddr() {
        return this.ProducerAddr;
    }

    /**
     * Set Specifies the client ip address.
     * @param ProducerAddr Specifies the client ip address.
     */
    public void setProducerAddr(String ProducerAddr) {
        this.ProducerAddr = ProducerAddr;
    }

    /**
     * Get Message Sending Time 
     * @return ProduceTime Message Sending Time
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set Message Sending Time
     * @param ProduceTime Message Sending Time
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
    }

    /**
     * Get Pulsar Message ID 
     * @return PulsarMsgId Pulsar Message ID
     */
    public String getPulsarMsgId() {
        return this.PulsarMsgId;
    }

    /**
     * Set Pulsar Message ID
     * @param PulsarMsgId Pulsar Message ID
     */
    public void setPulsarMsgId(String PulsarMsgId) {
        this.PulsarMsgId = PulsarMsgId;
    }

    /**
     * Get Dead-letter resend count
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DeadLetterResendTimes Dead-letter resend count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDeadLetterResendTimes() {
        return this.DeadLetterResendTimes;
    }

    /**
     * Set Dead-letter resend count
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DeadLetterResendTimes Dead-letter resend count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDeadLetterResendTimes(Long DeadLetterResendTimes) {
        this.DeadLetterResendTimes = DeadLetterResendTimes;
    }

    /**
     * Get Dead Letter Resend Success Count
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResendSuccessCount Dead Letter Resend Success Count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getResendSuccessCount() {
        return this.ResendSuccessCount;
    }

    /**
     * Set Dead Letter Resend Success Count
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResendSuccessCount Dead Letter Resend Success Count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResendSuccessCount(Long ResendSuccessCount) {
        this.ResendSuccessCount = ResendSuccessCount;
    }

    public RocketMQMsgLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQMsgLog(RocketMQMsgLog source) {
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.MsgTag != null) {
            this.MsgTag = new String(source.MsgTag);
        }
        if (source.MsgKey != null) {
            this.MsgKey = new String(source.MsgKey);
        }
        if (source.ProducerAddr != null) {
            this.ProducerAddr = new String(source.ProducerAddr);
        }
        if (source.ProduceTime != null) {
            this.ProduceTime = new String(source.ProduceTime);
        }
        if (source.PulsarMsgId != null) {
            this.PulsarMsgId = new String(source.PulsarMsgId);
        }
        if (source.DeadLetterResendTimes != null) {
            this.DeadLetterResendTimes = new Long(source.DeadLetterResendTimes);
        }
        if (source.ResendSuccessCount != null) {
            this.ResendSuccessCount = new Long(source.ResendSuccessCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "MsgTag", this.MsgTag);
        this.setParamSimple(map, prefix + "MsgKey", this.MsgKey);
        this.setParamSimple(map, prefix + "ProducerAddr", this.ProducerAddr);
        this.setParamSimple(map, prefix + "ProduceTime", this.ProduceTime);
        this.setParamSimple(map, prefix + "PulsarMsgId", this.PulsarMsgId);
        this.setParamSimple(map, prefix + "DeadLetterResendTimes", this.DeadLetterResendTimes);
        this.setParamSimple(map, prefix + "ResendSuccessCount", this.ResendSuccessCount);

    }
}

