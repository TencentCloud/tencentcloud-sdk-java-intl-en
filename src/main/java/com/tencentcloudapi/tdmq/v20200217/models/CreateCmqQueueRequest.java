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

public class CreateCmqQueueRequest extends AbstractModel{

    /**
    * Queue name, which must be unique under the same account in the same region. It can contain up to 64 letters, digits, and hyphens and must begin with a letter.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Maximum number of heaped messages. The value range is 1,000,000–10,000,000 during the beta test and can be 1,000,000–1,000,000,000 after the product is officially released. The default value is 10,000,000 during the beta test and will be 100,000,000 after the product is officially released.
    */
    @SerializedName("MaxMsgHeapNum")
    @Expose
    private Long MaxMsgHeapNum;

    /**
    * Long polling wait time for message reception. Value range: 0–30 seconds. Default value: 0.
    */
    @SerializedName("PollingWaitSeconds")
    @Expose
    private Long PollingWaitSeconds;

    /**
    * Message visibility timeout period. Value range: 1–43200 seconds (i.e., 12 hours). Default value: 30.
    */
    @SerializedName("VisibilityTimeout")
    @Expose
    private Long VisibilityTimeout;

    /**
    * Maximum message length. Value range: 1024–65536 bytes (i.e., 1–64 KB). Default value: 65536.
    */
    @SerializedName("MaxMsgSize")
    @Expose
    private Long MaxMsgSize;

    /**
    * Message retention period. Value range: 60–1296000 seconds (i.e., 1 minute–15 days). Default value: 345600 (i.e., 4 days).
    */
    @SerializedName("MsgRetentionSeconds")
    @Expose
    private Long MsgRetentionSeconds;

    /**
    * Whether to enable the message rewinding feature for a queue. Value range: 0–msgRetentionSeconds, where 0 means not to enable this feature, while `msgRetentionSeconds` indicates that the maximum rewindable period is the message retention period of the queue.
    */
    @SerializedName("RewindSeconds")
    @Expose
    private Long RewindSeconds;

    /**
    * 1: transaction queue; 0: general queue
    */
    @SerializedName("Transaction")
    @Expose
    private Long Transaction;

    /**
    * First lookback interval
    */
    @SerializedName("FirstQueryInterval")
    @Expose
    private Long FirstQueryInterval;

    /**
    * Maximum number of lookbacks
    */
    @SerializedName("MaxQueryCount")
    @Expose
    private Long MaxQueryCount;

    /**
    * Dead letter queue name
    */
    @SerializedName("DeadLetterQueueName")
    @Expose
    private String DeadLetterQueueName;

    /**
    * Dead letter policy. 0: message has been consumed multiple times but not deleted; 1: `Time-To-Live` has elapsed
    */
    @SerializedName("Policy")
    @Expose
    private Long Policy;

    /**
    * Maximum receipt times. Value range: 1–1000
    */
    @SerializedName("MaxReceiveCount")
    @Expose
    private Long MaxReceiveCount;

    /**
    * Maximum period in seconds before an unconsumed message expires, which is required if `policy` is 1. Value range: 300–43200. This value should be smaller than `msgRetentionSeconds` (maximum message retention period)
    */
    @SerializedName("MaxTimeToLive")
    @Expose
    private Long MaxTimeToLive;

    /**
    * Whether to enable message trace. true: yes; false: no. If this field is not configured, the feature will not be enabled
    */
    @SerializedName("Trace")
    @Expose
    private Boolean Trace;

    /**
    * Tag array.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Queue name, which must be unique under the same account in the same region. It can contain up to 64 letters, digits, and hyphens and must begin with a letter. 
     * @return QueueName Queue name, which must be unique under the same account in the same region. It can contain up to 64 letters, digits, and hyphens and must begin with a letter.
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set Queue name, which must be unique under the same account in the same region. It can contain up to 64 letters, digits, and hyphens and must begin with a letter.
     * @param QueueName Queue name, which must be unique under the same account in the same region. It can contain up to 64 letters, digits, and hyphens and must begin with a letter.
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get Maximum number of heaped messages. The value range is 1,000,000–10,000,000 during the beta test and can be 1,000,000–1,000,000,000 after the product is officially released. The default value is 10,000,000 during the beta test and will be 100,000,000 after the product is officially released. 
     * @return MaxMsgHeapNum Maximum number of heaped messages. The value range is 1,000,000–10,000,000 during the beta test and can be 1,000,000–1,000,000,000 after the product is officially released. The default value is 10,000,000 during the beta test and will be 100,000,000 after the product is officially released.
     */
    public Long getMaxMsgHeapNum() {
        return this.MaxMsgHeapNum;
    }

    /**
     * Set Maximum number of heaped messages. The value range is 1,000,000–10,000,000 during the beta test and can be 1,000,000–1,000,000,000 after the product is officially released. The default value is 10,000,000 during the beta test and will be 100,000,000 after the product is officially released.
     * @param MaxMsgHeapNum Maximum number of heaped messages. The value range is 1,000,000–10,000,000 during the beta test and can be 1,000,000–1,000,000,000 after the product is officially released. The default value is 10,000,000 during the beta test and will be 100,000,000 after the product is officially released.
     */
    public void setMaxMsgHeapNum(Long MaxMsgHeapNum) {
        this.MaxMsgHeapNum = MaxMsgHeapNum;
    }

    /**
     * Get Long polling wait time for message reception. Value range: 0–30 seconds. Default value: 0. 
     * @return PollingWaitSeconds Long polling wait time for message reception. Value range: 0–30 seconds. Default value: 0.
     */
    public Long getPollingWaitSeconds() {
        return this.PollingWaitSeconds;
    }

    /**
     * Set Long polling wait time for message reception. Value range: 0–30 seconds. Default value: 0.
     * @param PollingWaitSeconds Long polling wait time for message reception. Value range: 0–30 seconds. Default value: 0.
     */
    public void setPollingWaitSeconds(Long PollingWaitSeconds) {
        this.PollingWaitSeconds = PollingWaitSeconds;
    }

    /**
     * Get Message visibility timeout period. Value range: 1–43200 seconds (i.e., 12 hours). Default value: 30. 
     * @return VisibilityTimeout Message visibility timeout period. Value range: 1–43200 seconds (i.e., 12 hours). Default value: 30.
     */
    public Long getVisibilityTimeout() {
        return this.VisibilityTimeout;
    }

    /**
     * Set Message visibility timeout period. Value range: 1–43200 seconds (i.e., 12 hours). Default value: 30.
     * @param VisibilityTimeout Message visibility timeout period. Value range: 1–43200 seconds (i.e., 12 hours). Default value: 30.
     */
    public void setVisibilityTimeout(Long VisibilityTimeout) {
        this.VisibilityTimeout = VisibilityTimeout;
    }

    /**
     * Get Maximum message length. Value range: 1024–65536 bytes (i.e., 1–64 KB). Default value: 65536. 
     * @return MaxMsgSize Maximum message length. Value range: 1024–65536 bytes (i.e., 1–64 KB). Default value: 65536.
     */
    public Long getMaxMsgSize() {
        return this.MaxMsgSize;
    }

    /**
     * Set Maximum message length. Value range: 1024–65536 bytes (i.e., 1–64 KB). Default value: 65536.
     * @param MaxMsgSize Maximum message length. Value range: 1024–65536 bytes (i.e., 1–64 KB). Default value: 65536.
     */
    public void setMaxMsgSize(Long MaxMsgSize) {
        this.MaxMsgSize = MaxMsgSize;
    }

    /**
     * Get Message retention period. Value range: 60–1296000 seconds (i.e., 1 minute–15 days). Default value: 345600 (i.e., 4 days). 
     * @return MsgRetentionSeconds Message retention period. Value range: 60–1296000 seconds (i.e., 1 minute–15 days). Default value: 345600 (i.e., 4 days).
     */
    public Long getMsgRetentionSeconds() {
        return this.MsgRetentionSeconds;
    }

    /**
     * Set Message retention period. Value range: 60–1296000 seconds (i.e., 1 minute–15 days). Default value: 345600 (i.e., 4 days).
     * @param MsgRetentionSeconds Message retention period. Value range: 60–1296000 seconds (i.e., 1 minute–15 days). Default value: 345600 (i.e., 4 days).
     */
    public void setMsgRetentionSeconds(Long MsgRetentionSeconds) {
        this.MsgRetentionSeconds = MsgRetentionSeconds;
    }

    /**
     * Get Whether to enable the message rewinding feature for a queue. Value range: 0–msgRetentionSeconds, where 0 means not to enable this feature, while `msgRetentionSeconds` indicates that the maximum rewindable period is the message retention period of the queue. 
     * @return RewindSeconds Whether to enable the message rewinding feature for a queue. Value range: 0–msgRetentionSeconds, where 0 means not to enable this feature, while `msgRetentionSeconds` indicates that the maximum rewindable period is the message retention period of the queue.
     */
    public Long getRewindSeconds() {
        return this.RewindSeconds;
    }

    /**
     * Set Whether to enable the message rewinding feature for a queue. Value range: 0–msgRetentionSeconds, where 0 means not to enable this feature, while `msgRetentionSeconds` indicates that the maximum rewindable period is the message retention period of the queue.
     * @param RewindSeconds Whether to enable the message rewinding feature for a queue. Value range: 0–msgRetentionSeconds, where 0 means not to enable this feature, while `msgRetentionSeconds` indicates that the maximum rewindable period is the message retention period of the queue.
     */
    public void setRewindSeconds(Long RewindSeconds) {
        this.RewindSeconds = RewindSeconds;
    }

    /**
     * Get 1: transaction queue; 0: general queue 
     * @return Transaction 1: transaction queue; 0: general queue
     */
    public Long getTransaction() {
        return this.Transaction;
    }

    /**
     * Set 1: transaction queue; 0: general queue
     * @param Transaction 1: transaction queue; 0: general queue
     */
    public void setTransaction(Long Transaction) {
        this.Transaction = Transaction;
    }

    /**
     * Get First lookback interval 
     * @return FirstQueryInterval First lookback interval
     */
    public Long getFirstQueryInterval() {
        return this.FirstQueryInterval;
    }

    /**
     * Set First lookback interval
     * @param FirstQueryInterval First lookback interval
     */
    public void setFirstQueryInterval(Long FirstQueryInterval) {
        this.FirstQueryInterval = FirstQueryInterval;
    }

    /**
     * Get Maximum number of lookbacks 
     * @return MaxQueryCount Maximum number of lookbacks
     */
    public Long getMaxQueryCount() {
        return this.MaxQueryCount;
    }

    /**
     * Set Maximum number of lookbacks
     * @param MaxQueryCount Maximum number of lookbacks
     */
    public void setMaxQueryCount(Long MaxQueryCount) {
        this.MaxQueryCount = MaxQueryCount;
    }

    /**
     * Get Dead letter queue name 
     * @return DeadLetterQueueName Dead letter queue name
     */
    public String getDeadLetterQueueName() {
        return this.DeadLetterQueueName;
    }

    /**
     * Set Dead letter queue name
     * @param DeadLetterQueueName Dead letter queue name
     */
    public void setDeadLetterQueueName(String DeadLetterQueueName) {
        this.DeadLetterQueueName = DeadLetterQueueName;
    }

    /**
     * Get Dead letter policy. 0: message has been consumed multiple times but not deleted; 1: `Time-To-Live` has elapsed 
     * @return Policy Dead letter policy. 0: message has been consumed multiple times but not deleted; 1: `Time-To-Live` has elapsed
     */
    public Long getPolicy() {
        return this.Policy;
    }

    /**
     * Set Dead letter policy. 0: message has been consumed multiple times but not deleted; 1: `Time-To-Live` has elapsed
     * @param Policy Dead letter policy. 0: message has been consumed multiple times but not deleted; 1: `Time-To-Live` has elapsed
     */
    public void setPolicy(Long Policy) {
        this.Policy = Policy;
    }

    /**
     * Get Maximum receipt times. Value range: 1–1000 
     * @return MaxReceiveCount Maximum receipt times. Value range: 1–1000
     */
    public Long getMaxReceiveCount() {
        return this.MaxReceiveCount;
    }

    /**
     * Set Maximum receipt times. Value range: 1–1000
     * @param MaxReceiveCount Maximum receipt times. Value range: 1–1000
     */
    public void setMaxReceiveCount(Long MaxReceiveCount) {
        this.MaxReceiveCount = MaxReceiveCount;
    }

    /**
     * Get Maximum period in seconds before an unconsumed message expires, which is required if `policy` is 1. Value range: 300–43200. This value should be smaller than `msgRetentionSeconds` (maximum message retention period) 
     * @return MaxTimeToLive Maximum period in seconds before an unconsumed message expires, which is required if `policy` is 1. Value range: 300–43200. This value should be smaller than `msgRetentionSeconds` (maximum message retention period)
     */
    public Long getMaxTimeToLive() {
        return this.MaxTimeToLive;
    }

    /**
     * Set Maximum period in seconds before an unconsumed message expires, which is required if `policy` is 1. Value range: 300–43200. This value should be smaller than `msgRetentionSeconds` (maximum message retention period)
     * @param MaxTimeToLive Maximum period in seconds before an unconsumed message expires, which is required if `policy` is 1. Value range: 300–43200. This value should be smaller than `msgRetentionSeconds` (maximum message retention period)
     */
    public void setMaxTimeToLive(Long MaxTimeToLive) {
        this.MaxTimeToLive = MaxTimeToLive;
    }

    /**
     * Get Whether to enable message trace. true: yes; false: no. If this field is not configured, the feature will not be enabled 
     * @return Trace Whether to enable message trace. true: yes; false: no. If this field is not configured, the feature will not be enabled
     */
    public Boolean getTrace() {
        return this.Trace;
    }

    /**
     * Set Whether to enable message trace. true: yes; false: no. If this field is not configured, the feature will not be enabled
     * @param Trace Whether to enable message trace. true: yes; false: no. If this field is not configured, the feature will not be enabled
     */
    public void setTrace(Boolean Trace) {
        this.Trace = Trace;
    }

    /**
     * Get Tag array. 
     * @return Tags Tag array.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag array.
     * @param Tags Tag array.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateCmqQueueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCmqQueueRequest(CreateCmqQueueRequest source) {
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.MaxMsgHeapNum != null) {
            this.MaxMsgHeapNum = new Long(source.MaxMsgHeapNum);
        }
        if (source.PollingWaitSeconds != null) {
            this.PollingWaitSeconds = new Long(source.PollingWaitSeconds);
        }
        if (source.VisibilityTimeout != null) {
            this.VisibilityTimeout = new Long(source.VisibilityTimeout);
        }
        if (source.MaxMsgSize != null) {
            this.MaxMsgSize = new Long(source.MaxMsgSize);
        }
        if (source.MsgRetentionSeconds != null) {
            this.MsgRetentionSeconds = new Long(source.MsgRetentionSeconds);
        }
        if (source.RewindSeconds != null) {
            this.RewindSeconds = new Long(source.RewindSeconds);
        }
        if (source.Transaction != null) {
            this.Transaction = new Long(source.Transaction);
        }
        if (source.FirstQueryInterval != null) {
            this.FirstQueryInterval = new Long(source.FirstQueryInterval);
        }
        if (source.MaxQueryCount != null) {
            this.MaxQueryCount = new Long(source.MaxQueryCount);
        }
        if (source.DeadLetterQueueName != null) {
            this.DeadLetterQueueName = new String(source.DeadLetterQueueName);
        }
        if (source.Policy != null) {
            this.Policy = new Long(source.Policy);
        }
        if (source.MaxReceiveCount != null) {
            this.MaxReceiveCount = new Long(source.MaxReceiveCount);
        }
        if (source.MaxTimeToLive != null) {
            this.MaxTimeToLive = new Long(source.MaxTimeToLive);
        }
        if (source.Trace != null) {
            this.Trace = new Boolean(source.Trace);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "MaxMsgHeapNum", this.MaxMsgHeapNum);
        this.setParamSimple(map, prefix + "PollingWaitSeconds", this.PollingWaitSeconds);
        this.setParamSimple(map, prefix + "VisibilityTimeout", this.VisibilityTimeout);
        this.setParamSimple(map, prefix + "MaxMsgSize", this.MaxMsgSize);
        this.setParamSimple(map, prefix + "MsgRetentionSeconds", this.MsgRetentionSeconds);
        this.setParamSimple(map, prefix + "RewindSeconds", this.RewindSeconds);
        this.setParamSimple(map, prefix + "Transaction", this.Transaction);
        this.setParamSimple(map, prefix + "FirstQueryInterval", this.FirstQueryInterval);
        this.setParamSimple(map, prefix + "MaxQueryCount", this.MaxQueryCount);
        this.setParamSimple(map, prefix + "DeadLetterQueueName", this.DeadLetterQueueName);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "MaxReceiveCount", this.MaxReceiveCount);
        this.setParamSimple(map, prefix + "MaxTimeToLive", this.MaxTimeToLive);
        this.setParamSimple(map, prefix + "Trace", this.Trace);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

