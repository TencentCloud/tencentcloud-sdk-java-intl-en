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
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Regional information</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Creation time in milliseconds</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>Cluster description information</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>VPC and network info</p>
    */
    @SerializedName("Vpcs")
    @Expose
    private VpcEndpointInfo [] Vpcs;

    /**
    * <p>AZ information</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * <p>Number of virtual hosts</p>
    */
    @SerializedName("VirtualHostNumber")
    @Expose
    private Long VirtualHostNumber;

    /**
    * <p>Number of queues</p>
    */
    @SerializedName("QueueNumber")
    @Expose
    private Long QueueNumber;

    /**
    * <p>Number of messages produced per second Unit: messages/second</p>
    */
    @SerializedName("MessagePublishRate")
    @Expose
    private Float MessagePublishRate;

    /**
    * <p>Number of accumulated messages Unit: unit</p>
    */
    @SerializedName("MessageStackNumber")
    @Expose
    private Long MessageStackNumber;

    /**
    * <p>Expiration time</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * <p>Number of channels</p>
    */
    @SerializedName("ChannelNumber")
    @Expose
    private Long ChannelNumber;

    /**
    * <p>Number of connections</p>
    */
    @SerializedName("ConnectionNumber")
    @Expose
    private Long ConnectionNumber;

    /**
    * <p>Number of consumers</p>
    */
    @SerializedName("ConsumerNumber")
    @Expose
    private Long ConsumerNumber;

    /**
    * <p>Number of Exchanges</p>
    */
    @SerializedName("ExchangeNumber")
    @Expose
    private Long ExchangeNumber;

    /**
    * <p>Cluster exception information</p>
    */
    @SerializedName("ExceptionInformation")
    @Expose
    private String ExceptionInformation;

    /**
    * <p>Instance status. 0 indicates creating in progress, 1 indicates normal, 2 indicates isolated, 3 indicates terminated, 4 - abnormal, 5 - delivery failed</p>
    */
    @SerializedName("ClusterStatus")
    @Expose
    private Long ClusterStatus;

    /**
    * <p>Automatic renewal flag. 0: default status (initial status (that is manual renewal) if no status is set by the user); 1: automatic renewal; 2: no automatic renewal (set by the user).</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>Whether to enable the mirror queue policy. 1 means enabled, 0 means disabled.</p>
    */
    @SerializedName("MirrorQueuePolicyFlag")
    @Expose
    private Long MirrorQueuePolicyFlag;

    /**
    * <p>Number of messages consumed per second Unit: messages/second</p>
    */
    @SerializedName("MessageConsumeRate")
    @Expose
    private Float MessageConsumeRate;

    /**
    * <p>Cluster version information</p>
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * <p>Billing mode. 0 - Postpaid, 1 - Prepaid</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Cluster type.</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>Message retention period Unit: hour</p>
    */
    @SerializedName("MessageRetainTime")
    @Expose
    private Long MessageRetainTime;

    /**
    * <p>Traffic ratio of sending messages</p>
    */
    @SerializedName("SendReceiveRatio")
    @Expose
    private Float SendReceiveRatio;

    /**
    * <p>Message trace retention time in hours</p>
    */
    @SerializedName("TraceTime")
    @Expose
    private Long TraceTime;

    /**
    * <p>Instance tag list</p>
    */
    @SerializedName("Tags")
    @Expose
    private RabbitMQServerlessTag [] Tags;

    /**
    * <p>Elastic scaling enabled tps</p>
    */
    @SerializedName("ElasticTpsFlag")
    @Expose
    private Boolean ElasticTpsFlag;

    /**
    * <p>Elastic tps multiple, default is 1x</p>
    */
    @SerializedName("ElasticTpsRatio")
    @Expose
    private Float ElasticTpsRatio;

    /**
    * <p>Maximum retry count</p>
    */
    @SerializedName("MaxRedeliverCount")
    @Expose
    private Long MaxRedeliverCount;

    /**
    * <p>Consumption timeout period Unit: min</p>
    */
    @SerializedName("ConsumerTimeout")
    @Expose
    private Long ConsumerTimeout;

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Cluster name.</p> 
     * @return ClusterName <p>Cluster name.</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name.</p>
     * @param ClusterName <p>Cluster name.</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>Regional information</p> 
     * @return Region <p>Regional information</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Regional information</p>
     * @param Region <p>Regional information</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Creation time in milliseconds</p> 
     * @return CreateTime <p>Creation time in milliseconds</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time in milliseconds</p>
     * @param CreateTime <p>Creation time in milliseconds</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Cluster description information</p> 
     * @return Remark <p>Cluster description information</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Cluster description information</p>
     * @param Remark <p>Cluster description information</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>VPC and network info</p> 
     * @return Vpcs <p>VPC and network info</p>
     */
    public VpcEndpointInfo [] getVpcs() {
        return this.Vpcs;
    }

    /**
     * Set <p>VPC and network info</p>
     * @param Vpcs <p>VPC and network info</p>
     */
    public void setVpcs(VpcEndpointInfo [] Vpcs) {
        this.Vpcs = Vpcs;
    }

    /**
     * Get <p>AZ information</p> 
     * @return ZoneIds <p>AZ information</p>
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>AZ information</p>
     * @param ZoneIds <p>AZ information</p>
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>Number of virtual hosts</p> 
     * @return VirtualHostNumber <p>Number of virtual hosts</p>
     */
    public Long getVirtualHostNumber() {
        return this.VirtualHostNumber;
    }

    /**
     * Set <p>Number of virtual hosts</p>
     * @param VirtualHostNumber <p>Number of virtual hosts</p>
     */
    public void setVirtualHostNumber(Long VirtualHostNumber) {
        this.VirtualHostNumber = VirtualHostNumber;
    }

    /**
     * Get <p>Number of queues</p> 
     * @return QueueNumber <p>Number of queues</p>
     */
    public Long getQueueNumber() {
        return this.QueueNumber;
    }

    /**
     * Set <p>Number of queues</p>
     * @param QueueNumber <p>Number of queues</p>
     */
    public void setQueueNumber(Long QueueNumber) {
        this.QueueNumber = QueueNumber;
    }

    /**
     * Get <p>Number of messages produced per second Unit: messages/second</p> 
     * @return MessagePublishRate <p>Number of messages produced per second Unit: messages/second</p>
     */
    public Float getMessagePublishRate() {
        return this.MessagePublishRate;
    }

    /**
     * Set <p>Number of messages produced per second Unit: messages/second</p>
     * @param MessagePublishRate <p>Number of messages produced per second Unit: messages/second</p>
     */
    public void setMessagePublishRate(Float MessagePublishRate) {
        this.MessagePublishRate = MessagePublishRate;
    }

    /**
     * Get <p>Number of accumulated messages Unit: unit</p> 
     * @return MessageStackNumber <p>Number of accumulated messages Unit: unit</p>
     */
    public Long getMessageStackNumber() {
        return this.MessageStackNumber;
    }

    /**
     * Set <p>Number of accumulated messages Unit: unit</p>
     * @param MessageStackNumber <p>Number of accumulated messages Unit: unit</p>
     */
    public void setMessageStackNumber(Long MessageStackNumber) {
        this.MessageStackNumber = MessageStackNumber;
    }

    /**
     * Get <p>Expiration time</p> 
     * @return ExpireTime <p>Expiration time</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Expiration time</p>
     * @param ExpireTime <p>Expiration time</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>Number of channels</p> 
     * @return ChannelNumber <p>Number of channels</p>
     */
    public Long getChannelNumber() {
        return this.ChannelNumber;
    }

    /**
     * Set <p>Number of channels</p>
     * @param ChannelNumber <p>Number of channels</p>
     */
    public void setChannelNumber(Long ChannelNumber) {
        this.ChannelNumber = ChannelNumber;
    }

    /**
     * Get <p>Number of connections</p> 
     * @return ConnectionNumber <p>Number of connections</p>
     */
    public Long getConnectionNumber() {
        return this.ConnectionNumber;
    }

    /**
     * Set <p>Number of connections</p>
     * @param ConnectionNumber <p>Number of connections</p>
     */
    public void setConnectionNumber(Long ConnectionNumber) {
        this.ConnectionNumber = ConnectionNumber;
    }

    /**
     * Get <p>Number of consumers</p> 
     * @return ConsumerNumber <p>Number of consumers</p>
     */
    public Long getConsumerNumber() {
        return this.ConsumerNumber;
    }

    /**
     * Set <p>Number of consumers</p>
     * @param ConsumerNumber <p>Number of consumers</p>
     */
    public void setConsumerNumber(Long ConsumerNumber) {
        this.ConsumerNumber = ConsumerNumber;
    }

    /**
     * Get <p>Number of Exchanges</p> 
     * @return ExchangeNumber <p>Number of Exchanges</p>
     */
    public Long getExchangeNumber() {
        return this.ExchangeNumber;
    }

    /**
     * Set <p>Number of Exchanges</p>
     * @param ExchangeNumber <p>Number of Exchanges</p>
     */
    public void setExchangeNumber(Long ExchangeNumber) {
        this.ExchangeNumber = ExchangeNumber;
    }

    /**
     * Get <p>Cluster exception information</p> 
     * @return ExceptionInformation <p>Cluster exception information</p>
     */
    public String getExceptionInformation() {
        return this.ExceptionInformation;
    }

    /**
     * Set <p>Cluster exception information</p>
     * @param ExceptionInformation <p>Cluster exception information</p>
     */
    public void setExceptionInformation(String ExceptionInformation) {
        this.ExceptionInformation = ExceptionInformation;
    }

    /**
     * Get <p>Instance status. 0 indicates creating in progress, 1 indicates normal, 2 indicates isolated, 3 indicates terminated, 4 - abnormal, 5 - delivery failed</p> 
     * @return ClusterStatus <p>Instance status. 0 indicates creating in progress, 1 indicates normal, 2 indicates isolated, 3 indicates terminated, 4 - abnormal, 5 - delivery failed</p>
     */
    public Long getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set <p>Instance status. 0 indicates creating in progress, 1 indicates normal, 2 indicates isolated, 3 indicates terminated, 4 - abnormal, 5 - delivery failed</p>
     * @param ClusterStatus <p>Instance status. 0 indicates creating in progress, 1 indicates normal, 2 indicates isolated, 3 indicates terminated, 4 - abnormal, 5 - delivery failed</p>
     */
    public void setClusterStatus(Long ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get <p>Automatic renewal flag. 0: default status (initial status (that is manual renewal) if no status is set by the user); 1: automatic renewal; 2: no automatic renewal (set by the user).</p> 
     * @return AutoRenewFlag <p>Automatic renewal flag. 0: default status (initial status (that is manual renewal) if no status is set by the user); 1: automatic renewal; 2: no automatic renewal (set by the user).</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>Automatic renewal flag. 0: default status (initial status (that is manual renewal) if no status is set by the user); 1: automatic renewal; 2: no automatic renewal (set by the user).</p>
     * @param AutoRenewFlag <p>Automatic renewal flag. 0: default status (initial status (that is manual renewal) if no status is set by the user); 1: automatic renewal; 2: no automatic renewal (set by the user).</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>Whether to enable the mirror queue policy. 1 means enabled, 0 means disabled.</p> 
     * @return MirrorQueuePolicyFlag <p>Whether to enable the mirror queue policy. 1 means enabled, 0 means disabled.</p>
     */
    public Long getMirrorQueuePolicyFlag() {
        return this.MirrorQueuePolicyFlag;
    }

    /**
     * Set <p>Whether to enable the mirror queue policy. 1 means enabled, 0 means disabled.</p>
     * @param MirrorQueuePolicyFlag <p>Whether to enable the mirror queue policy. 1 means enabled, 0 means disabled.</p>
     */
    public void setMirrorQueuePolicyFlag(Long MirrorQueuePolicyFlag) {
        this.MirrorQueuePolicyFlag = MirrorQueuePolicyFlag;
    }

    /**
     * Get <p>Number of messages consumed per second Unit: messages/second</p> 
     * @return MessageConsumeRate <p>Number of messages consumed per second Unit: messages/second</p>
     */
    public Float getMessageConsumeRate() {
        return this.MessageConsumeRate;
    }

    /**
     * Set <p>Number of messages consumed per second Unit: messages/second</p>
     * @param MessageConsumeRate <p>Number of messages consumed per second Unit: messages/second</p>
     */
    public void setMessageConsumeRate(Float MessageConsumeRate) {
        this.MessageConsumeRate = MessageConsumeRate;
    }

    /**
     * Get <p>Cluster version information</p> 
     * @return ClusterVersion <p>Cluster version information</p>
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set <p>Cluster version information</p>
     * @param ClusterVersion <p>Cluster version information</p>
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get <p>Billing mode. 0 - Postpaid, 1 - Prepaid</p> 
     * @return PayMode <p>Billing mode. 0 - Postpaid, 1 - Prepaid</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Billing mode. 0 - Postpaid, 1 - Prepaid</p>
     * @param PayMode <p>Billing mode. 0 - Postpaid, 1 - Prepaid</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Cluster type.</p> 
     * @return InstanceType <p>Cluster type.</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Cluster type.</p>
     * @param InstanceType <p>Cluster type.</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Message retention period Unit: hour</p> 
     * @return MessageRetainTime <p>Message retention period Unit: hour</p>
     */
    public Long getMessageRetainTime() {
        return this.MessageRetainTime;
    }

    /**
     * Set <p>Message retention period Unit: hour</p>
     * @param MessageRetainTime <p>Message retention period Unit: hour</p>
     */
    public void setMessageRetainTime(Long MessageRetainTime) {
        this.MessageRetainTime = MessageRetainTime;
    }

    /**
     * Get <p>Traffic ratio of sending messages</p> 
     * @return SendReceiveRatio <p>Traffic ratio of sending messages</p>
     */
    public Float getSendReceiveRatio() {
        return this.SendReceiveRatio;
    }

    /**
     * Set <p>Traffic ratio of sending messages</p>
     * @param SendReceiveRatio <p>Traffic ratio of sending messages</p>
     */
    public void setSendReceiveRatio(Float SendReceiveRatio) {
        this.SendReceiveRatio = SendReceiveRatio;
    }

    /**
     * Get <p>Message trace retention time in hours</p> 
     * @return TraceTime <p>Message trace retention time in hours</p>
     */
    public Long getTraceTime() {
        return this.TraceTime;
    }

    /**
     * Set <p>Message trace retention time in hours</p>
     * @param TraceTime <p>Message trace retention time in hours</p>
     */
    public void setTraceTime(Long TraceTime) {
        this.TraceTime = TraceTime;
    }

    /**
     * Get <p>Instance tag list</p> 
     * @return Tags <p>Instance tag list</p>
     */
    public RabbitMQServerlessTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Instance tag list</p>
     * @param Tags <p>Instance tag list</p>
     */
    public void setTags(RabbitMQServerlessTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Elastic scaling enabled tps</p> 
     * @return ElasticTpsFlag <p>Elastic scaling enabled tps</p>
     */
    public Boolean getElasticTpsFlag() {
        return this.ElasticTpsFlag;
    }

    /**
     * Set <p>Elastic scaling enabled tps</p>
     * @param ElasticTpsFlag <p>Elastic scaling enabled tps</p>
     */
    public void setElasticTpsFlag(Boolean ElasticTpsFlag) {
        this.ElasticTpsFlag = ElasticTpsFlag;
    }

    /**
     * Get <p>Elastic tps multiple, default is 1x</p> 
     * @return ElasticTpsRatio <p>Elastic tps multiple, default is 1x</p>
     */
    public Float getElasticTpsRatio() {
        return this.ElasticTpsRatio;
    }

    /**
     * Set <p>Elastic tps multiple, default is 1x</p>
     * @param ElasticTpsRatio <p>Elastic tps multiple, default is 1x</p>
     */
    public void setElasticTpsRatio(Float ElasticTpsRatio) {
        this.ElasticTpsRatio = ElasticTpsRatio;
    }

    /**
     * Get <p>Maximum retry count</p> 
     * @return MaxRedeliverCount <p>Maximum retry count</p>
     */
    public Long getMaxRedeliverCount() {
        return this.MaxRedeliverCount;
    }

    /**
     * Set <p>Maximum retry count</p>
     * @param MaxRedeliverCount <p>Maximum retry count</p>
     */
    public void setMaxRedeliverCount(Long MaxRedeliverCount) {
        this.MaxRedeliverCount = MaxRedeliverCount;
    }

    /**
     * Get <p>Consumption timeout period Unit: min</p> 
     * @return ConsumerTimeout <p>Consumption timeout period Unit: min</p>
     */
    public Long getConsumerTimeout() {
        return this.ConsumerTimeout;
    }

    /**
     * Set <p>Consumption timeout period Unit: min</p>
     * @param ConsumerTimeout <p>Consumption timeout period Unit: min</p>
     */
    public void setConsumerTimeout(Long ConsumerTimeout) {
        this.ConsumerTimeout = ConsumerTimeout;
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
        if (source.SendReceiveRatio != null) {
            this.SendReceiveRatio = new Float(source.SendReceiveRatio);
        }
        if (source.TraceTime != null) {
            this.TraceTime = new Long(source.TraceTime);
        }
        if (source.Tags != null) {
            this.Tags = new RabbitMQServerlessTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new RabbitMQServerlessTag(source.Tags[i]);
            }
        }
        if (source.ElasticTpsFlag != null) {
            this.ElasticTpsFlag = new Boolean(source.ElasticTpsFlag);
        }
        if (source.ElasticTpsRatio != null) {
            this.ElasticTpsRatio = new Float(source.ElasticTpsRatio);
        }
        if (source.MaxRedeliverCount != null) {
            this.MaxRedeliverCount = new Long(source.MaxRedeliverCount);
        }
        if (source.ConsumerTimeout != null) {
            this.ConsumerTimeout = new Long(source.ConsumerTimeout);
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
        this.setParamSimple(map, prefix + "SendReceiveRatio", this.SendReceiveRatio);
        this.setParamSimple(map, prefix + "TraceTime", this.TraceTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ElasticTpsFlag", this.ElasticTpsFlag);
        this.setParamSimple(map, prefix + "ElasticTpsRatio", this.ElasticTpsRatio);
        this.setParamSimple(map, prefix + "MaxRedeliverCount", this.MaxRedeliverCount);
        this.setParamSimple(map, prefix + "ConsumerTimeout", this.ConsumerTimeout);

    }
}

