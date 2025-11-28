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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageItem extends AbstractModel {

    /**
    * Message ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * Message tag

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * Message key.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Keys")
    @Expose
    private String Keys;

    /**
    * Client address.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProducerAddr")
    @Expose
    private String ProducerAddr;

    /**
    * Message Sending Time	
	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

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
    @SerializedName("DeadLetterResendSuccessTimes")
    @Expose
    private Long DeadLetterResendSuccessTimes;

    /**
     * Get Message ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MsgId Message ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set Message ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MsgId Message ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get Message tag

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Message tag

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set Message tag

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Message tag

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Message key.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Keys Message key.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKeys() {
        return this.Keys;
    }

    /**
     * Set Message key.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Keys Message key.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeys(String Keys) {
        this.Keys = Keys;
    }

    /**
     * Get Client address.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProducerAddr Client address.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProducerAddr() {
        return this.ProducerAddr;
    }

    /**
     * Set Client address.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProducerAddr Client address.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProducerAddr(String ProducerAddr) {
        this.ProducerAddr = ProducerAddr;
    }

    /**
     * Get Message Sending Time	
	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProduceTime Message Sending Time	
	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set Message Sending Time	
	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProduceTime Message Sending Time	
	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
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
     * @return DeadLetterResendSuccessTimes Dead Letter Resend Success Count

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDeadLetterResendSuccessTimes() {
        return this.DeadLetterResendSuccessTimes;
    }

    /**
     * Set Dead Letter Resend Success Count

Note: This field may return null, indicating that no valid values can be obtained.
     * @param DeadLetterResendSuccessTimes Dead Letter Resend Success Count

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDeadLetterResendSuccessTimes(Long DeadLetterResendSuccessTimes) {
        this.DeadLetterResendSuccessTimes = DeadLetterResendSuccessTimes;
    }

    public MessageItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageItem(MessageItem source) {
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.Keys != null) {
            this.Keys = new String(source.Keys);
        }
        if (source.ProducerAddr != null) {
            this.ProducerAddr = new String(source.ProducerAddr);
        }
        if (source.ProduceTime != null) {
            this.ProduceTime = new String(source.ProduceTime);
        }
        if (source.DeadLetterResendTimes != null) {
            this.DeadLetterResendTimes = new Long(source.DeadLetterResendTimes);
        }
        if (source.DeadLetterResendSuccessTimes != null) {
            this.DeadLetterResendSuccessTimes = new Long(source.DeadLetterResendSuccessTimes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamSimple(map, prefix + "Keys", this.Keys);
        this.setParamSimple(map, prefix + "ProducerAddr", this.ProducerAddr);
        this.setParamSimple(map, prefix + "ProduceTime", this.ProduceTime);
        this.setParamSimple(map, prefix + "DeadLetterResendTimes", this.DeadLetterResendTimes);
        this.setParamSimple(map, prefix + "DeadLetterResendSuccessTimes", this.DeadLetterResendSuccessTimes);

    }
}

