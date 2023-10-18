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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySnapshotsRequest extends AbstractModel {

    /**
    * The ID of the cluster where the table resides
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Snapshot list
    */
    @SerializedName("SelectedTables")
    @Expose
    private SnapshotInfoNew [] SelectedTables;

    /**
     * Get The ID of the cluster where the table resides 
     * @return ClusterId The ID of the cluster where the table resides
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The ID of the cluster where the table resides
     * @param ClusterId The ID of the cluster where the table resides
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Snapshot list 
     * @return SelectedTables Snapshot list
     */
    public SnapshotInfoNew [] getSelectedTables() {
        return this.SelectedTables;
    }

    /**
     * Set Snapshot list
     * @param SelectedTables Snapshot list
     */
    public void setSelectedTables(SnapshotInfoNew [] SelectedTables) {
        this.SelectedTables = SelectedTables;
    }

    public ModifySnapshotsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySnapshotsRequest(ModifySnapshotsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SelectedTables != null) {
            this.SelectedTables = new SnapshotInfoNew[source.SelectedTables.length];
            for (int i = 0; i < source.SelectedTables.length; i++) {
                this.SelectedTables[i] = new SnapshotInfoNew(source.SelectedTables[i]);
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

