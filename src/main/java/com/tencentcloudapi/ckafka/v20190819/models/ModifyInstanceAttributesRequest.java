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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceAttributesRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Maximum retention period in minutes for instance log, which can be up to 30 days. 0 indicates not to enable the log retention period policy
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * Instance name string of up to 64 characters, which must begin with a letter and can contain letters, digits, and dashes (`-`)
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
    * Modification of the rebalancing time after upgrade
    */
    @SerializedName("RebalanceTime")
    @Expose
    private Long RebalanceTime;

    /**
    * Public network bandwidth
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
    * The size of a single message in bytes at the instance level.
    */
    @SerializedName("MaxMessageByte")
    @Expose
    private Long MaxMessageByte;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Maximum retention period in minutes for instance log, which can be up to 30 days. 0 indicates not to enable the log retention period policy 
     * @return MsgRetentionTime Maximum retention period in minutes for instance log, which can be up to 30 days. 0 indicates not to enable the log retention period policy
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set Maximum retention period in minutes for instance log, which can be up to 30 days. 0 indicates not to enable the log retention period policy
     * @param MsgRetentionTime Maximum retention period in minutes for instance log, which can be up to 30 days. 0 indicates not to enable the log retention period policy
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get Instance name string of up to 64 characters, which must begin with a letter and can contain letters, digits, and dashes (`-`) 
     * @return InstanceName Instance name string of up to 64 characters, which must begin with a letter and can contain letters, digits, and dashes (`-`)
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name string of up to 64 characters, which must begin with a letter and can contain letters, digits, and dashes (`-`)
     * @param InstanceName Instance name string of up to 64 characters, which must begin with a letter and can contain letters, digits, and dashes (`-`)
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
     * Get Modification of the rebalancing time after upgrade 
     * @return RebalanceTime Modification of the rebalancing time after upgrade
     */
    public Long getRebalanceTime() {
        return this.RebalanceTime;
    }

    /**
     * Set Modification of the rebalancing time after upgrade
     * @param RebalanceTime Modification of the rebalancing time after upgrade
     */
    public void setRebalanceTime(Long RebalanceTime) {
        this.RebalanceTime = RebalanceTime;
    }

    /**
     * Get Public network bandwidth 
     * @return PublicNetwork Public network bandwidth
     */
    public Long getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set Public network bandwidth
     * @param PublicNetwork Public network bandwidth
     */
    public void setPublicNetwork(Long PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get Dynamic disk expansion policy configuration. 
     * @return DynamicDiskConfig Dynamic disk expansion policy configuration.
     */
    public DynamicDiskConfig getDynamicDiskConfig() {
        return this.DynamicDiskConfig;
    }

    /**
     * Set Dynamic disk expansion policy configuration.
     * @param DynamicDiskConfig Dynamic disk expansion policy configuration.
     */
    public void setDynamicDiskConfig(DynamicDiskConfig DynamicDiskConfig) {
        this.DynamicDiskConfig = DynamicDiskConfig;
    }

    /**
     * Get The size of a single message in bytes at the instance level. 
     * @return MaxMessageByte The size of a single message in bytes at the instance level.
     */
    public Long getMaxMessageByte() {
        return this.MaxMessageByte;
    }

    /**
     * Set The size of a single message in bytes at the instance level.
     * @param MaxMessageByte The size of a single message in bytes at the instance level.
     */
    public void setMaxMessageByte(Long MaxMessageByte) {
        this.MaxMessageByte = MaxMessageByte;
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

    }
}

