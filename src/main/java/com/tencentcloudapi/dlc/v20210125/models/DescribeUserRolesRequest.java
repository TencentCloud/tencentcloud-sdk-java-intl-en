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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserRolesRequest extends AbstractModel{

    /**
    * The number limit of enumerated user roles.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * The offset for starting enumeration. 
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Fuzzy enumeration by arn.
    */
    @SerializedName("Fuzzy")
    @Expose
    private String Fuzzy;

    /**
    * The field for sorting the returned results.
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * The sorting order, descending or ascending, such as `desc`.
    */
    @SerializedName("Sorting")
    @Expose
    private String Sorting;

    /**
     * Get The number limit of enumerated user roles. 
     * @return Limit The number limit of enumerated user roles.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number limit of enumerated user roles.
     * @param Limit The number limit of enumerated user roles.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get The offset for starting enumeration.  
     * @return Offset The offset for starting enumeration. 
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset for starting enumeration. 
     * @param Offset The offset for starting enumeration. 
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Fuzzy enumeration by arn. 
     * @return Fuzzy Fuzzy enumeration by arn.
     */
    public String getFuzzy() {
        return this.Fuzzy;
    }

    /**
     * Set Fuzzy enumeration by arn.
     * @param Fuzzy Fuzzy enumeration by arn.
     */
    public void setFuzzy(String Fuzzy) {
        this.Fuzzy = Fuzzy;
    }

    /**
     * Get The field for sorting the returned results. 
     * @return SortBy The field for sorting the returned results.
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set The field for sorting the returned results.
     * @param SortBy The field for sorting the returned results.
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get The sorting order, descending or ascending, such as `desc`. 
     * @return Sorting The sorting order, descending or ascending, such as `desc`.
     */
    public String getSorting() {
        return this.Sorting;
    }

    /**
     * Set The sorting order, descending or ascending, such as `desc`.
     * @param Sorting The sorting order, descending or ascending, such as `desc`.
     */
    public void setSorting(String Sorting) {
        this.Sorting = Sorting;
    }

    public DescribeUserRolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserRolesRequest(DescribeUserRolesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Fuzzy != null) {
            this.Fuzzy = new String(source.Fuzzy);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.Sorting != null) {
            this.Sorting = new String(source.Sorting);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Fuzzy", this.Fuzzy);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "Sorting", this.Sorting);

    }
}

