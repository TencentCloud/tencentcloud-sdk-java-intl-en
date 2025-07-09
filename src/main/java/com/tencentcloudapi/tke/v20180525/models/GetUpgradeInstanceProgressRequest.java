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

public class GetUpgradeInstanceProgressRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Maximum number of nodes to be queried
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The starting node for the query
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

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
     * Get Maximum number of nodes to be queried 
     * @return Limit Maximum number of nodes to be queried
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of nodes to be queried
     * @param Limit Maximum number of nodes to be queried
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The starting node for the query 
     * @return Offset The starting node for the query
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The starting node for the query
     * @param Offset The starting node for the query
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public GetUpgradeInstanceProgressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetUpgradeInstanceProgressRequest(GetUpgradeInstanceProgressRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

