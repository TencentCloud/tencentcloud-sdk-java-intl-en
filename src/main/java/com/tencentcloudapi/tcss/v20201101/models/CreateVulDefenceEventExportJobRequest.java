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

public class CreateVulDefenceEventExportJobRequest extends AbstractModel {

    /**
    * Filter
<li>Status- String - Required: No - Plugin status. Valid values: `EVENT_UNDEAL` (pending); `EVENT_DEALED` (processed); `EVENT_IGNORE` (ignored); `EVENT_DEFENDED` (defended).</li>
<li>ContainerStatus- String - Required: No - Container status. Valid values: `CREATED` (created); `RUNNING` (running); `PAUSED` (suspended); 	`STOPPED` (stopped); `RESTARTING` (restarting); `REMOVING` (removing); `DESTROYED` (terminated).</li>
<li>ContainerNetStatus- String - Required: No - Container network status. Valid values: `NORMAL` (not isolated); `ISOLATED` (isolated); `ISOLATE_FAILED` (isolation failed); `RESTORE_FAILED` (recovery failed); `RESTORING` (recovering); `ISOLATING` (isolating).</li>
<li>EventType - String - Required: No - Intrusion status. Valid values: `EVENT_DEFENDED` (defended successfully); `EVENT_ATTACK` (attack attempt).</li>
<li>TimeRange- String - Required: No - Time range. The first value indicates the start time, and the second the end time.</li>
<li>VulName- string - Required: No - Vulnerability name</li>
<li>CVEID- string - Required: No - CVE No.</li>
<li>SourceIP- string - Required: No - Attacker IP</li>
<li>ContainerName- string - Required: No - Container name</li>
<li>ContainerID- string - Required: No - Container ID</li>
<li>ImageName- string - Required: No - Image name</li>
<li>ImageID- string - Required: No - Image ID</li>
<li>HostName- string - Required: No - Server name</li>
<li>HostIP- string - Required: No - Private IP</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * Number of results to be returned. Maximum value: `100000`.
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
    * Sorting field: `EventCount` (number of events).
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Filter
<li>Status- String - Required: No - Plugin status. Valid values: `EVENT_UNDEAL` (pending); `EVENT_DEALED` (processed); `EVENT_IGNORE` (ignored); `EVENT_DEFENDED` (defended).</li>
<li>ContainerStatus- String - Required: No - Container status. Valid values: `CREATED` (created); `RUNNING` (running); `PAUSED` (suspended); 	`STOPPED` (stopped); `RESTARTING` (restarting); `REMOVING` (removing); `DESTROYED` (terminated).</li>
<li>ContainerNetStatus- String - Required: No - Container network status. Valid values: `NORMAL` (not isolated); `ISOLATED` (isolated); `ISOLATE_FAILED` (isolation failed); `RESTORE_FAILED` (recovery failed); `RESTORING` (recovering); `ISOLATING` (isolating).</li>
<li>EventType - String - Required: No - Intrusion status. Valid values: `EVENT_DEFENDED` (defended successfully); `EVENT_ATTACK` (attack attempt).</li>
<li>TimeRange- String - Required: No - Time range. The first value indicates the start time, and the second the end time.</li>
<li>VulName- string - Required: No - Vulnerability name</li>
<li>CVEID- string - Required: No - CVE No.</li>
<li>SourceIP- string - Required: No - Attacker IP</li>
<li>ContainerName- string - Required: No - Container name</li>
<li>ContainerID- string - Required: No - Container ID</li>
<li>ImageName- string - Required: No - Image name</li>
<li>ImageID- string - Required: No - Image ID</li>
<li>HostName- string - Required: No - Server name</li>
<li>HostIP- string - Required: No - Private IP</li> 
     * @return Filters Filter
<li>Status- String - Required: No - Plugin status. Valid values: `EVENT_UNDEAL` (pending); `EVENT_DEALED` (processed); `EVENT_IGNORE` (ignored); `EVENT_DEFENDED` (defended).</li>
<li>ContainerStatus- String - Required: No - Container status. Valid values: `CREATED` (created); `RUNNING` (running); `PAUSED` (suspended); 	`STOPPED` (stopped); `RESTARTING` (restarting); `REMOVING` (removing); `DESTROYED` (terminated).</li>
<li>ContainerNetStatus- String - Required: No - Container network status. Valid values: `NORMAL` (not isolated); `ISOLATED` (isolated); `ISOLATE_FAILED` (isolation failed); `RESTORE_FAILED` (recovery failed); `RESTORING` (recovering); `ISOLATING` (isolating).</li>
<li>EventType - String - Required: No - Intrusion status. Valid values: `EVENT_DEFENDED` (defended successfully); `EVENT_ATTACK` (attack attempt).</li>
<li>TimeRange- String - Required: No - Time range. The first value indicates the start time, and the second the end time.</li>
<li>VulName- string - Required: No - Vulnerability name</li>
<li>CVEID- string - Required: No - CVE No.</li>
<li>SourceIP- string - Required: No - Attacker IP</li>
<li>ContainerName- string - Required: No - Container name</li>
<li>ContainerID- string - Required: No - Container ID</li>
<li>ImageName- string - Required: No - Image name</li>
<li>ImageID- string - Required: No - Image ID</li>
<li>HostName- string - Required: No - Server name</li>
<li>HostIP- string - Required: No - Private IP</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
<li>Status- String - Required: No - Plugin status. Valid values: `EVENT_UNDEAL` (pending); `EVENT_DEALED` (processed); `EVENT_IGNORE` (ignored); `EVENT_DEFENDED` (defended).</li>
<li>ContainerStatus- String - Required: No - Container status. Valid values: `CREATED` (created); `RUNNING` (running); `PAUSED` (suspended); 	`STOPPED` (stopped); `RESTARTING` (restarting); `REMOVING` (removing); `DESTROYED` (terminated).</li>
<li>ContainerNetStatus- String - Required: No - Container network status. Valid values: `NORMAL` (not isolated); `ISOLATED` (isolated); `ISOLATE_FAILED` (isolation failed); `RESTORE_FAILED` (recovery failed); `RESTORING` (recovering); `ISOLATING` (isolating).</li>
<li>EventType - String - Required: No - Intrusion status. Valid values: `EVENT_DEFENDED` (defended successfully); `EVENT_ATTACK` (attack attempt).</li>
<li>TimeRange- String - Required: No - Time range. The first value indicates the start time, and the second the end time.</li>
<li>VulName- string - Required: No - Vulnerability name</li>
<li>CVEID- string - Required: No - CVE No.</li>
<li>SourceIP- string - Required: No - Attacker IP</li>
<li>ContainerName- string - Required: No - Container name</li>
<li>ContainerID- string - Required: No - Container ID</li>
<li>ImageName- string - Required: No - Image name</li>
<li>ImageID- string - Required: No - Image ID</li>
<li>HostName- string - Required: No - Server name</li>
<li>HostIP- string - Required: No - Private IP</li>
     * @param Filters Filter
<li>Status- String - Required: No - Plugin status. Valid values: `EVENT_UNDEAL` (pending); `EVENT_DEALED` (processed); `EVENT_IGNORE` (ignored); `EVENT_DEFENDED` (defended).</li>
<li>ContainerStatus- String - Required: No - Container status. Valid values: `CREATED` (created); `RUNNING` (running); `PAUSED` (suspended); 	`STOPPED` (stopped); `RESTARTING` (restarting); `REMOVING` (removing); `DESTROYED` (terminated).</li>
<li>ContainerNetStatus- String - Required: No - Container network status. Valid values: `NORMAL` (not isolated); `ISOLATED` (isolated); `ISOLATE_FAILED` (isolation failed); `RESTORE_FAILED` (recovery failed); `RESTORING` (recovering); `ISOLATING` (isolating).</li>
<li>EventType - String - Required: No - Intrusion status. Valid values: `EVENT_DEFENDED` (defended successfully); `EVENT_ATTACK` (attack attempt).</li>
<li>TimeRange- String - Required: No - Time range. The first value indicates the start time, and the second the end time.</li>
<li>VulName- string - Required: No - Vulnerability name</li>
<li>CVEID- string - Required: No - CVE No.</li>
<li>SourceIP- string - Required: No - Attacker IP</li>
<li>ContainerName- string - Required: No - Container name</li>
<li>ContainerID- string - Required: No - Container ID</li>
<li>ImageName- string - Required: No - Image name</li>
<li>ImageID- string - Required: No - Image ID</li>
<li>HostName- string - Required: No - Server name</li>
<li>HostIP- string - Required: No - Private IP</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of results to be returned. Maximum value: `100000`. 
     * @return Limit Number of results to be returned. Maximum value: `100000`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Maximum value: `100000`.
     * @param Limit Number of results to be returned. Maximum value: `100000`.
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
     * Get Sorting field: `EventCount` (number of events). 
     * @return By Sorting field: `EventCount` (number of events).
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field: `EventCount` (number of events).
     * @param By Sorting field: `EventCount` (number of events).
     */
    public void setBy(String By) {
        this.By = By;
    }

    public CreateVulDefenceEventExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVulDefenceEventExportJobRequest(CreateVulDefenceEventExportJobRequest source) {
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

