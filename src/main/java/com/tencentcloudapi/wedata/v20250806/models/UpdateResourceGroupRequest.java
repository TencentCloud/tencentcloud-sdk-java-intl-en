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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateResourceGroupRequest extends AbstractModel {

    /**
    * Resource group ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * **Change configuration (cannot include both modification, renewal, and resource package quantity changes). configuration changes cannot modify the resource group type.**.

Real-Time integration resource group.  
-i32c (real-time data sync - 16c64G).

Offline integration resource group.
-integrated (offline data sync-8C16G).
-i16 (offline data sync-8C32G).

Scheduling resource group.
-test specification.
-S_small (basic specification).
-S_medium (general specifications).
-S_large (professional specification).

Data service resource group.
-Test specification.
-ds_s(Basic specification).
-ds_m (general specifications).
-ds_l (professional specification).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Renewal period, unit month (cannot include both modification, renewal, and resource package quantity changes).
    */
    @SerializedName("PurchasePeriod")
    @Expose
    private Long PurchasePeriod;

    /**
    * Add or reduce the number of resource packages (modification, renewal, and changing the number of resource packages cannot include both).
    */
    @SerializedName("Number")
    @Expose
    private ResourceNumber Number;

    /**
    * Auto-Renewal or not. the renewal parameters take effect when PurchasePeriod is not empty.
    */
    @SerializedName("AutoRenewEnabled")
    @Expose
    private Boolean AutoRenewEnabled;

    /**
     * Get Resource group ID 
     * @return Id Resource group ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Resource group ID
     * @param Id Resource group ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get **Change configuration (cannot include both modification, renewal, and resource package quantity changes). configuration changes cannot modify the resource group type.**.

Real-Time integration resource group.  
-i32c (real-time data sync - 16c64G).

Offline integration resource group.
-integrated (offline data sync-8C16G).
-i16 (offline data sync-8C32G).

Scheduling resource group.
-test specification.
-S_small (basic specification).
-S_medium (general specifications).
-S_large (professional specification).

Data service resource group.
-Test specification.
-ds_s(Basic specification).
-ds_m (general specifications).
-ds_l (professional specification). 
     * @return Type **Change configuration (cannot include both modification, renewal, and resource package quantity changes). configuration changes cannot modify the resource group type.**.

Real-Time integration resource group.  
-i32c (real-time data sync - 16c64G).

Offline integration resource group.
-integrated (offline data sync-8C16G).
-i16 (offline data sync-8C32G).

Scheduling resource group.
-test specification.
-S_small (basic specification).
-S_medium (general specifications).
-S_large (professional specification).

Data service resource group.
-Test specification.
-ds_s(Basic specification).
-ds_m (general specifications).
-ds_l (professional specification).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set **Change configuration (cannot include both modification, renewal, and resource package quantity changes). configuration changes cannot modify the resource group type.**.

Real-Time integration resource group.  
-i32c (real-time data sync - 16c64G).

Offline integration resource group.
-integrated (offline data sync-8C16G).
-i16 (offline data sync-8C32G).

Scheduling resource group.
-test specification.
-S_small (basic specification).
-S_medium (general specifications).
-S_large (professional specification).

Data service resource group.
-Test specification.
-ds_s(Basic specification).
-ds_m (general specifications).
-ds_l (professional specification).
     * @param Type **Change configuration (cannot include both modification, renewal, and resource package quantity changes). configuration changes cannot modify the resource group type.**.

Real-Time integration resource group.  
-i32c (real-time data sync - 16c64G).

Offline integration resource group.
-integrated (offline data sync-8C16G).
-i16 (offline data sync-8C32G).

Scheduling resource group.
-test specification.
-S_small (basic specification).
-S_medium (general specifications).
-S_large (professional specification).

Data service resource group.
-Test specification.
-ds_s(Basic specification).
-ds_m (general specifications).
-ds_l (professional specification).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Renewal period, unit month (cannot include both modification, renewal, and resource package quantity changes). 
     * @return PurchasePeriod Renewal period, unit month (cannot include both modification, renewal, and resource package quantity changes).
     */
    public Long getPurchasePeriod() {
        return this.PurchasePeriod;
    }

    /**
     * Set Renewal period, unit month (cannot include both modification, renewal, and resource package quantity changes).
     * @param PurchasePeriod Renewal period, unit month (cannot include both modification, renewal, and resource package quantity changes).
     */
    public void setPurchasePeriod(Long PurchasePeriod) {
        this.PurchasePeriod = PurchasePeriod;
    }

    /**
     * Get Add or reduce the number of resource packages (modification, renewal, and changing the number of resource packages cannot include both). 
     * @return Number Add or reduce the number of resource packages (modification, renewal, and changing the number of resource packages cannot include both).
     */
    public ResourceNumber getNumber() {
        return this.Number;
    }

    /**
     * Set Add or reduce the number of resource packages (modification, renewal, and changing the number of resource packages cannot include both).
     * @param Number Add or reduce the number of resource packages (modification, renewal, and changing the number of resource packages cannot include both).
     */
    public void setNumber(ResourceNumber Number) {
        this.Number = Number;
    }

    /**
     * Get Auto-Renewal or not. the renewal parameters take effect when PurchasePeriod is not empty. 
     * @return AutoRenewEnabled Auto-Renewal or not. the renewal parameters take effect when PurchasePeriod is not empty.
     */
    public Boolean getAutoRenewEnabled() {
        return this.AutoRenewEnabled;
    }

    /**
     * Set Auto-Renewal or not. the renewal parameters take effect when PurchasePeriod is not empty.
     * @param AutoRenewEnabled Auto-Renewal or not. the renewal parameters take effect when PurchasePeriod is not empty.
     */
    public void setAutoRenewEnabled(Boolean AutoRenewEnabled) {
        this.AutoRenewEnabled = AutoRenewEnabled;
    }

    public UpdateResourceGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateResourceGroupRequest(UpdateResourceGroupRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PurchasePeriod != null) {
            this.PurchasePeriod = new Long(source.PurchasePeriod);
        }
        if (source.Number != null) {
            this.Number = new ResourceNumber(source.Number);
        }
        if (source.AutoRenewEnabled != null) {
            this.AutoRenewEnabled = new Boolean(source.AutoRenewEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PurchasePeriod", this.PurchasePeriod);
        this.setParamObj(map, prefix + "Number.", this.Number);
        this.setParamSimple(map, prefix + "AutoRenewEnabled", this.AutoRenewEnabled);

    }
}

