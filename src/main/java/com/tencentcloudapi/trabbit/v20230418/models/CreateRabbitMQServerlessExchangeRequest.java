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

public class CreateRabbitMQServerlessExchangeRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * VHost parameter.
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * exchange name.
    */
    @SerializedName("ExchangeName")
    @Expose
    private String ExchangeName;

    /**
    * Specifies the exchange type. valid values: "fanout", "direct", "topic", "headers".
    */
    @SerializedName("ExchangeType")
    @Expose
    private String ExchangeType;

    /**
    * Specifies the remark for exchange.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Specifies whether it is a persistent exchange. when the cluster restarts, all exchanges with this field set to "false" will be cleared.
    */
    @SerializedName("Durable")
    @Expose
    private Boolean Durable;

    /**
    * Whether to auto-delete this exchange. if set to "true", the exchange will be automatically deleted when all routing relationships on the current exchange are unbound.
    */
    @SerializedName("AutoDelete")
    @Expose
    private Boolean AutoDelete;

    /**
    * Specifies whether it is an internal exchange. if set to "true", messages cannot be directly delivered to this exchange. they need to be forwarded through another exchange in the routing settings.
    */
    @SerializedName("Internal")
    @Expose
    private Boolean Internal;

    /**
    * Alternative exchange. if a message cannot be sent to the current exchange, it will be sent to this alternative exchange.
    */
    @SerializedName("AlternateExchange")
    @Expose
    private String AlternateExchange;

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
     * Get VHost parameter. 
     * @return VirtualHost VHost parameter.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set VHost parameter.
     * @param VirtualHost VHost parameter.
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get exchange name. 
     * @return ExchangeName exchange name.
     */
    public String getExchangeName() {
        return this.ExchangeName;
    }

    /**
     * Set exchange name.
     * @param ExchangeName exchange name.
     */
    public void setExchangeName(String ExchangeName) {
        this.ExchangeName = ExchangeName;
    }

    /**
     * Get Specifies the exchange type. valid values: "fanout", "direct", "topic", "headers". 
     * @return ExchangeType Specifies the exchange type. valid values: "fanout", "direct", "topic", "headers".
     */
    public String getExchangeType() {
        return this.ExchangeType;
    }

    /**
     * Set Specifies the exchange type. valid values: "fanout", "direct", "topic", "headers".
     * @param ExchangeType Specifies the exchange type. valid values: "fanout", "direct", "topic", "headers".
     */
    public void setExchangeType(String ExchangeType) {
        this.ExchangeType = ExchangeType;
    }

    /**
     * Get Specifies the remark for exchange. 
     * @return Remark Specifies the remark for exchange.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Specifies the remark for exchange.
     * @param Remark Specifies the remark for exchange.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Specifies whether it is a persistent exchange. when the cluster restarts, all exchanges with this field set to "false" will be cleared. 
     * @return Durable Specifies whether it is a persistent exchange. when the cluster restarts, all exchanges with this field set to "false" will be cleared.
     */
    public Boolean getDurable() {
        return this.Durable;
    }

    /**
     * Set Specifies whether it is a persistent exchange. when the cluster restarts, all exchanges with this field set to "false" will be cleared.
     * @param Durable Specifies whether it is a persistent exchange. when the cluster restarts, all exchanges with this field set to "false" will be cleared.
     */
    public void setDurable(Boolean Durable) {
        this.Durable = Durable;
    }

    /**
     * Get Whether to auto-delete this exchange. if set to "true", the exchange will be automatically deleted when all routing relationships on the current exchange are unbound. 
     * @return AutoDelete Whether to auto-delete this exchange. if set to "true", the exchange will be automatically deleted when all routing relationships on the current exchange are unbound.
     */
    public Boolean getAutoDelete() {
        return this.AutoDelete;
    }

    /**
     * Set Whether to auto-delete this exchange. if set to "true", the exchange will be automatically deleted when all routing relationships on the current exchange are unbound.
     * @param AutoDelete Whether to auto-delete this exchange. if set to "true", the exchange will be automatically deleted when all routing relationships on the current exchange are unbound.
     */
    public void setAutoDelete(Boolean AutoDelete) {
        this.AutoDelete = AutoDelete;
    }

    /**
     * Get Specifies whether it is an internal exchange. if set to "true", messages cannot be directly delivered to this exchange. they need to be forwarded through another exchange in the routing settings. 
     * @return Internal Specifies whether it is an internal exchange. if set to "true", messages cannot be directly delivered to this exchange. they need to be forwarded through another exchange in the routing settings.
     */
    public Boolean getInternal() {
        return this.Internal;
    }

    /**
     * Set Specifies whether it is an internal exchange. if set to "true", messages cannot be directly delivered to this exchange. they need to be forwarded through another exchange in the routing settings.
     * @param Internal Specifies whether it is an internal exchange. if set to "true", messages cannot be directly delivered to this exchange. they need to be forwarded through another exchange in the routing settings.
     */
    public void setInternal(Boolean Internal) {
        this.Internal = Internal;
    }

    /**
     * Get Alternative exchange. if a message cannot be sent to the current exchange, it will be sent to this alternative exchange. 
     * @return AlternateExchange Alternative exchange. if a message cannot be sent to the current exchange, it will be sent to this alternative exchange.
     */
    public String getAlternateExchange() {
        return this.AlternateExchange;
    }

    /**
     * Set Alternative exchange. if a message cannot be sent to the current exchange, it will be sent to this alternative exchange.
     * @param AlternateExchange Alternative exchange. if a message cannot be sent to the current exchange, it will be sent to this alternative exchange.
     */
    public void setAlternateExchange(String AlternateExchange) {
        this.AlternateExchange = AlternateExchange;
    }

    public CreateRabbitMQServerlessExchangeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRabbitMQServerlessExchangeRequest(CreateRabbitMQServerlessExchangeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.ExchangeName != null) {
            this.ExchangeName = new String(source.ExchangeName);
        }
        if (source.ExchangeType != null) {
            this.ExchangeType = new String(source.ExchangeType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
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
        if (source.AlternateExchange != null) {
            this.AlternateExchange = new String(source.AlternateExchange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "ExchangeName", this.ExchangeName);
        this.setParamSimple(map, prefix + "ExchangeType", this.ExchangeType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Durable", this.Durable);
        this.setParamSimple(map, prefix + "AutoDelete", this.AutoDelete);
        this.setParamSimple(map, prefix + "Internal", this.Internal);
        this.setParamSimple(map, prefix + "AlternateExchange", this.AlternateExchange);

    }
}

