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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachinesRequest extends AbstractModel {

    /**
    * Machine group ID to query.

-Obtain the machine group ID by searching the machine group list (https://www.tencentcloud.com/document/api/614/56438?from_cn_redirect=1).
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * ip
-Filter by ip.
-Type: String
-Required: No

instance
-Filter by instance id.
-Type: String
-Required: No

version
- Filter by LogListener version.
-Type: String
-Required: No

status
- Filter by machine status.
-Type: String
-Optional: No.
-Available values: 0: offline, 1: normal

offlineTime
- Filter by machine offline time.
-Type: String
-Optional: No.
-Available values: 0: no offline time, 12: within 12 hours, 24: within a day, 48: within two days, 99: before two days

Each request can have up to 10 Filters. The upper limit of Filter.Values is 100.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Pagination offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit on the number of entries per page. A maximum of 100 entries are supported.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Machine group ID to query.

-Obtain the machine group ID by searching the machine group list (https://www.tencentcloud.com/document/api/614/56438?from_cn_redirect=1). 
     * @return GroupId Machine group ID to query.

-Obtain the machine group ID by searching the machine group list (https://www.tencentcloud.com/document/api/614/56438?from_cn_redirect=1).
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Machine group ID to query.

-Obtain the machine group ID by searching the machine group list (https://www.tencentcloud.com/document/api/614/56438?from_cn_redirect=1).
     * @param GroupId Machine group ID to query.

-Obtain the machine group ID by searching the machine group list (https://www.tencentcloud.com/document/api/614/56438?from_cn_redirect=1).
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get ip
-Filter by ip.
-Type: String
-Required: No

instance
-Filter by instance id.
-Type: String
-Required: No

version
- Filter by LogListener version.
-Type: String
-Required: No

status
- Filter by machine status.
-Type: String
-Optional: No.
-Available values: 0: offline, 1: normal

offlineTime
- Filter by machine offline time.
-Type: String
-Optional: No.
-Available values: 0: no offline time, 12: within 12 hours, 24: within a day, 48: within two days, 99: before two days

Each request can have up to 10 Filters. The upper limit of Filter.Values is 100. 
     * @return Filters ip
-Filter by ip.
-Type: String
-Required: No

instance
-Filter by instance id.
-Type: String
-Required: No

version
- Filter by LogListener version.
-Type: String
-Required: No

status
- Filter by machine status.
-Type: String
-Optional: No.
-Available values: 0: offline, 1: normal

offlineTime
- Filter by machine offline time.
-Type: String
-Optional: No.
-Available values: 0: no offline time, 12: within 12 hours, 24: within a day, 48: within two days, 99: before two days

Each request can have up to 10 Filters. The upper limit of Filter.Values is 100.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set ip
-Filter by ip.
-Type: String
-Required: No

instance
-Filter by instance id.
-Type: String
-Required: No

version
- Filter by LogListener version.
-Type: String
-Required: No

status
- Filter by machine status.
-Type: String
-Optional: No.
-Available values: 0: offline, 1: normal

offlineTime
- Filter by machine offline time.
-Type: String
-Optional: No.
-Available values: 0: no offline time, 12: within 12 hours, 24: within a day, 48: within two days, 99: before two days

Each request can have up to 10 Filters. The upper limit of Filter.Values is 100.
     * @param Filters ip
-Filter by ip.
-Type: String
-Required: No

instance
-Filter by instance id.
-Type: String
-Required: No

version
- Filter by LogListener version.
-Type: String
-Required: No

status
- Filter by machine status.
-Type: String
-Optional: No.
-Available values: 0: offline, 1: normal

offlineTime
- Filter by machine offline time.
-Type: String
-Optional: No.
-Available values: 0: no offline time, 12: within 12 hours, 24: within a day, 48: within two days, 99: before two days

Each request can have up to 10 Filters. The upper limit of Filter.Values is 100.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
     * Get Limit on the number of entries per page. A maximum of 100 entries are supported. 
     * @return Limit Limit on the number of entries per page. A maximum of 100 entries are supported.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on the number of entries per page. A maximum of 100 entries are supported.
     * @param Limit Limit on the number of entries per page. A maximum of 100 entries are supported.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeMachinesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachinesRequest(DescribeMachinesRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
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
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

