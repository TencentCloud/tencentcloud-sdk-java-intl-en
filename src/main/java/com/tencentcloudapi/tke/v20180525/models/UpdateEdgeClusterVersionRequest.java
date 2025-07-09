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

public class UpdateEdgeClusterVersionRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Target version
    */
    @SerializedName("EdgeVersion")
    @Expose
    private String EdgeVersion;

    /**
    * Prefix of the image repository of a custom edge component
    */
    @SerializedName("RegistryPrefix")
    @Expose
    private String RegistryPrefix;

    /**
    * Whether to skip precheck
    */
    @SerializedName("SkipPreCheck")
    @Expose
    private Boolean SkipPreCheck;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Target version 
     * @return EdgeVersion Target version
     */
    public String getEdgeVersion() {
        return this.EdgeVersion;
    }

    /**
     * Set Target version
     * @param EdgeVersion Target version
     */
    public void setEdgeVersion(String EdgeVersion) {
        this.EdgeVersion = EdgeVersion;
    }

    /**
     * Get Prefix of the image repository of a custom edge component 
     * @return RegistryPrefix Prefix of the image repository of a custom edge component
     */
    public String getRegistryPrefix() {
        return this.RegistryPrefix;
    }

    /**
     * Set Prefix of the image repository of a custom edge component
     * @param RegistryPrefix Prefix of the image repository of a custom edge component
     */
    public void setRegistryPrefix(String RegistryPrefix) {
        this.RegistryPrefix = RegistryPrefix;
    }

    /**
     * Get Whether to skip precheck 
     * @return SkipPreCheck Whether to skip precheck
     */
    public Boolean getSkipPreCheck() {
        return this.SkipPreCheck;
    }

    /**
     * Set Whether to skip precheck
     * @param SkipPreCheck Whether to skip precheck
     */
    public void setSkipPreCheck(Boolean SkipPreCheck) {
        this.SkipPreCheck = SkipPreCheck;
    }

    public UpdateEdgeClusterVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateEdgeClusterVersionRequest(UpdateEdgeClusterVersionRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.EdgeVersion != null) {
            this.EdgeVersion = new String(source.EdgeVersion);
        }
        if (source.RegistryPrefix != null) {
            this.RegistryPrefix = new String(source.RegistryPrefix);
        }
        if (source.SkipPreCheck != null) {
            this.SkipPreCheck = new Boolean(source.SkipPreCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "EdgeVersion", this.EdgeVersion);
        this.setParamSimple(map, prefix + "RegistryPrefix", this.RegistryPrefix);
        this.setParamSimple(map, prefix + "SkipPreCheck", this.SkipPreCheck);

    }
}

