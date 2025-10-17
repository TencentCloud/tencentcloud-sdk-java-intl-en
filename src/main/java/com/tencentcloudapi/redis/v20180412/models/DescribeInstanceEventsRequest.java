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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceEventsRequest extends AbstractModel {

    /**
    * Start date for querying the event execution plan, with a maximum query span of 30 days.
    */
    @SerializedName("ExecutionStartDate")
    @Expose
    private String ExecutionStartDate;

    /**
    * End date for querying the event execution plan, with a maximum query span of 30 days.
    */
    @SerializedName("ExecutionEndDate")
    @Expose
    private String ExecutionEndDate;

    /**
    * Specifies the instance ID. Example: crs-xjhsdj****. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Outputs the number of events displayed per page.
- Default value: 10.
- Value range: [1, 100].
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Configures the output page number for querying events. You can query events on a certain page by specifying PageNo (page number) and PageSize (number of output results per page).
- Default value: 1.
- Value range: positive integers greater than 0.
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * Current status of the event.- Waiting: The event is waiting for execution on the execution date or during the operations period.- Running: The event is being executed during the operations period.- Finished: Execution of the event is completed.- Canceled: Execution of the event is canceled.
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * Event type. Currently, the type can only be related to instance migration, resource movement, and IDC deletion. This parameter can be set only to **InstanceMigration**.
    */
    @SerializedName("EventTypes")
    @Expose
    private String [] EventTypes;

    /**
    * Configures the level of the queried event. Events are divided into Critical, High, Medium, and Low events according to the severity and urgency.- Critical- High- Medium- Low
    */
    @SerializedName("Grades")
    @Expose
    private String [] Grades;

    /**
     * Get Start date for querying the event execution plan, with a maximum query span of 30 days. 
     * @return ExecutionStartDate Start date for querying the event execution plan, with a maximum query span of 30 days.
     */
    public String getExecutionStartDate() {
        return this.ExecutionStartDate;
    }

    /**
     * Set Start date for querying the event execution plan, with a maximum query span of 30 days.
     * @param ExecutionStartDate Start date for querying the event execution plan, with a maximum query span of 30 days.
     */
    public void setExecutionStartDate(String ExecutionStartDate) {
        this.ExecutionStartDate = ExecutionStartDate;
    }

    /**
     * Get End date for querying the event execution plan, with a maximum query span of 30 days. 
     * @return ExecutionEndDate End date for querying the event execution plan, with a maximum query span of 30 days.
     */
    public String getExecutionEndDate() {
        return this.ExecutionEndDate;
    }

    /**
     * Set End date for querying the event execution plan, with a maximum query span of 30 days.
     * @param ExecutionEndDate End date for querying the event execution plan, with a maximum query span of 30 days.
     */
    public void setExecutionEndDate(String ExecutionEndDate) {
        this.ExecutionEndDate = ExecutionEndDate;
    }

    /**
     * Get Specifies the instance ID. Example: crs-xjhsdj****. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list. 
     * @return InstanceId Specifies the instance ID. Example: crs-xjhsdj****. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Specifies the instance ID. Example: crs-xjhsdj****. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
     * @param InstanceId Specifies the instance ID. Example: crs-xjhsdj****. Log in to the [TencentDB for Redis console](https://console.cloud.tencent.com/redis) and copy the instance ID in the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Outputs the number of events displayed per page.
- Default value: 10.
- Value range: [1, 100]. 
     * @return PageSize Outputs the number of events displayed per page.
- Default value: 10.
- Value range: [1, 100].
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Outputs the number of events displayed per page.
- Default value: 10.
- Value range: [1, 100].
     * @param PageSize Outputs the number of events displayed per page.
- Default value: 10.
- Value range: [1, 100].
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Configures the output page number for querying events. You can query events on a certain page by specifying PageNo (page number) and PageSize (number of output results per page).
- Default value: 1.
- Value range: positive integers greater than 0. 
     * @return PageNo Configures the output page number for querying events. You can query events on a certain page by specifying PageNo (page number) and PageSize (number of output results per page).
- Default value: 1.
- Value range: positive integers greater than 0.
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set Configures the output page number for querying events. You can query events on a certain page by specifying PageNo (page number) and PageSize (number of output results per page).
- Default value: 1.
- Value range: positive integers greater than 0.
     * @param PageNo Configures the output page number for querying events. You can query events on a certain page by specifying PageNo (page number) and PageSize (number of output results per page).
- Default value: 1.
- Value range: positive integers greater than 0.
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get Current status of the event.- Waiting: The event is waiting for execution on the execution date or during the operations period.- Running: The event is being executed during the operations period.- Finished: Execution of the event is completed.- Canceled: Execution of the event is canceled. 
     * @return Status Current status of the event.- Waiting: The event is waiting for execution on the execution date or during the operations period.- Running: The event is being executed during the operations period.- Finished: Execution of the event is completed.- Canceled: Execution of the event is canceled.
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set Current status of the event.- Waiting: The event is waiting for execution on the execution date or during the operations period.- Running: The event is being executed during the operations period.- Finished: Execution of the event is completed.- Canceled: Execution of the event is canceled.
     * @param Status Current status of the event.- Waiting: The event is waiting for execution on the execution date or during the operations period.- Running: The event is being executed during the operations period.- Finished: Execution of the event is completed.- Canceled: Execution of the event is canceled.
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get Event type. Currently, the type can only be related to instance migration, resource movement, and IDC deletion. This parameter can be set only to **InstanceMigration**. 
     * @return EventTypes Event type. Currently, the type can only be related to instance migration, resource movement, and IDC deletion. This parameter can be set only to **InstanceMigration**.
     */
    public String [] getEventTypes() {
        return this.EventTypes;
    }

    /**
     * Set Event type. Currently, the type can only be related to instance migration, resource movement, and IDC deletion. This parameter can be set only to **InstanceMigration**.
     * @param EventTypes Event type. Currently, the type can only be related to instance migration, resource movement, and IDC deletion. This parameter can be set only to **InstanceMigration**.
     */
    public void setEventTypes(String [] EventTypes) {
        this.EventTypes = EventTypes;
    }

    /**
     * Get Configures the level of the queried event. Events are divided into Critical, High, Medium, and Low events according to the severity and urgency.- Critical- High- Medium- Low 
     * @return Grades Configures the level of the queried event. Events are divided into Critical, High, Medium, and Low events according to the severity and urgency.- Critical- High- Medium- Low
     */
    public String [] getGrades() {
        return this.Grades;
    }

    /**
     * Set Configures the level of the queried event. Events are divided into Critical, High, Medium, and Low events according to the severity and urgency.- Critical- High- Medium- Low
     * @param Grades Configures the level of the queried event. Events are divided into Critical, High, Medium, and Low events according to the severity and urgency.- Critical- High- Medium- Low
     */
    public void setGrades(String [] Grades) {
        this.Grades = Grades;
    }

    public DescribeInstanceEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceEventsRequest(DescribeInstanceEventsRequest source) {
        if (source.ExecutionStartDate != null) {
            this.ExecutionStartDate = new String(source.ExecutionStartDate);
        }
        if (source.ExecutionEndDate != null) {
            this.ExecutionEndDate = new String(source.ExecutionEndDate);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.EventTypes != null) {
            this.EventTypes = new String[source.EventTypes.length];
            for (int i = 0; i < source.EventTypes.length; i++) {
                this.EventTypes[i] = new String(source.EventTypes[i]);
            }
        }
        if (source.Grades != null) {
            this.Grades = new String[source.Grades.length];
            for (int i = 0; i < source.Grades.length; i++) {
                this.Grades[i] = new String(source.Grades[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionStartDate", this.ExecutionStartDate);
        this.setParamSimple(map, prefix + "ExecutionEndDate", this.ExecutionEndDate);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "EventTypes.", this.EventTypes);
        this.setParamArraySimple(map, prefix + "Grades.", this.Grades);

    }
}

