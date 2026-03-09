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

public class ListColumnLineageRequest extends AbstractModel {

    /**
    * Table unique ID.
    */
    @SerializedName("TableUniqueId")
    @Expose
    private String TableUniqueId;

    /**
    * Lineage direction INPUT｜OUTPUT.
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * Page number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Pagination size.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Column name.
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * Source: WEDATA|THIRD default WEDATA.
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
     * Get Table unique ID. 
     * @return TableUniqueId Table unique ID.
     */
    public String getTableUniqueId() {
        return this.TableUniqueId;
    }

    /**
     * Set Table unique ID.
     * @param TableUniqueId Table unique ID.
     */
    public void setTableUniqueId(String TableUniqueId) {
        this.TableUniqueId = TableUniqueId;
    }

    /**
     * Get Lineage direction INPUT｜OUTPUT. 
     * @return Direction Lineage direction INPUT｜OUTPUT.
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set Lineage direction INPUT｜OUTPUT.
     * @param Direction Lineage direction INPUT｜OUTPUT.
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Page number 
     * @return PageNumber Page number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number
     * @param PageNumber Page number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
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
     * Get Column name. 
     * @return ColumnName Column name.
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set Column name.
     * @param ColumnName Column name.
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get Source: WEDATA|THIRD default WEDATA. 
     * @return Platform Source: WEDATA|THIRD default WEDATA.
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set Source: WEDATA|THIRD default WEDATA.
     * @param Platform Source: WEDATA|THIRD default WEDATA.
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    public ListColumnLineageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListColumnLineageRequest(ListColumnLineageRequest source) {
        if (source.TableUniqueId != null) {
            this.TableUniqueId = new String(source.TableUniqueId);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableUniqueId", this.TableUniqueId);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "Platform", this.Platform);

    }
}

