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

public class RabbitMQClusterInfo extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Creation time in milliseconds. unix timestamp.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Cluster description information
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 
    */
    @SerializedName("Vpcs")
    @Expose
    private VpcEndpointInfo [] Vpcs;

    /**
    * AZ information
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * 
    */
    @SerializedName("VirtualHostNumber")
    @Expose
    private Long VirtualHostNumber;

    /**
    * 
    */
    @SerializedName("QueueNumber")
    @Expose
    private Long QueueNumber;

    /**
    * 
    */
    @SerializedName("MessagePublishRate")
    @Expose
    private Float MessagePublishRate;

    /**
    * 
    */
    @SerializedName("MessageStackNumber")
    @Expose
    private Long MessageStackNumber;

    /**
    * Specifies the instance expiration time in milliseconds as a unix timestamp. the value is 0 for pay-as-you-go resources.
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 
    */
    @SerializedName("ChannelNumber")
    @Expose
    private Long ChannelNumber;

    /**
    * 
    */
    @SerializedName("ConnectionNumber")
    @Expose
    private Long ConnectionNumber;

    /**
    * 
    */
    @SerializedName("ConsumerNumber")
    @Expose
    private Long ConsumerNumber;

    /**
    * 
    */
    @SerializedName("ExchangeNumber")
    @Expose
    private Long ExchangeNumber;

    /**
    * Cluster exception information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExceptionInformation")
    @Expose
    private String ExceptionInformation;

    /**
    * Instance status. 0: creating; 1: normal; 2: isolating; 3: terminated; 4: abnormal; 5: delivery failed.
    */
    @SerializedName("ClusterStatus")
    @Expose
    private Long ClusterStatus;

    /**
    * Auto-renewal flag. 0 indicates the default status (If the default status is not configured, manual renewal is enabled), 1 indicates auto-renewal, and 2 indicates explicitly no auto-renewal (configured by the user).
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Whether the image queue policy is enabled. 1: enabled; 0: disabled.
    */
    @SerializedName("MirrorQueuePolicyFlag")
    @Expose
    private Long MirrorQueuePolicyFlag;

    /**
    * Number of messages consumed per second. Unit: messages/second.
    */
    @SerializedName("MessageConsumeRate")
    @Expose
    private Float MessageConsumeRate;

    /**
    * Cluster version information.
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * Billing mode. 0: postpaid; 1: prepaid.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Instance type. 0: Exclusive Edition; 1: Serverless Edition.
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Specifies the isolation time started. unix timestamp.
    */
    @SerializedName("IsolatedTime")
    @Expose
    private Long IsolatedTime;

    /**
    * Whether it is a container instance. default true.
    */
    @SerializedName("Container")
    @Expose
    private Boolean Container;

    /**
    * Tag list
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Whether deletion protection is enabled.
    */
    @SerializedName("EnableDeletionProtection")
    @Expose
    private Boolean EnableDeletionProtection;

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
     * Get  
     * @return ClusterName 
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 
     * @param ClusterName 
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get  
     * @return Region 
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 
     * @param Region 
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Creation time in milliseconds. unix timestamp. 
     * @return CreateTime Creation time in milliseconds. unix timestamp.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time in milliseconds. unix timestamp.
     * @param CreateTime Creation time in milliseconds. unix timestamp.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Cluster description information 
     * @return Remark Cluster description information
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Cluster description information
     * @param Remark Cluster description information
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get  
     * @return Vpcs 
     */
    public VpcEndpointInfo [] getVpcs() {
        return this.Vpcs;
    }

    /**
     * Set 
     * @param Vpcs 
     */
    public void setVpcs(VpcEndpointInfo [] Vpcs) {
        this.Vpcs = Vpcs;
    }

    /**
     * Get AZ information 
     * @return ZoneIds AZ information
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set AZ information
     * @param ZoneIds AZ information
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get  
     * @return VirtualHostNumber 
     */
    public Long getVirtualHostNumber() {
        return this.VirtualHostNumber;
    }

    /**
     * Set 
     * @param VirtualHostNumber 
     */
    public void setVirtualHostNumber(Long VirtualHostNumber) {
        this.VirtualHostNumber = VirtualHostNumber;
    }

    /**
     * Get  
     * @return QueueNumber 
     */
    public Long getQueueNumber() {
        return this.QueueNumber;
    }

    /**
     * Set 
     * @param QueueNumber 
     */
    public void setQueueNumber(Long QueueNumber) {
        this.QueueNumber = QueueNumber;
    }

    /**
     * Get  
     * @return MessagePublishRate 
     */
    public Float getMessagePublishRate() {
        return this.MessagePublishRate;
    }

    /**
     * Set 
     * @param MessagePublishRate 
     */
    public void setMessagePublishRate(Float MessagePublishRate) {
        this.MessagePublishRate = MessagePublishRate;
    }

    /**
     * Get  
     * @return MessageStackNumber 
     */
    public Long getMessageStackNumber() {
        return this.MessageStackNumber;
    }

    /**
     * Set 
     * @param MessageStackNumber 
     */
    public void setMessageStackNumber(Long MessageStackNumber) {
        this.MessageStackNumber = MessageStackNumber;
    }

    /**
     * Get Specifies the instance expiration time in milliseconds as a unix timestamp. the value is 0 for pay-as-you-go resources. 
     * @return ExpireTime Specifies the instance expiration time in milliseconds as a unix timestamp. the value is 0 for pay-as-you-go resources.
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Specifies the instance expiration time in milliseconds as a unix timestamp. the value is 0 for pay-as-you-go resources.
     * @param ExpireTime Specifies the instance expiration time in milliseconds as a unix timestamp. the value is 0 for pay-as-you-go resources.
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get  
     * @return ChannelNumber 
     */
    public Long getChannelNumber() {
        return this.ChannelNumber;
    }

    /**
     * Set 
     * @param ChannelNumber 
     */
    public void setChannelNumber(Long ChannelNumber) {
        this.ChannelNumber = ChannelNumber;
    }

    /**
     * Get  
     * @return ConnectionNumber 
     */
    public Long getConnectionNumber() {
        return this.ConnectionNumber;
    }

    /**
     * Set 
     * @param ConnectionNumber 
     */
    public void setConnectionNumber(Long ConnectionNumber) {
        this.ConnectionNumber = ConnectionNumber;
    }

    /**
     * Get  
     * @return ConsumerNumber 
     */
    public Long getConsumerNumber() {
        return this.ConsumerNumber;
    }

    /**
     * Set 
     * @param ConsumerNumber 
     */
    public void setConsumerNumber(Long ConsumerNumber) {
        this.ConsumerNumber = ConsumerNumber;
    }

    /**
     * Get  
     * @return ExchangeNumber 
     */
    public Long getExchangeNumber() {
        return this.ExchangeNumber;
    }

    /**
     * Set 
     * @param ExchangeNumber 
     */
    public void setExchangeNumber(Long ExchangeNumber) {
        this.ExchangeNumber = ExchangeNumber;
    }

    /**
     * Get Cluster exception information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExceptionInformation Cluster exception information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExceptionInformation() {
        return this.ExceptionInformation;
    }

    /**
     * Set Cluster exception information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExceptionInformation Cluster exception information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExceptionInformation(String ExceptionInformation) {
        this.ExceptionInformation = ExceptionInformation;
    }

    /**
     * Get Instance status. 0: creating; 1: normal; 2: isolating; 3: terminated; 4: abnormal; 5: delivery failed. 
     * @return ClusterStatus Instance status. 0: creating; 1: normal; 2: isolating; 3: terminated; 4: abnormal; 5: delivery failed.
     */
    public Long getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set Instance status. 0: creating; 1: normal; 2: isolating; 3: terminated; 4: abnormal; 5: delivery failed.
     * @param ClusterStatus Instance status. 0: creating; 1: normal; 2: isolating; 3: terminated; 4: abnormal; 5: delivery failed.
     */
    public void setClusterStatus(Long ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get Auto-renewal flag. 0 indicates the default status (If the default status is not configured, manual renewal is enabled), 1 indicates auto-renewal, and 2 indicates explicitly no auto-renewal (configured by the user). 
     * @return AutoRenewFlag Auto-renewal flag. 0 indicates the default status (If the default status is not configured, manual renewal is enabled), 1 indicates auto-renewal, and 2 indicates explicitly no auto-renewal (configured by the user).
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag. 0 indicates the default status (If the default status is not configured, manual renewal is enabled), 1 indicates auto-renewal, and 2 indicates explicitly no auto-renewal (configured by the user).
     * @param AutoRenewFlag Auto-renewal flag. 0 indicates the default status (If the default status is not configured, manual renewal is enabled), 1 indicates auto-renewal, and 2 indicates explicitly no auto-renewal (configured by the user).
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Whether the image queue policy is enabled. 1: enabled; 0: disabled. 
     * @return MirrorQueuePolicyFlag Whether the image queue policy is enabled. 1: enabled; 0: disabled.
     */
    public Long getMirrorQueuePolicyFlag() {
        return this.MirrorQueuePolicyFlag;
    }

    /**
     * Set Whether the image queue policy is enabled. 1: enabled; 0: disabled.
     * @param MirrorQueuePolicyFlag Whether the image queue policy is enabled. 1: enabled; 0: disabled.
     */
    public void setMirrorQueuePolicyFlag(Long MirrorQueuePolicyFlag) {
        this.MirrorQueuePolicyFlag = MirrorQueuePolicyFlag;
    }

    /**
     * Get Number of messages consumed per second. Unit: messages/second. 
     * @return MessageConsumeRate Number of messages consumed per second. Unit: messages/second.
     */
    public Float getMessageConsumeRate() {
        return this.MessageConsumeRate;
    }

    /**
     * Set Number of messages consumed per second. Unit: messages/second.
     * @param MessageConsumeRate Number of messages consumed per second. Unit: messages/second.
     */
    public void setMessageConsumeRate(Float MessageConsumeRate) {
        this.MessageConsumeRate = MessageConsumeRate;
    }

    /**
     * Get Cluster version information. 
     * @return ClusterVersion Cluster version information.
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set Cluster version information.
     * @param ClusterVersion Cluster version information.
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get Billing mode. 0: postpaid; 1: prepaid. 
     * @return PayMode Billing mode. 0: postpaid; 1: prepaid.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. 0: postpaid; 1: prepaid.
     * @param PayMode Billing mode. 0: postpaid; 1: prepaid.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Instance type. 0: Exclusive Edition; 1: Serverless Edition. 
     * @return InstanceType Instance type. 0: Exclusive Edition; 1: Serverless Edition.
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. 0: Exclusive Edition; 1: Serverless Edition.
     * @param InstanceType Instance type. 0: Exclusive Edition; 1: Serverless Edition.
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Specifies the isolation time started. unix timestamp. 
     * @return IsolatedTime Specifies the isolation time started. unix timestamp.
     */
    public Long getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set Specifies the isolation time started. unix timestamp.
     * @param IsolatedTime Specifies the isolation time started. unix timestamp.
     */
    public void setIsolatedTime(Long IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get Whether it is a container instance. default true. 
     * @return Container Whether it is a container instance. default true.
     */
    public Boolean getContainer() {
        return this.Container;
    }

    /**
     * Set Whether it is a container instance. default true.
     * @param Container Whether it is a container instance. default true.
     */
    public void setContainer(Boolean Container) {
        this.Container = Container;
    }

    /**
     * Get Tag list 
     * @return Tags Tag list
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list
     * @param Tags Tag list
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether deletion protection is enabled. 
     * @return EnableDeletionProtection Whether deletion protection is enabled.
     */
    public Boolean getEnableDeletionProtection() {
        return this.EnableDeletionProtection;
    }

    /**
     * Set Whether deletion protection is enabled.
     * @param EnableDeletionProtection Whether deletion protection is enabled.
     */
    public void setEnableDeletionProtection(Boolean EnableDeletionProtection) {
        this.EnableDeletionProtection = EnableDeletionProtection;
    }

    public RabbitMQClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQClusterInfo(RabbitMQClusterInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Vpcs != null) {
            this.Vpcs = new VpcEndpointInfo[source.Vpcs.length];
            for (int i = 0; i < source.Vpcs.length; i++) {
                this.Vpcs[i] = new VpcEndpointInfo(source.Vpcs[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.VirtualHostNumber != null) {
            this.VirtualHostNumber = new Long(source.VirtualHostNumber);
        }
        if (source.QueueNumber != null) {
            this.QueueNumber = new Long(source.QueueNumber);
        }
        if (source.MessagePublishRate != null) {
            this.MessagePublishRate = new Float(source.MessagePublishRate);
        }
        if (source.MessageStackNumber != null) {
            this.MessageStackNumber = new Long(source.MessageStackNumber);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.ChannelNumber != null) {
            this.ChannelNumber = new Long(source.ChannelNumber);
        }
        if (source.ConnectionNumber != null) {
            this.ConnectionNumber = new Long(source.ConnectionNumber);
        }
        if (source.ConsumerNumber != null) {
            this.ConsumerNumber = new Long(source.ConsumerNumber);
        }
        if (source.ExchangeNumber != null) {
            this.ExchangeNumber = new Long(source.ExchangeNumber);
        }
        if (source.ExceptionInformation != null) {
            this.ExceptionInformation = new String(source.ExceptionInformation);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new Long(source.ClusterStatus);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.MirrorQueuePolicyFlag != null) {
            this.MirrorQueuePolicyFlag = new Long(source.MirrorQueuePolicyFlag);
        }
        if (source.MessageConsumeRate != null) {
            this.MessageConsumeRate = new Float(source.MessageConsumeRate);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new Long(source.IsolatedTime);
        }
        if (source.Container != null) {
            this.Container = new Boolean(source.Container);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.EnableDeletionProtection != null) {
            this.EnableDeletionProtection = new Boolean(source.EnableDeletionProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "Vpcs.", this.Vpcs);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "VirtualHostNumber", this.VirtualHostNumber);
        this.setParamSimple(map, prefix + "QueueNumber", this.QueueNumber);
        this.setParamSimple(map, prefix + "MessagePublishRate", this.MessagePublishRate);
        this.setParamSimple(map, prefix + "MessageStackNumber", this.MessageStackNumber);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ChannelNumber", this.ChannelNumber);
        this.setParamSimple(map, prefix + "ConnectionNumber", this.ConnectionNumber);
        this.setParamSimple(map, prefix + "ConsumerNumber", this.ConsumerNumber);
        this.setParamSimple(map, prefix + "ExchangeNumber", this.ExchangeNumber);
        this.setParamSimple(map, prefix + "ExceptionInformation", this.ExceptionInformation);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "MirrorQueuePolicyFlag", this.MirrorQueuePolicyFlag);
        this.setParamSimple(map, prefix + "MessageConsumeRate", this.MessageConsumeRate);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "EnableDeletionProtection", this.EnableDeletionProtection);

    }
}

