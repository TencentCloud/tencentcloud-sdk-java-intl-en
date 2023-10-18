/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cmq.v20190304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Subscription extends AbstractModel {

    /**
    * SubscriptionName
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
    * SubscriptionId
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubscriptionId")
    @Expose
    private String SubscriptionId;

    /**
    * TopicOwner
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicOwner")
    @Expose
    private Long TopicOwner;

    /**
    * MsgCount
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgCount")
    @Expose
    private Long MsgCount;

    /**
    * LastModifyTime
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastModifyTime")
    @Expose
    private Long LastModifyTime;

    /**
    * CreateTime
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * BindingKey
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindingKey")
    @Expose
    private String [] BindingKey;

    /**
    * Endpoint
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * FilterTags
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FilterTags")
    @Expose
    private String [] FilterTags;

    /**
    * Protocol
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * NotifyStrategy
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NotifyStrategy")
    @Expose
    private String NotifyStrategy;

    /**
    * NotifyContentFormat
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NotifyContentFormat")
    @Expose
    private String NotifyContentFormat;

    /**
     * Get SubscriptionName
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubscriptionName SubscriptionName
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set SubscriptionName
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubscriptionName SubscriptionName
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    /**
     * Get SubscriptionId
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubscriptionId SubscriptionId
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSubscriptionId() {
        return this.SubscriptionId;
    }

    /**
     * Set SubscriptionId
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubscriptionId SubscriptionId
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSubscriptionId(String SubscriptionId) {
        this.SubscriptionId = SubscriptionId;
    }

    /**
     * Get TopicOwner
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TopicOwner TopicOwner
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTopicOwner() {
        return this.TopicOwner;
    }

    /**
     * Set TopicOwner
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TopicOwner TopicOwner
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicOwner(Long TopicOwner) {
        this.TopicOwner = TopicOwner;
    }

    /**
     * Get MsgCount
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MsgCount MsgCount
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMsgCount() {
        return this.MsgCount;
    }

    /**
     * Set MsgCount
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MsgCount MsgCount
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgCount(Long MsgCount) {
        this.MsgCount = MsgCount;
    }

    /**
     * Get LastModifyTime
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastModifyTime LastModifyTime
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set LastModifyTime
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastModifyTime LastModifyTime
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastModifyTime(Long LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    /**
     * Get CreateTime
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime CreateTime
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set CreateTime
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateTime CreateTime
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get BindingKey
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BindingKey BindingKey
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBindingKey() {
        return this.BindingKey;
    }

    /**
     * Set BindingKey
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BindingKey BindingKey
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBindingKey(String [] BindingKey) {
        this.BindingKey = BindingKey;
    }

    /**
     * Get Endpoint
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Endpoint Endpoint
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set Endpoint
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Endpoint Endpoint
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get FilterTags
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FilterTags FilterTags
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getFilterTags() {
        return this.FilterTags;
    }

    /**
     * Set FilterTags
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FilterTags FilterTags
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFilterTags(String [] FilterTags) {
        this.FilterTags = FilterTags;
    }

    /**
     * Get Protocol
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Protocol
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Protocol Protocol
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get NotifyStrategy
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NotifyStrategy NotifyStrategy
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNotifyStrategy() {
        return this.NotifyStrategy;
    }

    /**
     * Set NotifyStrategy
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NotifyStrategy NotifyStrategy
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNotifyStrategy(String NotifyStrategy) {
        this.NotifyStrategy = NotifyStrategy;
    }

    /**
     * Get NotifyContentFormat
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NotifyContentFormat NotifyContentFormat
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNotifyContentFormat() {
        return this.NotifyContentFormat;
    }

    /**
     * Set NotifyContentFormat
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NotifyContentFormat NotifyContentFormat
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNotifyContentFormat(String NotifyContentFormat) {
        this.NotifyContentFormat = NotifyContentFormat;
    }

    public Subscription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Subscription(Subscription source) {
        if (source.SubscriptionName != null) {
            this.SubscriptionName = new String(source.SubscriptionName);
        }
        if (source.SubscriptionId != null) {
            this.SubscriptionId = new String(source.SubscriptionId);
        }
        if (source.TopicOwner != null) {
            this.TopicOwner = new Long(source.TopicOwner);
        }
        if (source.MsgCount != null) {
            this.MsgCount = new Long(source.MsgCount);
        }
        if (source.LastModifyTime != null) {
            this.LastModifyTime = new Long(source.LastModifyTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.BindingKey != null) {
            this.BindingKey = new String[source.BindingKey.length];
            for (int i = 0; i < source.BindingKey.length; i++) {
                this.BindingKey[i] = new String(source.BindingKey[i]);
            }
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.FilterTags != null) {
            this.FilterTags = new String[source.FilterTags.length];
            for (int i = 0; i < source.FilterTags.length; i++) {
                this.FilterTags[i] = new String(source.FilterTags[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.NotifyStrategy != null) {
            this.NotifyStrategy = new String(source.NotifyStrategy);
        }
        if (source.NotifyContentFormat != null) {
            this.NotifyContentFormat = new String(source.NotifyContentFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);
        this.setParamSimple(map, prefix + "SubscriptionId", this.SubscriptionId);
        this.setParamSimple(map, prefix + "TopicOwner", this.TopicOwner);
        this.setParamSimple(map, prefix + "MsgCount", this.MsgCount);
        this.setParamSimple(map, prefix + "LastModifyTime", this.LastModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "BindingKey.", this.BindingKey);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamArraySimple(map, prefix + "FilterTags.", this.FilterTags);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "NotifyStrategy", this.NotifyStrategy);
        this.setParamSimple(map, prefix + "NotifyContentFormat", this.NotifyContentFormat);

    }
}

