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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRaspPluginListRequest extends AbstractModel {

    /**
    * Asset type
-CWP host security asset
-TCSS_HOST container host node
-TCSS_EKS Container Super Node
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Machine unique ID
    */
    @SerializedName("QUUID")
    @Expose
    private String QUUID;

    /**
    * Filter parameters
PluginStatus Plug-in status (Injecting, Injected successfully, Timed out, Plug-in exit, Injection failure)
process PID
Main class name of the process
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of entries. Default value: 10.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Asset type
-CWP host security asset
-TCSS_HOST container host node
-TCSS_EKS Container Super Node 
     * @return AssetType Asset type
-CWP host security asset
-TCSS_HOST container host node
-TCSS_EKS Container Super Node
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
-CWP host security asset
-TCSS_HOST container host node
-TCSS_EKS Container Super Node
     * @param AssetType Asset type
-CWP host security asset
-TCSS_HOST container host node
-TCSS_EKS Container Super Node
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Machine unique ID 
     * @return QUUID Machine unique ID
     */
    public String getQUUID() {
        return this.QUUID;
    }

    /**
     * Set Machine unique ID
     * @param QUUID Machine unique ID
     */
    public void setQUUID(String QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get Filter parameters
PluginStatus Plug-in status (Injecting, Injected successfully, Timed out, Plug-in exit, Injection failure)
process PID
Main class name of the process 
     * @return Filters Filter parameters
PluginStatus Plug-in status (Injecting, Injected successfully, Timed out, Plug-in exit, Injection failure)
process PID
Main class name of the process
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameters
PluginStatus Plug-in status (Injecting, Injected successfully, Timed out, Plug-in exit, Injection failure)
process PID
Main class name of the process
     * @param Filters Filter parameters
PluginStatus Plug-in status (Injecting, Injected successfully, Timed out, Plug-in exit, Injection failure)
process PID
Main class name of the process
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of entries. Default value: 10. 
     * @return Limit Maximum number of entries. Default value: 10.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of entries. Default value: 10.
     * @param Limit Maximum number of entries. Default value: 10.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRaspPluginListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRaspPluginListRequest(DescribeRaspPluginListRequest source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.QUUID != null) {
            this.QUUID = new String(source.QUUID);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
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
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "QUUID", this.QUUID);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

