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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableColumnListData extends AbstractModel {

    /**
    * Column list in the table
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("List")
    @Expose
    private TableColumn [] List;

    /**
    * async transaction id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranId")
    @Expose
    private String TranId;

    /**
    * Async transaction status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranStatus")
    @Expose
    private Long TranStatus;

    /**
     * Get Column list in the table
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return List Column list in the table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TableColumn [] getList() {
        return this.List;
    }

    /**
     * Set Column list in the table
Note: This field may return null, indicating that no valid values can be obtained.
     * @param List Column list in the table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setList(TableColumn [] List) {
        this.List = List;
    }

    /**
     * Get async transaction id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranId async transaction id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTranId() {
        return this.TranId;
    }

    /**
     * Set async transaction id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranId async transaction id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    /**
     * Get Async transaction status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranStatus Async transaction status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTranStatus() {
        return this.TranStatus;
    }

    /**
     * Set Async transaction status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranStatus Async transaction status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranStatus(Long TranStatus) {
        this.TranStatus = TranStatus;
    }

    public TableColumnListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableColumnListData(TableColumnListData source) {
        if (source.List != null) {
            this.List = new TableColumn[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new TableColumn(source.List[i]);
            }
        }
        if (source.TranId != null) {
            this.TranId = new String(source.TranId);
        }
        if (source.TranStatus != null) {
            this.TranStatus = new Long(source.TranStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "TranId", this.TranId);
        this.setParamSimple(map, prefix + "TranStatus", this.TranStatus);

    }
}

