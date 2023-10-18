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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMigrationsRequest extends AbstractModel {

    /**
    * Status set. As long as a migration task is in a status therein, it will be listed
    */
    @SerializedName("StatusSet")
    @Expose
    private Long [] StatusSet;

    /**
    * Migration task name (fuzzy match)
    */
    @SerializedName("MigrateName")
    @Expose
    private String MigrateName;

    /**
    * Number of results per page. Value range: 1-100. Default value: 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page number. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The query results are sorted by keyword. Valid values: name, createTime, startTime, endTime, status
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * Sorting order. Valid values: desc, asc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get Status set. As long as a migration task is in a status therein, it will be listed 
     * @return StatusSet Status set. As long as a migration task is in a status therein, it will be listed
     */
    public Long [] getStatusSet() {
        return this.StatusSet;
    }

    /**
     * Set Status set. As long as a migration task is in a status therein, it will be listed
     * @param StatusSet Status set. As long as a migration task is in a status therein, it will be listed
     */
    public void setStatusSet(Long [] StatusSet) {
        this.StatusSet = StatusSet;
    }

    /**
     * Get Migration task name (fuzzy match) 
     * @return MigrateName Migration task name (fuzzy match)
     */
    public String getMigrateName() {
        return this.MigrateName;
    }

    /**
     * Set Migration task name (fuzzy match)
     * @param MigrateName Migration task name (fuzzy match)
     */
    public void setMigrateName(String MigrateName) {
        this.MigrateName = MigrateName;
    }

    /**
     * Get Number of results per page. Value range: 1-100. Default value: 100 
     * @return Limit Number of results per page. Value range: 1-100. Default value: 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results per page. Value range: 1-100. Default value: 100
     * @param Limit Number of results per page. Value range: 1-100. Default value: 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page number. Default value: 0 
     * @return Offset Page number. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number. Default value: 0
     * @param Offset Page number. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The query results are sorted by keyword. Valid values: name, createTime, startTime, endTime, status 
     * @return OrderBy The query results are sorted by keyword. Valid values: name, createTime, startTime, endTime, status
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set The query results are sorted by keyword. Valid values: name, createTime, startTime, endTime, status
     * @param OrderBy The query results are sorted by keyword. Valid values: name, createTime, startTime, endTime, status
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Sorting order. Valid values: desc, asc 
     * @return OrderByType Sorting order. Valid values: desc, asc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set Sorting order. Valid values: desc, asc
     * @param OrderByType Sorting order. Valid values: desc, asc
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeMigrationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigrationsRequest(DescribeMigrationsRequest source) {
        if (source.StatusSet != null) {
            this.StatusSet = new Long[source.StatusSet.length];
            for (int i = 0; i < source.StatusSet.length; i++) {
                this.StatusSet[i] = new Long(source.StatusSet[i]);
            }
        }
        if (source.MigrateName != null) {
            this.MigrateName = new String(source.MigrateName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "StatusSet.", this.StatusSet);
        this.setParamSimple(map, prefix + "MigrateName", this.MigrateName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

