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

public class ModifyPolicyRequest extends AbstractModel {

    /**
    * Project id for modifying permission configuration.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Remote device id for modifying permission configuration.
    */
    @SerializedName("RemoteDeviceId")
    @Expose
    private String RemoteDeviceId;

    /**
    * Array of on-site device ids involved in permission modification.
    */
    @SerializedName("FieldDeviceIds")
    @Expose
    private String [] FieldDeviceIds;

    /**
    * The target permission mode to modify, black for blocklist, white for allowlist.
    */
    @SerializedName("PolicyMode")
    @Expose
    private String PolicyMode;

    /**
    * Modification mode, add for adding (associating on-site devices), remove for deletion (dissociating on-site devices), set for setting (updating on-site device association).
    */
    @SerializedName("ModifyMode")
    @Expose
    private String ModifyMode;

    /**
     * Get Project id for modifying permission configuration. 
     * @return ProjectId Project id for modifying permission configuration.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project id for modifying permission configuration.
     * @param ProjectId Project id for modifying permission configuration.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Remote device id for modifying permission configuration. 
     * @return RemoteDeviceId Remote device id for modifying permission configuration.
     */
    public String getRemoteDeviceId() {
        return this.RemoteDeviceId;
    }

    /**
     * Set Remote device id for modifying permission configuration.
     * @param RemoteDeviceId Remote device id for modifying permission configuration.
     */
    public void setRemoteDeviceId(String RemoteDeviceId) {
        this.RemoteDeviceId = RemoteDeviceId;
    }

    /**
     * Get Array of on-site device ids involved in permission modification. 
     * @return FieldDeviceIds Array of on-site device ids involved in permission modification.
     */
    public String [] getFieldDeviceIds() {
        return this.FieldDeviceIds;
    }

    /**
     * Set Array of on-site device ids involved in permission modification.
     * @param FieldDeviceIds Array of on-site device ids involved in permission modification.
     */
    public void setFieldDeviceIds(String [] FieldDeviceIds) {
        this.FieldDeviceIds = FieldDeviceIds;
    }

    /**
     * Get The target permission mode to modify, black for blocklist, white for allowlist. 
     * @return PolicyMode The target permission mode to modify, black for blocklist, white for allowlist.
     */
    public String getPolicyMode() {
        return this.PolicyMode;
    }

    /**
     * Set The target permission mode to modify, black for blocklist, white for allowlist.
     * @param PolicyMode The target permission mode to modify, black for blocklist, white for allowlist.
     */
    public void setPolicyMode(String PolicyMode) {
        this.PolicyMode = PolicyMode;
    }

    /**
     * Get Modification mode, add for adding (associating on-site devices), remove for deletion (dissociating on-site devices), set for setting (updating on-site device association). 
     * @return ModifyMode Modification mode, add for adding (associating on-site devices), remove for deletion (dissociating on-site devices), set for setting (updating on-site device association).
     */
    public String getModifyMode() {
        return this.ModifyMode;
    }

    /**
     * Set Modification mode, add for adding (associating on-site devices), remove for deletion (dissociating on-site devices), set for setting (updating on-site device association).
     * @param ModifyMode Modification mode, add for adding (associating on-site devices), remove for deletion (dissociating on-site devices), set for setting (updating on-site device association).
     */
    public void setModifyMode(String ModifyMode) {
        this.ModifyMode = ModifyMode;
    }

    public ModifyPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPolicyRequest(ModifyPolicyRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RemoteDeviceId != null) {
            this.RemoteDeviceId = new String(source.RemoteDeviceId);
        }
        if (source.FieldDeviceIds != null) {
            this.FieldDeviceIds = new String[source.FieldDeviceIds.length];
            for (int i = 0; i < source.FieldDeviceIds.length; i++) {
                this.FieldDeviceIds[i] = new String(source.FieldDeviceIds[i]);
            }
        }
        if (source.PolicyMode != null) {
            this.PolicyMode = new String(source.PolicyMode);
        }
        if (source.ModifyMode != null) {
            this.ModifyMode = new String(source.ModifyMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RemoteDeviceId", this.RemoteDeviceId);
        this.setParamArraySimple(map, prefix + "FieldDeviceIds.", this.FieldDeviceIds);
        this.setParamSimple(map, prefix + "PolicyMode", this.PolicyMode);
        this.setParamSimple(map, prefix + "ModifyMode", this.ModifyMode);

    }
}

