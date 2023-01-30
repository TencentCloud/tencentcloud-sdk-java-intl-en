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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVulContainerExportJobRequest extends AbstractModel{

    /**
    * POC ID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
    * Number of results to be returned. Default value: `50000`. Maximum value: `50000`.
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
<li>OnlyAffectedNewestImage- Bool- Required: No - Show only vulnerabilities that affect the latest image tags</li>
<li>ContainerID- string - Required: No - Container ID</li>
<li>ContainerName- String - Required: No - Container name</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
     * Get POC ID 
     * @return PocID POC ID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set POC ID
     * @param PocID POC ID
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    /**
     * Get Number of results to be returned. Default value: `50000`. Maximum value: `50000`. 
     * @return Limit Number of results to be returned. Default value: `50000`. Maximum value: `50000`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Default value: `50000`. Maximum value: `50000`.
     * @param Limit Number of results to be returned. Default value: `50000`. Maximum value: `50000`.
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
<li>OnlyAffectedNewestImage- Bool- Required: No - Show only vulnerabilities that affect the latest image tags</li>
<li>ContainerID- string - Required: No - Container ID</li>
<li>ContainerName- String - Required: No - Container name</li> 
     * @return Filters Filter
<li>OnlyAffectedNewestImage- Bool- Required: No - Show only vulnerabilities that affect the latest image tags</li>
<li>ContainerID- string - Required: No - Container ID</li>
<li>ContainerName- String - Required: No - Container name</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
<li>OnlyAffectedNewestImage- Bool- Required: No - Show only vulnerabilities that affect the latest image tags</li>
<li>ContainerID- string - Required: No - Container ID</li>
<li>ContainerName- String - Required: No - Container name</li>
     * @param Filters Filter
<li>OnlyAffectedNewestImage- Bool- Required: No - Show only vulnerabilities that affect the latest image tags</li>
<li>ContainerID- string - Required: No - Container ID</li>
<li>ContainerName- String - Required: No - Container name</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    public CreateVulContainerExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVulContainerExportJobRequest(CreateVulContainerExportJobRequest source) {
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
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
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

