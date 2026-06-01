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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceAlarmEventsRequest extends AbstractModel {

    /**
    * Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Event query range start time, closed interval.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the event query range, closed interval.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Event name. Outofmemory - Memory OOM (status event); Switch - primary-secondary switch (status event); Roremove - read-only instance removal (status event); MemoryUsedHigh - high memory utilization (status event); CPUExpansion - CPU performance scale-out (stateless event); CPUExpansionFailed - CPU performance scale-out failed (stateless event); CPUContraction - CPU performance scale-in (stateless event); Restart - instance restart (status event); ServerFailureNodeMigration - ServerFailureNodeMigration (status event); PlannedSwitch - planned active/standby switch (stateless event); OverusedReadonlySet - instance will be locked (stateless event); OverusedReadWriteSet - instance unlock (stateless event).
    */
    @SerializedName("EventName")
    @Expose
    private String [] EventName;

    /**
    * Event status. "1" - Event; "0" - Recovery event; "-" - Stateless event.
    */
    @SerializedName("EventStatus")
    @Expose
    private String EventStatus;

    /**
    * Sorting method. Sort by event occurrence. "DESC" - inverted; "ASC" - in order. Default is inverted.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Number of displayed events. Default is 100, maximum is 200.
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * Node ID.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
     * Get Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Event query range start time, closed interval. 
     * @return StartTime Event query range start time, closed interval.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Event query range start time, closed interval.
     * @param StartTime Event query range start time, closed interval.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the event query range, closed interval. 
     * @return EndTime End time of the event query range, closed interval.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the event query range, closed interval.
     * @param EndTime End time of the event query range, closed interval.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Event name. Outofmemory - Memory OOM (status event); Switch - primary-secondary switch (status event); Roremove - read-only instance removal (status event); MemoryUsedHigh - high memory utilization (status event); CPUExpansion - CPU performance scale-out (stateless event); CPUExpansionFailed - CPU performance scale-out failed (stateless event); CPUContraction - CPU performance scale-in (stateless event); Restart - instance restart (status event); ServerFailureNodeMigration - ServerFailureNodeMigration (status event); PlannedSwitch - planned active/standby switch (stateless event); OverusedReadonlySet - instance will be locked (stateless event); OverusedReadWriteSet - instance unlock (stateless event). 
     * @return EventName Event name. Outofmemory - Memory OOM (status event); Switch - primary-secondary switch (status event); Roremove - read-only instance removal (status event); MemoryUsedHigh - high memory utilization (status event); CPUExpansion - CPU performance scale-out (stateless event); CPUExpansionFailed - CPU performance scale-out failed (stateless event); CPUContraction - CPU performance scale-in (stateless event); Restart - instance restart (status event); ServerFailureNodeMigration - ServerFailureNodeMigration (status event); PlannedSwitch - planned active/standby switch (stateless event); OverusedReadonlySet - instance will be locked (stateless event); OverusedReadWriteSet - instance unlock (stateless event).
     */
    public String [] getEventName() {
        return this.EventName;
    }

    /**
     * Set Event name. Outofmemory - Memory OOM (status event); Switch - primary-secondary switch (status event); Roremove - read-only instance removal (status event); MemoryUsedHigh - high memory utilization (status event); CPUExpansion - CPU performance scale-out (stateless event); CPUExpansionFailed - CPU performance scale-out failed (stateless event); CPUContraction - CPU performance scale-in (stateless event); Restart - instance restart (status event); ServerFailureNodeMigration - ServerFailureNodeMigration (status event); PlannedSwitch - planned active/standby switch (stateless event); OverusedReadonlySet - instance will be locked (stateless event); OverusedReadWriteSet - instance unlock (stateless event).
     * @param EventName Event name. Outofmemory - Memory OOM (status event); Switch - primary-secondary switch (status event); Roremove - read-only instance removal (status event); MemoryUsedHigh - high memory utilization (status event); CPUExpansion - CPU performance scale-out (stateless event); CPUExpansionFailed - CPU performance scale-out failed (stateless event); CPUContraction - CPU performance scale-in (stateless event); Restart - instance restart (status event); ServerFailureNodeMigration - ServerFailureNodeMigration (status event); PlannedSwitch - planned active/standby switch (stateless event); OverusedReadonlySet - instance will be locked (stateless event); OverusedReadWriteSet - instance unlock (stateless event).
     */
    public void setEventName(String [] EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Event status. "1" - Event; "0" - Recovery event; "-" - Stateless event. 
     * @return EventStatus Event status. "1" - Event; "0" - Recovery event; "-" - Stateless event.
     */
    public String getEventStatus() {
        return this.EventStatus;
    }

    /**
     * Set Event status. "1" - Event; "0" - Recovery event; "-" - Stateless event.
     * @param EventStatus Event status. "1" - Event; "0" - Recovery event; "-" - Stateless event.
     */
    public void setEventStatus(String EventStatus) {
        this.EventStatus = EventStatus;
    }

    /**
     * Get Sorting method. Sort by event occurrence. "DESC" - inverted; "ASC" - in order. Default is inverted. 
     * @return Order Sorting method. Sort by event occurrence. "DESC" - inverted; "ASC" - in order. Default is inverted.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method. Sort by event occurrence. "DESC" - inverted; "ASC" - in order. Default is inverted.
     * @param Order Sorting method. Sort by event occurrence. "DESC" - inverted; "ASC" - in order. Default is inverted.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Number of displayed events. Default is 100, maximum is 200. 
     * @return Limit Number of displayed events. Default is 100, maximum is 200.
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of displayed events. Default is 100, maximum is 200.
     * @param Limit Number of displayed events. Default is 100, maximum is 200.
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Node ID. 
     * @return NodeId Node ID.
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID.
     * @param NodeId Node ID.
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    public DescribeInstanceAlarmEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceAlarmEventsRequest(DescribeInstanceAlarmEventsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.EventName != null) {
            this.EventName = new String[source.EventName.length];
            for (int i = 0; i < source.EventName.length; i++) {
                this.EventName[i] = new String(source.EventName[i]);
            }
        }
        if (source.EventStatus != null) {
            this.EventStatus = new String(source.EventStatus);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "EventName.", this.EventName);
        this.setParamSimple(map, prefix + "EventStatus", this.EventStatus);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);

    }
}

