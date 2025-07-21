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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScheduledActionsRequest extends AbstractModel {

    /**
    * Query by one or more scheduled task ids. you can obtain the scheduled task ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group). the maximum number of instances per request is 100. parameters ScheduledActionIds and Filters must not be specified simultaneously.
    */
    @SerializedName("ScheduledActionIds")
    @Expose
    private String [] ScheduledActionIds;

    /**
    * Filter criteria. obtain the scheduled task ID, scheduled task name, and scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group).
<li> scheduled-action-id - String - required: no - (filter) filter by scheduled task id.</li>.
<li> scheduled-action-name - String - required: no - (filter criteria) filters by scheduled task name.</li>.
<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id.</li>.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Query by one or more scheduled task ids. you can obtain the scheduled task ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group). the maximum number of instances per request is 100. parameters ScheduledActionIds and Filters must not be specified simultaneously. 
     * @return ScheduledActionIds Query by one or more scheduled task ids. you can obtain the scheduled task ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group). the maximum number of instances per request is 100. parameters ScheduledActionIds and Filters must not be specified simultaneously.
     */
    public String [] getScheduledActionIds() {
        return this.ScheduledActionIds;
    }

    /**
     * Set Query by one or more scheduled task ids. you can obtain the scheduled task ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group). the maximum number of instances per request is 100. parameters ScheduledActionIds and Filters must not be specified simultaneously.
     * @param ScheduledActionIds Query by one or more scheduled task ids. you can obtain the scheduled task ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group). the maximum number of instances per request is 100. parameters ScheduledActionIds and Filters must not be specified simultaneously.
     */
    public void setScheduledActionIds(String [] ScheduledActionIds) {
        this.ScheduledActionIds = ScheduledActionIds;
    }

    /**
     * Get Filter criteria. obtain the scheduled task ID, scheduled task name, and scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group).
<li> scheduled-action-id - String - required: no - (filter) filter by scheduled task id.</li>.
<li> scheduled-action-name - String - required: no - (filter criteria) filters by scheduled task name.</li>.
<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id.</li>. 
     * @return Filters Filter criteria. obtain the scheduled task ID, scheduled task name, and scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group).
<li> scheduled-action-id - String - required: no - (filter) filter by scheduled task id.</li>.
<li> scheduled-action-name - String - required: no - (filter criteria) filters by scheduled task name.</li>.
<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id.</li>.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. obtain the scheduled task ID, scheduled task name, and scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group).
<li> scheduled-action-id - String - required: no - (filter) filter by scheduled task id.</li>.
<li> scheduled-action-name - String - required: no - (filter criteria) filters by scheduled task name.</li>.
<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id.</li>.
     * @param Filters Filter criteria. obtain the scheduled task ID, scheduled task name, and scaling group ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group).
<li> scheduled-action-id - String - required: no - (filter) filter by scheduled task id.</li>.
<li> scheduled-action-name - String - required: no - (filter criteria) filters by scheduled task name.</li>.
<li> auto-scaling-group-id - String - required: no - (filter) filter by auto scaling group id.</li>.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Offset Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Offset Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1). 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://intl.cloud.tencent.com/document/api/213/15688?from_cn_redirect=1).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeScheduledActionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScheduledActionsRequest(DescribeScheduledActionsRequest source) {
        if (source.ScheduledActionIds != null) {
            this.ScheduledActionIds = new String[source.ScheduledActionIds.length];
            for (int i = 0; i < source.ScheduledActionIds.length; i++) {
                this.ScheduledActionIds[i] = new String(source.ScheduledActionIds[i]);
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
        this.setParamArraySimple(map, prefix + "ScheduledActionIds.", this.ScheduledActionIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

