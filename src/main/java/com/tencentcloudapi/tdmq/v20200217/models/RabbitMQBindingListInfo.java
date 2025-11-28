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

public class RabbitMQBindingListInfo extends AbstractModel {

    /**
    * Routing relationship ID.
    */
    @SerializedName("BindingId")
    @Expose
    private Long BindingId;

    /**
    * VhostName
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
    * Destination type. Valid values: queue and exchange.
    */
    @SerializedName("DestinationType")
    @Expose
    private String DestinationType;

    /**
    * Destination resource name.
    */
    @SerializedName("Destination")
    @Expose
    private String Destination;

    /**
    * Binds the key.
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
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Creation timestamp.
    */
    @SerializedName("CreateTs")
    @Expose
    private Long CreateTs;

    /**
    * Modification timestamp.
    */
    @SerializedName("ModifyTs")
    @Expose
    private Long ModifyTs;

    /**
     * Get Routing relationship ID. 
     * @return BindingId Routing relationship ID.
     */
    public Long getBindingId() {
        return this.BindingId;
    }

    /**
     * Set Routing relationship ID.
     * @param BindingId Routing relationship ID.
     */
    public void setBindingId(Long BindingId) {
        this.BindingId = BindingId;
    }

    /**
     * Get VhostName 
     * @return VirtualHost VhostName
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set VhostName
     * @param VirtualHost VhostName
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
     * Get Destination type. Valid values: queue and exchange. 
     * @return DestinationType Destination type. Valid values: queue and exchange.
     */
    public String getDestinationType() {
        return this.DestinationType;
    }

    /**
     * Set Destination type. Valid values: queue and exchange.
     * @param DestinationType Destination type. Valid values: queue and exchange.
     */
    public void setDestinationType(String DestinationType) {
        this.DestinationType = DestinationType;
    }

    /**
     * Get Destination resource name. 
     * @return Destination Destination resource name.
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set Destination resource name.
     * @param Destination Destination resource name.
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * Get Binds the key. 
     * @return RoutingKey Binds the key.
     */
    public String getRoutingKey() {
        return this.RoutingKey;
    }

    /**
     * Set Binds the key.
     * @param RoutingKey Binds the key.
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
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time. 
     * @return ModifyTime Modification time.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time.
     * @param ModifyTime Modification time.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Creation timestamp. 
     * @return CreateTs Creation timestamp.
     */
    public Long getCreateTs() {
        return this.CreateTs;
    }

    /**
     * Set Creation timestamp.
     * @param CreateTs Creation timestamp.
     */
    public void setCreateTs(Long CreateTs) {
        this.CreateTs = CreateTs;
    }

    /**
     * Get Modification timestamp. 
     * @return ModifyTs Modification timestamp.
     */
    public Long getModifyTs() {
        return this.ModifyTs;
    }

    /**
     * Set Modification timestamp.
     * @param ModifyTs Modification timestamp.
     */
    public void setModifyTs(Long ModifyTs) {
        this.ModifyTs = ModifyTs;
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
        this.setParamSimple(map, prefix + "BindingId", this.BindingId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "DestinationType", this.DestinationType);
        this.setParamSimple(map, prefix + "Destination", this.Destination);
        this.setParamSimple(map, prefix + "RoutingKey", this.RoutingKey);
        this.setParamSimple(map, prefix + "SourceExchangeType", this.SourceExchangeType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTs", this.CreateTs);
        this.setParamSimple(map, prefix + "ModifyTs", this.ModifyTs);

    }
}

