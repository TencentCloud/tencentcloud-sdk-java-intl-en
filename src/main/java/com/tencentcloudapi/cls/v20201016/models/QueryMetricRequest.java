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

public class QueryMetricRequest extends AbstractModel {

    /**
    * Queries statements; using PromQL syntax	
-Refer to the [Syntax Rules](https://www.tencentcloud.com/document/product/614/90334?from_cn_redirect=1) document
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Metric Topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Query time, Unix timestamp in seconds. When empty, it represents the current timestamp.

    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
     * Get Queries statements; using PromQL syntax	
-Refer to the [Syntax Rules](https://www.tencentcloud.com/document/product/614/90334?from_cn_redirect=1) document 
     * @return Query Queries statements; using PromQL syntax	
-Refer to the [Syntax Rules](https://www.tencentcloud.com/document/product/614/90334?from_cn_redirect=1) document
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Queries statements; using PromQL syntax	
-Refer to the [Syntax Rules](https://www.tencentcloud.com/document/product/614/90334?from_cn_redirect=1) document
     * @param Query Queries statements; using PromQL syntax	
-Refer to the [Syntax Rules](https://www.tencentcloud.com/document/product/614/90334?from_cn_redirect=1) document
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Metric Topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). 
     * @return TopicId Metric Topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Metric Topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     * @param TopicId Metric Topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Query time, Unix timestamp in seconds. When empty, it represents the current timestamp.
 
     * @return Time Query time, Unix timestamp in seconds. When empty, it represents the current timestamp.

     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set Query time, Unix timestamp in seconds. When empty, it represents the current timestamp.

     * @param Time Query time, Unix timestamp in seconds. When empty, it represents the current timestamp.

     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    public QueryMetricRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryMetricRequest(QueryMetricRequest source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

