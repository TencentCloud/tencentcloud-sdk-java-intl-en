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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopicListRequest extends AbstractModel {

    /**
    * TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Tag filter
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * Filtering condition list. See the description of the API using this parameter for the usage method.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Starting position of the query. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of queried results. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Queries subscribed topics by consumer group.
    */
    @SerializedName("FromGroup")
    @Expose
    private String FromGroup;

    /**
     * Get TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console. 
     * @return InstanceId TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console.
     * @param InstanceId TDMQ RocketMQ instance ID. It can be obtained from the API [DescribeFusionInstanceList](https://www.tencentcloud.com/document/api/1493/106745?from_cn_redirect=1) or the console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Tag filter 
     * @return TagFilters Tag filter
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set Tag filter
     * @param TagFilters Tag filter
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get Filtering condition list. See the description of the API using this parameter for the usage method. 
     * @return Filters Filtering condition list. See the description of the API using this parameter for the usage method.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering condition list. See the description of the API using this parameter for the usage method.
     * @param Filters Filtering condition list. See the description of the API using this parameter for the usage method.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Starting position of the query. Default value: 0. 
     * @return Offset Starting position of the query. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting position of the query. Default value: 0.
     * @param Offset Starting position of the query. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of queried results. Default value: 20. 
     * @return Limit Maximum number of queried results. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of queried results. Default value: 20.
     * @param Limit Maximum number of queried results. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Queries subscribed topics by consumer group. 
     * @return FromGroup Queries subscribed topics by consumer group.
     */
    public String getFromGroup() {
        return this.FromGroup;
    }

    /**
     * Set Queries subscribed topics by consumer group.
     * @param FromGroup Queries subscribed topics by consumer group.
     */
    public void setFromGroup(String FromGroup) {
        this.FromGroup = FromGroup;
    }

    public DescribeTopicListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopicListRequest(DescribeTopicListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
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
        if (source.FromGroup != null) {
            this.FromGroup = new String(source.FromGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FromGroup", this.FromGroup);

    }
}

