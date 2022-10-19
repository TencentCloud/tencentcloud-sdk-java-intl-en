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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GrafanaAccountInfo extends AbstractModel{

    /**
    * User account ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * User permission
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
    * Creation time
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * User’s root account UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
     * Get User account ID 
     * @return UserId User account ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User account ID
     * @param UserId User account ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get User permission 
     * @return Role User permission
     */
    public GrafanaAccountRole [] getRole() {
        return this.Role;
    }

    /**
     * Set User permission
     * @param Role User permission
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

    /**
     * Get Creation time 
     * @return CreateAt Creation time
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set Creation time
     * @param CreateAt Creation time
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get Instance ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get User’s root account UIN 
     * @return Uin User’s root account UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User’s root account UIN
     * @param Uin User’s root account UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    public GrafanaAccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrafanaAccountInfo(GrafanaAccountInfo source) {
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
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArrayObj(map, prefix + "Role.", this.Role);
        this.setParamSimple(map, prefix + "Notes", this.Notes);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

