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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProductEventListEvents extends AbstractModel {

    /**
    * Event ID.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * Event name in Chinese.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("EventCName")
    @Expose
    private String EventCName;

    /**
    * Event name in English.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("EventEName")
    @Expose
    private String EventEName;

    /**
    * Event name abbreviation.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Product name in Chinese.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ProductCName")
    @Expose
    private String ProductCName;

    /**
    * Product name in English.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ProductEName")
    @Expose
    private String ProductEName;

    /**
    * Product name abbreviation.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Instance ID.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Project ID.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Region.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Status.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Whether to support alarms.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("SupportAlarm")
    @Expose
    private Long SupportAlarm;

    /**
    * Event type.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Start time.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Update time.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Instance object information.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Dimensions")
    @Expose
    private DescribeProductEventListEventsDimensions [] Dimensions;

    /**
    * Additional information of the instance object.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AdditionMsg")
    @Expose
    private DescribeProductEventListEventsDimensions [] AdditionMsg;

    /**
    * Whether to configure alarms.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("IsAlarmConfig")
    @Expose
    private Long IsAlarmConfig;

    /**
    * Policy information.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("GroupInfo")
    @Expose
    private DescribeProductEventListEventsGroupInfo [] GroupInfo;

    /**
    * Display name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
     * Get Event ID.
Note: This field may return null, indicating that no valid value was found. 
     * @return EventId Event ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID.
Note: This field may return null, indicating that no valid value was found.
     * @param EventId Event ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Event name in Chinese.
Note: This field may return null, indicating that no valid value was found. 
     * @return EventCName Event name in Chinese.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getEventCName() {
        return this.EventCName;
    }

    /**
     * Set Event name in Chinese.
Note: This field may return null, indicating that no valid value was found.
     * @param EventCName Event name in Chinese.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setEventCName(String EventCName) {
        this.EventCName = EventCName;
    }

    /**
     * Get Event name in English.
Note: This field may return null, indicating that no valid value was found. 
     * @return EventEName Event name in English.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getEventEName() {
        return this.EventEName;
    }

    /**
     * Set Event name in English.
Note: This field may return null, indicating that no valid value was found.
     * @param EventEName Event name in English.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setEventEName(String EventEName) {
        this.EventEName = EventEName;
    }

    /**
     * Get Event name abbreviation.
Note: This field may return null, indicating that no valid value was found. 
     * @return EventName Event name abbreviation.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Event name abbreviation.
Note: This field may return null, indicating that no valid value was found.
     * @param EventName Event name abbreviation.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Product name in Chinese.
Note: This field may return null, indicating that no valid value was found. 
     * @return ProductCName Product name in Chinese.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getProductCName() {
        return this.ProductCName;
    }

    /**
     * Set Product name in Chinese.
Note: This field may return null, indicating that no valid value was found.
     * @param ProductCName Product name in Chinese.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setProductCName(String ProductCName) {
        this.ProductCName = ProductCName;
    }

    /**
     * Get Product name in English.
Note: This field may return null, indicating that no valid value was found. 
     * @return ProductEName Product name in English.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getProductEName() {
        return this.ProductEName;
    }

    /**
     * Set Product name in English.
Note: This field may return null, indicating that no valid value was found.
     * @param ProductEName Product name in English.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setProductEName(String ProductEName) {
        this.ProductEName = ProductEName;
    }

    /**
     * Get Product name abbreviation.
Note: This field may return null, indicating that no valid value was found. 
     * @return ProductName Product name abbreviation.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product name abbreviation.
Note: This field may return null, indicating that no valid value was found.
     * @param ProductName Product name abbreviation.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Instance ID.
Note: This field may return null, indicating that no valid value was found. 
     * @return InstanceId Instance ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
Note: This field may return null, indicating that no valid value was found.
     * @param InstanceId Instance ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name.
Note: This field may return null, indicating that no valid value was found. 
     * @return InstanceName Instance name.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
Note: This field may return null, indicating that no valid value was found.
     * @param InstanceName Instance name.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Project ID.
Note: This field may return null, indicating that no valid value was found. 
     * @return ProjectId Project ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
Note: This field may return null, indicating that no valid value was found.
     * @param ProjectId Project ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get Status.
Note: This field may return null, indicating that no valid value was found. 
     * @return Status Status.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
Note: This field may return null, indicating that no valid value was found.
     * @param Status Status.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Whether to support alarms.
Note: This field may return null, indicating that no valid value was found. 
     * @return SupportAlarm Whether to support alarms.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getSupportAlarm() {
        return this.SupportAlarm;
    }

    /**
     * Set Whether to support alarms.
Note: This field may return null, indicating that no valid value was found.
     * @param SupportAlarm Whether to support alarms.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setSupportAlarm(Long SupportAlarm) {
        this.SupportAlarm = SupportAlarm;
    }

    /**
     * Get Event type.
Note: This field may return null, indicating that no valid value was found. 
     * @return Type Event type.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Event type.
Note: This field may return null, indicating that no valid value was found.
     * @param Type Event type.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Start time.
Note: This field may return null, indicating that no valid value was found. 
     * @return StartTime Start time.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
Note: This field may return null, indicating that no valid value was found.
     * @param StartTime Start time.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Update time.
Note: This field may return null, indicating that no valid value was found. 
     * @return UpdateTime Update time.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
Note: This field may return null, indicating that no valid value was found.
     * @param UpdateTime Update time.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Instance object information.
Note: This field may return null, indicating that no valid value was found. 
     * @return Dimensions Instance object information.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribeProductEventListEventsDimensions [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Instance object information.
Note: This field may return null, indicating that no valid value was found.
     * @param Dimensions Instance object information.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDimensions(DescribeProductEventListEventsDimensions [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get Additional information of the instance object.
Note: This field may return null, indicating that no valid value was found. 
     * @return AdditionMsg Additional information of the instance object.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribeProductEventListEventsDimensions [] getAdditionMsg() {
        return this.AdditionMsg;
    }

    /**
     * Set Additional information of the instance object.
Note: This field may return null, indicating that no valid value was found.
     * @param AdditionMsg Additional information of the instance object.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setAdditionMsg(DescribeProductEventListEventsDimensions [] AdditionMsg) {
        this.AdditionMsg = AdditionMsg;
    }

    /**
     * Get Whether to configure alarms.
Note: This field may return null, indicating that no valid value was found. 
     * @return IsAlarmConfig Whether to configure alarms.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getIsAlarmConfig() {
        return this.IsAlarmConfig;
    }

    /**
     * Set Whether to configure alarms.
Note: This field may return null, indicating that no valid value was found.
     * @param IsAlarmConfig Whether to configure alarms.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setIsAlarmConfig(Long IsAlarmConfig) {
        this.IsAlarmConfig = IsAlarmConfig;
    }

    /**
     * Get Policy information.
Note: This field may return null, indicating that no valid value was found. 
     * @return GroupInfo Policy information.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribeProductEventListEventsGroupInfo [] getGroupInfo() {
        return this.GroupInfo;
    }

    /**
     * Set Policy information.
Note: This field may return null, indicating that no valid value was found.
     * @param GroupInfo Policy information.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setGroupInfo(DescribeProductEventListEventsGroupInfo [] GroupInfo) {
        this.GroupInfo = GroupInfo;
    }

    /**
     * Get Display name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ViewName Display name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set Display name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ViewName Display name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    public DescribeProductEventListEvents() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProductEventListEvents(DescribeProductEventListEvents source) {
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.EventCName != null) {
            this.EventCName = new String(source.EventCName);
        }
        if (source.EventEName != null) {
            this.EventEName = new String(source.EventEName);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.ProductCName != null) {
            this.ProductCName = new String(source.ProductCName);
        }
        if (source.ProductEName != null) {
            this.ProductEName = new String(source.ProductEName);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SupportAlarm != null) {
            this.SupportAlarm = new Long(source.SupportAlarm);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new DescribeProductEventListEventsDimensions[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new DescribeProductEventListEventsDimensions(source.Dimensions[i]);
            }
        }
        if (source.AdditionMsg != null) {
            this.AdditionMsg = new DescribeProductEventListEventsDimensions[source.AdditionMsg.length];
            for (int i = 0; i < source.AdditionMsg.length; i++) {
                this.AdditionMsg[i] = new DescribeProductEventListEventsDimensions(source.AdditionMsg[i]);
            }
        }
        if (source.IsAlarmConfig != null) {
            this.IsAlarmConfig = new Long(source.IsAlarmConfig);
        }
        if (source.GroupInfo != null) {
            this.GroupInfo = new DescribeProductEventListEventsGroupInfo[source.GroupInfo.length];
            for (int i = 0; i < source.GroupInfo.length; i++) {
                this.GroupInfo[i] = new DescribeProductEventListEventsGroupInfo(source.GroupInfo[i]);
            }
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "EventCName", this.EventCName);
        this.setParamSimple(map, prefix + "EventEName", this.EventEName);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "ProductCName", this.ProductCName);
        this.setParamSimple(map, prefix + "ProductEName", this.ProductEName);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SupportAlarm", this.SupportAlarm);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamArrayObj(map, prefix + "AdditionMsg.", this.AdditionMsg);
        this.setParamSimple(map, prefix + "IsAlarmConfig", this.IsAlarmConfig);
        this.setParamArrayObj(map, prefix + "GroupInfo.", this.GroupInfo);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);

    }
}

