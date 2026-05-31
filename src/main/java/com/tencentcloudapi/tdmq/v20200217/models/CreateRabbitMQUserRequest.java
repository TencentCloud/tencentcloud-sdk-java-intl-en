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

public class CreateRabbitMQUserRequest extends AbstractModel {

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
    * <p>Password, used when logging in. Requirements: Cannot be empty, 8-64 characters, must contain at least two of the following: lowercase letter, uppercase letter, digit, special character [()`~!@#$%^&*_=|{}[]:;',.?/].</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>User tag, used to determine the access permission of the user to RabbitMQ Management<br>management: ordinary console user, monitoring: console user with management privileges, other value: non-console user</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>Maximum number of connections for this user. Leave it blank to set as unlimited.</p>
    */
    @SerializedName("MaxConnections")
    @Expose
    private Long MaxConnections;

    /**
    * <p>Maximum number of channels for the user. Not specified means no limit.</p>
    */
    @SerializedName("MaxChannels")
    @Expose
    private Long MaxChannels;

    /**
    * <p>Whether cam authentication is enabled</p>
    */
    @SerializedName("EnableCamAuth")
    @Expose
    private Boolean EnableCamAuth;

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
     * Get <p>Password, used when logging in. Requirements: Cannot be empty, 8-64 characters, must contain at least two of the following: lowercase letter, uppercase letter, digit, special character [()`~!@#$%^&*_=|{}[]:;',.?/].</p> 
     * @return Password <p>Password, used when logging in. Requirements: Cannot be empty, 8-64 characters, must contain at least two of the following: lowercase letter, uppercase letter, digit, special character [()`~!@#$%^&*_=|{}[]:;',.?/].</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Password, used when logging in. Requirements: Cannot be empty, 8-64 characters, must contain at least two of the following: lowercase letter, uppercase letter, digit, special character [()`~!@#$%^&*_=|{}[]:;',.?/].</p>
     * @param Password <p>Password, used when logging in. Requirements: Cannot be empty, 8-64 characters, must contain at least two of the following: lowercase letter, uppercase letter, digit, special character [()`~!@#$%^&*_=|{}[]:;',.?/].</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>User tag, used to determine the access permission of the user to RabbitMQ Management<br>management: ordinary console user, monitoring: console user with management privileges, other value: non-console user</p> 
     * @return Tags <p>User tag, used to determine the access permission of the user to RabbitMQ Management<br>management: ordinary console user, monitoring: console user with management privileges, other value: non-console user</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>User tag, used to determine the access permission of the user to RabbitMQ Management<br>management: ordinary console user, monitoring: console user with management privileges, other value: non-console user</p>
     * @param Tags <p>User tag, used to determine the access permission of the user to RabbitMQ Management<br>management: ordinary console user, monitoring: console user with management privileges, other value: non-console user</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Maximum number of connections for this user. Leave it blank to set as unlimited.</p> 
     * @return MaxConnections <p>Maximum number of connections for this user. Leave it blank to set as unlimited.</p>
     */
    public Long getMaxConnections() {
        return this.MaxConnections;
    }

    /**
     * Set <p>Maximum number of connections for this user. Leave it blank to set as unlimited.</p>
     * @param MaxConnections <p>Maximum number of connections for this user. Leave it blank to set as unlimited.</p>
     */
    public void setMaxConnections(Long MaxConnections) {
        this.MaxConnections = MaxConnections;
    }

    /**
     * Get <p>Maximum number of channels for the user. Not specified means no limit.</p> 
     * @return MaxChannels <p>Maximum number of channels for the user. Not specified means no limit.</p>
     */
    public Long getMaxChannels() {
        return this.MaxChannels;
    }

    /**
     * Set <p>Maximum number of channels for the user. Not specified means no limit.</p>
     * @param MaxChannels <p>Maximum number of channels for the user. Not specified means no limit.</p>
     */
    public void setMaxChannels(Long MaxChannels) {
        this.MaxChannels = MaxChannels;
    }

    /**
     * Get <p>Whether cam authentication is enabled</p> 
     * @return EnableCamAuth <p>Whether cam authentication is enabled</p>
     */
    public Boolean getEnableCamAuth() {
        return this.EnableCamAuth;
    }

    /**
     * Set <p>Whether cam authentication is enabled</p>
     * @param EnableCamAuth <p>Whether cam authentication is enabled</p>
     */
    public void setEnableCamAuth(Boolean EnableCamAuth) {
        this.EnableCamAuth = EnableCamAuth;
    }

    public CreateRabbitMQUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRabbitMQUserRequest(CreateRabbitMQUserRequest source) {
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
        if (source.MaxConnections != null) {
            this.MaxConnections = new Long(source.MaxConnections);
        }
        if (source.MaxChannels != null) {
            this.MaxChannels = new Long(source.MaxChannels);
        }
        if (source.EnableCamAuth != null) {
            this.EnableCamAuth = new Boolean(source.EnableCamAuth);
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
        this.setParamSimple(map, prefix + "MaxConnections", this.MaxConnections);
        this.setParamSimple(map, prefix + "MaxChannels", this.MaxChannels);
        this.setParamSimple(map, prefix + "EnableCamAuth", this.EnableCamAuth);

    }
}

