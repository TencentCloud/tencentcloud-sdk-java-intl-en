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

public class DescribeMsgTraceRequest extends AbstractModel {

    /**
    * Environment (namespace).
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Message ID.
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * Message production time.
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

    /**
    * Starting index. Default is 0 if left empty.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returns, default to 10 if not specified, maximum value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Fuzzy matching of consumer group name.
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
    * Pulsar cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get Environment (namespace). 
     * @return EnvironmentId Environment (namespace).
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment (namespace).
     * @param EnvironmentId Environment (namespace).
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

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
     * Get Message production time. 
     * @return ProduceTime Message production time.
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set Message production time.
     * @param ProduceTime Message production time.
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
    }

    /**
     * Get Starting index. Default is 0 if left empty. 
     * @return Offset Starting index. Default is 0 if left empty.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting index. Default is 0 if left empty.
     * @param Offset Starting index. Default is 0 if left empty.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returns, default to 10 if not specified, maximum value: 20. 
     * @return Limit Number of returns, default to 10 if not specified, maximum value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returns, default to 10 if not specified, maximum value: 20.
     * @param Limit Number of returns, default to 10 if not specified, maximum value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Fuzzy matching of consumer group name. 
     * @return SubscriptionName Fuzzy matching of consumer group name.
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set Fuzzy matching of consumer group name.
     * @param SubscriptionName Fuzzy matching of consumer group name.
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    /**
     * Get Pulsar cluster ID 
     * @return ClusterId Pulsar cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Pulsar cluster ID
     * @param ClusterId Pulsar cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public DescribeMsgTraceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMsgTraceRequest(DescribeMsgTraceRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.ProduceTime != null) {
            this.ProduceTime = new String(source.ProduceTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SubscriptionName != null) {
            this.SubscriptionName = new String(source.SubscriptionName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "ProduceTime", this.ProduceTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

