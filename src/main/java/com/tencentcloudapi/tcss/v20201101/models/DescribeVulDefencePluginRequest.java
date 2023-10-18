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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulDefencePluginRequest extends AbstractModel {

    /**
    * Server host ID, i.e., QUuid
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * Number of results to be returned. Default value: `10`. Maximum value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter
<li>Status- String - Required: No - Plugin status. Valid values: `INJECTING` (injecting); `SUCCESS` (injected successfully); `FAIL` (injection failed); `TIMEOUT` (plugin timed out); `QUIT` (plugin exited).</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
     * Get Server host ID, i.e., QUuid 
     * @return HostID Server host ID, i.e., QUuid
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set Server host ID, i.e., QUuid
     * @param HostID Server host ID, i.e., QUuid
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get Number of results to be returned. Default value: `10`. Maximum value: `100`. 
     * @return Limit Number of results to be returned. Default value: `10`. Maximum value: `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Default value: `10`. Maximum value: `100`.
     * @param Limit Number of results to be returned. Default value: `10`. Maximum value: `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: `0`. 
     * @return Offset Offset. Default value: `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: `0`.
     * @param Offset Offset. Default value: `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter
<li>Status- String - Required: No - Plugin status. Valid values: `INJECTING` (injecting); `SUCCESS` (injected successfully); `FAIL` (injection failed); `TIMEOUT` (plugin timed out); `QUIT` (plugin exited).</li> 
     * @return Filters Filter
<li>Status- String - Required: No - Plugin status. Valid values: `INJECTING` (injecting); `SUCCESS` (injected successfully); `FAIL` (injection failed); `TIMEOUT` (plugin timed out); `QUIT` (plugin exited).</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
<li>Status- String - Required: No - Plugin status. Valid values: `INJECTING` (injecting); `SUCCESS` (injected successfully); `FAIL` (injection failed); `TIMEOUT` (plugin timed out); `QUIT` (plugin exited).</li>
     * @param Filters Filter
<li>Status- String - Required: No - Plugin status. Valid values: `INJECTING` (injecting); `SUCCESS` (injected successfully); `FAIL` (injection failed); `TIMEOUT` (plugin timed out); `QUIT` (plugin exited).</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeVulDefencePluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulDefencePluginRequest(DescribeVulDefencePluginRequest source) {
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

