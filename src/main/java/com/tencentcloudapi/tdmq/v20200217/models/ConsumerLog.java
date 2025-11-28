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

public class ConsumerLog extends AbstractModel {

    /**
    * Message ID.
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * Consumption group.
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * Consumer name.
    */
    @SerializedName("ConsumerName")
    @Expose
    private String ConsumerName;

    /**
    * Consumption time.
    */
    @SerializedName("ConsumeTime")
    @Expose
    private String ConsumeTime;

    /**
    * Consumer client address.
    */
    @SerializedName("ConsumerAddr")
    @Expose
    private String ConsumerAddr;

    /**
    * Consumption time (milliseconds).
    */
    @SerializedName("ConsumeUseTime")
    @Expose
    private Long ConsumeUseTime;

    /**
    * Consumption status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Message ID. 
     * @return MsgId Message ID.
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set Message ID.
     * @param MsgId Message ID.
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get Consumption group. 
     * @return ConsumerGroup Consumption group.
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set Consumption group.
     * @param ConsumerGroup Consumption group.
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get Consumer name. 
     * @return ConsumerName Consumer name.
     */
    public String getConsumerName() {
        return this.ConsumerName;
    }

    /**
     * Set Consumer name.
     * @param ConsumerName Consumer name.
     */
    public void setConsumerName(String ConsumerName) {
        this.ConsumerName = ConsumerName;
    }

    /**
     * Get Consumption time. 
     * @return ConsumeTime Consumption time.
     */
    public String getConsumeTime() {
        return this.ConsumeTime;
    }

    /**
     * Set Consumption time.
     * @param ConsumeTime Consumption time.
     */
    public void setConsumeTime(String ConsumeTime) {
        this.ConsumeTime = ConsumeTime;
    }

    /**
     * Get Consumer client address. 
     * @return ConsumerAddr Consumer client address.
     */
    public String getConsumerAddr() {
        return this.ConsumerAddr;
    }

    /**
     * Set Consumer client address.
     * @param ConsumerAddr Consumer client address.
     */
    public void setConsumerAddr(String ConsumerAddr) {
        this.ConsumerAddr = ConsumerAddr;
    }

    /**
     * Get Consumption time (milliseconds). 
     * @return ConsumeUseTime Consumption time (milliseconds).
     */
    public Long getConsumeUseTime() {
        return this.ConsumeUseTime;
    }

    /**
     * Set Consumption time (milliseconds).
     * @param ConsumeUseTime Consumption time (milliseconds).
     */
    public void setConsumeUseTime(Long ConsumeUseTime) {
        this.ConsumeUseTime = ConsumeUseTime;
    }

    /**
     * Get Consumption status. 
     * @return Status Consumption status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Consumption status.
     * @param Status Consumption status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ConsumerLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerLog(ConsumerLog source) {
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.ConsumerName != null) {
            this.ConsumerName = new String(source.ConsumerName);
        }
        if (source.ConsumeTime != null) {
            this.ConsumeTime = new String(source.ConsumeTime);
        }
        if (source.ConsumerAddr != null) {
            this.ConsumerAddr = new String(source.ConsumerAddr);
        }
        if (source.ConsumeUseTime != null) {
            this.ConsumeUseTime = new Long(source.ConsumeUseTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "ConsumerName", this.ConsumerName);
        this.setParamSimple(map, prefix + "ConsumeTime", this.ConsumeTime);
        this.setParamSimple(map, prefix + "ConsumerAddr", this.ConsumerAddr);
        this.setParamSimple(map, prefix + "ConsumeUseTime", this.ConsumeUseTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

