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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdbSellType extends AbstractModel {

    /**
    * Name of the purchasable instance. Valid values: `Z3` (High-availability instance. `DeviceType`:`UNIVERSAL`, `EXCLUSIVE`; `CVM` (basic instance. `DeviceType`: `BASIC`); `TKE` (basic v2 instance. `DeviceType`: `BASIC_V2`).
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * Engine version number
    */
    @SerializedName("EngineVersion")
    @Expose
    private String [] EngineVersion;

    /**
    * Purchasable specifications ID
    */
    @SerializedName("ConfigIds")
    @Expose
    private Long [] ConfigIds;

    /**
     * Get Name of the purchasable instance. Valid values: `Z3` (High-availability instance. `DeviceType`:`UNIVERSAL`, `EXCLUSIVE`; `CVM` (basic instance. `DeviceType`: `BASIC`); `TKE` (basic v2 instance. `DeviceType`: `BASIC_V2`). 
     * @return TypeName Name of the purchasable instance. Valid values: `Z3` (High-availability instance. `DeviceType`:`UNIVERSAL`, `EXCLUSIVE`; `CVM` (basic instance. `DeviceType`: `BASIC`); `TKE` (basic v2 instance. `DeviceType`: `BASIC_V2`).
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set Name of the purchasable instance. Valid values: `Z3` (High-availability instance. `DeviceType`:`UNIVERSAL`, `EXCLUSIVE`; `CVM` (basic instance. `DeviceType`: `BASIC`); `TKE` (basic v2 instance. `DeviceType`: `BASIC_V2`).
     * @param TypeName Name of the purchasable instance. Valid values: `Z3` (High-availability instance. `DeviceType`:`UNIVERSAL`, `EXCLUSIVE`; `CVM` (basic instance. `DeviceType`: `BASIC`); `TKE` (basic v2 instance. `DeviceType`: `BASIC_V2`).
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get Engine version number 
     * @return EngineVersion Engine version number
     */
    public String [] getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set Engine version number
     * @param EngineVersion Engine version number
     */
    public void setEngineVersion(String [] EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get Purchasable specifications ID 
     * @return ConfigIds Purchasable specifications ID
     */
    public Long [] getConfigIds() {
        return this.ConfigIds;
    }

    /**
     * Set Purchasable specifications ID
     * @param ConfigIds Purchasable specifications ID
     */
    public void setConfigIds(Long [] ConfigIds) {
        this.ConfigIds = ConfigIds;
    }

    public CdbSellType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdbSellType(CdbSellType source) {
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String[source.EngineVersion.length];
            for (int i = 0; i < source.EngineVersion.length; i++) {
                this.EngineVersion[i] = new String(source.EngineVersion[i]);
            }
        }
        if (source.ConfigIds != null) {
            this.ConfigIds = new Long[source.ConfigIds.length];
            for (int i = 0; i < source.ConfigIds.length; i++) {
                this.ConfigIds[i] = new Long(source.ConfigIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamArraySimple(map, prefix + "EngineVersion.", this.EngineVersion);
        this.setParamArraySimple(map, prefix + "ConfigIds.", this.ConfigIds);

    }
}

