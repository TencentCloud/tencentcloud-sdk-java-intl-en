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

public class DescribeRecordingRuleTaskRequest extends AbstractModel {

    /**
    * <p>Source metric topic id.</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Pagination offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Maximum number of entries per page. Default value: 20. Maximum value: 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <li>yamlId [Configuration ID of the associated yaml] for filtering, fuzzy matching. Type: String. Required: No</li> <li>taskName [Task name] for filtering, fuzzy matching. Type: String. Required: No</li> <li>taskId [Task ID] for filtering, fuzzy matching. Type: String. Required: No</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>Source metric topic id.</p> 
     * @return TopicId <p>Source metric topic id.</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Source metric topic id.</p>
     * @param TopicId <p>Source metric topic id.</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Pagination offset. Default value: 0.</p> 
     * @return Offset <p>Pagination offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Pagination offset. Default value: 0.</p>
     * @param Offset <p>Pagination offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Maximum number of entries per page. Default value: 20. Maximum value: 100.</p> 
     * @return Limit <p>Maximum number of entries per page. Default value: 20. Maximum value: 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Maximum number of entries per page. Default value: 20. Maximum value: 100.</p>
     * @param Limit <p>Maximum number of entries per page. Default value: 20. Maximum value: 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <li>yamlId [Configuration ID of the associated yaml] for filtering, fuzzy matching. Type: String. Required: No</li> <li>taskName [Task name] for filtering, fuzzy matching. Type: String. Required: No</li> <li>taskId [Task ID] for filtering, fuzzy matching. Type: String. Required: No</li> 
     * @return Filters <li>yamlId [Configuration ID of the associated yaml] for filtering, fuzzy matching. Type: String. Required: No</li> <li>taskName [Task name] for filtering, fuzzy matching. Type: String. Required: No</li> <li>taskId [Task ID] for filtering, fuzzy matching. Type: String. Required: No</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>yamlId [Configuration ID of the associated yaml] for filtering, fuzzy matching. Type: String. Required: No</li> <li>taskName [Task name] for filtering, fuzzy matching. Type: String. Required: No</li> <li>taskId [Task ID] for filtering, fuzzy matching. Type: String. Required: No</li>
     * @param Filters <li>yamlId [Configuration ID of the associated yaml] for filtering, fuzzy matching. Type: String. Required: No</li> <li>taskName [Task name] for filtering, fuzzy matching. Type: String. Required: No</li> <li>taskId [Task ID] for filtering, fuzzy matching. Type: String. Required: No</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRecordingRuleTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordingRuleTaskRequest(DescribeRecordingRuleTaskRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

