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

public class TaskVersionInstance extends AbstractModel {

    /**
    * Instance Version Number
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceVersion")
    @Expose
    private Long InstanceVersion;

    /**
    * Instance Description
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("VersionDesc")
    @Expose
    private String VersionDesc;

    /**
    * 0, "Add",1, "Modify"
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ChangeType")
    @Expose
    private Long ChangeType;

    /**
    * Version Submitter UIN
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("SubmitterUin")
    @Expose
    private String SubmitterUin;

    /**
    * Submission Date
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceDate")
    @Expose
    private String InstanceDate;

    /**
    * 0, "Disabled",1, "Enabled (Production)"
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
     * Get Instance Version Number
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceVersion Instance Version Number
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set Instance Version Number
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceVersion Instance Version Number
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceVersion(Long InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get Instance Description
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return VersionDesc Instance Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getVersionDesc() {
        return this.VersionDesc;
    }

    /**
     * Set Instance Description
Note: This field may return null, indicating that no valid value can be obtained.
     * @param VersionDesc Instance Description
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setVersionDesc(String VersionDesc) {
        this.VersionDesc = VersionDesc;
    }

    /**
     * Get 0, "Add",1, "Modify"
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ChangeType 0, "Add",1, "Modify"
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getChangeType() {
        return this.ChangeType;
    }

    /**
     * Set 0, "Add",1, "Modify"
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ChangeType 0, "Add",1, "Modify"
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setChangeType(Long ChangeType) {
        this.ChangeType = ChangeType;
    }

    /**
     * Get Version Submitter UIN
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return SubmitterUin Version Submitter UIN
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSubmitterUin() {
        return this.SubmitterUin;
    }

    /**
     * Set Version Submitter UIN
Note: This field may return null, indicating that no valid value can be obtained.
     * @param SubmitterUin Version Submitter UIN
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubmitterUin(String SubmitterUin) {
        this.SubmitterUin = SubmitterUin;
    }

    /**
     * Get Submission Date
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceDate Submission Date
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceDate() {
        return this.InstanceDate;
    }

    /**
     * Set Submission Date
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceDate Submission Date
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceDate(String InstanceDate) {
        this.InstanceDate = InstanceDate;
    }

    /**
     * Get 0, "Disabled",1, "Enabled (Production)"
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceStatus 0, "Disabled",1, "Enabled (Production)"
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 0, "Disabled",1, "Enabled (Production)"
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceStatus 0, "Disabled",1, "Enabled (Production)"
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    public TaskVersionInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskVersionInstance(TaskVersionInstance source) {
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new Long(source.InstanceVersion);
        }
        if (source.VersionDesc != null) {
            this.VersionDesc = new String(source.VersionDesc);
        }
        if (source.ChangeType != null) {
            this.ChangeType = new Long(source.ChangeType);
        }
        if (source.SubmitterUin != null) {
            this.SubmitterUin = new String(source.SubmitterUin);
        }
        if (source.InstanceDate != null) {
            this.InstanceDate = new String(source.InstanceDate);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "VersionDesc", this.VersionDesc);
        this.setParamSimple(map, prefix + "ChangeType", this.ChangeType);
        this.setParamSimple(map, prefix + "SubmitterUin", this.SubmitterUin);
        this.setParamSimple(map, prefix + "InstanceDate", this.InstanceDate);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);

    }
}

