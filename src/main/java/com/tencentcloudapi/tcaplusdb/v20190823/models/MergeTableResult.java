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

public class MergeTableResult extends AbstractModel {

    /**
    * Task ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * If table merging is successful, `null` will be returned
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
    * Comparison results of tables
    */
    @SerializedName("Table")
    @Expose
    private CompareTablesInfo Table;

    /**
    * Application ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
     * Get Task ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return TaskId Task ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param TaskId Task ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get If table merging is successful, `null` will be returned
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return Error If table merging is successful, `null` will be returned
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set If table merging is successful, `null` will be returned
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param Error If table merging is successful, `null` will be returned
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    /**
     * Get Comparison results of tables 
     * @return Table Comparison results of tables
     */
    public CompareTablesInfo getTable() {
        return this.Table;
    }

    /**
     * Set Comparison results of tables
     * @param Table Comparison results of tables
     */
    public void setTable(CompareTablesInfo Table) {
        this.Table = Table;
    }

    /**
     * Get Application ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return ApplicationId Application ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param ApplicationId Application ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    public MergeTableResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MergeTableResult(MergeTableResult source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Error != null) {
            this.Error = new ErrorInfo(source.Error);
        }
        if (source.Table != null) {
            this.Table = new CompareTablesInfo(source.Table);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "Error.", this.Error);
        this.setParamObj(map, prefix + "Table.", this.Table);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);

    }
}

