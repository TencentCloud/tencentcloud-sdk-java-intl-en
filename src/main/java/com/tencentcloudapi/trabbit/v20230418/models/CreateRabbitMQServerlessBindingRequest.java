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

public class CreateRabbitMQServerlessBindingRequest extends AbstractModel {

    /**
    * <p>Instance Id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Vhost parameter</p>
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * <p>Source exchange</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>Target type, value queue or exchange</p>
    */
    @SerializedName("DestinationType")
    @Expose
    private String DestinationType;

    /**
    * <p>Target queue or switch</p>
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
    * <p>When creating a Binding for Header type Exchange, parameters can be passed in. No need to input for other types of Exchange.</p>
    */
    @SerializedName("Arguments")
    @Expose
    private RabbitMQServerlessKeyValuePair [] Arguments;

    /**
     * Get <p>Instance Id</p> 
     * @return InstanceId <p>Instance Id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance Id</p>
     * @param InstanceId <p>Instance Id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get <p>Source exchange</p> 
     * @return Source <p>Source exchange</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>Source exchange</p>
     * @param Source <p>Source exchange</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>Target type, value queue or exchange</p> 
     * @return DestinationType <p>Target type, value queue or exchange</p>
     */
    public String getDestinationType() {
        return this.DestinationType;
    }

    /**
     * Set <p>Target type, value queue or exchange</p>
     * @param DestinationType <p>Target type, value queue or exchange</p>
     */
    public void setDestinationType(String DestinationType) {
        this.DestinationType = DestinationType;
    }

    /**
     * Get <p>Target queue or switch</p> 
     * @return Destination <p>Target queue or switch</p>
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set <p>Target queue or switch</p>
     * @param Destination <p>Target queue or switch</p>
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
     * Get <p>When creating a Binding for Header type Exchange, parameters can be passed in. No need to input for other types of Exchange.</p> 
     * @return Arguments <p>When creating a Binding for Header type Exchange, parameters can be passed in. No need to input for other types of Exchange.</p>
     */
    public RabbitMQServerlessKeyValuePair [] getArguments() {
        return this.Arguments;
    }

    /**
     * Set <p>When creating a Binding for Header type Exchange, parameters can be passed in. No need to input for other types of Exchange.</p>
     * @param Arguments <p>When creating a Binding for Header type Exchange, parameters can be passed in. No need to input for other types of Exchange.</p>
     */
    public void setArguments(RabbitMQServerlessKeyValuePair [] Arguments) {
        this.Arguments = Arguments;
    }

    public CreateRabbitMQServerlessBindingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRabbitMQServerlessBindingRequest(CreateRabbitMQServerlessBindingRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "DestinationType", this.DestinationType);
        this.setParamSimple(map, prefix + "Destination", this.Destination);
        this.setParamSimple(map, prefix + "RoutingKey", this.RoutingKey);
        this.setParamArrayObj(map, prefix + "Arguments.", this.Arguments);

    }
}

