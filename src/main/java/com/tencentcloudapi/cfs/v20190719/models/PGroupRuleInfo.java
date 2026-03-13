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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PGroupRuleInfo extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Client IP allowed for access
    */
    @SerializedName("AuthClientIp")
    @Expose
    private String AuthClientIp;

    /**
    * Read/write permission. ro: read-only; rw: read & write
    */
    @SerializedName("RWPermission")
    @Expose
    private String RWPermission;

    /**
    * All_squash: all accessing users (including the root user) will be mapped to anonymous users or groups.
no_all_squash: all accessing users (including the root user) retain original UID/GID information.
root_squash: maps visiting root user to anonymous user or user group. non-root user keeps original UID/GID information.
no_root_squash: has the same effect as no_all_squash. all accessing users (including the root user) retain their original UID/GID information.

    */
    @SerializedName("UserPermission")
    @Expose
    private String UserPermission;

    /**
    * Rule priority. Value range: 1-100. 1 represents the highest priority, while 100 the lowest
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get Rule ID 
     * @return RuleId Rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
     * @param RuleId Rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Client IP allowed for access 
     * @return AuthClientIp Client IP allowed for access
     */
    public String getAuthClientIp() {
        return this.AuthClientIp;
    }

    /**
     * Set Client IP allowed for access
     * @param AuthClientIp Client IP allowed for access
     */
    public void setAuthClientIp(String AuthClientIp) {
        this.AuthClientIp = AuthClientIp;
    }

    /**
     * Get Read/write permission. ro: read-only; rw: read & write 
     * @return RWPermission Read/write permission. ro: read-only; rw: read & write
     */
    public String getRWPermission() {
        return this.RWPermission;
    }

    /**
     * Set Read/write permission. ro: read-only; rw: read & write
     * @param RWPermission Read/write permission. ro: read-only; rw: read & write
     */
    public void setRWPermission(String RWPermission) {
        this.RWPermission = RWPermission;
    }

    /**
     * Get All_squash: all accessing users (including the root user) will be mapped to anonymous users or groups.
no_all_squash: all accessing users (including the root user) retain original UID/GID information.
root_squash: maps visiting root user to anonymous user or user group. non-root user keeps original UID/GID information.
no_root_squash: has the same effect as no_all_squash. all accessing users (including the root user) retain their original UID/GID information.
 
     * @return UserPermission All_squash: all accessing users (including the root user) will be mapped to anonymous users or groups.
no_all_squash: all accessing users (including the root user) retain original UID/GID information.
root_squash: maps visiting root user to anonymous user or user group. non-root user keeps original UID/GID information.
no_root_squash: has the same effect as no_all_squash. all accessing users (including the root user) retain their original UID/GID information.

     */
    public String getUserPermission() {
        return this.UserPermission;
    }

    /**
     * Set All_squash: all accessing users (including the root user) will be mapped to anonymous users or groups.
no_all_squash: all accessing users (including the root user) retain original UID/GID information.
root_squash: maps visiting root user to anonymous user or user group. non-root user keeps original UID/GID information.
no_root_squash: has the same effect as no_all_squash. all accessing users (including the root user) retain their original UID/GID information.

     * @param UserPermission All_squash: all accessing users (including the root user) will be mapped to anonymous users or groups.
no_all_squash: all accessing users (including the root user) retain original UID/GID information.
root_squash: maps visiting root user to anonymous user or user group. non-root user keeps original UID/GID information.
no_root_squash: has the same effect as no_all_squash. all accessing users (including the root user) retain their original UID/GID information.

     */
    public void setUserPermission(String UserPermission) {
        this.UserPermission = UserPermission;
    }

    /**
     * Get Rule priority. Value range: 1-100. 1 represents the highest priority, while 100 the lowest 
     * @return Priority Rule priority. Value range: 1-100. 1 represents the highest priority, while 100 the lowest
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Rule priority. Value range: 1-100. 1 represents the highest priority, while 100 the lowest
     * @param Priority Rule priority. Value range: 1-100. 1 represents the highest priority, while 100 the lowest
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public PGroupRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PGroupRuleInfo(PGroupRuleInfo source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.AuthClientIp != null) {
            this.AuthClientIp = new String(source.AuthClientIp);
        }
        if (source.RWPermission != null) {
            this.RWPermission = new String(source.RWPermission);
        }
        if (source.UserPermission != null) {
            this.UserPermission = new String(source.UserPermission);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AuthClientIp", this.AuthClientIp);
        this.setParamSimple(map, prefix + "RWPermission", this.RWPermission);
        this.setParamSimple(map, prefix + "UserPermission", this.UserPermission);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

