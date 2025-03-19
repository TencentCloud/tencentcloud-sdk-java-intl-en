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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectsRequest extends AbstractModel {

    /**
    * Offset. Default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returns. Default value is 20, maximum is 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Array of Project ID.
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * Project name.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Column for sorting.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Whether in ascending order.
    */
    @SerializedName("Ascend")
    @Expose
    private Boolean Ascend;

    /**
    * Array of Tags.
    */
    @SerializedName("TagFilters")
    @Expose
    private TagSpec [] TagFilters;

    /**
     * Get Offset. Default value is 0. 
     * @return Offset Offset. Default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value is 0.
     * @param Offset Offset. Default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returns. Default value is 20, maximum is 100 
     * @return Limit Number of returns. Default value is 20, maximum is 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returns. Default value is 20, maximum is 100
     * @param Limit Number of returns. Default value is 20, maximum is 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Array of Project ID. 
     * @return ProjectIds Array of Project ID.
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Array of Project ID.
     * @param ProjectIds Array of Project ID.
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Project name. 
     * @return ProjectName Project name.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name.
     * @param ProjectName Project name.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Column for sorting. 
     * @return OrderBy Column for sorting.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Column for sorting.
     * @param OrderBy Column for sorting.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Whether in ascending order. 
     * @return Ascend Whether in ascending order.
     */
    public Boolean getAscend() {
        return this.Ascend;
    }

    /**
     * Set Whether in ascending order.
     * @param Ascend Whether in ascending order.
     */
    public void setAscend(Boolean Ascend) {
        this.Ascend = Ascend;
    }

    /**
     * Get Array of Tags. 
     * @return TagFilters Array of Tags.
     */
    public TagSpec [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set Array of Tags.
     * @param TagFilters Array of Tags.
     */
    public void setTagFilters(TagSpec [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    public DescribeProjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectsRequest(DescribeProjectsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Ascend != null) {
            this.Ascend = new Boolean(source.Ascend);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagSpec[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagSpec(source.TagFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Ascend", this.Ascend);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);

    }
}

