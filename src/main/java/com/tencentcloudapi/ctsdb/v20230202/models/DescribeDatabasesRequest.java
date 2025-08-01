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
package com.tencentcloudapi.ctsdb.v20230202.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabasesRequest extends AbstractModel {

    /**
    * Database parameter.
    */
    @SerializedName("Database")
    @Expose
    private Database Database;

    /**
    * Pagination size.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Pagination page.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
     * Get Database parameter. 
     * @return Database Database parameter.
     */
    public Database getDatabase() {
        return this.Database;
    }

    /**
     * Set Database parameter.
     * @param Database Database parameter.
     */
    public void setDatabase(Database Database) {
        this.Database = Database;
    }

    /**
     * Get Pagination size. 
     * @return PageSize Pagination size.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Pagination size.
     * @param PageSize Pagination size.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Pagination page. 
     * @return PageNumber Pagination page.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Pagination page.
     * @param PageNumber Pagination page.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    public DescribeDatabasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabasesRequest(DescribeDatabasesRequest source) {
        if (source.Database != null) {
            this.Database = new Database(source.Database);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Database.", this.Database);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}

