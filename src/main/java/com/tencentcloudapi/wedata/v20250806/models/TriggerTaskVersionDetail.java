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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerTaskVersionDetail extends AbstractModel {

    /**
    * Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VersionNum")
    @Expose
    private String VersionNum;

    /**
    * Creator of the version.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * Save version Id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * Version description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VersionRemark")
    @Expose
    private String VersionRemark;

    /**
    * Approval status (only submit version has).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApproveStatus")
    @Expose
    private String ApproveStatus;

    /**
    * Production status (only submit version has).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApproveTime")
    @Expose
    private String ApproveTime;

    /**
    * Approver Id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApproveUserUin")
    @Expose
    private String ApproveUserUin;

    /**
    * Task detail of the version.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Task")
    @Expose
    private TriggerTask Task;

    /**
     * Get Creation time.


Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.


Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VersionNum Version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersionNum() {
        return this.VersionNum;
    }

    /**
     * Set Version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VersionNum Version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersionNum(String VersionNum) {
        this.VersionNum = VersionNum;
    }

    /**
     * Get Creator of the version.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateUserUin Creator of the version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Creator of the version.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateUserUin Creator of the version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get Save version Id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VersionId Save version Id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set Save version Id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VersionId Save version Id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get Version description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VersionRemark Version description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersionRemark() {
        return this.VersionRemark;
    }

    /**
     * Set Version description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VersionRemark Version description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersionRemark(String VersionRemark) {
        this.VersionRemark = VersionRemark;
    }

    /**
     * Get Approval status (only submit version has).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApproveStatus Approval status (only submit version has).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApproveStatus() {
        return this.ApproveStatus;
    }

    /**
     * Set Approval status (only submit version has).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApproveStatus Approval status (only submit version has).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApproveStatus(String ApproveStatus) {
        this.ApproveStatus = ApproveStatus;
    }

    /**
     * Get Production status (only submit version has).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApproveTime Production status (only submit version has).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApproveTime() {
        return this.ApproveTime;
    }

    /**
     * Set Production status (only submit version has).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApproveTime Production status (only submit version has).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApproveTime(String ApproveTime) {
        this.ApproveTime = ApproveTime;
    }

    /**
     * Get Approver Id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApproveUserUin Approver Id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApproveUserUin() {
        return this.ApproveUserUin;
    }

    /**
     * Set Approver Id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApproveUserUin Approver Id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApproveUserUin(String ApproveUserUin) {
        this.ApproveUserUin = ApproveUserUin;
    }

    /**
     * Get Task detail of the version.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Task Task detail of the version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TriggerTask getTask() {
        return this.Task;
    }

    /**
     * Set Task detail of the version.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Task Task detail of the version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTask(TriggerTask Task) {
        this.Task = Task;
    }

    public TriggerTaskVersionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerTaskVersionDetail(TriggerTaskVersionDetail source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.VersionNum != null) {
            this.VersionNum = new String(source.VersionNum);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.VersionRemark != null) {
            this.VersionRemark = new String(source.VersionRemark);
        }
        if (source.ApproveStatus != null) {
            this.ApproveStatus = new String(source.ApproveStatus);
        }
        if (source.ApproveTime != null) {
            this.ApproveTime = new String(source.ApproveTime);
        }
        if (source.ApproveUserUin != null) {
            this.ApproveUserUin = new String(source.ApproveUserUin);
        }
        if (source.Task != null) {
            this.Task = new TriggerTask(source.Task);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "VersionNum", this.VersionNum);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "VersionRemark", this.VersionRemark);
        this.setParamSimple(map, prefix + "ApproveStatus", this.ApproveStatus);
        this.setParamSimple(map, prefix + "ApproveTime", this.ApproveTime);
        this.setParamSimple(map, prefix + "ApproveUserUin", this.ApproveUserUin);
        this.setParamObj(map, prefix + "Task.", this.Task);

    }
}

