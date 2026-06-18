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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetAttackSettingRequest extends AbstractModel {

    /**
    * <p>0: Disable network attack detection; 1: Enable network attack detection</p>
    */
    @SerializedName("NetAttackEnable")
    @Expose
    private Long NetAttackEnable;

    /**
    * <p>0: Newly added alert events are pending by default; 1: newly added alert events are processed by default; 3: newly added alert events are ignored by default</p>
    */
    @SerializedName("NetAttackAlarmStatus")
    @Expose
    private Long NetAttackAlarmStatus;

    /**
    * <p>1: All Ultimate Edition hosts; 0: Hosts in the Quuids list</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>Selected hosts</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>Custom excluded hosts</p>
    */
    @SerializedName("ExcludeInstanceIds")
    @Expose
    private String [] ExcludeInstanceIds;

    /**
    * <p>Automatically include newly added assets. 0: No; 1: Yes</p>
    */
    @SerializedName("AutoInclude")
    @Expose
    private Long AutoInclude;

    /**
    * <p>Product type. 0: CWP; 1: CSC</p>
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
     * Get <p>0: Disable network attack detection; 1: Enable network attack detection</p> 
     * @return NetAttackEnable <p>0: Disable network attack detection; 1: Enable network attack detection</p>
     */
    public Long getNetAttackEnable() {
        return this.NetAttackEnable;
    }

    /**
     * Set <p>0: Disable network attack detection; 1: Enable network attack detection</p>
     * @param NetAttackEnable <p>0: Disable network attack detection; 1: Enable network attack detection</p>
     */
    public void setNetAttackEnable(Long NetAttackEnable) {
        this.NetAttackEnable = NetAttackEnable;
    }

    /**
     * Get <p>0: Newly added alert events are pending by default; 1: newly added alert events are processed by default; 3: newly added alert events are ignored by default</p> 
     * @return NetAttackAlarmStatus <p>0: Newly added alert events are pending by default; 1: newly added alert events are processed by default; 3: newly added alert events are ignored by default</p>
     */
    public Long getNetAttackAlarmStatus() {
        return this.NetAttackAlarmStatus;
    }

    /**
     * Set <p>0: Newly added alert events are pending by default; 1: newly added alert events are processed by default; 3: newly added alert events are ignored by default</p>
     * @param NetAttackAlarmStatus <p>0: Newly added alert events are pending by default; 1: newly added alert events are processed by default; 3: newly added alert events are ignored by default</p>
     */
    public void setNetAttackAlarmStatus(Long NetAttackAlarmStatus) {
        this.NetAttackAlarmStatus = NetAttackAlarmStatus;
    }

    /**
     * Get <p>1: All Ultimate Edition hosts; 0: Hosts in the Quuids list</p> 
     * @return Scope <p>1: All Ultimate Edition hosts; 0: Hosts in the Quuids list</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>1: All Ultimate Edition hosts; 0: Hosts in the Quuids list</p>
     * @param Scope <p>1: All Ultimate Edition hosts; 0: Hosts in the Quuids list</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>Selected hosts</p> 
     * @return InstanceIds <p>Selected hosts</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>Selected hosts</p>
     * @param InstanceIds <p>Selected hosts</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>Custom excluded hosts</p> 
     * @return ExcludeInstanceIds <p>Custom excluded hosts</p>
     */
    public String [] getExcludeInstanceIds() {
        return this.ExcludeInstanceIds;
    }

    /**
     * Set <p>Custom excluded hosts</p>
     * @param ExcludeInstanceIds <p>Custom excluded hosts</p>
     */
    public void setExcludeInstanceIds(String [] ExcludeInstanceIds) {
        this.ExcludeInstanceIds = ExcludeInstanceIds;
    }

    /**
     * Get <p>Automatically include newly added assets. 0: No; 1: Yes</p> 
     * @return AutoInclude <p>Automatically include newly added assets. 0: No; 1: Yes</p>
     */
    public Long getAutoInclude() {
        return this.AutoInclude;
    }

    /**
     * Set <p>Automatically include newly added assets. 0: No; 1: Yes</p>
     * @param AutoInclude <p>Automatically include newly added assets. 0: No; 1: Yes</p>
     */
    public void setAutoInclude(Long AutoInclude) {
        this.AutoInclude = AutoInclude;
    }

    /**
     * Get <p>Product type. 0: CWP; 1: CSC</p> 
     * @return ProductType <p>Product type. 0: CWP; 1: CSC</p>
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>Product type. 0: CWP; 1: CSC</p>
     * @param ProductType <p>Product type. 0: CWP; 1: CSC</p>
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    public ModifyNetAttackSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetAttackSettingRequest(ModifyNetAttackSettingRequest source) {
        if (source.NetAttackEnable != null) {
            this.NetAttackEnable = new Long(source.NetAttackEnable);
        }
        if (source.NetAttackAlarmStatus != null) {
            this.NetAttackAlarmStatus = new Long(source.NetAttackAlarmStatus);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ExcludeInstanceIds != null) {
            this.ExcludeInstanceIds = new String[source.ExcludeInstanceIds.length];
            for (int i = 0; i < source.ExcludeInstanceIds.length; i++) {
                this.ExcludeInstanceIds[i] = new String(source.ExcludeInstanceIds[i]);
            }
        }
        if (source.AutoInclude != null) {
            this.AutoInclude = new Long(source.AutoInclude);
        }
        if (source.ProductType != null) {
            this.ProductType = new Long(source.ProductType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetAttackEnable", this.NetAttackEnable);
        this.setParamSimple(map, prefix + "NetAttackAlarmStatus", this.NetAttackAlarmStatus);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "ExcludeInstanceIds.", this.ExcludeInstanceIds);
        this.setParamSimple(map, prefix + "AutoInclude", this.AutoInclude);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);

    }
}

