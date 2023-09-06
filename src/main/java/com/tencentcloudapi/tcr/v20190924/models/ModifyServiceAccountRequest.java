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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyServiceAccountRequest extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Service account name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Service account description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Validity in days starting from the current day, It takes a higher priority than `ExpiresAt`.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Expiry time (timestamp, in milliseconds)
    */
    @SerializedName("ExpiresAt")
    @Expose
    private Long ExpiresAt;

    /**
    * Whether to disable the service account
    */
    @SerializedName("Disable")
    @Expose
    private Boolean Disable;

    /**
    * Policy list
    */
    @SerializedName("Permissions")
    @Expose
    private Permission [] Permissions;

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
     * Get Service account name 
     * @return Name Service account name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Service account name
     * @param Name Service account name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Service account description 
     * @return Description Service account description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Service account description
     * @param Description Service account description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Validity in days starting from the current day, It takes a higher priority than `ExpiresAt`. 
     * @return Duration Validity in days starting from the current day, It takes a higher priority than `ExpiresAt`.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Validity in days starting from the current day, It takes a higher priority than `ExpiresAt`.
     * @param Duration Validity in days starting from the current day, It takes a higher priority than `ExpiresAt`.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Expiry time (timestamp, in milliseconds) 
     * @return ExpiresAt Expiry time (timestamp, in milliseconds)
     */
    public Long getExpiresAt() {
        return this.ExpiresAt;
    }

    /**
     * Set Expiry time (timestamp, in milliseconds)
     * @param ExpiresAt Expiry time (timestamp, in milliseconds)
     */
    public void setExpiresAt(Long ExpiresAt) {
        this.ExpiresAt = ExpiresAt;
    }

    /**
     * Get Whether to disable the service account 
     * @return Disable Whether to disable the service account
     */
    public Boolean getDisable() {
        return this.Disable;
    }

    /**
     * Set Whether to disable the service account
     * @param Disable Whether to disable the service account
     */
    public void setDisable(Boolean Disable) {
        this.Disable = Disable;
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

    public ModifyServiceAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyServiceAccountRequest(ModifyServiceAccountRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.Permissions != null) {
            this.Permissions = new Permission[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new Permission(source.Permissions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ExpiresAt", this.ExpiresAt);
        this.setParamSimple(map, prefix + "Disable", this.Disable);
        this.setParamArrayObj(map, prefix + "Permissions.", this.Permissions);

    }
}

