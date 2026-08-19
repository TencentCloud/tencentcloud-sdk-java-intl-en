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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLogAnalysisDownloadTaskRequest extends AbstractModel {

    /**
    * <p>Site ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Data service area. Available values:<ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding Mainland China).</li></ul>Note: If the service area of the site is "global availability zone", you need to query the data of mainland and overseas separately to obtain all data.</p>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>Start time, example value: 2020-04-29T00:00:00Z. The maximum span from the supported query start time to this day varies for different package versions. For details, see <a href="https://www.tencentcloud.com/document/product/1552/94165?from_cn_redirect=1#45435466-9103-4ff6-be22-e31717044fb2">Package Selection Comparison</a>.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time, for example, 2020-04-30T00:00:00Z. The time span from the start time to the end time per request is up to 31 days.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Log type. Value range: <ul><li> l7-access-logs: Layer 7 Access Logs;</li><li>web-attack: managed rule log.</li></ul>Defaults to l7-access-logs.</p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p><a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">Log match condition</a>. Maximum length 12KB.</p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>File format, available values: <ul><li>csv</li></ul>Defaults to csv.</p>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>Time sorting of raw logs. Available values: <ul><li>asc: ascending order;</li> <li>desc: descending order.</li></ul> Default is desc.</p>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
     * Get <p>Site ID.</p> 
     * @return ZoneId <p>Site ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Site ID.</p>
     * @param ZoneId <p>Site ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Data service area. Available values:<ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding Mainland China).</li></ul>Note: If the service area of the site is "global availability zone", you need to query the data of mainland and overseas separately to obtain all data.</p> 
     * @return Area <p>Data service area. Available values:<ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding Mainland China).</li></ul>Note: If the service area of the site is "global availability zone", you need to query the data of mainland and overseas separately to obtain all data.</p>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>Data service area. Available values:<ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding Mainland China).</li></ul>Note: If the service area of the site is "global availability zone", you need to query the data of mainland and overseas separately to obtain all data.</p>
     * @param Area <p>Data service area. Available values:<ul><li>mainland: within the Chinese mainland;</li><li>overseas: global (excluding Mainland China).</li></ul>Note: If the service area of the site is "global availability zone", you need to query the data of mainland and overseas separately to obtain all data.</p>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>Start time, example value: 2020-04-29T00:00:00Z. The maximum span from the supported query start time to this day varies for different package versions. For details, see <a href="https://www.tencentcloud.com/document/product/1552/94165?from_cn_redirect=1#45435466-9103-4ff6-be22-e31717044fb2">Package Selection Comparison</a>.</p> 
     * @return StartTime <p>Start time, example value: 2020-04-29T00:00:00Z. The maximum span from the supported query start time to this day varies for different package versions. For details, see <a href="https://www.tencentcloud.com/document/product/1552/94165?from_cn_redirect=1#45435466-9103-4ff6-be22-e31717044fb2">Package Selection Comparison</a>.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time, example value: 2020-04-29T00:00:00Z. The maximum span from the supported query start time to this day varies for different package versions. For details, see <a href="https://www.tencentcloud.com/document/product/1552/94165?from_cn_redirect=1#45435466-9103-4ff6-be22-e31717044fb2">Package Selection Comparison</a>.</p>
     * @param StartTime <p>Start time, example value: 2020-04-29T00:00:00Z. The maximum span from the supported query start time to this day varies for different package versions. For details, see <a href="https://www.tencentcloud.com/document/product/1552/94165?from_cn_redirect=1#45435466-9103-4ff6-be22-e31717044fb2">Package Selection Comparison</a>.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time, for example, 2020-04-30T00:00:00Z. The time span from the start time to the end time per request is up to 31 days.</p> 
     * @return EndTime <p>End time, for example, 2020-04-30T00:00:00Z. The time span from the start time to the end time per request is up to 31 days.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time, for example, 2020-04-30T00:00:00Z. The time span from the start time to the end time per request is up to 31 days.</p>
     * @param EndTime <p>End time, for example, 2020-04-30T00:00:00Z. The time span from the start time to the end time per request is up to 31 days.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Log type. Value range: <ul><li> l7-access-logs: Layer 7 Access Logs;</li><li>web-attack: managed rule log.</li></ul>Defaults to l7-access-logs.</p> 
     * @return LogType <p>Log type. Value range: <ul><li> l7-access-logs: Layer 7 Access Logs;</li><li>web-attack: managed rule log.</li></ul>Defaults to l7-access-logs.</p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>Log type. Value range: <ul><li> l7-access-logs: Layer 7 Access Logs;</li><li>web-attack: managed rule log.</li></ul>Defaults to l7-access-logs.</p>
     * @param LogType <p>Log type. Value range: <ul><li> l7-access-logs: Layer 7 Access Logs;</li><li>web-attack: managed rule log.</li></ul>Defaults to l7-access-logs.</p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p><a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">Log match condition</a>. Maximum length 12KB.</p> 
     * @return Condition <p><a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">Log match condition</a>. Maximum length 12KB.</p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p><a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">Log match condition</a>. Maximum length 12KB.</p>
     * @param Condition <p><a href="https://www.tencentcloud.com/document/product/1552/124662?from_cn_redirect=1">Log match condition</a>. Maximum length 12KB.</p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>File format, available values: <ul><li>csv</li></ul>Defaults to csv.</p> 
     * @return Format <p>File format, available values: <ul><li>csv</li></ul>Defaults to csv.</p>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>File format, available values: <ul><li>csv</li></ul>Defaults to csv.</p>
     * @param Format <p>File format, available values: <ul><li>csv</li></ul>Defaults to csv.</p>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>Time sorting of raw logs. Available values: <ul><li>asc: ascending order;</li> <li>desc: descending order.</li></ul> Default is desc.</p> 
     * @return Sort <p>Time sorting of raw logs. Available values: <ul><li>asc: ascending order;</li> <li>desc: descending order.</li></ul> Default is desc.</p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>Time sorting of raw logs. Available values: <ul><li>asc: ascending order;</li> <li>desc: descending order.</li></ul> Default is desc.</p>
     * @param Sort <p>Time sorting of raw logs. Available values: <ul><li>asc: ascending order;</li> <li>desc: descending order.</li></ul> Default is desc.</p>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    public CreateLogAnalysisDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLogAnalysisDownloadTaskRequest(CreateLogAnalysisDownloadTaskRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Sort", this.Sort);

    }
}

