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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskAlarmRegulationsRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Current Page
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of records per page
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Filter criteria (name includes RegularStatus, AlarmLevel, AlarmIndicator, RegularName)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sorting criteria (RegularId)
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
    * Task ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task Type (201 for real-time task, 202 for offline task)
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Current Page 
     * @return PageNumber Current Page
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Current Page
     * @param PageNumber Current Page
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of records per page 
     * @return PageSize Number of records per page
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of records per page
     * @param PageSize Number of records per page
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Filter criteria (name includes RegularStatus, AlarmLevel, AlarmIndicator, RegularName) 
     * @return Filters Filter criteria (name includes RegularStatus, AlarmLevel, AlarmIndicator, RegularName)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria (name includes RegularStatus, AlarmLevel, AlarmIndicator, RegularName)
     * @param Filters Filter criteria (name includes RegularStatus, AlarmLevel, AlarmIndicator, RegularName)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting criteria (RegularId) 
     * @return OrderFields Sorting criteria (RegularId)
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set Sorting criteria (RegularId)
     * @param OrderFields Sorting criteria (RegularId)
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get Task ID 
     * @return TaskId Task ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
     * @param TaskId Task ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task Type (201 for real-time task, 202 for offline task) 
     * @return TaskType Task Type (201 for real-time task, 202 for offline task)
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task Type (201 for real-time task, 202 for offline task)
     * @param TaskType Task Type (201 for real-time task, 202 for offline task)
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    public DescribeTaskAlarmRegulationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskAlarmRegulationsRequest(DescribeTaskAlarmRegulationsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

