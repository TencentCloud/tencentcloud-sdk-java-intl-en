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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecentPullInfo extends AbstractModel {

    /**
    * The URL of the file currently pulled.
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * The offset of the file currently pulled.
    */
    @SerializedName("OffsetTime")
    @Expose
    private Long OffsetTime;

    /**
    * The time when the offset is reported, in UTC format.
Example: 2020-07-23T03:20:39Z
Note: Beijing time is 8 hours ahead of UTC.
    */
    @SerializedName("ReportTime")
    @Expose
    private String ReportTime;

    /**
    * The number of times looped.
    */
    @SerializedName("LoopedTimes")
    @Expose
    private Long LoopedTimes;

    /**
     * Get The URL of the file currently pulled. 
     * @return FileUrl The URL of the file currently pulled.
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set The URL of the file currently pulled.
     * @param FileUrl The URL of the file currently pulled.
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get The offset of the file currently pulled. 
     * @return OffsetTime The offset of the file currently pulled.
     */
    public Long getOffsetTime() {
        return this.OffsetTime;
    }

    /**
     * Set The offset of the file currently pulled.
     * @param OffsetTime The offset of the file currently pulled.
     */
    public void setOffsetTime(Long OffsetTime) {
        this.OffsetTime = OffsetTime;
    }

    /**
     * Get The time when the offset is reported, in UTC format.
Example: 2020-07-23T03:20:39Z
Note: Beijing time is 8 hours ahead of UTC. 
     * @return ReportTime The time when the offset is reported, in UTC format.
Example: 2020-07-23T03:20:39Z
Note: Beijing time is 8 hours ahead of UTC.
     */
    public String getReportTime() {
        return this.ReportTime;
    }

    /**
     * Set The time when the offset is reported, in UTC format.
Example: 2020-07-23T03:20:39Z
Note: Beijing time is 8 hours ahead of UTC.
     * @param ReportTime The time when the offset is reported, in UTC format.
Example: 2020-07-23T03:20:39Z
Note: Beijing time is 8 hours ahead of UTC.
     */
    public void setReportTime(String ReportTime) {
        this.ReportTime = ReportTime;
    }

    /**
     * Get The number of times looped. 
     * @return LoopedTimes The number of times looped.
     */
    public Long getLoopedTimes() {
        return this.LoopedTimes;
    }

    /**
     * Set The number of times looped.
     * @param LoopedTimes The number of times looped.
     */
    public void setLoopedTimes(Long LoopedTimes) {
        this.LoopedTimes = LoopedTimes;
    }

    public RecentPullInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecentPullInfo(RecentPullInfo source) {
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.OffsetTime != null) {
            this.OffsetTime = new Long(source.OffsetTime);
        }
        if (source.ReportTime != null) {
            this.ReportTime = new String(source.ReportTime);
        }
        if (source.LoopedTimes != null) {
            this.LoopedTimes = new Long(source.LoopedTimes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "OffsetTime", this.OffsetTime);
        this.setParamSimple(map, prefix + "ReportTime", this.ReportTime);
        this.setParamSimple(map, prefix + "LoopedTimes", this.LoopedTimes);

    }
}

