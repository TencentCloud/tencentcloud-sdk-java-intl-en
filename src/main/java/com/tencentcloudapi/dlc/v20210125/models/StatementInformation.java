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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatementInformation extends AbstractModel {

    /**
    * Unique ID of the SQL task
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * SQL content
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SQL")
    @Expose
    private String SQL;

    /**
     * Get Unique ID of the SQL task
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Unique ID of the SQL task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Unique ID of the SQL task
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Unique ID of the SQL task
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get SQL content
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SQL SQL content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSQL() {
        return this.SQL;
    }

    /**
     * Set SQL content
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SQL SQL content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    public StatementInformation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatementInformation(StatementInformation source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SQL != null) {
            this.SQL = new String(source.SQL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SQL", this.SQL);

    }
}

