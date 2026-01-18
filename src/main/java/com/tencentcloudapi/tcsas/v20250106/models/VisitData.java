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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VisitData extends AbstractModel {

    /**
    * Number of visits
    */
    @SerializedName("VisitCount")
    @Expose
    private Long VisitCount;

    /**
    * Average pages per device - visit_page_count / active_device_num
    */
    @SerializedName("AvgDeviceVisitDeep")
    @Expose
    private String AvgDeviceVisitDeep;

    /**
    * Pages per visit - visit_page_count / miniapp_open_num
    */
    @SerializedName("AvgCountVisitDeep")
    @Expose
    private String AvgCountVisitDeep;

    /**
    * Average visit duration - miniapp_total_duration / visit_page_count
    */
    @SerializedName("AvgPageVisitDuration")
    @Expose
    private String AvgPageVisitDuration;

    /**
    * Average visit duration per session
miniapp_total_duration/miniapp_open_num
    */
    @SerializedName("AvgCountVisitDuration")
    @Expose
    private String AvgCountVisitDuration;

    /**
    * Refresh time in YYYYMMDD format
    */
    @SerializedName("DataTime")
    @Expose
    private Long DataTime;

    /**
     * Get Number of visits 
     * @return VisitCount Number of visits
     */
    public Long getVisitCount() {
        return this.VisitCount;
    }

    /**
     * Set Number of visits
     * @param VisitCount Number of visits
     */
    public void setVisitCount(Long VisitCount) {
        this.VisitCount = VisitCount;
    }

    /**
     * Get Average pages per device - visit_page_count / active_device_num 
     * @return AvgDeviceVisitDeep Average pages per device - visit_page_count / active_device_num
     */
    public String getAvgDeviceVisitDeep() {
        return this.AvgDeviceVisitDeep;
    }

    /**
     * Set Average pages per device - visit_page_count / active_device_num
     * @param AvgDeviceVisitDeep Average pages per device - visit_page_count / active_device_num
     */
    public void setAvgDeviceVisitDeep(String AvgDeviceVisitDeep) {
        this.AvgDeviceVisitDeep = AvgDeviceVisitDeep;
    }

    /**
     * Get Pages per visit - visit_page_count / miniapp_open_num 
     * @return AvgCountVisitDeep Pages per visit - visit_page_count / miniapp_open_num
     */
    public String getAvgCountVisitDeep() {
        return this.AvgCountVisitDeep;
    }

    /**
     * Set Pages per visit - visit_page_count / miniapp_open_num
     * @param AvgCountVisitDeep Pages per visit - visit_page_count / miniapp_open_num
     */
    public void setAvgCountVisitDeep(String AvgCountVisitDeep) {
        this.AvgCountVisitDeep = AvgCountVisitDeep;
    }

    /**
     * Get Average visit duration - miniapp_total_duration / visit_page_count 
     * @return AvgPageVisitDuration Average visit duration - miniapp_total_duration / visit_page_count
     */
    public String getAvgPageVisitDuration() {
        return this.AvgPageVisitDuration;
    }

    /**
     * Set Average visit duration - miniapp_total_duration / visit_page_count
     * @param AvgPageVisitDuration Average visit duration - miniapp_total_duration / visit_page_count
     */
    public void setAvgPageVisitDuration(String AvgPageVisitDuration) {
        this.AvgPageVisitDuration = AvgPageVisitDuration;
    }

    /**
     * Get Average visit duration per session
miniapp_total_duration/miniapp_open_num 
     * @return AvgCountVisitDuration Average visit duration per session
miniapp_total_duration/miniapp_open_num
     */
    public String getAvgCountVisitDuration() {
        return this.AvgCountVisitDuration;
    }

    /**
     * Set Average visit duration per session
miniapp_total_duration/miniapp_open_num
     * @param AvgCountVisitDuration Average visit duration per session
miniapp_total_duration/miniapp_open_num
     */
    public void setAvgCountVisitDuration(String AvgCountVisitDuration) {
        this.AvgCountVisitDuration = AvgCountVisitDuration;
    }

    /**
     * Get Refresh time in YYYYMMDD format 
     * @return DataTime Refresh time in YYYYMMDD format
     */
    public Long getDataTime() {
        return this.DataTime;
    }

    /**
     * Set Refresh time in YYYYMMDD format
     * @param DataTime Refresh time in YYYYMMDD format
     */
    public void setDataTime(Long DataTime) {
        this.DataTime = DataTime;
    }

    public VisitData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VisitData(VisitData source) {
        if (source.VisitCount != null) {
            this.VisitCount = new Long(source.VisitCount);
        }
        if (source.AvgDeviceVisitDeep != null) {
            this.AvgDeviceVisitDeep = new String(source.AvgDeviceVisitDeep);
        }
        if (source.AvgCountVisitDeep != null) {
            this.AvgCountVisitDeep = new String(source.AvgCountVisitDeep);
        }
        if (source.AvgPageVisitDuration != null) {
            this.AvgPageVisitDuration = new String(source.AvgPageVisitDuration);
        }
        if (source.AvgCountVisitDuration != null) {
            this.AvgCountVisitDuration = new String(source.AvgCountVisitDuration);
        }
        if (source.DataTime != null) {
            this.DataTime = new Long(source.DataTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VisitCount", this.VisitCount);
        this.setParamSimple(map, prefix + "AvgDeviceVisitDeep", this.AvgDeviceVisitDeep);
        this.setParamSimple(map, prefix + "AvgCountVisitDeep", this.AvgCountVisitDeep);
        this.setParamSimple(map, prefix + "AvgPageVisitDuration", this.AvgPageVisitDuration);
        this.setParamSimple(map, prefix + "AvgCountVisitDuration", this.AvgCountVisitDuration);
        this.setParamSimple(map, prefix + "DataTime", this.DataTime);

    }
}

