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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopSpaceSchemaTimeSeriesRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Number of returned top databases. Maximum value: `100`. Default value: `20`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Field used to sort top databases. Valid values: `DataLength`, `IndexLength`, `TotalLength`, `DataFree`, `FragRatio`, `TableRows`, `PhysicalFileSize` (supported only by TencentDB for MySQL instances). For TencentDB for MySQL instances, the default value is `PhysicalFileSize`. For other database instances, the default value is `TotalLength`.
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * Start date, such as "2021-01-01". It can be as early as 29 days before the current date and is 6 days before the end date by default.
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * End date, such as "2021-01-01". It can be as early as 29 days before the current date and is the current date by default.
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Number of returned top databases. Maximum value: `100`. Default value: `20`. 
     * @return Limit Number of returned top databases. Maximum value: `100`. Default value: `20`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned top databases. Maximum value: `100`. Default value: `20`.
     * @param Limit Number of returned top databases. Maximum value: `100`. Default value: `20`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Field used to sort top databases. Valid values: `DataLength`, `IndexLength`, `TotalLength`, `DataFree`, `FragRatio`, `TableRows`, `PhysicalFileSize` (supported only by TencentDB for MySQL instances). For TencentDB for MySQL instances, the default value is `PhysicalFileSize`. For other database instances, the default value is `TotalLength`. 
     * @return SortBy Field used to sort top databases. Valid values: `DataLength`, `IndexLength`, `TotalLength`, `DataFree`, `FragRatio`, `TableRows`, `PhysicalFileSize` (supported only by TencentDB for MySQL instances). For TencentDB for MySQL instances, the default value is `PhysicalFileSize`. For other database instances, the default value is `TotalLength`.
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Field used to sort top databases. Valid values: `DataLength`, `IndexLength`, `TotalLength`, `DataFree`, `FragRatio`, `TableRows`, `PhysicalFileSize` (supported only by TencentDB for MySQL instances). For TencentDB for MySQL instances, the default value is `PhysicalFileSize`. For other database instances, the default value is `TotalLength`.
     * @param SortBy Field used to sort top databases. Valid values: `DataLength`, `IndexLength`, `TotalLength`, `DataFree`, `FragRatio`, `TableRows`, `PhysicalFileSize` (supported only by TencentDB for MySQL instances). For TencentDB for MySQL instances, the default value is `PhysicalFileSize`. For other database instances, the default value is `TotalLength`.
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get Start date, such as "2021-01-01". It can be as early as 29 days before the current date and is 6 days before the end date by default. 
     * @return StartDate Start date, such as "2021-01-01". It can be as early as 29 days before the current date and is 6 days before the end date by default.
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set Start date, such as "2021-01-01". It can be as early as 29 days before the current date and is 6 days before the end date by default.
     * @param StartDate Start date, such as "2021-01-01". It can be as early as 29 days before the current date and is 6 days before the end date by default.
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get End date, such as "2021-01-01". It can be as early as 29 days before the current date and is the current date by default. 
     * @return EndDate End date, such as "2021-01-01". It can be as early as 29 days before the current date and is the current date by default.
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set End date, such as "2021-01-01". It can be as early as 29 days before the current date and is the current date by default.
     * @param EndDate End date, such as "2021-01-01". It can be as early as 29 days before the current date and is the current date by default.
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`. 
     * @return Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     * @param Product Service type. Valid values: `mysql` (TencentDB for MySQL), `cynosdb` (TDSQL-C for MySQL). Default value: `mysql`.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeTopSpaceSchemaTimeSeriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopSpaceSchemaTimeSeriesRequest(DescribeTopSpaceSchemaTimeSeriesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

