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

public class ModifyRabbitMQServerlessPermissionRequest extends AbstractModel {

    /**
    * instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the username, which is the user associated with the permission.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Specifies the vhost name.
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * Types of permissions. declare related operations. for the user, it is operable to perform operations on the resource name under the vhost that matches the regular expression.
    */
    @SerializedName("ConfigRegexp")
    @Expose
    private String ConfigRegexp;

    /**
    * Types of permissions. message write related operations. the user can operate on the resource names under the vhost that match the regular expression.
    */
    @SerializedName("WriteRegexp")
    @Expose
    private String WriteRegexp;

    /**
    * Types of permissions. message read related operations. the user can operate on the resource name under the vhost that matches the regular expression.
    */
    @SerializedName("ReadRegexp")
    @Expose
    private String ReadRegexp;

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
     * Get Specifies the username, which is the user associated with the permission. 
     * @return User Specifies the username, which is the user associated with the permission.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Specifies the username, which is the user associated with the permission.
     * @param User Specifies the username, which is the user associated with the permission.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Specifies the vhost name. 
     * @return VirtualHost Specifies the vhost name.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Specifies the vhost name.
     * @param VirtualHost Specifies the vhost name.
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get Types of permissions. declare related operations. for the user, it is operable to perform operations on the resource name under the vhost that matches the regular expression. 
     * @return ConfigRegexp Types of permissions. declare related operations. for the user, it is operable to perform operations on the resource name under the vhost that matches the regular expression.
     */
    public String getConfigRegexp() {
        return this.ConfigRegexp;
    }

    /**
     * Set Types of permissions. declare related operations. for the user, it is operable to perform operations on the resource name under the vhost that matches the regular expression.
     * @param ConfigRegexp Types of permissions. declare related operations. for the user, it is operable to perform operations on the resource name under the vhost that matches the regular expression.
     */
    public void setConfigRegexp(String ConfigRegexp) {
        this.ConfigRegexp = ConfigRegexp;
    }

    /**
     * Get Types of permissions. message write related operations. the user can operate on the resource names under the vhost that match the regular expression. 
     * @return WriteRegexp Types of permissions. message write related operations. the user can operate on the resource names under the vhost that match the regular expression.
     */
    public String getWriteRegexp() {
        return this.WriteRegexp;
    }

    /**
     * Set Types of permissions. message write related operations. the user can operate on the resource names under the vhost that match the regular expression.
     * @param WriteRegexp Types of permissions. message write related operations. the user can operate on the resource names under the vhost that match the regular expression.
     */
    public void setWriteRegexp(String WriteRegexp) {
        this.WriteRegexp = WriteRegexp;
    }

    /**
     * Get Types of permissions. message read related operations. the user can operate on the resource name under the vhost that matches the regular expression. 
     * @return ReadRegexp Types of permissions. message read related operations. the user can operate on the resource name under the vhost that matches the regular expression.
     */
    public String getReadRegexp() {
        return this.ReadRegexp;
    }

    /**
     * Set Types of permissions. message read related operations. the user can operate on the resource name under the vhost that matches the regular expression.
     * @param ReadRegexp Types of permissions. message read related operations. the user can operate on the resource name under the vhost that matches the regular expression.
     */
    public void setReadRegexp(String ReadRegexp) {
        this.ReadRegexp = ReadRegexp;
    }

    public ModifyRabbitMQServerlessPermissionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRabbitMQServerlessPermissionRequest(ModifyRabbitMQServerlessPermissionRequest source) {
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

