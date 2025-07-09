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

public class ModifyEventAttackStatusRequest extends AbstractModel {

    /**
    * An array of event IDs that need to be modified, and batch operation is supported.
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * Whether to update all, i.e. whether to operate on all events; this parameter is invalid when IDs are not left blank.
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * 0: Pending 1: Processed 2: Allowlisted 3: Ignored 4: Deleted 
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Filter criteria
<li>Type: String attack status: 0: attempted attack; 1: attack succeeded: required: no</li>
<li>Status: String event processing status: 0: pending 1: processed; 2: allowlisted; 3: ignored; 4: deleted: required: no</li>
<li>SrcIP - String source IP - required: no</li>
<li>DstPort - String attack target port - required: no</li>
<li>MachineName - String host name - required: no</li>
<li>InstanceID - String host instance ID - required: no</li>
<li>Quuids - String host CVM UUID - required: no</li>

    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Excluded IDs
    */
    @SerializedName("ExcludeId")
    @Expose
    private Long [] ExcludeId;

    /**
     * Get An array of event IDs that need to be modified, and batch operation is supported. 
     * @return Ids An array of event IDs that need to be modified, and batch operation is supported.
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set An array of event IDs that need to be modified, and batch operation is supported.
     * @param Ids An array of event IDs that need to be modified, and batch operation is supported.
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get Whether to update all, i.e. whether to operate on all events; this parameter is invalid when IDs are not left blank. 
     * @return All Whether to update all, i.e. whether to operate on all events; this parameter is invalid when IDs are not left blank.
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set Whether to update all, i.e. whether to operate on all events; this parameter is invalid when IDs are not left blank.
     * @param All Whether to update all, i.e. whether to operate on all events; this parameter is invalid when IDs are not left blank.
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get 0: Pending 1: Processed 2: Allowlisted 3: Ignored 4: Deleted  
     * @return Status 0: Pending 1: Processed 2: Allowlisted 3: Ignored 4: Deleted 
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0: Pending 1: Processed 2: Allowlisted 3: Ignored 4: Deleted 
     * @param Status 0: Pending 1: Processed 2: Allowlisted 3: Ignored 4: Deleted 
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Filter criteria
<li>Type: String attack status: 0: attempted attack; 1: attack succeeded: required: no</li>
<li>Status: String event processing status: 0: pending 1: processed; 2: allowlisted; 3: ignored; 4: deleted: required: no</li>
<li>SrcIP - String source IP - required: no</li>
<li>DstPort - String attack target port - required: no</li>
<li>MachineName - String host name - required: no</li>
<li>InstanceID - String host instance ID - required: no</li>
<li>Quuids - String host CVM UUID - required: no</li>
 
     * @return Filters Filter criteria
<li>Type: String attack status: 0: attempted attack; 1: attack succeeded: required: no</li>
<li>Status: String event processing status: 0: pending 1: processed; 2: allowlisted; 3: ignored; 4: deleted: required: no</li>
<li>SrcIP - String source IP - required: no</li>
<li>DstPort - String attack target port - required: no</li>
<li>MachineName - String host name - required: no</li>
<li>InstanceID - String host instance ID - required: no</li>
<li>Quuids - String host CVM UUID - required: no</li>

     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>Type: String attack status: 0: attempted attack; 1: attack succeeded: required: no</li>
<li>Status: String event processing status: 0: pending 1: processed; 2: allowlisted; 3: ignored; 4: deleted: required: no</li>
<li>SrcIP - String source IP - required: no</li>
<li>DstPort - String attack target port - required: no</li>
<li>MachineName - String host name - required: no</li>
<li>InstanceID - String host instance ID - required: no</li>
<li>Quuids - String host CVM UUID - required: no</li>

     * @param Filters Filter criteria
<li>Type: String attack status: 0: attempted attack; 1: attack succeeded: required: no</li>
<li>Status: String event processing status: 0: pending 1: processed; 2: allowlisted; 3: ignored; 4: deleted: required: no</li>
<li>SrcIP - String source IP - required: no</li>
<li>DstPort - String attack target port - required: no</li>
<li>MachineName - String host name - required: no</li>
<li>InstanceID - String host instance ID - required: no</li>
<li>Quuids - String host CVM UUID - required: no</li>

     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Excluded IDs 
     * @return ExcludeId Excluded IDs
     */
    public Long [] getExcludeId() {
        return this.ExcludeId;
    }

    /**
     * Set Excluded IDs
     * @param ExcludeId Excluded IDs
     */
    public void setExcludeId(Long [] ExcludeId) {
        this.ExcludeId = ExcludeId;
    }

    public ModifyEventAttackStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEventAttackStatusRequest(ModifyEventAttackStatusRequest source) {
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.ExcludeId != null) {
            this.ExcludeId = new Long[source.ExcludeId.length];
            for (int i = 0; i < source.ExcludeId.length; i++) {
                this.ExcludeId[i] = new Long(source.ExcludeId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ExcludeId.", this.ExcludeId);

    }
}

