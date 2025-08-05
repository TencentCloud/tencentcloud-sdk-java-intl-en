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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJustInTimeTranscodeTemplatesRequest extends AbstractModel {

    /**
    * Specifies the site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The maximum number of Filters is 20. the upper limit for Filters.Values is 20. if this parameter is left empty, it returns the authorized just-in-time transcoding templates in the current ZoneId by default. detailed filter criteria: <li>template-name: filter by template name in batch. example: mytemplate;</li> <li>template-type: filter by template type in batch. example: preset or custom.</li> <li>template-id: filter by template id in batch. example: C1LZ7982VgTpYhJ7M.</li> empty by default.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sorting field. valid values: <li>createTime: template creation time.</li> default value: createTime.
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * Sorting method. valid values: <li>`asc`: ascending order;</li><li>`desc`: descending order.</li> default value: `desc`.
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * Paging offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned entries. default value: 20. maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Specifies the site ID. 
     * @return ZoneId Specifies the site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Specifies the site ID.
     * @param ZoneId Specifies the site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The maximum number of Filters is 20. the upper limit for Filters.Values is 20. if this parameter is left empty, it returns the authorized just-in-time transcoding templates in the current ZoneId by default. detailed filter criteria: <li>template-name: filter by template name in batch. example: mytemplate;</li> <li>template-type: filter by template type in batch. example: preset or custom.</li> <li>template-id: filter by template id in batch. example: C1LZ7982VgTpYhJ7M.</li> empty by default. 
     * @return Filters The maximum number of Filters is 20. the upper limit for Filters.Values is 20. if this parameter is left empty, it returns the authorized just-in-time transcoding templates in the current ZoneId by default. detailed filter criteria: <li>template-name: filter by template name in batch. example: mytemplate;</li> <li>template-type: filter by template type in batch. example: preset or custom.</li> <li>template-id: filter by template id in batch. example: C1LZ7982VgTpYhJ7M.</li> empty by default.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set The maximum number of Filters is 20. the upper limit for Filters.Values is 20. if this parameter is left empty, it returns the authorized just-in-time transcoding templates in the current ZoneId by default. detailed filter criteria: <li>template-name: filter by template name in batch. example: mytemplate;</li> <li>template-type: filter by template type in batch. example: preset or custom.</li> <li>template-id: filter by template id in batch. example: C1LZ7982VgTpYhJ7M.</li> empty by default.
     * @param Filters The maximum number of Filters is 20. the upper limit for Filters.Values is 20. if this parameter is left empty, it returns the authorized just-in-time transcoding templates in the current ZoneId by default. detailed filter criteria: <li>template-name: filter by template name in batch. example: mytemplate;</li> <li>template-type: filter by template type in batch. example: preset or custom.</li> <li>template-id: filter by template id in batch. example: C1LZ7982VgTpYhJ7M.</li> empty by default.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting field. valid values: <li>createTime: template creation time.</li> default value: createTime. 
     * @return SortBy Sorting field. valid values: <li>createTime: template creation time.</li> default value: createTime.
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sorting field. valid values: <li>createTime: template creation time.</li> default value: createTime.
     * @param SortBy Sorting field. valid values: <li>createTime: template creation time.</li> default value: createTime.
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get Sorting method. valid values: <li>`asc`: ascending order;</li><li>`desc`: descending order.</li> default value: `desc`. 
     * @return SortOrder Sorting method. valid values: <li>`asc`: ascending order;</li><li>`desc`: descending order.</li> default value: `desc`.
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set Sorting method. valid values: <li>`asc`: ascending order;</li><li>`desc`: descending order.</li> default value: `desc`.
     * @param SortOrder Sorting method. valid values: <li>`asc`: ascending order;</li><li>`desc`: descending order.</li> default value: `desc`.
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get Paging offset. Default value: 0. 
     * @return Offset Paging offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging offset. Default value: 0.
     * @param Offset Paging offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned entries. default value: 20. maximum value: 1000. 
     * @return Limit Number of returned entries. default value: 20. maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. default value: 20. maximum value: 1000.
     * @param Limit Number of returned entries. default value: 20. maximum value: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeJustInTimeTranscodeTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJustInTimeTranscodeTemplatesRequest(DescribeJustInTimeTranscodeTemplatesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

