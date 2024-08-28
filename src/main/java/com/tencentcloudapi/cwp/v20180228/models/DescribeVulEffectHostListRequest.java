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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulEffectHostListRequest extends AbstractModel {

    /**
    * Pagination limit, with the maximum value being 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Filter criteria:
<li>AliasName - String - host name for filtering</li>
<li>TagIds - String - array of host tag IDs separated by commas</li>
<li>Status - String - status: 0: pending; 1: ignored; 3: fixed; 5: detecting; 6: fixing; 8: fixing failed</li>
<li>Uuid - String array - UUID array</li>
<li>Version - String array - paid edition array: "Flagship": Ultimate Edition; "PRO_VERSION": Pro Edition; "BASIC_VERSION": Basic Edition</li>
<li>InstanceState - String array - instance status array: "PENDING": creating; "LAUNCH_FAILED": creation failed; "RUNNING": running; "STOPPED": shut down; "STARTING": starting; "STOPPING": shutting down; "REBOOTING": restarting; "SHUTDOWN": to be terminated; "TERMINATING": terminating; "UNKNOWN": unknown (for non-Tencent Cloud machines and offline client) </li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Pagination limit, with the maximum value being 100. 
     * @return Limit Pagination limit, with the maximum value being 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination limit, with the maximum value being 100.
     * @param Limit Pagination limit, with the maximum value being 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset 
     * @return Offset Pagination offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset
     * @param Offset Pagination offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Vulnerability ID 
     * @return VulId Vulnerability ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID
     * @param VulId Vulnerability ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Filter criteria:
<li>AliasName - String - host name for filtering</li>
<li>TagIds - String - array of host tag IDs separated by commas</li>
<li>Status - String - status: 0: pending; 1: ignored; 3: fixed; 5: detecting; 6: fixing; 8: fixing failed</li>
<li>Uuid - String array - UUID array</li>
<li>Version - String array - paid edition array: "Flagship": Ultimate Edition; "PRO_VERSION": Pro Edition; "BASIC_VERSION": Basic Edition</li>
<li>InstanceState - String array - instance status array: "PENDING": creating; "LAUNCH_FAILED": creation failed; "RUNNING": running; "STOPPED": shut down; "STARTING": starting; "STOPPING": shutting down; "REBOOTING": restarting; "SHUTDOWN": to be terminated; "TERMINATING": terminating; "UNKNOWN": unknown (for non-Tencent Cloud machines and offline client) </li> 
     * @return Filters Filter criteria:
<li>AliasName - String - host name for filtering</li>
<li>TagIds - String - array of host tag IDs separated by commas</li>
<li>Status - String - status: 0: pending; 1: ignored; 3: fixed; 5: detecting; 6: fixing; 8: fixing failed</li>
<li>Uuid - String array - UUID array</li>
<li>Version - String array - paid edition array: "Flagship": Ultimate Edition; "PRO_VERSION": Pro Edition; "BASIC_VERSION": Basic Edition</li>
<li>InstanceState - String array - instance status array: "PENDING": creating; "LAUNCH_FAILED": creation failed; "RUNNING": running; "STOPPED": shut down; "STARTING": starting; "STOPPING": shutting down; "REBOOTING": restarting; "SHUTDOWN": to be terminated; "TERMINATING": terminating; "UNKNOWN": unknown (for non-Tencent Cloud machines and offline client) </li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria:
<li>AliasName - String - host name for filtering</li>
<li>TagIds - String - array of host tag IDs separated by commas</li>
<li>Status - String - status: 0: pending; 1: ignored; 3: fixed; 5: detecting; 6: fixing; 8: fixing failed</li>
<li>Uuid - String array - UUID array</li>
<li>Version - String array - paid edition array: "Flagship": Ultimate Edition; "PRO_VERSION": Pro Edition; "BASIC_VERSION": Basic Edition</li>
<li>InstanceState - String array - instance status array: "PENDING": creating; "LAUNCH_FAILED": creation failed; "RUNNING": running; "STOPPED": shut down; "STARTING": starting; "STOPPING": shutting down; "REBOOTING": restarting; "SHUTDOWN": to be terminated; "TERMINATING": terminating; "UNKNOWN": unknown (for non-Tencent Cloud machines and offline client) </li>
     * @param Filters Filter criteria:
<li>AliasName - String - host name for filtering</li>
<li>TagIds - String - array of host tag IDs separated by commas</li>
<li>Status - String - status: 0: pending; 1: ignored; 3: fixed; 5: detecting; 6: fixing; 8: fixing failed</li>
<li>Uuid - String array - UUID array</li>
<li>Version - String array - paid edition array: "Flagship": Ultimate Edition; "PRO_VERSION": Pro Edition; "BASIC_VERSION": Basic Edition</li>
<li>InstanceState - String array - instance status array: "PENDING": creating; "LAUNCH_FAILED": creation failed; "RUNNING": running; "STOPPED": shut down; "STARTING": starting; "STOPPING": shutting down; "REBOOTING": restarting; "SHUTDOWN": to be terminated; "TERMINATING": terminating; "UNKNOWN": unknown (for non-Tencent Cloud machines and offline client) </li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeVulEffectHostListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulEffectHostListRequest(DescribeVulEffectHostListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

