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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRestoreTaskRequest extends AbstractModel {

    /**
    * Source Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Rollback method. 0 - roll back by time point; 1 - roll back by backup set.
    */
    @SerializedName("RestoreType")
    @Expose
    private Long RestoreType;

    /**
    * Region where the target instance is located for rollback.
    */
    @SerializedName("TargetRegion")
    @Expose
    private String TargetRegion;

    /**
    * Type of the target instance for rollback. 0 - current instance; 1 - existing instance; 2 - new instance.
    */
    @SerializedName("TargetType")
    @Expose
    private Long TargetType;

    /**
    * Rollback status, 0: initialized; 1: running; 2: successful; 3: failed.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 20.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Page number in pagination mode. The default value is 0.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting field. restoreTime - rollback time; startTime-task start time; endTime-task end time. By default, the results are sorted in descending order by task start time.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting rule. desc - descending order; asc - ascending order. The default value is desc.
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * Asynchronous rollback task ID.
    */
    @SerializedName("FlowId")
    @Expose
    private Long FlowId;

    /**
     * Get Source Instance ID. 
     * @return InstanceId Source Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Source Instance ID.
     * @param InstanceId Source Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Rollback method. 0 - roll back by time point; 1 - roll back by backup set. 
     * @return RestoreType Rollback method. 0 - roll back by time point; 1 - roll back by backup set.
     */
    public Long getRestoreType() {
        return this.RestoreType;
    }

    /**
     * Set Rollback method. 0 - roll back by time point; 1 - roll back by backup set.
     * @param RestoreType Rollback method. 0 - roll back by time point; 1 - roll back by backup set.
     */
    public void setRestoreType(Long RestoreType) {
        this.RestoreType = RestoreType;
    }

    /**
     * Get Region where the target instance is located for rollback. 
     * @return TargetRegion Region where the target instance is located for rollback.
     */
    public String getTargetRegion() {
        return this.TargetRegion;
    }

    /**
     * Set Region where the target instance is located for rollback.
     * @param TargetRegion Region where the target instance is located for rollback.
     */
    public void setTargetRegion(String TargetRegion) {
        this.TargetRegion = TargetRegion;
    }

    /**
     * Get Type of the target instance for rollback. 0 - current instance; 1 - existing instance; 2 - new instance. 
     * @return TargetType Type of the target instance for rollback. 0 - current instance; 1 - existing instance; 2 - new instance.
     */
    public Long getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Type of the target instance for rollback. 0 - current instance; 1 - existing instance; 2 - new instance.
     * @param TargetType Type of the target instance for rollback. 0 - current instance; 1 - existing instance; 2 - new instance.
     */
    public void setTargetType(Long TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Rollback status, 0: initialized; 1: running; 2: successful; 3: failed. 
     * @return Status Rollback status, 0: initialized; 1: running; 2: successful; 3: failed.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Rollback status, 0: initialized; 1: running; 2: successful; 3: failed.
     * @param Status Rollback status, 0: initialized; 1: running; 2: successful; 3: failed.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 20. 
     * @return Offset The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 20.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 20.
     * @param Offset The number of returned entries per page in pagination mode. Value range: 1-100. The default value is 20.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Page number in pagination mode. The default value is 0. 
     * @return Limit Page number in pagination mode. The default value is 0.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page number in pagination mode. The default value is 0.
     * @param Limit Page number in pagination mode. The default value is 0.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting field. restoreTime - rollback time; startTime-task start time; endTime-task end time. By default, the results are sorted in descending order by task start time. 
     * @return OrderBy Sorting field. restoreTime - rollback time; startTime-task start time; endTime-task end time. By default, the results are sorted in descending order by task start time.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting field. restoreTime - rollback time; startTime-task start time; endTime-task end time. By default, the results are sorted in descending order by task start time.
     * @param OrderBy Sorting field. restoreTime - rollback time; startTime-task start time; endTime-task end time. By default, the results are sorted in descending order by task start time.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting rule. desc - descending order; asc - ascending order. The default value is desc. 
     * @return OrderByType Sorting rule. desc - descending order; asc - ascending order. The default value is desc.
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting rule. desc - descending order; asc - ascending order. The default value is desc.
     * @param OrderByType Sorting rule. desc - descending order; asc - ascending order. The default value is desc.
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get Asynchronous rollback task ID. 
     * @return FlowId Asynchronous rollback task ID.
     */
    public Long getFlowId() {
        return this.FlowId;
    }

    /**
     * Set Asynchronous rollback task ID.
     * @param FlowId Asynchronous rollback task ID.
     */
    public void setFlowId(Long FlowId) {
        this.FlowId = FlowId;
    }

    public DescribeRestoreTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRestoreTaskRequest(DescribeRestoreTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RestoreType != null) {
            this.RestoreType = new Long(source.RestoreType);
        }
        if (source.TargetRegion != null) {
            this.TargetRegion = new String(source.TargetRegion);
        }
        if (source.TargetType != null) {
            this.TargetType = new Long(source.TargetType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.FlowId != null) {
            this.FlowId = new Long(source.FlowId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RestoreType", this.RestoreType);
        this.setParamSimple(map, prefix + "TargetRegion", this.TargetRegion);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);

    }
}

