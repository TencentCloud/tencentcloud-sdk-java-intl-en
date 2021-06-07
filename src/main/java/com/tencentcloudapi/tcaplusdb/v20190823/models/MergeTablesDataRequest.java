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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MergeTablesDataRequest extends AbstractModel{

    /**
    * Tables to be merged
    */
    @SerializedName("SelectedTables")
    @Expose
    private MergeTablesInfo [] SelectedTables;

    /**
    * Valid values: `true` (only compare), `false` (compare and merge)
    */
    @SerializedName("IsOnlyCompare")
    @Expose
    private Boolean IsOnlyCompare;

    /**
     * Get Tables to be merged 
     * @return SelectedTables Tables to be merged
     */
    public MergeTablesInfo [] getSelectedTables() {
        return this.SelectedTables;
    }

    /**
     * Set Tables to be merged
     * @param SelectedTables Tables to be merged
     */
    public void setSelectedTables(MergeTablesInfo [] SelectedTables) {
        this.SelectedTables = SelectedTables;
    }

    /**
     * Get Valid values: `true` (only compare), `false` (compare and merge) 
     * @return IsOnlyCompare Valid values: `true` (only compare), `false` (compare and merge)
     */
    public Boolean getIsOnlyCompare() {
        return this.IsOnlyCompare;
    }

    /**
     * Set Valid values: `true` (only compare), `false` (compare and merge)
     * @param IsOnlyCompare Valid values: `true` (only compare), `false` (compare and merge)
     */
    public void setIsOnlyCompare(Boolean IsOnlyCompare) {
        this.IsOnlyCompare = IsOnlyCompare;
    }

    public MergeTablesDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MergeTablesDataRequest(MergeTablesDataRequest source) {
        if (source.SelectedTables != null) {
            this.SelectedTables = new MergeTablesInfo[source.SelectedTables.length];
            for (int i = 0; i < source.SelectedTables.length; i++) {
                this.SelectedTables[i] = new MergeTablesInfo(source.SelectedTables[i]);
            }
        }
        if (source.IsOnlyCompare != null) {
            this.IsOnlyCompare = new Boolean(source.IsOnlyCompare);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SelectedTables.", this.SelectedTables);
        this.setParamSimple(map, prefix + "IsOnlyCompare", this.IsOnlyCompare);

    }
}

