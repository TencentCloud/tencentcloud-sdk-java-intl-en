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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaseTenant extends AbstractModel {

    /**
    * Tenant IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * Tenant ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TenantName")
    @Expose
    private String TenantName;

    /**
    * Tenant display name, usually the Chinese name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * RemarksNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Tenant Main Account
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OwnerUserId")
    @Expose
    private String OwnerUserId;

    /**
    * Tenant's additional configuration parameters, in JSON format string
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
     * Get Tenant IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TenantId Tenant IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set Tenant IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param TenantId Tenant IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get Tenant ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TenantName Tenant ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTenantName() {
        return this.TenantName;
    }

    /**
     * Set Tenant ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TenantName Tenant ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTenantName(String TenantName) {
        this.TenantName = TenantName;
    }

    /**
     * Get Tenant display name, usually the Chinese name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DisplayName Tenant display name, usually the Chinese name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Tenant display name, usually the Chinese name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DisplayName Tenant display name, usually the Chinese name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get RemarksNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Description RemarksNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set RemarksNote: This field may return null, indicating that no valid value can be obtained.
     * @param Description RemarksNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Tenant Main Account
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OwnerUserId Tenant Main Account
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOwnerUserId() {
        return this.OwnerUserId;
    }

    /**
     * Set Tenant Main Account
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OwnerUserId Tenant Main Account
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOwnerUserId(String OwnerUserId) {
        this.OwnerUserId = OwnerUserId;
    }

    /**
     * Get Tenant's additional configuration parameters, in JSON format string
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Params Tenant's additional configuration parameters, in JSON format string
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set Tenant's additional configuration parameters, in JSON format string
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Params Tenant's additional configuration parameters, in JSON format string
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    public BaseTenant() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseTenant(BaseTenant source) {
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.TenantName != null) {
            this.TenantName = new String(source.TenantName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OwnerUserId != null) {
            this.OwnerUserId = new String(source.OwnerUserId);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "TenantName", this.TenantName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OwnerUserId", this.OwnerUserId);
        this.setParamSimple(map, prefix + "Params", this.Params);

    }
}

