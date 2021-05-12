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

public class DescribeProductEventListRequest extends AbstractModel{

    /**
    * API component name. It is fixed to monitor.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Filter by product type. For example, 'cvm' indicates Cloud Virtual Machine.
    */
    @SerializedName("ProductName")
    @Expose
    private String [] ProductName;

    /**
    * Filter by product name. For example, "guest_reboot" indicates server restart.
    */
    @SerializedName("EventName")
    @Expose
    private String [] EventName;

    /**
    * Affected object, such as "ins-19708ino"
    */
    @SerializedName("InstanceId")
    @Expose
    private String [] InstanceId;

    /**
    * Filter by dimension, such as by public IP: 10.0.0.1.
    */
    @SerializedName("Dimensions")
    @Expose
    private DescribeProductEventListDimensions [] Dimensions;

    /**
    * Region filter parameter for service events, such as `gz`. For region abbreviations, please see [Region List](https://intl.cloud.tencent.com/document/product/248/50863?from_cn_redirect=1)
    */
    @SerializedName("RegionList")
    @Expose
    private String [] RegionList;

    /**
    * Filter by event type. Valid values: ["status_change","abnormal"], which indicate events whose statuses have changed and events with exceptions respectively.
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * Filter by event status. Valid values: ["recover","alarm","-"], which indicate that an event has been recovered, has not been recovered, and has no status respectively.
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * Filter by project ID.
    */
    @SerializedName("Project")
    @Expose
    private String [] Project;

    /**
    * Filter by alarm status configuration. The value 1 indicates that the alarm status has been configured. The value 0 indicates that the alarm status has not been configured.
    */
    @SerializedName("IsAlarmConfig")
    @Expose
    private Long IsAlarmConfig;

    /**
    * Sorting by update time. The value ASC indicates the ascending order. The value DESC indicates the descending order. The default value is DESC.
    */
    @SerializedName("TimeOrder")
    @Expose
    private String TimeOrder;

    /**
    * Start time, which is the timestamp one day prior by default.
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
    * Page offset. The default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of parameters that can be returned on each page. The default value is 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get API component name. It is fixed to monitor. 
     * @return Module API component name. It is fixed to monitor.
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set API component name. It is fixed to monitor.
     * @param Module API component name. It is fixed to monitor.
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Filter by product type. For example, 'cvm' indicates Cloud Virtual Machine. 
     * @return ProductName Filter by product type. For example, 'cvm' indicates Cloud Virtual Machine.
     */
    public String [] getProductName() {
        return this.ProductName;
    }

    /**
     * Set Filter by product type. For example, 'cvm' indicates Cloud Virtual Machine.
     * @param ProductName Filter by product type. For example, 'cvm' indicates Cloud Virtual Machine.
     */
    public void setProductName(String [] ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Filter by product name. For example, "guest_reboot" indicates server restart. 
     * @return EventName Filter by product name. For example, "guest_reboot" indicates server restart.
     */
    public String [] getEventName() {
        return this.EventName;
    }

    /**
     * Set Filter by product name. For example, "guest_reboot" indicates server restart.
     * @param EventName Filter by product name. For example, "guest_reboot" indicates server restart.
     */
    public void setEventName(String [] EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Affected object, such as "ins-19708ino" 
     * @return InstanceId Affected object, such as "ins-19708ino"
     */
    public String [] getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Affected object, such as "ins-19708ino"
     * @param InstanceId Affected object, such as "ins-19708ino"
     */
    public void setInstanceId(String [] InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Filter by dimension, such as by public IP: 10.0.0.1. 
     * @return Dimensions Filter by dimension, such as by public IP: 10.0.0.1.
     */
    public DescribeProductEventListDimensions [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Filter by dimension, such as by public IP: 10.0.0.1.
     * @param Dimensions Filter by dimension, such as by public IP: 10.0.0.1.
     */
    public void setDimensions(DescribeProductEventListDimensions [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get Region filter parameter for service events, such as `gz`. For region abbreviations, please see [Region List](https://intl.cloud.tencent.com/document/product/248/50863?from_cn_redirect=1) 
     * @return RegionList Region filter parameter for service events, such as `gz`. For region abbreviations, please see [Region List](https://intl.cloud.tencent.com/document/product/248/50863?from_cn_redirect=1)
     */
    public String [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set Region filter parameter for service events, such as `gz`. For region abbreviations, please see [Region List](https://intl.cloud.tencent.com/document/product/248/50863?from_cn_redirect=1)
     * @param RegionList Region filter parameter for service events, such as `gz`. For region abbreviations, please see [Region List](https://intl.cloud.tencent.com/document/product/248/50863?from_cn_redirect=1)
     */
    public void setRegionList(String [] RegionList) {
        this.RegionList = RegionList;
    }

    /**
     * Get Filter by event type. Valid values: ["status_change","abnormal"], which indicate events whose statuses have changed and events with exceptions respectively. 
     * @return Type Filter by event type. Valid values: ["status_change","abnormal"], which indicate events whose statuses have changed and events with exceptions respectively.
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set Filter by event type. Valid values: ["status_change","abnormal"], which indicate events whose statuses have changed and events with exceptions respectively.
     * @param Type Filter by event type. Valid values: ["status_change","abnormal"], which indicate events whose statuses have changed and events with exceptions respectively.
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get Filter by event status. Valid values: ["recover","alarm","-"], which indicate that an event has been recovered, has not been recovered, and has no status respectively. 
     * @return Status Filter by event status. Valid values: ["recover","alarm","-"], which indicate that an event has been recovered, has not been recovered, and has no status respectively.
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set Filter by event status. Valid values: ["recover","alarm","-"], which indicate that an event has been recovered, has not been recovered, and has no status respectively.
     * @param Status Filter by event status. Valid values: ["recover","alarm","-"], which indicate that an event has been recovered, has not been recovered, and has no status respectively.
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get Filter by project ID. 
     * @return Project Filter by project ID.
     */
    public String [] getProject() {
        return this.Project;
    }

    /**
     * Set Filter by project ID.
     * @param Project Filter by project ID.
     */
    public void setProject(String [] Project) {
        this.Project = Project;
    }

    /**
     * Get Filter by alarm status configuration. The value 1 indicates that the alarm status has been configured. The value 0 indicates that the alarm status has not been configured. 
     * @return IsAlarmConfig Filter by alarm status configuration. The value 1 indicates that the alarm status has been configured. The value 0 indicates that the alarm status has not been configured.
     */
    public Long getIsAlarmConfig() {
        return this.IsAlarmConfig;
    }

    /**
     * Set Filter by alarm status configuration. The value 1 indicates that the alarm status has been configured. The value 0 indicates that the alarm status has not been configured.
     * @param IsAlarmConfig Filter by alarm status configuration. The value 1 indicates that the alarm status has been configured. The value 0 indicates that the alarm status has not been configured.
     */
    public void setIsAlarmConfig(Long IsAlarmConfig) {
        this.IsAlarmConfig = IsAlarmConfig;
    }

    /**
     * Get Sorting by update time. The value ASC indicates the ascending order. The value DESC indicates the descending order. The default value is DESC. 
     * @return TimeOrder Sorting by update time. The value ASC indicates the ascending order. The value DESC indicates the descending order. The default value is DESC.
     */
    public String getTimeOrder() {
        return this.TimeOrder;
    }

    /**
     * Set Sorting by update time. The value ASC indicates the ascending order. The value DESC indicates the descending order. The default value is DESC.
     * @param TimeOrder Sorting by update time. The value ASC indicates the ascending order. The value DESC indicates the descending order. The default value is DESC.
     */
    public void setTimeOrder(String TimeOrder) {
        this.TimeOrder = TimeOrder;
    }

    /**
     * Get Start time, which is the timestamp one day prior by default. 
     * @return StartTime Start time, which is the timestamp one day prior by default.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, which is the timestamp one day prior by default.
     * @param StartTime Start time, which is the timestamp one day prior by default.
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
     * Get Page offset. The default value is 0. 
     * @return Offset Page offset. The default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset. The default value is 0.
     * @param Offset Page offset. The default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of parameters that can be returned on each page. The default value is 20. 
     * @return Limit The number of parameters that can be returned on each page. The default value is 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of parameters that can be returned on each page. The default value is 20.
     * @param Limit The number of parameters that can be returned on each page. The default value is 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeProductEventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProductEventListRequest(DescribeProductEventListRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.ProductName != null) {
            this.ProductName = new String[source.ProductName.length];
            for (int i = 0; i < source.ProductName.length; i++) {
                this.ProductName[i] = new String(source.ProductName[i]);
            }
        }
        if (source.EventName != null) {
            this.EventName = new String[source.EventName.length];
            for (int i = 0; i < source.EventName.length; i++) {
                this.EventName[i] = new String(source.EventName[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String[source.InstanceId.length];
            for (int i = 0; i < source.InstanceId.length; i++) {
                this.InstanceId[i] = new String(source.InstanceId[i]);
            }
        }
        if (source.Dimensions != null) {
            this.Dimensions = new DescribeProductEventListDimensions[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new DescribeProductEventListDimensions(source.Dimensions[i]);
            }
        }
        if (source.RegionList != null) {
            this.RegionList = new String[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new String(source.RegionList[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.Project != null) {
            this.Project = new String[source.Project.length];
            for (int i = 0; i < source.Project.length; i++) {
                this.Project[i] = new String(source.Project[i]);
            }
        }
        if (source.IsAlarmConfig != null) {
            this.IsAlarmConfig = new Long(source.IsAlarmConfig);
        }
        if (source.TimeOrder != null) {
            this.TimeOrder = new String(source.TimeOrder);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
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
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamArraySimple(map, prefix + "ProductName.", this.ProductName);
        this.setParamArraySimple(map, prefix + "EventName.", this.EventName);
        this.setParamArraySimple(map, prefix + "InstanceId.", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamArraySimple(map, prefix + "RegionList.", this.RegionList);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "Project.", this.Project);
        this.setParamSimple(map, prefix + "IsAlarmConfig", this.IsAlarmConfig);
        this.setParamSimple(map, prefix + "TimeOrder", this.TimeOrder);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

