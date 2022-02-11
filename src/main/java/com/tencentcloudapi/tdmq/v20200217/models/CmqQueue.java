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

public class CmqQueue extends AbstractModel{

    /**
    * Message queue ID.
    */
    @SerializedName("QueueId")
    @Expose
    private String QueueId;

    /**
    * Message queue name.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Limit of the number of messages produced per second. The value for consumed messages is 1.1 times this value.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * Bandwidth limit.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bps")
    @Expose
    private Long Bps;

    /**
    * Maximum retention period for inflight messages.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxDelaySeconds")
    @Expose
    private Long MaxDelaySeconds;

    /**
    * Maximum number of heaped messages. The value range is 1,000,000–10,000,000 during the beta test and can be 1,000,000–1,000,000,000 after the product is officially released. The default value is 10,000,000 during the beta test and will be 100,000,000 after the product is officially released.
    */
    @SerializedName("MaxMsgHeapNum")
    @Expose
    private Long MaxMsgHeapNum;

    /**
    * Long polling wait time for message reception. Value range: 0–30 seconds. Default value: 0.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PollingWaitSeconds")
    @Expose
    private Long PollingWaitSeconds;

    /**
    * Message retention period. Value range: 60–1296000 seconds (i.e., 1 minute–15 days). Default value: 345600 (i.e., 4 days).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgRetentionSeconds")
    @Expose
    private Long MsgRetentionSeconds;

    /**
    * Message visibility timeout period. Value range: 1–43200 seconds (i.e., 12 hours). Default value: 30.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VisibilityTimeout")
    @Expose
    private Long VisibilityTimeout;

    /**
    * Maximum message length. Value range: 1024–1048576 bytes (i.e., 1–1024 KB). Default value: 65536.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxMsgSize")
    @Expose
    private Long MaxMsgSize;

    /**
    * Maximum time range during which a message can be rewound in the queue, which ranges from 0 to 43,200 seconds. 0 indicates that message rewind is disabled.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RewindSeconds")
    @Expose
    private Long RewindSeconds;

    /**
    * Queue creation time. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Time when the queue attribute is last modified. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastModifyTime")
    @Expose
    private Long LastModifyTime;

    /**
    * Total number of messages in `Active` status (i.e., unconsumed) in the queue, which is an approximate value.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActiveMsgNum")
    @Expose
    private Long ActiveMsgNum;

    /**
    * Total number of messages in `Inactive` status (i.e., being consumed) in the queue, which is an approximate value.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InactiveMsgNum")
    @Expose
    private Long InactiveMsgNum;

    /**
    * Number of delayed messages.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DelayMsgNum")
    @Expose
    private Long DelayMsgNum;

    /**
    * Number of retained messages which have been deleted by the `DelMsg` API but are still within their rewind time range.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RewindMsgNum")
    @Expose
    private Long RewindMsgNum;

    /**
    * Minimum unconsumed time of message in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinMsgTime")
    @Expose
    private Long MinMsgTime;

    /**
    * Transaction message queue. true: transaction message type; false: other message types.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Transaction")
    @Expose
    private Boolean Transaction;

    /**
    * Dead letter queue.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeadLetterSource")
    @Expose
    private CmqDeadLetterSource [] DeadLetterSource;

    /**
    * Dead letter queue policy.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeadLetterPolicy")
    @Expose
    private CmqDeadLetterPolicy DeadLetterPolicy;

    /**
    * Transaction message policy.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransactionPolicy")
    @Expose
    private CmqTransactionPolicy TransactionPolicy;

    /**
    * Creator `Uin`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * Associated tag.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Message trace. true: enabled; false: not enabled
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Trace")
    @Expose
    private Boolean Trace;

    /**
    * Tenant ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * Namespace name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The maximum number of unacknowledged messages.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxUnackedMsgNum")
    @Expose
    private Long MaxUnackedMsgNum;

    /**
    * Maximum size of heaped messages in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxMsgBacklogSize")
    @Expose
    private Long MaxMsgBacklogSize;

    /**
     * Get Message queue ID. 
     * @return QueueId Message queue ID.
     */
    public String getQueueId() {
        return this.QueueId;
    }

    /**
     * Set Message queue ID.
     * @param QueueId Message queue ID.
     */
    public void setQueueId(String QueueId) {
        this.QueueId = QueueId;
    }

    /**
     * Get Message queue name. 
     * @return QueueName Message queue name.
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set Message queue name.
     * @param QueueName Message queue name.
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get Limit of the number of messages produced per second. The value for consumed messages is 1.1 times this value.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Qps Limit of the number of messages produced per second. The value for consumed messages is 1.1 times this value.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Limit of the number of messages produced per second. The value for consumed messages is 1.1 times this value.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Qps Limit of the number of messages produced per second. The value for consumed messages is 1.1 times this value.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get Bandwidth limit.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Bps Bandwidth limit.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getBps() {
        return this.Bps;
    }

    /**
     * Set Bandwidth limit.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Bps Bandwidth limit.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBps(Long Bps) {
        this.Bps = Bps;
    }

    /**
     * Get Maximum retention period for inflight messages.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxDelaySeconds Maximum retention period for inflight messages.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxDelaySeconds() {
        return this.MaxDelaySeconds;
    }

    /**
     * Set Maximum retention period for inflight messages.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxDelaySeconds Maximum retention period for inflight messages.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxDelaySeconds(Long MaxDelaySeconds) {
        this.MaxDelaySeconds = MaxDelaySeconds;
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
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PollingWaitSeconds Long polling wait time for message reception. Value range: 0–30 seconds. Default value: 0.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPollingWaitSeconds() {
        return this.PollingWaitSeconds;
    }

    /**
     * Set Long polling wait time for message reception. Value range: 0–30 seconds. Default value: 0.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PollingWaitSeconds Long polling wait time for message reception. Value range: 0–30 seconds. Default value: 0.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPollingWaitSeconds(Long PollingWaitSeconds) {
        this.PollingWaitSeconds = PollingWaitSeconds;
    }

    /**
     * Get Message retention period. Value range: 60–1296000 seconds (i.e., 1 minute–15 days). Default value: 345600 (i.e., 4 days).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MsgRetentionSeconds Message retention period. Value range: 60–1296000 seconds (i.e., 1 minute–15 days). Default value: 345600 (i.e., 4 days).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMsgRetentionSeconds() {
        return this.MsgRetentionSeconds;
    }

    /**
     * Set Message retention period. Value range: 60–1296000 seconds (i.e., 1 minute–15 days). Default value: 345600 (i.e., 4 days).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MsgRetentionSeconds Message retention period. Value range: 60–1296000 seconds (i.e., 1 minute–15 days). Default value: 345600 (i.e., 4 days).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgRetentionSeconds(Long MsgRetentionSeconds) {
        this.MsgRetentionSeconds = MsgRetentionSeconds;
    }

    /**
     * Get Message visibility timeout period. Value range: 1–43200 seconds (i.e., 12 hours). Default value: 30.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VisibilityTimeout Message visibility timeout period. Value range: 1–43200 seconds (i.e., 12 hours). Default value: 30.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getVisibilityTimeout() {
        return this.VisibilityTimeout;
    }

    /**
     * Set Message visibility timeout period. Value range: 1–43200 seconds (i.e., 12 hours). Default value: 30.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VisibilityTimeout Message visibility timeout period. Value range: 1–43200 seconds (i.e., 12 hours). Default value: 30.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVisibilityTimeout(Long VisibilityTimeout) {
        this.VisibilityTimeout = VisibilityTimeout;
    }

    /**
     * Get Maximum message length. Value range: 1024–1048576 bytes (i.e., 1–1024 KB). Default value: 65536.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxMsgSize Maximum message length. Value range: 1024–1048576 bytes (i.e., 1–1024 KB). Default value: 65536.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxMsgSize() {
        return this.MaxMsgSize;
    }

    /**
     * Set Maximum message length. Value range: 1024–1048576 bytes (i.e., 1–1024 KB). Default value: 65536.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxMsgSize Maximum message length. Value range: 1024–1048576 bytes (i.e., 1–1024 KB). Default value: 65536.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxMsgSize(Long MaxMsgSize) {
        this.MaxMsgSize = MaxMsgSize;
    }

    /**
     * Get Maximum time range during which a message can be rewound in the queue, which ranges from 0 to 43,200 seconds. 0 indicates that message rewind is disabled.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RewindSeconds Maximum time range during which a message can be rewound in the queue, which ranges from 0 to 43,200 seconds. 0 indicates that message rewind is disabled.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRewindSeconds() {
        return this.RewindSeconds;
    }

    /**
     * Set Maximum time range during which a message can be rewound in the queue, which ranges from 0 to 43,200 seconds. 0 indicates that message rewind is disabled.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RewindSeconds Maximum time range during which a message can be rewound in the queue, which ranges from 0 to 43,200 seconds. 0 indicates that message rewind is disabled.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRewindSeconds(Long RewindSeconds) {
        this.RewindSeconds = RewindSeconds;
    }

    /**
     * Get Queue creation time. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Queue creation time. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Queue creation time. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Queue creation time. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Time when the queue attribute is last modified. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastModifyTime Time when the queue attribute is last modified. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set Time when the queue attribute is last modified. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastModifyTime Time when the queue attribute is last modified. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastModifyTime(Long LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    /**
     * Get Total number of messages in `Active` status (i.e., unconsumed) in the queue, which is an approximate value.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ActiveMsgNum Total number of messages in `Active` status (i.e., unconsumed) in the queue, which is an approximate value.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getActiveMsgNum() {
        return this.ActiveMsgNum;
    }

    /**
     * Set Total number of messages in `Active` status (i.e., unconsumed) in the queue, which is an approximate value.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ActiveMsgNum Total number of messages in `Active` status (i.e., unconsumed) in the queue, which is an approximate value.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setActiveMsgNum(Long ActiveMsgNum) {
        this.ActiveMsgNum = ActiveMsgNum;
    }

    /**
     * Get Total number of messages in `Inactive` status (i.e., being consumed) in the queue, which is an approximate value.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InactiveMsgNum Total number of messages in `Inactive` status (i.e., being consumed) in the queue, which is an approximate value.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getInactiveMsgNum() {
        return this.InactiveMsgNum;
    }

    /**
     * Set Total number of messages in `Inactive` status (i.e., being consumed) in the queue, which is an approximate value.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InactiveMsgNum Total number of messages in `Inactive` status (i.e., being consumed) in the queue, which is an approximate value.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInactiveMsgNum(Long InactiveMsgNum) {
        this.InactiveMsgNum = InactiveMsgNum;
    }

    /**
     * Get Number of delayed messages.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DelayMsgNum Number of delayed messages.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDelayMsgNum() {
        return this.DelayMsgNum;
    }

    /**
     * Set Number of delayed messages.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DelayMsgNum Number of delayed messages.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDelayMsgNum(Long DelayMsgNum) {
        this.DelayMsgNum = DelayMsgNum;
    }

    /**
     * Get Number of retained messages which have been deleted by the `DelMsg` API but are still within their rewind time range.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RewindMsgNum Number of retained messages which have been deleted by the `DelMsg` API but are still within their rewind time range.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRewindMsgNum() {
        return this.RewindMsgNum;
    }

    /**
     * Set Number of retained messages which have been deleted by the `DelMsg` API but are still within their rewind time range.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RewindMsgNum Number of retained messages which have been deleted by the `DelMsg` API but are still within their rewind time range.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRewindMsgNum(Long RewindMsgNum) {
        this.RewindMsgNum = RewindMsgNum;
    }

    /**
     * Get Minimum unconsumed time of message in seconds.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MinMsgTime Minimum unconsumed time of message in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMinMsgTime() {
        return this.MinMsgTime;
    }

    /**
     * Set Minimum unconsumed time of message in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MinMsgTime Minimum unconsumed time of message in seconds.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMinMsgTime(Long MinMsgTime) {
        this.MinMsgTime = MinMsgTime;
    }

    /**
     * Get Transaction message queue. true: transaction message type; false: other message types.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Transaction Transaction message queue. true: transaction message type; false: other message types.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getTransaction() {
        return this.Transaction;
    }

    /**
     * Set Transaction message queue. true: transaction message type; false: other message types.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Transaction Transaction message queue. true: transaction message type; false: other message types.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTransaction(Boolean Transaction) {
        this.Transaction = Transaction;
    }

    /**
     * Get Dead letter queue.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DeadLetterSource Dead letter queue.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CmqDeadLetterSource [] getDeadLetterSource() {
        return this.DeadLetterSource;
    }

    /**
     * Set Dead letter queue.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DeadLetterSource Dead letter queue.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeadLetterSource(CmqDeadLetterSource [] DeadLetterSource) {
        this.DeadLetterSource = DeadLetterSource;
    }

    /**
     * Get Dead letter queue policy.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DeadLetterPolicy Dead letter queue policy.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CmqDeadLetterPolicy getDeadLetterPolicy() {
        return this.DeadLetterPolicy;
    }

    /**
     * Set Dead letter queue policy.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DeadLetterPolicy Dead letter queue policy.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeadLetterPolicy(CmqDeadLetterPolicy DeadLetterPolicy) {
        this.DeadLetterPolicy = DeadLetterPolicy;
    }

    /**
     * Get Transaction message policy.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TransactionPolicy Transaction message policy.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CmqTransactionPolicy getTransactionPolicy() {
        return this.TransactionPolicy;
    }

    /**
     * Set Transaction message policy.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TransactionPolicy Transaction message policy.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTransactionPolicy(CmqTransactionPolicy TransactionPolicy) {
        this.TransactionPolicy = TransactionPolicy;
    }

    /**
     * Get Creator `Uin`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateUin Creator `Uin`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set Creator `Uin`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateUin Creator `Uin`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get Associated tag.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tags Associated tag.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Associated tag.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tags Associated tag.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Message trace. true: enabled; false: not enabled
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Trace Message trace. true: enabled; false: not enabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getTrace() {
        return this.Trace;
    }

    /**
     * Set Message trace. true: enabled; false: not enabled
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Trace Message trace. true: enabled; false: not enabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTrace(Boolean Trace) {
        this.Trace = Trace;
    }

    /**
     * Get Tenant ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TenantId Tenant ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set Tenant ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TenantId Tenant ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get Namespace name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NamespaceName Namespace name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set Namespace name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NamespaceName Namespace name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Status Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Status Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The maximum number of unacknowledged messages.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MaxUnackedMsgNum The maximum number of unacknowledged messages.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMaxUnackedMsgNum() {
        return this.MaxUnackedMsgNum;
    }

    /**
     * Set The maximum number of unacknowledged messages.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MaxUnackedMsgNum The maximum number of unacknowledged messages.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMaxUnackedMsgNum(Long MaxUnackedMsgNum) {
        this.MaxUnackedMsgNum = MaxUnackedMsgNum;
    }

    /**
     * Get Maximum size of heaped messages in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MaxMsgBacklogSize Maximum size of heaped messages in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMaxMsgBacklogSize() {
        return this.MaxMsgBacklogSize;
    }

    /**
     * Set Maximum size of heaped messages in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MaxMsgBacklogSize Maximum size of heaped messages in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMaxMsgBacklogSize(Long MaxMsgBacklogSize) {
        this.MaxMsgBacklogSize = MaxMsgBacklogSize;
    }

    public CmqQueue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CmqQueue(CmqQueue source) {
        if (source.QueueId != null) {
            this.QueueId = new String(source.QueueId);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.Bps != null) {
            this.Bps = new Long(source.Bps);
        }
        if (source.MaxDelaySeconds != null) {
            this.MaxDelaySeconds = new Long(source.MaxDelaySeconds);
        }
        if (source.MaxMsgHeapNum != null) {
            this.MaxMsgHeapNum = new Long(source.MaxMsgHeapNum);
        }
        if (source.PollingWaitSeconds != null) {
            this.PollingWaitSeconds = new Long(source.PollingWaitSeconds);
        }
        if (source.MsgRetentionSeconds != null) {
            this.MsgRetentionSeconds = new Long(source.MsgRetentionSeconds);
        }
        if (source.VisibilityTimeout != null) {
            this.VisibilityTimeout = new Long(source.VisibilityTimeout);
        }
        if (source.MaxMsgSize != null) {
            this.MaxMsgSize = new Long(source.MaxMsgSize);
        }
        if (source.RewindSeconds != null) {
            this.RewindSeconds = new Long(source.RewindSeconds);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.LastModifyTime != null) {
            this.LastModifyTime = new Long(source.LastModifyTime);
        }
        if (source.ActiveMsgNum != null) {
            this.ActiveMsgNum = new Long(source.ActiveMsgNum);
        }
        if (source.InactiveMsgNum != null) {
            this.InactiveMsgNum = new Long(source.InactiveMsgNum);
        }
        if (source.DelayMsgNum != null) {
            this.DelayMsgNum = new Long(source.DelayMsgNum);
        }
        if (source.RewindMsgNum != null) {
            this.RewindMsgNum = new Long(source.RewindMsgNum);
        }
        if (source.MinMsgTime != null) {
            this.MinMsgTime = new Long(source.MinMsgTime);
        }
        if (source.Transaction != null) {
            this.Transaction = new Boolean(source.Transaction);
        }
        if (source.DeadLetterSource != null) {
            this.DeadLetterSource = new CmqDeadLetterSource[source.DeadLetterSource.length];
            for (int i = 0; i < source.DeadLetterSource.length; i++) {
                this.DeadLetterSource[i] = new CmqDeadLetterSource(source.DeadLetterSource[i]);
            }
        }
        if (source.DeadLetterPolicy != null) {
            this.DeadLetterPolicy = new CmqDeadLetterPolicy(source.DeadLetterPolicy);
        }
        if (source.TransactionPolicy != null) {
            this.TransactionPolicy = new CmqTransactionPolicy(source.TransactionPolicy);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new Long(source.CreateUin);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Trace != null) {
            this.Trace = new Boolean(source.Trace);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MaxUnackedMsgNum != null) {
            this.MaxUnackedMsgNum = new Long(source.MaxUnackedMsgNum);
        }
        if (source.MaxMsgBacklogSize != null) {
            this.MaxMsgBacklogSize = new Long(source.MaxMsgBacklogSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueId", this.QueueId);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Bps", this.Bps);
        this.setParamSimple(map, prefix + "MaxDelaySeconds", this.MaxDelaySeconds);
        this.setParamSimple(map, prefix + "MaxMsgHeapNum", this.MaxMsgHeapNum);
        this.setParamSimple(map, prefix + "PollingWaitSeconds", this.PollingWaitSeconds);
        this.setParamSimple(map, prefix + "MsgRetentionSeconds", this.MsgRetentionSeconds);
        this.setParamSimple(map, prefix + "VisibilityTimeout", this.VisibilityTimeout);
        this.setParamSimple(map, prefix + "MaxMsgSize", this.MaxMsgSize);
        this.setParamSimple(map, prefix + "RewindSeconds", this.RewindSeconds);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastModifyTime", this.LastModifyTime);
        this.setParamSimple(map, prefix + "ActiveMsgNum", this.ActiveMsgNum);
        this.setParamSimple(map, prefix + "InactiveMsgNum", this.InactiveMsgNum);
        this.setParamSimple(map, prefix + "DelayMsgNum", this.DelayMsgNum);
        this.setParamSimple(map, prefix + "RewindMsgNum", this.RewindMsgNum);
        this.setParamSimple(map, prefix + "MinMsgTime", this.MinMsgTime);
        this.setParamSimple(map, prefix + "Transaction", this.Transaction);
        this.setParamArrayObj(map, prefix + "DeadLetterSource.", this.DeadLetterSource);
        this.setParamObj(map, prefix + "DeadLetterPolicy.", this.DeadLetterPolicy);
        this.setParamObj(map, prefix + "TransactionPolicy.", this.TransactionPolicy);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Trace", this.Trace);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MaxUnackedMsgNum", this.MaxUnackedMsgNum);
        this.setParamSimple(map, prefix + "MaxMsgBacklogSize", this.MaxMsgBacklogSize);

    }
}

