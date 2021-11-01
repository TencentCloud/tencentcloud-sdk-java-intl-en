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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateExportRequest extends AbstractModel{

    /**
    * Log topic
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

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
    * Start time of the log to be exported, which is a timestamp in milliseconds
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * End time of the log to be exported, which is a timestamp in milliseconds
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * Exported log sorting order by time. Valid values: `asc`: ascending; `desc`: descending. Default value: `desc`
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Exported log data format. Valid values: `json`, `csv`. Default value: `json`
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get Log topic 
     * @return TopicId Log topic
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic
     * @param TopicId Log topic
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
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
     * Get Start time of the log to be exported, which is a timestamp in milliseconds 
     * @return From Start time of the log to be exported, which is a timestamp in milliseconds
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set Start time of the log to be exported, which is a timestamp in milliseconds
     * @param From Start time of the log to be exported, which is a timestamp in milliseconds
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get End time of the log to be exported, which is a timestamp in milliseconds 
     * @return To End time of the log to be exported, which is a timestamp in milliseconds
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set End time of the log to be exported, which is a timestamp in milliseconds
     * @param To End time of the log to be exported, which is a timestamp in milliseconds
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get Exported log sorting order by time. Valid values: `asc`: ascending; `desc`: descending. Default value: `desc` 
     * @return Order Exported log sorting order by time. Valid values: `asc`: ascending; `desc`: descending. Default value: `desc`
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Exported log sorting order by time. Valid values: `asc`: ascending; `desc`: descending. Default value: `desc`
     * @param Order Exported log sorting order by time. Valid values: `asc`: ascending; `desc`: descending. Default value: `desc`
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Exported log data format. Valid values: `json`, `csv`. Default value: `json` 
     * @return Format Exported log data format. Valid values: `json`, `csv`. Default value: `json`
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Exported log data format. Valid values: `json`, `csv`. Default value: `json`
     * @param Format Exported log data format. Valid values: `json`, `csv`. Default value: `json`
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public CreateExportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateExportRequest(CreateExportRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
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
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

