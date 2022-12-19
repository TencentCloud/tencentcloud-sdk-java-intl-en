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

public class DescribeLogHistogramRequest extends AbstractModel{

    /**
    * ID of the log topic to be queried
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Start time of the log to be queried, which is a Unix timestamp in milliseconds
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * End time of the log to be queried, which is a Unix timestamp in milliseconds
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * Query statement
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Interval in milliseconds. Condition: (To – From) / Interval ≤ 200
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
     * Get ID of the log topic to be queried 
     * @return TopicId ID of the log topic to be queried
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set ID of the log topic to be queried
     * @param TopicId ID of the log topic to be queried
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Start time of the log to be queried, which is a Unix timestamp in milliseconds 
     * @return From Start time of the log to be queried, which is a Unix timestamp in milliseconds
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set Start time of the log to be queried, which is a Unix timestamp in milliseconds
     * @param From Start time of the log to be queried, which is a Unix timestamp in milliseconds
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get End time of the log to be queried, which is a Unix timestamp in milliseconds 
     * @return To End time of the log to be queried, which is a Unix timestamp in milliseconds
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set End time of the log to be queried, which is a Unix timestamp in milliseconds
     * @param To End time of the log to be queried, which is a Unix timestamp in milliseconds
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get Query statement 
     * @return Query Query statement
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query statement
     * @param Query Query statement
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Interval in milliseconds. Condition: (To – From) / Interval ≤ 200 
     * @return Interval Interval in milliseconds. Condition: (To – From) / Interval ≤ 200
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Interval in milliseconds. Condition: (To – From) / Interval ≤ 200
     * @param Interval Interval in milliseconds. Condition: (To – From) / Interval ≤ 200
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    public DescribeLogHistogramRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogHistogramRequest(DescribeLogHistogramRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

