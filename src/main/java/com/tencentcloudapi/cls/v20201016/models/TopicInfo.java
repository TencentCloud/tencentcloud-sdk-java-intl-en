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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicInfo extends AbstractModel {

    /**
    * <p>Logset ID</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>Topic ID</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Topic name</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>Topic partition count</p>
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * <p>Whether the topic has indexing enabled (the topic type must be log topic)</p>
    */
    @SerializedName("Index")
    @Expose
    private Boolean Index;

    /**
    * <p>If AssumerUin is not empty, it indicates the Uin of the service provider creating the log topic</p>
    */
    @SerializedName("AssumerUin")
    @Expose
    private Long AssumerUin;

    /**
    * <p>Cloud product identifier. When the topic is created by other cloud products, this field displays the cloud product name, such as CDN, TKE.</p>
    */
    @SerializedName("AssumerName")
    @Expose
    private String AssumerName;

    /**
    * <p>Creation time. Format: yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Whether the topic has log collection enabled. true: enable collection; false: disable collection.<br>Enabled by default during log topic creation. You can modify this field via SDK invocation of ModifyTopic.<br>The console currently does not support modification of this parameter.</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>Tag information bound to the topic</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>If RoleName is not empty, it indicates the role used by the service provider creating the log topic</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>Whether the topic has auto-split enabled</p>
    */
    @SerializedName("AutoSplit")
    @Expose
    private Boolean AutoSplit;

    /**
    * <p>Maximum number of partitions allowed for the topic if auto-split is enabled</p>
    */
    @SerializedName("MaxSplitPartitions")
    @Expose
    private Long MaxSplitPartitions;

    /**
    * <p>Storage type of the topic</p><ul><li>hot: standard storage</li><li>cold: infrequent storage</li></ul>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>Lifecycle in days, valid values 1~3600. A value of 3640 indicates permanent retention.</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>Cloud product sub-identifier. When the log topic is created by other cloud products, this field displays the cloud product name and its log type sub-category, such as TKE-Audit, TKE-Event. Some cloud products only have the cloud product identifier (AssumerName) without this field.</p>
    */
    @SerializedName("SubAssumerName")
    @Expose
    private String SubAssumerName;

    /**
    * <p>Topic description</p>
    */
    @SerializedName("Describes")
    @Expose
    private String Describes;

    /**
    * <p>Enable log settlement, lifecycle of standard storage, hotPeriod &lt; Period.<br>Standard storage is hotPeriod, infrequent storage is Period-hotPeriod. (Topic type must be log topic)<br>HotPeriod=0 means log settlement is not enabled.</p>
    */
    @SerializedName("HotPeriod")
    @Expose
    private Long HotPeriod;

    /**
    * <p>kms-cls service key id</p>
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * <p>Topic type.</p><ul><li>0: Log topic</li><li>1: Metric topic</li></ul>
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
    * <p>Free authentication switch. false: disabled; true: enabled.<br>Once enabled, designated operations will be supported for anonymous access to the log topic. See <a href="https://www.tencentcloud.com/document/product/614/41035?from_cn_redirect=1">log topic</a> for details.</p>
    */
    @SerializedName("IsWebTracking")
    @Expose
    private Boolean IsWebTracking;

    /**
    * <p>Log topic extended information</p>
    */
    @SerializedName("Extends")
    @Expose
    private TopicExtendInfo Extends;

    /**
    * <p>Async migration task ID</p>
    */
    @SerializedName("TopicAsyncTaskID")
    @Expose
    private String TopicAsyncTaskID;

    /**
    * <p>Asynchronous migration status</p><ul><li>1: In progress</li><li>2: Completed</li><li>3: Failure</li><li>4: Canceled</li></ul>
    */
    @SerializedName("MigrationStatus")
    @Expose
    private Long MigrationStatus;

    /**
    * <p>After async migration, expected effective date<br>Time format: yyyy-MM-dd HH:mm:ss</p>
    */
    @SerializedName("EffectiveDate")
    @Expose
    private String EffectiveDate;

    /**
    * <p>IsSourceFrom Enable recording public network source IP and server receipt time</p>
    */
    @SerializedName("IsSourceFrom")
    @Expose
    private Boolean IsSourceFrom;

    /**
    * <p>Current billing mode</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Billing by raw log size (currently supported for some customers only)</li></ul>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * <p>If there is an async task, the new billing model after the task succeeds</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Billing by raw log size (currently only supported for some customers)</li></ul>
    */
    @SerializedName("NewBillingMode")
    @Expose
    private Long NewBillingMode;

    /**
     * Get <p>Logset ID</p> 
     * @return LogsetId <p>Logset ID</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>Logset ID</p>
     * @param LogsetId <p>Logset ID</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>Topic ID</p> 
     * @return TopicId <p>Topic ID</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Topic ID</p>
     * @param TopicId <p>Topic ID</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Topic name</p> 
     * @return TopicName <p>Topic name</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>Topic name</p>
     * @param TopicName <p>Topic name</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>Topic partition count</p> 
     * @return PartitionCount <p>Topic partition count</p>
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set <p>Topic partition count</p>
     * @param PartitionCount <p>Topic partition count</p>
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get <p>Whether the topic has indexing enabled (the topic type must be log topic)</p> 
     * @return Index <p>Whether the topic has indexing enabled (the topic type must be log topic)</p>
     */
    public Boolean getIndex() {
        return this.Index;
    }

    /**
     * Set <p>Whether the topic has indexing enabled (the topic type must be log topic)</p>
     * @param Index <p>Whether the topic has indexing enabled (the topic type must be log topic)</p>
     */
    public void setIndex(Boolean Index) {
        this.Index = Index;
    }

    /**
     * Get <p>If AssumerUin is not empty, it indicates the Uin of the service provider creating the log topic</p> 
     * @return AssumerUin <p>If AssumerUin is not empty, it indicates the Uin of the service provider creating the log topic</p>
     */
    public Long getAssumerUin() {
        return this.AssumerUin;
    }

    /**
     * Set <p>If AssumerUin is not empty, it indicates the Uin of the service provider creating the log topic</p>
     * @param AssumerUin <p>If AssumerUin is not empty, it indicates the Uin of the service provider creating the log topic</p>
     */
    public void setAssumerUin(Long AssumerUin) {
        this.AssumerUin = AssumerUin;
    }

    /**
     * Get <p>Cloud product identifier. When the topic is created by other cloud products, this field displays the cloud product name, such as CDN, TKE.</p> 
     * @return AssumerName <p>Cloud product identifier. When the topic is created by other cloud products, this field displays the cloud product name, such as CDN, TKE.</p>
     */
    public String getAssumerName() {
        return this.AssumerName;
    }

    /**
     * Set <p>Cloud product identifier. When the topic is created by other cloud products, this field displays the cloud product name, such as CDN, TKE.</p>
     * @param AssumerName <p>Cloud product identifier. When the topic is created by other cloud products, this field displays the cloud product name, such as CDN, TKE.</p>
     */
    public void setAssumerName(String AssumerName) {
        this.AssumerName = AssumerName;
    }

    /**
     * Get <p>Creation time. Format: yyyy-MM-dd HH:mm:ss</p> 
     * @return CreateTime <p>Creation time. Format: yyyy-MM-dd HH:mm:ss</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time. Format: yyyy-MM-dd HH:mm:ss</p>
     * @param CreateTime <p>Creation time. Format: yyyy-MM-dd HH:mm:ss</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Whether the topic has log collection enabled. true: enable collection; false: disable collection.<br>Enabled by default during log topic creation. You can modify this field via SDK invocation of ModifyTopic.<br>The console currently does not support modification of this parameter.</p> 
     * @return Status <p>Whether the topic has log collection enabled. true: enable collection; false: disable collection.<br>Enabled by default during log topic creation. You can modify this field via SDK invocation of ModifyTopic.<br>The console currently does not support modification of this parameter.</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Whether the topic has log collection enabled. true: enable collection; false: disable collection.<br>Enabled by default during log topic creation. You can modify this field via SDK invocation of ModifyTopic.<br>The console currently does not support modification of this parameter.</p>
     * @param Status <p>Whether the topic has log collection enabled. true: enable collection; false: disable collection.<br>Enabled by default during log topic creation. You can modify this field via SDK invocation of ModifyTopic.<br>The console currently does not support modification of this parameter.</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Tag information bound to the topic</p> 
     * @return Tags <p>Tag information bound to the topic</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag information bound to the topic</p>
     * @param Tags <p>Tag information bound to the topic</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>If RoleName is not empty, it indicates the role used by the service provider creating the log topic</p> 
     * @return RoleName <p>If RoleName is not empty, it indicates the role used by the service provider creating the log topic</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>If RoleName is not empty, it indicates the role used by the service provider creating the log topic</p>
     * @param RoleName <p>If RoleName is not empty, it indicates the role used by the service provider creating the log topic</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>Whether the topic has auto-split enabled</p> 
     * @return AutoSplit <p>Whether the topic has auto-split enabled</p>
     */
    public Boolean getAutoSplit() {
        return this.AutoSplit;
    }

    /**
     * Set <p>Whether the topic has auto-split enabled</p>
     * @param AutoSplit <p>Whether the topic has auto-split enabled</p>
     */
    public void setAutoSplit(Boolean AutoSplit) {
        this.AutoSplit = AutoSplit;
    }

    /**
     * Get <p>Maximum number of partitions allowed for the topic if auto-split is enabled</p> 
     * @return MaxSplitPartitions <p>Maximum number of partitions allowed for the topic if auto-split is enabled</p>
     */
    public Long getMaxSplitPartitions() {
        return this.MaxSplitPartitions;
    }

    /**
     * Set <p>Maximum number of partitions allowed for the topic if auto-split is enabled</p>
     * @param MaxSplitPartitions <p>Maximum number of partitions allowed for the topic if auto-split is enabled</p>
     */
    public void setMaxSplitPartitions(Long MaxSplitPartitions) {
        this.MaxSplitPartitions = MaxSplitPartitions;
    }

    /**
     * Get <p>Storage type of the topic</p><ul><li>hot: standard storage</li><li>cold: infrequent storage</li></ul> 
     * @return StorageType <p>Storage type of the topic</p><ul><li>hot: standard storage</li><li>cold: infrequent storage</li></ul>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Storage type of the topic</p><ul><li>hot: standard storage</li><li>cold: infrequent storage</li></ul>
     * @param StorageType <p>Storage type of the topic</p><ul><li>hot: standard storage</li><li>cold: infrequent storage</li></ul>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>Lifecycle in days, valid values 1~3600. A value of 3640 indicates permanent retention.</p> 
     * @return Period <p>Lifecycle in days, valid values 1~3600. A value of 3640 indicates permanent retention.</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Lifecycle in days, valid values 1~3600. A value of 3640 indicates permanent retention.</p>
     * @param Period <p>Lifecycle in days, valid values 1~3600. A value of 3640 indicates permanent retention.</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>Cloud product sub-identifier. When the log topic is created by other cloud products, this field displays the cloud product name and its log type sub-category, such as TKE-Audit, TKE-Event. Some cloud products only have the cloud product identifier (AssumerName) without this field.</p> 
     * @return SubAssumerName <p>Cloud product sub-identifier. When the log topic is created by other cloud products, this field displays the cloud product name and its log type sub-category, such as TKE-Audit, TKE-Event. Some cloud products only have the cloud product identifier (AssumerName) without this field.</p>
     */
    public String getSubAssumerName() {
        return this.SubAssumerName;
    }

    /**
     * Set <p>Cloud product sub-identifier. When the log topic is created by other cloud products, this field displays the cloud product name and its log type sub-category, such as TKE-Audit, TKE-Event. Some cloud products only have the cloud product identifier (AssumerName) without this field.</p>
     * @param SubAssumerName <p>Cloud product sub-identifier. When the log topic is created by other cloud products, this field displays the cloud product name and its log type sub-category, such as TKE-Audit, TKE-Event. Some cloud products only have the cloud product identifier (AssumerName) without this field.</p>
     */
    public void setSubAssumerName(String SubAssumerName) {
        this.SubAssumerName = SubAssumerName;
    }

    /**
     * Get <p>Topic description</p> 
     * @return Describes <p>Topic description</p>
     */
    public String getDescribes() {
        return this.Describes;
    }

    /**
     * Set <p>Topic description</p>
     * @param Describes <p>Topic description</p>
     */
    public void setDescribes(String Describes) {
        this.Describes = Describes;
    }

    /**
     * Get <p>Enable log settlement, lifecycle of standard storage, hotPeriod &lt; Period.<br>Standard storage is hotPeriod, infrequent storage is Period-hotPeriod. (Topic type must be log topic)<br>HotPeriod=0 means log settlement is not enabled.</p> 
     * @return HotPeriod <p>Enable log settlement, lifecycle of standard storage, hotPeriod &lt; Period.<br>Standard storage is hotPeriod, infrequent storage is Period-hotPeriod. (Topic type must be log topic)<br>HotPeriod=0 means log settlement is not enabled.</p>
     */
    public Long getHotPeriod() {
        return this.HotPeriod;
    }

    /**
     * Set <p>Enable log settlement, lifecycle of standard storage, hotPeriod &lt; Period.<br>Standard storage is hotPeriod, infrequent storage is Period-hotPeriod. (Topic type must be log topic)<br>HotPeriod=0 means log settlement is not enabled.</p>
     * @param HotPeriod <p>Enable log settlement, lifecycle of standard storage, hotPeriod &lt; Period.<br>Standard storage is hotPeriod, infrequent storage is Period-hotPeriod. (Topic type must be log topic)<br>HotPeriod=0 means log settlement is not enabled.</p>
     */
    public void setHotPeriod(Long HotPeriod) {
        this.HotPeriod = HotPeriod;
    }

    /**
     * Get <p>kms-cls service key id</p> 
     * @return KeyId <p>kms-cls service key id</p>
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set <p>kms-cls service key id</p>
     * @param KeyId <p>kms-cls service key id</p>
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get <p>Topic type.</p><ul><li>0: Log topic</li><li>1: Metric topic</li></ul> 
     * @return BizType <p>Topic type.</p><ul><li>0: Log topic</li><li>1: Metric topic</li></ul>
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set <p>Topic type.</p><ul><li>0: Log topic</li><li>1: Metric topic</li></ul>
     * @param BizType <p>Topic type.</p><ul><li>0: Log topic</li><li>1: Metric topic</li></ul>
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    /**
     * Get <p>Free authentication switch. false: disabled; true: enabled.<br>Once enabled, designated operations will be supported for anonymous access to the log topic. See <a href="https://www.tencentcloud.com/document/product/614/41035?from_cn_redirect=1">log topic</a> for details.</p> 
     * @return IsWebTracking <p>Free authentication switch. false: disabled; true: enabled.<br>Once enabled, designated operations will be supported for anonymous access to the log topic. See <a href="https://www.tencentcloud.com/document/product/614/41035?from_cn_redirect=1">log topic</a> for details.</p>
     */
    public Boolean getIsWebTracking() {
        return this.IsWebTracking;
    }

    /**
     * Set <p>Free authentication switch. false: disabled; true: enabled.<br>Once enabled, designated operations will be supported for anonymous access to the log topic. See <a href="https://www.tencentcloud.com/document/product/614/41035?from_cn_redirect=1">log topic</a> for details.</p>
     * @param IsWebTracking <p>Free authentication switch. false: disabled; true: enabled.<br>Once enabled, designated operations will be supported for anonymous access to the log topic. See <a href="https://www.tencentcloud.com/document/product/614/41035?from_cn_redirect=1">log topic</a> for details.</p>
     */
    public void setIsWebTracking(Boolean IsWebTracking) {
        this.IsWebTracking = IsWebTracking;
    }

    /**
     * Get <p>Log topic extended information</p> 
     * @return Extends <p>Log topic extended information</p>
     */
    public TopicExtendInfo getExtends() {
        return this.Extends;
    }

    /**
     * Set <p>Log topic extended information</p>
     * @param Extends <p>Log topic extended information</p>
     */
    public void setExtends(TopicExtendInfo Extends) {
        this.Extends = Extends;
    }

    /**
     * Get <p>Async migration task ID</p> 
     * @return TopicAsyncTaskID <p>Async migration task ID</p>
     */
    public String getTopicAsyncTaskID() {
        return this.TopicAsyncTaskID;
    }

    /**
     * Set <p>Async migration task ID</p>
     * @param TopicAsyncTaskID <p>Async migration task ID</p>
     */
    public void setTopicAsyncTaskID(String TopicAsyncTaskID) {
        this.TopicAsyncTaskID = TopicAsyncTaskID;
    }

    /**
     * Get <p>Asynchronous migration status</p><ul><li>1: In progress</li><li>2: Completed</li><li>3: Failure</li><li>4: Canceled</li></ul> 
     * @return MigrationStatus <p>Asynchronous migration status</p><ul><li>1: In progress</li><li>2: Completed</li><li>3: Failure</li><li>4: Canceled</li></ul>
     */
    public Long getMigrationStatus() {
        return this.MigrationStatus;
    }

    /**
     * Set <p>Asynchronous migration status</p><ul><li>1: In progress</li><li>2: Completed</li><li>3: Failure</li><li>4: Canceled</li></ul>
     * @param MigrationStatus <p>Asynchronous migration status</p><ul><li>1: In progress</li><li>2: Completed</li><li>3: Failure</li><li>4: Canceled</li></ul>
     */
    public void setMigrationStatus(Long MigrationStatus) {
        this.MigrationStatus = MigrationStatus;
    }

    /**
     * Get <p>After async migration, expected effective date<br>Time format: yyyy-MM-dd HH:mm:ss</p> 
     * @return EffectiveDate <p>After async migration, expected effective date<br>Time format: yyyy-MM-dd HH:mm:ss</p>
     */
    public String getEffectiveDate() {
        return this.EffectiveDate;
    }

    /**
     * Set <p>After async migration, expected effective date<br>Time format: yyyy-MM-dd HH:mm:ss</p>
     * @param EffectiveDate <p>After async migration, expected effective date<br>Time format: yyyy-MM-dd HH:mm:ss</p>
     */
    public void setEffectiveDate(String EffectiveDate) {
        this.EffectiveDate = EffectiveDate;
    }

    /**
     * Get <p>IsSourceFrom Enable recording public network source IP and server receipt time</p> 
     * @return IsSourceFrom <p>IsSourceFrom Enable recording public network source IP and server receipt time</p>
     */
    public Boolean getIsSourceFrom() {
        return this.IsSourceFrom;
    }

    /**
     * Set <p>IsSourceFrom Enable recording public network source IP and server receipt time</p>
     * @param IsSourceFrom <p>IsSourceFrom Enable recording public network source IP and server receipt time</p>
     */
    public void setIsSourceFrom(Boolean IsSourceFrom) {
        this.IsSourceFrom = IsSourceFrom;
    }

    /**
     * Get <p>Current billing mode</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Billing by raw log size (currently supported for some customers only)</li></ul> 
     * @return BillingMode <p>Current billing mode</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Billing by raw log size (currently supported for some customers only)</li></ul>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>Current billing mode</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Billing by raw log size (currently supported for some customers only)</li></ul>
     * @param BillingMode <p>Current billing mode</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Billing by raw log size (currently supported for some customers only)</li></ul>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get <p>If there is an async task, the new billing model after the task succeeds</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Billing by raw log size (currently only supported for some customers)</li></ul> 
     * @return NewBillingMode <p>If there is an async task, the new billing model after the task succeeds</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Billing by raw log size (currently only supported for some customers)</li></ul>
     */
    public Long getNewBillingMode() {
        return this.NewBillingMode;
    }

    /**
     * Set <p>If there is an async task, the new billing model after the task succeeds</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Billing by raw log size (currently only supported for some customers)</li></ul>
     * @param NewBillingMode <p>If there is an async task, the new billing model after the task succeeds</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Billing by raw log size (currently only supported for some customers)</li></ul>
     */
    public void setNewBillingMode(Long NewBillingMode) {
        this.NewBillingMode = NewBillingMode;
    }

    public TopicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicInfo(TopicInfo source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.Index != null) {
            this.Index = new Boolean(source.Index);
        }
        if (source.AssumerUin != null) {
            this.AssumerUin = new Long(source.AssumerUin);
        }
        if (source.AssumerName != null) {
            this.AssumerName = new String(source.AssumerName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.AutoSplit != null) {
            this.AutoSplit = new Boolean(source.AutoSplit);
        }
        if (source.MaxSplitPartitions != null) {
            this.MaxSplitPartitions = new Long(source.MaxSplitPartitions);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.SubAssumerName != null) {
            this.SubAssumerName = new String(source.SubAssumerName);
        }
        if (source.Describes != null) {
            this.Describes = new String(source.Describes);
        }
        if (source.HotPeriod != null) {
            this.HotPeriod = new Long(source.HotPeriod);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.BizType != null) {
            this.BizType = new Long(source.BizType);
        }
        if (source.IsWebTracking != null) {
            this.IsWebTracking = new Boolean(source.IsWebTracking);
        }
        if (source.Extends != null) {
            this.Extends = new TopicExtendInfo(source.Extends);
        }
        if (source.TopicAsyncTaskID != null) {
            this.TopicAsyncTaskID = new String(source.TopicAsyncTaskID);
        }
        if (source.MigrationStatus != null) {
            this.MigrationStatus = new Long(source.MigrationStatus);
        }
        if (source.EffectiveDate != null) {
            this.EffectiveDate = new String(source.EffectiveDate);
        }
        if (source.IsSourceFrom != null) {
            this.IsSourceFrom = new Boolean(source.IsSourceFrom);
        }
        if (source.BillingMode != null) {
            this.BillingMode = new Long(source.BillingMode);
        }
        if (source.NewBillingMode != null) {
            this.NewBillingMode = new Long(source.NewBillingMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "AssumerUin", this.AssumerUin);
        this.setParamSimple(map, prefix + "AssumerName", this.AssumerName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "AutoSplit", this.AutoSplit);
        this.setParamSimple(map, prefix + "MaxSplitPartitions", this.MaxSplitPartitions);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "SubAssumerName", this.SubAssumerName);
        this.setParamSimple(map, prefix + "Describes", this.Describes);
        this.setParamSimple(map, prefix + "HotPeriod", this.HotPeriod);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "IsWebTracking", this.IsWebTracking);
        this.setParamObj(map, prefix + "Extends.", this.Extends);
        this.setParamSimple(map, prefix + "TopicAsyncTaskID", this.TopicAsyncTaskID);
        this.setParamSimple(map, prefix + "MigrationStatus", this.MigrationStatus);
        this.setParamSimple(map, prefix + "EffectiveDate", this.EffectiveDate);
        this.setParamSimple(map, prefix + "IsSourceFrom", this.IsSourceFrom);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "NewBillingMode", this.NewBillingMode);

    }
}

