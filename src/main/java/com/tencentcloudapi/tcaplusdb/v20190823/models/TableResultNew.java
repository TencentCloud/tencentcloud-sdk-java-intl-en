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

public class TableResultNew extends AbstractModel {

    /**
    * Table instance ID in the format of `tcaplus-3be64cbb`
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableInstanceId")
    @Expose
    private String TableInstanceId;

    /**
    * Task ID, which is valid for the API that creates one task
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Table name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Table data structure type, such as `GENERIC` or `LIST`
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * Table data interface description language (IDL) type, such as `PROTO` or `TDR`
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableIdlType")
    @Expose
    private String TableIdlType;

    /**
    * ID of the table group where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * Error message
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
    * Task ID list, which is valid for the API that creates multiple tasks
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * Cluster operation application ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
     * Get Table instance ID in the format of `tcaplus-3be64cbb`
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableInstanceId Table instance ID in the format of `tcaplus-3be64cbb`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTableInstanceId() {
        return this.TableInstanceId;
    }

    /**
     * Set Table instance ID in the format of `tcaplus-3be64cbb`
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableInstanceId Table instance ID in the format of `tcaplus-3be64cbb`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableInstanceId(String TableInstanceId) {
        this.TableInstanceId = TableInstanceId;
    }

    /**
     * Get Task ID, which is valid for the API that creates one task
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID, which is valid for the API that creates one task
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID, which is valid for the API that creates one task
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID, which is valid for the API that creates one task
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Table name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableName Table name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableName Table name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Table data structure type, such as `GENERIC` or `LIST`
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableType Table data structure type, such as `GENERIC` or `LIST`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set Table data structure type, such as `GENERIC` or `LIST`
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableType Table data structure type, such as `GENERIC` or `LIST`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get Table data interface description language (IDL) type, such as `PROTO` or `TDR`
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableIdlType Table data interface description language (IDL) type, such as `PROTO` or `TDR`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTableIdlType() {
        return this.TableIdlType;
    }

    /**
     * Set Table data interface description language (IDL) type, such as `PROTO` or `TDR`
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableIdlType Table data interface description language (IDL) type, such as `PROTO` or `TDR`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableIdlType(String TableIdlType) {
        this.TableIdlType = TableIdlType;
    }

    /**
     * Get ID of the table group where a table resides
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TableGroupId ID of the table group where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set ID of the table group where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TableGroupId ID of the table group where a table resides
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get Error message
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Error Error message
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set Error message
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Error Error message
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    /**
     * Get Task ID list, which is valid for the API that creates multiple tasks
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TaskIds Task ID list, which is valid for the API that creates multiple tasks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set Task ID list, which is valid for the API that creates multiple tasks
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TaskIds Task ID list, which is valid for the API that creates multiple tasks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get Cluster operation application ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return ApplicationId Cluster operation application ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Cluster operation application ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param ApplicationId Cluster operation application ID
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    public TableResultNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableResultNew(TableResultNew source) {
        if (source.TableInstanceId != null) {
            this.TableInstanceId = new String(source.TableInstanceId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.TableIdlType != null) {
            this.TableIdlType = new String(source.TableIdlType);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.Error != null) {
            this.Error = new ErrorInfo(source.Error);
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableInstanceId", this.TableInstanceId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "TableIdlType", this.TableIdlType);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamObj(map, prefix + "Error.", this.Error);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);

    }
}

