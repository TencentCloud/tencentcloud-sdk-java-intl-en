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

public class ModifyTableMemosRequest extends AbstractModel {

    /**
    * ID of the cluster instance where a table resides
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * List of details of selected tables
    */
    @SerializedName("TableMemos")
    @Expose
    private SelectedTableInfoNew [] TableMemos;

    /**
     * Get ID of the cluster instance where a table resides 
     * @return ClusterId ID of the cluster instance where a table resides
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ID of the cluster instance where a table resides
     * @param ClusterId ID of the cluster instance where a table resides
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get List of details of selected tables 
     * @return TableMemos List of details of selected tables
     */
    public SelectedTableInfoNew [] getTableMemos() {
        return this.TableMemos;
    }

    /**
     * Set List of details of selected tables
     * @param TableMemos List of details of selected tables
     */
    public void setTableMemos(SelectedTableInfoNew [] TableMemos) {
        this.TableMemos = TableMemos;
    }

    public ModifyTableMemosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTableMemosRequest(ModifyTableMemosRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TableMemos != null) {
            this.TableMemos = new SelectedTableInfoNew[source.TableMemos.length];
            for (int i = 0; i < source.TableMemos.length; i++) {
                this.TableMemos[i] = new SelectedTableInfoNew(source.TableMemos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "TableMemos.", this.TableMemos);

    }
}

