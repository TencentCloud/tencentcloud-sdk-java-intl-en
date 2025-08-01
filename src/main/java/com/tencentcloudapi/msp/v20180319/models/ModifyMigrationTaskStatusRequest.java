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
package com.tencentcloudapi.msp.v20180319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMigrationTaskStatusRequest extends AbstractModel {

    /**
    * Task status, valid values include `unstart` (migration has not started), `migrating` (migration in progress), `finish` (migration completed) or `fail` (migration failed).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task ID, such as msp-jitoh33n
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get Task status, valid values include `unstart` (migration has not started), `migrating` (migration in progress), `finish` (migration completed) or `fail` (migration failed). 
     * @return Status Task status, valid values include `unstart` (migration has not started), `migrating` (migration in progress), `finish` (migration completed) or `fail` (migration failed).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status, valid values include `unstart` (migration has not started), `migrating` (migration in progress), `finish` (migration completed) or `fail` (migration failed).
     * @param Status Task status, valid values include `unstart` (migration has not started), `migrating` (migration in progress), `finish` (migration completed) or `fail` (migration failed).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task ID, such as msp-jitoh33n 
     * @return TaskId Task ID, such as msp-jitoh33n
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID, such as msp-jitoh33n
     * @param TaskId Task ID, such as msp-jitoh33n
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public ModifyMigrationTaskStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMigrationTaskStatusRequest(ModifyMigrationTaskStatusRequest source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

