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

public class CreateRiskDnsEventExportJobRequest extends AbstractModel{

    /**
    * Filters.
<li>`EventStatus` - String - Optional - Event status. Values: `EVENT_UNDEAL` (Pending); `EVENT_DEALED` (Handled); `EVENT_IGNORE` (Ignored); `EVENT_ADD_WHITE` (Added to the allowlist)</li>
<li>`ContainerStatus` - String - Optional - Container running status. `CREATED`, `RUNNING`, `PAUSED`, `STOPPED`, `RESTARTING`: `REMOVING`, `DESTROYED (Terminated)</li>
<li>`ContainerNetStatus` - String - Optional - Container network status. Values: `NORMAL`, `ISOLATED`, `ISOLATE_FAILED` (Isolation failed`; `RESTORE_FAILED` (Failed to restore from isolation), `RESTORING` (Restoring); `ISOLATING`</li>
<li>`EventType` - String - Optional - Event type. Values: `DOMAIN` (Malicious domain); `IP` (Malicious IP)</li>
<li>`TimeRange` - String - Optional - Time range, where the first value represents the start time and the second value represents the end time</li>
<li>`RiskDns` - String - Optional - Malicious domain. </li>
<li>`RiskIP`- String - Optional - Malicious IP. </li>
<li>`ContainerName` - String - Optional - Container name. </li>
<li>`ContainerID` - String - Optional - Container ID. </li>
<li>`ImageName` - String - Optional - Image name. </li>
<li>`ImageID` - String - Optional - Image ID. </li>
<li>`HostName` - String - Optional - Server name. </li>
<li>`HostIP` - String - Optional - Private IP. </li>
<li>`PublicIP` - String - Optional - Public IP. </li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * The number of results displayed per page. The maximum value is 100,000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sort order: `asc`, `desc`
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field: Number of events: EventCount
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Filters.
<li>`EventStatus` - String - Optional - Event status. Values: `EVENT_UNDEAL` (Pending); `EVENT_DEALED` (Handled); `EVENT_IGNORE` (Ignored); `EVENT_ADD_WHITE` (Added to the allowlist)</li>
<li>`ContainerStatus` - String - Optional - Container running status. `CREATED`, `RUNNING`, `PAUSED`, `STOPPED`, `RESTARTING`: `REMOVING`, `DESTROYED (Terminated)</li>
<li>`ContainerNetStatus` - String - Optional - Container network status. Values: `NORMAL`, `ISOLATED`, `ISOLATE_FAILED` (Isolation failed`; `RESTORE_FAILED` (Failed to restore from isolation), `RESTORING` (Restoring); `ISOLATING`</li>
<li>`EventType` - String - Optional - Event type. Values: `DOMAIN` (Malicious domain); `IP` (Malicious IP)</li>
<li>`TimeRange` - String - Optional - Time range, where the first value represents the start time and the second value represents the end time</li>
<li>`RiskDns` - String - Optional - Malicious domain. </li>
<li>`RiskIP`- String - Optional - Malicious IP. </li>
<li>`ContainerName` - String - Optional - Container name. </li>
<li>`ContainerID` - String - Optional - Container ID. </li>
<li>`ImageName` - String - Optional - Image name. </li>
<li>`ImageID` - String - Optional - Image ID. </li>
<li>`HostName` - String - Optional - Server name. </li>
<li>`HostIP` - String - Optional - Private IP. </li>
<li>`PublicIP` - String - Optional - Public IP. </li> 
     * @return Filters Filters.
<li>`EventStatus` - String - Optional - Event status. Values: `EVENT_UNDEAL` (Pending); `EVENT_DEALED` (Handled); `EVENT_IGNORE` (Ignored); `EVENT_ADD_WHITE` (Added to the allowlist)</li>
<li>`ContainerStatus` - String - Optional - Container running status. `CREATED`, `RUNNING`, `PAUSED`, `STOPPED`, `RESTARTING`: `REMOVING`, `DESTROYED (Terminated)</li>
<li>`ContainerNetStatus` - String - Optional - Container network status. Values: `NORMAL`, `ISOLATED`, `ISOLATE_FAILED` (Isolation failed`; `RESTORE_FAILED` (Failed to restore from isolation), `RESTORING` (Restoring); `ISOLATING`</li>
<li>`EventType` - String - Optional - Event type. Values: `DOMAIN` (Malicious domain); `IP` (Malicious IP)</li>
<li>`TimeRange` - String - Optional - Time range, where the first value represents the start time and the second value represents the end time</li>
<li>`RiskDns` - String - Optional - Malicious domain. </li>
<li>`RiskIP`- String - Optional - Malicious IP. </li>
<li>`ContainerName` - String - Optional - Container name. </li>
<li>`ContainerID` - String - Optional - Container ID. </li>
<li>`ImageName` - String - Optional - Image name. </li>
<li>`ImageID` - String - Optional - Image ID. </li>
<li>`HostName` - String - Optional - Server name. </li>
<li>`HostIP` - String - Optional - Private IP. </li>
<li>`PublicIP` - String - Optional - Public IP. </li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters.
<li>`EventStatus` - String - Optional - Event status. Values: `EVENT_UNDEAL` (Pending); `EVENT_DEALED` (Handled); `EVENT_IGNORE` (Ignored); `EVENT_ADD_WHITE` (Added to the allowlist)</li>
<li>`ContainerStatus` - String - Optional - Container running status. `CREATED`, `RUNNING`, `PAUSED`, `STOPPED`, `RESTARTING`: `REMOVING`, `DESTROYED (Terminated)</li>
<li>`ContainerNetStatus` - String - Optional - Container network status. Values: `NORMAL`, `ISOLATED`, `ISOLATE_FAILED` (Isolation failed`; `RESTORE_FAILED` (Failed to restore from isolation), `RESTORING` (Restoring); `ISOLATING`</li>
<li>`EventType` - String - Optional - Event type. Values: `DOMAIN` (Malicious domain); `IP` (Malicious IP)</li>
<li>`TimeRange` - String - Optional - Time range, where the first value represents the start time and the second value represents the end time</li>
<li>`RiskDns` - String - Optional - Malicious domain. </li>
<li>`RiskIP`- String - Optional - Malicious IP. </li>
<li>`ContainerName` - String - Optional - Container name. </li>
<li>`ContainerID` - String - Optional - Container ID. </li>
<li>`ImageName` - String - Optional - Image name. </li>
<li>`ImageID` - String - Optional - Image ID. </li>
<li>`HostName` - String - Optional - Server name. </li>
<li>`HostIP` - String - Optional - Private IP. </li>
<li>`PublicIP` - String - Optional - Public IP. </li>
     * @param Filters Filters.
<li>`EventStatus` - String - Optional - Event status. Values: `EVENT_UNDEAL` (Pending); `EVENT_DEALED` (Handled); `EVENT_IGNORE` (Ignored); `EVENT_ADD_WHITE` (Added to the allowlist)</li>
<li>`ContainerStatus` - String - Optional - Container running status. `CREATED`, `RUNNING`, `PAUSED`, `STOPPED`, `RESTARTING`: `REMOVING`, `DESTROYED (Terminated)</li>
<li>`ContainerNetStatus` - String - Optional - Container network status. Values: `NORMAL`, `ISOLATED`, `ISOLATE_FAILED` (Isolation failed`; `RESTORE_FAILED` (Failed to restore from isolation), `RESTORING` (Restoring); `ISOLATING`</li>
<li>`EventType` - String - Optional - Event type. Values: `DOMAIN` (Malicious domain); `IP` (Malicious IP)</li>
<li>`TimeRange` - String - Optional - Time range, where the first value represents the start time and the second value represents the end time</li>
<li>`RiskDns` - String - Optional - Malicious domain. </li>
<li>`RiskIP`- String - Optional - Malicious IP. </li>
<li>`ContainerName` - String - Optional - Container name. </li>
<li>`ContainerID` - String - Optional - Container ID. </li>
<li>`ImageName` - String - Optional - Image name. </li>
<li>`ImageID` - String - Optional - Image ID. </li>
<li>`HostName` - String - Optional - Server name. </li>
<li>`HostIP` - String - Optional - Private IP. </li>
<li>`PublicIP` - String - Optional - Public IP. </li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The number of results displayed per page. The maximum value is 100,000. 
     * @return Limit The number of results displayed per page. The maximum value is 100,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of results displayed per page. The maximum value is 100,000.
     * @param Limit The number of results displayed per page. The maximum value is 100,000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Get Sort order: `asc`, `desc` 
     * @return Order Sort order: `asc`, `desc`
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort order: `asc`, `desc`
     * @param Order Sort order: `asc`, `desc`
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field: Number of events: EventCount 
     * @return By Sorting field: Number of events: EventCount
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field: Number of events: EventCount
     * @param By Sorting field: Number of events: EventCount
     */
    public void setBy(String By) {
        this.By = By;
    }

    public CreateRiskDnsEventExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRiskDnsEventExportJobRequest(CreateRiskDnsEventExportJobRequest source) {
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

