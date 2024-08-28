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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLogExportRequest extends AbstractModel {

    /**
    * Number of logs exported. The maximum value is 50 million.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Start time of log export, with a timestamp in milliseconds
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time of log export, with a timestamp in milliseconds
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Retrieval statements for log export, and [SQL statements] are not supported
    */
    @SerializedName("QueryString")
    @Expose
    private String QueryString;

    /**
    * Sorting for log export time. Valid values are asc and desc, and the default value is desc.
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * Data format for exported log. Valid values are json an csv, the default value is json.
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get Number of logs exported. The maximum value is 50 million. 
     * @return Count Number of logs exported. The maximum value is 50 million.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of logs exported. The maximum value is 50 million.
     * @param Count Number of logs exported. The maximum value is 50 million.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Start time of log export, with a timestamp in milliseconds 
     * @return StartTime Start time of log export, with a timestamp in milliseconds
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of log export, with a timestamp in milliseconds
     * @param StartTime Start time of log export, with a timestamp in milliseconds
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of log export, with a timestamp in milliseconds 
     * @return EndTime End time of log export, with a timestamp in milliseconds
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of log export, with a timestamp in milliseconds
     * @param EndTime End time of log export, with a timestamp in milliseconds
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Retrieval statements for log export, and [SQL statements] are not supported 
     * @return QueryString Retrieval statements for log export, and [SQL statements] are not supported
     */
    public String getQueryString() {
        return this.QueryString;
    }

    /**
     * Set Retrieval statements for log export, and [SQL statements] are not supported
     * @param QueryString Retrieval statements for log export, and [SQL statements] are not supported
     */
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    /**
     * Get Sorting for log export time. Valid values are asc and desc, and the default value is desc. 
     * @return Sort Sorting for log export time. Valid values are asc and desc, and the default value is desc.
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting for log export time. Valid values are asc and desc, and the default value is desc.
     * @param Sort Sorting for log export time. Valid values are asc and desc, and the default value is desc.
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Data format for exported log. Valid values are json an csv, the default value is json. 
     * @return Format Data format for exported log. Valid values are json an csv, the default value is json.
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Data format for exported log. Valid values are json an csv, the default value is json.
     * @param Format Data format for exported log. Valid values are json an csv, the default value is json.
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public CreateLogExportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLogExportRequest(CreateLogExportRequest source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.QueryString != null) {
            this.QueryString = new String(source.QueryString);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "QueryString", this.QueryString);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

