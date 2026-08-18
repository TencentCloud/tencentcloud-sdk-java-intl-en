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

public class DescribeDashboardsRequest extends AbstractModel {

    /**
    * Page offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of entries per page. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * -dashboardId filter by [dashboard id], type: String, required: No.
-Example value: dashboard-522a5609-1f41-4b11-8086-5afd1d7574f5
-dashboardName: Filter by fuzzy search as dashboard name. Type: String. Required: No.
-Example value: Business dashboard
-dashboardRegion filter by dashboard region (compatible with legacy dashboards). This property for dashboards created via cloud API, type: String, required: No.
-See [Regions and Availability Zones](https://www.tencentcloud.com/document/product/614/18940?from_cn_redirect=1)
-Example: ap-guangzhou
- tagKey - String - Required: No - Filter by the tag key.
-Example value:
    ```
    "Filters":[
        {
            "Key": "tagKey",
            "Values": [
                "tag-key-test"
            ]
        }
    ]
    ```

-tag:tagKey Filter by [tag key-value pair]. Replace tagKey with a specific tag key. Type: String. Required: No.
-Refer to [Example 1](https://www.tencentcloud.com/document/api/614/95636?from_cn_redirect=1#4.-.E7.A4.BA.E4.BE.8B) for usage.
    ```
    "Filters": [
        {
            "Key": "tag:tag-key-test",
            "Values": [
                "12"
            ]
        }
    ]
    ```

Each request can have up to 10 Filters. The upper limit of Filter.Values is 100.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Filter is performed by topicId and regionId.
-topicId: Log topic id.
- Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-Example value: 439a5304-08f9-484b-9c4d-46ff57133816
- regionId
- 1: Guangzhou
-4: Shanghai
-5: Hong Kong (China)
- 7: Shanghai Finance
- 8: Beijing
-9: Singapore
- 11: Shenzhen Finance
- 15: Silicon Valley
- 16: Chengdu
- 17: Frankfurt
- 18: Seoul
- 19: Chongqing
- 22: Virginia
- 23: Bangkok
- 25: Tokyo
- 33: Nanjing
- 36: Tianjin
-39: Taipei (China)
- 46: Beijing Finance
-72: Jakarta
-74: São Paulo
-78: Shanghai Autonomous Driving Cloud

    */
    @SerializedName("TopicIdRegionFilter")
    @Expose
    private TopicIdAndRegion [] TopicIdRegionFilter;

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
     * Get Maximum number of entries per page. Default value: 20. Maximum value: 100. 
     * @return Limit Maximum number of entries per page. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of entries per page. Default value: 20. Maximum value: 100.
     * @param Limit Maximum number of entries per page. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get -dashboardId filter by [dashboard id], type: String, required: No.
-Example value: dashboard-522a5609-1f41-4b11-8086-5afd1d7574f5
-dashboardName: Filter by fuzzy search as dashboard name. Type: String. Required: No.
-Example value: Business dashboard
-dashboardRegion filter by dashboard region (compatible with legacy dashboards). This property for dashboards created via cloud API, type: String, required: No.
-See [Regions and Availability Zones](https://www.tencentcloud.com/document/product/614/18940?from_cn_redirect=1)
-Example: ap-guangzhou
- tagKey - String - Required: No - Filter by the tag key.
-Example value:
    ```
    "Filters":[
        {
            "Key": "tagKey",
            "Values": [
                "tag-key-test"
            ]
        }
    ]
    ```

-tag:tagKey Filter by [tag key-value pair]. Replace tagKey with a specific tag key. Type: String. Required: No.
-Refer to [Example 1](https://www.tencentcloud.com/document/api/614/95636?from_cn_redirect=1#4.-.E7.A4.BA.E4.BE.8B) for usage.
    ```
    "Filters": [
        {
            "Key": "tag:tag-key-test",
            "Values": [
                "12"
            ]
        }
    ]
    ```

Each request can have up to 10 Filters. The upper limit of Filter.Values is 100. 
     * @return Filters -dashboardId filter by [dashboard id], type: String, required: No.
-Example value: dashboard-522a5609-1f41-4b11-8086-5afd1d7574f5
-dashboardName: Filter by fuzzy search as dashboard name. Type: String. Required: No.
-Example value: Business dashboard
-dashboardRegion filter by dashboard region (compatible with legacy dashboards). This property for dashboards created via cloud API, type: String, required: No.
-See [Regions and Availability Zones](https://www.tencentcloud.com/document/product/614/18940?from_cn_redirect=1)
-Example: ap-guangzhou
- tagKey - String - Required: No - Filter by the tag key.
-Example value:
    ```
    "Filters":[
        {
            "Key": "tagKey",
            "Values": [
                "tag-key-test"
            ]
        }
    ]
    ```

-tag:tagKey Filter by [tag key-value pair]. Replace tagKey with a specific tag key. Type: String. Required: No.
-Refer to [Example 1](https://www.tencentcloud.com/document/api/614/95636?from_cn_redirect=1#4.-.E7.A4.BA.E4.BE.8B) for usage.
    ```
    "Filters": [
        {
            "Key": "tag:tag-key-test",
            "Values": [
                "12"
            ]
        }
    ]
    ```

Each request can have up to 10 Filters. The upper limit of Filter.Values is 100.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set -dashboardId filter by [dashboard id], type: String, required: No.
-Example value: dashboard-522a5609-1f41-4b11-8086-5afd1d7574f5
-dashboardName: Filter by fuzzy search as dashboard name. Type: String. Required: No.
-Example value: Business dashboard
-dashboardRegion filter by dashboard region (compatible with legacy dashboards). This property for dashboards created via cloud API, type: String, required: No.
-See [Regions and Availability Zones](https://www.tencentcloud.com/document/product/614/18940?from_cn_redirect=1)
-Example: ap-guangzhou
- tagKey - String - Required: No - Filter by the tag key.
-Example value:
    ```
    "Filters":[
        {
            "Key": "tagKey",
            "Values": [
                "tag-key-test"
            ]
        }
    ]
    ```

-tag:tagKey Filter by [tag key-value pair]. Replace tagKey with a specific tag key. Type: String. Required: No.
-Refer to [Example 1](https://www.tencentcloud.com/document/api/614/95636?from_cn_redirect=1#4.-.E7.A4.BA.E4.BE.8B) for usage.
    ```
    "Filters": [
        {
            "Key": "tag:tag-key-test",
            "Values": [
                "12"
            ]
        }
    ]
    ```

Each request can have up to 10 Filters. The upper limit of Filter.Values is 100.
     * @param Filters -dashboardId filter by [dashboard id], type: String, required: No.
-Example value: dashboard-522a5609-1f41-4b11-8086-5afd1d7574f5
-dashboardName: Filter by fuzzy search as dashboard name. Type: String. Required: No.
-Example value: Business dashboard
-dashboardRegion filter by dashboard region (compatible with legacy dashboards). This property for dashboards created via cloud API, type: String, required: No.
-See [Regions and Availability Zones](https://www.tencentcloud.com/document/product/614/18940?from_cn_redirect=1)
-Example: ap-guangzhou
- tagKey - String - Required: No - Filter by the tag key.
-Example value:
    ```
    "Filters":[
        {
            "Key": "tagKey",
            "Values": [
                "tag-key-test"
            ]
        }
    ]
    ```

-tag:tagKey Filter by [tag key-value pair]. Replace tagKey with a specific tag key. Type: String. Required: No.
-Refer to [Example 1](https://www.tencentcloud.com/document/api/614/95636?from_cn_redirect=1#4.-.E7.A4.BA.E4.BE.8B) for usage.
    ```
    "Filters": [
        {
            "Key": "tag:tag-key-test",
            "Values": [
                "12"
            ]
        }
    ]
    ```

Each request can have up to 10 Filters. The upper limit of Filter.Values is 100.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Filter is performed by topicId and regionId.
-topicId: Log topic id.
- Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-Example value: 439a5304-08f9-484b-9c4d-46ff57133816
- regionId
- 1: Guangzhou
-4: Shanghai
-5: Hong Kong (China)
- 7: Shanghai Finance
- 8: Beijing
-9: Singapore
- 11: Shenzhen Finance
- 15: Silicon Valley
- 16: Chengdu
- 17: Frankfurt
- 18: Seoul
- 19: Chongqing
- 22: Virginia
- 23: Bangkok
- 25: Tokyo
- 33: Nanjing
- 36: Tianjin
-39: Taipei (China)
- 46: Beijing Finance
-72: Jakarta
-74: São Paulo
-78: Shanghai Autonomous Driving Cloud
 
     * @return TopicIdRegionFilter Filter is performed by topicId and regionId.
-topicId: Log topic id.
- Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-Example value: 439a5304-08f9-484b-9c4d-46ff57133816
- regionId
- 1: Guangzhou
-4: Shanghai
-5: Hong Kong (China)
- 7: Shanghai Finance
- 8: Beijing
-9: Singapore
- 11: Shenzhen Finance
- 15: Silicon Valley
- 16: Chengdu
- 17: Frankfurt
- 18: Seoul
- 19: Chongqing
- 22: Virginia
- 23: Bangkok
- 25: Tokyo
- 33: Nanjing
- 36: Tianjin
-39: Taipei (China)
- 46: Beijing Finance
-72: Jakarta
-74: São Paulo
-78: Shanghai Autonomous Driving Cloud

     */
    public TopicIdAndRegion [] getTopicIdRegionFilter() {
        return this.TopicIdRegionFilter;
    }

    /**
     * Set Filter is performed by topicId and regionId.
-topicId: Log topic id.
- Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-Example value: 439a5304-08f9-484b-9c4d-46ff57133816
- regionId
- 1: Guangzhou
-4: Shanghai
-5: Hong Kong (China)
- 7: Shanghai Finance
- 8: Beijing
-9: Singapore
- 11: Shenzhen Finance
- 15: Silicon Valley
- 16: Chengdu
- 17: Frankfurt
- 18: Seoul
- 19: Chongqing
- 22: Virginia
- 23: Bangkok
- 25: Tokyo
- 33: Nanjing
- 36: Tianjin
-39: Taipei (China)
- 46: Beijing Finance
-72: Jakarta
-74: São Paulo
-78: Shanghai Autonomous Driving Cloud

     * @param TopicIdRegionFilter Filter is performed by topicId and regionId.
-topicId: Log topic id.
- Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
-Example value: 439a5304-08f9-484b-9c4d-46ff57133816
- regionId
- 1: Guangzhou
-4: Shanghai
-5: Hong Kong (China)
- 7: Shanghai Finance
- 8: Beijing
-9: Singapore
- 11: Shenzhen Finance
- 15: Silicon Valley
- 16: Chengdu
- 17: Frankfurt
- 18: Seoul
- 19: Chongqing
- 22: Virginia
- 23: Bangkok
- 25: Tokyo
- 33: Nanjing
- 36: Tianjin
-39: Taipei (China)
- 46: Beijing Finance
-72: Jakarta
-74: São Paulo
-78: Shanghai Autonomous Driving Cloud

     */
    public void setTopicIdRegionFilter(TopicIdAndRegion [] TopicIdRegionFilter) {
        this.TopicIdRegionFilter = TopicIdRegionFilter;
    }

    public DescribeDashboardsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDashboardsRequest(DescribeDashboardsRequest source) {
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
        if (source.TopicIdRegionFilter != null) {
            this.TopicIdRegionFilter = new TopicIdAndRegion[source.TopicIdRegionFilter.length];
            for (int i = 0; i < source.TopicIdRegionFilter.length; i++) {
                this.TopicIdRegionFilter[i] = new TopicIdAndRegion(source.TopicIdRegionFilter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "TopicIdRegionFilter.", this.TopicIdRegionFilter);

    }
}

