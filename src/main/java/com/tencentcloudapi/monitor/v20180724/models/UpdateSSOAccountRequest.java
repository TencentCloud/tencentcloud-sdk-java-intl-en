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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateSSOAccountRequest extends AbstractModel {

    /**
    * TCMG instance ID, such as “grafana-abcdefgh”.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * User account ID, such as “10000000”.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Permission
    */
    @SerializedName("Role")
    @Expose
    private GrafanaAccountRole [] Role;

    /**
    * Remarks
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
     * Get TCMG instance ID, such as “grafana-abcdefgh”. 
     * @return InstanceId TCMG instance ID, such as “grafana-abcdefgh”.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TCMG instance ID, such as “grafana-abcdefgh”.
     * @param InstanceId TCMG instance ID, such as “grafana-abcdefgh”.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get User account ID, such as “10000000”. 
     * @return UserId User account ID, such as “10000000”.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User account ID, such as “10000000”.
     * @param UserId User account ID, such as “10000000”.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Permission 
     * @return Role Permission
     */
    public GrafanaAccountRole [] getRole() {
        return this.Role;
    }

    /**
     * Set Permission
     * @param Role Permission
     */
    public void setRole(GrafanaAccountRole [] Role) {
        this.Role = Role;
    }

    /**
     * Get Remarks 
     * @return Notes Remarks
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set Remarks
     * @param Notes Remarks
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public UpdateSSOAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateSSOAccountRequest(UpdateSSOAccountRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Role != null) {
            this.Role = new GrafanaAccountRole[source.Role.length];
            for (int i = 0; i < source.Role.length; i++) {
                this.Role[i] = new GrafanaAccountRole(source.Role[i]);
            }
        }
        if (source.Notes != null) {
            this.Notes = new String(source.Notes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArrayObj(map, prefix + "Role.", this.Role);
        this.setParamSimple(map, prefix + "Notes", this.Notes);

    }
}

