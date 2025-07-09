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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetTableDataFlowRequest extends AbstractModel {

    /**
    * The ID of the cluster where the tables reside
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The list of tables for which data subscription will be enabled
    */
    @SerializedName("SelectedTables")
    @Expose
    private SelectedTableWithField [] SelectedTables;

    /**
     * Get The ID of the cluster where the tables reside 
     * @return ClusterId The ID of the cluster where the tables reside
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The ID of the cluster where the tables reside
     * @param ClusterId The ID of the cluster where the tables reside
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The list of tables for which data subscription will be enabled 
     * @return SelectedTables The list of tables for which data subscription will be enabled
     */
    public SelectedTableWithField [] getSelectedTables() {
        return this.SelectedTables;
    }

    /**
     * Set The list of tables for which data subscription will be enabled
     * @param SelectedTables The list of tables for which data subscription will be enabled
     */
    public void setSelectedTables(SelectedTableWithField [] SelectedTables) {
        this.SelectedTables = SelectedTables;
    }

    public SetTableDataFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetTableDataFlowRequest(SetTableDataFlowRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SelectedTables != null) {
            this.SelectedTables = new SelectedTableWithField[source.SelectedTables.length];
            for (int i = 0; i < source.SelectedTables.length; i++) {
                this.SelectedTables[i] = new SelectedTableWithField(source.SelectedTables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "SelectedTables.", this.SelectedTables);

    }
}

