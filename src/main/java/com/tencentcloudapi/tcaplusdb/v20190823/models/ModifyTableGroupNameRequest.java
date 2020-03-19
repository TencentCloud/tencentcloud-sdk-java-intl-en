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

public class ModifyTableGroupNameRequest extends AbstractModel{

    /**
    * ID of the cluster where a table group resides
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * ID of the table group to be renamed
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * New table group name, which can contain letters and symbols
    */
    @SerializedName("TableGroupName")
    @Expose
    private String TableGroupName;

    /**
     * Get ID of the cluster where a table group resides 
     * @return ClusterId ID of the cluster where a table group resides
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ID of the cluster where a table group resides
     * @param ClusterId ID of the cluster where a table group resides
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get ID of the table group to be renamed 
     * @return TableGroupId ID of the table group to be renamed
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set ID of the table group to be renamed
     * @param TableGroupId ID of the table group to be renamed
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get New table group name, which can contain letters and symbols 
     * @return TableGroupName New table group name, which can contain letters and symbols
     */
    public String getTableGroupName() {
        return this.TableGroupName;
    }

    /**
     * Set New table group name, which can contain letters and symbols
     * @param TableGroupName New table group name, which can contain letters and symbols
     */
    public void setTableGroupName(String TableGroupName) {
        this.TableGroupName = TableGroupName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableGroupName", this.TableGroupName);

    }
}

