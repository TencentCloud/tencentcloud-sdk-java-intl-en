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

public class DescribeEventCasesRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Event Instance Catalog, Example Value:
- Expired: expired
- Not Expired: consuming
- All: all

    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Page Number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of items per page
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Event name
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Event type
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Event Segmentation Type
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
    * Event Broadcast Type
    */
    @SerializedName("EventBroadcastType")
    @Expose
    private String EventBroadcastType;

    /**
    * Event Instance Status, Example Value:
- Consumed: COMSUMED
- Expired: EXPIRED
- Pending Consumption: ACTIVE
- Consuming: CONSUMING
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Minimum Creation Time of Event Instance
    */
    @SerializedName("CreationTimeStart")
    @Expose
    private String CreationTimeStart;

    /**
    * Maximum Creation Time of Event Instance
    */
    @SerializedName("CreationTimeEnd")
    @Expose
    private String CreationTimeEnd;

    /**
    * Minimum Trigger Time of Event Instance
    */
    @SerializedName("EventTriggeredTimeStart")
    @Expose
    private String EventTriggeredTimeStart;

    /**
    * Maximum Trigger Time of Event Instance
    */
    @SerializedName("EventTriggeredTimeEnd")
    @Expose
    private String EventTriggeredTimeEnd;

    /**
    * Minimum Consumption Time of Event Instance
    */
    @SerializedName("LogTimeStart")
    @Expose
    private String LogTimeStart;

    /**
    * Maximum Consumption Time of Event Instance
    */
    @SerializedName("LogTimeEnd")
    @Expose
    private String LogTimeEnd;

    /**
    * Event Instance Data Timestamp
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * Event Instance Validity Period
    */
    @SerializedName("TimeToLive")
    @Expose
    private String TimeToLive;

    /**
    * Sort Fields
    */
    @SerializedName("SortItem")
    @Expose
    private String SortItem;

    /**
    * Sorting Order
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

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
     * Get Event Instance Catalog, Example Value:
- Expired: expired
- Not Expired: consuming
- All: all
 
     * @return Category Event Instance Catalog, Example Value:
- Expired: expired
- Not Expired: consuming
- All: all

     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Event Instance Catalog, Example Value:
- Expired: expired
- Not Expired: consuming
- All: all

     * @param Category Event Instance Catalog, Example Value:
- Expired: expired
- Not Expired: consuming
- All: all

     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Page Number 
     * @return PageNumber Page Number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page Number
     * @param PageNumber Page Number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of items per page 
     * @return PageSize Number of items per page
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page
     * @param PageSize Number of items per page
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Event name 
     * @return EventName Event name
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Event name
     * @param EventName Event name
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Event type 
     * @return EventType Event type
     * @deprecated
     */
    @Deprecated
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Event type
     * @param EventType Event type
     * @deprecated
     */
    @Deprecated
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Event Segmentation Type 
     * @return EventSubType Event Segmentation Type
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set Event Segmentation Type
     * @param EventSubType Event Segmentation Type
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    /**
     * Get Event Broadcast Type 
     * @return EventBroadcastType Event Broadcast Type
     * @deprecated
     */
    @Deprecated
    public String getEventBroadcastType() {
        return this.EventBroadcastType;
    }

    /**
     * Set Event Broadcast Type
     * @param EventBroadcastType Event Broadcast Type
     * @deprecated
     */
    @Deprecated
    public void setEventBroadcastType(String EventBroadcastType) {
        this.EventBroadcastType = EventBroadcastType;
    }

    /**
     * Get Event Instance Status, Example Value:
- Consumed: COMSUMED
- Expired: EXPIRED
- Pending Consumption: ACTIVE
- Consuming: CONSUMING 
     * @return Status Event Instance Status, Example Value:
- Consumed: COMSUMED
- Expired: EXPIRED
- Pending Consumption: ACTIVE
- Consuming: CONSUMING
     * @deprecated
     */
    @Deprecated
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Event Instance Status, Example Value:
- Consumed: COMSUMED
- Expired: EXPIRED
- Pending Consumption: ACTIVE
- Consuming: CONSUMING
     * @param Status Event Instance Status, Example Value:
- Consumed: COMSUMED
- Expired: EXPIRED
- Pending Consumption: ACTIVE
- Consuming: CONSUMING
     * @deprecated
     */
    @Deprecated
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Minimum Creation Time of Event Instance 
     * @return CreationTimeStart Minimum Creation Time of Event Instance
     */
    public String getCreationTimeStart() {
        return this.CreationTimeStart;
    }

    /**
     * Set Minimum Creation Time of Event Instance
     * @param CreationTimeStart Minimum Creation Time of Event Instance
     */
    public void setCreationTimeStart(String CreationTimeStart) {
        this.CreationTimeStart = CreationTimeStart;
    }

    /**
     * Get Maximum Creation Time of Event Instance 
     * @return CreationTimeEnd Maximum Creation Time of Event Instance
     */
    public String getCreationTimeEnd() {
        return this.CreationTimeEnd;
    }

    /**
     * Set Maximum Creation Time of Event Instance
     * @param CreationTimeEnd Maximum Creation Time of Event Instance
     */
    public void setCreationTimeEnd(String CreationTimeEnd) {
        this.CreationTimeEnd = CreationTimeEnd;
    }

    /**
     * Get Minimum Trigger Time of Event Instance 
     * @return EventTriggeredTimeStart Minimum Trigger Time of Event Instance
     */
    public String getEventTriggeredTimeStart() {
        return this.EventTriggeredTimeStart;
    }

    /**
     * Set Minimum Trigger Time of Event Instance
     * @param EventTriggeredTimeStart Minimum Trigger Time of Event Instance
     */
    public void setEventTriggeredTimeStart(String EventTriggeredTimeStart) {
        this.EventTriggeredTimeStart = EventTriggeredTimeStart;
    }

    /**
     * Get Maximum Trigger Time of Event Instance 
     * @return EventTriggeredTimeEnd Maximum Trigger Time of Event Instance
     */
    public String getEventTriggeredTimeEnd() {
        return this.EventTriggeredTimeEnd;
    }

    /**
     * Set Maximum Trigger Time of Event Instance
     * @param EventTriggeredTimeEnd Maximum Trigger Time of Event Instance
     */
    public void setEventTriggeredTimeEnd(String EventTriggeredTimeEnd) {
        this.EventTriggeredTimeEnd = EventTriggeredTimeEnd;
    }

    /**
     * Get Minimum Consumption Time of Event Instance 
     * @return LogTimeStart Minimum Consumption Time of Event Instance
     */
    public String getLogTimeStart() {
        return this.LogTimeStart;
    }

    /**
     * Set Minimum Consumption Time of Event Instance
     * @param LogTimeStart Minimum Consumption Time of Event Instance
     */
    public void setLogTimeStart(String LogTimeStart) {
        this.LogTimeStart = LogTimeStart;
    }

    /**
     * Get Maximum Consumption Time of Event Instance 
     * @return LogTimeEnd Maximum Consumption Time of Event Instance
     */
    public String getLogTimeEnd() {
        return this.LogTimeEnd;
    }

    /**
     * Set Maximum Consumption Time of Event Instance
     * @param LogTimeEnd Maximum Consumption Time of Event Instance
     */
    public void setLogTimeEnd(String LogTimeEnd) {
        this.LogTimeEnd = LogTimeEnd;
    }

    /**
     * Get Event Instance Data Timestamp 
     * @return Dimension Event Instance Data Timestamp
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set Event Instance Data Timestamp
     * @param Dimension Event Instance Data Timestamp
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get Event Instance Validity Period 
     * @return TimeToLive Event Instance Validity Period
     */
    public String getTimeToLive() {
        return this.TimeToLive;
    }

    /**
     * Set Event Instance Validity Period
     * @param TimeToLive Event Instance Validity Period
     */
    public void setTimeToLive(String TimeToLive) {
        this.TimeToLive = TimeToLive;
    }

    /**
     * Get Sort Fields 
     * @return SortItem Sort Fields
     */
    public String getSortItem() {
        return this.SortItem;
    }

    /**
     * Set Sort Fields
     * @param SortItem Sort Fields
     */
    public void setSortItem(String SortItem) {
        this.SortItem = SortItem;
    }

    /**
     * Get Sorting Order 
     * @return SortType Sorting Order
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set Sorting Order
     * @param SortType Sorting Order
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    public DescribeEventCasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEventCasesRequest(DescribeEventCasesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.EventSubType != null) {
            this.EventSubType = new String(source.EventSubType);
        }
        if (source.EventBroadcastType != null) {
            this.EventBroadcastType = new String(source.EventBroadcastType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreationTimeStart != null) {
            this.CreationTimeStart = new String(source.CreationTimeStart);
        }
        if (source.CreationTimeEnd != null) {
            this.CreationTimeEnd = new String(source.CreationTimeEnd);
        }
        if (source.EventTriggeredTimeStart != null) {
            this.EventTriggeredTimeStart = new String(source.EventTriggeredTimeStart);
        }
        if (source.EventTriggeredTimeEnd != null) {
            this.EventTriggeredTimeEnd = new String(source.EventTriggeredTimeEnd);
        }
        if (source.LogTimeStart != null) {
            this.LogTimeStart = new String(source.LogTimeStart);
        }
        if (source.LogTimeEnd != null) {
            this.LogTimeEnd = new String(source.LogTimeEnd);
        }
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.TimeToLive != null) {
            this.TimeToLive = new String(source.TimeToLive);
        }
        if (source.SortItem != null) {
            this.SortItem = new String(source.SortItem);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);
        this.setParamSimple(map, prefix + "EventBroadcastType", this.EventBroadcastType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreationTimeStart", this.CreationTimeStart);
        this.setParamSimple(map, prefix + "CreationTimeEnd", this.CreationTimeEnd);
        this.setParamSimple(map, prefix + "EventTriggeredTimeStart", this.EventTriggeredTimeStart);
        this.setParamSimple(map, prefix + "EventTriggeredTimeEnd", this.EventTriggeredTimeEnd);
        this.setParamSimple(map, prefix + "LogTimeStart", this.LogTimeStart);
        this.setParamSimple(map, prefix + "LogTimeEnd", this.LogTimeEnd);
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamSimple(map, prefix + "TimeToLive", this.TimeToLive);
        this.setParamSimple(map, prefix + "SortItem", this.SortItem);
        this.setParamSimple(map, prefix + "SortType", this.SortType);

    }
}

