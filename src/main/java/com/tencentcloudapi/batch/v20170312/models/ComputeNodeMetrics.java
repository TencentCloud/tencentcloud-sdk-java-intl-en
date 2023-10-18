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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComputeNodeMetrics extends AbstractModel {

    /**
    * Number of compute nodes that have been submitted
    */
    @SerializedName("SubmittedCount")
    @Expose
    private Long SubmittedCount;

    /**
    * Number of compute nodes that are being created
    */
    @SerializedName("CreatingCount")
    @Expose
    private Long CreatingCount;

    /**
    * Number of compute nodes that failed to be created
    */
    @SerializedName("CreationFailedCount")
    @Expose
    private Long CreationFailedCount;

    /**
    * Number of compute nodes that have been created
    */
    @SerializedName("CreatedCount")
    @Expose
    private Long CreatedCount;

    /**
    * Number of running compute nodes
    */
    @SerializedName("RunningCount")
    @Expose
    private Long RunningCount;

    /**
    * Number of compute nodes that are being terminated
    */
    @SerializedName("DeletingCount")
    @Expose
    private Long DeletingCount;

    /**
    * Number of exceptional compute nodes
    */
    @SerializedName("AbnormalCount")
    @Expose
    private Long AbnormalCount;

    /**
     * Get Number of compute nodes that have been submitted 
     * @return SubmittedCount Number of compute nodes that have been submitted
     */
    public Long getSubmittedCount() {
        return this.SubmittedCount;
    }

    /**
     * Set Number of compute nodes that have been submitted
     * @param SubmittedCount Number of compute nodes that have been submitted
     */
    public void setSubmittedCount(Long SubmittedCount) {
        this.SubmittedCount = SubmittedCount;
    }

    /**
     * Get Number of compute nodes that are being created 
     * @return CreatingCount Number of compute nodes that are being created
     */
    public Long getCreatingCount() {
        return this.CreatingCount;
    }

    /**
     * Set Number of compute nodes that are being created
     * @param CreatingCount Number of compute nodes that are being created
     */
    public void setCreatingCount(Long CreatingCount) {
        this.CreatingCount = CreatingCount;
    }

    /**
     * Get Number of compute nodes that failed to be created 
     * @return CreationFailedCount Number of compute nodes that failed to be created
     */
    public Long getCreationFailedCount() {
        return this.CreationFailedCount;
    }

    /**
     * Set Number of compute nodes that failed to be created
     * @param CreationFailedCount Number of compute nodes that failed to be created
     */
    public void setCreationFailedCount(Long CreationFailedCount) {
        this.CreationFailedCount = CreationFailedCount;
    }

    /**
     * Get Number of compute nodes that have been created 
     * @return CreatedCount Number of compute nodes that have been created
     */
    public Long getCreatedCount() {
        return this.CreatedCount;
    }

    /**
     * Set Number of compute nodes that have been created
     * @param CreatedCount Number of compute nodes that have been created
     */
    public void setCreatedCount(Long CreatedCount) {
        this.CreatedCount = CreatedCount;
    }

    /**
     * Get Number of running compute nodes 
     * @return RunningCount Number of running compute nodes
     */
    public Long getRunningCount() {
        return this.RunningCount;
    }

    /**
     * Set Number of running compute nodes
     * @param RunningCount Number of running compute nodes
     */
    public void setRunningCount(Long RunningCount) {
        this.RunningCount = RunningCount;
    }

    /**
     * Get Number of compute nodes that are being terminated 
     * @return DeletingCount Number of compute nodes that are being terminated
     */
    public Long getDeletingCount() {
        return this.DeletingCount;
    }

    /**
     * Set Number of compute nodes that are being terminated
     * @param DeletingCount Number of compute nodes that are being terminated
     */
    public void setDeletingCount(Long DeletingCount) {
        this.DeletingCount = DeletingCount;
    }

    /**
     * Get Number of exceptional compute nodes 
     * @return AbnormalCount Number of exceptional compute nodes
     */
    public Long getAbnormalCount() {
        return this.AbnormalCount;
    }

    /**
     * Set Number of exceptional compute nodes
     * @param AbnormalCount Number of exceptional compute nodes
     */
    public void setAbnormalCount(Long AbnormalCount) {
        this.AbnormalCount = AbnormalCount;
    }

    public ComputeNodeMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComputeNodeMetrics(ComputeNodeMetrics source) {
        if (source.SubmittedCount != null) {
            this.SubmittedCount = new Long(source.SubmittedCount);
        }
        if (source.CreatingCount != null) {
            this.CreatingCount = new Long(source.CreatingCount);
        }
        if (source.CreationFailedCount != null) {
            this.CreationFailedCount = new Long(source.CreationFailedCount);
        }
        if (source.CreatedCount != null) {
            this.CreatedCount = new Long(source.CreatedCount);
        }
        if (source.RunningCount != null) {
            this.RunningCount = new Long(source.RunningCount);
        }
        if (source.DeletingCount != null) {
            this.DeletingCount = new Long(source.DeletingCount);
        }
        if (source.AbnormalCount != null) {
            this.AbnormalCount = new Long(source.AbnormalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubmittedCount", this.SubmittedCount);
        this.setParamSimple(map, prefix + "CreatingCount", this.CreatingCount);
        this.setParamSimple(map, prefix + "CreationFailedCount", this.CreationFailedCount);
        this.setParamSimple(map, prefix + "CreatedCount", this.CreatedCount);
        this.setParamSimple(map, prefix + "RunningCount", this.RunningCount);
        this.setParamSimple(map, prefix + "DeletingCount", this.DeletingCount);
        this.setParamSimple(map, prefix + "AbnormalCount", this.AbnormalCount);

    }
}

