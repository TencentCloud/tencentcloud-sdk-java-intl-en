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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCertificateInstanceResponse extends AbstractModel {

    /**
    * Cloud resource deployment task ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DeployRecordId")
    @Expose
    private Long DeployRecordId;

    /**
    * Deployment status. 1 indicates that the deployment succeeded, and 0 indicates that the deployment failed.
    */
    @SerializedName("DeployStatus")
    @Expose
    private Long DeployStatus;

    /**
    * 
    */
    @SerializedName("UpdateSyncProgress")
    @Expose
    private UpdateSyncProgress [] UpdateSyncProgress;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Cloud resource deployment task ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DeployRecordId Cloud resource deployment task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDeployRecordId() {
        return this.DeployRecordId;
    }

    /**
     * Set Cloud resource deployment task ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DeployRecordId Cloud resource deployment task ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDeployRecordId(Long DeployRecordId) {
        this.DeployRecordId = DeployRecordId;
    }

    /**
     * Get Deployment status. 1 indicates that the deployment succeeded, and 0 indicates that the deployment failed. 
     * @return DeployStatus Deployment status. 1 indicates that the deployment succeeded, and 0 indicates that the deployment failed.
     */
    public Long getDeployStatus() {
        return this.DeployStatus;
    }

    /**
     * Set Deployment status. 1 indicates that the deployment succeeded, and 0 indicates that the deployment failed.
     * @param DeployStatus Deployment status. 1 indicates that the deployment succeeded, and 0 indicates that the deployment failed.
     */
    public void setDeployStatus(Long DeployStatus) {
        this.DeployStatus = DeployStatus;
    }

    /**
     * Get  
     * @return UpdateSyncProgress 
     */
    public UpdateSyncProgress [] getUpdateSyncProgress() {
        return this.UpdateSyncProgress;
    }

    /**
     * Set 
     * @param UpdateSyncProgress 
     */
    public void setUpdateSyncProgress(UpdateSyncProgress [] UpdateSyncProgress) {
        this.UpdateSyncProgress = UpdateSyncProgress;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public UpdateCertificateInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCertificateInstanceResponse(UpdateCertificateInstanceResponse source) {
        if (source.DeployRecordId != null) {
            this.DeployRecordId = new Long(source.DeployRecordId);
        }
        if (source.DeployStatus != null) {
            this.DeployStatus = new Long(source.DeployStatus);
        }
        if (source.UpdateSyncProgress != null) {
            this.UpdateSyncProgress = new UpdateSyncProgress[source.UpdateSyncProgress.length];
            for (int i = 0; i < source.UpdateSyncProgress.length; i++) {
                this.UpdateSyncProgress[i] = new UpdateSyncProgress(source.UpdateSyncProgress[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployRecordId", this.DeployRecordId);
        this.setParamSimple(map, prefix + "DeployStatus", this.DeployStatus);
        this.setParamArrayObj(map, prefix + "UpdateSyncProgress.", this.UpdateSyncProgress);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

