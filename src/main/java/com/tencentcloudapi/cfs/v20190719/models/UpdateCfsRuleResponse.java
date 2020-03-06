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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCfsRuleResponse extends AbstractModel{

    /**
    * Permission group ID
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * Rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Client IP or IP range allowed for access
    */
    @SerializedName("AuthClientIp")
    @Expose
    private String AuthClientIp;

    /**
    * Read & write permission
    */
    @SerializedName("RWPermission")
    @Expose
    private String RWPermission;

    /**
    * User permission
    */
    @SerializedName("UserPermission")
    @Expose
    private String UserPermission;

    /**
    * Priority
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Permission group ID 
     * @return PGroupId Permission group ID
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set Permission group ID
     * @param PGroupId Permission group ID
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

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
     * Get Client IP or IP range allowed for access 
     * @return AuthClientIp Client IP or IP range allowed for access
     */
    public String getAuthClientIp() {
        return this.AuthClientIp;
    }

    /**
     * Set Client IP or IP range allowed for access
     * @param AuthClientIp Client IP or IP range allowed for access
     */
    public void setAuthClientIp(String AuthClientIp) {
        this.AuthClientIp = AuthClientIp;
    }

    /**
     * Get Read & write permission 
     * @return RWPermission Read & write permission
     */
    public String getRWPermission() {
        return this.RWPermission;
    }

    /**
     * Set Read & write permission
     * @param RWPermission Read & write permission
     */
    public void setRWPermission(String RWPermission) {
        this.RWPermission = RWPermission;
    }

    /**
     * Get User permission 
     * @return UserPermission User permission
     */
    public String getUserPermission() {
        return this.UserPermission;
    }

    /**
     * Set User permission
     * @param UserPermission User permission
     */
    public void setUserPermission(String UserPermission) {
        this.UserPermission = UserPermission;
    }

    /**
     * Get Priority 
     * @return Priority Priority
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority
     * @param Priority Priority
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AuthClientIp", this.AuthClientIp);
        this.setParamSimple(map, prefix + "RWPermission", this.RWPermission);
        this.setParamSimple(map, prefix + "UserPermission", this.UserPermission);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

