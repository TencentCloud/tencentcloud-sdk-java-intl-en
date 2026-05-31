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

public class RocketMQGroupConfig extends AbstractModel {

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * consumer group name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Broadcast enabled
    */
    @SerializedName("ConsumeBroadcastEnable")
    @Expose
    private Boolean ConsumeBroadcastEnable;

    /**
    * Whether to enable consumption
    */
    @SerializedName("ConsumeEnable")
    @Expose
    private Boolean ConsumeEnable;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Protocol type, support the following enumeration value
TCP;
HTTP;
    */
    @SerializedName("ConsumerGroupType")
    @Expose
    private String ConsumerGroupType;

    /**
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get consumer group name 
     * @return GroupName consumer group name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set consumer group name
     * @param GroupName consumer group name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Broadcast enabled 
     * @return ConsumeBroadcastEnable Broadcast enabled
     */
    public Boolean getConsumeBroadcastEnable() {
        return this.ConsumeBroadcastEnable;
    }

    /**
     * Set Broadcast enabled
     * @param ConsumeBroadcastEnable Broadcast enabled
     */
    public void setConsumeBroadcastEnable(Boolean ConsumeBroadcastEnable) {
        this.ConsumeBroadcastEnable = ConsumeBroadcastEnable;
    }

    /**
     * Get Whether to enable consumption 
     * @return ConsumeEnable Whether to enable consumption
     */
    public Boolean getConsumeEnable() {
        return this.ConsumeEnable;
    }

    /**
     * Set Whether to enable consumption
     * @param ConsumeEnable Whether to enable consumption
     */
    public void setConsumeEnable(Boolean ConsumeEnable) {
        this.ConsumeEnable = ConsumeEnable;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Protocol type, support the following enumeration value
TCP;
HTTP; 
     * @return ConsumerGroupType Protocol type, support the following enumeration value
TCP;
HTTP;
     */
    public String getConsumerGroupType() {
        return this.ConsumerGroupType;
    }

    /**
     * Set Protocol type, support the following enumeration value
TCP;
HTTP;
     * @param ConsumerGroupType Protocol type, support the following enumeration value
TCP;
HTTP;
     */
    public void setConsumerGroupType(String ConsumerGroupType) {
        this.ConsumerGroupType = ConsumerGroupType;
    }

    public RocketMQGroupConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQGroupConfig(RocketMQGroupConfig source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ConsumeBroadcastEnable != null) {
            this.ConsumeBroadcastEnable = new Boolean(source.ConsumeBroadcastEnable);
        }
        if (source.ConsumeEnable != null) {
            this.ConsumeEnable = new Boolean(source.ConsumeEnable);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ConsumerGroupType != null) {
            this.ConsumerGroupType = new String(source.ConsumerGroupType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ConsumeBroadcastEnable", this.ConsumeBroadcastEnable);
        this.setParamSimple(map, prefix + "ConsumeEnable", this.ConsumeEnable);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ConsumerGroupType", this.ConsumerGroupType);

    }
}

