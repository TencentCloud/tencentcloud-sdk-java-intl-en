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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotPoliciesRequest extends AbstractModel {

    /**
    * Snapshot policy IDs
    */
    @SerializedName("SnapshotPolicyIds")
    @Expose
    private String [] SnapshotPolicyIds;

    /**
    * Filter conditions. `SnapshotPolicyIds` and `Filters` cannot be both specified.
<li>`snapshot-policy-id` - String - Snapshot policy ID</li>
<li>`snapshot-policy-name` - String - Snapshot policy name</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default value: `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 200.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Snapshot policy IDs 
     * @return SnapshotPolicyIds Snapshot policy IDs
     */
    public String [] getSnapshotPolicyIds() {
        return this.SnapshotPolicyIds;
    }

    /**
     * Set Snapshot policy IDs
     * @param SnapshotPolicyIds Snapshot policy IDs
     */
    public void setSnapshotPolicyIds(String [] SnapshotPolicyIds) {
        this.SnapshotPolicyIds = SnapshotPolicyIds;
    }

    /**
     * Get Filter conditions. `SnapshotPolicyIds` and `Filters` cannot be both specified.
<li>`snapshot-policy-id` - String - Snapshot policy ID</li>
<li>`snapshot-policy-name` - String - Snapshot policy name</li> 
     * @return Filters Filter conditions. `SnapshotPolicyIds` and `Filters` cannot be both specified.
<li>`snapshot-policy-id` - String - Snapshot policy ID</li>
<li>`snapshot-policy-name` - String - Snapshot policy name</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions. `SnapshotPolicyIds` and `Filters` cannot be both specified.
<li>`snapshot-policy-id` - String - Snapshot policy ID</li>
<li>`snapshot-policy-name` - String - Snapshot policy name</li>
     * @param Filters Filter conditions. `SnapshotPolicyIds` and `Filters` cannot be both specified.
<li>`snapshot-policy-id` - String - Snapshot policy ID</li>
<li>`snapshot-policy-name` - String - Snapshot policy name</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
     * Get Number of returned results. Default value: 20. Maximum value: 200. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 200.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 200.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 200.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSnapshotPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotPoliciesRequest(DescribeSnapshotPoliciesRequest source) {
        if (source.SnapshotPolicyIds != null) {
            this.SnapshotPolicyIds = new String[source.SnapshotPolicyIds.length];
            for (int i = 0; i < source.SnapshotPolicyIds.length; i++) {
                this.SnapshotPolicyIds[i] = new String(source.SnapshotPolicyIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
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
        this.setParamArraySimple(map, prefix + "SnapshotPolicyIds.", this.SnapshotPolicyIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

