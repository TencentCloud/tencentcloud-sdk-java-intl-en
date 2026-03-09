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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListSchemaRequest extends AbstractModel {

    /**
    * Page number, starting from 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Pagination size. maximum 500.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Directory name.
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * Data source ID.
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * Database name.
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Search by database schema keyword.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get Page number, starting from 1. 
     * @return PageNumber Page number, starting from 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number, starting from 1.
     * @param PageNumber Page number, starting from 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Pagination size. maximum 500. 
     * @return PageSize Pagination size. maximum 500.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Pagination size. maximum 500.
     * @param PageSize Pagination size. maximum 500.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Directory name. 
     * @return CatalogName Directory name.
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set Directory name.
     * @param CatalogName Directory name.
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get Data source ID. 
     * @return DatasourceId Data source ID.
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data source ID.
     * @param DatasourceId Data source ID.
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Database name. 
     * @return DatabaseName Database name.
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database name.
     * @param DatabaseName Database name.
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Search by database schema keyword. 
     * @return Keyword Search by database schema keyword.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Search by database schema keyword.
     * @param Keyword Search by database schema keyword.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public ListSchemaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSchemaRequest(ListSchemaRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

