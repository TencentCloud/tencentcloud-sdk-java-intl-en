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

public class CreateTopicRequest extends AbstractModel {

    /**
    * <p>Logset ID</p><ul><li>Obtain the logset Id through <a href="https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1">Get Logset List</a>.</li></ul>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>Topic name<br>Name limitation</p><ul><li>Cannot be an empty string</li><li>Cannot contain character '|'</li><li>Cannot use the following names ["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]</li></ul>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>Topic partition count. Default creation is 1 partition. Supports a maximum of 10 partitions.</p>
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * <p>Tag description list, by specifying this parameter, you can simultaneously bind a tag to the corresponding topic. Up to 10 tag key-value pairs are supported, and the same resource can only be bound to the same tag key.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Whether to enable auto-split, true by default</p>
    */
    @SerializedName("AutoSplit")
    @Expose
    private Boolean AutoSplit;

    /**
    * <p>When auto-split is enabled, the maximum number of partitions allowed for each topic is 50 by default.</p>
    */
    @SerializedName("MaxSplitPartitions")
    @Expose
    private Long MaxSplitPartitions;

    /**
    * <p>Log topic storage type. Available values: hot (standard storage), cold (infrequent storage). Default hot. This configuration is not supported for metric topics.</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>Storage time, in days.</p><ul><li>Log topic: When logs are collected to standard storage, the supported range is 1 to 3600 days. A value of 3640 indicates permanent retention.</li><li>Log topic: When logs are collected to infrequently accessed storage, the supported range is 7 to 3600 days. A value of 3640 indicates permanent retention.</li><li>Metric topic: The supported range is 1 to 3600 days. A value of 3640 indicates permanent retention.</li></ul>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>Topic description</p>
    */
    @SerializedName("Describes")
    @Expose
    private String Describes;

    /**
    * <p>0: Log topic disables log settlement.<br>Non-0: Number of days for standard storage after log settlement is enabled in the log topic. HotPeriod needs to be greater than or equal to 7 and less than Period.<br>Effective only when StorageType is hot. This configuration is not supported for metric topics.</p>
    */
    @SerializedName("HotPeriod")
    @Expose
    private Long HotPeriod;

    /**
    * <p>Encryption-related parameters. Encrypted regions and allowlisted users can pass this parameter, which cannot be passed in other scenarios.<br>0 or not passed: no encryption<br>1: kms-cls cloud service key encryption</p><p>Supported regions: ap-beijing, ap-guangzhou, ap-shanghai, ap-singapore, ap-bangkok, ap-jakarta, eu-frankfurt, ap-seoul, ap-tokyo</p>
    */
    @SerializedName("Encryption")
    @Expose
    private Long Encryption;

    /**
    * <p>Topic type</p><ul><li>0: Log topic, default value</li><li>1: Metric topic</li></ul>
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
    * <p>Custom topic ID, format: custom part-User APPID. If this parameter is left empty, ID will be automatically generated.</p><ul><li>The custom part only supports lowercase letters, digits, and -, cannot start or end with -, and must be 3 to 40 characters in length.</li><li>The trailing part requires the use of - to concatenate User APPID. APPID can be queried on the page https://console.cloud.tencent.com/developer.</li><li>If this field is specified, ensure uniqueness across all regions.</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Free authentication switch. False: turned off; true: turned on. Default false.<br>When enabled, anonymous access to the log topic will be supported for designated operations. For details, see <a href="https://www.tencentcloud.com/document/product/614/41035?from_cn_redirect=1">log topic</a>. This configuration is not supported for metric topics.</p>
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
    * <p>Enable logging of public network source IP and server receipt time</p>
    */
    @SerializedName("IsSourceFrom")
    @Expose
    private Boolean IsSourceFrom;

    /**
    * <p>Billing mode</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Raw log size billing (currently only supported for some customers)</li></ul><p>Default value: 0</p>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
     * Get <p>Logset ID</p><ul><li>Obtain the logset Id through <a href="https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1">Get Logset List</a>.</li></ul> 
     * @return LogsetId <p>Logset ID</p><ul><li>Obtain the logset Id through <a href="https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1">Get Logset List</a>.</li></ul>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>Logset ID</p><ul><li>Obtain the logset Id through <a href="https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1">Get Logset List</a>.</li></ul>
     * @param LogsetId <p>Logset ID</p><ul><li>Obtain the logset Id through <a href="https://www.tencentcloud.com/document/product/614/58624?from_cn_redirect=1">Get Logset List</a>.</li></ul>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>Topic name<br>Name limitation</p><ul><li>Cannot be an empty string</li><li>Cannot contain character '|'</li><li>Cannot use the following names ["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]</li></ul> 
     * @return TopicName <p>Topic name<br>Name limitation</p><ul><li>Cannot be an empty string</li><li>Cannot contain character '|'</li><li>Cannot use the following names ["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]</li></ul>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>Topic name<br>Name limitation</p><ul><li>Cannot be an empty string</li><li>Cannot contain character '|'</li><li>Cannot use the following names ["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]</li></ul>
     * @param TopicName <p>Topic name<br>Name limitation</p><ul><li>Cannot be an empty string</li><li>Cannot contain character '|'</li><li>Cannot use the following names ["cls_service_log","loglistener_status","loglistener_alarm","loglistener_business","cls_service_metric"]</li></ul>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>Topic partition count. Default creation is 1 partition. Supports a maximum of 10 partitions.</p> 
     * @return PartitionCount <p>Topic partition count. Default creation is 1 partition. Supports a maximum of 10 partitions.</p>
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set <p>Topic partition count. Default creation is 1 partition. Supports a maximum of 10 partitions.</p>
     * @param PartitionCount <p>Topic partition count. Default creation is 1 partition. Supports a maximum of 10 partitions.</p>
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get <p>Tag description list, by specifying this parameter, you can simultaneously bind a tag to the corresponding topic. Up to 10 tag key-value pairs are supported, and the same resource can only be bound to the same tag key.</p> 
     * @return Tags <p>Tag description list, by specifying this parameter, you can simultaneously bind a tag to the corresponding topic. Up to 10 tag key-value pairs are supported, and the same resource can only be bound to the same tag key.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag description list, by specifying this parameter, you can simultaneously bind a tag to the corresponding topic. Up to 10 tag key-value pairs are supported, and the same resource can only be bound to the same tag key.</p>
     * @param Tags <p>Tag description list, by specifying this parameter, you can simultaneously bind a tag to the corresponding topic. Up to 10 tag key-value pairs are supported, and the same resource can only be bound to the same tag key.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Whether to enable auto-split, true by default</p> 
     * @return AutoSplit <p>Whether to enable auto-split, true by default</p>
     */
    public Boolean getAutoSplit() {
        return this.AutoSplit;
    }

    /**
     * Set <p>Whether to enable auto-split, true by default</p>
     * @param AutoSplit <p>Whether to enable auto-split, true by default</p>
     */
    public void setAutoSplit(Boolean AutoSplit) {
        this.AutoSplit = AutoSplit;
    }

    /**
     * Get <p>When auto-split is enabled, the maximum number of partitions allowed for each topic is 50 by default.</p> 
     * @return MaxSplitPartitions <p>When auto-split is enabled, the maximum number of partitions allowed for each topic is 50 by default.</p>
     */
    public Long getMaxSplitPartitions() {
        return this.MaxSplitPartitions;
    }

    /**
     * Set <p>When auto-split is enabled, the maximum number of partitions allowed for each topic is 50 by default.</p>
     * @param MaxSplitPartitions <p>When auto-split is enabled, the maximum number of partitions allowed for each topic is 50 by default.</p>
     */
    public void setMaxSplitPartitions(Long MaxSplitPartitions) {
        this.MaxSplitPartitions = MaxSplitPartitions;
    }

    /**
     * Get <p>Log topic storage type. Available values: hot (standard storage), cold (infrequent storage). Default hot. This configuration is not supported for metric topics.</p> 
     * @return StorageType <p>Log topic storage type. Available values: hot (standard storage), cold (infrequent storage). Default hot. This configuration is not supported for metric topics.</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Log topic storage type. Available values: hot (standard storage), cold (infrequent storage). Default hot. This configuration is not supported for metric topics.</p>
     * @param StorageType <p>Log topic storage type. Available values: hot (standard storage), cold (infrequent storage). Default hot. This configuration is not supported for metric topics.</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>Storage time, in days.</p><ul><li>Log topic: When logs are collected to standard storage, the supported range is 1 to 3600 days. A value of 3640 indicates permanent retention.</li><li>Log topic: When logs are collected to infrequently accessed storage, the supported range is 7 to 3600 days. A value of 3640 indicates permanent retention.</li><li>Metric topic: The supported range is 1 to 3600 days. A value of 3640 indicates permanent retention.</li></ul> 
     * @return Period <p>Storage time, in days.</p><ul><li>Log topic: When logs are collected to standard storage, the supported range is 1 to 3600 days. A value of 3640 indicates permanent retention.</li><li>Log topic: When logs are collected to infrequently accessed storage, the supported range is 7 to 3600 days. A value of 3640 indicates permanent retention.</li><li>Metric topic: The supported range is 1 to 3600 days. A value of 3640 indicates permanent retention.</li></ul>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>Storage time, in days.</p><ul><li>Log topic: When logs are collected to standard storage, the supported range is 1 to 3600 days. A value of 3640 indicates permanent retention.</li><li>Log topic: When logs are collected to infrequently accessed storage, the supported range is 7 to 3600 days. A value of 3640 indicates permanent retention.</li><li>Metric topic: The supported range is 1 to 3600 days. A value of 3640 indicates permanent retention.</li></ul>
     * @param Period <p>Storage time, in days.</p><ul><li>Log topic: When logs are collected to standard storage, the supported range is 1 to 3600 days. A value of 3640 indicates permanent retention.</li><li>Log topic: When logs are collected to infrequently accessed storage, the supported range is 7 to 3600 days. A value of 3640 indicates permanent retention.</li><li>Metric topic: The supported range is 1 to 3600 days. A value of 3640 indicates permanent retention.</li></ul>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
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
     * Get <p>0: Log topic disables log settlement.<br>Non-0: Number of days for standard storage after log settlement is enabled in the log topic. HotPeriod needs to be greater than or equal to 7 and less than Period.<br>Effective only when StorageType is hot. This configuration is not supported for metric topics.</p> 
     * @return HotPeriod <p>0: Log topic disables log settlement.<br>Non-0: Number of days for standard storage after log settlement is enabled in the log topic. HotPeriod needs to be greater than or equal to 7 and less than Period.<br>Effective only when StorageType is hot. This configuration is not supported for metric topics.</p>
     */
    public Long getHotPeriod() {
        return this.HotPeriod;
    }

    /**
     * Set <p>0: Log topic disables log settlement.<br>Non-0: Number of days for standard storage after log settlement is enabled in the log topic. HotPeriod needs to be greater than or equal to 7 and less than Period.<br>Effective only when StorageType is hot. This configuration is not supported for metric topics.</p>
     * @param HotPeriod <p>0: Log topic disables log settlement.<br>Non-0: Number of days for standard storage after log settlement is enabled in the log topic. HotPeriod needs to be greater than or equal to 7 and less than Period.<br>Effective only when StorageType is hot. This configuration is not supported for metric topics.</p>
     */
    public void setHotPeriod(Long HotPeriod) {
        this.HotPeriod = HotPeriod;
    }

    /**
     * Get <p>Encryption-related parameters. Encrypted regions and allowlisted users can pass this parameter, which cannot be passed in other scenarios.<br>0 or not passed: no encryption<br>1: kms-cls cloud service key encryption</p><p>Supported regions: ap-beijing, ap-guangzhou, ap-shanghai, ap-singapore, ap-bangkok, ap-jakarta, eu-frankfurt, ap-seoul, ap-tokyo</p> 
     * @return Encryption <p>Encryption-related parameters. Encrypted regions and allowlisted users can pass this parameter, which cannot be passed in other scenarios.<br>0 or not passed: no encryption<br>1: kms-cls cloud service key encryption</p><p>Supported regions: ap-beijing, ap-guangzhou, ap-shanghai, ap-singapore, ap-bangkok, ap-jakarta, eu-frankfurt, ap-seoul, ap-tokyo</p>
     */
    public Long getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>Encryption-related parameters. Encrypted regions and allowlisted users can pass this parameter, which cannot be passed in other scenarios.<br>0 or not passed: no encryption<br>1: kms-cls cloud service key encryption</p><p>Supported regions: ap-beijing, ap-guangzhou, ap-shanghai, ap-singapore, ap-bangkok, ap-jakarta, eu-frankfurt, ap-seoul, ap-tokyo</p>
     * @param Encryption <p>Encryption-related parameters. Encrypted regions and allowlisted users can pass this parameter, which cannot be passed in other scenarios.<br>0 or not passed: no encryption<br>1: kms-cls cloud service key encryption</p><p>Supported regions: ap-beijing, ap-guangzhou, ap-shanghai, ap-singapore, ap-bangkok, ap-jakarta, eu-frankfurt, ap-seoul, ap-tokyo</p>
     */
    public void setEncryption(Long Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get <p>Topic type</p><ul><li>0: Log topic, default value</li><li>1: Metric topic</li></ul> 
     * @return BizType <p>Topic type</p><ul><li>0: Log topic, default value</li><li>1: Metric topic</li></ul>
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set <p>Topic type</p><ul><li>0: Log topic, default value</li><li>1: Metric topic</li></ul>
     * @param BizType <p>Topic type</p><ul><li>0: Log topic, default value</li><li>1: Metric topic</li></ul>
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    /**
     * Get <p>Custom topic ID, format: custom part-User APPID. If this parameter is left empty, ID will be automatically generated.</p><ul><li>The custom part only supports lowercase letters, digits, and -, cannot start or end with -, and must be 3 to 40 characters in length.</li><li>The trailing part requires the use of - to concatenate User APPID. APPID can be queried on the page https://console.cloud.tencent.com/developer.</li><li>If this field is specified, ensure uniqueness across all regions.</li></ul> 
     * @return TopicId <p>Custom topic ID, format: custom part-User APPID. If this parameter is left empty, ID will be automatically generated.</p><ul><li>The custom part only supports lowercase letters, digits, and -, cannot start or end with -, and must be 3 to 40 characters in length.</li><li>The trailing part requires the use of - to concatenate User APPID. APPID can be queried on the page https://console.cloud.tencent.com/developer.</li><li>If this field is specified, ensure uniqueness across all regions.</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Custom topic ID, format: custom part-User APPID. If this parameter is left empty, ID will be automatically generated.</p><ul><li>The custom part only supports lowercase letters, digits, and -, cannot start or end with -, and must be 3 to 40 characters in length.</li><li>The trailing part requires the use of - to concatenate User APPID. APPID can be queried on the page https://console.cloud.tencent.com/developer.</li><li>If this field is specified, ensure uniqueness across all regions.</li></ul>
     * @param TopicId <p>Custom topic ID, format: custom part-User APPID. If this parameter is left empty, ID will be automatically generated.</p><ul><li>The custom part only supports lowercase letters, digits, and -, cannot start or end with -, and must be 3 to 40 characters in length.</li><li>The trailing part requires the use of - to concatenate User APPID. APPID can be queried on the page https://console.cloud.tencent.com/developer.</li><li>If this field is specified, ensure uniqueness across all regions.</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Free authentication switch. False: turned off; true: turned on. Default false.<br>When enabled, anonymous access to the log topic will be supported for designated operations. For details, see <a href="https://www.tencentcloud.com/document/product/614/41035?from_cn_redirect=1">log topic</a>. This configuration is not supported for metric topics.</p> 
     * @return IsWebTracking <p>Free authentication switch. False: turned off; true: turned on. Default false.<br>When enabled, anonymous access to the log topic will be supported for designated operations. For details, see <a href="https://www.tencentcloud.com/document/product/614/41035?from_cn_redirect=1">log topic</a>. This configuration is not supported for metric topics.</p>
     */
    public Boolean getIsWebTracking() {
        return this.IsWebTracking;
    }

    /**
     * Set <p>Free authentication switch. False: turned off; true: turned on. Default false.<br>When enabled, anonymous access to the log topic will be supported for designated operations. For details, see <a href="https://www.tencentcloud.com/document/product/614/41035?from_cn_redirect=1">log topic</a>. This configuration is not supported for metric topics.</p>
     * @param IsWebTracking <p>Free authentication switch. False: turned off; true: turned on. Default false.<br>When enabled, anonymous access to the log topic will be supported for designated operations. For details, see <a href="https://www.tencentcloud.com/document/product/614/41035?from_cn_redirect=1">log topic</a>. This configuration is not supported for metric topics.</p>
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
     * Get <p>Billing mode</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Raw log size billing (currently only supported for some customers)</li></ul><p>Default value: 0</p> 
     * @return BillingMode <p>Billing mode</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Raw log size billing (currently only supported for some customers)</li></ul><p>Default value: 0</p>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>Billing mode</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Raw log size billing (currently only supported for some customers)</li></ul><p>Default value: 0</p>
     * @param BillingMode <p>Billing mode</p><p>Enumeration value:</p><ul><li>0: Function billing by usage</li><li>1: Raw log size billing (currently only supported for some customers)</li></ul><p>Default value: 0</p>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    public CreateTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTopicRequest(CreateTopicRequest source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
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
        if (source.Describes != null) {
            this.Describes = new String(source.Describes);
        }
        if (source.HotPeriod != null) {
            this.HotPeriod = new Long(source.HotPeriod);
        }
        if (source.Encryption != null) {
            this.Encryption = new Long(source.Encryption);
        }
        if (source.BizType != null) {
            this.BizType = new Long(source.BizType);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.IsWebTracking != null) {
            this.IsWebTracking = new Boolean(source.IsWebTracking);
        }
        if (source.Extends != null) {
            this.Extends = new TopicExtendInfo(source.Extends);
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
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoSplit", this.AutoSplit);
        this.setParamSimple(map, prefix + "MaxSplitPartitions", this.MaxSplitPartitions);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Describes", this.Describes);
        this.setParamSimple(map, prefix + "HotPeriod", this.HotPeriod);
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "IsWebTracking", this.IsWebTracking);
        this.setParamObj(map, prefix + "Extends.", this.Extends);
        this.setParamSimple(map, prefix + "IsSourceFrom", this.IsSourceFrom);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);

    }
}

