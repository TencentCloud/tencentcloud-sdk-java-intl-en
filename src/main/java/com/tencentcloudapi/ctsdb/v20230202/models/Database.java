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
package com.tencentcloudapi.ctsdb.v20230202.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Database extends AbstractModel {

    /**
    * Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * Database name.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Cold storage time (days).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoolDownInDays")
    @Expose
    private Long CoolDownInDays;

    /**
    * Data retention time (days).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RetentionInDays")
    @Expose
    private Long RetentionInDays;

    /**
    * Remarks.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Status. 0: initializing resources; 1: creating resources; 2: normal status; 3: deleting resources; 4: deleted resources; 5: disabling resources; 6: disabled resources; 7: abnormal resources, and manual operation is required.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Last modification time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get Instance ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterID Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterID Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get Database name.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Database name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Database name.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Database name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Cold storage time (days).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CoolDownInDays Cold storage time (days).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCoolDownInDays() {
        return this.CoolDownInDays;
    }

    /**
     * Set Cold storage time (days).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CoolDownInDays Cold storage time (days).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCoolDownInDays(Long CoolDownInDays) {
        this.CoolDownInDays = CoolDownInDays;
    }

    /**
     * Get Data retention time (days).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RetentionInDays Data retention time (days).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRetentionInDays() {
        return this.RetentionInDays;
    }

    /**
     * Set Data retention time (days).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RetentionInDays Data retention time (days).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRetentionInDays(Long RetentionInDays) {
        this.RetentionInDays = RetentionInDays;
    }

    /**
     * Get Remarks.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Status. 0: initializing resources; 1: creating resources; 2: normal status; 3: deleting resources; 4: deleted resources; 5: disabling resources; 6: disabled resources; 7: abnormal resources, and manual operation is required.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Status. 0: initializing resources; 1: creating resources; 2: normal status; 3: deleting resources; 4: deleted resources; 5: disabling resources; 6: disabled resources; 7: abnormal resources, and manual operation is required.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: initializing resources; 1: creating resources; 2: normal status; 3: deleting resources; 4: deleted resources; 5: disabling resources; 6: disabled resources; 7: abnormal resources, and manual operation is required.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Status. 0: initializing resources; 1: creating resources; 2: normal status; 3: deleting resources; 4: deleted resources; 5: disabling resources; 6: disabled resources; 7: abnormal resources, and manual operation is required.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedAt Creation time.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedAt Creation time.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Last modification time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedAt Last modification time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Last modification time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdatedAt Last modification time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public Database() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Database(Database source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CoolDownInDays != null) {
            this.CoolDownInDays = new Long(source.CoolDownInDays);
        }
        if (source.RetentionInDays != null) {
            this.RetentionInDays = new Long(source.RetentionInDays);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CoolDownInDays", this.CoolDownInDays);
        this.setParamSimple(map, prefix + "RetentionInDays", this.RetentionInDays);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

