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

public class DescribeTableQualityDetailsRequest extends AbstractModel {

    /**
    * Statistics Date
    */
    @SerializedName("StatisticsDate")
    @Expose
    private Long StatisticsDate;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Pagination Index
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Page size
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Filter Parameters TableName, DatabaseId, DatabaseName, OwnerUserName
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sorting Parameters Sort order DESC or ASC, Table score sorting TableScore
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
    * Data source ID
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 1: Calculate by full dimension weight, 2: Calculate by configured dimension weight, 3: Do not calculate by dimension weight, default is 1
    */
    @SerializedName("ScoreType")
    @Expose
    private String ScoreType;

    /**
     * Get Statistics Date 
     * @return StatisticsDate Statistics Date
     */
    public Long getStatisticsDate() {
        return this.StatisticsDate;
    }

    /**
     * Set Statistics Date
     * @param StatisticsDate Statistics Date
     */
    public void setStatisticsDate(Long StatisticsDate) {
        this.StatisticsDate = StatisticsDate;
    }

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
     * Get Pagination Index 
     * @return PageNumber Pagination Index
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Pagination Index
     * @param PageNumber Pagination Index
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Page size 
     * @return PageSize Page size
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size
     * @param PageSize Page size
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Filter Parameters TableName, DatabaseId, DatabaseName, OwnerUserName 
     * @return Filters Filter Parameters TableName, DatabaseId, DatabaseName, OwnerUserName
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter Parameters TableName, DatabaseId, DatabaseName, OwnerUserName
     * @param Filters Filter Parameters TableName, DatabaseId, DatabaseName, OwnerUserName
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting Parameters Sort order DESC or ASC, Table score sorting TableScore 
     * @return OrderFields Sorting Parameters Sort order DESC or ASC, Table score sorting TableScore
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set Sorting Parameters Sort order DESC or ASC, Table score sorting TableScore
     * @param OrderFields Sorting Parameters Sort order DESC or ASC, Table score sorting TableScore
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get Data source ID 
     * @return DatasourceId Data source ID
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data source ID
     * @param DatasourceId Data source ID
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 1: Calculate by full dimension weight, 2: Calculate by configured dimension weight, 3: Do not calculate by dimension weight, default is 1 
     * @return ScoreType 1: Calculate by full dimension weight, 2: Calculate by configured dimension weight, 3: Do not calculate by dimension weight, default is 1
     */
    public String getScoreType() {
        return this.ScoreType;
    }

    /**
     * Set 1: Calculate by full dimension weight, 2: Calculate by configured dimension weight, 3: Do not calculate by dimension weight, default is 1
     * @param ScoreType 1: Calculate by full dimension weight, 2: Calculate by configured dimension weight, 3: Do not calculate by dimension weight, default is 1
     */
    public void setScoreType(String ScoreType) {
        this.ScoreType = ScoreType;
    }

    public DescribeTableQualityDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableQualityDetailsRequest(DescribeTableQualityDetailsRequest source) {
        if (source.StatisticsDate != null) {
            this.StatisticsDate = new Long(source.StatisticsDate);
        }
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
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.ScoreType != null) {
            this.ScoreType = new String(source.ScoreType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatisticsDate", this.StatisticsDate);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "ScoreType", this.ScoreType);

    }
}

