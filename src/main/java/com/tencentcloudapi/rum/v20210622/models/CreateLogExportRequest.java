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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLogExportRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Log export start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Log export end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Log export search statement
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Number of logs to be exported. Maximum value: 10 million
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Exported log sorting order by time. Valid values: asc: ascending; desc: descending. Default value: desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Exported log data format. Valid values: json, csv. Default value: json
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get Project ID 
     * @return ID Project ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Project ID
     * @param ID Project ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Log export start time 
     * @return StartTime Log export start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Log export start time
     * @param StartTime Log export start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Log export end time 
     * @return EndTime Log export end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Log export end time
     * @param EndTime Log export end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Log export search statement 
     * @return Query Log export search statement
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Log export search statement
     * @param Query Log export search statement
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Number of logs to be exported. Maximum value: 10 million 
     * @return Count Number of logs to be exported. Maximum value: 10 million
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of logs to be exported. Maximum value: 10 million
     * @param Count Number of logs to be exported. Maximum value: 10 million
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Exported log sorting order by time. Valid values: asc: ascending; desc: descending. Default value: desc 
     * @return Order Exported log sorting order by time. Valid values: asc: ascending; desc: descending. Default value: desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Exported log sorting order by time. Valid values: asc: ascending; desc: descending. Default value: desc
     * @param Order Exported log sorting order by time. Valid values: asc: ascending; desc: descending. Default value: desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Exported log data format. Valid values: json, csv. Default value: json 
     * @return Format Exported log data format. Valid values: json, csv. Default value: json
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Exported log data format. Valid values: json, csv. Default value: json
     * @param Format Exported log data format. Valid values: json, csv. Default value: json
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
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

