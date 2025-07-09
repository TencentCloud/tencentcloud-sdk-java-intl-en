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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterDatabaseTablesRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Database name
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Specifies the table type.
Specifies that "view" only returns the view, "base_table" only returns the basic table, and "all" returns both the view and the table. the default value is all.
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Database name 
     * @return Db Database name
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set Database name
     * @param Db Database name
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number 
     * @return Limit Number
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number
     * @param Limit Number
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Specifies the table type.
Specifies that "view" only returns the view, "base_table" only returns the basic table, and "all" returns both the view and the table. the default value is all. 
     * @return TableType Specifies the table type.
Specifies that "view" only returns the view, "base_table" only returns the basic table, and "all" returns both the view and the table. the default value is all.
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set Specifies the table type.
Specifies that "view" only returns the view, "base_table" only returns the basic table, and "all" returns both the view and the table. the default value is all.
     * @param TableType Specifies the table type.
Specifies that "view" only returns the view, "base_table" only returns the basic table, and "all" returns both the view and the table. the default value is all.
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    public DescribeClusterDatabaseTablesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterDatabaseTablesRequest(DescribeClusterDatabaseTablesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TableType", this.TableType);

    }
}

