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

public class CreateEscapeWhiteListExportJobRequest extends AbstractModel {

    /**
    * Filter
<li>EventType- String - Required: No - Allowed event type. Valid values: `ESCAPE_CGROUPS` (cgroup escape); `ESCAPE_TAMPER_SENSITIVE_FILE` (file tamper escape); `ESCAPE_DOCKER_API` (Docker API access escape); `ESCAPE_VUL_OCCURRED` (vulnerability exploit); `MOUNT_SENSITIVE_PTAH` (sensitive path mount); `PRIVILEGE_CONTAINER_START` (privileged container); `PRIVILEGE` (program privilege escalation escape).</li>
<li>ImageName- string - Required: No - Image name</li>
<li>ImageID- string - Required: No - Image ID</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * Number of results to be returned. Default value: `10000`. Maximum value: `10000`.
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
    * Sorting order. Valid values: `asc`, `desc`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field. Valid values: `HostCount` (number of servers); `ContainerCount` (number of containers); `UpdateTime` (update time).
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Filter
<li>EventType- String - Required: No - Allowed event type. Valid values: `ESCAPE_CGROUPS` (cgroup escape); `ESCAPE_TAMPER_SENSITIVE_FILE` (file tamper escape); `ESCAPE_DOCKER_API` (Docker API access escape); `ESCAPE_VUL_OCCURRED` (vulnerability exploit); `MOUNT_SENSITIVE_PTAH` (sensitive path mount); `PRIVILEGE_CONTAINER_START` (privileged container); `PRIVILEGE` (program privilege escalation escape).</li>
<li>ImageName- string - Required: No - Image name</li>
<li>ImageID- string - Required: No - Image ID</li> 
     * @return Filters Filter
<li>EventType- String - Required: No - Allowed event type. Valid values: `ESCAPE_CGROUPS` (cgroup escape); `ESCAPE_TAMPER_SENSITIVE_FILE` (file tamper escape); `ESCAPE_DOCKER_API` (Docker API access escape); `ESCAPE_VUL_OCCURRED` (vulnerability exploit); `MOUNT_SENSITIVE_PTAH` (sensitive path mount); `PRIVILEGE_CONTAINER_START` (privileged container); `PRIVILEGE` (program privilege escalation escape).</li>
<li>ImageName- string - Required: No - Image name</li>
<li>ImageID- string - Required: No - Image ID</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
<li>EventType- String - Required: No - Allowed event type. Valid values: `ESCAPE_CGROUPS` (cgroup escape); `ESCAPE_TAMPER_SENSITIVE_FILE` (file tamper escape); `ESCAPE_DOCKER_API` (Docker API access escape); `ESCAPE_VUL_OCCURRED` (vulnerability exploit); `MOUNT_SENSITIVE_PTAH` (sensitive path mount); `PRIVILEGE_CONTAINER_START` (privileged container); `PRIVILEGE` (program privilege escalation escape).</li>
<li>ImageName- string - Required: No - Image name</li>
<li>ImageID- string - Required: No - Image ID</li>
     * @param Filters Filter
<li>EventType- String - Required: No - Allowed event type. Valid values: `ESCAPE_CGROUPS` (cgroup escape); `ESCAPE_TAMPER_SENSITIVE_FILE` (file tamper escape); `ESCAPE_DOCKER_API` (Docker API access escape); `ESCAPE_VUL_OCCURRED` (vulnerability exploit); `MOUNT_SENSITIVE_PTAH` (sensitive path mount); `PRIVILEGE_CONTAINER_START` (privileged container); `PRIVILEGE` (program privilege escalation escape).</li>
<li>ImageName- string - Required: No - Image name</li>
<li>ImageID- string - Required: No - Image ID</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of results to be returned. Default value: `10000`. Maximum value: `10000`. 
     * @return Limit Number of results to be returned. Default value: `10000`. Maximum value: `10000`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Default value: `10000`. Maximum value: `10000`.
     * @param Limit Number of results to be returned. Default value: `10000`. Maximum value: `10000`.
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
     * Get Sorting order. Valid values: `asc`, `desc`. 
     * @return Order Sorting order. Valid values: `asc`, `desc`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order. Valid values: `asc`, `desc`.
     * @param Order Sorting order. Valid values: `asc`, `desc`.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field. Valid values: `HostCount` (number of servers); `ContainerCount` (number of containers); `UpdateTime` (update time). 
     * @return By Sorting field. Valid values: `HostCount` (number of servers); `ContainerCount` (number of containers); `UpdateTime` (update time).
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field. Valid values: `HostCount` (number of servers); `ContainerCount` (number of containers); `UpdateTime` (update time).
     * @param By Sorting field. Valid values: `HostCount` (number of servers); `ContainerCount` (number of containers); `UpdateTime` (update time).
     */
    public void setBy(String By) {
        this.By = By;
    }

    public CreateEscapeWhiteListExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEscapeWhiteListExportJobRequest(CreateEscapeWhiteListExportJobRequest source) {
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

