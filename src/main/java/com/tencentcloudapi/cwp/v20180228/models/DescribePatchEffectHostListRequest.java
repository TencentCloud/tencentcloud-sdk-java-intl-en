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

public class DescribePatchEffectHostListRequest extends AbstractModel {

    /**
    * Patch ID
    */
    @SerializedName("KbId")
    @Expose
    private Long KbId;

    /**
    * Pagination limit, with the maximum value being 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter criteria:  
<li>HostVersion : uint64 data type Optional Version information : 0-Basic version 1-Pro edition 2-Flagship edition 3-Lite edition</li>
<li>InstanceState: string type, optional. Host status: "PENDING": creating; "LAUNCH_FAILED": creation failed; "RUNNING": running; "STOPPED": shut down; "STARTING": starting; "STOPPING": shutting down; "REBOOTING": restarting; "SHUTDOWN": to be terminated; "TERMINATING": terminating; "UNKNOWN": unknown (for non-Tencent Cloud machines and offline client)</li>
<li>Status - uint64 - optional - processing Status: 0 - pending; 1 - ignored; 3 - fixed</li>
<li>HostName: string type optional host name</li>
<li>InstanceID : string type optional host id</li>
<li>IpAddress: string type optional The ip address of the host</li>
<li>Uuid : string type optional host uuid</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Patch ID 
     * @return KbId Patch ID
     */
    public Long getKbId() {
        return this.KbId;
    }

    /**
     * Set Patch ID
     * @param KbId Patch ID
     */
    public void setKbId(Long KbId) {
        this.KbId = KbId;
    }

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
     * Get Pagination offset. 
     * @return Offset Pagination offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset.
     * @param Offset Pagination offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Filter criteria:  
<li>HostVersion : uint64 data type Optional Version information : 0-Basic version 1-Pro edition 2-Flagship edition 3-Lite edition</li>
<li>InstanceState: string type, optional. Host status: "PENDING": creating; "LAUNCH_FAILED": creation failed; "RUNNING": running; "STOPPED": shut down; "STARTING": starting; "STOPPING": shutting down; "REBOOTING": restarting; "SHUTDOWN": to be terminated; "TERMINATING": terminating; "UNKNOWN": unknown (for non-Tencent Cloud machines and offline client)</li>
<li>Status - uint64 - optional - processing Status: 0 - pending; 1 - ignored; 3 - fixed</li>
<li>HostName: string type optional host name</li>
<li>InstanceID : string type optional host id</li>
<li>IpAddress: string type optional The ip address of the host</li>
<li>Uuid : string type optional host uuid</li> 
     * @return Filters Filter criteria:  
<li>HostVersion : uint64 data type Optional Version information : 0-Basic version 1-Pro edition 2-Flagship edition 3-Lite edition</li>
<li>InstanceState: string type, optional. Host status: "PENDING": creating; "LAUNCH_FAILED": creation failed; "RUNNING": running; "STOPPED": shut down; "STARTING": starting; "STOPPING": shutting down; "REBOOTING": restarting; "SHUTDOWN": to be terminated; "TERMINATING": terminating; "UNKNOWN": unknown (for non-Tencent Cloud machines and offline client)</li>
<li>Status - uint64 - optional - processing Status: 0 - pending; 1 - ignored; 3 - fixed</li>
<li>HostName: string type optional host name</li>
<li>InstanceID : string type optional host id</li>
<li>IpAddress: string type optional The ip address of the host</li>
<li>Uuid : string type optional host uuid</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria:  
<li>HostVersion : uint64 data type Optional Version information : 0-Basic version 1-Pro edition 2-Flagship edition 3-Lite edition</li>
<li>InstanceState: string type, optional. Host status: "PENDING": creating; "LAUNCH_FAILED": creation failed; "RUNNING": running; "STOPPED": shut down; "STARTING": starting; "STOPPING": shutting down; "REBOOTING": restarting; "SHUTDOWN": to be terminated; "TERMINATING": terminating; "UNKNOWN": unknown (for non-Tencent Cloud machines and offline client)</li>
<li>Status - uint64 - optional - processing Status: 0 - pending; 1 - ignored; 3 - fixed</li>
<li>HostName: string type optional host name</li>
<li>InstanceID : string type optional host id</li>
<li>IpAddress: string type optional The ip address of the host</li>
<li>Uuid : string type optional host uuid</li>
     * @param Filters Filter criteria:  
<li>HostVersion : uint64 data type Optional Version information : 0-Basic version 1-Pro edition 2-Flagship edition 3-Lite edition</li>
<li>InstanceState: string type, optional. Host status: "PENDING": creating; "LAUNCH_FAILED": creation failed; "RUNNING": running; "STOPPED": shut down; "STARTING": starting; "STOPPING": shutting down; "REBOOTING": restarting; "SHUTDOWN": to be terminated; "TERMINATING": terminating; "UNKNOWN": unknown (for non-Tencent Cloud machines and offline client)</li>
<li>Status - uint64 - optional - processing Status: 0 - pending; 1 - ignored; 3 - fixed</li>
<li>HostName: string type optional host name</li>
<li>InstanceID : string type optional host id</li>
<li>IpAddress: string type optional The ip address of the host</li>
<li>Uuid : string type optional host uuid</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribePatchEffectHostListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePatchEffectHostListRequest(DescribePatchEffectHostListRequest source) {
        if (source.KbId != null) {
            this.KbId = new Long(source.KbId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

