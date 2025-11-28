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

public class RocketMQSubscription extends AbstractModel {

    /**
    * Topic name
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Topic type.
Normal.
GlobalOrder specifies the global sequential order.
Partitionally sequential.
Transactional message.
DelayScheduled specifies the delayed message.
Retry.
DeadLetter. specifies the dead letter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Number of partitions
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * Filter mode, which can be TAG or SQL.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpressionType")
    @Expose
    private String ExpressionType;

    /**
    * Filter expression.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubString")
    @Expose
    private String SubString;

    /**
    * Subscription status:.
Consistent subscription relationship.
Inconsistent subscription relationship.
2. unknown.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Number of heaped consumer groups.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumerLag")
    @Expose
    private Long ConsumerLag;

    /**
    * Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Specifies the consumer group name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * Online status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsOnline")
    @Expose
    private Boolean IsOnline;

    /**
    * Consumption type.
Broadcast consumption.
Specifies the cluster consumption.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumeType")
    @Expose
    private Long ConsumeType;

    /**
    * Subscription consistency.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Consistency")
    @Expose
    private Long Consistency;

    /**
    * Last consumption progress update time, in seconds
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private Long LastUpdateTime;

    /**
    * Maximum number of retries.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxRetryTimes")
    @Expose
    private Long MaxRetryTimes;

    /**
    * Protocol type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientProtocol")
    @Expose
    private String ClientProtocol;

    /**
    * Client subscription details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientSubscriptionInfos")
    @Expose
    private ClientSubscriptionInfo [] ClientSubscriptionInfos;

    /**
     * Get Topic name 
     * @return Topic Topic name
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Topic name
     * @param Topic Topic name
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Topic type.
Normal.
GlobalOrder specifies the global sequential order.
Partitionally sequential.
Transactional message.
DelayScheduled specifies the delayed message.
Retry.
DeadLetter. specifies the dead letter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Topic type.
Normal.
GlobalOrder specifies the global sequential order.
Partitionally sequential.
Transactional message.
DelayScheduled specifies the delayed message.
Retry.
DeadLetter. specifies the dead letter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Topic type.
Normal.
GlobalOrder specifies the global sequential order.
Partitionally sequential.
Transactional message.
DelayScheduled specifies the delayed message.
Retry.
DeadLetter. specifies the dead letter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Topic type.
Normal.
GlobalOrder specifies the global sequential order.
Partitionally sequential.
Transactional message.
DelayScheduled specifies the delayed message.
Retry.
DeadLetter. specifies the dead letter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Number of partitions
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PartitionNum Number of partitions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set Number of partitions
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PartitionNum Number of partitions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get Filter mode, which can be TAG or SQL.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpressionType Filter mode, which can be TAG or SQL.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpressionType() {
        return this.ExpressionType;
    }

    /**
     * Set Filter mode, which can be TAG or SQL.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpressionType Filter mode, which can be TAG or SQL.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpressionType(String ExpressionType) {
        this.ExpressionType = ExpressionType;
    }

    /**
     * Get Filter expression.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubString Filter expression.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubString() {
        return this.SubString;
    }

    /**
     * Set Filter expression.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubString Filter expression.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubString(String SubString) {
        this.SubString = SubString;
    }

    /**
     * Get Subscription status:.
Consistent subscription relationship.
Inconsistent subscription relationship.
2. unknown.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Subscription status:.
Consistent subscription relationship.
Inconsistent subscription relationship.
2. unknown.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Subscription status:.
Consistent subscription relationship.
Inconsistent subscription relationship.
2. unknown.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Subscription status:.
Consistent subscription relationship.
Inconsistent subscription relationship.
2. unknown.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Number of heaped consumer groups.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConsumerLag Number of heaped consumer groups.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getConsumerLag() {
        return this.ConsumerLag;
    }

    /**
     * Set Number of heaped consumer groups.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConsumerLag Number of heaped consumer groups.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumerLag(Long ConsumerLag) {
        this.ConsumerLag = ConsumerLag;
    }

    /**
     * Get Instance ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterId Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterId Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Specifies the consumer group name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConsumerGroup Specifies the consumer group name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set Specifies the consumer group name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConsumerGroup Specifies the consumer group name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get Online status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsOnline Online status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsOnline() {
        return this.IsOnline;
    }

    /**
     * Set Online status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsOnline Online status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsOnline(Boolean IsOnline) {
        this.IsOnline = IsOnline;
    }

    /**
     * Get Consumption type.
Broadcast consumption.
Specifies the cluster consumption.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConsumeType Consumption type.
Broadcast consumption.
Specifies the cluster consumption.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getConsumeType() {
        return this.ConsumeType;
    }

    /**
     * Set Consumption type.
Broadcast consumption.
Specifies the cluster consumption.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConsumeType Consumption type.
Broadcast consumption.
Specifies the cluster consumption.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumeType(Long ConsumeType) {
        this.ConsumeType = ConsumeType;
    }

    /**
     * Get Subscription consistency.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Consistency Subscription consistency.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getConsistency() {
        return this.Consistency;
    }

    /**
     * Set Subscription consistency.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Consistency Subscription consistency.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsistency(Long Consistency) {
        this.Consistency = Consistency;
    }

    /**
     * Get Last consumption progress update time, in seconds
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastUpdateTime Last consumption progress update time, in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set Last consumption progress update time, in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastUpdateTime Last consumption progress update time, in seconds
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastUpdateTime(Long LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get Maximum number of retries.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxRetryTimes Maximum number of retries.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxRetryTimes() {
        return this.MaxRetryTimes;
    }

    /**
     * Set Maximum number of retries.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxRetryTimes Maximum number of retries.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxRetryTimes(Long MaxRetryTimes) {
        this.MaxRetryTimes = MaxRetryTimes;
    }

    /**
     * Get Protocol type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientProtocol Protocol type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClientProtocol() {
        return this.ClientProtocol;
    }

    /**
     * Set Protocol type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientProtocol Protocol type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientProtocol(String ClientProtocol) {
        this.ClientProtocol = ClientProtocol;
    }

    /**
     * Get Client subscription details.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientSubscriptionInfos Client subscription details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ClientSubscriptionInfo [] getClientSubscriptionInfos() {
        return this.ClientSubscriptionInfos;
    }

    /**
     * Set Client subscription details.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientSubscriptionInfos Client subscription details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientSubscriptionInfos(ClientSubscriptionInfo [] ClientSubscriptionInfos) {
        this.ClientSubscriptionInfos = ClientSubscriptionInfos;
    }

    public RocketMQSubscription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQSubscription(RocketMQSubscription source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
        if (source.ExpressionType != null) {
            this.ExpressionType = new String(source.ExpressionType);
        }
        if (source.SubString != null) {
            this.SubString = new String(source.SubString);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ConsumerLag != null) {
            this.ConsumerLag = new Long(source.ConsumerLag);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.IsOnline != null) {
            this.IsOnline = new Boolean(source.IsOnline);
        }
        if (source.ConsumeType != null) {
            this.ConsumeType = new Long(source.ConsumeType);
        }
        if (source.Consistency != null) {
            this.Consistency = new Long(source.Consistency);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new Long(source.LastUpdateTime);
        }
        if (source.MaxRetryTimes != null) {
            this.MaxRetryTimes = new Long(source.MaxRetryTimes);
        }
        if (source.ClientProtocol != null) {
            this.ClientProtocol = new String(source.ClientProtocol);
        }
        if (source.ClientSubscriptionInfos != null) {
            this.ClientSubscriptionInfos = new ClientSubscriptionInfo[source.ClientSubscriptionInfos.length];
            for (int i = 0; i < source.ClientSubscriptionInfos.length; i++) {
                this.ClientSubscriptionInfos[i] = new ClientSubscriptionInfo(source.ClientSubscriptionInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "ExpressionType", this.ExpressionType);
        this.setParamSimple(map, prefix + "SubString", this.SubString);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ConsumerLag", this.ConsumerLag);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "IsOnline", this.IsOnline);
        this.setParamSimple(map, prefix + "ConsumeType", this.ConsumeType);
        this.setParamSimple(map, prefix + "Consistency", this.Consistency);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "MaxRetryTimes", this.MaxRetryTimes);
        this.setParamSimple(map, prefix + "ClientProtocol", this.ClientProtocol);
        this.setParamArrayObj(map, prefix + "ClientSubscriptionInfos.", this.ClientSubscriptionInfos);

    }
}

