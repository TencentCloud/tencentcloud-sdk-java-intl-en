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
package com.tencentcloudapi.sts.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssumeRoleRequest extends AbstractModel{

    /**
    * Resource descriptions of a role, which can be obtained by clicking the role name in the [CAM console](https://console.cloud.tencent.com/cam/role).
General role:
qcs::cam::uin/12345678:role/4611686018427397919, qcs::cam::uin/12345678:roleName/testRoleName
Service role:
qcs::cam::uin/12345678:role/tencentcloudServiceRole/4611686018427397920, qcs::cam::uin/12345678:role/tencentcloudServiceRoleName/testServiceRoleName
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * User-defined temporary session name.
It can contain 2-128 letters, digits, and symbols (=,.@_-). Regex: [\w+=,.@_-]*
    */
    @SerializedName("RoleSessionName")
    @Expose
    private String RoleSessionName;

    /**
    * Specifies the validity period of credentials in seconds. Default value: 7200. Maximum value: 43200
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Long DurationSeconds;

    /**
    * Policy description
Note:
1. The policy needs to be URL-encoded (if you request a TencentCloud API through the GET method, all parameters must be URL-encoded again in accordance with [Signature v3](https://intl.cloud.tencent.com/document/api/598/33159?from_cn_redirect=1#1.-.E6.8B.BC.E6.8E.A5.E8.A7.84.E8.8C.83.E8.AF.B7.E6.B1.82.E4.B8.B2) before the request is sent).
2. For the policy syntax, please see CAM's [Syntax Logic](https://intl.cloud.tencent.com/document/product/598/10603?from_cn_redirect=1).
3. The policy cannot contain the `principal` element.
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * External role ID, which can be obtained by clicking the role name in the [CAM console](https://console.cloud.tencent.com/cam/role).
It can contain 2-128 letters, digits, and symbols (=,.@:/-). Regex: [\w+=,.@:\/-]*
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
     * Get Resource descriptions of a role, which can be obtained by clicking the role name in the [CAM console](https://console.cloud.tencent.com/cam/role).
General role:
qcs::cam::uin/12345678:role/4611686018427397919, qcs::cam::uin/12345678:roleName/testRoleName
Service role:
qcs::cam::uin/12345678:role/tencentcloudServiceRole/4611686018427397920, qcs::cam::uin/12345678:role/tencentcloudServiceRoleName/testServiceRoleName 
     * @return RoleArn Resource descriptions of a role, which can be obtained by clicking the role name in the [CAM console](https://console.cloud.tencent.com/cam/role).
General role:
qcs::cam::uin/12345678:role/4611686018427397919, qcs::cam::uin/12345678:roleName/testRoleName
Service role:
qcs::cam::uin/12345678:role/tencentcloudServiceRole/4611686018427397920, qcs::cam::uin/12345678:role/tencentcloudServiceRoleName/testServiceRoleName
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set Resource descriptions of a role, which can be obtained by clicking the role name in the [CAM console](https://console.cloud.tencent.com/cam/role).
General role:
qcs::cam::uin/12345678:role/4611686018427397919, qcs::cam::uin/12345678:roleName/testRoleName
Service role:
qcs::cam::uin/12345678:role/tencentcloudServiceRole/4611686018427397920, qcs::cam::uin/12345678:role/tencentcloudServiceRoleName/testServiceRoleName
     * @param RoleArn Resource descriptions of a role, which can be obtained by clicking the role name in the [CAM console](https://console.cloud.tencent.com/cam/role).
General role:
qcs::cam::uin/12345678:role/4611686018427397919, qcs::cam::uin/12345678:roleName/testRoleName
Service role:
qcs::cam::uin/12345678:role/tencentcloudServiceRole/4611686018427397920, qcs::cam::uin/12345678:role/tencentcloudServiceRoleName/testServiceRoleName
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get User-defined temporary session name.
It can contain 2-128 letters, digits, and symbols (=,.@_-). Regex: [\w+=,.@_-]* 
     * @return RoleSessionName User-defined temporary session name.
It can contain 2-128 letters, digits, and symbols (=,.@_-). Regex: [\w+=,.@_-]*
     */
    public String getRoleSessionName() {
        return this.RoleSessionName;
    }

    /**
     * Set User-defined temporary session name.
It can contain 2-128 letters, digits, and symbols (=,.@_-). Regex: [\w+=,.@_-]*
     * @param RoleSessionName User-defined temporary session name.
It can contain 2-128 letters, digits, and symbols (=,.@_-). Regex: [\w+=,.@_-]*
     */
    public void setRoleSessionName(String RoleSessionName) {
        this.RoleSessionName = RoleSessionName;
    }

    /**
     * Get Specifies the validity period of credentials in seconds. Default value: 7200. Maximum value: 43200 
     * @return DurationSeconds Specifies the validity period of credentials in seconds. Default value: 7200. Maximum value: 43200
     */
    public Long getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * Set Specifies the validity period of credentials in seconds. Default value: 7200. Maximum value: 43200
     * @param DurationSeconds Specifies the validity period of credentials in seconds. Default value: 7200. Maximum value: 43200
     */
    public void setDurationSeconds(Long DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    /**
     * Get Policy description
Note:
1. The policy needs to be URL-encoded (if you request a TencentCloud API through the GET method, all parameters must be URL-encoded again in accordance with [Signature v3](https://intl.cloud.tencent.com/document/api/598/33159?from_cn_redirect=1#1.-.E6.8B.BC.E6.8E.A5.E8.A7.84.E8.8C.83.E8.AF.B7.E6.B1.82.E4.B8.B2) before the request is sent).
2. For the policy syntax, please see CAM's [Syntax Logic](https://intl.cloud.tencent.com/document/product/598/10603?from_cn_redirect=1).
3. The policy cannot contain the `principal` element. 
     * @return Policy Policy description
Note:
1. The policy needs to be URL-encoded (if you request a TencentCloud API through the GET method, all parameters must be URL-encoded again in accordance with [Signature v3](https://intl.cloud.tencent.com/document/api/598/33159?from_cn_redirect=1#1.-.E6.8B.BC.E6.8E.A5.E8.A7.84.E8.8C.83.E8.AF.B7.E6.B1.82.E4.B8.B2) before the request is sent).
2. For the policy syntax, please see CAM's [Syntax Logic](https://intl.cloud.tencent.com/document/product/598/10603?from_cn_redirect=1).
3. The policy cannot contain the `principal` element.
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set Policy description
Note:
1. The policy needs to be URL-encoded (if you request a TencentCloud API through the GET method, all parameters must be URL-encoded again in accordance with [Signature v3](https://intl.cloud.tencent.com/document/api/598/33159?from_cn_redirect=1#1.-.E6.8B.BC.E6.8E.A5.E8.A7.84.E8.8C.83.E8.AF.B7.E6.B1.82.E4.B8.B2) before the request is sent).
2. For the policy syntax, please see CAM's [Syntax Logic](https://intl.cloud.tencent.com/document/product/598/10603?from_cn_redirect=1).
3. The policy cannot contain the `principal` element.
     * @param Policy Policy description
Note:
1. The policy needs to be URL-encoded (if you request a TencentCloud API through the GET method, all parameters must be URL-encoded again in accordance with [Signature v3](https://intl.cloud.tencent.com/document/api/598/33159?from_cn_redirect=1#1.-.E6.8B.BC.E6.8E.A5.E8.A7.84.E8.8C.83.E8.AF.B7.E6.B1.82.E4.B8.B2) before the request is sent).
2. For the policy syntax, please see CAM's [Syntax Logic](https://intl.cloud.tencent.com/document/product/598/10603?from_cn_redirect=1).
3. The policy cannot contain the `principal` element.
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get External role ID, which can be obtained by clicking the role name in the [CAM console](https://console.cloud.tencent.com/cam/role).
It can contain 2-128 letters, digits, and symbols (=,.@:/-). Regex: [\w+=,.@:\/-]* 
     * @return ExternalId External role ID, which can be obtained by clicking the role name in the [CAM console](https://console.cloud.tencent.com/cam/role).
It can contain 2-128 letters, digits, and symbols (=,.@:/-). Regex: [\w+=,.@:\/-]*
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set External role ID, which can be obtained by clicking the role name in the [CAM console](https://console.cloud.tencent.com/cam/role).
It can contain 2-128 letters, digits, and symbols (=,.@:/-). Regex: [\w+=,.@:\/-]*
     * @param ExternalId External role ID, which can be obtained by clicking the role name in the [CAM console](https://console.cloud.tencent.com/cam/role).
It can contain 2-128 letters, digits, and symbols (=,.@:/-). Regex: [\w+=,.@:\/-]*
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    public AssumeRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssumeRoleRequest(AssumeRoleRequest source) {
        if (source.RoleArn != null) {
            this.RoleArn = new String(source.RoleArn);
        }
        if (source.RoleSessionName != null) {
            this.RoleSessionName = new String(source.RoleSessionName);
        }
        if (source.DurationSeconds != null) {
            this.DurationSeconds = new Long(source.DurationSeconds);
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "RoleSessionName", this.RoleSessionName);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);

    }
}

