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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceAttributesRequest extends AbstractModel {

    /**
    * <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Maximum retention time of instance log, in minutes, with a maximum of 90 days and a minimum of 1 min</p>
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * <p>ckafka cluster instance Name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Instance configuration</p>
    */
    @SerializedName("Config")
    @Expose
    private ModifyInstanceAttributesConfig Config;

    /**
    * <p>Dynamic message retention policy configuration</p>
    */
    @SerializedName("DynamicRetentionConfig")
    @Expose
    private DynamicRetentionTime DynamicRetentionConfig;

    /**
    * <p>Used to modify the scheduled task execution time for edition upgrade or upgrade version, Unix timestamp, accurate to the second</p>
    */
    @SerializedName("RebalanceTime")
    @Expose
    private Long RebalanceTime;

    /**
    * <p>Public network bandwidth: minimum 3Mbps, maximum 999Mbps. Only the Pro Edition supports filling in.</p>
    */
    @SerializedName("PublicNetwork")
    @Expose
    private Long PublicNetwork;

    /**
    * <p>Configure dynamic disk expansion policy</p>
    */
    @SerializedName("DynamicDiskConfig")
    @Expose
    private DynamicDiskConfig DynamicDiskConfig;

    /**
    * <p>Single message size at the instance level (unit: byte) Maximum 12582912 (excluding) Minimum 1024 (excluding)</p>
    */
    @SerializedName("MaxMessageByte")
    @Expose
    private Long MaxMessageByte;

    /**
    * <p>Whether to allow unsynchronized replicas to be elected as leader: 1 Enable 0 Disable</p>
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Long UncleanLeaderElectionEnable;

    /**
    * <p>Instance deletion protection switch: 1: enabled 0: disabled</p>
    */
    @SerializedName("DeleteProtectionEnable")
    @Expose
    private Long DeleteProtectionEnable;

    /**
    * <p>Message retention size at the instance level</p>Measurement unit: byte<br>Default value: -1<br><p>Message retention size at the instance level</p>
    */
    @SerializedName("RetentionBytes")
    @Expose
    private Long RetentionBytes;

    /**
    * <p>Ban Status for high-risk admin interface; true to ban high-risk adminApi; no support for turning on after closing, only supported in Pro Edition; default false, no action taken for high-risk admin interface</p>
    */
    @SerializedName("AdminSecurity")
    @Expose
    private Boolean AdminSecurity;

    /**
    * <p>The maximum idle time of a transaction ID. Uncommitted transactions that time out will be marked with expiration.</p>Value ranges from 3600000 to 604800000.<br>Unit: ms
    */
    @SerializedName("TransactionalIdExpirationMs")
    @Expose
    private Long TransactionalIdExpirationMs;

    /**
     * Get <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p> 
     * @return InstanceId <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p>
     * @param InstanceId <p>ckafka cluster instance Id, which can be obtained through the <a href="https://www.tencentcloud.com/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a> API</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Maximum retention time of instance log, in minutes, with a maximum of 90 days and a minimum of 1 min</p> 
     * @return MsgRetentionTime <p>Maximum retention time of instance log, in minutes, with a maximum of 90 days and a minimum of 1 min</p>
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set <p>Maximum retention time of instance log, in minutes, with a maximum of 90 days and a minimum of 1 min</p>
     * @param MsgRetentionTime <p>Maximum retention time of instance log, in minutes, with a maximum of 90 days and a minimum of 1 min</p>
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get <p>ckafka cluster instance Name</p> 
     * @return InstanceName <p>ckafka cluster instance Name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>ckafka cluster instance Name</p>
     * @param InstanceName <p>ckafka cluster instance Name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Instance configuration</p> 
     * @return Config <p>Instance configuration</p>
     */
    public ModifyInstanceAttributesConfig getConfig() {
        return this.Config;
    }

    /**
     * Set <p>Instance configuration</p>
     * @param Config <p>Instance configuration</p>
     */
    public void setConfig(ModifyInstanceAttributesConfig Config) {
        this.Config = Config;
    }

    /**
     * Get <p>Dynamic message retention policy configuration</p> 
     * @return DynamicRetentionConfig <p>Dynamic message retention policy configuration</p>
     */
    public DynamicRetentionTime getDynamicRetentionConfig() {
        return this.DynamicRetentionConfig;
    }

    /**
     * Set <p>Dynamic message retention policy configuration</p>
     * @param DynamicRetentionConfig <p>Dynamic message retention policy configuration</p>
     */
    public void setDynamicRetentionConfig(DynamicRetentionTime DynamicRetentionConfig) {
        this.DynamicRetentionConfig = DynamicRetentionConfig;
    }

    /**
     * Get <p>Used to modify the scheduled task execution time for edition upgrade or upgrade version, Unix timestamp, accurate to the second</p> 
     * @return RebalanceTime <p>Used to modify the scheduled task execution time for edition upgrade or upgrade version, Unix timestamp, accurate to the second</p>
     */
    public Long getRebalanceTime() {
        return this.RebalanceTime;
    }

    /**
     * Set <p>Used to modify the scheduled task execution time for edition upgrade or upgrade version, Unix timestamp, accurate to the second</p>
     * @param RebalanceTime <p>Used to modify the scheduled task execution time for edition upgrade or upgrade version, Unix timestamp, accurate to the second</p>
     */
    public void setRebalanceTime(Long RebalanceTime) {
        this.RebalanceTime = RebalanceTime;
    }

    /**
     * Get <p>Public network bandwidth: minimum 3Mbps, maximum 999Mbps. Only the Pro Edition supports filling in.</p> 
     * @return PublicNetwork <p>Public network bandwidth: minimum 3Mbps, maximum 999Mbps. Only the Pro Edition supports filling in.</p>
     */
    public Long getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set <p>Public network bandwidth: minimum 3Mbps, maximum 999Mbps. Only the Pro Edition supports filling in.</p>
     * @param PublicNetwork <p>Public network bandwidth: minimum 3Mbps, maximum 999Mbps. Only the Pro Edition supports filling in.</p>
     */
    public void setPublicNetwork(Long PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get <p>Configure dynamic disk expansion policy</p> 
     * @return DynamicDiskConfig <p>Configure dynamic disk expansion policy</p>
     * @deprecated
     */
    @Deprecated
    public DynamicDiskConfig getDynamicDiskConfig() {
        return this.DynamicDiskConfig;
    }

    /**
     * Set <p>Configure dynamic disk expansion policy</p>
     * @param DynamicDiskConfig <p>Configure dynamic disk expansion policy</p>
     * @deprecated
     */
    @Deprecated
    public void setDynamicDiskConfig(DynamicDiskConfig DynamicDiskConfig) {
        this.DynamicDiskConfig = DynamicDiskConfig;
    }

    /**
     * Get <p>Single message size at the instance level (unit: byte) Maximum 12582912 (excluding) Minimum 1024 (excluding)</p> 
     * @return MaxMessageByte <p>Single message size at the instance level (unit: byte) Maximum 12582912 (excluding) Minimum 1024 (excluding)</p>
     */
    public Long getMaxMessageByte() {
        return this.MaxMessageByte;
    }

    /**
     * Set <p>Single message size at the instance level (unit: byte) Maximum 12582912 (excluding) Minimum 1024 (excluding)</p>
     * @param MaxMessageByte <p>Single message size at the instance level (unit: byte) Maximum 12582912 (excluding) Minimum 1024 (excluding)</p>
     */
    public void setMaxMessageByte(Long MaxMessageByte) {
        this.MaxMessageByte = MaxMessageByte;
    }

    /**
     * Get <p>Whether to allow unsynchronized replicas to be elected as leader: 1 Enable 0 Disable</p> 
     * @return UncleanLeaderElectionEnable <p>Whether to allow unsynchronized replicas to be elected as leader: 1 Enable 0 Disable</p>
     */
    public Long getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set <p>Whether to allow unsynchronized replicas to be elected as leader: 1 Enable 0 Disable</p>
     * @param UncleanLeaderElectionEnable <p>Whether to allow unsynchronized replicas to be elected as leader: 1 Enable 0 Disable</p>
     */
    public void setUncleanLeaderElectionEnable(Long UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get <p>Instance deletion protection switch: 1: enabled 0: disabled</p> 
     * @return DeleteProtectionEnable <p>Instance deletion protection switch: 1: enabled 0: disabled</p>
     */
    public Long getDeleteProtectionEnable() {
        return this.DeleteProtectionEnable;
    }

    /**
     * Set <p>Instance deletion protection switch: 1: enabled 0: disabled</p>
     * @param DeleteProtectionEnable <p>Instance deletion protection switch: 1: enabled 0: disabled</p>
     */
    public void setDeleteProtectionEnable(Long DeleteProtectionEnable) {
        this.DeleteProtectionEnable = DeleteProtectionEnable;
    }

    /**
     * Get <p>Message retention size at the instance level</p>Measurement unit: byte<br>Default value: -1<br><p>Message retention size at the instance level</p> 
     * @return RetentionBytes <p>Message retention size at the instance level</p>Measurement unit: byte<br>Default value: -1<br><p>Message retention size at the instance level</p>
     */
    public Long getRetentionBytes() {
        return this.RetentionBytes;
    }

    /**
     * Set <p>Message retention size at the instance level</p>Measurement unit: byte<br>Default value: -1<br><p>Message retention size at the instance level</p>
     * @param RetentionBytes <p>Message retention size at the instance level</p>Measurement unit: byte<br>Default value: -1<br><p>Message retention size at the instance level</p>
     */
    public void setRetentionBytes(Long RetentionBytes) {
        this.RetentionBytes = RetentionBytes;
    }

    /**
     * Get <p>Ban Status for high-risk admin interface; true to ban high-risk adminApi; no support for turning on after closing, only supported in Pro Edition; default false, no action taken for high-risk admin interface</p> 
     * @return AdminSecurity <p>Ban Status for high-risk admin interface; true to ban high-risk adminApi; no support for turning on after closing, only supported in Pro Edition; default false, no action taken for high-risk admin interface</p>
     */
    public Boolean getAdminSecurity() {
        return this.AdminSecurity;
    }

    /**
     * Set <p>Ban Status for high-risk admin interface; true to ban high-risk adminApi; no support for turning on after closing, only supported in Pro Edition; default false, no action taken for high-risk admin interface</p>
     * @param AdminSecurity <p>Ban Status for high-risk admin interface; true to ban high-risk adminApi; no support for turning on after closing, only supported in Pro Edition; default false, no action taken for high-risk admin interface</p>
     */
    public void setAdminSecurity(Boolean AdminSecurity) {
        this.AdminSecurity = AdminSecurity;
    }

    /**
     * Get <p>The maximum idle time of a transaction ID. Uncommitted transactions that time out will be marked with expiration.</p>Value ranges from 3600000 to 604800000.<br>Unit: ms 
     * @return TransactionalIdExpirationMs <p>The maximum idle time of a transaction ID. Uncommitted transactions that time out will be marked with expiration.</p>Value ranges from 3600000 to 604800000.<br>Unit: ms
     */
    public Long getTransactionalIdExpirationMs() {
        return this.TransactionalIdExpirationMs;
    }

    /**
     * Set <p>The maximum idle time of a transaction ID. Uncommitted transactions that time out will be marked with expiration.</p>Value ranges from 3600000 to 604800000.<br>Unit: ms
     * @param TransactionalIdExpirationMs <p>The maximum idle time of a transaction ID. Uncommitted transactions that time out will be marked with expiration.</p>Value ranges from 3600000 to 604800000.<br>Unit: ms
     */
    public void setTransactionalIdExpirationMs(Long TransactionalIdExpirationMs) {
        this.TransactionalIdExpirationMs = TransactionalIdExpirationMs;
    }

    public ModifyInstanceAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceAttributesRequest(ModifyInstanceAttributesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MsgRetentionTime != null) {
            this.MsgRetentionTime = new Long(source.MsgRetentionTime);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Config != null) {
            this.Config = new ModifyInstanceAttributesConfig(source.Config);
        }
        if (source.DynamicRetentionConfig != null) {
            this.DynamicRetentionConfig = new DynamicRetentionTime(source.DynamicRetentionConfig);
        }
        if (source.RebalanceTime != null) {
            this.RebalanceTime = new Long(source.RebalanceTime);
        }
        if (source.PublicNetwork != null) {
            this.PublicNetwork = new Long(source.PublicNetwork);
        }
        if (source.DynamicDiskConfig != null) {
            this.DynamicDiskConfig = new DynamicDiskConfig(source.DynamicDiskConfig);
        }
        if (source.MaxMessageByte != null) {
            this.MaxMessageByte = new Long(source.MaxMessageByte);
        }
        if (source.UncleanLeaderElectionEnable != null) {
            this.UncleanLeaderElectionEnable = new Long(source.UncleanLeaderElectionEnable);
        }
        if (source.DeleteProtectionEnable != null) {
            this.DeleteProtectionEnable = new Long(source.DeleteProtectionEnable);
        }
        if (source.RetentionBytes != null) {
            this.RetentionBytes = new Long(source.RetentionBytes);
        }
        if (source.AdminSecurity != null) {
            this.AdminSecurity = new Boolean(source.AdminSecurity);
        }
        if (source.TransactionalIdExpirationMs != null) {
            this.TransactionalIdExpirationMs = new Long(source.TransactionalIdExpirationMs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MsgRetentionTime", this.MsgRetentionTime);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamObj(map, prefix + "DynamicRetentionConfig.", this.DynamicRetentionConfig);
        this.setParamSimple(map, prefix + "RebalanceTime", this.RebalanceTime);
        this.setParamSimple(map, prefix + "PublicNetwork", this.PublicNetwork);
        this.setParamObj(map, prefix + "DynamicDiskConfig.", this.DynamicDiskConfig);
        this.setParamSimple(map, prefix + "MaxMessageByte", this.MaxMessageByte);
        this.setParamSimple(map, prefix + "UncleanLeaderElectionEnable", this.UncleanLeaderElectionEnable);
        this.setParamSimple(map, prefix + "DeleteProtectionEnable", this.DeleteProtectionEnable);
        this.setParamSimple(map, prefix + "RetentionBytes", this.RetentionBytes);
        this.setParamSimple(map, prefix + "AdminSecurity", this.AdminSecurity);
        this.setParamSimple(map, prefix + "TransactionalIdExpirationMs", this.TransactionalIdExpirationMs);

    }
}

