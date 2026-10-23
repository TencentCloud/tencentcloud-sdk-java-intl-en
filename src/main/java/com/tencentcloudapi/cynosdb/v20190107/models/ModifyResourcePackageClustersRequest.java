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

public class ModifyResourcePackageClustersRequest extends AbstractModel {

    /**
    * Unique ID of the resource package
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * Cluster ID for which a binding relationship needs to be established.
    */
    @SerializedName("BindClusterIds")
    @Expose
    private String [] BindClusterIds;

    /**
    * Cluster ID for which the binding relationship needs to be unbound.
    */
    @SerializedName("UnbindClusterIds")
    @Expose
    private String [] UnbindClusterIds;

    /**
     * Get Unique ID of the resource package 
     * @return PackageId Unique ID of the resource package
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set Unique ID of the resource package
     * @param PackageId Unique ID of the resource package
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get Cluster ID for which a binding relationship needs to be established. 
     * @return BindClusterIds Cluster ID for which a binding relationship needs to be established.
     */
    public String [] getBindClusterIds() {
        return this.BindClusterIds;
    }

    /**
     * Set Cluster ID for which a binding relationship needs to be established.
     * @param BindClusterIds Cluster ID for which a binding relationship needs to be established.
     */
    public void setBindClusterIds(String [] BindClusterIds) {
        this.BindClusterIds = BindClusterIds;
    }

    /**
     * Get Cluster ID for which the binding relationship needs to be unbound. 
     * @return UnbindClusterIds Cluster ID for which the binding relationship needs to be unbound.
     */
    public String [] getUnbindClusterIds() {
        return this.UnbindClusterIds;
    }

    /**
     * Set Cluster ID for which the binding relationship needs to be unbound.
     * @param UnbindClusterIds Cluster ID for which the binding relationship needs to be unbound.
     */
    public void setUnbindClusterIds(String [] UnbindClusterIds) {
        this.UnbindClusterIds = UnbindClusterIds;
    }

    public ModifyResourcePackageClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourcePackageClustersRequest(ModifyResourcePackageClustersRequest source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.BindClusterIds != null) {
            this.BindClusterIds = new String[source.BindClusterIds.length];
            for (int i = 0; i < source.BindClusterIds.length; i++) {
                this.BindClusterIds[i] = new String(source.BindClusterIds[i]);
            }
        }
        if (source.UnbindClusterIds != null) {
            this.UnbindClusterIds = new String[source.UnbindClusterIds.length];
            for (int i = 0; i < source.UnbindClusterIds.length; i++) {
                this.UnbindClusterIds[i] = new String(source.UnbindClusterIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamArraySimple(map, prefix + "BindClusterIds.", this.BindClusterIds);
        this.setParamArraySimple(map, prefix + "UnbindClusterIds.", this.UnbindClusterIds);

    }
}

