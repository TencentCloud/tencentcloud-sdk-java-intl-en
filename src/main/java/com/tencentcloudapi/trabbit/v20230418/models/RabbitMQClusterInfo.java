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
package com.tencentcloudapi.trabbit.v20230418.models;

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
    * Cluster name.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Region information
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Creation time, in milliseconds
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Cluster description remark information
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * VPC and network information.
    */
    @SerializedName("Vpcs")
    @Expose
    private VpcEndpointInfo [] Vpcs;

    /**
    * Availability zone information
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * number of virtual hosts.
    */
    @SerializedName("VirtualHostNumber")
    @Expose
    private Long VirtualHostNumber;

    /**
    * Number of queues
    */
    @SerializedName("QueueNumber")
    @Expose
    private Long QueueNumber;

    /**
    * Number of messages produced per second (measurement unit: messages/second).
    */
    @SerializedName("MessagePublishRate")
    @Expose
    private Float MessagePublishRate;

    /**
    * Number of accumulated messages. valid values: pieces.
    */
    @SerializedName("MessageStackNumber")
    @Expose
    private Long MessageStackNumber;

    /**
    * Expiration time
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * number of channels.
    */
    @SerializedName("ChannelNumber")
    @Expose
    private Long ChannelNumber;

    /**
    * number of connections.
    */
    @SerializedName("ConnectionNumber")
    @Expose
    private Long ConnectionNumber;

    /**
    * Number of consumers.
    */
    @SerializedName("ConsumerNumber")
    @Expose
    private Long ConsumerNumber;

    /**
    * Number of Exchanges.
    */
    @SerializedName("ExchangeNumber")
    @Expose
    private Long ExchangeNumber;

    /**
    * Cluster exception information.
    */
    @SerializedName("ExceptionInformation")
    @Expose
    private String ExceptionInformation;

    /**
    * Instance status. 0 indicates creating in progress. 1 indicates normal. 2 indicates isolated. 3 indicates terminated. 4 indicates exception. 5 indicates delivery failed.
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
    * Whether the mirrored queue strategy is enabled. 1 indicates enabled, and 0 indicates not enabled.
    */
    @SerializedName("MirrorQueuePolicyFlag")
    @Expose
    private Long MirrorQueuePolicyFlag;

    /**
    * Number of messages consumed per second (measurement unit: messages/second).
    */
    @SerializedName("MessageConsumeRate")
    @Expose
    private Float MessageConsumeRate;

    /**
    * Specifies the cluster version information.
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * Billing mode. valid values: 0 (postpaid), 1 (prepaid).
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Specifies the cluster type.
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * Specifies the message retention time, in hours.
    */
    @SerializedName("MessageRetainTime")
    @Expose
    private Long MessageRetainTime;

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
     * Get Cluster name. 
     * @return ClusterName Cluster name.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name.
     * @param ClusterName Cluster name.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Region information 
     * @return Region Region information
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region information
     * @param Region Region information
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Creation time, in milliseconds 
     * @return CreateTime Creation time, in milliseconds
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time, in milliseconds
     * @param CreateTime Creation time, in milliseconds
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Cluster description remark information 
     * @return Remark Cluster description remark information
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Cluster description remark information
     * @param Remark Cluster description remark information
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get VPC and network information. 
     * @return Vpcs VPC and network information.
     */
    public VpcEndpointInfo [] getVpcs() {
        return this.Vpcs;
    }

    /**
     * Set VPC and network information.
     * @param Vpcs VPC and network information.
     */
    public void setVpcs(VpcEndpointInfo [] Vpcs) {
        this.Vpcs = Vpcs;
    }

    /**
     * Get Availability zone information 
     * @return ZoneIds Availability zone information
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Availability zone information
     * @param ZoneIds Availability zone information
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get number of virtual hosts. 
     * @return VirtualHostNumber number of virtual hosts.
     */
    public Long getVirtualHostNumber() {
        return this.VirtualHostNumber;
    }

    /**
     * Set number of virtual hosts.
     * @param VirtualHostNumber number of virtual hosts.
     */
    public void setVirtualHostNumber(Long VirtualHostNumber) {
        this.VirtualHostNumber = VirtualHostNumber;
    }

    /**
     * Get Number of queues 
     * @return QueueNumber Number of queues
     */
    public Long getQueueNumber() {
        return this.QueueNumber;
    }

    /**
     * Set Number of queues
     * @param QueueNumber Number of queues
     */
    public void setQueueNumber(Long QueueNumber) {
        this.QueueNumber = QueueNumber;
    }

    /**
     * Get Number of messages produced per second (measurement unit: messages/second). 
     * @return MessagePublishRate Number of messages produced per second (measurement unit: messages/second).
     */
    public Float getMessagePublishRate() {
        return this.MessagePublishRate;
    }

    /**
     * Set Number of messages produced per second (measurement unit: messages/second).
     * @param MessagePublishRate Number of messages produced per second (measurement unit: messages/second).
     */
    public void setMessagePublishRate(Float MessagePublishRate) {
        this.MessagePublishRate = MessagePublishRate;
    }

    /**
     * Get Number of accumulated messages. valid values: pieces. 
     * @return MessageStackNumber Number of accumulated messages. valid values: pieces.
     */
    public Long getMessageStackNumber() {
        return this.MessageStackNumber;
    }

    /**
     * Set Number of accumulated messages. valid values: pieces.
     * @param MessageStackNumber Number of accumulated messages. valid values: pieces.
     */
    public void setMessageStackNumber(Long MessageStackNumber) {
        this.MessageStackNumber = MessageStackNumber;
    }

    /**
     * Get Expiration time 
     * @return ExpireTime Expiration time
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time
     * @param ExpireTime Expiration time
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get number of channels. 
     * @return ChannelNumber number of channels.
     */
    public Long getChannelNumber() {
        return this.ChannelNumber;
    }

    /**
     * Set number of channels.
     * @param ChannelNumber number of channels.
     */
    public void setChannelNumber(Long ChannelNumber) {
        this.ChannelNumber = ChannelNumber;
    }

    /**
     * Get number of connections. 
     * @return ConnectionNumber number of connections.
     */
    public Long getConnectionNumber() {
        return this.ConnectionNumber;
    }

    /**
     * Set number of connections.
     * @param ConnectionNumber number of connections.
     */
    public void setConnectionNumber(Long ConnectionNumber) {
        this.ConnectionNumber = ConnectionNumber;
    }

    /**
     * Get Number of consumers. 
     * @return ConsumerNumber Number of consumers.
     */
    public Long getConsumerNumber() {
        return this.ConsumerNumber;
    }

    /**
     * Set Number of consumers.
     * @param ConsumerNumber Number of consumers.
     */
    public void setConsumerNumber(Long ConsumerNumber) {
        this.ConsumerNumber = ConsumerNumber;
    }

    /**
     * Get Number of Exchanges. 
     * @return ExchangeNumber Number of Exchanges.
     */
    public Long getExchangeNumber() {
        return this.ExchangeNumber;
    }

    /**
     * Set Number of Exchanges.
     * @param ExchangeNumber Number of Exchanges.
     */
    public void setExchangeNumber(Long ExchangeNumber) {
        this.ExchangeNumber = ExchangeNumber;
    }

    /**
     * Get Cluster exception information. 
     * @return ExceptionInformation Cluster exception information.
     */
    public String getExceptionInformation() {
        return this.ExceptionInformation;
    }

    /**
     * Set Cluster exception information.
     * @param ExceptionInformation Cluster exception information.
     */
    public void setExceptionInformation(String ExceptionInformation) {
        this.ExceptionInformation = ExceptionInformation;
    }

    /**
     * Get Instance status. 0 indicates creating in progress. 1 indicates normal. 2 indicates isolated. 3 indicates terminated. 4 indicates exception. 5 indicates delivery failed. 
     * @return ClusterStatus Instance status. 0 indicates creating in progress. 1 indicates normal. 2 indicates isolated. 3 indicates terminated. 4 indicates exception. 5 indicates delivery failed.
     */
    public Long getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set Instance status. 0 indicates creating in progress. 1 indicates normal. 2 indicates isolated. 3 indicates terminated. 4 indicates exception. 5 indicates delivery failed.
     * @param ClusterStatus Instance status. 0 indicates creating in progress. 1 indicates normal. 2 indicates isolated. 3 indicates terminated. 4 indicates exception. 5 indicates delivery failed.
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
     * Get Whether the mirrored queue strategy is enabled. 1 indicates enabled, and 0 indicates not enabled. 
     * @return MirrorQueuePolicyFlag Whether the mirrored queue strategy is enabled. 1 indicates enabled, and 0 indicates not enabled.
     */
    public Long getMirrorQueuePolicyFlag() {
        return this.MirrorQueuePolicyFlag;
    }

    /**
     * Set Whether the mirrored queue strategy is enabled. 1 indicates enabled, and 0 indicates not enabled.
     * @param MirrorQueuePolicyFlag Whether the mirrored queue strategy is enabled. 1 indicates enabled, and 0 indicates not enabled.
     */
    public void setMirrorQueuePolicyFlag(Long MirrorQueuePolicyFlag) {
        this.MirrorQueuePolicyFlag = MirrorQueuePolicyFlag;
    }

    /**
     * Get Number of messages consumed per second (measurement unit: messages/second). 
     * @return MessageConsumeRate Number of messages consumed per second (measurement unit: messages/second).
     */
    public Float getMessageConsumeRate() {
        return this.MessageConsumeRate;
    }

    /**
     * Set Number of messages consumed per second (measurement unit: messages/second).
     * @param MessageConsumeRate Number of messages consumed per second (measurement unit: messages/second).
     */
    public void setMessageConsumeRate(Float MessageConsumeRate) {
        this.MessageConsumeRate = MessageConsumeRate;
    }

    /**
     * Get Specifies the cluster version information. 
     * @return ClusterVersion Specifies the cluster version information.
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set Specifies the cluster version information.
     * @param ClusterVersion Specifies the cluster version information.
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get Billing mode. valid values: 0 (postpaid), 1 (prepaid). 
     * @return PayMode Billing mode. valid values: 0 (postpaid), 1 (prepaid).
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. valid values: 0 (postpaid), 1 (prepaid).
     * @param PayMode Billing mode. valid values: 0 (postpaid), 1 (prepaid).
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Specifies the cluster type. 
     * @return InstanceType Specifies the cluster type.
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Specifies the cluster type.
     * @param InstanceType Specifies the cluster type.
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Specifies the message retention time, in hours. 
     * @return MessageRetainTime Specifies the message retention time, in hours.
     */
    public Long getMessageRetainTime() {
        return this.MessageRetainTime;
    }

    /**
     * Set Specifies the message retention time, in hours.
     * @param MessageRetainTime Specifies the message retention time, in hours.
     */
    public void setMessageRetainTime(Long MessageRetainTime) {
        this.MessageRetainTime = MessageRetainTime;
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
        if (source.MessageRetainTime != null) {
            this.MessageRetainTime = new Long(source.MessageRetainTime);
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
        this.setParamSimple(map, prefix + "MessageRetainTime", this.MessageRetainTime);

    }
}

