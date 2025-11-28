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

public class SubscriptionData extends AbstractModel {

    /**
    * Instance ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Topic name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Topic type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * Number of topic queues on a single node

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicQueueNum")
    @Expose
    private Long TopicQueueNum;

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
    * Consumption type. valid values as follows:.

-PULL: specifies the pull consumption type.
-PUSH: specifies the push consumption type.
-POP: specifies the pop consumption type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumeType")
    @Expose
    private String ConsumeType;

    /**
    * Subscription rule.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubString")
    @Expose
    private String SubString;

    /**
    * Filter type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpressionType")
    @Expose
    private String ExpressionType;

    /**
    * Subscription consistency. enumerated as follows:.

-Subscription consistency.
-Subscription inconsistency.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Consistency")
    @Expose
    private Long Consistency;

    /**
    * Consumption heap

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumerLag")
    @Expose
    private Long ConsumerLag;

    /**
    * Last consumption progress update time. **It is a Unix timestamp (ms).**
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
    * Whether it is sequential consumption

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumeMessageOrderly")
    @Expose
    private Boolean ConsumeMessageOrderly;

    /**
    * Specifies the consumption mode. 
BROADCASTING mode.
CLUSTERING: cluster mode.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MessageModel")
    @Expose
    private String MessageModel;

    /**
    * List of clients with inconsistent subscriptions.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientSubscriptionInfos")
    @Expose
    private ClientSubscriptionInfo [] ClientSubscriptionInfos;

    /**
     * Get Instance ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Topic name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Topic Topic name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Topic name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Topic Topic name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Topic type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicType Topic type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set Topic type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicType Topic type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get Number of topic queues on a single node

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicQueueNum Number of topic queues on a single node

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTopicQueueNum() {
        return this.TopicQueueNum;
    }

    /**
     * Set Number of topic queues on a single node

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicQueueNum Number of topic queues on a single node

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicQueueNum(Long TopicQueueNum) {
        this.TopicQueueNum = TopicQueueNum;
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
     * Get Consumption type. valid values as follows:.

-PULL: specifies the pull consumption type.
-PUSH: specifies the push consumption type.
-POP: specifies the pop consumption type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConsumeType Consumption type. valid values as follows:.

-PULL: specifies the pull consumption type.
-PUSH: specifies the push consumption type.
-POP: specifies the pop consumption type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConsumeType() {
        return this.ConsumeType;
    }

    /**
     * Set Consumption type. valid values as follows:.

-PULL: specifies the pull consumption type.
-PUSH: specifies the push consumption type.
-POP: specifies the pop consumption type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConsumeType Consumption type. valid values as follows:.

-PULL: specifies the pull consumption type.
-PUSH: specifies the push consumption type.
-POP: specifies the pop consumption type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumeType(String ConsumeType) {
        this.ConsumeType = ConsumeType;
    }

    /**
     * Get Subscription rule.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubString Subscription rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubString() {
        return this.SubString;
    }

    /**
     * Set Subscription rule.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubString Subscription rule.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubString(String SubString) {
        this.SubString = SubString;
    }

    /**
     * Get Filter type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpressionType Filter type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpressionType() {
        return this.ExpressionType;
    }

    /**
     * Set Filter type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpressionType Filter type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpressionType(String ExpressionType) {
        this.ExpressionType = ExpressionType;
    }

    /**
     * Get Subscription consistency. enumerated as follows:.

-Subscription consistency.
-Subscription inconsistency.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Consistency Subscription consistency. enumerated as follows:.

-Subscription consistency.
-Subscription inconsistency.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getConsistency() {
        return this.Consistency;
    }

    /**
     * Set Subscription consistency. enumerated as follows:.

-Subscription consistency.
-Subscription inconsistency.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Consistency Subscription consistency. enumerated as follows:.

-Subscription consistency.
-Subscription inconsistency.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsistency(Long Consistency) {
        this.Consistency = Consistency;
    }

    /**
     * Get Consumption heap

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConsumerLag Consumption heap

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getConsumerLag() {
        return this.ConsumerLag;
    }

    /**
     * Set Consumption heap

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConsumerLag Consumption heap

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumerLag(Long ConsumerLag) {
        this.ConsumerLag = ConsumerLag;
    }

    /**
     * Get Last consumption progress update time. **It is a Unix timestamp (ms).**
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastUpdateTime Last consumption progress update time. **It is a Unix timestamp (ms).**
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set Last consumption progress update time. **It is a Unix timestamp (ms).**
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastUpdateTime Last consumption progress update time. **It is a Unix timestamp (ms).**
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
     * Get Whether it is sequential consumption

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConsumeMessageOrderly Whether it is sequential consumption

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getConsumeMessageOrderly() {
        return this.ConsumeMessageOrderly;
    }

    /**
     * Set Whether it is sequential consumption

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConsumeMessageOrderly Whether it is sequential consumption

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumeMessageOrderly(Boolean ConsumeMessageOrderly) {
        this.ConsumeMessageOrderly = ConsumeMessageOrderly;
    }

    /**
     * Get Specifies the consumption mode. 
BROADCASTING mode.
CLUSTERING: cluster mode.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MessageModel Specifies the consumption mode. 
BROADCASTING mode.
CLUSTERING: cluster mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessageModel() {
        return this.MessageModel;
    }

    /**
     * Set Specifies the consumption mode. 
BROADCASTING mode.
CLUSTERING: cluster mode.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MessageModel Specifies the consumption mode. 
BROADCASTING mode.
CLUSTERING: cluster mode.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessageModel(String MessageModel) {
        this.MessageModel = MessageModel;
    }

    /**
     * Get List of clients with inconsistent subscriptions.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientSubscriptionInfos List of clients with inconsistent subscriptions.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ClientSubscriptionInfo [] getClientSubscriptionInfos() {
        return this.ClientSubscriptionInfos;
    }

    /**
     * Set List of clients with inconsistent subscriptions.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientSubscriptionInfos List of clients with inconsistent subscriptions.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientSubscriptionInfos(ClientSubscriptionInfo [] ClientSubscriptionInfos) {
        this.ClientSubscriptionInfos = ClientSubscriptionInfos;
    }

    public SubscriptionData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubscriptionData(SubscriptionData source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.TopicType != null) {
            this.TopicType = new String(source.TopicType);
        }
        if (source.TopicQueueNum != null) {
            this.TopicQueueNum = new Long(source.TopicQueueNum);
        }
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.IsOnline != null) {
            this.IsOnline = new Boolean(source.IsOnline);
        }
        if (source.ConsumeType != null) {
            this.ConsumeType = new String(source.ConsumeType);
        }
        if (source.SubString != null) {
            this.SubString = new String(source.SubString);
        }
        if (source.ExpressionType != null) {
            this.ExpressionType = new String(source.ExpressionType);
        }
        if (source.Consistency != null) {
            this.Consistency = new Long(source.Consistency);
        }
        if (source.ConsumerLag != null) {
            this.ConsumerLag = new Long(source.ConsumerLag);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new Long(source.LastUpdateTime);
        }
        if (source.MaxRetryTimes != null) {
            this.MaxRetryTimes = new Long(source.MaxRetryTimes);
        }
        if (source.ConsumeMessageOrderly != null) {
            this.ConsumeMessageOrderly = new Boolean(source.ConsumeMessageOrderly);
        }
        if (source.MessageModel != null) {
            this.MessageModel = new String(source.MessageModel);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "TopicQueueNum", this.TopicQueueNum);
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "IsOnline", this.IsOnline);
        this.setParamSimple(map, prefix + "ConsumeType", this.ConsumeType);
        this.setParamSimple(map, prefix + "SubString", this.SubString);
        this.setParamSimple(map, prefix + "ExpressionType", this.ExpressionType);
        this.setParamSimple(map, prefix + "Consistency", this.Consistency);
        this.setParamSimple(map, prefix + "ConsumerLag", this.ConsumerLag);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "MaxRetryTimes", this.MaxRetryTimes);
        this.setParamSimple(map, prefix + "ConsumeMessageOrderly", this.ConsumeMessageOrderly);
        this.setParamSimple(map, prefix + "MessageModel", this.MessageModel);
        this.setParamArrayObj(map, prefix + "ClientSubscriptionInfos.", this.ClientSubscriptionInfos);

    }
}

