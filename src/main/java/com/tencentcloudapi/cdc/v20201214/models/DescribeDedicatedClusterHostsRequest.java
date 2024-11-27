/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDedicatedClusterHostsRequest extends AbstractModel {

    /**
    * Cluster id
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * Offset, 0 by default
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned pieces, 20 by default
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Cluster id 
     * @return DedicatedClusterId Cluster id
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set Cluster id
     * @param DedicatedClusterId Cluster id
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get Offset, 0 by default 
     * @return Offset Offset, 0 by default
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, 0 by default
     * @param Offset Offset, 0 by default
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned pieces, 20 by default 
     * @return Limit Number of returned pieces, 20 by default
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned pieces, 20 by default
     * @param Limit Number of returned pieces, 20 by default
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDedicatedClusterHostsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDedicatedClusterHostsRequest(DescribeDedicatedClusterHostsRequest source) {
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

