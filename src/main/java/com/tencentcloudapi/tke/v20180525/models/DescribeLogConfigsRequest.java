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

public class DescribeLogConfigsRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Currently supported cluster types are tke and eks. The default is tke.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * Search by collection rule name. For multiple collection rules, they are separated by ",".
    */
    @SerializedName("LogConfigNames")
    @Expose
    private String LogConfigNames;

    /**
    * Offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of output entries. Default value: 20; maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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
     * Get Currently supported cluster types are tke and eks. The default is tke. 
     * @return ClusterType Currently supported cluster types are tke and eks. The default is tke.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Currently supported cluster types are tke and eks. The default is tke.
     * @param ClusterType Currently supported cluster types are tke and eks. The default is tke.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get Search by collection rule name. For multiple collection rules, they are separated by ",". 
     * @return LogConfigNames Search by collection rule name. For multiple collection rules, they are separated by ",".
     */
    public String getLogConfigNames() {
        return this.LogConfigNames;
    }

    /**
     * Set Search by collection rule name. For multiple collection rules, they are separated by ",".
     * @param LogConfigNames Search by collection rule name. For multiple collection rules, they are separated by ",".
     */
    public void setLogConfigNames(String LogConfigNames) {
        this.LogConfigNames = LogConfigNames;
    }

    /**
     * Get Offset. Default value: 0 
     * @return Offset Offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0
     * @param Offset Offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of output entries. Default value: 20; maximum value: 100. 
     * @return Limit Maximum number of output entries. Default value: 20; maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of output entries. Default value: 20; maximum value: 100.
     * @param Limit Maximum number of output entries. Default value: 20; maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeLogConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogConfigsRequest(DescribeLogConfigsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.LogConfigNames != null) {
            this.LogConfigNames = new String(source.LogConfigNames);
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "LogConfigNames", this.LogConfigNames);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

