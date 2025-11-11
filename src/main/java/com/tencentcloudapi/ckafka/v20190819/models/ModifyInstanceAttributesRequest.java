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
    * ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Maximum retention time of instance logs, in minutes, with a value range of 1min to 90 days.
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * Specifies the Name of the ckafka cluster instance.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance configuration
    */
    @SerializedName("Config")
    @Expose
    private ModifyInstanceAttributesConfig Config;

    /**
    * Dynamic message retention policy configuration
    */
    @SerializedName("DynamicRetentionConfig")
    @Expose
    private DynamicRetentionTime DynamicRetentionConfig;

    /**
    * Specifies the execution time of a scheduled task for edition upgrade or configuration upgrade in Unix timestamp, accurate to the second.
    */
    @SerializedName("RebalanceTime")
    @Expose
    private Long RebalanceTime;

    /**
    * Public network bandwidth. minimum 3 Mbps. maximum 999 Mbps. only the pro edition supports filling in.
    */
    @SerializedName("PublicNetwork")
    @Expose
    private Long PublicNetwork;

    /**
    * Dynamic disk expansion policy configuration.
    */
    @SerializedName("DynamicDiskConfig")
    @Expose
    private DynamicDiskConfig DynamicDiskConfig;

    /**
    * Single message size at the instance level (unit: byte). value range: 1024 (excluding) to 12582912 (excluding).
    */
    @SerializedName("MaxMessageByte")
    @Expose
    private Long MaxMessageByte;

    /**
    * Whether to allow unsynchronized replicas to be elected as leader. valid values: 1 (enable), 0 (disable).
    */
    @SerializedName("UncleanLeaderElectionEnable")
    @Expose
    private Long UncleanLeaderElectionEnable;

    /**
    * Instance deletion protection switch. 1: enabled; 0: disabled.
    */
    @SerializedName("DeleteProtectionEnable")
    @Expose
    private Long DeleteProtectionEnable;

    /**
     * Get ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1). 
     * @return InstanceId ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1).
     * @param InstanceId ckafka cluster instance Id. obtain through the API [DescribeInstances](https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Maximum retention time of instance logs, in minutes, with a value range of 1min to 90 days. 
     * @return MsgRetentionTime Maximum retention time of instance logs, in minutes, with a value range of 1min to 90 days.
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set Maximum retention time of instance logs, in minutes, with a value range of 1min to 90 days.
     * @param MsgRetentionTime Maximum retention time of instance logs, in minutes, with a value range of 1min to 90 days.
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get Specifies the Name of the ckafka cluster instance. 
     * @return InstanceName Specifies the Name of the ckafka cluster instance.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Specifies the Name of the ckafka cluster instance.
     * @param InstanceName Specifies the Name of the ckafka cluster instance.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance configuration 
     * @return Config Instance configuration
     */
    public ModifyInstanceAttributesConfig getConfig() {
        return this.Config;
    }

    /**
     * Set Instance configuration
     * @param Config Instance configuration
     */
    public void setConfig(ModifyInstanceAttributesConfig Config) {
        this.Config = Config;
    }

    /**
     * Get Dynamic message retention policy configuration 
     * @return DynamicRetentionConfig Dynamic message retention policy configuration
     */
    public DynamicRetentionTime getDynamicRetentionConfig() {
        return this.DynamicRetentionConfig;
    }

    /**
     * Set Dynamic message retention policy configuration
     * @param DynamicRetentionConfig Dynamic message retention policy configuration
     */
    public void setDynamicRetentionConfig(DynamicRetentionTime DynamicRetentionConfig) {
        this.DynamicRetentionConfig = DynamicRetentionConfig;
    }

    /**
     * Get Specifies the execution time of a scheduled task for edition upgrade or configuration upgrade in Unix timestamp, accurate to the second. 
     * @return RebalanceTime Specifies the execution time of a scheduled task for edition upgrade or configuration upgrade in Unix timestamp, accurate to the second.
     */
    public Long getRebalanceTime() {
        return this.RebalanceTime;
    }

    /**
     * Set Specifies the execution time of a scheduled task for edition upgrade or configuration upgrade in Unix timestamp, accurate to the second.
     * @param RebalanceTime Specifies the execution time of a scheduled task for edition upgrade or configuration upgrade in Unix timestamp, accurate to the second.
     */
    public void setRebalanceTime(Long RebalanceTime) {
        this.RebalanceTime = RebalanceTime;
    }

    /**
     * Get Public network bandwidth. minimum 3 Mbps. maximum 999 Mbps. only the pro edition supports filling in. 
     * @return PublicNetwork Public network bandwidth. minimum 3 Mbps. maximum 999 Mbps. only the pro edition supports filling in.
     */
    public Long getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set Public network bandwidth. minimum 3 Mbps. maximum 999 Mbps. only the pro edition supports filling in.
     * @param PublicNetwork Public network bandwidth. minimum 3 Mbps. maximum 999 Mbps. only the pro edition supports filling in.
     */
    public void setPublicNetwork(Long PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get Dynamic disk expansion policy configuration. 
     * @return DynamicDiskConfig Dynamic disk expansion policy configuration.
     * @deprecated
     */
    @Deprecated
    public DynamicDiskConfig getDynamicDiskConfig() {
        return this.DynamicDiskConfig;
    }

    /**
     * Set Dynamic disk expansion policy configuration.
     * @param DynamicDiskConfig Dynamic disk expansion policy configuration.
     * @deprecated
     */
    @Deprecated
    public void setDynamicDiskConfig(DynamicDiskConfig DynamicDiskConfig) {
        this.DynamicDiskConfig = DynamicDiskConfig;
    }

    /**
     * Get Single message size at the instance level (unit: byte). value range: 1024 (excluding) to 12582912 (excluding). 
     * @return MaxMessageByte Single message size at the instance level (unit: byte). value range: 1024 (excluding) to 12582912 (excluding).
     */
    public Long getMaxMessageByte() {
        return this.MaxMessageByte;
    }

    /**
     * Set Single message size at the instance level (unit: byte). value range: 1024 (excluding) to 12582912 (excluding).
     * @param MaxMessageByte Single message size at the instance level (unit: byte). value range: 1024 (excluding) to 12582912 (excluding).
     */
    public void setMaxMessageByte(Long MaxMessageByte) {
        this.MaxMessageByte = MaxMessageByte;
    }

    /**
     * Get Whether to allow unsynchronized replicas to be elected as leader. valid values: 1 (enable), 0 (disable). 
     * @return UncleanLeaderElectionEnable Whether to allow unsynchronized replicas to be elected as leader. valid values: 1 (enable), 0 (disable).
     */
    public Long getUncleanLeaderElectionEnable() {
        return this.UncleanLeaderElectionEnable;
    }

    /**
     * Set Whether to allow unsynchronized replicas to be elected as leader. valid values: 1 (enable), 0 (disable).
     * @param UncleanLeaderElectionEnable Whether to allow unsynchronized replicas to be elected as leader. valid values: 1 (enable), 0 (disable).
     */
    public void setUncleanLeaderElectionEnable(Long UncleanLeaderElectionEnable) {
        this.UncleanLeaderElectionEnable = UncleanLeaderElectionEnable;
    }

    /**
     * Get Instance deletion protection switch. 1: enabled; 0: disabled. 
     * @return DeleteProtectionEnable Instance deletion protection switch. 1: enabled; 0: disabled.
     */
    public Long getDeleteProtectionEnable() {
        return this.DeleteProtectionEnable;
    }

    /**
     * Set Instance deletion protection switch. 1: enabled; 0: disabled.
     * @param DeleteProtectionEnable Instance deletion protection switch. 1: enabled; 0: disabled.
     */
    public void setDeleteProtectionEnable(Long DeleteProtectionEnable) {
        this.DeleteProtectionEnable = DeleteProtectionEnable;
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

    }
}

