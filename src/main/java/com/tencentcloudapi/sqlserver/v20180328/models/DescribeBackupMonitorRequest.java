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

public class DescribeBackupMonitorRequest extends AbstractModel {

    /**
    * Sets the start time for querying backup space usage details.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of backup space usage.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Backup trend query type. local - local backup; cross - cross-region backup.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Sets the start time for querying backup space usage details. 
     * @return StartTime Sets the start time for querying backup space usage details.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Sets the start time for querying backup space usage details.
     * @param StartTime Sets the start time for querying backup space usage details.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of backup space usage. 
     * @return EndTime End time of backup space usage.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of backup space usage.
     * @param EndTime End time of backup space usage.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Backup trend query type. local - local backup; cross - cross-region backup. 
     * @return Type Backup trend query type. local - local backup; cross - cross-region backup.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Backup trend query type. local - local backup; cross - cross-region backup.
     * @param Type Backup trend query type. local - local backup; cross - cross-region backup.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeBackupMonitorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupMonitorRequest(DescribeBackupMonitorRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

