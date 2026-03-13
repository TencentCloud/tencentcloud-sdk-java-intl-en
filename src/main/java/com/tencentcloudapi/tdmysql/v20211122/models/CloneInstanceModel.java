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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneInstanceModel extends AbstractModel {

    /**
    * Clone task end time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloneEndTime")
    @Expose
    private String CloneEndTime;

    /**
    * Clone record ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloneId")
    @Expose
    private Long CloneId;

    /**
    * Clone instance type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloneInsType")
    @Expose
    private String CloneInsType;

    /**
    * Clone instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloneInstanceId")
    @Expose
    private String CloneInstanceId;

    /**
    * Whether the clone instance is deleted.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloneInstanceIsDeleted")
    @Expose
    private Boolean CloneInstanceIsDeleted;

    /**
    * Task progress of clone.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloneProgress")
    @Expose
    private Float CloneProgress;

    /**
    * Task start time of the clone.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloneStartTime")
    @Expose
    private String CloneStartTime;

    /**
    * Task status.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloneStatus")
    @Expose
    private String CloneStatus;

    /**
    * Clone time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloneTime")
    @Expose
    private String CloneTime;

    /**
    * Clone type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CloneType")
    @Expose
    private String CloneType;

    /**
    * Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Engine type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DBType")
    @Expose
    private String DBType;

    /**
    * Region.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Source instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceInstanceId")
    @Expose
    private String SourceInstanceId;

    /**
     * Get Clone task end time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloneEndTime Clone task end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCloneEndTime() {
        return this.CloneEndTime;
    }

    /**
     * Set Clone task end time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloneEndTime Clone task end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCloneEndTime(String CloneEndTime) {
        this.CloneEndTime = CloneEndTime;
    }

    /**
     * Get Clone record ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloneId Clone record ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCloneId() {
        return this.CloneId;
    }

    /**
     * Set Clone record ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloneId Clone record ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCloneId(Long CloneId) {
        this.CloneId = CloneId;
    }

    /**
     * Get Clone instance type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloneInsType Clone instance type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCloneInsType() {
        return this.CloneInsType;
    }

    /**
     * Set Clone instance type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloneInsType Clone instance type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCloneInsType(String CloneInsType) {
        this.CloneInsType = CloneInsType;
    }

    /**
     * Get Clone instance ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloneInstanceId Clone instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCloneInstanceId() {
        return this.CloneInstanceId;
    }

    /**
     * Set Clone instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloneInstanceId Clone instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCloneInstanceId(String CloneInstanceId) {
        this.CloneInstanceId = CloneInstanceId;
    }

    /**
     * Get Whether the clone instance is deleted.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloneInstanceIsDeleted Whether the clone instance is deleted.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getCloneInstanceIsDeleted() {
        return this.CloneInstanceIsDeleted;
    }

    /**
     * Set Whether the clone instance is deleted.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloneInstanceIsDeleted Whether the clone instance is deleted.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCloneInstanceIsDeleted(Boolean CloneInstanceIsDeleted) {
        this.CloneInstanceIsDeleted = CloneInstanceIsDeleted;
    }

    /**
     * Get Task progress of clone.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloneProgress Task progress of clone.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getCloneProgress() {
        return this.CloneProgress;
    }

    /**
     * Set Task progress of clone.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloneProgress Task progress of clone.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCloneProgress(Float CloneProgress) {
        this.CloneProgress = CloneProgress;
    }

    /**
     * Get Task start time of the clone.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloneStartTime Task start time of the clone.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCloneStartTime() {
        return this.CloneStartTime;
    }

    /**
     * Set Task start time of the clone.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloneStartTime Task start time of the clone.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCloneStartTime(String CloneStartTime) {
        this.CloneStartTime = CloneStartTime;
    }

    /**
     * Get Task status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloneStatus Task status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCloneStatus() {
        return this.CloneStatus;
    }

    /**
     * Set Task status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloneStatus Task status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCloneStatus(String CloneStatus) {
        this.CloneStatus = CloneStatus;
    }

    /**
     * Get Clone time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloneTime Clone time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCloneTime() {
        return this.CloneTime;
    }

    /**
     * Set Clone time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloneTime Clone time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCloneTime(String CloneTime) {
        this.CloneTime = CloneTime;
    }

    /**
     * Get Clone type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CloneType Clone type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCloneType() {
        return this.CloneType;
    }

    /**
     * Set Clone type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CloneType Clone type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCloneType(String CloneType) {
        this.CloneType = CloneType;
    }

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
     * Get Engine type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DBType Engine type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * Set Engine type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DBType Engine type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDBType(String DBType) {
        this.DBType = DBType;
    }

    /**
     * Get Region.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Source instance ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceInstanceId Source instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSourceInstanceId() {
        return this.SourceInstanceId;
    }

    /**
     * Set Source instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceInstanceId Source instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceInstanceId(String SourceInstanceId) {
        this.SourceInstanceId = SourceInstanceId;
    }

    public CloneInstanceModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneInstanceModel(CloneInstanceModel source) {
        if (source.CloneEndTime != null) {
            this.CloneEndTime = new String(source.CloneEndTime);
        }
        if (source.CloneId != null) {
            this.CloneId = new Long(source.CloneId);
        }
        if (source.CloneInsType != null) {
            this.CloneInsType = new String(source.CloneInsType);
        }
        if (source.CloneInstanceId != null) {
            this.CloneInstanceId = new String(source.CloneInstanceId);
        }
        if (source.CloneInstanceIsDeleted != null) {
            this.CloneInstanceIsDeleted = new Boolean(source.CloneInstanceIsDeleted);
        }
        if (source.CloneProgress != null) {
            this.CloneProgress = new Float(source.CloneProgress);
        }
        if (source.CloneStartTime != null) {
            this.CloneStartTime = new String(source.CloneStartTime);
        }
        if (source.CloneStatus != null) {
            this.CloneStatus = new String(source.CloneStatus);
        }
        if (source.CloneTime != null) {
            this.CloneTime = new String(source.CloneTime);
        }
        if (source.CloneType != null) {
            this.CloneType = new String(source.CloneType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DBType != null) {
            this.DBType = new String(source.DBType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SourceInstanceId != null) {
            this.SourceInstanceId = new String(source.SourceInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloneEndTime", this.CloneEndTime);
        this.setParamSimple(map, prefix + "CloneId", this.CloneId);
        this.setParamSimple(map, prefix + "CloneInsType", this.CloneInsType);
        this.setParamSimple(map, prefix + "CloneInstanceId", this.CloneInstanceId);
        this.setParamSimple(map, prefix + "CloneInstanceIsDeleted", this.CloneInstanceIsDeleted);
        this.setParamSimple(map, prefix + "CloneProgress", this.CloneProgress);
        this.setParamSimple(map, prefix + "CloneStartTime", this.CloneStartTime);
        this.setParamSimple(map, prefix + "CloneStatus", this.CloneStatus);
        this.setParamSimple(map, prefix + "CloneTime", this.CloneTime);
        this.setParamSimple(map, prefix + "CloneType", this.CloneType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DBType", this.DBType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SourceInstanceId", this.SourceInstanceId);

    }
}

