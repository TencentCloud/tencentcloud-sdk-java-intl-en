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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostsRequest extends AbstractModel{

    /**
    * Filters.
<li> `zone` - String - Optional - Filter results by availability zone.</li>
<li> `project-id` - Integer - Optional - Filter results by project ID. You can call `DescribeProject` or log in to the console to view the list of existing projects. You can also create a new project by calling `AddProject`.</li>
<li> `host-id` - String - Optional - Filter results by CDH ID. CDH IDs are in the format of `host-11112222`.</li>
<li> `host-name` - String - Optional - Filter results by CDH instance name.</li>
<li> `host-state` - String - Optional - Filter results by CDH instance state. (PENDING: creating | LAUNCH_FAILURE: creation failed | RUNNING: running | EXPIRED: expired)</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset; default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results returned; default value: 20; maximum: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Filters.
<li> `zone` - String - Optional - Filter results by availability zone.</li>
<li> `project-id` - Integer - Optional - Filter results by project ID. You can call `DescribeProject` or log in to the console to view the list of existing projects. You can also create a new project by calling `AddProject`.</li>
<li> `host-id` - String - Optional - Filter results by CDH ID. CDH IDs are in the format of `host-11112222`.</li>
<li> `host-name` - String - Optional - Filter results by CDH instance name.</li>
<li> `host-state` - String - Optional - Filter results by CDH instance state. (PENDING: creating | LAUNCH_FAILURE: creation failed | RUNNING: running | EXPIRED: expired)</li> 
     * @return Filters Filters.
<li> `zone` - String - Optional - Filter results by availability zone.</li>
<li> `project-id` - Integer - Optional - Filter results by project ID. You can call `DescribeProject` or log in to the console to view the list of existing projects. You can also create a new project by calling `AddProject`.</li>
<li> `host-id` - String - Optional - Filter results by CDH ID. CDH IDs are in the format of `host-11112222`.</li>
<li> `host-name` - String - Optional - Filter results by CDH instance name.</li>
<li> `host-state` - String - Optional - Filter results by CDH instance state. (PENDING: creating | LAUNCH_FAILURE: creation failed | RUNNING: running | EXPIRED: expired)</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters.
<li> `zone` - String - Optional - Filter results by availability zone.</li>
<li> `project-id` - Integer - Optional - Filter results by project ID. You can call `DescribeProject` or log in to the console to view the list of existing projects. You can also create a new project by calling `AddProject`.</li>
<li> `host-id` - String - Optional - Filter results by CDH ID. CDH IDs are in the format of `host-11112222`.</li>
<li> `host-name` - String - Optional - Filter results by CDH instance name.</li>
<li> `host-state` - String - Optional - Filter results by CDH instance state. (PENDING: creating | LAUNCH_FAILURE: creation failed | RUNNING: running | EXPIRED: expired)</li>
     * @param Filters Filters.
<li> `zone` - String - Optional - Filter results by availability zone.</li>
<li> `project-id` - Integer - Optional - Filter results by project ID. You can call `DescribeProject` or log in to the console to view the list of existing projects. You can also create a new project by calling `AddProject`.</li>
<li> `host-id` - String - Optional - Filter results by CDH ID. CDH IDs are in the format of `host-11112222`.</li>
<li> `host-name` - String - Optional - Filter results by CDH instance name.</li>
<li> `host-state` - String - Optional - Filter results by CDH instance state. (PENDING: creating | LAUNCH_FAILURE: creation failed | RUNNING: running | EXPIRED: expired)</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset; default value: 0. 
     * @return Offset Offset; default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset; default value: 0.
     * @param Offset Offset; default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results returned; default value: 20; maximum: 100. 
     * @return Limit Number of results returned; default value: 20; maximum: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results returned; default value: 20; maximum: 100.
     * @param Limit Number of results returned; default value: 20; maximum: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

