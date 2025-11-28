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

public class RabbitMQUser extends AbstractModel {

    /**
    * Instance ID, such as amqp-xxxxxxxx. effective InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Username, which is used for login.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Password, which is used for login.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * User description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * User tags, which determine the scope of permissions of this user to access RabbitMQ Management.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * User creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last user modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * User type. Valid values: `System` (Created by system), `User` (Created by user).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Maximum number of available connections per user.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxConnections")
    @Expose
    private Long MaxConnections;

    /**
    * Maximum number of available channels per user.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxChannels")
    @Expose
    private Long MaxChannels;

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
     * Get Username, which is used for login. 
     * @return User Username, which is used for login.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Username, which is used for login.
     * @param User Username, which is used for login.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Password, which is used for login. 
     * @return Password Password, which is used for login.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password, which is used for login.
     * @param Password Password, which is used for login.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get User description 
     * @return Description User description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set User description
     * @param Description User description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get User tags, which determine the scope of permissions of this user to access RabbitMQ Management. 
     * @return Tags User tags, which determine the scope of permissions of this user to access RabbitMQ Management.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set User tags, which determine the scope of permissions of this user to access RabbitMQ Management.
     * @param Tags User tags, which determine the scope of permissions of this user to access RabbitMQ Management.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get User creation time 
     * @return CreateTime User creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set User creation time
     * @param CreateTime User creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last user modification time 
     * @return ModifyTime Last user modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Last user modification time
     * @param ModifyTime Last user modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get User type. Valid values: `System` (Created by system), `User` (Created by user). 
     * @return Type User type. Valid values: `System` (Created by system), `User` (Created by user).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set User type. Valid values: `System` (Created by system), `User` (Created by user).
     * @param Type User type. Valid values: `System` (Created by system), `User` (Created by user).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Maximum number of available connections per user.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxConnections Maximum number of available connections per user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxConnections() {
        return this.MaxConnections;
    }

    /**
     * Set Maximum number of available connections per user.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxConnections Maximum number of available connections per user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxConnections(Long MaxConnections) {
        this.MaxConnections = MaxConnections;
    }

    /**
     * Get Maximum number of available channels per user.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxChannels Maximum number of available channels per user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxChannels() {
        return this.MaxChannels;
    }

    /**
     * Set Maximum number of available channels per user.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxChannels Maximum number of available channels per user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxChannels(Long MaxChannels) {
        this.MaxChannels = MaxChannels;
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

    public RabbitMQUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQUser(RabbitMQUser source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.MaxConnections != null) {
            this.MaxConnections = new Long(source.MaxConnections);
        }
        if (source.MaxChannels != null) {
            this.MaxChannels = new Long(source.MaxChannels);
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
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MaxConnections", this.MaxConnections);
        this.setParamSimple(map, prefix + "MaxChannels", this.MaxChannels);
        this.setParamSimple(map, prefix + "CreateTs", this.CreateTs);
        this.setParamSimple(map, prefix + "ModifyTs", this.ModifyTs);

    }
}

