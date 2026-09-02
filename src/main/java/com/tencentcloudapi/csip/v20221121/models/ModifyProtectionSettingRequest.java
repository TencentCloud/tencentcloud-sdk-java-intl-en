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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProtectionSettingRequest extends AbstractModel {

    /**
    * Asset type
- CWP host security asset
- TCSS_HOST container host node
-TCSS_EKS container super node
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Protection configuration
    */
    @SerializedName("Config")
    @Expose
    private ModifyProtectionSetting [] Config;

    /**
    * Whether to include all. This field must be used in conjunction with Filters.
    */
    @SerializedName("IsALL")
    @Expose
    private Boolean IsALL;

    /**
    * Filter parameter. This parameter takes effect when IsALL is set to true, indicating that the filtered results apply to Config.
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get Asset type
- CWP host security asset
- TCSS_HOST container host node
-TCSS_EKS container super node 
     * @return AssetType Asset type
- CWP host security asset
- TCSS_HOST container host node
-TCSS_EKS container super node
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
- CWP host security asset
- TCSS_HOST container host node
-TCSS_EKS container super node
     * @param AssetType Asset type
- CWP host security asset
- TCSS_HOST container host node
-TCSS_EKS container super node
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Protection configuration 
     * @return Config Protection configuration
     */
    public ModifyProtectionSetting [] getConfig() {
        return this.Config;
    }

    /**
     * Set Protection configuration
     * @param Config Protection configuration
     */
    public void setConfig(ModifyProtectionSetting [] Config) {
        this.Config = Config;
    }

    /**
     * Get Whether to include all. This field must be used in conjunction with Filters. 
     * @return IsALL Whether to include all. This field must be used in conjunction with Filters.
     */
    public Boolean getIsALL() {
        return this.IsALL;
    }

    /**
     * Set Whether to include all. This field must be used in conjunction with Filters.
     * @param IsALL Whether to include all. This field must be used in conjunction with Filters.
     */
    public void setIsALL(Boolean IsALL) {
        this.IsALL = IsALL;
    }

    /**
     * Get Filter parameter. This parameter takes effect when IsALL is set to true, indicating that the filtered results apply to Config. 
     * @return Filters Filter parameter. This parameter takes effect when IsALL is set to true, indicating that the filtered results apply to Config.
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameter. This parameter takes effect when IsALL is set to true, indicating that the filtered results apply to Config.
     * @param Filters Filter parameter. This parameter takes effect when IsALL is set to true, indicating that the filtered results apply to Config.
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public ModifyProtectionSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProtectionSettingRequest(ModifyProtectionSettingRequest source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Config != null) {
            this.Config = new ModifyProtectionSetting[source.Config.length];
            for (int i = 0; i < source.Config.length; i++) {
                this.Config[i] = new ModifyProtectionSetting(source.Config[i]);
            }
        }
        if (source.IsALL != null) {
            this.IsALL = new Boolean(source.IsALL);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamArrayObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "IsALL", this.IsALL);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

