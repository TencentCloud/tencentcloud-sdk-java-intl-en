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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplicationLog extends AbstractModel {

    /**
    * Resource type
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Path of the source resource
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Path of the destination resource
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Destination")
    @Expose
    private String Destination;

    /**
    * Synchronization status
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Start time
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Resource type
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ResourceType Resource type
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ResourceType Resource type
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Path of the source resource
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Source Path of the source resource
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Path of the source resource
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Source Path of the source resource
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Path of the destination resource
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Destination Path of the destination resource
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set Path of the destination resource
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Destination Path of the destination resource
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * Get Synchronization status
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Status Synchronization status
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Synchronization status
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Status Synchronization status
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Start time
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return StartTime Start time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param StartTime Start time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return EndTime End time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param EndTime End time
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ReplicationLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplicationLog(ReplicationLog source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Destination != null) {
            this.Destination = new String(source.Destination);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Destination", this.Destination);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

