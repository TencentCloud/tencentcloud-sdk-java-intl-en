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

public class UpdateCfsRuleRequest extends AbstractModel {

    /**
    * Permission group ID, which can be obtained through the api [DescribeCfsPGroups](https://www.tencentcloud.com/document/api/582/38157?from_cn_redirect=1).
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * Rule ID, which can be obtained through the [DescribeCfsRules](https://www.tencentcloud.com/document/api/582/38156?from_cn_redirect=1) api.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * You can enter a single IP or IP range, such as 10.1.10.11 or 10.10.1.0/24. The default visiting address is `*`, indicating that all IPs are allowed. Please note that you need to enter the CVM instance's private IP here.
    */
    @SerializedName("AuthClientIp")
    @Expose
    private String AuthClientIp;

    /**
    * Read/write permission. Valid values: RO (read-only), RW (read & write). Default value: RO
    */
    @SerializedName("RWPermission")
    @Expose
    private String RWPermission;

    /**
    * User permission. valid values: all_squash, no_all_squash, root_squash, no_root_squash. default value: root_squash.
All_squash: all accessing users (including the root user) will be mapped to anonymous users or groups.
no_all_squash: all accessing users (including the root user) retain original UID/GID information.
root_squash: maps visiting root user to anonymous user or user group. non-root user keeps original UID/GID information.
no_root_squash: has the same effect as no_all_squash. all accessing users (including the root user) retain their original UID/GID information.

    */
    @SerializedName("UserPermission")
    @Expose
    private String UserPermission;

    /**
    * Rule priority. value range: 1-100. among them, 1 is the highest and 100 is the minimum. default value: 100.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get Permission group ID, which can be obtained through the api [DescribeCfsPGroups](https://www.tencentcloud.com/document/api/582/38157?from_cn_redirect=1). 
     * @return PGroupId Permission group ID, which can be obtained through the api [DescribeCfsPGroups](https://www.tencentcloud.com/document/api/582/38157?from_cn_redirect=1).
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set Permission group ID, which can be obtained through the api [DescribeCfsPGroups](https://www.tencentcloud.com/document/api/582/38157?from_cn_redirect=1).
     * @param PGroupId Permission group ID, which can be obtained through the api [DescribeCfsPGroups](https://www.tencentcloud.com/document/api/582/38157?from_cn_redirect=1).
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * Get Rule ID, which can be obtained through the [DescribeCfsRules](https://www.tencentcloud.com/document/api/582/38156?from_cn_redirect=1) api. 
     * @return RuleId Rule ID, which can be obtained through the [DescribeCfsRules](https://www.tencentcloud.com/document/api/582/38156?from_cn_redirect=1) api.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID, which can be obtained through the [DescribeCfsRules](https://www.tencentcloud.com/document/api/582/38156?from_cn_redirect=1) api.
     * @param RuleId Rule ID, which can be obtained through the [DescribeCfsRules](https://www.tencentcloud.com/document/api/582/38156?from_cn_redirect=1) api.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get You can enter a single IP or IP range, such as 10.1.10.11 or 10.10.1.0/24. The default visiting address is `*`, indicating that all IPs are allowed. Please note that you need to enter the CVM instance's private IP here. 
     * @return AuthClientIp You can enter a single IP or IP range, such as 10.1.10.11 or 10.10.1.0/24. The default visiting address is `*`, indicating that all IPs are allowed. Please note that you need to enter the CVM instance's private IP here.
     */
    public String getAuthClientIp() {
        return this.AuthClientIp;
    }

    /**
     * Set You can enter a single IP or IP range, such as 10.1.10.11 or 10.10.1.0/24. The default visiting address is `*`, indicating that all IPs are allowed. Please note that you need to enter the CVM instance's private IP here.
     * @param AuthClientIp You can enter a single IP or IP range, such as 10.1.10.11 or 10.10.1.0/24. The default visiting address is `*`, indicating that all IPs are allowed. Please note that you need to enter the CVM instance's private IP here.
     */
    public void setAuthClientIp(String AuthClientIp) {
        this.AuthClientIp = AuthClientIp;
    }

    /**
     * Get Read/write permission. Valid values: RO (read-only), RW (read & write). Default value: RO 
     * @return RWPermission Read/write permission. Valid values: RO (read-only), RW (read & write). Default value: RO
     */
    public String getRWPermission() {
        return this.RWPermission;
    }

    /**
     * Set Read/write permission. Valid values: RO (read-only), RW (read & write). Default value: RO
     * @param RWPermission Read/write permission. Valid values: RO (read-only), RW (read & write). Default value: RO
     */
    public void setRWPermission(String RWPermission) {
        this.RWPermission = RWPermission;
    }

    /**
     * Get User permission. valid values: all_squash, no_all_squash, root_squash, no_root_squash. default value: root_squash.
All_squash: all accessing users (including the root user) will be mapped to anonymous users or groups.
no_all_squash: all accessing users (including the root user) retain original UID/GID information.
root_squash: maps visiting root user to anonymous user or user group. non-root user keeps original UID/GID information.
no_root_squash: has the same effect as no_all_squash. all accessing users (including the root user) retain their original UID/GID information.
 
     * @return UserPermission User permission. valid values: all_squash, no_all_squash, root_squash, no_root_squash. default value: root_squash.
All_squash: all accessing users (including the root user) will be mapped to anonymous users or groups.
no_all_squash: all accessing users (including the root user) retain original UID/GID information.
root_squash: maps visiting root user to anonymous user or user group. non-root user keeps original UID/GID information.
no_root_squash: has the same effect as no_all_squash. all accessing users (including the root user) retain their original UID/GID information.

     */
    public String getUserPermission() {
        return this.UserPermission;
    }

    /**
     * Set User permission. valid values: all_squash, no_all_squash, root_squash, no_root_squash. default value: root_squash.
All_squash: all accessing users (including the root user) will be mapped to anonymous users or groups.
no_all_squash: all accessing users (including the root user) retain original UID/GID information.
root_squash: maps visiting root user to anonymous user or user group. non-root user keeps original UID/GID information.
no_root_squash: has the same effect as no_all_squash. all accessing users (including the root user) retain their original UID/GID information.

     * @param UserPermission User permission. valid values: all_squash, no_all_squash, root_squash, no_root_squash. default value: root_squash.
All_squash: all accessing users (including the root user) will be mapped to anonymous users or groups.
no_all_squash: all accessing users (including the root user) retain original UID/GID information.
root_squash: maps visiting root user to anonymous user or user group. non-root user keeps original UID/GID information.
no_root_squash: has the same effect as no_all_squash. all accessing users (including the root user) retain their original UID/GID information.

     */
    public void setUserPermission(String UserPermission) {
        this.UserPermission = UserPermission;
    }

    /**
     * Get Rule priority. value range: 1-100. among them, 1 is the highest and 100 is the minimum. default value: 100. 
     * @return Priority Rule priority. value range: 1-100. among them, 1 is the highest and 100 is the minimum. default value: 100.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Rule priority. value range: 1-100. among them, 1 is the highest and 100 is the minimum. default value: 100.
     * @param Priority Rule priority. value range: 1-100. among them, 1 is the highest and 100 is the minimum. default value: 100.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public UpdateCfsRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCfsRuleRequest(UpdateCfsRuleRequest source) {
        if (source.PGroupId != null) {
            this.PGroupId = new String(source.PGroupId);
        }
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
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AuthClientIp", this.AuthClientIp);
        this.setParamSimple(map, prefix + "RWPermission", this.RWPermission);
        this.setParamSimple(map, prefix + "UserPermission", this.UserPermission);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

