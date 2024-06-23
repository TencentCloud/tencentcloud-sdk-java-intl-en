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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataSourceInfoPage extends AbstractModel {

    /**
    * pagination page number
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * pagination size
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * data source list
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Rows")
    @Expose
    private DataSourceInfo [] Rows;

    /**
    * Total numberNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * total pagination pages
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
     * Get pagination page number
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PageNumber pagination page number
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set pagination page number
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PageNumber pagination page number
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get pagination size
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PageSize pagination size
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set pagination size
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PageSize pagination size
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get data source list
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Rows data source list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public DataSourceInfo [] getRows() {
        return this.Rows;
    }

    /**
     * Set data source list
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Rows data source list
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRows(DataSourceInfo [] Rows) {
        this.Rows = Rows;
    }

    /**
     * Get Total numberNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalCount Total numberNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total numberNote: This field may return null, indicating that no valid value can be obtained.
     * @param TotalCount Total numberNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get total pagination pages
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalPageNumber total pagination pages
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set total pagination pages
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TotalPageNumber total pagination pages
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    public DataSourceInfoPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSourceInfoPage(DataSourceInfoPage source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Rows != null) {
            this.Rows = new DataSourceInfo[source.Rows.length];
            for (int i = 0; i < source.Rows.length; i++) {
                this.Rows[i] = new DataSourceInfo(source.Rows[i]);
            }
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
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);

    }
}

