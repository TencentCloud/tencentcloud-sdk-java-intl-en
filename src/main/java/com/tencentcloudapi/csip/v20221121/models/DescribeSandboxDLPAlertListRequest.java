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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSandboxDLPAlertListRequest extends AbstractModel {

    /**
    * <p>Offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of items per page. Default value: 10. Upper limit: 200.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Filter criteria<br>Supported filter items:<br>ID: Query a single item by alarm record ID<br>BelongAssetType: The asset type it belongs to. Available values: HOST / CONTAINER<br>RuleName: Search by hit rule name<br>RuleAction: Hit action. Available values: PASS (allowlist) / BLOCK (BLOCK and alarm) / MONITOR (alarm)<br>InstanceId: Precise filtering by Asset Instance ID (for viewing the alarm list of an asset on the Asset Details Page and other scenarios)<br>InstanceName: Fuzzy search by asset instance name. Multiple values have an "OR" relationship with each other<br>Status: Processing Status. Available values: PENDING (unprocessed) / HANDLED (processed) / IGNORE (ignored) / PASS (allowlisted) / BLOCK (blocked)</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>Group account member id.</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Offset. Default value: 0.</p> 
     * @return Offset <p>Offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset. Default value: 0.</p>
     * @param Offset <p>Offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of items per page. Default value: 10. Upper limit: 200.</p> 
     * @return Limit <p>Number of items per page. Default value: 10. Upper limit: 200.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of items per page. Default value: 10. Upper limit: 200.</p>
     * @param Limit <p>Number of items per page. Default value: 10. Upper limit: 200.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Filter criteria<br>Supported filter items:<br>ID: Query a single item by alarm record ID<br>BelongAssetType: The asset type it belongs to. Available values: HOST / CONTAINER<br>RuleName: Search by hit rule name<br>RuleAction: Hit action. Available values: PASS (allowlist) / BLOCK (BLOCK and alarm) / MONITOR (alarm)<br>InstanceId: Precise filtering by Asset Instance ID (for viewing the alarm list of an asset on the Asset Details Page and other scenarios)<br>InstanceName: Fuzzy search by asset instance name. Multiple values have an "OR" relationship with each other<br>Status: Processing Status. Available values: PENDING (unprocessed) / HANDLED (processed) / IGNORE (ignored) / PASS (allowlisted) / BLOCK (blocked)</p> 
     * @return Filters <p>Filter criteria<br>Supported filter items:<br>ID: Query a single item by alarm record ID<br>BelongAssetType: The asset type it belongs to. Available values: HOST / CONTAINER<br>RuleName: Search by hit rule name<br>RuleAction: Hit action. Available values: PASS (allowlist) / BLOCK (BLOCK and alarm) / MONITOR (alarm)<br>InstanceId: Precise filtering by Asset Instance ID (for viewing the alarm list of an asset on the Asset Details Page and other scenarios)<br>InstanceName: Fuzzy search by asset instance name. Multiple values have an "OR" relationship with each other<br>Status: Processing Status. Available values: PENDING (unprocessed) / HANDLED (processed) / IGNORE (ignored) / PASS (allowlisted) / BLOCK (blocked)</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter criteria<br>Supported filter items:<br>ID: Query a single item by alarm record ID<br>BelongAssetType: The asset type it belongs to. Available values: HOST / CONTAINER<br>RuleName: Search by hit rule name<br>RuleAction: Hit action. Available values: PASS (allowlist) / BLOCK (BLOCK and alarm) / MONITOR (alarm)<br>InstanceId: Precise filtering by Asset Instance ID (for viewing the alarm list of an asset on the Asset Details Page and other scenarios)<br>InstanceName: Fuzzy search by asset instance name. Multiple values have an "OR" relationship with each other<br>Status: Processing Status. Available values: PENDING (unprocessed) / HANDLED (processed) / IGNORE (ignored) / PASS (allowlisted) / BLOCK (blocked)</p>
     * @param Filters <p>Filter criteria<br>Supported filter items:<br>ID: Query a single item by alarm record ID<br>BelongAssetType: The asset type it belongs to. Available values: HOST / CONTAINER<br>RuleName: Search by hit rule name<br>RuleAction: Hit action. Available values: PASS (allowlist) / BLOCK (BLOCK and alarm) / MONITOR (alarm)<br>InstanceId: Precise filtering by Asset Instance ID (for viewing the alarm list of an asset on the Asset Details Page and other scenarios)<br>InstanceName: Fuzzy search by asset instance name. Multiple values have an "OR" relationship with each other<br>Status: Processing Status. Available values: PENDING (unprocessed) / HANDLED (processed) / IGNORE (ignored) / PASS (allowlisted) / BLOCK (blocked)</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Group account member id.</p> 
     * @return MemberId <p>Group account member id.</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id.</p>
     * @param MemberId <p>Group account member id.</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeSandboxDLPAlertListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSandboxDLPAlertListRequest(DescribeSandboxDLPAlertListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

