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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchDeletePolicyRequest extends AbstractModel {

    /**
    * Project id of the deleted permission configuration.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Remote device id list of the deleted permission configuration.
    */
    @SerializedName("RemoteDeviceIds")
    @Expose
    private String [] RemoteDeviceIds;

    /**
    * Permission mode of the deleted permission configuration, black for blocklist, white for allowlist.
    */
    @SerializedName("PolicyMode")
    @Expose
    private String PolicyMode;

    /**
     * Get Project id of the deleted permission configuration. 
     * @return ProjectId Project id of the deleted permission configuration.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project id of the deleted permission configuration.
     * @param ProjectId Project id of the deleted permission configuration.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Remote device id list of the deleted permission configuration. 
     * @return RemoteDeviceIds Remote device id list of the deleted permission configuration.
     */
    public String [] getRemoteDeviceIds() {
        return this.RemoteDeviceIds;
    }

    /**
     * Set Remote device id list of the deleted permission configuration.
     * @param RemoteDeviceIds Remote device id list of the deleted permission configuration.
     */
    public void setRemoteDeviceIds(String [] RemoteDeviceIds) {
        this.RemoteDeviceIds = RemoteDeviceIds;
    }

    /**
     * Get Permission mode of the deleted permission configuration, black for blocklist, white for allowlist. 
     * @return PolicyMode Permission mode of the deleted permission configuration, black for blocklist, white for allowlist.
     */
    public String getPolicyMode() {
        return this.PolicyMode;
    }

    /**
     * Set Permission mode of the deleted permission configuration, black for blocklist, white for allowlist.
     * @param PolicyMode Permission mode of the deleted permission configuration, black for blocklist, white for allowlist.
     */
    public void setPolicyMode(String PolicyMode) {
        this.PolicyMode = PolicyMode;
    }

    public BatchDeletePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDeletePolicyRequest(BatchDeletePolicyRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RemoteDeviceIds != null) {
            this.RemoteDeviceIds = new String[source.RemoteDeviceIds.length];
            for (int i = 0; i < source.RemoteDeviceIds.length; i++) {
                this.RemoteDeviceIds[i] = new String(source.RemoteDeviceIds[i]);
            }
        }
        if (source.PolicyMode != null) {
            this.PolicyMode = new String(source.PolicyMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "RemoteDeviceIds.", this.RemoteDeviceIds);
        this.setParamSimple(map, prefix + "PolicyMode", this.PolicyMode);

    }
}

