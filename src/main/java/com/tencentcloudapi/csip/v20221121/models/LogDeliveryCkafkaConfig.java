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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogDeliveryCkafkaConfig extends AbstractModel {

    /**
    * <p>Access type</p>
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * <p>Instance id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Virtual IP VipType is 7, valid</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>The virtual port VipType is 7 valid</p>
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * <p>The domain name is valid when VipType is 1.</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Domain port VipType is 1 and valid</p>
    */
    @SerializedName("DomainPort")
    @Expose
    private String DomainPort;

    /**
    * <p>Region</p>
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * <p>Instance vpc</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Instance subnet</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Instance health status. 1: healthy, 2: warning, 3: abnormal, 4: instance does not exist</p>
    */
    @SerializedName("Healthy")
    @Expose
    private Long Healthy;

    /**
    * <p>Log type.</p>
    */
    @SerializedName("LogType")
    @Expose
    private Long LogType;

    /**
    * <p>Delivered Topic ID</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Delivered topicname</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>Delivery status</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Status information</p>
    */
    @SerializedName("StatusMessages")
    @Expose
    private String StatusMessages;

    /**
    * <p>Enable or disable. Delivery status: 1 for enabled and 0 for disabled. It is enabled by default, but disabled if there is no topic.</p>
    */
    @SerializedName("IsOpen")
    @Expose
    private Long IsOpen;

    /**
     * Get <p>Access type</p> 
     * @return VipType <p>Access type</p>
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set <p>Access type</p>
     * @param VipType <p>Access type</p>
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get <p>Instance id</p> 
     * @return InstanceId <p>Instance id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance id</p>
     * @param InstanceId <p>Instance id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Instance name.</p> 
     * @return InstanceName <p>Instance name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p>
     * @param InstanceName <p>Instance name.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Virtual IP VipType is 7, valid</p> 
     * @return Vip <p>Virtual IP VipType is 7, valid</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>Virtual IP VipType is 7, valid</p>
     * @param Vip <p>Virtual IP VipType is 7, valid</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>The virtual port VipType is 7 valid</p> 
     * @return Vport <p>The virtual port VipType is 7 valid</p>
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set <p>The virtual port VipType is 7 valid</p>
     * @param Vport <p>The virtual port VipType is 7 valid</p>
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>The domain name is valid when VipType is 1.</p> 
     * @return Domain <p>The domain name is valid when VipType is 1.</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>The domain name is valid when VipType is 1.</p>
     * @param Domain <p>The domain name is valid when VipType is 1.</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Domain port VipType is 1 and valid</p> 
     * @return DomainPort <p>Domain port VipType is 1 and valid</p>
     */
    public String getDomainPort() {
        return this.DomainPort;
    }

    /**
     * Set <p>Domain port VipType is 1 and valid</p>
     * @param DomainPort <p>Domain port VipType is 1 and valid</p>
     */
    public void setDomainPort(String DomainPort) {
        this.DomainPort = DomainPort;
    }

    /**
     * Get <p>Region</p> 
     * @return RegionId <p>Region</p>
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>Region</p>
     * @param RegionId <p>Region</p>
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>Instance vpc</p> 
     * @return VpcId <p>Instance vpc</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>Instance vpc</p>
     * @param VpcId <p>Instance vpc</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Instance subnet</p> 
     * @return SubnetId <p>Instance subnet</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Instance subnet</p>
     * @param SubnetId <p>Instance subnet</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Instance health status. 1: healthy, 2: warning, 3: abnormal, 4: instance does not exist</p> 
     * @return Healthy <p>Instance health status. 1: healthy, 2: warning, 3: abnormal, 4: instance does not exist</p>
     */
    public Long getHealthy() {
        return this.Healthy;
    }

    /**
     * Set <p>Instance health status. 1: healthy, 2: warning, 3: abnormal, 4: instance does not exist</p>
     * @param Healthy <p>Instance health status. 1: healthy, 2: warning, 3: abnormal, 4: instance does not exist</p>
     */
    public void setHealthy(Long Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get <p>Log type.</p> 
     * @return LogType <p>Log type.</p>
     */
    public Long getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>Log type.</p>
     * @param LogType <p>Log type.</p>
     */
    public void setLogType(Long LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>Delivered Topic ID</p> 
     * @return TopicId <p>Delivered Topic ID</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Delivered Topic ID</p>
     * @param TopicId <p>Delivered Topic ID</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Delivered topicname</p> 
     * @return TopicName <p>Delivered topicname</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>Delivered topicname</p>
     * @param TopicName <p>Delivered topicname</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>Delivery status</p> 
     * @return Status <p>Delivery status</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Delivery status</p>
     * @param Status <p>Delivery status</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Status information</p> 
     * @return StatusMessages <p>Status information</p>
     */
    public String getStatusMessages() {
        return this.StatusMessages;
    }

    /**
     * Set <p>Status information</p>
     * @param StatusMessages <p>Status information</p>
     */
    public void setStatusMessages(String StatusMessages) {
        this.StatusMessages = StatusMessages;
    }

    /**
     * Get <p>Enable or disable. Delivery status: 1 for enabled and 0 for disabled. It is enabled by default, but disabled if there is no topic.</p> 
     * @return IsOpen <p>Enable or disable. Delivery status: 1 for enabled and 0 for disabled. It is enabled by default, but disabled if there is no topic.</p>
     */
    public Long getIsOpen() {
        return this.IsOpen;
    }

    /**
     * Set <p>Enable or disable. Delivery status: 1 for enabled and 0 for disabled. It is enabled by default, but disabled if there is no topic.</p>
     * @param IsOpen <p>Enable or disable. Delivery status: 1 for enabled and 0 for disabled. It is enabled by default, but disabled if there is no topic.</p>
     */
    public void setIsOpen(Long IsOpen) {
        this.IsOpen = IsOpen;
    }

    public LogDeliveryCkafkaConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogDeliveryCkafkaConfig(LogDeliveryCkafkaConfig source) {
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new String(source.Vport);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainPort != null) {
            this.DomainPort = new String(source.DomainPort);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Healthy != null) {
            this.Healthy = new Long(source.Healthy);
        }
        if (source.LogType != null) {
            this.LogType = new Long(source.LogType);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusMessages != null) {
            this.StatusMessages = new String(source.StatusMessages);
        }
        if (source.IsOpen != null) {
            this.IsOpen = new Long(source.IsOpen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainPort", this.DomainPort);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusMessages", this.StatusMessages);
        this.setParamSimple(map, prefix + "IsOpen", this.IsOpen);

    }
}

