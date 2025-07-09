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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDMSDatabaseListRequest extends AbstractModel {

    /**
    * Database name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Schema name
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * Match rules
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * Pagination parameters, indicating the size of a single page.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination parameters
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting fields
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * Sorting fields: true for ascending order; false for descending order
    */
    @SerializedName("Asc")
    @Expose
    private Boolean Asc;

    /**
     * Get Database name 
     * @return Name Database name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Database name
     * @param Name Database name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Schema name 
     * @return SchemaName Schema name
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set Schema name
     * @param SchemaName Schema name
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get Match rules 
     * @return Pattern Match rules
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set Match rules
     * @param Pattern Match rules
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get Pagination parameters, indicating the size of a single page. 
     * @return Limit Pagination parameters, indicating the size of a single page.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination parameters, indicating the size of a single page.
     * @param Limit Pagination parameters, indicating the size of a single page.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination parameters 
     * @return Offset Pagination parameters
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination parameters
     * @param Offset Pagination parameters
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting fields 
     * @return Sort Sorting fields
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting fields
     * @param Sort Sorting fields
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get Sorting fields: true for ascending order; false for descending order 
     * @return Asc Sorting fields: true for ascending order; false for descending order
     */
    public Boolean getAsc() {
        return this.Asc;
    }

    /**
     * Set Sorting fields: true for ascending order; false for descending order
     * @param Asc Sorting fields: true for ascending order; false for descending order
     */
    public void setAsc(Boolean Asc) {
        this.Asc = Asc;
    }

    public DescribeDMSDatabaseListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDMSDatabaseListRequest(DescribeDMSDatabaseListRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Asc != null) {
            this.Asc = new Boolean(source.Asc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Asc", this.Asc);

    }
}

