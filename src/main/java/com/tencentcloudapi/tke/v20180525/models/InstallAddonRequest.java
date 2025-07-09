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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstallAddonRequest extends AbstractModel {

    /**
    * Cluster ID (only supported for standard tke clusters).
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Add-on name
    */
    @SerializedName("AddonName")
    @Expose
    private String AddonName;

    /**
    * Add-on version. If it is not specified, the latest version is installed by default.
    */
    @SerializedName("AddonVersion")
    @Expose
    private String AddonVersion;

    /**
    * Add-on parameters in a base64-encoded JSON string. You can query add-on parameters via `DescribeAddonValues`.
    */
    @SerializedName("RawValues")
    @Expose
    private String RawValues;

    /**
    * Specifies whether to perform only an installation check. when set to true, only checks are performed without installing components.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get Cluster ID (only supported for standard tke clusters). 
     * @return ClusterId Cluster ID (only supported for standard tke clusters).
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID (only supported for standard tke clusters).
     * @param ClusterId Cluster ID (only supported for standard tke clusters).
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Add-on name 
     * @return AddonName Add-on name
     */
    public String getAddonName() {
        return this.AddonName;
    }

    /**
     * Set Add-on name
     * @param AddonName Add-on name
     */
    public void setAddonName(String AddonName) {
        this.AddonName = AddonName;
    }

    /**
     * Get Add-on version. If it is not specified, the latest version is installed by default. 
     * @return AddonVersion Add-on version. If it is not specified, the latest version is installed by default.
     */
    public String getAddonVersion() {
        return this.AddonVersion;
    }

    /**
     * Set Add-on version. If it is not specified, the latest version is installed by default.
     * @param AddonVersion Add-on version. If it is not specified, the latest version is installed by default.
     */
    public void setAddonVersion(String AddonVersion) {
        this.AddonVersion = AddonVersion;
    }

    /**
     * Get Add-on parameters in a base64-encoded JSON string. You can query add-on parameters via `DescribeAddonValues`. 
     * @return RawValues Add-on parameters in a base64-encoded JSON string. You can query add-on parameters via `DescribeAddonValues`.
     */
    public String getRawValues() {
        return this.RawValues;
    }

    /**
     * Set Add-on parameters in a base64-encoded JSON string. You can query add-on parameters via `DescribeAddonValues`.
     * @param RawValues Add-on parameters in a base64-encoded JSON string. You can query add-on parameters via `DescribeAddonValues`.
     */
    public void setRawValues(String RawValues) {
        this.RawValues = RawValues;
    }

    /**
     * Get Specifies whether to perform only an installation check. when set to true, only checks are performed without installing components. 
     * @return DryRun Specifies whether to perform only an installation check. when set to true, only checks are performed without installing components.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Specifies whether to perform only an installation check. when set to true, only checks are performed without installing components.
     * @param DryRun Specifies whether to perform only an installation check. when set to true, only checks are performed without installing components.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public InstallAddonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstallAddonRequest(InstallAddonRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AddonName != null) {
            this.AddonName = new String(source.AddonName);
        }
        if (source.AddonVersion != null) {
            this.AddonVersion = new String(source.AddonVersion);
        }
        if (source.RawValues != null) {
            this.RawValues = new String(source.RawValues);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AddonName", this.AddonName);
        this.setParamSimple(map, prefix + "AddonVersion", this.AddonVersion);
        this.setParamSimple(map, prefix + "RawValues", this.RawValues);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

