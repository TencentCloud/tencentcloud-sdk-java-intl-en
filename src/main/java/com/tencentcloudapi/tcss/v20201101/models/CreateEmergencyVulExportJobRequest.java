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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEmergencyVulExportJobRequest extends AbstractModel {

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
<li>Level- String - Required: No - Severity. Valid values: `CRITICAL` (critical); `HIGH` (high); `MIDDLE` (medium); `LOW` (low).</li>
<li>Tags- string - Required: No - Vulnerability tag. Valid values: `POC`, `EXP`.</li>
<li>CanBeFixed- string - Required: No - Whether the vulnerability can be fixed. Valid values: `true`, `false`.</li>
<li>CVEID- string - Required: No - CVE No.</li>
<li>ImageID- string - Required: No - Image ID</li>
<li>ImageName- String - Required: No - Image name</li>
<li>ContainerID- string - Required: No - Container ID</li>
<li>ContainerName- string - Required: No - Container name</li>
<li>ComponentName- string - Required: No - Component name</li>
<li>ComponentVersion- string - Required: No - Component version</li>
<li>Name- string - Required: No - Vulnerability name</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * Sorting order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field
    */
    @SerializedName("By")
    @Expose
    private String By;

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
<li>Level- String - Required: No - Severity. Valid values: `CRITICAL` (critical); `HIGH` (high); `MIDDLE` (medium); `LOW` (low).</li>
<li>Tags- string - Required: No - Vulnerability tag. Valid values: `POC`, `EXP`.</li>
<li>CanBeFixed- string - Required: No - Whether the vulnerability can be fixed. Valid values: `true`, `false`.</li>
<li>CVEID- string - Required: No - CVE No.</li>
<li>ImageID- string - Required: No - Image ID</li>
<li>ImageName- String - Required: No - Image name</li>
<li>ContainerID- string - Required: No - Container ID</li>
<li>ContainerName- string - Required: No - Container name</li>
<li>ComponentName- string - Required: No - Component name</li>
<li>ComponentVersion- string - Required: No - Component version</li>
<li>Name- string - Required: No - Vulnerability name</li> 
     * @return Filters Filter
<li>Level- String - Required: No - Severity. Valid values: `CRITICAL` (critical); `HIGH` (high); `MIDDLE` (medium); `LOW` (low).</li>
<li>Tags- string - Required: No - Vulnerability tag. Valid values: `POC`, `EXP`.</li>
<li>CanBeFixed- string - Required: No - Whether the vulnerability can be fixed. Valid values: `true`, `false`.</li>
<li>CVEID- string - Required: No - CVE No.</li>
<li>ImageID- string - Required: No - Image ID</li>
<li>ImageName- String - Required: No - Image name</li>
<li>ContainerID- string - Required: No - Container ID</li>
<li>ContainerName- string - Required: No - Container name</li>
<li>ComponentName- string - Required: No - Component name</li>
<li>ComponentVersion- string - Required: No - Component version</li>
<li>Name- string - Required: No - Vulnerability name</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
<li>Level- String - Required: No - Severity. Valid values: `CRITICAL` (critical); `HIGH` (high); `MIDDLE` (medium); `LOW` (low).</li>
<li>Tags- string - Required: No - Vulnerability tag. Valid values: `POC`, `EXP`.</li>
<li>CanBeFixed- string - Required: No - Whether the vulnerability can be fixed. Valid values: `true`, `false`.</li>
<li>CVEID- string - Required: No - CVE No.</li>
<li>ImageID- string - Required: No - Image ID</li>
<li>ImageName- String - Required: No - Image name</li>
<li>ContainerID- string - Required: No - Container ID</li>
<li>ContainerName- string - Required: No - Container name</li>
<li>ComponentName- string - Required: No - Component name</li>
<li>ComponentVersion- string - Required: No - Component version</li>
<li>Name- string - Required: No - Vulnerability name</li>
     * @param Filters Filter
<li>Level- String - Required: No - Severity. Valid values: `CRITICAL` (critical); `HIGH` (high); `MIDDLE` (medium); `LOW` (low).</li>
<li>Tags- string - Required: No - Vulnerability tag. Valid values: `POC`, `EXP`.</li>
<li>CanBeFixed- string - Required: No - Whether the vulnerability can be fixed. Valid values: `true`, `false`.</li>
<li>CVEID- string - Required: No - CVE No.</li>
<li>ImageID- string - Required: No - Image ID</li>
<li>ImageName- String - Required: No - Image name</li>
<li>ContainerID- string - Required: No - Container ID</li>
<li>ContainerName- string - Required: No - Container name</li>
<li>ComponentName- string - Required: No - Component name</li>
<li>ComponentVersion- string - Required: No - Component version</li>
<li>Name- string - Required: No - Vulnerability name</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting order 
     * @return Order Sorting order
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order
     * @param Order Sorting order
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field 
     * @return By Sorting field
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field
     * @param By Sorting field
     */
    public void setBy(String By) {
        this.By = By;
    }

    public CreateEmergencyVulExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEmergencyVulExportJobRequest(CreateEmergencyVulExportJobRequest source) {
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
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

