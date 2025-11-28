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

public class ModifyRocketMQInstanceRequest extends AbstractModel {

    /**
    * Dedicated Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Instance Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Instance message retention time, in hours
    */
    @SerializedName("MessageRetention")
    @Expose
    private Long MessageRetention;

    /**
    * Whether to enable deletion protection
    */
    @SerializedName("EnableDeletionProtection")
    @Expose
    private Boolean EnableDeletionProtection;

    /**
    * Controls the TPS ratio for producing and consuming messages. Value range: 0–1. Default value: 0.5.
    */
    @SerializedName("SendReceiveRatio")
    @Expose
    private Float SendReceiveRatio;

    /**
     * Get Dedicated Instance ID 
     * @return InstanceId Dedicated Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Dedicated Instance ID
     * @param InstanceId Dedicated Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name 
     * @return Name Instance name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Instance name
     * @param Name Instance name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Instance Remarks 
     * @return Remark Instance Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Instance Remarks
     * @param Remark Instance Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Instance message retention time, in hours 
     * @return MessageRetention Instance message retention time, in hours
     */
    public Long getMessageRetention() {
        return this.MessageRetention;
    }

    /**
     * Set Instance message retention time, in hours
     * @param MessageRetention Instance message retention time, in hours
     */
    public void setMessageRetention(Long MessageRetention) {
        this.MessageRetention = MessageRetention;
    }

    /**
     * Get Whether to enable deletion protection 
     * @return EnableDeletionProtection Whether to enable deletion protection
     */
    public Boolean getEnableDeletionProtection() {
        return this.EnableDeletionProtection;
    }

    /**
     * Set Whether to enable deletion protection
     * @param EnableDeletionProtection Whether to enable deletion protection
     */
    public void setEnableDeletionProtection(Boolean EnableDeletionProtection) {
        this.EnableDeletionProtection = EnableDeletionProtection;
    }

    /**
     * Get Controls the TPS ratio for producing and consuming messages. Value range: 0–1. Default value: 0.5. 
     * @return SendReceiveRatio Controls the TPS ratio for producing and consuming messages. Value range: 0–1. Default value: 0.5.
     */
    public Float getSendReceiveRatio() {
        return this.SendReceiveRatio;
    }

    /**
     * Set Controls the TPS ratio for producing and consuming messages. Value range: 0–1. Default value: 0.5.
     * @param SendReceiveRatio Controls the TPS ratio for producing and consuming messages. Value range: 0–1. Default value: 0.5.
     */
    public void setSendReceiveRatio(Float SendReceiveRatio) {
        this.SendReceiveRatio = SendReceiveRatio;
    }

    public ModifyRocketMQInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRocketMQInstanceRequest(ModifyRocketMQInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MessageRetention != null) {
            this.MessageRetention = new Long(source.MessageRetention);
        }
        if (source.EnableDeletionProtection != null) {
            this.EnableDeletionProtection = new Boolean(source.EnableDeletionProtection);
        }
        if (source.SendReceiveRatio != null) {
            this.SendReceiveRatio = new Float(source.SendReceiveRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MessageRetention", this.MessageRetention);
        this.setParamSimple(map, prefix + "EnableDeletionProtection", this.EnableDeletionProtection);
        this.setParamSimple(map, prefix + "SendReceiveRatio", this.SendReceiveRatio);

    }
}

