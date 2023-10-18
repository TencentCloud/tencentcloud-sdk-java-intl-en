/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * Cluster instance ID
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
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * User tag, which defines a user's permission scope for accessing RabbitMQ Managementu200d.
Valid values: `management` (Common console user), monitoring` (Console admin user), other values: Non-console user.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * The maximum number of connections for the user. If this parameter is left empty, there's no limit for the number.
    */
    @SerializedName("MaxConnections")
    @Expose
    private Long MaxConnections;

    /**
    * The maximum number of channels for the user. If this parameter is left empty, there's no limit for the number.
    */
    @SerializedName("MaxChannels")
    @Expose
    private Long MaxChannels;

    /**
     * Get Cluster instance ID 
     * @return InstanceId Cluster instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster instance ID
     * @param InstanceId Cluster instance ID
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
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get User tag, which defines a user's permission scope for accessing RabbitMQ Managementu200d.
Valid values: `management` (Common console user), monitoring` (Console admin user), other values: Non-console user. 
     * @return Tags User tag, which defines a user's permission scope for accessing RabbitMQ Managementu200d.
Valid values: `management` (Common console user), monitoring` (Console admin user), other values: Non-console user.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set User tag, which defines a user's permission scope for accessing RabbitMQ Managementu200d.
Valid values: `management` (Common console user), monitoring` (Console admin user), other values: Non-console user.
     * @param Tags User tag, which defines a user's permission scope for accessing RabbitMQ Managementu200d.
Valid values: `management` (Common console user), monitoring` (Console admin user), other values: Non-console user.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get The maximum number of connections for the user. If this parameter is left empty, there's no limit for the number. 
     * @return MaxConnections The maximum number of connections for the user. If this parameter is left empty, there's no limit for the number.
     */
    public Long getMaxConnections() {
        return this.MaxConnections;
    }

    /**
     * Set The maximum number of connections for the user. If this parameter is left empty, there's no limit for the number.
     * @param MaxConnections The maximum number of connections for the user. If this parameter is left empty, there's no limit for the number.
     */
    public void setMaxConnections(Long MaxConnections) {
        this.MaxConnections = MaxConnections;
    }

    /**
     * Get The maximum number of channels for the user. If this parameter is left empty, there's no limit for the number. 
     * @return MaxChannels The maximum number of channels for the user. If this parameter is left empty, there's no limit for the number.
     */
    public Long getMaxChannels() {
        return this.MaxChannels;
    }

    /**
     * Set The maximum number of channels for the user. If this parameter is left empty, there's no limit for the number.
     * @param MaxChannels The maximum number of channels for the user. If this parameter is left empty, there's no limit for the number.
     */
    public void setMaxChannels(Long MaxChannels) {
        this.MaxChannels = MaxChannels;
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

    }
}

