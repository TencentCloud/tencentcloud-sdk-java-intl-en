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

public class TableGroupInfo extends AbstractModel{

    /**
    * Table group ID
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * Table group name
    */
    @SerializedName("TableGroupName")
    @Expose
    private String TableGroupName;

    /**
    * Table group creation time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Number of tables in table group
    */
    @SerializedName("TableCount")
    @Expose
    private Long TableCount;

    /**
    * Total table storage capacity in MB in table group
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
     * Get Table group ID 
     * @return TableGroupId Table group ID
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set Table group ID
     * @param TableGroupId Table group ID
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get Table group name 
     * @return TableGroupName Table group name
     */
    public String getTableGroupName() {
        return this.TableGroupName;
    }

    /**
     * Set Table group name
     * @param TableGroupName Table group name
     */
    public void setTableGroupName(String TableGroupName) {
        this.TableGroupName = TableGroupName;
    }

    /**
     * Get Table group creation time 
     * @return CreatedTime Table group creation time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Table group creation time
     * @param CreatedTime Table group creation time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Number of tables in table group 
     * @return TableCount Number of tables in table group
     */
    public Long getTableCount() {
        return this.TableCount;
    }

    /**
     * Set Number of tables in table group
     * @param TableCount Number of tables in table group
     */
    public void setTableCount(Long TableCount) {
        this.TableCount = TableCount;
    }

    /**
     * Get Total table storage capacity in MB in table group 
     * @return TotalSize Total table storage capacity in MB in table group
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set Total table storage capacity in MB in table group
     * @param TotalSize Total table storage capacity in MB in table group
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamSimple(map, prefix + "TableGroupName", this.TableGroupName);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "TableCount", this.TableCount);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);

    }
}

