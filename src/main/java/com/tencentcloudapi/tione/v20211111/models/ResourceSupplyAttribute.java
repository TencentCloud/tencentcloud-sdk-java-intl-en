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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceSupplyAttribute extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SupplyType")
    @Expose
    private String SupplyType;

    /**
    * 
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
     * Get  
     * @return SupplyType 
     */
    public String getSupplyType() {
        return this.SupplyType;
    }

    /**
     * Set 
     * @param SupplyType 
     */
    public void setSupplyType(String SupplyType) {
        this.SupplyType = SupplyType;
    }

    /**
     * Get  
     * @return ClusterType 
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 
     * @param ClusterType 
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public ResourceSupplyAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceSupplyAttribute(ResourceSupplyAttribute source) {
        if (source.SupplyType != null) {
            this.SupplyType = new String(source.SupplyType);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SupplyType", this.SupplyType);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

