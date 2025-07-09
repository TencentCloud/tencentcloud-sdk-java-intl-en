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

public class PageRoles extends AbstractModel {

    /**
    * Role information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Rows")
    @Expose
    private BaseRole [] Rows;

    /**
    * Page number

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Pagination size

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Total number

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Total pagination pages.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
     * Get Role information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Rows Role information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BaseRole [] getRows() {
        return this.Rows;
    }

    /**
     * Set Role information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Rows Role information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRows(BaseRole [] Rows) {
        this.Rows = Rows;
    }

    /**
     * Get Page number

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageNumber Page number

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number

Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageNumber Page number

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Pagination size

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageSize Pagination size

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Pagination size

Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageSize Pagination size

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Total number

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Total pagination pages.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalPageNumber Total pagination pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set Total pagination pages.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalPageNumber Total pagination pages.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    public PageRoles() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PageRoles(PageRoles source) {
        if (source.Rows != null) {
            this.Rows = new BaseRole[source.Rows.length];
            for (int i = 0; i < source.Rows.length; i++) {
                this.Rows[i] = new BaseRole(source.Rows[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);

    }
}

