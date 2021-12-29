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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Subscription extends AbstractModel{

    /**
    * Topic name.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Environment (namespace) name.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * The time when the consumer started connecting.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConnectedSince")
    @Expose
    private String ConnectedSince;

    /**
    * Consumer address.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumerAddr")
    @Expose
    private String ConsumerAddr;

    /**
    * Number of consumers.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumerCount")
    @Expose
    private String ConsumerCount;

    /**
    * Consumer name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumerName")
    @Expose
    private String ConsumerName;

    /**
    * Number of retained messages.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgBacklog")
    @Expose
    private String MsgBacklog;

    /**
    * Proportion of messages under this subscription that were discarded but not sent after TTL.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgRateExpired")
    @Expose
    private String MsgRateExpired;

    /**
    * Sum of the numbers of messages delivered by the consumer per second.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgRateOut")
    @Expose
    private String MsgRateOut;

    /**
    * Number of bytes of messages consumed by the consumer per second.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgThroughputOut")
    @Expose
    private String MsgThroughputOut;

    /**
    * Subscription name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
    * Set of consumers.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumerSets")
    @Expose
    private Consumer [] ConsumerSets;

    /**
    * Whether it is online.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsOnline")
    @Expose
    private Boolean IsOnline;

    /**
    * Set of consumption progress information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumersScheduleSets")
    @Expose
    private ConsumersSchedule [] ConsumersScheduleSets;

    /**
    * Remarks.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Creation time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Topic name. 
     * @return TopicName Topic name.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name.
     * @param TopicName Topic name.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Environment (namespace) name. 
     * @return EnvironmentId Environment (namespace) name.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment (namespace) name.
     * @param EnvironmentId Environment (namespace) name.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get The time when the consumer started connecting.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ConnectedSince The time when the consumer started connecting.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getConnectedSince() {
        return this.ConnectedSince;
    }

    /**
     * Set The time when the consumer started connecting.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ConnectedSince The time when the consumer started connecting.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConnectedSince(String ConnectedSince) {
        this.ConnectedSince = ConnectedSince;
    }

    /**
     * Get Consumer address.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ConsumerAddr Consumer address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getConsumerAddr() {
        return this.ConsumerAddr;
    }

    /**
     * Set Consumer address.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ConsumerAddr Consumer address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumerAddr(String ConsumerAddr) {
        this.ConsumerAddr = ConsumerAddr;
    }

    /**
     * Get Number of consumers.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ConsumerCount Number of consumers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getConsumerCount() {
        return this.ConsumerCount;
    }

    /**
     * Set Number of consumers.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ConsumerCount Number of consumers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumerCount(String ConsumerCount) {
        this.ConsumerCount = ConsumerCount;
    }

    /**
     * Get Consumer name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ConsumerName Consumer name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getConsumerName() {
        return this.ConsumerName;
    }

    /**
     * Set Consumer name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ConsumerName Consumer name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumerName(String ConsumerName) {
        this.ConsumerName = ConsumerName;
    }

    /**
     * Get Number of retained messages.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MsgBacklog Number of retained messages.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgBacklog() {
        return this.MsgBacklog;
    }

    /**
     * Set Number of retained messages.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MsgBacklog Number of retained messages.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgBacklog(String MsgBacklog) {
        this.MsgBacklog = MsgBacklog;
    }

    /**
     * Get Proportion of messages under this subscription that were discarded but not sent after TTL.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MsgRateExpired Proportion of messages under this subscription that were discarded but not sent after TTL.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgRateExpired() {
        return this.MsgRateExpired;
    }

    /**
     * Set Proportion of messages under this subscription that were discarded but not sent after TTL.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MsgRateExpired Proportion of messages under this subscription that were discarded but not sent after TTL.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgRateExpired(String MsgRateExpired) {
        this.MsgRateExpired = MsgRateExpired;
    }

    /**
     * Get Sum of the numbers of messages delivered by the consumer per second.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MsgRateOut Sum of the numbers of messages delivered by the consumer per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgRateOut() {
        return this.MsgRateOut;
    }

    /**
     * Set Sum of the numbers of messages delivered by the consumer per second.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MsgRateOut Sum of the numbers of messages delivered by the consumer per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgRateOut(String MsgRateOut) {
        this.MsgRateOut = MsgRateOut;
    }

    /**
     * Get Number of bytes of messages consumed by the consumer per second.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MsgThroughputOut Number of bytes of messages consumed by the consumer per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgThroughputOut() {
        return this.MsgThroughputOut;
    }

    /**
     * Set Number of bytes of messages consumed by the consumer per second.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MsgThroughputOut Number of bytes of messages consumed by the consumer per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgThroughputOut(String MsgThroughputOut) {
        this.MsgThroughputOut = MsgThroughputOut;
    }

    /**
     * Get Subscription name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SubscriptionName Subscription name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set Subscription name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SubscriptionName Subscription name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    /**
     * Get Set of consumers.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ConsumerSets Set of consumers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Consumer [] getConsumerSets() {
        return this.ConsumerSets;
    }

    /**
     * Set Set of consumers.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ConsumerSets Set of consumers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumerSets(Consumer [] ConsumerSets) {
        this.ConsumerSets = ConsumerSets;
    }

    /**
     * Get Whether it is online.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsOnline Whether it is online.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsOnline() {
        return this.IsOnline;
    }

    /**
     * Set Whether it is online.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsOnline Whether it is online.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsOnline(Boolean IsOnline) {
        this.IsOnline = IsOnline;
    }

    /**
     * Get Set of consumption progress information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ConsumersScheduleSets Set of consumption progress information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ConsumersSchedule [] getConsumersScheduleSets() {
        return this.ConsumersScheduleSets;
    }

    /**
     * Set Set of consumption progress information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ConsumersScheduleSets Set of consumption progress information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumersScheduleSets(ConsumersSchedule [] ConsumersScheduleSets) {
        this.ConsumersScheduleSets = ConsumersScheduleSets;
    }

    /**
     * Get Remarks.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Creation time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Modification time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Modification time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Modification time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Subscription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Subscription(Subscription source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.ConnectedSince != null) {
            this.ConnectedSince = new String(source.ConnectedSince);
        }
        if (source.ConsumerAddr != null) {
            this.ConsumerAddr = new String(source.ConsumerAddr);
        }
        if (source.ConsumerCount != null) {
            this.ConsumerCount = new String(source.ConsumerCount);
        }
        if (source.ConsumerName != null) {
            this.ConsumerName = new String(source.ConsumerName);
        }
        if (source.MsgBacklog != null) {
            this.MsgBacklog = new String(source.MsgBacklog);
        }
        if (source.MsgRateExpired != null) {
            this.MsgRateExpired = new String(source.MsgRateExpired);
        }
        if (source.MsgRateOut != null) {
            this.MsgRateOut = new String(source.MsgRateOut);
        }
        if (source.MsgThroughputOut != null) {
            this.MsgThroughputOut = new String(source.MsgThroughputOut);
        }
        if (source.SubscriptionName != null) {
            this.SubscriptionName = new String(source.SubscriptionName);
        }
        if (source.ConsumerSets != null) {
            this.ConsumerSets = new Consumer[source.ConsumerSets.length];
            for (int i = 0; i < source.ConsumerSets.length; i++) {
                this.ConsumerSets[i] = new Consumer(source.ConsumerSets[i]);
            }
        }
        if (source.IsOnline != null) {
            this.IsOnline = new Boolean(source.IsOnline);
        }
        if (source.ConsumersScheduleSets != null) {
            this.ConsumersScheduleSets = new ConsumersSchedule[source.ConsumersScheduleSets.length];
            for (int i = 0; i < source.ConsumersScheduleSets.length; i++) {
                this.ConsumersScheduleSets[i] = new ConsumersSchedule(source.ConsumersScheduleSets[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "ConnectedSince", this.ConnectedSince);
        this.setParamSimple(map, prefix + "ConsumerAddr", this.ConsumerAddr);
        this.setParamSimple(map, prefix + "ConsumerCount", this.ConsumerCount);
        this.setParamSimple(map, prefix + "ConsumerName", this.ConsumerName);
        this.setParamSimple(map, prefix + "MsgBacklog", this.MsgBacklog);
        this.setParamSimple(map, prefix + "MsgRateExpired", this.MsgRateExpired);
        this.setParamSimple(map, prefix + "MsgRateOut", this.MsgRateOut);
        this.setParamSimple(map, prefix + "MsgThroughputOut", this.MsgThroughputOut);
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);
        this.setParamArrayObj(map, prefix + "ConsumerSets.", this.ConsumerSets);
        this.setParamSimple(map, prefix + "IsOnline", this.IsOnline);
        this.setParamArrayObj(map, prefix + "ConsumersScheduleSets.", this.ConsumersScheduleSets);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

