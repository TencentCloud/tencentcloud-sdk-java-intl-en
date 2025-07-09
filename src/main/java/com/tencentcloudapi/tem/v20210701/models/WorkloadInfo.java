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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkloadInfo extends AbstractModel {

    /**
    * The resource ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Version name
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * Number of ready replicas
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ReadyReplicas")
    @Expose
    private Long ReadyReplicas;

    /**
    * Number of replicas
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * Number of updated replicas
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("UpdatedReplicas")
    @Expose
    private Long UpdatedReplicas;

    /**
    * Number of replicas ready for update
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("UpdatedReadyReplicas")
    @Expose
    private Long UpdatedReadyReplicas;

    /**
    * ## Version Updates
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("UpdateRevision")
    @Expose
    private String UpdateRevision;

    /**
    * Current Version
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("CurrentRevision")
    @Expose
    private String CurrentRevision;

    /**
     * Get The resource ID.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ClusterId The resource ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The resource ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ClusterId The resource ID.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Application name
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ApplicationName Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ApplicationName Application name
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Version name
Note: This field may return `null`, indicating that no valid value was found. 
     * @return VersionName Version name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set Version name
Note: This field may return `null`, indicating that no valid value was found.
     * @param VersionName Version name
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get Number of ready replicas
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ReadyReplicas Number of ready replicas
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getReadyReplicas() {
        return this.ReadyReplicas;
    }

    /**
     * Set Number of ready replicas
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ReadyReplicas Number of ready replicas
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setReadyReplicas(Long ReadyReplicas) {
        this.ReadyReplicas = ReadyReplicas;
    }

    /**
     * Get Number of replicas
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Replicas Number of replicas
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set Number of replicas
Note: This field may return `null`, indicating that no valid value was found.
     * @param Replicas Number of replicas
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get Number of updated replicas
Note: This field may return `null`, indicating that no valid value was found. 
     * @return UpdatedReplicas Number of updated replicas
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getUpdatedReplicas() {
        return this.UpdatedReplicas;
    }

    /**
     * Set Number of updated replicas
Note: This field may return `null`, indicating that no valid value was found.
     * @param UpdatedReplicas Number of updated replicas
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setUpdatedReplicas(Long UpdatedReplicas) {
        this.UpdatedReplicas = UpdatedReplicas;
    }

    /**
     * Get Number of replicas ready for update
Note: This field may return `null`, indicating that no valid value was found. 
     * @return UpdatedReadyReplicas Number of replicas ready for update
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getUpdatedReadyReplicas() {
        return this.UpdatedReadyReplicas;
    }

    /**
     * Set Number of replicas ready for update
Note: This field may return `null`, indicating that no valid value was found.
     * @param UpdatedReadyReplicas Number of replicas ready for update
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setUpdatedReadyReplicas(Long UpdatedReadyReplicas) {
        this.UpdatedReadyReplicas = UpdatedReadyReplicas;
    }

    /**
     * Get ## Version Updates
Note: This field may return `null`, indicating that no valid value was found. 
     * @return UpdateRevision ## Version Updates
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getUpdateRevision() {
        return this.UpdateRevision;
    }

    /**
     * Set ## Version Updates
Note: This field may return `null`, indicating that no valid value was found.
     * @param UpdateRevision ## Version Updates
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setUpdateRevision(String UpdateRevision) {
        this.UpdateRevision = UpdateRevision;
    }

    /**
     * Get Current Version
Note: This field may return `null`, indicating that no valid value was found. 
     * @return CurrentRevision Current Version
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getCurrentRevision() {
        return this.CurrentRevision;
    }

    /**
     * Set Current Version
Note: This field may return `null`, indicating that no valid value was found.
     * @param CurrentRevision Current Version
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setCurrentRevision(String CurrentRevision) {
        this.CurrentRevision = CurrentRevision;
    }

    public WorkloadInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkloadInfo(WorkloadInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.ReadyReplicas != null) {
            this.ReadyReplicas = new Long(source.ReadyReplicas);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.UpdatedReplicas != null) {
            this.UpdatedReplicas = new Long(source.UpdatedReplicas);
        }
        if (source.UpdatedReadyReplicas != null) {
            this.UpdatedReadyReplicas = new Long(source.UpdatedReadyReplicas);
        }
        if (source.UpdateRevision != null) {
            this.UpdateRevision = new String(source.UpdateRevision);
        }
        if (source.CurrentRevision != null) {
            this.CurrentRevision = new String(source.CurrentRevision);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "ReadyReplicas", this.ReadyReplicas);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "UpdatedReplicas", this.UpdatedReplicas);
        this.setParamSimple(map, prefix + "UpdatedReadyReplicas", this.UpdatedReadyReplicas);
        this.setParamSimple(map, prefix + "UpdateRevision", this.UpdateRevision);
        this.setParamSimple(map, prefix + "CurrentRevision", this.CurrentRevision);

    }
}

