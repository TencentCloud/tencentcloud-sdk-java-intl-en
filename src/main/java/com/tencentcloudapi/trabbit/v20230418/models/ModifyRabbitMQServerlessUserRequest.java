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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRabbitMQServerlessUserRequest extends AbstractModel {

    /**
    * instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the username.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Password. specifies the password.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Description. if not provided, no modification will be made.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * User tag. specifies to determine the access permission scope of this user to RabbitMQ Management. if it is not passed in, no modification will be made.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Specifies the maximum number of connections for this user. if not provided, it will not be modified.
    */
    @SerializedName("MaxConnections")
    @Expose
    private Long MaxConnections;

    /**
    * Specifies the maximum number of channels for this user. if not provided, it will not be modified.
    */
    @SerializedName("MaxChannels")
    @Expose
    private Long MaxChannels;

    /**
     * Get instance ID 
     * @return InstanceId instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set instance ID
     * @param InstanceId instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the username. 
     * @return User Specifies the username.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Specifies the username.
     * @param User Specifies the username.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Password. specifies the password. 
     * @return Password Password. specifies the password.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password. specifies the password.
     * @param Password Password. specifies the password.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Description. if not provided, no modification will be made. 
     * @return Description Description. if not provided, no modification will be made.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description. if not provided, no modification will be made.
     * @param Description Description. if not provided, no modification will be made.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get User tag. specifies to determine the access permission scope of this user to RabbitMQ Management. if it is not passed in, no modification will be made. 
     * @return Tags User tag. specifies to determine the access permission scope of this user to RabbitMQ Management. if it is not passed in, no modification will be made.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set User tag. specifies to determine the access permission scope of this user to RabbitMQ Management. if it is not passed in, no modification will be made.
     * @param Tags User tag. specifies to determine the access permission scope of this user to RabbitMQ Management. if it is not passed in, no modification will be made.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Specifies the maximum number of connections for this user. if not provided, it will not be modified. 
     * @return MaxConnections Specifies the maximum number of connections for this user. if not provided, it will not be modified.
     */
    public Long getMaxConnections() {
        return this.MaxConnections;
    }

    /**
     * Set Specifies the maximum number of connections for this user. if not provided, it will not be modified.
     * @param MaxConnections Specifies the maximum number of connections for this user. if not provided, it will not be modified.
     */
    public void setMaxConnections(Long MaxConnections) {
        this.MaxConnections = MaxConnections;
    }

    /**
     * Get Specifies the maximum number of channels for this user. if not provided, it will not be modified. 
     * @return MaxChannels Specifies the maximum number of channels for this user. if not provided, it will not be modified.
     */
    public Long getMaxChannels() {
        return this.MaxChannels;
    }

    /**
     * Set Specifies the maximum number of channels for this user. if not provided, it will not be modified.
     * @param MaxChannels Specifies the maximum number of channels for this user. if not provided, it will not be modified.
     */
    public void setMaxChannels(Long MaxChannels) {
        this.MaxChannels = MaxChannels;
    }

    public ModifyRabbitMQServerlessUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRabbitMQServerlessUserRequest(ModifyRabbitMQServerlessUserRequest source) {
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

