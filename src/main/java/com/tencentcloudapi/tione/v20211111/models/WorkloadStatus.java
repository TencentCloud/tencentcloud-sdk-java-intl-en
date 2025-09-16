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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkloadStatus extends AbstractModel {

    /**
    * Number of current instances.
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * Number of updated instances.
    */
    @SerializedName("UpdatedReplicas")
    @Expose
    private Long UpdatedReplicas;

    /**
    * Number of ready instances.
    */
    @SerializedName("ReadyReplicas")
    @Expose
    private Long ReadyReplicas;

    /**
    * Number of available instances.
    */
    @SerializedName("AvailableReplicas")
    @Expose
    private Long AvailableReplicas;

    /**
    * Number of unavailable instances.
    */
    @SerializedName("UnavailableReplicas")
    @Expose
    private Long UnavailableReplicas;

    /**
    * Normal: running.Abnormal: service abnormalities, such as container startup failure.Waiting: service waiting, such as container image pulling.Stopped: stopped.Pending: starting.Stopping: stopping.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Workload status information.
    */
    @SerializedName("StatefulSetCondition")
    @Expose
    private StatefulSetCondition [] StatefulSetCondition;

    /**
    * Status information of workload history.
    */
    @SerializedName("Conditions")
    @Expose
    private StatefulSetCondition [] Conditions;

    /**
    * Display the reason when the status is abnormal.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get Number of current instances. 
     * @return Replicas Number of current instances.
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set Number of current instances.
     * @param Replicas Number of current instances.
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get Number of updated instances. 
     * @return UpdatedReplicas Number of updated instances.
     */
    public Long getUpdatedReplicas() {
        return this.UpdatedReplicas;
    }

    /**
     * Set Number of updated instances.
     * @param UpdatedReplicas Number of updated instances.
     */
    public void setUpdatedReplicas(Long UpdatedReplicas) {
        this.UpdatedReplicas = UpdatedReplicas;
    }

    /**
     * Get Number of ready instances. 
     * @return ReadyReplicas Number of ready instances.
     */
    public Long getReadyReplicas() {
        return this.ReadyReplicas;
    }

    /**
     * Set Number of ready instances.
     * @param ReadyReplicas Number of ready instances.
     */
    public void setReadyReplicas(Long ReadyReplicas) {
        this.ReadyReplicas = ReadyReplicas;
    }

    /**
     * Get Number of available instances. 
     * @return AvailableReplicas Number of available instances.
     */
    public Long getAvailableReplicas() {
        return this.AvailableReplicas;
    }

    /**
     * Set Number of available instances.
     * @param AvailableReplicas Number of available instances.
     */
    public void setAvailableReplicas(Long AvailableReplicas) {
        this.AvailableReplicas = AvailableReplicas;
    }

    /**
     * Get Number of unavailable instances. 
     * @return UnavailableReplicas Number of unavailable instances.
     */
    public Long getUnavailableReplicas() {
        return this.UnavailableReplicas;
    }

    /**
     * Set Number of unavailable instances.
     * @param UnavailableReplicas Number of unavailable instances.
     */
    public void setUnavailableReplicas(Long UnavailableReplicas) {
        this.UnavailableReplicas = UnavailableReplicas;
    }

    /**
     * Get Normal: running.Abnormal: service abnormalities, such as container startup failure.Waiting: service waiting, such as container image pulling.Stopped: stopped.Pending: starting.Stopping: stopping. 
     * @return Status Normal: running.Abnormal: service abnormalities, such as container startup failure.Waiting: service waiting, such as container image pulling.Stopped: stopped.Pending: starting.Stopping: stopping.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Normal: running.Abnormal: service abnormalities, such as container startup failure.Waiting: service waiting, such as container image pulling.Stopped: stopped.Pending: starting.Stopping: stopping.
     * @param Status Normal: running.Abnormal: service abnormalities, such as container startup failure.Waiting: service waiting, such as container image pulling.Stopped: stopped.Pending: starting.Stopping: stopping.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Workload status information. 
     * @return StatefulSetCondition Workload status information.
     * @deprecated
     */
    @Deprecated
    public StatefulSetCondition [] getStatefulSetCondition() {
        return this.StatefulSetCondition;
    }

    /**
     * Set Workload status information.
     * @param StatefulSetCondition Workload status information.
     * @deprecated
     */
    @Deprecated
    public void setStatefulSetCondition(StatefulSetCondition [] StatefulSetCondition) {
        this.StatefulSetCondition = StatefulSetCondition;
    }

    /**
     * Get Status information of workload history. 
     * @return Conditions Status information of workload history.
     */
    public StatefulSetCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set Status information of workload history.
     * @param Conditions Status information of workload history.
     */
    public void setConditions(StatefulSetCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get Display the reason when the status is abnormal.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Reason Display the reason when the status is abnormal.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Display the reason when the status is abnormal.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Reason Display the reason when the status is abnormal.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public WorkloadStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkloadStatus(WorkloadStatus source) {
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.UpdatedReplicas != null) {
            this.UpdatedReplicas = new Long(source.UpdatedReplicas);
        }
        if (source.ReadyReplicas != null) {
            this.ReadyReplicas = new Long(source.ReadyReplicas);
        }
        if (source.AvailableReplicas != null) {
            this.AvailableReplicas = new Long(source.AvailableReplicas);
        }
        if (source.UnavailableReplicas != null) {
            this.UnavailableReplicas = new Long(source.UnavailableReplicas);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatefulSetCondition != null) {
            this.StatefulSetCondition = new StatefulSetCondition[source.StatefulSetCondition.length];
            for (int i = 0; i < source.StatefulSetCondition.length; i++) {
                this.StatefulSetCondition[i] = new StatefulSetCondition(source.StatefulSetCondition[i]);
            }
        }
        if (source.Conditions != null) {
            this.Conditions = new StatefulSetCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new StatefulSetCondition(source.Conditions[i]);
            }
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "UpdatedReplicas", this.UpdatedReplicas);
        this.setParamSimple(map, prefix + "ReadyReplicas", this.ReadyReplicas);
        this.setParamSimple(map, prefix + "AvailableReplicas", this.AvailableReplicas);
        this.setParamSimple(map, prefix + "UnavailableReplicas", this.UnavailableReplicas);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "StatefulSetCondition.", this.StatefulSetCondition);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

