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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeXEventsRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Event type. Valid values: `slow` (Slow SQL event), `blocked` (blocking event),  deadlock` (deadlock event).
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Generation start time of an extended file in the format of yyyy-MM-dd HH:mm:ss.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Generation end time of an extended file in the format of yyyy-MM-dd HH:mm:ss.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Page number. Default value: `0`
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries to be returned per page. Value range: 1-100. Default value: `20`
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Event type. Valid values: `slow` (Slow SQL event), `blocked` (blocking event),  deadlock` (deadlock event). 
     * @return EventType Event type. Valid values: `slow` (Slow SQL event), `blocked` (blocking event),  deadlock` (deadlock event).
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Event type. Valid values: `slow` (Slow SQL event), `blocked` (blocking event),  deadlock` (deadlock event).
     * @param EventType Event type. Valid values: `slow` (Slow SQL event), `blocked` (blocking event),  deadlock` (deadlock event).
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Generation start time of an extended file in the format of yyyy-MM-dd HH:mm:ss. 
     * @return StartTime Generation start time of an extended file in the format of yyyy-MM-dd HH:mm:ss.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Generation start time of an extended file in the format of yyyy-MM-dd HH:mm:ss.
     * @param StartTime Generation start time of an extended file in the format of yyyy-MM-dd HH:mm:ss.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Generation end time of an extended file in the format of yyyy-MM-dd HH:mm:ss. 
     * @return EndTime Generation end time of an extended file in the format of yyyy-MM-dd HH:mm:ss.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Generation end time of an extended file in the format of yyyy-MM-dd HH:mm:ss.
     * @param EndTime Generation end time of an extended file in the format of yyyy-MM-dd HH:mm:ss.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Page number. Default value: `0` 
     * @return Offset Page number. Default value: `0`
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number. Default value: `0`
     * @param Offset Page number. Default value: `0`
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries to be returned per page. Value range: 1-100. Default value: `20` 
     * @return Limit Number of entries to be returned per page. Value range: 1-100. Default value: `20`
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries to be returned per page. Value range: 1-100. Default value: `20`
     * @param Limit Number of entries to be returned per page. Value range: 1-100. Default value: `20`
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeXEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeXEventsRequest(DescribeXEventsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

