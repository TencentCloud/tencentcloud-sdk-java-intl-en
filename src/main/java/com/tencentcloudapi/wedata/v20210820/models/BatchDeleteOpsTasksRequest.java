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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchDeleteOpsTasksRequest extends AbstractModel {

    /**
    * Batch Deleted Task TaskId
    */
    @SerializedName("TaskIdList")
    @Expose
    private String [] TaskIdList;

    /**
    * true: After deletion, downstream tasks can run normally
false: After deletion, downstream tasks cannot run
    */
    @SerializedName("DeleteMode")
    @Expose
    private Boolean DeleteMode;

    /**
    * true: Notify Downstream Task Responsible Persons
false: Do Not Notify Downstream Task Responsible Persons
    */
    @SerializedName("EnableNotify")
    @Expose
    private Boolean EnableNotify;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get Batch Deleted Task TaskId 
     * @return TaskIdList Batch Deleted Task TaskId
     */
    public String [] getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set Batch Deleted Task TaskId
     * @param TaskIdList Batch Deleted Task TaskId
     */
    public void setTaskIdList(String [] TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get true: After deletion, downstream tasks can run normally
false: After deletion, downstream tasks cannot run 
     * @return DeleteMode true: After deletion, downstream tasks can run normally
false: After deletion, downstream tasks cannot run
     */
    public Boolean getDeleteMode() {
        return this.DeleteMode;
    }

    /**
     * Set true: After deletion, downstream tasks can run normally
false: After deletion, downstream tasks cannot run
     * @param DeleteMode true: After deletion, downstream tasks can run normally
false: After deletion, downstream tasks cannot run
     */
    public void setDeleteMode(Boolean DeleteMode) {
        this.DeleteMode = DeleteMode;
    }

    /**
     * Get true: Notify Downstream Task Responsible Persons
false: Do Not Notify Downstream Task Responsible Persons 
     * @return EnableNotify true: Notify Downstream Task Responsible Persons
false: Do Not Notify Downstream Task Responsible Persons
     */
    public Boolean getEnableNotify() {
        return this.EnableNotify;
    }

    /**
     * Set true: Notify Downstream Task Responsible Persons
false: Do Not Notify Downstream Task Responsible Persons
     * @param EnableNotify true: Notify Downstream Task Responsible Persons
false: Do Not Notify Downstream Task Responsible Persons
     */
    public void setEnableNotify(Boolean EnableNotify) {
        this.EnableNotify = EnableNotify;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public BatchDeleteOpsTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDeleteOpsTasksRequest(BatchDeleteOpsTasksRequest source) {
        if (source.TaskIdList != null) {
            this.TaskIdList = new String[source.TaskIdList.length];
            for (int i = 0; i < source.TaskIdList.length; i++) {
                this.TaskIdList[i] = new String(source.TaskIdList[i]);
            }
        }
        if (source.DeleteMode != null) {
            this.DeleteMode = new Boolean(source.DeleteMode);
        }
        if (source.EnableNotify != null) {
            this.EnableNotify = new Boolean(source.EnableNotify);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIdList.", this.TaskIdList);
        this.setParamSimple(map, prefix + "DeleteMode", this.DeleteMode);
        this.setParamSimple(map, prefix + "EnableNotify", this.EnableNotify);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

