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

public class QueueSet extends AbstractModel {

    /**
    * QueueId
    */
    @SerializedName("QueueId")
    @Expose
    private String QueueId;

    /**
    * QueueName
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Qps
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * Bps
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bps")
    @Expose
    private Long Bps;

    /**
    * MaxDelaySeconds
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxDelaySeconds")
    @Expose
    private Long MaxDelaySeconds;

    /**
    * MaxMsgHeapNum
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxMsgHeapNum")
    @Expose
    private Long MaxMsgHeapNum;

    /**
    * PollingWaitSeconds
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PollingWaitSeconds")
    @Expose
    private Long PollingWaitSeconds;

    /**
    * MsgRetentionSeconds
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgRetentionSeconds")
    @Expose
    private Long MsgRetentionSeconds;

    /**
    * VisibilityTimeout
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VisibilityTimeout")
    @Expose
    private Long VisibilityTimeout;

    /**
    * MaxMsgSize
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxMsgSize")
    @Expose
    private Long MaxMsgSize;

    /**
    * RewindSeconds
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RewindSeconds")
    @Expose
    private Long RewindSeconds;

    /**
    * CreateTime
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * LastModifyTime
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastModifyTime")
    @Expose
    private Long LastModifyTime;

    /**
    * ActiveMsgNum
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActiveMsgNum")
    @Expose
    private Long ActiveMsgNum;

    /**
    * InactiveMsgNum
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InactiveMsgNum")
    @Expose
    private Long InactiveMsgNum;

    /**
    * DelayMsgNum
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DelayMsgNum")
    @Expose
    private Long DelayMsgNum;

    /**
    * RewindMsgNum
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RewindMsgNum")
    @Expose
    private Long RewindMsgNum;

    /**
    * MinMsgTime
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinMsgTime")
    @Expose
    private Long MinMsgTime;

    /**
    * Transaction
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Transaction")
    @Expose
    private Boolean Transaction;

    /**
    * DeadLetterSource
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeadLetterSource")
    @Expose
    private DeadLetterSource [] DeadLetterSource;

    /**
    * DeadLetterPolicy
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeadLetterPolicy")
    @Expose
    private DeadLetterPolicy DeadLetterPolicy;

    /**
    * TransactionPolicy
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransactionPolicy")
    @Expose
    private TransactionPolicy TransactionPolicy;

    /**
    * Creator `uin`
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * Tag
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Message trace flag. true: enabled, false: not enabled
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Trace")
    @Expose
    private Boolean Trace;

    /**
     * Get QueueId 
     * @return QueueId QueueId
     */
    public String getQueueId() {
        return this.QueueId;
    }

    /**
     * Set QueueId
     * @param QueueId QueueId
     */
    public void setQueueId(String QueueId) {
        this.QueueId = QueueId;
    }

    /**
     * Get QueueName 
     * @return QueueName QueueName
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set QueueName
     * @param QueueName QueueName
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get Qps
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Qps Qps
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Qps
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Qps Qps
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get Bps
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Bps Bps
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getBps() {
        return this.Bps;
    }

    /**
     * Set Bps
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Bps Bps
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBps(Long Bps) {
        this.Bps = Bps;
    }

    /**
     * Get MaxDelaySeconds
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxDelaySeconds MaxDelaySeconds
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxDelaySeconds() {
        return this.MaxDelaySeconds;
    }

    /**
     * Set MaxDelaySeconds
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxDelaySeconds MaxDelaySeconds
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxDelaySeconds(Long MaxDelaySeconds) {
        this.MaxDelaySeconds = MaxDelaySeconds;
    }

    /**
     * Get MaxMsgHeapNum
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxMsgHeapNum MaxMsgHeapNum
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxMsgHeapNum() {
        return this.MaxMsgHeapNum;
    }

    /**
     * Set MaxMsgHeapNum
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxMsgHeapNum MaxMsgHeapNum
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxMsgHeapNum(Long MaxMsgHeapNum) {
        this.MaxMsgHeapNum = MaxMsgHeapNum;
    }

    /**
     * Get PollingWaitSeconds
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PollingWaitSeconds PollingWaitSeconds
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPollingWaitSeconds() {
        return this.PollingWaitSeconds;
    }

    /**
     * Set PollingWaitSeconds
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PollingWaitSeconds PollingWaitSeconds
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPollingWaitSeconds(Long PollingWaitSeconds) {
        this.PollingWaitSeconds = PollingWaitSeconds;
    }

    /**
     * Get MsgRetentionSeconds
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MsgRetentionSeconds MsgRetentionSeconds
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMsgRetentionSeconds() {
        return this.MsgRetentionSeconds;
    }

    /**
     * Set MsgRetentionSeconds
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MsgRetentionSeconds MsgRetentionSeconds
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgRetentionSeconds(Long MsgRetentionSeconds) {
        this.MsgRetentionSeconds = MsgRetentionSeconds;
    }

    /**
     * Get VisibilityTimeout
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VisibilityTimeout VisibilityTimeout
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getVisibilityTimeout() {
        return this.VisibilityTimeout;
    }

    /**
     * Set VisibilityTimeout
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VisibilityTimeout VisibilityTimeout
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVisibilityTimeout(Long VisibilityTimeout) {
        this.VisibilityTimeout = VisibilityTimeout;
    }

    /**
     * Get MaxMsgSize
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxMsgSize MaxMsgSize
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxMsgSize() {
        return this.MaxMsgSize;
    }

    /**
     * Set MaxMsgSize
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxMsgSize MaxMsgSize
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxMsgSize(Long MaxMsgSize) {
        this.MaxMsgSize = MaxMsgSize;
    }

    /**
     * Get RewindSeconds
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RewindSeconds RewindSeconds
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRewindSeconds() {
        return this.RewindSeconds;
    }

    /**
     * Set RewindSeconds
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RewindSeconds RewindSeconds
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRewindSeconds(Long RewindSeconds) {
        this.RewindSeconds = RewindSeconds;
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
     * Get ActiveMsgNum
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ActiveMsgNum ActiveMsgNum
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getActiveMsgNum() {
        return this.ActiveMsgNum;
    }

    /**
     * Set ActiveMsgNum
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ActiveMsgNum ActiveMsgNum
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setActiveMsgNum(Long ActiveMsgNum) {
        this.ActiveMsgNum = ActiveMsgNum;
    }

    /**
     * Get InactiveMsgNum
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InactiveMsgNum InactiveMsgNum
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getInactiveMsgNum() {
        return this.InactiveMsgNum;
    }

    /**
     * Set InactiveMsgNum
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InactiveMsgNum InactiveMsgNum
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInactiveMsgNum(Long InactiveMsgNum) {
        this.InactiveMsgNum = InactiveMsgNum;
    }

    /**
     * Get DelayMsgNum
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DelayMsgNum DelayMsgNum
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDelayMsgNum() {
        return this.DelayMsgNum;
    }

    /**
     * Set DelayMsgNum
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DelayMsgNum DelayMsgNum
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDelayMsgNum(Long DelayMsgNum) {
        this.DelayMsgNum = DelayMsgNum;
    }

    /**
     * Get RewindMsgNum
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RewindMsgNum RewindMsgNum
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRewindMsgNum() {
        return this.RewindMsgNum;
    }

    /**
     * Set RewindMsgNum
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RewindMsgNum RewindMsgNum
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRewindMsgNum(Long RewindMsgNum) {
        this.RewindMsgNum = RewindMsgNum;
    }

    /**
     * Get MinMsgTime
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MinMsgTime MinMsgTime
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMinMsgTime() {
        return this.MinMsgTime;
    }

    /**
     * Set MinMsgTime
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MinMsgTime MinMsgTime
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMinMsgTime(Long MinMsgTime) {
        this.MinMsgTime = MinMsgTime;
    }

    /**
     * Get Transaction
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Transaction Transaction
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getTransaction() {
        return this.Transaction;
    }

    /**
     * Set Transaction
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Transaction Transaction
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTransaction(Boolean Transaction) {
        this.Transaction = Transaction;
    }

    /**
     * Get DeadLetterSource
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DeadLetterSource DeadLetterSource
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DeadLetterSource [] getDeadLetterSource() {
        return this.DeadLetterSource;
    }

    /**
     * Set DeadLetterSource
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DeadLetterSource DeadLetterSource
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeadLetterSource(DeadLetterSource [] DeadLetterSource) {
        this.DeadLetterSource = DeadLetterSource;
    }

    /**
     * Get DeadLetterPolicy
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DeadLetterPolicy DeadLetterPolicy
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DeadLetterPolicy getDeadLetterPolicy() {
        return this.DeadLetterPolicy;
    }

    /**
     * Set DeadLetterPolicy
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DeadLetterPolicy DeadLetterPolicy
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeadLetterPolicy(DeadLetterPolicy DeadLetterPolicy) {
        this.DeadLetterPolicy = DeadLetterPolicy;
    }

    /**
     * Get TransactionPolicy
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TransactionPolicy TransactionPolicy
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TransactionPolicy getTransactionPolicy() {
        return this.TransactionPolicy;
    }

    /**
     * Set TransactionPolicy
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TransactionPolicy TransactionPolicy
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTransactionPolicy(TransactionPolicy TransactionPolicy) {
        this.TransactionPolicy = TransactionPolicy;
    }

    /**
     * Get Creator `uin`
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateUin Creator `uin`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set Creator `uin`
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateUin Creator `uin`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get Tag
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Message trace flag. true: enabled, false: not enabled
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Trace Message trace flag. true: enabled, false: not enabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getTrace() {
        return this.Trace;
    }

    /**
     * Set Message trace flag. true: enabled, false: not enabled
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Trace Message trace flag. true: enabled, false: not enabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTrace(Boolean Trace) {
        this.Trace = Trace;
    }

    public QueueSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueueSet(QueueSet source) {
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
            this.DeadLetterSource = new DeadLetterSource[source.DeadLetterSource.length];
            for (int i = 0; i < source.DeadLetterSource.length; i++) {
                this.DeadLetterSource[i] = new DeadLetterSource(source.DeadLetterSource[i]);
            }
        }
        if (source.DeadLetterPolicy != null) {
            this.DeadLetterPolicy = new DeadLetterPolicy(source.DeadLetterPolicy);
        }
        if (source.TransactionPolicy != null) {
            this.TransactionPolicy = new TransactionPolicy(source.TransactionPolicy);
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

    }
}

