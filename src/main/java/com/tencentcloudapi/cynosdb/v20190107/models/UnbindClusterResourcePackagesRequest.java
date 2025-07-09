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

public class UnbindClusterResourcePackagesRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The unique ID of a resource pack. If this parameter is left empty, all resource packs of the instance will be unbound.
    */
    @SerializedName("PackageIds")
    @Expose
    private String [] PackageIds;

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
     * Get The unique ID of a resource pack. If this parameter is left empty, all resource packs of the instance will be unbound. 
     * @return PackageIds The unique ID of a resource pack. If this parameter is left empty, all resource packs of the instance will be unbound.
     */
    public String [] getPackageIds() {
        return this.PackageIds;
    }

    /**
     * Set The unique ID of a resource pack. If this parameter is left empty, all resource packs of the instance will be unbound.
     * @param PackageIds The unique ID of a resource pack. If this parameter is left empty, all resource packs of the instance will be unbound.
     */
    public void setPackageIds(String [] PackageIds) {
        this.PackageIds = PackageIds;
    }

    public UnbindClusterResourcePackagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindClusterResourcePackagesRequest(UnbindClusterResourcePackagesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.PackageIds != null) {
            this.PackageIds = new String[source.PackageIds.length];
            for (int i = 0; i < source.PackageIds.length; i++) {
                this.PackageIds[i] = new String(source.PackageIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "PackageIds.", this.PackageIds);

    }
}

