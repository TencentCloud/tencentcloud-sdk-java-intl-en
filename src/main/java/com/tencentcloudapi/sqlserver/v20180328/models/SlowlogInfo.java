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

public class SlowlogInfo extends AbstractModel {

    /**
    * Unique ID of slow query log file
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * File generation start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * File generation end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * File size in KB
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Number of logs in file
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Download address for private network
    */
    @SerializedName("InternalAddr")
    @Expose
    private String InternalAddr;

    /**
    * Download address for public network
    */
    @SerializedName("ExternalAddr")
    @Expose
    private String ExternalAddr;

    /**
    * Status (1: success, 2: failure)
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Unique ID of slow query log file 
     * @return Id Unique ID of slow query log file
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique ID of slow query log file
     * @param Id Unique ID of slow query log file
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get File generation start time 
     * @return StartTime File generation start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set File generation start time
     * @param StartTime File generation start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get File generation end time 
     * @return EndTime File generation end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set File generation end time
     * @param EndTime File generation end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get File size in KB 
     * @return Size File size in KB
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set File size in KB
     * @param Size File size in KB
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Number of logs in file 
     * @return Count Number of logs in file
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of logs in file
     * @param Count Number of logs in file
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Download address for private network 
     * @return InternalAddr Download address for private network
     */
    public String getInternalAddr() {
        return this.InternalAddr;
    }

    /**
     * Set Download address for private network
     * @param InternalAddr Download address for private network
     */
    public void setInternalAddr(String InternalAddr) {
        this.InternalAddr = InternalAddr;
    }

    /**
     * Get Download address for public network 
     * @return ExternalAddr Download address for public network
     */
    public String getExternalAddr() {
        return this.ExternalAddr;
    }

    /**
     * Set Download address for public network
     * @param ExternalAddr Download address for public network
     */
    public void setExternalAddr(String ExternalAddr) {
        this.ExternalAddr = ExternalAddr;
    }

    /**
     * Get Status (1: success, 2: failure)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status Status (1: success, 2: failure)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status (1: success, 2: failure)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status Status (1: success, 2: failure)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SlowlogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowlogInfo(SlowlogInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.InternalAddr != null) {
            this.InternalAddr = new String(source.InternalAddr);
        }
        if (source.ExternalAddr != null) {
            this.ExternalAddr = new String(source.ExternalAddr);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "InternalAddr", this.InternalAddr);
        this.setParamSimple(map, prefix + "ExternalAddr", this.ExternalAddr);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

