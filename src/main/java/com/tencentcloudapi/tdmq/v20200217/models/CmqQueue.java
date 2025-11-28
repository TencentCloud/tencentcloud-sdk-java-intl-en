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

public class CmqQueue extends AbstractModel {

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
    * Limit on the number of messages produced per second. The size of consumed messages is 1.1 times this value.
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * Bandwidth limit.
    */
    @SerializedName("Bps")
    @Expose
    private Long Bps;

    /**
    * Specifies the maximum retention time for in-flight messages, which must be less than the message retention period.
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
    * Long polling waiting time for message receipt. Value range 0-30 seconds, default value 0.
    */
    @SerializedName("PollingWaitSeconds")
    @Expose
    private Long PollingWaitSeconds;

    /**
    * Message retention period. The value range is 60-1,296,000 seconds (1 min-15 days), with a default value of 345,600 seconds (4 days).
    */
    @SerializedName("MsgRetentionSeconds")
    @Expose
    private Long MsgRetentionSeconds;

    /**
    * Message visibility timeout period. The value range is 1-43,200 seconds (within 12 hours), with a default value of 30.
    */
    @SerializedName("VisibilityTimeout")
    @Expose
    private Long VisibilityTimeout;

    /**
    * Maximum message length. Range: 1,024-1,048,576 bytes (i.e., 1K-1,024K). Default value is 65,536.
    */
    @SerializedName("MaxMsgSize")
    @Expose
    private Long MaxMsgSize;

    /**
    * Maximum message backtracking time for backtracking queues, range 0-43,200 seconds. 0 means message backtracking is not enabled.
    */
    @SerializedName("RewindSeconds")
    @Expose
    private Long RewindSeconds;

    /**
    * Creation time of queues. Returns a Unix timestamp, accurate to milliseconds.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * The last time the queue attribute was modified. Returns a Unix timestamp, accurate to milliseconds.
    */
    @SerializedName("LastModifyTime")
    @Expose
    private Long LastModifyTime;

    /**
    * Total number of active messages (not being consumed) in queue, an approximate value.
    */
    @SerializedName("ActiveMsgNum")
    @Expose
    private Long ActiveMsgNum;

    /**
    * Total number of inactive messages (being consumed) in queue, an approximate value.
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
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * Specifies the namespace name.
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * Cluster status. 0: Creating, 1: Normal, 2: Deleting, 3: Deleted, 4: Isolating, 5: Creation failed, 6: Deletion failed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Maximum Number of Unacknowledged Messages
    */
    @SerializedName("MaxUnackedMsgNum")
    @Expose
    private Long MaxUnackedMsgNum;

    /**
    * Maximum Message Backlog Size (bytes)
    */
    @SerializedName("MaxMsgBacklogSize")
    @Expose
    private Long MaxMsgBacklogSize;

    /**
    * Queue retrospective storage space. Value range: 1024 MB to 10240 MB. 0 indicates disabled.
    */
    @SerializedName("RetentionSizeInMB")
    @Expose
    private Long RetentionSizeInMB;

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
     * Get Limit on the number of messages produced per second. The size of consumed messages is 1.1 times this value. 
     * @return Qps Limit on the number of messages produced per second. The size of consumed messages is 1.1 times this value.
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Limit on the number of messages produced per second. The size of consumed messages is 1.1 times this value.
     * @param Qps Limit on the number of messages produced per second. The size of consumed messages is 1.1 times this value.
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get Bandwidth limit. 
     * @return Bps Bandwidth limit.
     */
    public Long getBps() {
        return this.Bps;
    }

    /**
     * Set Bandwidth limit.
     * @param Bps Bandwidth limit.
     */
    public void setBps(Long Bps) {
        this.Bps = Bps;
    }

    /**
     * Get Specifies the maximum retention time for in-flight messages, which must be less than the message retention period. 
     * @return MaxDelaySeconds Specifies the maximum retention time for in-flight messages, which must be less than the message retention period.
     */
    public Long getMaxDelaySeconds() {
        return this.MaxDelaySeconds;
    }

    /**
     * Set Specifies the maximum retention time for in-flight messages, which must be less than the message retention period.
     * @param MaxDelaySeconds Specifies the maximum retention time for in-flight messages, which must be less than the message retention period.
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
     * Get Long polling waiting time for message receipt. Value range 0-30 seconds, default value 0. 
     * @return PollingWaitSeconds Long polling waiting time for message receipt. Value range 0-30 seconds, default value 0.
     */
    public Long getPollingWaitSeconds() {
        return this.PollingWaitSeconds;
    }

    /**
     * Set Long polling waiting time for message receipt. Value range 0-30 seconds, default value 0.
     * @param PollingWaitSeconds Long polling waiting time for message receipt. Value range 0-30 seconds, default value 0.
     */
    public void setPollingWaitSeconds(Long PollingWaitSeconds) {
        this.PollingWaitSeconds = PollingWaitSeconds;
    }

    /**
     * Get Message retention period. The value range is 60-1,296,000 seconds (1 min-15 days), with a default value of 345,600 seconds (4 days). 
     * @return MsgRetentionSeconds Message retention period. The value range is 60-1,296,000 seconds (1 min-15 days), with a default value of 345,600 seconds (4 days).
     */
    public Long getMsgRetentionSeconds() {
        return this.MsgRetentionSeconds;
    }

    /**
     * Set Message retention period. The value range is 60-1,296,000 seconds (1 min-15 days), with a default value of 345,600 seconds (4 days).
     * @param MsgRetentionSeconds Message retention period. The value range is 60-1,296,000 seconds (1 min-15 days), with a default value of 345,600 seconds (4 days).
     */
    public void setMsgRetentionSeconds(Long MsgRetentionSeconds) {
        this.MsgRetentionSeconds = MsgRetentionSeconds;
    }

    /**
     * Get Message visibility timeout period. The value range is 1-43,200 seconds (within 12 hours), with a default value of 30. 
     * @return VisibilityTimeout Message visibility timeout period. The value range is 1-43,200 seconds (within 12 hours), with a default value of 30.
     */
    public Long getVisibilityTimeout() {
        return this.VisibilityTimeout;
    }

    /**
     * Set Message visibility timeout period. The value range is 1-43,200 seconds (within 12 hours), with a default value of 30.
     * @param VisibilityTimeout Message visibility timeout period. The value range is 1-43,200 seconds (within 12 hours), with a default value of 30.
     */
    public void setVisibilityTimeout(Long VisibilityTimeout) {
        this.VisibilityTimeout = VisibilityTimeout;
    }

    /**
     * Get Maximum message length. Range: 1,024-1,048,576 bytes (i.e., 1K-1,024K). Default value is 65,536. 
     * @return MaxMsgSize Maximum message length. Range: 1,024-1,048,576 bytes (i.e., 1K-1,024K). Default value is 65,536.
     */
    public Long getMaxMsgSize() {
        return this.MaxMsgSize;
    }

    /**
     * Set Maximum message length. Range: 1,024-1,048,576 bytes (i.e., 1K-1,024K). Default value is 65,536.
     * @param MaxMsgSize Maximum message length. Range: 1,024-1,048,576 bytes (i.e., 1K-1,024K). Default value is 65,536.
     */
    public void setMaxMsgSize(Long MaxMsgSize) {
        this.MaxMsgSize = MaxMsgSize;
    }

    /**
     * Get Maximum message backtracking time for backtracking queues, range 0-43,200 seconds. 0 means message backtracking is not enabled. 
     * @return RewindSeconds Maximum message backtracking time for backtracking queues, range 0-43,200 seconds. 0 means message backtracking is not enabled.
     */
    public Long getRewindSeconds() {
        return this.RewindSeconds;
    }

    /**
     * Set Maximum message backtracking time for backtracking queues, range 0-43,200 seconds. 0 means message backtracking is not enabled.
     * @param RewindSeconds Maximum message backtracking time for backtracking queues, range 0-43,200 seconds. 0 means message backtracking is not enabled.
     */
    public void setRewindSeconds(Long RewindSeconds) {
        this.RewindSeconds = RewindSeconds;
    }

    /**
     * Get Creation time of queues. Returns a Unix timestamp, accurate to milliseconds. 
     * @return CreateTime Creation time of queues. Returns a Unix timestamp, accurate to milliseconds.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of queues. Returns a Unix timestamp, accurate to milliseconds.
     * @param CreateTime Creation time of queues. Returns a Unix timestamp, accurate to milliseconds.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The last time the queue attribute was modified. Returns a Unix timestamp, accurate to milliseconds. 
     * @return LastModifyTime The last time the queue attribute was modified. Returns a Unix timestamp, accurate to milliseconds.
     */
    public Long getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set The last time the queue attribute was modified. Returns a Unix timestamp, accurate to milliseconds.
     * @param LastModifyTime The last time the queue attribute was modified. Returns a Unix timestamp, accurate to milliseconds.
     */
    public void setLastModifyTime(Long LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    /**
     * Get Total number of active messages (not being consumed) in queue, an approximate value. 
     * @return ActiveMsgNum Total number of active messages (not being consumed) in queue, an approximate value.
     */
    public Long getActiveMsgNum() {
        return this.ActiveMsgNum;
    }

    /**
     * Set Total number of active messages (not being consumed) in queue, an approximate value.
     * @param ActiveMsgNum Total number of active messages (not being consumed) in queue, an approximate value.
     */
    public void setActiveMsgNum(Long ActiveMsgNum) {
        this.ActiveMsgNum = ActiveMsgNum;
    }

    /**
     * Get Total number of inactive messages (being consumed) in queue, an approximate value. 
     * @return InactiveMsgNum Total number of inactive messages (being consumed) in queue, an approximate value.
     */
    public Long getInactiveMsgNum() {
        return this.InactiveMsgNum;
    }

    /**
     * Set Total number of inactive messages (being consumed) in queue, an approximate value.
     * @param InactiveMsgNum Total number of inactive messages (being consumed) in queue, an approximate value.
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
     * @return TenantId Tenant ID
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set Tenant ID
     * @param TenantId Tenant ID
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get Specifies the namespace name. 
     * @return NamespaceName Specifies the namespace name.
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set Specifies the namespace name.
     * @param NamespaceName Specifies the namespace name.
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get Cluster status. 0: Creating, 1: Normal, 2: Deleting, 3: Deleted, 4: Isolating, 5: Creation failed, 6: Deletion failed 
     * @return Status Cluster status. 0: Creating, 1: Normal, 2: Deleting, 3: Deleted, 4: Isolating, 5: Creation failed, 6: Deletion failed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Cluster status. 0: Creating, 1: Normal, 2: Deleting, 3: Deleted, 4: Isolating, 5: Creation failed, 6: Deletion failed
     * @param Status Cluster status. 0: Creating, 1: Normal, 2: Deleting, 3: Deleted, 4: Isolating, 5: Creation failed, 6: Deletion failed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Maximum Number of Unacknowledged Messages 
     * @return MaxUnackedMsgNum Maximum Number of Unacknowledged Messages
     */
    public Long getMaxUnackedMsgNum() {
        return this.MaxUnackedMsgNum;
    }

    /**
     * Set Maximum Number of Unacknowledged Messages
     * @param MaxUnackedMsgNum Maximum Number of Unacknowledged Messages
     */
    public void setMaxUnackedMsgNum(Long MaxUnackedMsgNum) {
        this.MaxUnackedMsgNum = MaxUnackedMsgNum;
    }

    /**
     * Get Maximum Message Backlog Size (bytes) 
     * @return MaxMsgBacklogSize Maximum Message Backlog Size (bytes)
     */
    public Long getMaxMsgBacklogSize() {
        return this.MaxMsgBacklogSize;
    }

    /**
     * Set Maximum Message Backlog Size (bytes)
     * @param MaxMsgBacklogSize Maximum Message Backlog Size (bytes)
     */
    public void setMaxMsgBacklogSize(Long MaxMsgBacklogSize) {
        this.MaxMsgBacklogSize = MaxMsgBacklogSize;
    }

    /**
     * Get Queue retrospective storage space. Value range: 1024 MB to 10240 MB. 0 indicates disabled. 
     * @return RetentionSizeInMB Queue retrospective storage space. Value range: 1024 MB to 10240 MB. 0 indicates disabled.
     */
    public Long getRetentionSizeInMB() {
        return this.RetentionSizeInMB;
    }

    /**
     * Set Queue retrospective storage space. Value range: 1024 MB to 10240 MB. 0 indicates disabled.
     * @param RetentionSizeInMB Queue retrospective storage space. Value range: 1024 MB to 10240 MB. 0 indicates disabled.
     */
    public void setRetentionSizeInMB(Long RetentionSizeInMB) {
        this.RetentionSizeInMB = RetentionSizeInMB;
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
        if (source.RetentionSizeInMB != null) {
            this.RetentionSizeInMB = new Long(source.RetentionSizeInMB);
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
        this.setParamSimple(map, prefix + "RetentionSizeInMB", this.RetentionSizeInMB);

    }
}

