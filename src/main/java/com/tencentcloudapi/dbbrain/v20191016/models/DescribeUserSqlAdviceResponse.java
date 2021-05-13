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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserSqlAdviceResponse extends AbstractModel{

    /**
    * SQL statement optimization suggestions, which can be parsed into JSON arrays.
    */
    @SerializedName("Advices")
    @Expose
    private String Advices;

    /**
    * Notes of SQL statement optimization suggestions, which can be parsed into String arrays.
    */
    @SerializedName("Comments")
    @Expose
    private String Comments;

    /**
    * SQL statement.
    */
    @SerializedName("SqlText")
    @Expose
    private String SqlText;

    /**
    * Database name.
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * DDL information of related tables, which can be parsed into JSON arrays.
    */
    @SerializedName("Tables")
    @Expose
    private String Tables;

    /**
    * SQL execution plan, which can be parsed into JSON.
    */
    @SerializedName("SqlPlan")
    @Expose
    private String SqlPlan;

    /**
    * Cost saving details after SQL statement optimization, which can be parsed into JSON.
    */
    @SerializedName("Cost")
    @Expose
    private String Cost;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get SQL statement optimization suggestions, which can be parsed into JSON arrays. 
     * @return Advices SQL statement optimization suggestions, which can be parsed into JSON arrays.
     */
    public String getAdvices() {
        return this.Advices;
    }

    /**
     * Set SQL statement optimization suggestions, which can be parsed into JSON arrays.
     * @param Advices SQL statement optimization suggestions, which can be parsed into JSON arrays.
     */
    public void setAdvices(String Advices) {
        this.Advices = Advices;
    }

    /**
     * Get Notes of SQL statement optimization suggestions, which can be parsed into String arrays. 
     * @return Comments Notes of SQL statement optimization suggestions, which can be parsed into String arrays.
     */
    public String getComments() {
        return this.Comments;
    }

    /**
     * Set Notes of SQL statement optimization suggestions, which can be parsed into String arrays.
     * @param Comments Notes of SQL statement optimization suggestions, which can be parsed into String arrays.
     */
    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    /**
     * Get SQL statement. 
     * @return SqlText SQL statement.
     */
    public String getSqlText() {
        return this.SqlText;
    }

    /**
     * Set SQL statement.
     * @param SqlText SQL statement.
     */
    public void setSqlText(String SqlText) {
        this.SqlText = SqlText;
    }

    /**
     * Get Database name. 
     * @return Schema Database name.
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set Database name.
     * @param Schema Database name.
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get DDL information of related tables, which can be parsed into JSON arrays. 
     * @return Tables DDL information of related tables, which can be parsed into JSON arrays.
     */
    public String getTables() {
        return this.Tables;
    }

    /**
     * Set DDL information of related tables, which can be parsed into JSON arrays.
     * @param Tables DDL information of related tables, which can be parsed into JSON arrays.
     */
    public void setTables(String Tables) {
        this.Tables = Tables;
    }

    /**
     * Get SQL execution plan, which can be parsed into JSON. 
     * @return SqlPlan SQL execution plan, which can be parsed into JSON.
     */
    public String getSqlPlan() {
        return this.SqlPlan;
    }

    /**
     * Set SQL execution plan, which can be parsed into JSON.
     * @param SqlPlan SQL execution plan, which can be parsed into JSON.
     */
    public void setSqlPlan(String SqlPlan) {
        this.SqlPlan = SqlPlan;
    }

    /**
     * Get Cost saving details after SQL statement optimization, which can be parsed into JSON. 
     * @return Cost Cost saving details after SQL statement optimization, which can be parsed into JSON.
     */
    public String getCost() {
        return this.Cost;
    }

    /**
     * Set Cost saving details after SQL statement optimization, which can be parsed into JSON.
     * @param Cost Cost saving details after SQL statement optimization, which can be parsed into JSON.
     */
    public void setCost(String Cost) {
        this.Cost = Cost;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeUserSqlAdviceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserSqlAdviceResponse(DescribeUserSqlAdviceResponse source) {
        if (source.Advices != null) {
            this.Advices = new String(source.Advices);
        }
        if (source.Comments != null) {
            this.Comments = new String(source.Comments);
        }
        if (source.SqlText != null) {
            this.SqlText = new String(source.SqlText);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.Tables != null) {
            this.Tables = new String(source.Tables);
        }
        if (source.SqlPlan != null) {
            this.SqlPlan = new String(source.SqlPlan);
        }
        if (source.Cost != null) {
            this.Cost = new String(source.Cost);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Advices", this.Advices);
        this.setParamSimple(map, prefix + "Comments", this.Comments);
        this.setParamSimple(map, prefix + "SqlText", this.SqlText);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "Tables", this.Tables);
        this.setParamSimple(map, prefix + "SqlPlan", this.SqlPlan);
        this.setParamSimple(map, prefix + "Cost", this.Cost);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

