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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataSourceInfoListRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Page Number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Page number
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Filter condition (not supported yet)
    */
    @SerializedName("Filters")
    @Expose
    private Filter Filters;

    /**
    * Sorting Configuration
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField OrderFields;

    /**
    * Data Source Type, mandatory (e.g., MYSQL, DLC, etc.)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Data Source Name Filter
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Page Number 
     * @return PageNumber Page Number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page Number
     * @param PageNumber Page Number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Page number 
     * @return PageSize Page number
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page number
     * @param PageSize Page number
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Filter condition (not supported yet) 
     * @return Filters Filter condition (not supported yet)
     */
    public Filter getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter condition (not supported yet)
     * @param Filters Filter condition (not supported yet)
     */
    public void setFilters(Filter Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting Configuration 
     * @return OrderFields Sorting Configuration
     */
    public OrderField getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set Sorting Configuration
     * @param OrderFields Sorting Configuration
     */
    public void setOrderFields(OrderField OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get Data Source Type, mandatory (e.g., MYSQL, DLC, etc.) 
     * @return Type Data Source Type, mandatory (e.g., MYSQL, DLC, etc.)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Data Source Type, mandatory (e.g., MYSQL, DLC, etc.)
     * @param Type Data Source Type, mandatory (e.g., MYSQL, DLC, etc.)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Data Source Name Filter 
     * @return DatasourceName Data Source Name Filter
     */
    public String getDatasourceName() {
        return this.DatasourceName;
    }

    /**
     * Set Data Source Name Filter
     * @param DatasourceName Data Source Name Filter
     */
    public void setDatasourceName(String DatasourceName) {
        this.DatasourceName = DatasourceName;
    }

    public DescribeDataSourceInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataSourceInfoListRequest(DescribeDataSourceInfoListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Filters != null) {
            this.Filters = new Filter(source.Filters);
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField(source.OrderFields);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamObj(map, prefix + "Filters.", this.Filters);
        this.setParamObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);

    }
}

