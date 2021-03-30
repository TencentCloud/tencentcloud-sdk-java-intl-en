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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicDetail extends AbstractModel{

    /**
    * Topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Number of partitions
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * Number of replicas
    */
    @SerializedName("ReplicaNum")
    @Expose
    private Long ReplicaNum;

    /**
    * Remarks
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Whether to enable IP authentication allowlist. true: yes, false: no
    */
    @SerializedName("EnableWhiteList")
    @Expose
    private Boolean EnableWhiteList;

    /**
    * Number of IPs in IP allowlist
    */
    @SerializedName("IpWhiteListCount")
    @Expose
    private Long IpWhiteListCount;

    /**
    * COS bucket for data backup: address of the destination COS bucket
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ForwardCosBucket")
    @Expose
    private String ForwardCosBucket;

    /**
    * Status of data backup to COS. 1: not enabled, 0: enabled
    */
    @SerializedName("ForwardStatus")
    @Expose
    private Long ForwardStatus;

    /**
    * Frequency of data backup to COS
    */
    @SerializedName("ForwardInterval")
    @Expose
    private Long ForwardInterval;

    /**
    * Advanced configuration
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Config")
    @Expose
    private Config Config;

    /**
    * Message retention time configuration (for recording the latest retention time)
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("RetentionTimeConfig")
    @Expose
    private TopicRetentionTimeConfigRsp RetentionTimeConfig;

    /**
     * Get Topic name 
     * @return TopicName Topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name
     * @param TopicName Topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Topic ID 
     * @return TopicId Topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Topic ID
     * @param TopicId Topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Number of partitions 
     * @return PartitionNum Number of partitions
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set Number of partitions
     * @param PartitionNum Number of partitions
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get Number of replicas 
     * @return ReplicaNum Number of replicas
     */
    public Long getReplicaNum() {
        return this.ReplicaNum;
    }

    /**
     * Set Number of replicas
     * @param ReplicaNum Number of replicas
     */
    public void setReplicaNum(Long ReplicaNum) {
        this.ReplicaNum = ReplicaNum;
    }

    /**
     * Get Remarks
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Note Remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Remarks
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Note Remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Whether to enable IP authentication allowlist. true: yes, false: no 
     * @return EnableWhiteList Whether to enable IP authentication allowlist. true: yes, false: no
     */
    public Boolean getEnableWhiteList() {
        return this.EnableWhiteList;
    }

    /**
     * Set Whether to enable IP authentication allowlist. true: yes, false: no
     * @param EnableWhiteList Whether to enable IP authentication allowlist. true: yes, false: no
     */
    public void setEnableWhiteList(Boolean EnableWhiteList) {
        this.EnableWhiteList = EnableWhiteList;
    }

    /**
     * Get Number of IPs in IP allowlist 
     * @return IpWhiteListCount Number of IPs in IP allowlist
     */
    public Long getIpWhiteListCount() {
        return this.IpWhiteListCount;
    }

    /**
     * Set Number of IPs in IP allowlist
     * @param IpWhiteListCount Number of IPs in IP allowlist
     */
    public void setIpWhiteListCount(Long IpWhiteListCount) {
        this.IpWhiteListCount = IpWhiteListCount;
    }

    /**
     * Get COS bucket for data backup: address of the destination COS bucket
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ForwardCosBucket COS bucket for data backup: address of the destination COS bucket
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getForwardCosBucket() {
        return this.ForwardCosBucket;
    }

    /**
     * Set COS bucket for data backup: address of the destination COS bucket
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ForwardCosBucket COS bucket for data backup: address of the destination COS bucket
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setForwardCosBucket(String ForwardCosBucket) {
        this.ForwardCosBucket = ForwardCosBucket;
    }

    /**
     * Get Status of data backup to COS. 1: not enabled, 0: enabled 
     * @return ForwardStatus Status of data backup to COS. 1: not enabled, 0: enabled
     */
    public Long getForwardStatus() {
        return this.ForwardStatus;
    }

    /**
     * Set Status of data backup to COS. 1: not enabled, 0: enabled
     * @param ForwardStatus Status of data backup to COS. 1: not enabled, 0: enabled
     */
    public void setForwardStatus(Long ForwardStatus) {
        this.ForwardStatus = ForwardStatus;
    }

    /**
     * Get Frequency of data backup to COS 
     * @return ForwardInterval Frequency of data backup to COS
     */
    public Long getForwardInterval() {
        return this.ForwardInterval;
    }

    /**
     * Set Frequency of data backup to COS
     * @param ForwardInterval Frequency of data backup to COS
     */
    public void setForwardInterval(Long ForwardInterval) {
        this.ForwardInterval = ForwardInterval;
    }

    /**
     * Get Advanced configuration
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Config Advanced configuration
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Config getConfig() {
        return this.Config;
    }

    /**
     * Set Advanced configuration
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Config Advanced configuration
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConfig(Config Config) {
        this.Config = Config;
    }

    /**
     * Get Message retention time configuration (for recording the latest retention time)
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return RetentionTimeConfig Message retention time configuration (for recording the latest retention time)
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public TopicRetentionTimeConfigRsp getRetentionTimeConfig() {
        return this.RetentionTimeConfig;
    }

    /**
     * Set Message retention time configuration (for recording the latest retention time)
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param RetentionTimeConfig Message retention time configuration (for recording the latest retention time)
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setRetentionTimeConfig(TopicRetentionTimeConfigRsp RetentionTimeConfig) {
        this.RetentionTimeConfig = RetentionTimeConfig;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "ReplicaNum", this.ReplicaNum);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EnableWhiteList", this.EnableWhiteList);
        this.setParamSimple(map, prefix + "IpWhiteListCount", this.IpWhiteListCount);
        this.setParamSimple(map, prefix + "ForwardCosBucket", this.ForwardCosBucket);
        this.setParamSimple(map, prefix + "ForwardStatus", this.ForwardStatus);
        this.setParamSimple(map, prefix + "ForwardInterval", this.ForwardInterval);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamObj(map, prefix + "RetentionTimeConfig.", this.RetentionTimeConfig);

    }
}

