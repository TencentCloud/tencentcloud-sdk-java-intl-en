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

public class AssumeRoleWithSAMLRequest extends AbstractModel{

    /**
    * Base64-encoded SAML assertion
    */
    @SerializedName("SAMLAssertion")
    @Expose
    private String SAMLAssertion;

    /**
    * Principal access description name
    */
    @SerializedName("PrincipalArn")
    @Expose
    private String PrincipalArn;

    /**
    * Role access description name
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * Session name
    */
    @SerializedName("RoleSessionName")
    @Expose
    private String RoleSessionName;

    /**
    * Specifies the validity period of credentials in seconds. Default value: 7200. Maximum value: 7200
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Long DurationSeconds;

    /**
     * Get Base64-encoded SAML assertion 
     * @return SAMLAssertion Base64-encoded SAML assertion
     */
    public String getSAMLAssertion() {
        return this.SAMLAssertion;
    }

    /**
     * Set Base64-encoded SAML assertion
     * @param SAMLAssertion Base64-encoded SAML assertion
     */
    public void setSAMLAssertion(String SAMLAssertion) {
        this.SAMLAssertion = SAMLAssertion;
    }

    /**
     * Get Principal access description name 
     * @return PrincipalArn Principal access description name
     */
    public String getPrincipalArn() {
        return this.PrincipalArn;
    }

    /**
     * Set Principal access description name
     * @param PrincipalArn Principal access description name
     */
    public void setPrincipalArn(String PrincipalArn) {
        this.PrincipalArn = PrincipalArn;
    }

    /**
     * Get Role access description name 
     * @return RoleArn Role access description name
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set Role access description name
     * @param RoleArn Role access description name
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get Session name 
     * @return RoleSessionName Session name
     */
    public String getRoleSessionName() {
        return this.RoleSessionName;
    }

    /**
     * Set Session name
     * @param RoleSessionName Session name
     */
    public void setRoleSessionName(String RoleSessionName) {
        this.RoleSessionName = RoleSessionName;
    }

    /**
     * Get Specifies the validity period of credentials in seconds. Default value: 7200. Maximum value: 7200 
     * @return DurationSeconds Specifies the validity period of credentials in seconds. Default value: 7200. Maximum value: 7200
     */
    public Long getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * Set Specifies the validity period of credentials in seconds. Default value: 7200. Maximum value: 7200
     * @param DurationSeconds Specifies the validity period of credentials in seconds. Default value: 7200. Maximum value: 7200
     */
    public void setDurationSeconds(Long DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SAMLAssertion", this.SAMLAssertion);
        this.setParamSimple(map, prefix + "PrincipalArn", this.PrincipalArn);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "RoleSessionName", this.RoleSessionName);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);

    }
}

