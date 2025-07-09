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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRoleResponse extends AbstractModel {

    /**
    * Role name
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * Role token
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * Remarks
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Namespaces that are bound in batches
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentRoleSets")
    @Expose
    private EnvironmentRoleSet [] EnvironmentRoleSets;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Role name 
     * @return RoleName Role name
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name
     * @param RoleName Role name
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get Role token 
     * @return Token Role token
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set Role token
     * @param Token Role token
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get Remarks
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Namespaces that are bound in batches
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return EnvironmentRoleSets Namespaces that are bound in batches
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public EnvironmentRoleSet [] getEnvironmentRoleSets() {
        return this.EnvironmentRoleSets;
    }

    /**
     * Set Namespaces that are bound in batches
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param EnvironmentRoleSets Namespaces that are bound in batches
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setEnvironmentRoleSets(EnvironmentRoleSet [] EnvironmentRoleSets) {
        this.EnvironmentRoleSets = EnvironmentRoleSets;
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

    public CreateRoleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoleResponse(CreateRoleResponse source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.EnvironmentRoleSets != null) {
            this.EnvironmentRoleSets = new EnvironmentRoleSet[source.EnvironmentRoleSets.length];
            for (int i = 0; i < source.EnvironmentRoleSets.length; i++) {
                this.EnvironmentRoleSets[i] = new EnvironmentRoleSet(source.EnvironmentRoleSets[i]);
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
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "EnvironmentRoleSets.", this.EnvironmentRoleSets);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

