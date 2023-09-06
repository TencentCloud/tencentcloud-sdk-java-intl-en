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

public class ServiceAccount extends AbstractModel{

    /**
    * Service account name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Whether to disable
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Disable")
    @Expose
    private Boolean Disable;

    /**
    * Expiry time
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpiresAt")
    @Expose
    private Long ExpiresAt;

    /**
    * Creation time
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Policy
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Permissions")
    @Expose
    private Permission [] Permissions;

    /**
     * Get Service account name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Name Service account name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Service account name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Name Service account name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Description Description
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Description Description
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Whether to disable
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Disable Whether to disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getDisable() {
        return this.Disable;
    }

    /**
     * Set Whether to disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Disable Whether to disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDisable(Boolean Disable) {
        this.Disable = Disable;
    }

    /**
     * Get Expiry time
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ExpiresAt Expiry time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getExpiresAt() {
        return this.ExpiresAt;
    }

    /**
     * Set Expiry time
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ExpiresAt Expiry time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setExpiresAt(Long ExpiresAt) {
        this.ExpiresAt = ExpiresAt;
    }

    /**
     * Get Creation time
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Policy
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Permissions Policy
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Permission [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set Policy
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Permissions Policy
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPermissions(Permission [] Permissions) {
        this.Permissions = Permissions;
    }

    public ServiceAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceAccount(ServiceAccount source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Disable != null) {
            this.Disable = new Boolean(source.Disable);
        }
        if (source.ExpiresAt != null) {
            this.ExpiresAt = new Long(source.ExpiresAt);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Disable", this.Disable);
        this.setParamSimple(map, prefix + "ExpiresAt", this.ExpiresAt);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "Permissions.", this.Permissions);

    }
}

