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

public class ModifyRabbitMQPermissionRequest extends AbstractModel {

    /**
    * Instance ID, such as amqp-xxxxxxxx. valid InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Username, such as admin. valid User names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking a cluster in the cluster list, entering cluster details, and finding the list of users in the User and permission management tab, thereby locating the username.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * VirtualHost name, such as testvhost. effective VirtualHost names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking Vhost in the left sidebar, and finding the Vhost name in the Vhost list.
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * Permission types, declare-related operations, specifies the regular expression for resource names that the user can operate on under the vhost.
    */
    @SerializedName("ConfigRegexp")
    @Expose
    private String ConfigRegexp;

    /**
    * Permission types, message write-related operations, specifies the regular expression for resource names that the user can operate on under the vhost.
    */
    @SerializedName("WriteRegexp")
    @Expose
    private String WriteRegexp;

    /**
    * Permission types, message read-related operations, specifies the regular expression for resource names that the user can operate on under the vhost.
    */
    @SerializedName("ReadRegexp")
    @Expose
    private String ReadRegexp;

    /**
     * Get Instance ID, such as amqp-xxxxxxxx. valid InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1). 
     * @return InstanceId Instance ID, such as amqp-xxxxxxxx. valid InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, such as amqp-xxxxxxxx. valid InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     * @param InstanceId Instance ID, such as amqp-xxxxxxxx. valid InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Username, such as admin. valid User names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking a cluster in the cluster list, entering cluster details, and finding the list of users in the User and permission management tab, thereby locating the username. 
     * @return User Username, such as admin. valid User names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking a cluster in the cluster list, entering cluster details, and finding the list of users in the User and permission management tab, thereby locating the username.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Username, such as admin. valid User names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking a cluster in the cluster list, entering cluster details, and finding the list of users in the User and permission management tab, thereby locating the username.
     * @param User Username, such as admin. valid User names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking a cluster in the cluster list, entering cluster details, and finding the list of users in the User and permission management tab, thereby locating the username.
     */
    public void setUser(String User) {
        this.User = User;
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
     * Get Permission types, declare-related operations, specifies the regular expression for resource names that the user can operate on under the vhost. 
     * @return ConfigRegexp Permission types, declare-related operations, specifies the regular expression for resource names that the user can operate on under the vhost.
     */
    public String getConfigRegexp() {
        return this.ConfigRegexp;
    }

    /**
     * Set Permission types, declare-related operations, specifies the regular expression for resource names that the user can operate on under the vhost.
     * @param ConfigRegexp Permission types, declare-related operations, specifies the regular expression for resource names that the user can operate on under the vhost.
     */
    public void setConfigRegexp(String ConfigRegexp) {
        this.ConfigRegexp = ConfigRegexp;
    }

    /**
     * Get Permission types, message write-related operations, specifies the regular expression for resource names that the user can operate on under the vhost. 
     * @return WriteRegexp Permission types, message write-related operations, specifies the regular expression for resource names that the user can operate on under the vhost.
     */
    public String getWriteRegexp() {
        return this.WriteRegexp;
    }

    /**
     * Set Permission types, message write-related operations, specifies the regular expression for resource names that the user can operate on under the vhost.
     * @param WriteRegexp Permission types, message write-related operations, specifies the regular expression for resource names that the user can operate on under the vhost.
     */
    public void setWriteRegexp(String WriteRegexp) {
        this.WriteRegexp = WriteRegexp;
    }

    /**
     * Get Permission types, message read-related operations, specifies the regular expression for resource names that the user can operate on under the vhost. 
     * @return ReadRegexp Permission types, message read-related operations, specifies the regular expression for resource names that the user can operate on under the vhost.
     */
    public String getReadRegexp() {
        return this.ReadRegexp;
    }

    /**
     * Set Permission types, message read-related operations, specifies the regular expression for resource names that the user can operate on under the vhost.
     * @param ReadRegexp Permission types, message read-related operations, specifies the regular expression for resource names that the user can operate on under the vhost.
     */
    public void setReadRegexp(String ReadRegexp) {
        this.ReadRegexp = ReadRegexp;
    }

    public ModifyRabbitMQPermissionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRabbitMQPermissionRequest(ModifyRabbitMQPermissionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.ConfigRegexp != null) {
            this.ConfigRegexp = new String(source.ConfigRegexp);
        }
        if (source.WriteRegexp != null) {
            this.WriteRegexp = new String(source.WriteRegexp);
        }
        if (source.ReadRegexp != null) {
            this.ReadRegexp = new String(source.ReadRegexp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "ConfigRegexp", this.ConfigRegexp);
        this.setParamSimple(map, prefix + "WriteRegexp", this.WriteRegexp);
        this.setParamSimple(map, prefix + "ReadRegexp", this.ReadRegexp);

    }
}

