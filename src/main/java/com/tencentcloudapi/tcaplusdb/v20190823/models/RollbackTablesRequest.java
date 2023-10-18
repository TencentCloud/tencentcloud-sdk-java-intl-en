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

public class RollbackTablesRequest extends AbstractModel {

    /**
    * ID of the cluster where the table to be rolled back resides
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * List of tables to be rolled back
    */
    @SerializedName("SelectedTables")
    @Expose
    private SelectedTableInfoNew [] SelectedTables;

    /**
    * Time to roll back to
    */
    @SerializedName("RollbackTime")
    @Expose
    private String RollbackTime;

    /**
    * Rollback mode. `KEYS` is supported
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get ID of the cluster where the table to be rolled back resides 
     * @return ClusterId ID of the cluster where the table to be rolled back resides
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ID of the cluster where the table to be rolled back resides
     * @param ClusterId ID of the cluster where the table to be rolled back resides
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get List of tables to be rolled back 
     * @return SelectedTables List of tables to be rolled back
     */
    public SelectedTableInfoNew [] getSelectedTables() {
        return this.SelectedTables;
    }

    /**
     * Set List of tables to be rolled back
     * @param SelectedTables List of tables to be rolled back
     */
    public void setSelectedTables(SelectedTableInfoNew [] SelectedTables) {
        this.SelectedTables = SelectedTables;
    }

    /**
     * Get Time to roll back to 
     * @return RollbackTime Time to roll back to
     */
    public String getRollbackTime() {
        return this.RollbackTime;
    }

    /**
     * Set Time to roll back to
     * @param RollbackTime Time to roll back to
     */
    public void setRollbackTime(String RollbackTime) {
        this.RollbackTime = RollbackTime;
    }

    /**
     * Get Rollback mode. `KEYS` is supported 
     * @return Mode Rollback mode. `KEYS` is supported
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Rollback mode. `KEYS` is supported
     * @param Mode Rollback mode. `KEYS` is supported
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    public RollbackTablesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackTablesRequest(RollbackTablesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SelectedTables != null) {
            this.SelectedTables = new SelectedTableInfoNew[source.SelectedTables.length];
            for (int i = 0; i < source.SelectedTables.length; i++) {
                this.SelectedTables[i] = new SelectedTableInfoNew(source.SelectedTables[i]);
            }
        }
        if (source.RollbackTime != null) {
            this.RollbackTime = new String(source.RollbackTime);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "SelectedTables.", this.SelectedTables);
        this.setParamSimple(map, prefix + "RollbackTime", this.RollbackTime);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

