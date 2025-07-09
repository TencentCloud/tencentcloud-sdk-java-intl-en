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

public class RabbitMQBindingListInfo extends AbstractModel {

    /**
    * binding id.
    */
    @SerializedName("BindingId")
    @Expose
    private Long BindingId;

    /**
    * Vhost parameter.
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * Source exchange name.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Target type. valid values: queue or exchange.
    */
    @SerializedName("DestinationType")
    @Expose
    private String DestinationType;

    /**
    * Target resource name.
    */
    @SerializedName("Destination")
    @Expose
    private String Destination;

    /**
    * Binding key.
    */
    @SerializedName("RoutingKey")
    @Expose
    private String RoutingKey;

    /**
    * Source exchange type.
    */
    @SerializedName("SourceExchangeType")
    @Expose
    private String SourceExchangeType;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get binding id. 
     * @return BindingId binding id.
     */
    public Long getBindingId() {
        return this.BindingId;
    }

    /**
     * Set binding id.
     * @param BindingId binding id.
     */
    public void setBindingId(Long BindingId) {
        this.BindingId = BindingId;
    }

    /**
     * Get Vhost parameter. 
     * @return VirtualHost Vhost parameter.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Vhost parameter.
     * @param VirtualHost Vhost parameter.
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get Source exchange name. 
     * @return Source Source exchange name.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Source exchange name.
     * @param Source Source exchange name.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Target type. valid values: queue or exchange. 
     * @return DestinationType Target type. valid values: queue or exchange.
     */
    public String getDestinationType() {
        return this.DestinationType;
    }

    /**
     * Set Target type. valid values: queue or exchange.
     * @param DestinationType Target type. valid values: queue or exchange.
     */
    public void setDestinationType(String DestinationType) {
        this.DestinationType = DestinationType;
    }

    /**
     * Get Target resource name. 
     * @return Destination Target resource name.
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set Target resource name.
     * @param Destination Target resource name.
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * Get Binding key. 
     * @return RoutingKey Binding key.
     */
    public String getRoutingKey() {
        return this.RoutingKey;
    }

    /**
     * Set Binding key.
     * @param RoutingKey Binding key.
     */
    public void setRoutingKey(String RoutingKey) {
        this.RoutingKey = RoutingKey;
    }

    /**
     * Get Source exchange type. 
     * @return SourceExchangeType Source exchange type.
     */
    public String getSourceExchangeType() {
        return this.SourceExchangeType;
    }

    /**
     * Set Source exchange type.
     * @param SourceExchangeType Source exchange type.
     */
    public void setSourceExchangeType(String SourceExchangeType) {
        this.SourceExchangeType = SourceExchangeType;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time 
     * @return ModifyTime Modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
     * @param ModifyTime Modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public RabbitMQBindingListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQBindingListInfo(RabbitMQBindingListInfo source) {
        if (source.BindingId != null) {
            this.BindingId = new Long(source.BindingId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.DestinationType != null) {
            this.DestinationType = new String(source.DestinationType);
        }
        if (source.Destination != null) {
            this.Destination = new String(source.Destination);
        }
        if (source.RoutingKey != null) {
            this.RoutingKey = new String(source.RoutingKey);
        }
        if (source.SourceExchangeType != null) {
            this.SourceExchangeType = new String(source.SourceExchangeType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BindingId", this.BindingId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "DestinationType", this.DestinationType);
        this.setParamSimple(map, prefix + "Destination", this.Destination);
        this.setParamSimple(map, prefix + "RoutingKey", this.RoutingKey);
        this.setParamSimple(map, prefix + "SourceExchangeType", this.SourceExchangeType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

