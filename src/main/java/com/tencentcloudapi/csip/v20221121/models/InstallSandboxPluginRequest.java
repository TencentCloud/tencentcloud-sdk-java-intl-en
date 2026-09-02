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

public class InstallSandboxPluginRequest extends AbstractModel {

    /**
    * Asset type to which it belongs
Enumeration values:
HOST: HOST
CONTAINER: Container
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * Installation target range
Input parameter limits: If EffectType is INCLUDE, EffectAssets must not be empty. If EffectType is EXCLUDE, EffectAssets can be an empty array (meaning deployment to all AI Agent assets).
    */
    @SerializedName("EffectScope")
    @Expose
    private TrafficSandboxEffectScope EffectScope;

    /**
     * Get Asset type to which it belongs
Enumeration values:
HOST: HOST
CONTAINER: Container 
     * @return BelongAssetType Asset type to which it belongs
Enumeration values:
HOST: HOST
CONTAINER: Container
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set Asset type to which it belongs
Enumeration values:
HOST: HOST
CONTAINER: Container
     * @param BelongAssetType Asset type to which it belongs
Enumeration values:
HOST: HOST
CONTAINER: Container
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get Installation target range
Input parameter limits: If EffectType is INCLUDE, EffectAssets must not be empty. If EffectType is EXCLUDE, EffectAssets can be an empty array (meaning deployment to all AI Agent assets). 
     * @return EffectScope Installation target range
Input parameter limits: If EffectType is INCLUDE, EffectAssets must not be empty. If EffectType is EXCLUDE, EffectAssets can be an empty array (meaning deployment to all AI Agent assets).
     */
    public TrafficSandboxEffectScope getEffectScope() {
        return this.EffectScope;
    }

    /**
     * Set Installation target range
Input parameter limits: If EffectType is INCLUDE, EffectAssets must not be empty. If EffectType is EXCLUDE, EffectAssets can be an empty array (meaning deployment to all AI Agent assets).
     * @param EffectScope Installation target range
Input parameter limits: If EffectType is INCLUDE, EffectAssets must not be empty. If EffectType is EXCLUDE, EffectAssets can be an empty array (meaning deployment to all AI Agent assets).
     */
    public void setEffectScope(TrafficSandboxEffectScope EffectScope) {
        this.EffectScope = EffectScope;
    }

    public InstallSandboxPluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstallSandboxPluginRequest(InstallSandboxPluginRequest source) {
        if (source.BelongAssetType != null) {
            this.BelongAssetType = new String(source.BelongAssetType);
        }
        if (source.EffectScope != null) {
            this.EffectScope = new TrafficSandboxEffectScope(source.EffectScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamObj(map, prefix + "EffectScope.", this.EffectScope);

    }
}

