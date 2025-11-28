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

public class RabbitMQPermission extends AbstractModel {

    /**
    * Instance ID, such as amqp-xxxxxxxx. effective InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Username, such as admin. effective User names can be found by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking a cluster in the cluster list, entering cluster details, and locating the list of users under the User and permission management tab, thereby finding the username.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * VirtualHost name, such as testvhost. valid VirtualHost names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking Vhost in the left sidebar, and finding the Vhost name in the Vhost list.
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * Type of permissions related to declare operations. This regular expression controls resource creation and deletion permissions of users in this vhost.
    */
    @SerializedName("ConfigRegexp")
    @Expose
    private String ConfigRegexp;

    /**
    * Type of permissions related to message write operations. This regular expression controls resource creation and deletion permissions of users in this vhost.
    */
    @SerializedName("WriteRegexp")
    @Expose
    private String WriteRegexp;

    /**
    * Type of permissions related to message read operations. This regular expression controls resource creation and deletion permissions of users in this vhost.
    */
    @SerializedName("ReadRegexp")
    @Expose
    private String ReadRegexp;

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
     * Get Instance ID, such as amqp-xxxxxxxx. effective InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1). 
     * @return InstanceId Instance ID, such as amqp-xxxxxxxx. effective InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, such as amqp-xxxxxxxx. effective InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     * @param InstanceId Instance ID, such as amqp-xxxxxxxx. effective InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Username, such as admin. effective User names can be found by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking a cluster in the cluster list, entering cluster details, and locating the list of users under the User and permission management tab, thereby finding the username. 
     * @return User Username, such as admin. effective User names can be found by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking a cluster in the cluster list, entering cluster details, and locating the list of users under the User and permission management tab, thereby finding the username.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Username, such as admin. effective User names can be found by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking a cluster in the cluster list, entering cluster details, and locating the list of users under the User and permission management tab, thereby finding the username.
     * @param User Username, such as admin. effective User names can be found by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking a cluster in the cluster list, entering cluster details, and locating the list of users under the User and permission management tab, thereby finding the username.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get VirtualHost name, such as testvhost. valid VirtualHost names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking Vhost in the left sidebar, and finding the Vhost name in the Vhost list. 
     * @return VirtualHost VirtualHost name, such as testvhost. valid VirtualHost names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking Vhost in the left sidebar, and finding the Vhost name in the Vhost list.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set VirtualHost name, such as testvhost. valid VirtualHost names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking Vhost in the left sidebar, and finding the Vhost name in the Vhost list.
     * @param VirtualHost VirtualHost name, such as testvhost. valid VirtualHost names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking Vhost in the left sidebar, and finding the Vhost name in the Vhost list.
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get Type of permissions related to declare operations. This regular expression controls resource creation and deletion permissions of users in this vhost. 
     * @return ConfigRegexp Type of permissions related to declare operations. This regular expression controls resource creation and deletion permissions of users in this vhost.
     */
    public String getConfigRegexp() {
        return this.ConfigRegexp;
    }

    /**
     * Set Type of permissions related to declare operations. This regular expression controls resource creation and deletion permissions of users in this vhost.
     * @param ConfigRegexp Type of permissions related to declare operations. This regular expression controls resource creation and deletion permissions of users in this vhost.
     */
    public void setConfigRegexp(String ConfigRegexp) {
        this.ConfigRegexp = ConfigRegexp;
    }

    /**
     * Get Type of permissions related to message write operations. This regular expression controls resource creation and deletion permissions of users in this vhost. 
     * @return WriteRegexp Type of permissions related to message write operations. This regular expression controls resource creation and deletion permissions of users in this vhost.
     */
    public String getWriteRegexp() {
        return this.WriteRegexp;
    }

    /**
     * Set Type of permissions related to message write operations. This regular expression controls resource creation and deletion permissions of users in this vhost.
     * @param WriteRegexp Type of permissions related to message write operations. This regular expression controls resource creation and deletion permissions of users in this vhost.
     */
    public void setWriteRegexp(String WriteRegexp) {
        this.WriteRegexp = WriteRegexp;
    }

    /**
     * Get Type of permissions related to message read operations. This regular expression controls resource creation and deletion permissions of users in this vhost. 
     * @return ReadRegexp Type of permissions related to message read operations. This regular expression controls resource creation and deletion permissions of users in this vhost.
     */
    public String getReadRegexp() {
        return this.ReadRegexp;
    }

    /**
     * Set Type of permissions related to message read operations. This regular expression controls resource creation and deletion permissions of users in this vhost.
     * @param ReadRegexp Type of permissions related to message read operations. This regular expression controls resource creation and deletion permissions of users in this vhost.
     */
    public void setReadRegexp(String ReadRegexp) {
        this.ReadRegexp = ReadRegexp;
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

    public RabbitMQPermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQPermission(RabbitMQPermission source) {
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "ConfigRegexp", this.ConfigRegexp);
        this.setParamSimple(map, prefix + "WriteRegexp", this.WriteRegexp);
        this.setParamSimple(map, prefix + "ReadRegexp", this.ReadRegexp);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTs", this.CreateTs);
        this.setParamSimple(map, prefix + "ModifyTs", this.ModifyTs);

    }
}

