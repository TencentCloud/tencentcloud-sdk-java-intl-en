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

public class BatchCreateTaskVersionDTO extends AbstractModel {

    /**
    * Task IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * VersionRemark
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("VersionRemark")
    @Expose
    private String VersionRemark;

    /**
    * Folder ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
     * Get Task IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskId Task IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskId Task IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get VersionRemark
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return VersionRemark VersionRemark
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getVersionRemark() {
        return this.VersionRemark;
    }

    /**
     * Set VersionRemark
Note: This field may return null, indicating that no valid value can be obtained.
     * @param VersionRemark VersionRemark
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVersionRemark(String VersionRemark) {
        this.VersionRemark = VersionRemark;
    }

    /**
     * Get Folder ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FolderId Folder ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set Folder ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FolderId Folder ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    public BatchCreateTaskVersionDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCreateTaskVersionDTO(BatchCreateTaskVersionDTO source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.VersionRemark != null) {
            this.VersionRemark = new String(source.VersionRemark);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "VersionRemark", this.VersionRemark);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);

    }
}

