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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogTopSqlsRequest extends AbstractModel{

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time, such as "2019-09-10 12:13:14".
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time in the format of "2019-09-11 10:13:14". The interval between the end time and the start time can be up to 7 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Sorting key. Valid values: QueryTime, ExecTimes, RowsSent, LockTime, RowsExamined. Default value: QueryTime.
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * Sorting order. Valid values: ASC (ascending), DESC (descending). Default value: DESC.
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Database name array.
    */
    @SerializedName("SchemaList")
    @Expose
    private SchemaItem [] SchemaList;

    /**
    * Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL). Default value: mysql.
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
     * Get Start time, such as "2019-09-10 12:13:14". 
     * @return StartTime Start time, such as "2019-09-10 12:13:14".
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, such as "2019-09-10 12:13:14".
     * @param StartTime Start time, such as "2019-09-10 12:13:14".
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time in the format of "2019-09-11 10:13:14". The interval between the end time and the start time can be up to 7 days. 
     * @return EndTime End time in the format of "2019-09-11 10:13:14". The interval between the end time and the start time can be up to 7 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in the format of "2019-09-11 10:13:14". The interval between the end time and the start time can be up to 7 days.
     * @param EndTime End time in the format of "2019-09-11 10:13:14". The interval between the end time and the start time can be up to 7 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Sorting key. Valid values: QueryTime, ExecTimes, RowsSent, LockTime, RowsExamined. Default value: QueryTime. 
     * @return SortBy Sorting key. Valid values: QueryTime, ExecTimes, RowsSent, LockTime, RowsExamined. Default value: QueryTime.
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set Sorting key. Valid values: QueryTime, ExecTimes, RowsSent, LockTime, RowsExamined. Default value: QueryTime.
     * @param SortBy Sorting key. Valid values: QueryTime, ExecTimes, RowsSent, LockTime, RowsExamined. Default value: QueryTime.
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get Sorting order. Valid values: ASC (ascending), DESC (descending). Default value: DESC. 
     * @return OrderBy Sorting order. Valid values: ASC (ascending), DESC (descending). Default value: DESC.
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Sorting order. Valid values: ASC (ascending), DESC (descending). Default value: DESC.
     * @param OrderBy Sorting order. Valid values: ASC (ascending), DESC (descending). Default value: DESC.
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Database name array. 
     * @return SchemaList Database name array.
     */
    public SchemaItem [] getSchemaList() {
        return this.SchemaList;
    }

    /**
     * Set Database name array.
     * @param SchemaList Database name array.
     */
    public void setSchemaList(SchemaItem [] SchemaList) {
        this.SchemaList = SchemaList;
    }

    /**
     * Get Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL). Default value: mysql. 
     * @return Product Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL). Default value: mysql.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL). Default value: mysql.
     * @param Product Service type. Valid values: mysql (TencentDB for MySQL), cynosdb (TDSQL-C for MySQL). Default value: mysql.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeSlowLogTopSqlsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogTopSqlsRequest(DescribeSlowLogTopSqlsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SchemaList != null) {
            this.SchemaList = new SchemaItem[source.SchemaList.length];
            for (int i = 0; i < source.SchemaList.length; i++) {
                this.SchemaList[i] = new SchemaItem(source.SchemaList[i]);
            }
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "SchemaList.", this.SchemaList);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

