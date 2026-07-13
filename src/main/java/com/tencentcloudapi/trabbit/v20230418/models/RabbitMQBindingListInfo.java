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
    * <p>Routing relationship id</p>
    */
    @SerializedName("BindingId")
    @Expose
    private Long BindingId;

    /**
    * <p>Vhost parameter</p>
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * <p>Source exchange name</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>Target type, queue or exchange</p>
    */
    @SerializedName("DestinationType")
    @Expose
    private String DestinationType;

    /**
    * <p>Target resource name</p>
    */
    @SerializedName("Destination")
    @Expose
    private String Destination;

    /**
    * <p>Bind key</p>
    */
    @SerializedName("RoutingKey")
    @Expose
    private String RoutingKey;

    /**
    * <p>Source exchange type</p>
    */
    @SerializedName("SourceExchangeType")
    @Expose
    private String SourceExchangeType;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Modification time.</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>Bind parameter. Parameters can be passed in during binding for header type Exchange. No need to input for other types of Exchange.</p>
    */
    @SerializedName("Arguments")
    @Expose
    private RabbitMQServerlessKeyValuePair [] Arguments;

    /**
     * Get <p>Routing relationship id</p> 
     * @return BindingId <p>Routing relationship id</p>
     */
    public Long getBindingId() {
        return this.BindingId;
    }

    /**
     * Set <p>Routing relationship id</p>
     * @param BindingId <p>Routing relationship id</p>
     */
    public void setBindingId(Long BindingId) {
        this.BindingId = BindingId;
    }

    /**
     * Get <p>Vhost parameter</p> 
     * @return VirtualHost <p>Vhost parameter</p>
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set <p>Vhost parameter</p>
     * @param VirtualHost <p>Vhost parameter</p>
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get <p>Source exchange name</p> 
     * @return Source <p>Source exchange name</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>Source exchange name</p>
     * @param Source <p>Source exchange name</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>Target type, queue or exchange</p> 
     * @return DestinationType <p>Target type, queue or exchange</p>
     */
    public String getDestinationType() {
        return this.DestinationType;
    }

    /**
     * Set <p>Target type, queue or exchange</p>
     * @param DestinationType <p>Target type, queue or exchange</p>
     */
    public void setDestinationType(String DestinationType) {
        this.DestinationType = DestinationType;
    }

    /**
     * Get <p>Target resource name</p> 
     * @return Destination <p>Target resource name</p>
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set <p>Target resource name</p>
     * @param Destination <p>Target resource name</p>
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * Get <p>Bind key</p> 
     * @return RoutingKey <p>Bind key</p>
     */
    public String getRoutingKey() {
        return this.RoutingKey;
    }

    /**
     * Set <p>Bind key</p>
     * @param RoutingKey <p>Bind key</p>
     */
    public void setRoutingKey(String RoutingKey) {
        this.RoutingKey = RoutingKey;
    }

    /**
     * Get <p>Source exchange type</p> 
     * @return SourceExchangeType <p>Source exchange type</p>
     */
    public String getSourceExchangeType() {
        return this.SourceExchangeType;
    }

    /**
     * Set <p>Source exchange type</p>
     * @param SourceExchangeType <p>Source exchange type</p>
     */
    public void setSourceExchangeType(String SourceExchangeType) {
        this.SourceExchangeType = SourceExchangeType;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Modification time.</p> 
     * @return ModifyTime <p>Modification time.</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>Modification time.</p>
     * @param ModifyTime <p>Modification time.</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>Bind parameter. Parameters can be passed in during binding for header type Exchange. No need to input for other types of Exchange.</p> 
     * @return Arguments <p>Bind parameter. Parameters can be passed in during binding for header type Exchange. No need to input for other types of Exchange.</p>
     */
    public RabbitMQServerlessKeyValuePair [] getArguments() {
        return this.Arguments;
    }

    /**
     * Set <p>Bind parameter. Parameters can be passed in during binding for header type Exchange. No need to input for other types of Exchange.</p>
     * @param Arguments <p>Bind parameter. Parameters can be passed in during binding for header type Exchange. No need to input for other types of Exchange.</p>
     */
    public void setArguments(RabbitMQServerlessKeyValuePair [] Arguments) {
        this.Arguments = Arguments;
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
        if (source.Arguments != null) {
            this.Arguments = new RabbitMQServerlessKeyValuePair[source.Arguments.length];
            for (int i = 0; i < source.Arguments.length; i++) {
                this.Arguments[i] = new RabbitMQServerlessKeyValuePair(source.Arguments[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Arguments.", this.Arguments);

    }
}

