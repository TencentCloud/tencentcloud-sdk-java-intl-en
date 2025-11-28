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

public class ModifyRabbitMQVirtualHostRequest extends AbstractModel {

    /**
    * Instance ID, such as amqp-xxxxxxxx. specifies the effective InstanceId that can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * VirtualHost name, such as testvhost. effective VirtualHost names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking Vhost in the left sidebar, and finding the Vhost name in the Vhost list.
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * Describes the Virtual Host.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Message trace flag. Valid values: `true` (Enabled), `false` (Disabled).
    */
    @SerializedName("TraceFlag")
    @Expose
    private Boolean TraceFlag;

    /**
     * Get Instance ID, such as amqp-xxxxxxxx. specifies the effective InstanceId that can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1). 
     * @return InstanceId Instance ID, such as amqp-xxxxxxxx. specifies the effective InstanceId that can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, such as amqp-xxxxxxxx. specifies the effective InstanceId that can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     * @param InstanceId Instance ID, such as amqp-xxxxxxxx. specifies the effective InstanceId that can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get VirtualHost name, such as testvhost. effective VirtualHost names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking Vhost in the left sidebar, and finding the Vhost name in the Vhost list. 
     * @return VirtualHost VirtualHost name, such as testvhost. effective VirtualHost names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking Vhost in the left sidebar, and finding the Vhost name in the Vhost list.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set VirtualHost name, such as testvhost. effective VirtualHost names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking Vhost in the left sidebar, and finding the Vhost name in the Vhost list.
     * @param VirtualHost VirtualHost name, such as testvhost. effective VirtualHost names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking Vhost in the left sidebar, and finding the Vhost name in the Vhost list.
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get Describes the Virtual Host. 
     * @return Description Describes the Virtual Host.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Describes the Virtual Host.
     * @param Description Describes the Virtual Host.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Message trace flag. Valid values: `true` (Enabled), `false` (Disabled). 
     * @return TraceFlag Message trace flag. Valid values: `true` (Enabled), `false` (Disabled).
     */
    public Boolean getTraceFlag() {
        return this.TraceFlag;
    }

    /**
     * Set Message trace flag. Valid values: `true` (Enabled), `false` (Disabled).
     * @param TraceFlag Message trace flag. Valid values: `true` (Enabled), `false` (Disabled).
     */
    public void setTraceFlag(Boolean TraceFlag) {
        this.TraceFlag = TraceFlag;
    }

    public ModifyRabbitMQVirtualHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRabbitMQVirtualHostRequest(ModifyRabbitMQVirtualHostRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TraceFlag != null) {
            this.TraceFlag = new Boolean(source.TraceFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TraceFlag", this.TraceFlag);

    }
}

