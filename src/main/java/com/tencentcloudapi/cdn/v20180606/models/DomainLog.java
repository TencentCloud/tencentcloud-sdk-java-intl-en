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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainLog extends AbstractModel{

    /**
    * Starting time of the log package
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of the log package
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Log package download link
    */
    @SerializedName("LogPath")
    @Expose
    private String LogPath;

    /**
    * Acceleration region corresponding to the log package
`mainland`: Within the Chinese mainland
`overseas`: Outside the Chinese mainland
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Log package filename
    */
    @SerializedName("LogName")
    @Expose
    private String LogName;

    /**
     * Get Starting time of the log package 
     * @return StartTime Starting time of the log package
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Starting time of the log package
     * @param StartTime Starting time of the log package
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of the log package 
     * @return EndTime End time of the log package
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the log package
     * @param EndTime End time of the log package
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Log package download link 
     * @return LogPath Log package download link
     */
    public String getLogPath() {
        return this.LogPath;
    }

    /**
     * Set Log package download link
     * @param LogPath Log package download link
     */
    public void setLogPath(String LogPath) {
        this.LogPath = LogPath;
    }

    /**
     * Get Acceleration region corresponding to the log package
`mainland`: Within the Chinese mainland
`overseas`: Outside the Chinese mainland 
     * @return Area Acceleration region corresponding to the log package
`mainland`: Within the Chinese mainland
`overseas`: Outside the Chinese mainland
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Acceleration region corresponding to the log package
`mainland`: Within the Chinese mainland
`overseas`: Outside the Chinese mainland
     * @param Area Acceleration region corresponding to the log package
`mainland`: Within the Chinese mainland
`overseas`: Outside the Chinese mainland
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Log package filename 
     * @return LogName Log package filename
     */
    public String getLogName() {
        return this.LogName;
    }

    /**
     * Set Log package filename
     * @param LogName Log package filename
     */
    public void setLogName(String LogName) {
        this.LogName = LogName;
    }

    public DomainLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainLog(DomainLog source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LogPath != null) {
            this.LogPath = new String(source.LogPath);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.LogName != null) {
            this.LogName = new String(source.LogName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LogPath", this.LogPath);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "LogName", this.LogName);

    }
}

