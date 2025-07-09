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

public class Events extends AbstractModel {

    /**
    * ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * File name of an extended event
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File size of an extended event
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Event type. Valid values: `slow` (Slow SQL event), `blocked` (blocking event),  `deadlock` (deadlock event).
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * Event record status. Valid values: `1` (succeeded), `2` (failed).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Generation start time of an extended file
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Generation end time of an extended file
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Download address on the private network
    */
    @SerializedName("InternalAddr")
    @Expose
    private String InternalAddr;

    /**
    * Download address on the public network
    */
    @SerializedName("ExternalAddr")
    @Expose
    private String ExternalAddr;

    /**
     * Get ID 
     * @return Id ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID
     * @param Id ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get File name of an extended event 
     * @return FileName File name of an extended event
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set File name of an extended event
     * @param FileName File name of an extended event
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File size of an extended event 
     * @return Size File size of an extended event
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set File size of an extended event
     * @param Size File size of an extended event
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Event type. Valid values: `slow` (Slow SQL event), `blocked` (blocking event),  `deadlock` (deadlock event). 
     * @return EventType Event type. Valid values: `slow` (Slow SQL event), `blocked` (blocking event),  `deadlock` (deadlock event).
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set Event type. Valid values: `slow` (Slow SQL event), `blocked` (blocking event),  `deadlock` (deadlock event).
     * @param EventType Event type. Valid values: `slow` (Slow SQL event), `blocked` (blocking event),  `deadlock` (deadlock event).
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Event record status. Valid values: `1` (succeeded), `2` (failed). 
     * @return Status Event record status. Valid values: `1` (succeeded), `2` (failed).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Event record status. Valid values: `1` (succeeded), `2` (failed).
     * @param Status Event record status. Valid values: `1` (succeeded), `2` (failed).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Generation start time of an extended file 
     * @return StartTime Generation start time of an extended file
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Generation start time of an extended file
     * @param StartTime Generation start time of an extended file
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Generation end time of an extended file 
     * @return EndTime Generation end time of an extended file
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Generation end time of an extended file
     * @param EndTime Generation end time of an extended file
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Download address on the private network 
     * @return InternalAddr Download address on the private network
     */
    public String getInternalAddr() {
        return this.InternalAddr;
    }

    /**
     * Set Download address on the private network
     * @param InternalAddr Download address on the private network
     */
    public void setInternalAddr(String InternalAddr) {
        this.InternalAddr = InternalAddr;
    }

    /**
     * Get Download address on the public network 
     * @return ExternalAddr Download address on the public network
     */
    public String getExternalAddr() {
        return this.ExternalAddr;
    }

    /**
     * Set Download address on the public network
     * @param ExternalAddr Download address on the public network
     */
    public void setExternalAddr(String ExternalAddr) {
        this.ExternalAddr = ExternalAddr;
    }

    public Events() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Events(Events source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.InternalAddr != null) {
            this.InternalAddr = new String(source.InternalAddr);
        }
        if (source.ExternalAddr != null) {
            this.ExternalAddr = new String(source.ExternalAddr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InternalAddr", this.InternalAddr);
        this.setParamSimple(map, prefix + "ExternalAddr", this.ExternalAddr);

    }
}

