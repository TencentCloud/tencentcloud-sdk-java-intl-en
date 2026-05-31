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
    * <p>Instance ID, such as amqp-xxxxxxxx. Effective InstanceId can be obtained by logging in to the <a href="https://console.cloud.tencent.com/trabbitmq/cluster?rid=1">TDMQ RabbitMQ Console</a> for querying.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Username, used when logging in</p>
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * <p>Password, used when logging in</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>user description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>User tag, used to determine the access permission of the user to RabbitMQ Management</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>User creation time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>User last modification time</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>Type of user, System: system creation, User: user creation</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Maximum available connections per user</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxConnections")
    @Expose
    private Long MaxConnections;

    /**
    * <p>Maximum available channels per user</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxChannels")
    @Expose
    private Long MaxChannels;

    /**
    * <p>Creation time timestamp</p>
    */
    @SerializedName("CreateTs")
    @Expose
    private Long CreateTs;

    /**
    * <p>Modification time timestamp</p>
    */
    @SerializedName("ModifyTs")
    @Expose
    private Long ModifyTs;

    /**
    * <p>Whether cam authentication is enabled</p><p>Default value: false</p>
    */
    @SerializedName("CamAuthEnabled")
    @Expose
    private Boolean CamAuthEnabled;

    /**
    * <p>cam credential name</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CamCredentialName")
    @Expose
    private String CamCredentialName;

    /**
     * Get <p>Instance ID, such as amqp-xxxxxxxx. Effective InstanceId can be obtained by logging in to the <a href="https://console.cloud.tencent.com/trabbitmq/cluster?rid=1">TDMQ RabbitMQ Console</a> for querying.</p> 
     * @return InstanceId <p>Instance ID, such as amqp-xxxxxxxx. Effective InstanceId can be obtained by logging in to the <a href="https://console.cloud.tencent.com/trabbitmq/cluster?rid=1">TDMQ RabbitMQ Console</a> for querying.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID, such as amqp-xxxxxxxx. Effective InstanceId can be obtained by logging in to the <a href="https://console.cloud.tencent.com/trabbitmq/cluster?rid=1">TDMQ RabbitMQ Console</a> for querying.</p>
     * @param InstanceId <p>Instance ID, such as amqp-xxxxxxxx. Effective InstanceId can be obtained by logging in to the <a href="https://console.cloud.tencent.com/trabbitmq/cluster?rid=1">TDMQ RabbitMQ Console</a> for querying.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Username, used when logging in</p> 
     * @return User <p>Username, used when logging in</p>
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>Username, used when logging in</p>
     * @param User <p>Username, used when logging in</p>
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get <p>Password, used when logging in</p> 
     * @return Password <p>Password, used when logging in</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Password, used when logging in</p>
     * @param Password <p>Password, used when logging in</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>user description</p> 
     * @return Description <p>user description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>user description</p>
     * @param Description <p>user description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>User tag, used to determine the access permission of the user to RabbitMQ Management</p> 
     * @return Tags <p>User tag, used to determine the access permission of the user to RabbitMQ Management</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>User tag, used to determine the access permission of the user to RabbitMQ Management</p>
     * @param Tags <p>User tag, used to determine the access permission of the user to RabbitMQ Management</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>User creation time</p> 
     * @return CreateTime <p>User creation time</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>User creation time</p>
     * @param CreateTime <p>User creation time</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>User last modification time</p> 
     * @return ModifyTime <p>User last modification time</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>User last modification time</p>
     * @param ModifyTime <p>User last modification time</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>Type of user, System: system creation, User: user creation</p> 
     * @return Type <p>Type of user, System: system creation, User: user creation</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Type of user, System: system creation, User: user creation</p>
     * @param Type <p>Type of user, System: system creation, User: user creation</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Maximum available connections per user</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxConnections <p>Maximum available connections per user</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxConnections() {
        return this.MaxConnections;
    }

    /**
     * Set <p>Maximum available connections per user</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxConnections <p>Maximum available connections per user</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxConnections(Long MaxConnections) {
        this.MaxConnections = MaxConnections;
    }

    /**
     * Get <p>Maximum available channels per user</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxChannels <p>Maximum available channels per user</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxChannels() {
        return this.MaxChannels;
    }

    /**
     * Set <p>Maximum available channels per user</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxChannels <p>Maximum available channels per user</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxChannels(Long MaxChannels) {
        this.MaxChannels = MaxChannels;
    }

    /**
     * Get <p>Creation time timestamp</p> 
     * @return CreateTs <p>Creation time timestamp</p>
     */
    public Long getCreateTs() {
        return this.CreateTs;
    }

    /**
     * Set <p>Creation time timestamp</p>
     * @param CreateTs <p>Creation time timestamp</p>
     */
    public void setCreateTs(Long CreateTs) {
        this.CreateTs = CreateTs;
    }

    /**
     * Get <p>Modification time timestamp</p> 
     * @return ModifyTs <p>Modification time timestamp</p>
     */
    public Long getModifyTs() {
        return this.ModifyTs;
    }

    /**
     * Set <p>Modification time timestamp</p>
     * @param ModifyTs <p>Modification time timestamp</p>
     */
    public void setModifyTs(Long ModifyTs) {
        this.ModifyTs = ModifyTs;
    }

    /**
     * Get <p>Whether cam authentication is enabled</p><p>Default value: false</p> 
     * @return CamAuthEnabled <p>Whether cam authentication is enabled</p><p>Default value: false</p>
     */
    public Boolean getCamAuthEnabled() {
        return this.CamAuthEnabled;
    }

    /**
     * Set <p>Whether cam authentication is enabled</p><p>Default value: false</p>
     * @param CamAuthEnabled <p>Whether cam authentication is enabled</p><p>Default value: false</p>
     */
    public void setCamAuthEnabled(Boolean CamAuthEnabled) {
        this.CamAuthEnabled = CamAuthEnabled;
    }

    /**
     * Get <p>cam credential name</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CamCredentialName <p>cam credential name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCamCredentialName() {
        return this.CamCredentialName;
    }

    /**
     * Set <p>cam credential name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CamCredentialName <p>cam credential name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCamCredentialName(String CamCredentialName) {
        this.CamCredentialName = CamCredentialName;
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
        if (source.CamAuthEnabled != null) {
            this.CamAuthEnabled = new Boolean(source.CamAuthEnabled);
        }
        if (source.CamCredentialName != null) {
            this.CamCredentialName = new String(source.CamCredentialName);
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
        this.setParamSimple(map, prefix + "CamAuthEnabled", this.CamAuthEnabled);
        this.setParamSimple(map, prefix + "CamCredentialName", this.CamCredentialName);

    }
}

