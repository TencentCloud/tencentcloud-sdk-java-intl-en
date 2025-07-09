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

public class DescribeTableMetaRequest extends AbstractModel {

    /**
    * Unique Table ID
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Query conditions by Name
    */
    @SerializedName("TableNameFilter")
    @Expose
    private TableNameFilter TableNameFilter;

    /**
    * Query condition type: 0 by ID, 1 by Name, default is 0
    */
    @SerializedName("TableFilterType")
    @Expose
    private Long TableFilterType;

    /**
     * Get Unique Table ID 
     * @return TableId Unique Table ID
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Unique Table ID
     * @param TableId Unique Table ID
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Query conditions by Name 
     * @return TableNameFilter Query conditions by Name
     */
    public TableNameFilter getTableNameFilter() {
        return this.TableNameFilter;
    }

    /**
     * Set Query conditions by Name
     * @param TableNameFilter Query conditions by Name
     */
    public void setTableNameFilter(TableNameFilter TableNameFilter) {
        this.TableNameFilter = TableNameFilter;
    }

    /**
     * Get Query condition type: 0 by ID, 1 by Name, default is 0 
     * @return TableFilterType Query condition type: 0 by ID, 1 by Name, default is 0
     */
    public Long getTableFilterType() {
        return this.TableFilterType;
    }

    /**
     * Set Query condition type: 0 by ID, 1 by Name, default is 0
     * @param TableFilterType Query condition type: 0 by ID, 1 by Name, default is 0
     */
    public void setTableFilterType(Long TableFilterType) {
        this.TableFilterType = TableFilterType;
    }

    public DescribeTableMetaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableMetaRequest(DescribeTableMetaRequest source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableNameFilter != null) {
            this.TableNameFilter = new TableNameFilter(source.TableNameFilter);
        }
        if (source.TableFilterType != null) {
            this.TableFilterType = new Long(source.TableFilterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamObj(map, prefix + "TableNameFilter.", this.TableNameFilter);
        this.setParamSimple(map, prefix + "TableFilterType", this.TableFilterType);

    }
}

