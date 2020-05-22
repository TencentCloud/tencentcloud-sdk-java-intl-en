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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBasicAlarmListRequest extends AbstractModel{

    /**
    * API module name. The value for the current API is monitor.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Start time, which is the timestamp one day ago by default.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time, which is the current timestamp by default.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Number of parameters that can be returned on each page. Value range: 1 - 100. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Parameter offset on each page. The value starts from 0 and the default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting by occurrence time. Valid values: asc and desc.
    */
    @SerializedName("OccurTimeOrder")
    @Expose
    private String OccurTimeOrder;

    /**
    * Filter by project ID.
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * Filter by policy type.
    */
    @SerializedName("ViewNames")
    @Expose
    private String [] ViewNames;

    /**
    * Filter by alarm status.
    */
    @SerializedName("AlarmStatus")
    @Expose
    private Long [] AlarmStatus;

    /**
    * Filter by alarm object.
    */
    @SerializedName("ObjLike")
    @Expose
    private String ObjLike;

    /**
    * Filter by instance group ID.
    */
    @SerializedName("InstanceGroupIds")
    @Expose
    private Long [] InstanceGroupIds;

    /**
    * Filtering by metric names
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
     * Get API module name. The value for the current API is monitor. 
     * @return Module API module name. The value for the current API is monitor.
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set API module name. The value for the current API is monitor.
     * @param Module API module name. The value for the current API is monitor.
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Start time, which is the timestamp one day ago by default. 
     * @return StartTime Start time, which is the timestamp one day ago by default.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, which is the timestamp one day ago by default.
     * @param StartTime Start time, which is the timestamp one day ago by default.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, which is the current timestamp by default. 
     * @return EndTime End time, which is the current timestamp by default.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, which is the current timestamp by default.
     * @param EndTime End time, which is the current timestamp by default.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Number of parameters that can be returned on each page. Value range: 1 - 100. Default value: 20. 
     * @return Limit Number of parameters that can be returned on each page. Value range: 1 - 100. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of parameters that can be returned on each page. Value range: 1 - 100. Default value: 20.
     * @param Limit Number of parameters that can be returned on each page. Value range: 1 - 100. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Parameter offset on each page. The value starts from 0 and the default value is 0. 
     * @return Offset Parameter offset on each page. The value starts from 0 and the default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Parameter offset on each page. The value starts from 0 and the default value is 0.
     * @param Offset Parameter offset on each page. The value starts from 0 and the default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting by occurrence time. Valid values: asc and desc. 
     * @return OccurTimeOrder Sorting by occurrence time. Valid values: asc and desc.
     */
    public String getOccurTimeOrder() {
        return this.OccurTimeOrder;
    }

    /**
     * Set Sorting by occurrence time. Valid values: asc and desc.
     * @param OccurTimeOrder Sorting by occurrence time. Valid values: asc and desc.
     */
    public void setOccurTimeOrder(String OccurTimeOrder) {
        this.OccurTimeOrder = OccurTimeOrder;
    }

    /**
     * Get Filter by project ID. 
     * @return ProjectIds Filter by project ID.
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Filter by project ID.
     * @param ProjectIds Filter by project ID.
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Filter by policy type. 
     * @return ViewNames Filter by policy type.
     */
    public String [] getViewNames() {
        return this.ViewNames;
    }

    /**
     * Set Filter by policy type.
     * @param ViewNames Filter by policy type.
     */
    public void setViewNames(String [] ViewNames) {
        this.ViewNames = ViewNames;
    }

    /**
     * Get Filter by alarm status. 
     * @return AlarmStatus Filter by alarm status.
     */
    public Long [] getAlarmStatus() {
        return this.AlarmStatus;
    }

    /**
     * Set Filter by alarm status.
     * @param AlarmStatus Filter by alarm status.
     */
    public void setAlarmStatus(Long [] AlarmStatus) {
        this.AlarmStatus = AlarmStatus;
    }

    /**
     * Get Filter by alarm object. 
     * @return ObjLike Filter by alarm object.
     */
    public String getObjLike() {
        return this.ObjLike;
    }

    /**
     * Set Filter by alarm object.
     * @param ObjLike Filter by alarm object.
     */
    public void setObjLike(String ObjLike) {
        this.ObjLike = ObjLike;
    }

    /**
     * Get Filter by instance group ID. 
     * @return InstanceGroupIds Filter by instance group ID.
     */
    public Long [] getInstanceGroupIds() {
        return this.InstanceGroupIds;
    }

    /**
     * Set Filter by instance group ID.
     * @param InstanceGroupIds Filter by instance group ID.
     */
    public void setInstanceGroupIds(Long [] InstanceGroupIds) {
        this.InstanceGroupIds = InstanceGroupIds;
    }

    /**
     * Get Filtering by metric names 
     * @return MetricNames Filtering by metric names
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Filtering by metric names
     * @param MetricNames Filtering by metric names
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OccurTimeOrder", this.OccurTimeOrder);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "ViewNames.", this.ViewNames);
        this.setParamArraySimple(map, prefix + "AlarmStatus.", this.AlarmStatus);
        this.setParamSimple(map, prefix + "ObjLike", this.ObjLike);
        this.setParamArraySimple(map, prefix + "InstanceGroupIds.", this.InstanceGroupIds);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);

    }
}

