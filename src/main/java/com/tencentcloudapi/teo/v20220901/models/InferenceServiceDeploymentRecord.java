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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceServiceDeploymentRecord extends AbstractModel {

    /**
    * Deployment record ID.
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * Deployment operation type, value:
<li>create: creation</li>
<li>update: refresh;</li>
<li>resume: enabled;</li>
<li>stop: disable.</li>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Deployment state. Valid values:
<li>processing: deployment in progress;</li>
<li>succeeded: Deployment successful;</li>
<li>failed: Deployment failed.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Deployment duration, unit: second.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Configuration for this service deployment.
    */
    @SerializedName("InferenceServiceConfig")
    @Expose
    private InferenceServiceConfig InferenceServiceConfig;

    /**
    * Deployment initiation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Whether the deployment configuration is the effective configuration. Value:
<li> active: effective configuration;</li>
<li> inactive: earlier version or abnormal version configuration.</li>
    */
    @SerializedName("ActiveStatus")
    @Expose
    private String ActiveStatus;

    /**
     * Get Deployment record ID. 
     * @return RecordId Deployment record ID.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Deployment record ID.
     * @param RecordId Deployment record ID.
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Deployment operation type, value:
<li>create: creation</li>
<li>update: refresh;</li>
<li>resume: enabled;</li>
<li>stop: disable.</li> 
     * @return Operation Deployment operation type, value:
<li>create: creation</li>
<li>update: refresh;</li>
<li>resume: enabled;</li>
<li>stop: disable.</li>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Deployment operation type, value:
<li>create: creation</li>
<li>update: refresh;</li>
<li>resume: enabled;</li>
<li>stop: disable.</li>
     * @param Operation Deployment operation type, value:
<li>create: creation</li>
<li>update: refresh;</li>
<li>resume: enabled;</li>
<li>stop: disable.</li>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Deployment state. Valid values:
<li>processing: deployment in progress;</li>
<li>succeeded: Deployment successful;</li>
<li>failed: Deployment failed.</li> 
     * @return Status Deployment state. Valid values:
<li>processing: deployment in progress;</li>
<li>succeeded: Deployment successful;</li>
<li>failed: Deployment failed.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Deployment state. Valid values:
<li>processing: deployment in progress;</li>
<li>succeeded: Deployment successful;</li>
<li>failed: Deployment failed.</li>
     * @param Status Deployment state. Valid values:
<li>processing: deployment in progress;</li>
<li>succeeded: Deployment successful;</li>
<li>failed: Deployment failed.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Deployment duration, unit: second. 
     * @return Duration Deployment duration, unit: second.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Deployment duration, unit: second.
     * @param Duration Deployment duration, unit: second.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Configuration for this service deployment. 
     * @return InferenceServiceConfig Configuration for this service deployment.
     */
    public InferenceServiceConfig getInferenceServiceConfig() {
        return this.InferenceServiceConfig;
    }

    /**
     * Set Configuration for this service deployment.
     * @param InferenceServiceConfig Configuration for this service deployment.
     */
    public void setInferenceServiceConfig(InferenceServiceConfig InferenceServiceConfig) {
        this.InferenceServiceConfig = InferenceServiceConfig;
    }

    /**
     * Get Deployment initiation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Deployment initiation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Deployment initiation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Deployment initiation time in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Whether the deployment configuration is the effective configuration. Value:
<li> active: effective configuration;</li>
<li> inactive: earlier version or abnormal version configuration.</li> 
     * @return ActiveStatus Whether the deployment configuration is the effective configuration. Value:
<li> active: effective configuration;</li>
<li> inactive: earlier version or abnormal version configuration.</li>
     */
    public String getActiveStatus() {
        return this.ActiveStatus;
    }

    /**
     * Set Whether the deployment configuration is the effective configuration. Value:
<li> active: effective configuration;</li>
<li> inactive: earlier version or abnormal version configuration.</li>
     * @param ActiveStatus Whether the deployment configuration is the effective configuration. Value:
<li> active: effective configuration;</li>
<li> inactive: earlier version or abnormal version configuration.</li>
     */
    public void setActiveStatus(String ActiveStatus) {
        this.ActiveStatus = ActiveStatus;
    }

    public InferenceServiceDeploymentRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceServiceDeploymentRecord(InferenceServiceDeploymentRecord source) {
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.InferenceServiceConfig != null) {
            this.InferenceServiceConfig = new InferenceServiceConfig(source.InferenceServiceConfig);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ActiveStatus != null) {
            this.ActiveStatus = new String(source.ActiveStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamObj(map, prefix + "InferenceServiceConfig.", this.InferenceServiceConfig);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ActiveStatus", this.ActiveStatus);

    }
}

