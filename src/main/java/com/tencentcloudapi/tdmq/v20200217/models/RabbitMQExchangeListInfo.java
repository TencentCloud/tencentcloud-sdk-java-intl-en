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

public class RabbitMQExchangeListInfo extends AbstractModel {

    /**
    * Exchange name.
    */
    @SerializedName("ExchangeName")
    @Expose
    private String ExchangeName;

    /**
    * Remarks

Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Exchange type. Valid values: "fanout", "direct", "topic", "headers".
    */
    @SerializedName("ExchangeType")
    @Expose
    private String ExchangeType;

    /**
    * Specifies the Host name of the Virtual switch.
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * Exchange creator. "system": "created by the system"; "user": "created by a user".
    */
    @SerializedName("ExchangeCreator")
    @Expose
    private String ExchangeCreator;

    /**
    * Exchange creation time.
    */
    @SerializedName("CreateTimeStamp")
    @Expose
    private String CreateTimeStamp;

    /**
    * Exchange modification time.
    */
    @SerializedName("ModTimeStamp")
    @Expose
    private String ModTimeStamp;

    /**
    * Input message rate.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MessageRateIn")
    @Expose
    private Float MessageRateIn;

    /**
    * Indicates the output message rate.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MessageRateOut")
    @Expose
    private Float MessageRateOut;

    /**
    * Whether the exchange is a durable one. true: durable; false: non-durable.
    */
    @SerializedName("Durable")
    @Expose
    private Boolean Durable;

    /**
    * Whether automatic deletion is set for the exchange. true: automatic deletion set; false: automatic deletion not set.
    */
    @SerializedName("AutoDelete")
    @Expose
    private Boolean AutoDelete;

    /**
    * Whether the exchange is an internal one. true: internal exchange.
    */
    @SerializedName("Internal")
    @Expose
    private Boolean Internal;

    /**
    * Instance ID of the exchange.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Effective policy name.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * Extended parameters of the key-value object type.
    */
    @SerializedName("Arguments")
    @Expose
    private String Arguments;

    /**
    * Number of unscheduled delayed messages.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MessagesDelayed")
    @Expose
    private Long MessagesDelayed;

    /**
    * Creation time timestamp.
    */
    @SerializedName("CreateTs")
    @Expose
    private Long CreateTs;

    /**
    * Modification time timestamp.
    */
    @SerializedName("ModifyTs")
    @Expose
    private Long ModifyTs;

    /**
     * Get Exchange name. 
     * @return ExchangeName Exchange name.
     */
    public String getExchangeName() {
        return this.ExchangeName;
    }

    /**
     * Set Exchange name.
     * @param ExchangeName Exchange name.
     */
    public void setExchangeName(String ExchangeName) {
        this.ExchangeName = ExchangeName;
    }

    /**
     * Get Remarks

Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Remark Remarks

Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks

Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Remark Remarks

Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Exchange type. Valid values: "fanout", "direct", "topic", "headers". 
     * @return ExchangeType Exchange type. Valid values: "fanout", "direct", "topic", "headers".
     */
    public String getExchangeType() {
        return this.ExchangeType;
    }

    /**
     * Set Exchange type. Valid values: "fanout", "direct", "topic", "headers".
     * @param ExchangeType Exchange type. Valid values: "fanout", "direct", "topic", "headers".
     */
    public void setExchangeType(String ExchangeType) {
        this.ExchangeType = ExchangeType;
    }

    /**
     * Get Specifies the Host name of the Virtual switch. 
     * @return VirtualHost Specifies the Host name of the Virtual switch.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Specifies the Host name of the Virtual switch.
     * @param VirtualHost Specifies the Host name of the Virtual switch.
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get Exchange creator. "system": "created by the system"; "user": "created by a user". 
     * @return ExchangeCreator Exchange creator. "system": "created by the system"; "user": "created by a user".
     */
    public String getExchangeCreator() {
        return this.ExchangeCreator;
    }

    /**
     * Set Exchange creator. "system": "created by the system"; "user": "created by a user".
     * @param ExchangeCreator Exchange creator. "system": "created by the system"; "user": "created by a user".
     */
    public void setExchangeCreator(String ExchangeCreator) {
        this.ExchangeCreator = ExchangeCreator;
    }

    /**
     * Get Exchange creation time. 
     * @return CreateTimeStamp Exchange creation time.
     */
    public String getCreateTimeStamp() {
        return this.CreateTimeStamp;
    }

    /**
     * Set Exchange creation time.
     * @param CreateTimeStamp Exchange creation time.
     */
    public void setCreateTimeStamp(String CreateTimeStamp) {
        this.CreateTimeStamp = CreateTimeStamp;
    }

    /**
     * Get Exchange modification time. 
     * @return ModTimeStamp Exchange modification time.
     */
    public String getModTimeStamp() {
        return this.ModTimeStamp;
    }

    /**
     * Set Exchange modification time.
     * @param ModTimeStamp Exchange modification time.
     */
    public void setModTimeStamp(String ModTimeStamp) {
        this.ModTimeStamp = ModTimeStamp;
    }

    /**
     * Get Input message rate.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MessageRateIn Input message rate.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Float getMessageRateIn() {
        return this.MessageRateIn;
    }

    /**
     * Set Input message rate.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MessageRateIn Input message rate.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMessageRateIn(Float MessageRateIn) {
        this.MessageRateIn = MessageRateIn;
    }

    /**
     * Get Indicates the output message rate.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MessageRateOut Indicates the output message rate.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Float getMessageRateOut() {
        return this.MessageRateOut;
    }

    /**
     * Set Indicates the output message rate.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MessageRateOut Indicates the output message rate.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMessageRateOut(Float MessageRateOut) {
        this.MessageRateOut = MessageRateOut;
    }

    /**
     * Get Whether the exchange is a durable one. true: durable; false: non-durable. 
     * @return Durable Whether the exchange is a durable one. true: durable; false: non-durable.
     */
    public Boolean getDurable() {
        return this.Durable;
    }

    /**
     * Set Whether the exchange is a durable one. true: durable; false: non-durable.
     * @param Durable Whether the exchange is a durable one. true: durable; false: non-durable.
     */
    public void setDurable(Boolean Durable) {
        this.Durable = Durable;
    }

    /**
     * Get Whether automatic deletion is set for the exchange. true: automatic deletion set; false: automatic deletion not set. 
     * @return AutoDelete Whether automatic deletion is set for the exchange. true: automatic deletion set; false: automatic deletion not set.
     */
    public Boolean getAutoDelete() {
        return this.AutoDelete;
    }

    /**
     * Set Whether automatic deletion is set for the exchange. true: automatic deletion set; false: automatic deletion not set.
     * @param AutoDelete Whether automatic deletion is set for the exchange. true: automatic deletion set; false: automatic deletion not set.
     */
    public void setAutoDelete(Boolean AutoDelete) {
        this.AutoDelete = AutoDelete;
    }

    /**
     * Get Whether the exchange is an internal one. true: internal exchange. 
     * @return Internal Whether the exchange is an internal one. true: internal exchange.
     */
    public Boolean getInternal() {
        return this.Internal;
    }

    /**
     * Set Whether the exchange is an internal one. true: internal exchange.
     * @param Internal Whether the exchange is an internal one. true: internal exchange.
     */
    public void setInternal(Boolean Internal) {
        this.Internal = Internal;
    }

    /**
     * Get Instance ID of the exchange. 
     * @return InstanceId Instance ID of the exchange.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID of the exchange.
     * @param InstanceId Instance ID of the exchange.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Effective policy name.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Policy Effective policy name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set Effective policy name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Policy Effective policy name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get Extended parameters of the key-value object type. 
     * @return Arguments Extended parameters of the key-value object type.
     */
    public String getArguments() {
        return this.Arguments;
    }

    /**
     * Set Extended parameters of the key-value object type.
     * @param Arguments Extended parameters of the key-value object type.
     */
    public void setArguments(String Arguments) {
        this.Arguments = Arguments;
    }

    /**
     * Get Number of unscheduled delayed messages.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MessagesDelayed Number of unscheduled delayed messages.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getMessagesDelayed() {
        return this.MessagesDelayed;
    }

    /**
     * Set Number of unscheduled delayed messages.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MessagesDelayed Number of unscheduled delayed messages.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMessagesDelayed(Long MessagesDelayed) {
        this.MessagesDelayed = MessagesDelayed;
    }

    /**
     * Get Creation time timestamp. 
     * @return CreateTs Creation time timestamp.
     */
    public Long getCreateTs() {
        return this.CreateTs;
    }

    /**
     * Set Creation time timestamp.
     * @param CreateTs Creation time timestamp.
     */
    public void setCreateTs(Long CreateTs) {
        this.CreateTs = CreateTs;
    }

    /**
     * Get Modification time timestamp. 
     * @return ModifyTs Modification time timestamp.
     */
    public Long getModifyTs() {
        return this.ModifyTs;
    }

    /**
     * Set Modification time timestamp.
     * @param ModifyTs Modification time timestamp.
     */
    public void setModifyTs(Long ModifyTs) {
        this.ModifyTs = ModifyTs;
    }

    public RabbitMQExchangeListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQExchangeListInfo(RabbitMQExchangeListInfo source) {
        if (source.ExchangeName != null) {
            this.ExchangeName = new String(source.ExchangeName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ExchangeType != null) {
            this.ExchangeType = new String(source.ExchangeType);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.ExchangeCreator != null) {
            this.ExchangeCreator = new String(source.ExchangeCreator);
        }
        if (source.CreateTimeStamp != null) {
            this.CreateTimeStamp = new String(source.CreateTimeStamp);
        }
        if (source.ModTimeStamp != null) {
            this.ModTimeStamp = new String(source.ModTimeStamp);
        }
        if (source.MessageRateIn != null) {
            this.MessageRateIn = new Float(source.MessageRateIn);
        }
        if (source.MessageRateOut != null) {
            this.MessageRateOut = new Float(source.MessageRateOut);
        }
        if (source.Durable != null) {
            this.Durable = new Boolean(source.Durable);
        }
        if (source.AutoDelete != null) {
            this.AutoDelete = new Boolean(source.AutoDelete);
        }
        if (source.Internal != null) {
            this.Internal = new Boolean(source.Internal);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.Arguments != null) {
            this.Arguments = new String(source.Arguments);
        }
        if (source.MessagesDelayed != null) {
            this.MessagesDelayed = new Long(source.MessagesDelayed);
        }
        if (source.CreateTs != null) {
            this.CreateTs = new Long(source.CreateTs);
        }
        if (source.ModifyTs != null) {
            this.ModifyTs = new Long(source.ModifyTs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExchangeName", this.ExchangeName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ExchangeType", this.ExchangeType);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "ExchangeCreator", this.ExchangeCreator);
        this.setParamSimple(map, prefix + "CreateTimeStamp", this.CreateTimeStamp);
        this.setParamSimple(map, prefix + "ModTimeStamp", this.ModTimeStamp);
        this.setParamSimple(map, prefix + "MessageRateIn", this.MessageRateIn);
        this.setParamSimple(map, prefix + "MessageRateOut", this.MessageRateOut);
        this.setParamSimple(map, prefix + "Durable", this.Durable);
        this.setParamSimple(map, prefix + "AutoDelete", this.AutoDelete);
        this.setParamSimple(map, prefix + "Internal", this.Internal);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Arguments", this.Arguments);
        this.setParamSimple(map, prefix + "MessagesDelayed", this.MessagesDelayed);
        this.setParamSimple(map, prefix + "CreateTs", this.CreateTs);
        this.setParamSimple(map, prefix + "ModifyTs", this.ModifyTs);

    }
}

