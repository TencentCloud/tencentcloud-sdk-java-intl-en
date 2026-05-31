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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySnapBackupCrossRegionConfigRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Whether cross-region snapshot backup is enabled.
    */
    @SerializedName("CrossRegionsEnable")
    @Expose
    private String CrossRegionsEnable;

    /**
    * Cross-Regional snapshot backup.
    */
    @SerializedName("CrossRegions")
    @Expose
    private String [] CrossRegions;

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
     * Get Whether cross-region snapshot backup is enabled. 
     * @return CrossRegionsEnable Whether cross-region snapshot backup is enabled.
     */
    public String getCrossRegionsEnable() {
        return this.CrossRegionsEnable;
    }

    /**
     * Set Whether cross-region snapshot backup is enabled.
     * @param CrossRegionsEnable Whether cross-region snapshot backup is enabled.
     */
    public void setCrossRegionsEnable(String CrossRegionsEnable) {
        this.CrossRegionsEnable = CrossRegionsEnable;
    }

    /**
     * Get Cross-Regional snapshot backup. 
     * @return CrossRegions Cross-Regional snapshot backup.
     */
    public String [] getCrossRegions() {
        return this.CrossRegions;
    }

    /**
     * Set Cross-Regional snapshot backup.
     * @param CrossRegions Cross-Regional snapshot backup.
     */
    public void setCrossRegions(String [] CrossRegions) {
        this.CrossRegions = CrossRegions;
    }

    public ModifySnapBackupCrossRegionConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySnapBackupCrossRegionConfigRequest(ModifySnapBackupCrossRegionConfigRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.CrossRegionsEnable != null) {
            this.CrossRegionsEnable = new String(source.CrossRegionsEnable);
        }
        if (source.CrossRegions != null) {
            this.CrossRegions = new String[source.CrossRegions.length];
            for (int i = 0; i < source.CrossRegions.length; i++) {
                this.CrossRegions[i] = new String(source.CrossRegions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "CrossRegionsEnable", this.CrossRegionsEnable);
        this.setParamArraySimple(map, prefix + "CrossRegions.", this.CrossRegions);

    }
}

