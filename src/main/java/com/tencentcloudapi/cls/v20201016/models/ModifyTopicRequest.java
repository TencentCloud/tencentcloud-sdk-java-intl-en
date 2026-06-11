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

public class ModifyTopicRequest extends AbstractModel {

    /**
    * <p>Topic ID - Obtain the topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Topic List</a>.</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Topic name<br>Input restrictions:</p><ul><li>Cannot be an empty string</li><li>Cannot contain character '|'</li><li>Cannot use the following names ["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]</li></ul>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>List of tag descriptions. By specifying this parameter, you can bind tags to the appropriate topic simultaneously. Supports up to 10 tag key-value pairs, and no duplicate key-value pairs are allowed.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Whether the topic has log collection enabled. true: start collection; false: disable collection.<br>The console currently does not support modification of this parameter.</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>Whether to enable auto-split</p>
    */
    @SerializedName("AutoSplit")
    @Expose
    private Boolean AutoSplit;

    /**
    * <p>If maximum split is enabled, the maximum number of partitions allowed for this topic;<br>default is 50; must be a positive number</p>
    */
    @SerializedName("MaxSplitPartitions")
    @Expose
    private Long MaxSplitPartitions;

    /**
    * <p>Lifecycle in days. Standard storage value range is 1-3600. Infrequent storage value range is 7-3600. A value of 3640 indicates permanent retention.</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>Storage type: cold infrequent storage, hot standard storage</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>Topic description</p>
    */
    @SerializedName("Describes")
    @Expose
    private String Describes;

    /**
    * <p>0: The log topic disables log settlement.<br>Non-0: Number of days for standard storage after log settlement is enabled for the log topic. HotPeriod needs to be greater than or equal to 7 and less than Period.<br>Effective only when StorageType is hot. This configuration is not supported for metric topics.</p>
    */
    @SerializedName("HotPeriod")
    @Expose
    private Long HotPeriod;

    /**
    * <p>Free authentication switch. false: disabled; true: enabled.<br>Once enabled, anonymous access to the log topic will be supported for specified operations. For details, please see <a href="https://www.tencentcloud.com/document/product/614/41035?from_cn_redirect=1">log topic</a>.</p>
    */
    @SerializedName("IsWebTracking")
    @Expose
    private Boolean IsWebTracking;

    /**
    * <p>Topic extended information</p>
    */
    @SerializedName("Extends")
    @Expose
    private TopicExtendInfo Extends;

    /**
    * <p>Number of topic partitions.<br>Defaults to 1.<br>Value ranges and constraints:</p><ul><li>When the input value &lt;=0, the system automatically adjusts it to 1.</li><li>If MaxSplitPartitions is not passed, PartitionCount must be &lt;=50.</li><li>If MaxSplitPartitions is passed, PartitionCount must be &lt;=MaxSplitPartitions.</li></ul>
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * <p>id of the cancel switch storage task</p><ul><li>Obtain the id of the cancel switch storage task [TopicAsyncTaskID field in Topics] by <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">get log topic list</a>.</li></ul>
    */
    @SerializedName("CancelTopicAsyncTaskID")
    @Expose
    private String CancelTopicAsyncTaskID;

    /**
    * <p>Encryption-related parameters. Encrypted regions are supported and can be passed for allowlisted users. Cannot be passed in other scenarios.<br>Only support passing in 1: kms-cls secret key for cloud product encryption.</p>
    */
    @SerializedName("Encryption")
    @Expose
    private Long Encryption;

    /**
    * <p>Enable logging of public network source IP and server receipt time</p>
    */
    @SerializedName("IsSourceFrom")
    @Expose
    private Boolean IsSourceFrom;

    /**
    * <p>Billing mode</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Raw log size billing (currently only supports some customers)</li></ul><p>Default value: 0</p>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
     * Get <p>Topic ID - Obtain the topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Topic List</a>.</p> 
     * @return TopicId <p>Topic ID - Obtain the topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Topic List</a>.</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Topic ID - Obtain the topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Topic List</a>.</p>
     * @param TopicId <p>Topic ID - Obtain the topic Id through <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">Get Topic List</a>.</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Topic name<br>Input restrictions:</p><ul><li>Cannot be an empty string</li><li>Cannot contain character '|'</li><li>Cannot use the following names ["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]</li></ul> 
     * @return TopicName <p>Topic name<br>Input restrictions:</p><ul><li>Cannot be an empty string</li><li>Cannot contain character '|'</li><li>Cannot use the following names ["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]</li></ul>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>Topic name<br>Input restrictions:</p><ul><li>Cannot be an empty string</li><li>Cannot contain character '|'</li><li>Cannot use the following names ["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]</li></ul>
     * @param TopicName <p>Topic name<br>Input restrictions:</p><ul><li>Cannot be an empty string</li><li>Cannot contain character '|'</li><li>Cannot use the following names ["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]</li></ul>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>List of tag descriptions. By specifying this parameter, you can bind tags to the appropriate topic simultaneously. Supports up to 10 tag key-value pairs, and no duplicate key-value pairs are allowed.</p> 
     * @return Tags <p>List of tag descriptions. By specifying this parameter, you can bind tags to the appropriate topic simultaneously. Supports up to 10 tag key-value pairs, and no duplicate key-value pairs are allowed.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>List of tag descriptions. By specifying this parameter, you can bind tags to the appropriate topic simultaneously. Supports up to 10 tag key-value pairs, and no duplicate key-value pairs are allowed.</p>
     * @param Tags <p>List of tag descriptions. By specifying this parameter, you can bind tags to the appropriate topic simultaneously. Supports up to 10 tag key-value pairs, and no duplicate key-value pairs are allowed.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Whether the topic has log collection enabled. true: start collection; false: disable collection.<br>The console currently does not support modification of this parameter.</p> 
     * @return Status <p>Whether the topic has log collection enabled. true: start collection; false: disable collection.<br>The console currently does not support modification of this parameter.</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Whether the topic has log collection enabled. true: start collection; false: disable collection.<br>The console currently does not support modification of this parameter.</p>
     * @param Status <p>Whether the topic has log collection enabled. true: start collection; false: disable collection.<br>The console currently does not support modification of this parameter.</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Whether to enable auto-split</p> 
     * @return AutoSplit <p>Whether to enable auto-split</p>
     */
    public Boolean getAutoSplit() {
        return this.AutoSplit;
    }

    /**
     * Set <p>Whether to enable auto-split</p>
     * @param AutoSplit <p>Whether to enable auto-split</p>
     */
    public void setAutoSplit(Boolean AutoSplit) {
        this.AutoSplit = AutoSplit;
    }

    /**
     * Get <p>If maximum split is enabled, the maximum number of partitions allowed for this topic;<br>default is 50; must be a positive number</p> 
     * @return MaxSplitPartitions <p>If maximum split is enabled, the maximum number of partitions allowed for this topic;<br>default is 50; must be a positive number</p>
     */
    public Long getMaxSplitPartitions() {
        return this.MaxSplitPartitions;
    }

    /**
     * Set <p>If maximum split is enabled, the maximum number of partitions allowed for this topic;<br>default is 50; must be a positive number</p>
     * @param MaxSplitPartitions <p>If maximum split is enabled, the maximum number of partitions allowed for this topic;<br>default is 50; must be a positive number</p>
     */
    public void setMaxSplitPartitions(Long MaxSplitPartitions) {
        this.MaxSplitPartitions = MaxSplitPartitions;
    }

    /**
     * Get <p>Lifecycle in days. Standard storage value range is 1-3600. Infrequent storage value range is 7-3600. A value of 3640 indicates permanent retention.</p> 
     * @return Period <p>Lifecycle in days. Standard storage value range is 1-3600. Infrequent storage value range is 7-3600. A value of 3640 indicates permanent retention.</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Lifecycle in days. Standard storage value range is 1-3600. Infrequent storage value range is 7-3600. A value of 3640 indicates permanent retention.</p>
     * @param Period <p>Lifecycle in days. Standard storage value range is 1-3600. Infrequent storage value range is 7-3600. A value of 3640 indicates permanent retention.</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>Storage type: cold infrequent storage, hot standard storage</p> 
     * @return StorageType <p>Storage type: cold infrequent storage, hot standard storage</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Storage type: cold infrequent storage, hot standard storage</p>
     * @param StorageType <p>Storage type: cold infrequent storage, hot standard storage</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
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
     * Get <p>0: The log topic disables log settlement.<br>Non-0: Number of days for standard storage after log settlement is enabled for the log topic. HotPeriod needs to be greater than or equal to 7 and less than Period.<br>Effective only when StorageType is hot. This configuration is not supported for metric topics.</p> 
     * @return HotPeriod <p>0: The log topic disables log settlement.<br>Non-0: Number of days for standard storage after log settlement is enabled for the log topic. HotPeriod needs to be greater than or equal to 7 and less than Period.<br>Effective only when StorageType is hot. This configuration is not supported for metric topics.</p>
     */
    public Long getHotPeriod() {
        return this.HotPeriod;
    }

    /**
     * Set <p>0: The log topic disables log settlement.<br>Non-0: Number of days for standard storage after log settlement is enabled for the log topic. HotPeriod needs to be greater than or equal to 7 and less than Period.<br>Effective only when StorageType is hot. This configuration is not supported for metric topics.</p>
     * @param HotPeriod <p>0: The log topic disables log settlement.<br>Non-0: Number of days for standard storage after log settlement is enabled for the log topic. HotPeriod needs to be greater than or equal to 7 and less than Period.<br>Effective only when StorageType is hot. This configuration is not supported for metric topics.</p>
     */
    public void setHotPeriod(Long HotPeriod) {
        this.HotPeriod = HotPeriod;
    }

    /**
     * Get <p>Free authentication switch. false: disabled; true: enabled.<br>Once enabled, anonymous access to the log topic will be supported for specified operations. For details, please see <a href="https://www.tencentcloud.com/document/product/614/41035?from_cn_redirect=1">log topic</a>.</p> 
     * @return IsWebTracking <p>Free authentication switch. false: disabled; true: enabled.<br>Once enabled, anonymous access to the log topic will be supported for specified operations. For details, please see <a href="https://www.tencentcloud.com/document/product/614/41035?from_cn_redirect=1">log topic</a>.</p>
     */
    public Boolean getIsWebTracking() {
        return this.IsWebTracking;
    }

    /**
     * Set <p>Free authentication switch. false: disabled; true: enabled.<br>Once enabled, anonymous access to the log topic will be supported for specified operations. For details, please see <a href="https://www.tencentcloud.com/document/product/614/41035?from_cn_redirect=1">log topic</a>.</p>
     * @param IsWebTracking <p>Free authentication switch. false: disabled; true: enabled.<br>Once enabled, anonymous access to the log topic will be supported for specified operations. For details, please see <a href="https://www.tencentcloud.com/document/product/614/41035?from_cn_redirect=1">log topic</a>.</p>
     */
    public void setIsWebTracking(Boolean IsWebTracking) {
        this.IsWebTracking = IsWebTracking;
    }

    /**
     * Get <p>Topic extended information</p> 
     * @return Extends <p>Topic extended information</p>
     */
    public TopicExtendInfo getExtends() {
        return this.Extends;
    }

    /**
     * Set <p>Topic extended information</p>
     * @param Extends <p>Topic extended information</p>
     */
    public void setExtends(TopicExtendInfo Extends) {
        this.Extends = Extends;
    }

    /**
     * Get <p>Number of topic partitions.<br>Defaults to 1.<br>Value ranges and constraints:</p><ul><li>When the input value &lt;=0, the system automatically adjusts it to 1.</li><li>If MaxSplitPartitions is not passed, PartitionCount must be &lt;=50.</li><li>If MaxSplitPartitions is passed, PartitionCount must be &lt;=MaxSplitPartitions.</li></ul> 
     * @return PartitionCount <p>Number of topic partitions.<br>Defaults to 1.<br>Value ranges and constraints:</p><ul><li>When the input value &lt;=0, the system automatically adjusts it to 1.</li><li>If MaxSplitPartitions is not passed, PartitionCount must be &lt;=50.</li><li>If MaxSplitPartitions is passed, PartitionCount must be &lt;=MaxSplitPartitions.</li></ul>
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set <p>Number of topic partitions.<br>Defaults to 1.<br>Value ranges and constraints:</p><ul><li>When the input value &lt;=0, the system automatically adjusts it to 1.</li><li>If MaxSplitPartitions is not passed, PartitionCount must be &lt;=50.</li><li>If MaxSplitPartitions is passed, PartitionCount must be &lt;=MaxSplitPartitions.</li></ul>
     * @param PartitionCount <p>Number of topic partitions.<br>Defaults to 1.<br>Value ranges and constraints:</p><ul><li>When the input value &lt;=0, the system automatically adjusts it to 1.</li><li>If MaxSplitPartitions is not passed, PartitionCount must be &lt;=50.</li><li>If MaxSplitPartitions is passed, PartitionCount must be &lt;=MaxSplitPartitions.</li></ul>
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get <p>id of the cancel switch storage task</p><ul><li>Obtain the id of the cancel switch storage task [TopicAsyncTaskID field in Topics] by <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">get log topic list</a>.</li></ul> 
     * @return CancelTopicAsyncTaskID <p>id of the cancel switch storage task</p><ul><li>Obtain the id of the cancel switch storage task [TopicAsyncTaskID field in Topics] by <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">get log topic list</a>.</li></ul>
     */
    public String getCancelTopicAsyncTaskID() {
        return this.CancelTopicAsyncTaskID;
    }

    /**
     * Set <p>id of the cancel switch storage task</p><ul><li>Obtain the id of the cancel switch storage task [TopicAsyncTaskID field in Topics] by <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">get log topic list</a>.</li></ul>
     * @param CancelTopicAsyncTaskID <p>id of the cancel switch storage task</p><ul><li>Obtain the id of the cancel switch storage task [TopicAsyncTaskID field in Topics] by <a href="https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1">get log topic list</a>.</li></ul>
     */
    public void setCancelTopicAsyncTaskID(String CancelTopicAsyncTaskID) {
        this.CancelTopicAsyncTaskID = CancelTopicAsyncTaskID;
    }

    /**
     * Get <p>Encryption-related parameters. Encrypted regions are supported and can be passed for allowlisted users. Cannot be passed in other scenarios.<br>Only support passing in 1: kms-cls secret key for cloud product encryption.</p> 
     * @return Encryption <p>Encryption-related parameters. Encrypted regions are supported and can be passed for allowlisted users. Cannot be passed in other scenarios.<br>Only support passing in 1: kms-cls secret key for cloud product encryption.</p>
     */
    public Long getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>Encryption-related parameters. Encrypted regions are supported and can be passed for allowlisted users. Cannot be passed in other scenarios.<br>Only support passing in 1: kms-cls secret key for cloud product encryption.</p>
     * @param Encryption <p>Encryption-related parameters. Encrypted regions are supported and can be passed for allowlisted users. Cannot be passed in other scenarios.<br>Only support passing in 1: kms-cls secret key for cloud product encryption.</p>
     */
    public void setEncryption(Long Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get <p>Enable logging of public network source IP and server receipt time</p> 
     * @return IsSourceFrom <p>Enable logging of public network source IP and server receipt time</p>
     */
    public Boolean getIsSourceFrom() {
        return this.IsSourceFrom;
    }

    /**
     * Set <p>Enable logging of public network source IP and server receipt time</p>
     * @param IsSourceFrom <p>Enable logging of public network source IP and server receipt time</p>
     */
    public void setIsSourceFrom(Boolean IsSourceFrom) {
        this.IsSourceFrom = IsSourceFrom;
    }

    /**
     * Get <p>Billing mode</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Raw log size billing (currently only supports some customers)</li></ul><p>Default value: 0</p> 
     * @return BillingMode <p>Billing mode</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Raw log size billing (currently only supports some customers)</li></ul><p>Default value: 0</p>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>Billing mode</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Raw log size billing (currently only supports some customers)</li></ul><p>Default value: 0</p>
     * @param BillingMode <p>Billing mode</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Raw log size billing (currently only supports some customers)</li></ul><p>Default value: 0</p>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    public ModifyTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTopicRequest(ModifyTopicRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.AutoSplit != null) {
            this.AutoSplit = new Boolean(source.AutoSplit);
        }
        if (source.MaxSplitPartitions != null) {
            this.MaxSplitPartitions = new Long(source.MaxSplitPartitions);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Describes != null) {
            this.Describes = new String(source.Describes);
        }
        if (source.HotPeriod != null) {
            this.HotPeriod = new Long(source.HotPeriod);
        }
        if (source.IsWebTracking != null) {
            this.IsWebTracking = new Boolean(source.IsWebTracking);
        }
        if (source.Extends != null) {
            this.Extends = new TopicExtendInfo(source.Extends);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.CancelTopicAsyncTaskID != null) {
            this.CancelTopicAsyncTaskID = new String(source.CancelTopicAsyncTaskID);
        }
        if (source.Encryption != null) {
            this.Encryption = new Long(source.Encryption);
        }
        if (source.IsSourceFrom != null) {
            this.IsSourceFrom = new Boolean(source.IsSourceFrom);
        }
        if (source.BillingMode != null) {
            this.BillingMode = new Long(source.BillingMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AutoSplit", this.AutoSplit);
        this.setParamSimple(map, prefix + "MaxSplitPartitions", this.MaxSplitPartitions);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Describes", this.Describes);
        this.setParamSimple(map, prefix + "HotPeriod", this.HotPeriod);
        this.setParamSimple(map, prefix + "IsWebTracking", this.IsWebTracking);
        this.setParamObj(map, prefix + "Extends.", this.Extends);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "CancelTopicAsyncTaskID", this.CancelTopicAsyncTaskID);
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);
        this.setParamSimple(map, prefix + "IsSourceFrom", this.IsSourceFrom);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);

    }
}

