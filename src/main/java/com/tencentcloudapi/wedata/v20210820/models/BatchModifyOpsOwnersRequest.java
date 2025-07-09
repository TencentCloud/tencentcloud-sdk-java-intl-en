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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchModifyOpsOwnersRequest extends AbstractModel {

    /**
    * TaskId Array that Needs Updated Responsible Person
    */
    @SerializedName("TaskIdList")
    @Expose
    private String [] TaskIdList;

    /**
    * Responsible User Id Information that Needs Updating, Connect Multiple Persons in Charge with ;
    */
    @SerializedName("Owners")
    @Expose
    private String Owners;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get TaskId Array that Needs Updated Responsible Person 
     * @return TaskIdList TaskId Array that Needs Updated Responsible Person
     */
    public String [] getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set TaskId Array that Needs Updated Responsible Person
     * @param TaskIdList TaskId Array that Needs Updated Responsible Person
     */
    public void setTaskIdList(String [] TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get Responsible User Id Information that Needs Updating, Connect Multiple Persons in Charge with ; 
     * @return Owners Responsible User Id Information that Needs Updating, Connect Multiple Persons in Charge with ;
     */
    public String getOwners() {
        return this.Owners;
    }

    /**
     * Set Responsible User Id Information that Needs Updating, Connect Multiple Persons in Charge with ;
     * @param Owners Responsible User Id Information that Needs Updating, Connect Multiple Persons in Charge with ;
     */
    public void setOwners(String Owners) {
        this.Owners = Owners;
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

    public BatchModifyOpsOwnersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyOpsOwnersRequest(BatchModifyOpsOwnersRequest source) {
        if (source.TaskIdList != null) {
            this.TaskIdList = new String[source.TaskIdList.length];
            for (int i = 0; i < source.TaskIdList.length; i++) {
                this.TaskIdList[i] = new String(source.TaskIdList[i]);
            }
        }
        if (source.Owners != null) {
            this.Owners = new String(source.Owners);
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
        this.setParamSimple(map, prefix + "Owners", this.Owners);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

