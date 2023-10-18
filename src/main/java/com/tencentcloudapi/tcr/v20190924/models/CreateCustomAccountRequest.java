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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCustomAccountRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Custom account name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Policy list
    */
    @SerializedName("Permissions")
    @Expose
    private Permission [] Permissions;

    /**
    * Custom account description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Validity in days starting from the current day. It takes a higher priority than `ExpiresAt`.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Expiry time of the custom account (timestamp, in milliseconds)
    */
    @SerializedName("ExpiresAt")
    @Expose
    private Long ExpiresAt;

    /**
    * Whether to disable the custom account
    */
    @SerializedName("Disable")
    @Expose
    private Boolean Disable;

    /**
     * Get Instance ID 
     * @return RegistryId Instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID
     * @param RegistryId Instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Custom account name 
     * @return Name Custom account name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Custom account name
     * @param Name Custom account name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Policy list 
     * @return Permissions Policy list
     */
    public Permission [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set Policy list
     * @param Permissions Policy list
     */
    public void setPermissions(Permission [] Permissions) {
        this.Permissions = Permissions;
    }

    /**
     * Get Custom account description 
     * @return Description Custom account description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Custom account description
     * @param Description Custom account description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Validity in days starting from the current day. It takes a higher priority than `ExpiresAt`. 
     * @return Duration Validity in days starting from the current day. It takes a higher priority than `ExpiresAt`.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Validity in days starting from the current day. It takes a higher priority than `ExpiresAt`.
     * @param Duration Validity in days starting from the current day. It takes a higher priority than `ExpiresAt`.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Expiry time of the custom account (timestamp, in milliseconds) 
     * @return ExpiresAt Expiry time of the custom account (timestamp, in milliseconds)
     */
    public Long getExpiresAt() {
        return this.ExpiresAt;
    }

    /**
     * Set Expiry time of the custom account (timestamp, in milliseconds)
     * @param ExpiresAt Expiry time of the custom account (timestamp, in milliseconds)
     */
    public void setExpiresAt(Long ExpiresAt) {
        this.ExpiresAt = ExpiresAt;
    }

    /**
     * Get Whether to disable the custom account 
     * @return Disable Whether to disable the custom account
     */
    public Boolean getDisable() {
        return this.Disable;
    }

    /**
     * Set Whether to disable the custom account
     * @param Disable Whether to disable the custom account
     */
    public void setDisable(Boolean Disable) {
        this.Disable = Disable;
    }

    public CreateCustomAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomAccountRequest(CreateCustomAccountRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Permissions != null) {
            this.Permissions = new Permission[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new Permission(source.Permissions[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ExpiresAt != null) {
            this.ExpiresAt = new Long(source.ExpiresAt);
        }
        if (source.Disable != null) {
            this.Disable = new Boolean(source.Disable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Permissions.", this.Permissions);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ExpiresAt", this.ExpiresAt);
        this.setParamSimple(map, prefix + "Disable", this.Disable);

    }
}

