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

public class DescribeConfigsRequest extends AbstractModel {

    /**
    * configName
-Filter by [collection configuration name] using fuzzy matching.
-Type: String
-Required: No
-Example: test-config.

configId
-Filter by [collection configuration ID].
-Type: String
-Required: No
-Example: 3581a3be-aa41-423b-995a-54ec84da6264

topicId
- Filter by [log topic].
-Type: String
-Required: No
-Example: 3b83f9d6-3a4d-47f9-9b7f-285c868b2f9a
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).

The maximum number of Filters per request is 10, and the maximum for Filter.Values is 5.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Page offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of entries per page. Default value: 20. Maximum value: 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get configName
-Filter by [collection configuration name] using fuzzy matching.
-Type: String
-Required: No
-Example: test-config.

configId
-Filter by [collection configuration ID].
-Type: String
-Required: No
-Example: 3581a3be-aa41-423b-995a-54ec84da6264

topicId
- Filter by [log topic].
-Type: String
-Required: No
-Example: 3b83f9d6-3a4d-47f9-9b7f-285c868b2f9a
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).

The maximum number of Filters per request is 10, and the maximum for Filter.Values is 5. 
     * @return Filters configName
-Filter by [collection configuration name] using fuzzy matching.
-Type: String
-Required: No
-Example: test-config.

configId
-Filter by [collection configuration ID].
-Type: String
-Required: No
-Example: 3581a3be-aa41-423b-995a-54ec84da6264

topicId
- Filter by [log topic].
-Type: String
-Required: No
-Example: 3b83f9d6-3a4d-47f9-9b7f-285c868b2f9a
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).

The maximum number of Filters per request is 10, and the maximum for Filter.Values is 5.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set configName
-Filter by [collection configuration name] using fuzzy matching.
-Type: String
-Required: No
-Example: test-config.

configId
-Filter by [collection configuration ID].
-Type: String
-Required: No
-Example: 3581a3be-aa41-423b-995a-54ec84da6264

topicId
- Filter by [log topic].
-Type: String
-Required: No
-Example: 3b83f9d6-3a4d-47f9-9b7f-285c868b2f9a
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).

The maximum number of Filters per request is 10, and the maximum for Filter.Values is 5.
     * @param Filters configName
-Filter by [collection configuration name] using fuzzy matching.
-Type: String
-Required: No
-Example: test-config.

configId
-Filter by [collection configuration ID].
-Type: String
-Required: No
-Example: 3581a3be-aa41-423b-995a-54ec84da6264

topicId
- Filter by [log topic].
-Type: String
-Required: No
-Example: 3b83f9d6-3a4d-47f9-9b7f-285c868b2f9a
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).

The maximum number of Filters per request is 10, and the maximum for Filter.Values is 5.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Page offset. Default value: 0 
     * @return Offset Page offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset. Default value: 0
     * @param Offset Page offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of entries per page. Default value: 20. Maximum value: 100 
     * @return Limit Maximum number of entries per page. Default value: 20. Maximum value: 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of entries per page. Default value: 20. Maximum value: 100
     * @param Limit Maximum number of entries per page. Default value: 20. Maximum value: 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigsRequest(DescribeConfigsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

