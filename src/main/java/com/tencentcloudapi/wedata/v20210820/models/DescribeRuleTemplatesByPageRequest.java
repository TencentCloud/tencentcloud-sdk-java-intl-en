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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRuleTemplatesByPageRequest extends AbstractModel {

    /**
    * Current Page
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of records per page
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Workspace ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Universal Sort Field
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
    * Universal Filter Criteria
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Current Page 
     * @return PageNumber Current Page
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Current Page
     * @param PageNumber Current Page
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of records per page 
     * @return PageSize Number of records per page
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of records per page
     * @param PageSize Number of records per page
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Workspace ID 
     * @return ProjectId Workspace ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Workspace ID
     * @param ProjectId Workspace ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Universal Sort Field 
     * @return OrderFields Universal Sort Field
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set Universal Sort Field
     * @param OrderFields Universal Sort Field
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get Universal Filter Criteria 
     * @return Filters Universal Filter Criteria
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Universal Filter Criteria
     * @param Filters Universal Filter Criteria
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRuleTemplatesByPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRuleTemplatesByPageRequest(DescribeRuleTemplatesByPageRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
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
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

