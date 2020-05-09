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

public class DescribeBasicAlarmListAlarms extends AbstractModel{

    /**
    * Alarm ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Project ID.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Project name.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Alarm status ID.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Alarm status.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AlarmStatus")
    @Expose
    private String AlarmStatus;

    /**
    * Policy group ID.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Policy group name.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Occurrence time.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("FirstOccurTime")
    @Expose
    private String FirstOccurTime;

    /**
    * Duration in seconds.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * End time.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("LastOccurTime")
    @Expose
    private String LastOccurTime;

    /**
    * Alarm content.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Alarm object.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ObjName")
    @Expose
    private String ObjName;

    /**
    * Alarm object ID.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ObjId")
    @Expose
    private String ObjId;

    /**
    * Policy type.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * VPC, which is unique to CVM.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Vpc")
    @Expose
    private String Vpc;

    /**
    * Metric ID.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("MetricId")
    @Expose
    private Long MetricId;

    /**
    * Metric name.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Alarm type. The value 0 indicates metric alarms. The value 2 indicates product event alarms. The value 3 indicates platform event alarms.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AlarmType")
    @Expose
    private Long AlarmType;

    /**
    * Region.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Dimensions of an alarm object.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * Notification method.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("NotifyWay")
    @Expose
    private String [] NotifyWay;

    /**
    * Instance group information.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("InstanceGroup")
    @Expose
    private InstanceGroup [] InstanceGroup;

    /**
     * Get Alarm ID. 
     * @return Id Alarm ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Alarm ID.
     * @param Id Alarm ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Project ID.
Note: This field may return null, indicating that no valid value was found. 
     * @return ProjectId Project ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
Note: This field may return null, indicating that no valid value was found.
     * @param ProjectId Project ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project name.
Note: This field may return null, indicating that no valid value was found. 
     * @return ProjectName Project name.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name.
Note: This field may return null, indicating that no valid value was found.
     * @param ProjectName Project name.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Alarm status ID.
Note: This field may return null, indicating that no valid value was found. 
     * @return Status Alarm status ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Alarm status ID.
Note: This field may return null, indicating that no valid value was found.
     * @param Status Alarm status ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Alarm status.
Note: This field may return null, indicating that no valid value was found. 
     * @return AlarmStatus Alarm status.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getAlarmStatus() {
        return this.AlarmStatus;
    }

    /**
     * Set Alarm status.
Note: This field may return null, indicating that no valid value was found.
     * @param AlarmStatus Alarm status.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setAlarmStatus(String AlarmStatus) {
        this.AlarmStatus = AlarmStatus;
    }

    /**
     * Get Policy group ID.
Note: This field may return null, indicating that no valid value was found. 
     * @return GroupId Policy group ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Policy group ID.
Note: This field may return null, indicating that no valid value was found.
     * @param GroupId Policy group ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Policy group name.
Note: This field may return null, indicating that no valid value was found. 
     * @return GroupName Policy group name.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Policy group name.
Note: This field may return null, indicating that no valid value was found.
     * @param GroupName Policy group name.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Occurrence time.
Note: This field may return null, indicating that no valid value was found. 
     * @return FirstOccurTime Occurrence time.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getFirstOccurTime() {
        return this.FirstOccurTime;
    }

    /**
     * Set Occurrence time.
Note: This field may return null, indicating that no valid value was found.
     * @param FirstOccurTime Occurrence time.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setFirstOccurTime(String FirstOccurTime) {
        this.FirstOccurTime = FirstOccurTime;
    }

    /**
     * Get Duration in seconds.
Note: This field may return null, indicating that no valid value was found. 
     * @return Duration Duration in seconds.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Duration in seconds.
Note: This field may return null, indicating that no valid value was found.
     * @param Duration Duration in seconds.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get End time.
Note: This field may return null, indicating that no valid value was found. 
     * @return LastOccurTime End time.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getLastOccurTime() {
        return this.LastOccurTime;
    }

    /**
     * Set End time.
Note: This field may return null, indicating that no valid value was found.
     * @param LastOccurTime End time.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setLastOccurTime(String LastOccurTime) {
        this.LastOccurTime = LastOccurTime;
    }

    /**
     * Get Alarm content.
Note: This field may return null, indicating that no valid value was found. 
     * @return Content Alarm content.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Alarm content.
Note: This field may return null, indicating that no valid value was found.
     * @param Content Alarm content.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Alarm object.
Note: This field may return null, indicating that no valid value was found. 
     * @return ObjName Alarm object.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getObjName() {
        return this.ObjName;
    }

    /**
     * Set Alarm object.
Note: This field may return null, indicating that no valid value was found.
     * @param ObjName Alarm object.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setObjName(String ObjName) {
        this.ObjName = ObjName;
    }

    /**
     * Get Alarm object ID.
Note: This field may return null, indicating that no valid value was found. 
     * @return ObjId Alarm object ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getObjId() {
        return this.ObjId;
    }

    /**
     * Set Alarm object ID.
Note: This field may return null, indicating that no valid value was found.
     * @param ObjId Alarm object ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setObjId(String ObjId) {
        this.ObjId = ObjId;
    }

    /**
     * Get Policy type.
Note: This field may return null, indicating that no valid value was found. 
     * @return ViewName Policy type.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set Policy type.
Note: This field may return null, indicating that no valid value was found.
     * @param ViewName Policy type.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get VPC, which is unique to CVM.
Note: This field may return null, indicating that no valid value was found. 
     * @return Vpc VPC, which is unique to CVM.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getVpc() {
        return this.Vpc;
    }

    /**
     * Set VPC, which is unique to CVM.
Note: This field may return null, indicating that no valid value was found.
     * @param Vpc VPC, which is unique to CVM.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setVpc(String Vpc) {
        this.Vpc = Vpc;
    }

    /**
     * Get Metric ID.
Note: This field may return null, indicating that no valid value was found. 
     * @return MetricId Metric ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getMetricId() {
        return this.MetricId;
    }

    /**
     * Set Metric ID.
Note: This field may return null, indicating that no valid value was found.
     * @param MetricId Metric ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setMetricId(Long MetricId) {
        this.MetricId = MetricId;
    }

    /**
     * Get Metric name.
Note: This field may return null, indicating that no valid value was found. 
     * @return MetricName Metric name.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name.
Note: This field may return null, indicating that no valid value was found.
     * @param MetricName Metric name.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Alarm type. The value 0 indicates metric alarms. The value 2 indicates product event alarms. The value 3 indicates platform event alarms.
Note: This field may return null, indicating that no valid value was found. 
     * @return AlarmType Alarm type. The value 0 indicates metric alarms. The value 2 indicates product event alarms. The value 3 indicates platform event alarms.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set Alarm type. The value 0 indicates metric alarms. The value 2 indicates product event alarms. The value 3 indicates platform event alarms.
Note: This field may return null, indicating that no valid value was found.
     * @param AlarmType Alarm type. The value 0 indicates metric alarms. The value 2 indicates product event alarms. The value 3 indicates platform event alarms.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setAlarmType(Long AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get Region.
Note: This field may return null, indicating that no valid value was found. 
     * @return Region Region.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
Note: This field may return null, indicating that no valid value was found.
     * @param Region Region.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Dimensions of an alarm object.
Note: This field may return null, indicating that no valid value was found. 
     * @return Dimensions Dimensions of an alarm object.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Dimensions of an alarm object.
Note: This field may return null, indicating that no valid value was found.
     * @param Dimensions Dimensions of an alarm object.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get Notification method.
Note: This field may return null, indicating that no valid value was found. 
     * @return NotifyWay Notification method.
Note: This field may return null, indicating that no valid value was found.
     */
    public String [] getNotifyWay() {
        return this.NotifyWay;
    }

    /**
     * Set Notification method.
Note: This field may return null, indicating that no valid value was found.
     * @param NotifyWay Notification method.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setNotifyWay(String [] NotifyWay) {
        this.NotifyWay = NotifyWay;
    }

    /**
     * Get Instance group information.
Note: This field may return null, indicating that no valid value was found. 
     * @return InstanceGroup Instance group information.
Note: This field may return null, indicating that no valid value was found.
     */
    public InstanceGroup [] getInstanceGroup() {
        return this.InstanceGroup;
    }

    /**
     * Set Instance group information.
Note: This field may return null, indicating that no valid value was found.
     * @param InstanceGroup Instance group information.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setInstanceGroup(InstanceGroup [] InstanceGroup) {
        this.InstanceGroup = InstanceGroup;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AlarmStatus", this.AlarmStatus);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "FirstOccurTime", this.FirstOccurTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "LastOccurTime", this.LastOccurTime);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ObjName", this.ObjName);
        this.setParamSimple(map, prefix + "ObjId", this.ObjId);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "Vpc", this.Vpc);
        this.setParamSimple(map, prefix + "MetricId", this.MetricId);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);
        this.setParamArraySimple(map, prefix + "NotifyWay.", this.NotifyWay);
        this.setParamArrayObj(map, prefix + "InstanceGroup.", this.InstanceGroup);

    }
}

