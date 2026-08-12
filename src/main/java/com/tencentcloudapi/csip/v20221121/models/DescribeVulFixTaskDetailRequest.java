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

public class DescribeVulFixTaskDetailRequest extends AbstractModel {

    /**
    * <p>Repair task ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Filter criteria<br>Supported Filter.Name:<br>InstanceId - Exact match, filter by host instance ID<br>VulId - Exact match, filter by vulnerability ID, filter out hosts under a certain vulnerability<br>KBId - Exact match, filter by KB Patch ID, filter out hosts under a certain KB patch<br>Status - Exact match, filter by execution status: 0-Initial status 1-Issued 11-Client confirmed 2-Repair completed 3-Client offline 4-Timeout 5-Failure 6-No support 9-Waiting for snapshot creation to complete 10-Snapshot creation failed<br>FixStatus - Exact match, filter by repair result: 0-Initial status 1-Repair successful 2-Fix failure<br>SnapshotStatus - Exact match, filter by snapshot status: -1-No need to create snapshot 0-Not started 1-In progress 2-Completed 3-Creation failure</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>Sorting field<br>Enumeration value:<br>StartTime: Sort by repair start time<br>EndTime: Sort by repair end time</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sorting method<br>Enumeration value:<br>asc: Ascending<br>desc: Descending<br>Default value: desc</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Repair task ID</p> 
     * @return TaskId <p>Repair task ID</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Repair task ID</p>
     * @param TaskId <p>Repair task ID</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p> 
     * @return Offset <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p>
     * @param Offset <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p> 
     * @return Limit <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p>
     * @param Limit <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Filter criteria<br>Supported Filter.Name:<br>InstanceId - Exact match, filter by host instance ID<br>VulId - Exact match, filter by vulnerability ID, filter out hosts under a certain vulnerability<br>KBId - Exact match, filter by KB Patch ID, filter out hosts under a certain KB patch<br>Status - Exact match, filter by execution status: 0-Initial status 1-Issued 11-Client confirmed 2-Repair completed 3-Client offline 4-Timeout 5-Failure 6-No support 9-Waiting for snapshot creation to complete 10-Snapshot creation failed<br>FixStatus - Exact match, filter by repair result: 0-Initial status 1-Repair successful 2-Fix failure<br>SnapshotStatus - Exact match, filter by snapshot status: -1-No need to create snapshot 0-Not started 1-In progress 2-Completed 3-Creation failure</p> 
     * @return Filters <p>Filter criteria<br>Supported Filter.Name:<br>InstanceId - Exact match, filter by host instance ID<br>VulId - Exact match, filter by vulnerability ID, filter out hosts under a certain vulnerability<br>KBId - Exact match, filter by KB Patch ID, filter out hosts under a certain KB patch<br>Status - Exact match, filter by execution status: 0-Initial status 1-Issued 11-Client confirmed 2-Repair completed 3-Client offline 4-Timeout 5-Failure 6-No support 9-Waiting for snapshot creation to complete 10-Snapshot creation failed<br>FixStatus - Exact match, filter by repair result: 0-Initial status 1-Repair successful 2-Fix failure<br>SnapshotStatus - Exact match, filter by snapshot status: -1-No need to create snapshot 0-Not started 1-In progress 2-Completed 3-Creation failure</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter criteria<br>Supported Filter.Name:<br>InstanceId - Exact match, filter by host instance ID<br>VulId - Exact match, filter by vulnerability ID, filter out hosts under a certain vulnerability<br>KBId - Exact match, filter by KB Patch ID, filter out hosts under a certain KB patch<br>Status - Exact match, filter by execution status: 0-Initial status 1-Issued 11-Client confirmed 2-Repair completed 3-Client offline 4-Timeout 5-Failure 6-No support 9-Waiting for snapshot creation to complete 10-Snapshot creation failed<br>FixStatus - Exact match, filter by repair result: 0-Initial status 1-Repair successful 2-Fix failure<br>SnapshotStatus - Exact match, filter by snapshot status: -1-No need to create snapshot 0-Not started 1-In progress 2-Completed 3-Creation failure</p>
     * @param Filters <p>Filter criteria<br>Supported Filter.Name:<br>InstanceId - Exact match, filter by host instance ID<br>VulId - Exact match, filter by vulnerability ID, filter out hosts under a certain vulnerability<br>KBId - Exact match, filter by KB Patch ID, filter out hosts under a certain KB patch<br>Status - Exact match, filter by execution status: 0-Initial status 1-Issued 11-Client confirmed 2-Repair completed 3-Client offline 4-Timeout 5-Failure 6-No support 9-Waiting for snapshot creation to complete 10-Snapshot creation failed<br>FixStatus - Exact match, filter by repair result: 0-Initial status 1-Repair successful 2-Fix failure<br>SnapshotStatus - Exact match, filter by snapshot status: -1-No need to create snapshot 0-Not started 1-In progress 2-Completed 3-Creation failure</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Sorting field<br>Enumeration value:<br>StartTime: Sort by repair start time<br>EndTime: Sort by repair end time</p> 
     * @return Order <p>Sorting field<br>Enumeration value:<br>StartTime: Sort by repair start time<br>EndTime: Sort by repair end time</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting field<br>Enumeration value:<br>StartTime: Sort by repair start time<br>EndTime: Sort by repair end time</p>
     * @param Order <p>Sorting field<br>Enumeration value:<br>StartTime: Sort by repair start time<br>EndTime: Sort by repair end time</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sorting method<br>Enumeration value:<br>asc: Ascending<br>desc: Descending<br>Default value: desc</p> 
     * @return By <p>Sorting method<br>Enumeration value:<br>asc: Ascending<br>desc: Descending<br>Default value: desc</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Sorting method<br>Enumeration value:<br>asc: Ascending<br>desc: Descending<br>Default value: desc</p>
     * @param By <p>Sorting method<br>Enumeration value:<br>asc: Ascending<br>desc: Descending<br>Default value: desc</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeVulFixTaskDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulFixTaskDetailRequest(DescribeVulFixTaskDetailRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
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
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

