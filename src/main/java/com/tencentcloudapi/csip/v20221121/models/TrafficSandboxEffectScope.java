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

public class TrafficSandboxEffectScope extends AbstractModel {

    /**
    * Effective mode
Enumeration values:
INCLUDE: specified asset takes effect
EXCLUDE: Remove the specified asset (all take effect by default)
    */
    @SerializedName("EffectType")
    @Expose
    private String EffectType;

    /**
    * List of effective assets
Input parameter limits: required and non-empty when EffectType=INCLUDE; an empty array can be passed when EffectType=EXCLUDE.
    */
    @SerializedName("EffectAssets")
    @Expose
    private TrafficSandboxAssetScope [] EffectAssets;

    /**
     * Get Effective mode
Enumeration values:
INCLUDE: specified asset takes effect
EXCLUDE: Remove the specified asset (all take effect by default) 
     * @return EffectType Effective mode
Enumeration values:
INCLUDE: specified asset takes effect
EXCLUDE: Remove the specified asset (all take effect by default)
     */
    public String getEffectType() {
        return this.EffectType;
    }

    /**
     * Set Effective mode
Enumeration values:
INCLUDE: specified asset takes effect
EXCLUDE: Remove the specified asset (all take effect by default)
     * @param EffectType Effective mode
Enumeration values:
INCLUDE: specified asset takes effect
EXCLUDE: Remove the specified asset (all take effect by default)
     */
    public void setEffectType(String EffectType) {
        this.EffectType = EffectType;
    }

    /**
     * Get List of effective assets
Input parameter limits: required and non-empty when EffectType=INCLUDE; an empty array can be passed when EffectType=EXCLUDE. 
     * @return EffectAssets List of effective assets
Input parameter limits: required and non-empty when EffectType=INCLUDE; an empty array can be passed when EffectType=EXCLUDE.
     */
    public TrafficSandboxAssetScope [] getEffectAssets() {
        return this.EffectAssets;
    }

    /**
     * Set List of effective assets
Input parameter limits: required and non-empty when EffectType=INCLUDE; an empty array can be passed when EffectType=EXCLUDE.
     * @param EffectAssets List of effective assets
Input parameter limits: required and non-empty when EffectType=INCLUDE; an empty array can be passed when EffectType=EXCLUDE.
     */
    public void setEffectAssets(TrafficSandboxAssetScope [] EffectAssets) {
        this.EffectAssets = EffectAssets;
    }

    public TrafficSandboxEffectScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxEffectScope(TrafficSandboxEffectScope source) {
        if (source.EffectType != null) {
            this.EffectType = new String(source.EffectType);
        }
        if (source.EffectAssets != null) {
            this.EffectAssets = new TrafficSandboxAssetScope[source.EffectAssets.length];
            for (int i = 0; i < source.EffectAssets.length; i++) {
                this.EffectAssets[i] = new TrafficSandboxAssetScope(source.EffectAssets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EffectType", this.EffectType);
        this.setParamArrayObj(map, prefix + "EffectAssets.", this.EffectAssets);

    }
}

