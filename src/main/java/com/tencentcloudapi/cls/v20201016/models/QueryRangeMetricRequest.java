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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryRangeMetricRequest extends AbstractModel {

    /**
    * Metric Topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Queries statements; using PromQL syntax
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Queries start time; unix timestamp in seconds
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * Queries end time; unix timestamp in seconds
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
    * Queries time interval, in seconds
    */
    @SerializedName("Step")
    @Expose
    private Long Step;

    /**
     * Get Metric Topic ID 
     * @return TopicId Metric Topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Metric Topic ID
     * @param TopicId Metric Topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Queries statements; using PromQL syntax 
     * @return Query Queries statements; using PromQL syntax
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Queries statements; using PromQL syntax
     * @param Query Queries statements; using PromQL syntax
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Queries start time; unix timestamp in seconds 
     * @return Start Queries start time; unix timestamp in seconds
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set Queries start time; unix timestamp in seconds
     * @param Start Queries start time; unix timestamp in seconds
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get Queries end time; unix timestamp in seconds 
     * @return End Queries end time; unix timestamp in seconds
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set Queries end time; unix timestamp in seconds
     * @param End Queries end time; unix timestamp in seconds
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    /**
     * Get Queries time interval, in seconds 
     * @return Step Queries time interval, in seconds
     */
    public Long getStep() {
        return this.Step;
    }

    /**
     * Set Queries time interval, in seconds
     * @param Step Queries time interval, in seconds
     */
    public void setStep(Long Step) {
        this.Step = Step;
    }

    public QueryRangeMetricRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryRangeMetricRequest(QueryRangeMetricRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.End != null) {
            this.End = new Long(source.End);
        }
        if (source.Step != null) {
            this.Step = new Long(source.Step);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);
        this.setParamSimple(map, prefix + "Step", this.Step);

    }
}

