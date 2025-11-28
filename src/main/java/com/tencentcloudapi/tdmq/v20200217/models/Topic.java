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

public class Topic extends AbstractModel {

    /**
    * Average size of the messages published in the last interval in bytes.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AverageMsgSize")
    @Expose
    private String AverageMsgSize;

    /**
    * The number of consumers.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumerCount")
    @Expose
    private String ConsumerCount;

    /**
    * The total number of recorded messages.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastConfirmedEntry")
    @Expose
    private String LastConfirmedEntry;

    /**
    * Time when the last ledger was created.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastLedgerCreatedTimestamp")
    @Expose
    private String LastLedgerCreatedTimestamp;

    /**
    * The number of messages published by local and replicated publishers per second.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgRateIn")
    @Expose
    private String MsgRateIn;

    /**
    * The total number of messages delivered by local and replicated consumers per second.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgRateOut")
    @Expose
    private String MsgRateOut;

    /**
    * The size (in bytes) of messages published by local and replicated publishers per second.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgThroughputIn")
    @Expose
    private String MsgThroughputIn;

    /**
    * The size (in bytes) of messages delivered by local and replicated consumers per second.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgThroughputOut")
    @Expose
    private String MsgThroughputOut;

    /**
    * The total number of recorded messages.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NumberOfEntries")
    @Expose
    private String NumberOfEntries;

    /**
    * Partition count ≤ 0: there are no subpartitions in the topic.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Partitions")
    @Expose
    private Long Partitions;

    /**
    * The number of producers.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProducerCount")
    @Expose
    private String ProducerCount;

    /**
    * The size of all stored messages in bytes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalSize")
    @Expose
    private String TotalSize;

    /**
    * Subpartitions in a partitioned topic.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubTopicSets")
    @Expose
    private PartitionsTopic [] SubTopicSets;

    /**
    * Topic type description:
0: General message;
1: Globally sequential message;
2: Partitionally sequential message;
3: Retry letter topic;
4: Dead letter topic;
5: Transaction message.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicType")
    @Expose
    private Long TopicType;

    /**
    * Environment (namespace) name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Topic name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Remarks (up to 128 characters).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * The maximum number of producers.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProducerLimit")
    @Expose
    private String ProducerLimit;

    /**
    * The maximum number of consumers.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumerLimit")
    @Expose
    private String ConsumerLimit;

    /**
    * `0`: Non-persistent and non-partitioned
`1`: Non-persistent and partitioned
`2`: Persistent and non-partitioned
`3`: Persistent and partitioned
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PulsarTopicType")
    @Expose
    private Long PulsarTopicType;

    /**
    * Retention period for unconsumed messages in seconds.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Tenant alias customized by users. if there is no, reuse the professional cluster ID.

    */
    @SerializedName("Tenant")
    @Expose
    private String Tenant;

    /**
    * Whether exception consumer isolation is enabled.
    */
    @SerializedName("IsolateConsumerEnable")
    @Expose
    private Boolean IsolateConsumerEnable;

    /**
    * Specifies the consumer Ack timeout period in seconds.
    */
    @SerializedName("AckTimeOut")
    @Expose
    private Long AckTimeOut;

    /**
     * Get Average size of the messages published in the last interval in bytes.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return AverageMsgSize Average size of the messages published in the last interval in bytes.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAverageMsgSize() {
        return this.AverageMsgSize;
    }

    /**
     * Set Average size of the messages published in the last interval in bytes.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param AverageMsgSize Average size of the messages published in the last interval in bytes.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAverageMsgSize(String AverageMsgSize) {
        this.AverageMsgSize = AverageMsgSize;
    }

    /**
     * Get The number of consumers.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConsumerCount The number of consumers.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConsumerCount() {
        return this.ConsumerCount;
    }

    /**
     * Set The number of consumers.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConsumerCount The number of consumers.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumerCount(String ConsumerCount) {
        this.ConsumerCount = ConsumerCount;
    }

    /**
     * Get The total number of recorded messages.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastConfirmedEntry The total number of recorded messages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastConfirmedEntry() {
        return this.LastConfirmedEntry;
    }

    /**
     * Set The total number of recorded messages.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastConfirmedEntry The total number of recorded messages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastConfirmedEntry(String LastConfirmedEntry) {
        this.LastConfirmedEntry = LastConfirmedEntry;
    }

    /**
     * Get Time when the last ledger was created.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastLedgerCreatedTimestamp Time when the last ledger was created.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastLedgerCreatedTimestamp() {
        return this.LastLedgerCreatedTimestamp;
    }

    /**
     * Set Time when the last ledger was created.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastLedgerCreatedTimestamp Time when the last ledger was created.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastLedgerCreatedTimestamp(String LastLedgerCreatedTimestamp) {
        this.LastLedgerCreatedTimestamp = LastLedgerCreatedTimestamp;
    }

    /**
     * Get The number of messages published by local and replicated publishers per second.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MsgRateIn The number of messages published by local and replicated publishers per second.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgRateIn() {
        return this.MsgRateIn;
    }

    /**
     * Set The number of messages published by local and replicated publishers per second.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MsgRateIn The number of messages published by local and replicated publishers per second.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgRateIn(String MsgRateIn) {
        this.MsgRateIn = MsgRateIn;
    }

    /**
     * Get The total number of messages delivered by local and replicated consumers per second.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MsgRateOut The total number of messages delivered by local and replicated consumers per second.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgRateOut() {
        return this.MsgRateOut;
    }

    /**
     * Set The total number of messages delivered by local and replicated consumers per second.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MsgRateOut The total number of messages delivered by local and replicated consumers per second.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgRateOut(String MsgRateOut) {
        this.MsgRateOut = MsgRateOut;
    }

    /**
     * Get The size (in bytes) of messages published by local and replicated publishers per second.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MsgThroughputIn The size (in bytes) of messages published by local and replicated publishers per second.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgThroughputIn() {
        return this.MsgThroughputIn;
    }

    /**
     * Set The size (in bytes) of messages published by local and replicated publishers per second.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MsgThroughputIn The size (in bytes) of messages published by local and replicated publishers per second.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgThroughputIn(String MsgThroughputIn) {
        this.MsgThroughputIn = MsgThroughputIn;
    }

    /**
     * Get The size (in bytes) of messages delivered by local and replicated consumers per second.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MsgThroughputOut The size (in bytes) of messages delivered by local and replicated consumers per second.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgThroughputOut() {
        return this.MsgThroughputOut;
    }

    /**
     * Set The size (in bytes) of messages delivered by local and replicated consumers per second.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MsgThroughputOut The size (in bytes) of messages delivered by local and replicated consumers per second.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgThroughputOut(String MsgThroughputOut) {
        this.MsgThroughputOut = MsgThroughputOut;
    }

    /**
     * Get The total number of recorded messages.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NumberOfEntries The total number of recorded messages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNumberOfEntries() {
        return this.NumberOfEntries;
    }

    /**
     * Set The total number of recorded messages.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NumberOfEntries The total number of recorded messages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNumberOfEntries(String NumberOfEntries) {
        this.NumberOfEntries = NumberOfEntries;
    }

    /**
     * Get Partition count ≤ 0: there are no subpartitions in the topic.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Partitions Partition count ≤ 0: there are no subpartitions in the topic.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPartitions() {
        return this.Partitions;
    }

    /**
     * Set Partition count ≤ 0: there are no subpartitions in the topic.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Partitions Partition count ≤ 0: there are no subpartitions in the topic.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitions(Long Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get The number of producers.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProducerCount The number of producers.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProducerCount() {
        return this.ProducerCount;
    }

    /**
     * Set The number of producers.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProducerCount The number of producers.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProducerCount(String ProducerCount) {
        this.ProducerCount = ProducerCount;
    }

    /**
     * Get The size of all stored messages in bytes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalSize The size of all stored messages in bytes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set The size of all stored messages in bytes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalSize The size of all stored messages in bytes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalSize(String TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get Subpartitions in a partitioned topic.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubTopicSets Subpartitions in a partitioned topic.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PartitionsTopic [] getSubTopicSets() {
        return this.SubTopicSets;
    }

    /**
     * Set Subpartitions in a partitioned topic.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubTopicSets Subpartitions in a partitioned topic.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubTopicSets(PartitionsTopic [] SubTopicSets) {
        this.SubTopicSets = SubTopicSets;
    }

    /**
     * Get Topic type description:
0: General message;
1: Globally sequential message;
2: Partitionally sequential message;
3: Retry letter topic;
4: Dead letter topic;
5: Transaction message.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicType Topic type description:
0: General message;
1: Globally sequential message;
2: Partitionally sequential message;
3: Retry letter topic;
4: Dead letter topic;
5: Transaction message.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTopicType() {
        return this.TopicType;
    }

    /**
     * Set Topic type description:
0: General message;
1: Globally sequential message;
2: Partitionally sequential message;
3: Retry letter topic;
4: Dead letter topic;
5: Transaction message.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicType Topic type description:
0: General message;
1: Globally sequential message;
2: Partitionally sequential message;
3: Retry letter topic;
4: Dead letter topic;
5: Transaction message.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicType(Long TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get Environment (namespace) name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnvironmentId Environment (namespace) name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment (namespace) name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnvironmentId Environment (namespace) name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Topic name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicName Topic name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicName Topic name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Remarks (up to 128 characters).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks (up to 128 characters).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks (up to 128 characters).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks (up to 128 characters).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Last modified.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Last modified.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get The maximum number of producers.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProducerLimit The maximum number of producers.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProducerLimit() {
        return this.ProducerLimit;
    }

    /**
     * Set The maximum number of producers.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProducerLimit The maximum number of producers.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProducerLimit(String ProducerLimit) {
        this.ProducerLimit = ProducerLimit;
    }

    /**
     * Get The maximum number of consumers.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConsumerLimit The maximum number of consumers.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConsumerLimit() {
        return this.ConsumerLimit;
    }

    /**
     * Set The maximum number of consumers.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConsumerLimit The maximum number of consumers.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumerLimit(String ConsumerLimit) {
        this.ConsumerLimit = ConsumerLimit;
    }

    /**
     * Get `0`: Non-persistent and non-partitioned
`1`: Non-persistent and partitioned
`2`: Persistent and non-partitioned
`3`: Persistent and partitioned
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PulsarTopicType `0`: Non-persistent and non-partitioned
`1`: Non-persistent and partitioned
`2`: Persistent and non-partitioned
`3`: Persistent and partitioned
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPulsarTopicType() {
        return this.PulsarTopicType;
    }

    /**
     * Set `0`: Non-persistent and non-partitioned
`1`: Non-persistent and partitioned
`2`: Persistent and non-partitioned
`3`: Persistent and partitioned
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PulsarTopicType `0`: Non-persistent and non-partitioned
`1`: Non-persistent and partitioned
`2`: Persistent and non-partitioned
`3`: Persistent and partitioned
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPulsarTopicType(Long PulsarTopicType) {
        this.PulsarTopicType = PulsarTopicType;
    }

    /**
     * Get Retention period for unconsumed messages in seconds.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MsgTTL Retention period for unconsumed messages in seconds.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set Retention period for unconsumed messages in seconds.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param MsgTTL Retention period for unconsumed messages in seconds.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Tenant alias customized by users. if there is no, reuse the professional cluster ID.
 
     * @return Tenant Tenant alias customized by users. if there is no, reuse the professional cluster ID.

     */
    public String getTenant() {
        return this.Tenant;
    }

    /**
     * Set Tenant alias customized by users. if there is no, reuse the professional cluster ID.

     * @param Tenant Tenant alias customized by users. if there is no, reuse the professional cluster ID.

     */
    public void setTenant(String Tenant) {
        this.Tenant = Tenant;
    }

    /**
     * Get Whether exception consumer isolation is enabled. 
     * @return IsolateConsumerEnable Whether exception consumer isolation is enabled.
     */
    public Boolean getIsolateConsumerEnable() {
        return this.IsolateConsumerEnable;
    }

    /**
     * Set Whether exception consumer isolation is enabled.
     * @param IsolateConsumerEnable Whether exception consumer isolation is enabled.
     */
    public void setIsolateConsumerEnable(Boolean IsolateConsumerEnable) {
        this.IsolateConsumerEnable = IsolateConsumerEnable;
    }

    /**
     * Get Specifies the consumer Ack timeout period in seconds. 
     * @return AckTimeOut Specifies the consumer Ack timeout period in seconds.
     */
    public Long getAckTimeOut() {
        return this.AckTimeOut;
    }

    /**
     * Set Specifies the consumer Ack timeout period in seconds.
     * @param AckTimeOut Specifies the consumer Ack timeout period in seconds.
     */
    public void setAckTimeOut(Long AckTimeOut) {
        this.AckTimeOut = AckTimeOut;
    }

    public Topic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Topic(Topic source) {
        if (source.AverageMsgSize != null) {
            this.AverageMsgSize = new String(source.AverageMsgSize);
        }
        if (source.ConsumerCount != null) {
            this.ConsumerCount = new String(source.ConsumerCount);
        }
        if (source.LastConfirmedEntry != null) {
            this.LastConfirmedEntry = new String(source.LastConfirmedEntry);
        }
        if (source.LastLedgerCreatedTimestamp != null) {
            this.LastLedgerCreatedTimestamp = new String(source.LastLedgerCreatedTimestamp);
        }
        if (source.MsgRateIn != null) {
            this.MsgRateIn = new String(source.MsgRateIn);
        }
        if (source.MsgRateOut != null) {
            this.MsgRateOut = new String(source.MsgRateOut);
        }
        if (source.MsgThroughputIn != null) {
            this.MsgThroughputIn = new String(source.MsgThroughputIn);
        }
        if (source.MsgThroughputOut != null) {
            this.MsgThroughputOut = new String(source.MsgThroughputOut);
        }
        if (source.NumberOfEntries != null) {
            this.NumberOfEntries = new String(source.NumberOfEntries);
        }
        if (source.Partitions != null) {
            this.Partitions = new Long(source.Partitions);
        }
        if (source.ProducerCount != null) {
            this.ProducerCount = new String(source.ProducerCount);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new String(source.TotalSize);
        }
        if (source.SubTopicSets != null) {
            this.SubTopicSets = new PartitionsTopic[source.SubTopicSets.length];
            for (int i = 0; i < source.SubTopicSets.length; i++) {
                this.SubTopicSets[i] = new PartitionsTopic(source.SubTopicSets[i]);
            }
        }
        if (source.TopicType != null) {
            this.TopicType = new Long(source.TopicType);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
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
        if (source.ProducerLimit != null) {
            this.ProducerLimit = new String(source.ProducerLimit);
        }
        if (source.ConsumerLimit != null) {
            this.ConsumerLimit = new String(source.ConsumerLimit);
        }
        if (source.PulsarTopicType != null) {
            this.PulsarTopicType = new Long(source.PulsarTopicType);
        }
        if (source.MsgTTL != null) {
            this.MsgTTL = new Long(source.MsgTTL);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Tenant != null) {
            this.Tenant = new String(source.Tenant);
        }
        if (source.IsolateConsumerEnable != null) {
            this.IsolateConsumerEnable = new Boolean(source.IsolateConsumerEnable);
        }
        if (source.AckTimeOut != null) {
            this.AckTimeOut = new Long(source.AckTimeOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AverageMsgSize", this.AverageMsgSize);
        this.setParamSimple(map, prefix + "ConsumerCount", this.ConsumerCount);
        this.setParamSimple(map, prefix + "LastConfirmedEntry", this.LastConfirmedEntry);
        this.setParamSimple(map, prefix + "LastLedgerCreatedTimestamp", this.LastLedgerCreatedTimestamp);
        this.setParamSimple(map, prefix + "MsgRateIn", this.MsgRateIn);
        this.setParamSimple(map, prefix + "MsgRateOut", this.MsgRateOut);
        this.setParamSimple(map, prefix + "MsgThroughputIn", this.MsgThroughputIn);
        this.setParamSimple(map, prefix + "MsgThroughputOut", this.MsgThroughputOut);
        this.setParamSimple(map, prefix + "NumberOfEntries", this.NumberOfEntries);
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "ProducerCount", this.ProducerCount);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamArrayObj(map, prefix + "SubTopicSets.", this.SubTopicSets);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ProducerLimit", this.ProducerLimit);
        this.setParamSimple(map, prefix + "ConsumerLimit", this.ConsumerLimit);
        this.setParamSimple(map, prefix + "PulsarTopicType", this.PulsarTopicType);
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Tenant", this.Tenant);
        this.setParamSimple(map, prefix + "IsolateConsumerEnable", this.IsolateConsumerEnable);
        this.setParamSimple(map, prefix + "AckTimeOut", this.AckTimeOut);

    }
}

