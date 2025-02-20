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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthenticationParameters extends AbstractModel {

    /**
    * Authentication type. valid values:.

<Li>TypeA: authentication method a type, for specific meaning please refer to [authentication method a](https://intl.cloud.tencent.com/document/product/1552/109329?from_cn_redirect=1);</li>.
<Li>TypeB: authentication method b type, for specific meaning please refer to [authentication method b](https://intl.cloud.tencent.com/document/product/1552/109330?from_cn_redirect=1);</li>.
<Li>TypeC: authentication method c type, for specific meaning please refer to [authentication method c](https://intl.cloud.tencent.com/document/product/1552/109331?from_cn_redirect=1);</li>.
<Li>TypeD: authentication method d type, for specific meaning please refer to [authentication method d](https://intl.cloud.tencent.com/document/product/1552/109332?from_cn_redirect=1);</li>.
<Li>TypeVOD: authentication method v type, for specific meaning please refer to [authentication method v](https://intl.cloud.tencent.com/document/product/1552/109333?from_cn_redirect=1).</li>.
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * The primary authentication key consists of 6–40 uppercase and lowercase english letters or digits, and cannot contain " and $.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Validity period of the authentication url, in seconds, value range: 1–630720000. used to determine if the client access request has expired:.
<Li>If the current time exceeds "timestamp + validity period", it is an expired request, and a 403 is returned directly.</li>.
<Li>If the current time does not exceed "timestamp + validity period", the request is not expired, and the md5 string is further validated.</li> note: when authtype is one of typea, typeb, typec, or typed, this field is required.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * The backup authentication key consists of 6–40 uppercase and lowercase english letters or digits, and cannot contain " and $.
    */
    @SerializedName("BackupSecretKey")
    @Expose
    private String BackupSecretKey;

    /**
    * Authentication parameters name. the node will validate the value corresponding to this parameter name. consists of 1-100 uppercase and lowercase letters, numbers, or underscores.<br>note: this field is required when authtype is either typea or typed.
    */
    @SerializedName("AuthParam")
    @Expose
    private String AuthParam;

    /**
    * Authentication timestamp. it cannot be the same as the value of the authparam field.<br>note: this field is required when authtype is typed.
    */
    @SerializedName("TimeParam")
    @Expose
    private String TimeParam;

    /**
    * Authentication time format. values:.
<Li>Dec: decimal;</li>.
<Li>Hex: hexadecimal.</li>note: this field is required when authtype is typed. the default is hex.
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
     * Get Authentication type. valid values:.

<Li>TypeA: authentication method a type, for specific meaning please refer to [authentication method a](https://intl.cloud.tencent.com/document/product/1552/109329?from_cn_redirect=1);</li>.
<Li>TypeB: authentication method b type, for specific meaning please refer to [authentication method b](https://intl.cloud.tencent.com/document/product/1552/109330?from_cn_redirect=1);</li>.
<Li>TypeC: authentication method c type, for specific meaning please refer to [authentication method c](https://intl.cloud.tencent.com/document/product/1552/109331?from_cn_redirect=1);</li>.
<Li>TypeD: authentication method d type, for specific meaning please refer to [authentication method d](https://intl.cloud.tencent.com/document/product/1552/109332?from_cn_redirect=1);</li>.
<Li>TypeVOD: authentication method v type, for specific meaning please refer to [authentication method v](https://intl.cloud.tencent.com/document/product/1552/109333?from_cn_redirect=1).</li>. 
     * @return AuthType Authentication type. valid values:.

<Li>TypeA: authentication method a type, for specific meaning please refer to [authentication method a](https://intl.cloud.tencent.com/document/product/1552/109329?from_cn_redirect=1);</li>.
<Li>TypeB: authentication method b type, for specific meaning please refer to [authentication method b](https://intl.cloud.tencent.com/document/product/1552/109330?from_cn_redirect=1);</li>.
<Li>TypeC: authentication method c type, for specific meaning please refer to [authentication method c](https://intl.cloud.tencent.com/document/product/1552/109331?from_cn_redirect=1);</li>.
<Li>TypeD: authentication method d type, for specific meaning please refer to [authentication method d](https://intl.cloud.tencent.com/document/product/1552/109332?from_cn_redirect=1);</li>.
<Li>TypeVOD: authentication method v type, for specific meaning please refer to [authentication method v](https://intl.cloud.tencent.com/document/product/1552/109333?from_cn_redirect=1).</li>.
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set Authentication type. valid values:.

<Li>TypeA: authentication method a type, for specific meaning please refer to [authentication method a](https://intl.cloud.tencent.com/document/product/1552/109329?from_cn_redirect=1);</li>.
<Li>TypeB: authentication method b type, for specific meaning please refer to [authentication method b](https://intl.cloud.tencent.com/document/product/1552/109330?from_cn_redirect=1);</li>.
<Li>TypeC: authentication method c type, for specific meaning please refer to [authentication method c](https://intl.cloud.tencent.com/document/product/1552/109331?from_cn_redirect=1);</li>.
<Li>TypeD: authentication method d type, for specific meaning please refer to [authentication method d](https://intl.cloud.tencent.com/document/product/1552/109332?from_cn_redirect=1);</li>.
<Li>TypeVOD: authentication method v type, for specific meaning please refer to [authentication method v](https://intl.cloud.tencent.com/document/product/1552/109333?from_cn_redirect=1).</li>.
     * @param AuthType Authentication type. valid values:.

<Li>TypeA: authentication method a type, for specific meaning please refer to [authentication method a](https://intl.cloud.tencent.com/document/product/1552/109329?from_cn_redirect=1);</li>.
<Li>TypeB: authentication method b type, for specific meaning please refer to [authentication method b](https://intl.cloud.tencent.com/document/product/1552/109330?from_cn_redirect=1);</li>.
<Li>TypeC: authentication method c type, for specific meaning please refer to [authentication method c](https://intl.cloud.tencent.com/document/product/1552/109331?from_cn_redirect=1);</li>.
<Li>TypeD: authentication method d type, for specific meaning please refer to [authentication method d](https://intl.cloud.tencent.com/document/product/1552/109332?from_cn_redirect=1);</li>.
<Li>TypeVOD: authentication method v type, for specific meaning please refer to [authentication method v](https://intl.cloud.tencent.com/document/product/1552/109333?from_cn_redirect=1).</li>.
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get The primary authentication key consists of 6–40 uppercase and lowercase english letters or digits, and cannot contain " and $. 
     * @return SecretKey The primary authentication key consists of 6–40 uppercase and lowercase english letters or digits, and cannot contain " and $.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set The primary authentication key consists of 6–40 uppercase and lowercase english letters or digits, and cannot contain " and $.
     * @param SecretKey The primary authentication key consists of 6–40 uppercase and lowercase english letters or digits, and cannot contain " and $.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Validity period of the authentication url, in seconds, value range: 1–630720000. used to determine if the client access request has expired:.
<Li>If the current time exceeds "timestamp + validity period", it is an expired request, and a 403 is returned directly.</li>.
<Li>If the current time does not exceed "timestamp + validity period", the request is not expired, and the md5 string is further validated.</li> note: when authtype is one of typea, typeb, typec, or typed, this field is required. 
     * @return Timeout Validity period of the authentication url, in seconds, value range: 1–630720000. used to determine if the client access request has expired:.
<Li>If the current time exceeds "timestamp + validity period", it is an expired request, and a 403 is returned directly.</li>.
<Li>If the current time does not exceed "timestamp + validity period", the request is not expired, and the md5 string is further validated.</li> note: when authtype is one of typea, typeb, typec, or typed, this field is required.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Validity period of the authentication url, in seconds, value range: 1–630720000. used to determine if the client access request has expired:.
<Li>If the current time exceeds "timestamp + validity period", it is an expired request, and a 403 is returned directly.</li>.
<Li>If the current time does not exceed "timestamp + validity period", the request is not expired, and the md5 string is further validated.</li> note: when authtype is one of typea, typeb, typec, or typed, this field is required.
     * @param Timeout Validity period of the authentication url, in seconds, value range: 1–630720000. used to determine if the client access request has expired:.
<Li>If the current time exceeds "timestamp + validity period", it is an expired request, and a 403 is returned directly.</li>.
<Li>If the current time does not exceed "timestamp + validity period", the request is not expired, and the md5 string is further validated.</li> note: when authtype is one of typea, typeb, typec, or typed, this field is required.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get The backup authentication key consists of 6–40 uppercase and lowercase english letters or digits, and cannot contain " and $. 
     * @return BackupSecretKey The backup authentication key consists of 6–40 uppercase and lowercase english letters or digits, and cannot contain " and $.
     */
    public String getBackupSecretKey() {
        return this.BackupSecretKey;
    }

    /**
     * Set The backup authentication key consists of 6–40 uppercase and lowercase english letters or digits, and cannot contain " and $.
     * @param BackupSecretKey The backup authentication key consists of 6–40 uppercase and lowercase english letters or digits, and cannot contain " and $.
     */
    public void setBackupSecretKey(String BackupSecretKey) {
        this.BackupSecretKey = BackupSecretKey;
    }

    /**
     * Get Authentication parameters name. the node will validate the value corresponding to this parameter name. consists of 1-100 uppercase and lowercase letters, numbers, or underscores.<br>note: this field is required when authtype is either typea or typed. 
     * @return AuthParam Authentication parameters name. the node will validate the value corresponding to this parameter name. consists of 1-100 uppercase and lowercase letters, numbers, or underscores.<br>note: this field is required when authtype is either typea or typed.
     */
    public String getAuthParam() {
        return this.AuthParam;
    }

    /**
     * Set Authentication parameters name. the node will validate the value corresponding to this parameter name. consists of 1-100 uppercase and lowercase letters, numbers, or underscores.<br>note: this field is required when authtype is either typea or typed.
     * @param AuthParam Authentication parameters name. the node will validate the value corresponding to this parameter name. consists of 1-100 uppercase and lowercase letters, numbers, or underscores.<br>note: this field is required when authtype is either typea or typed.
     */
    public void setAuthParam(String AuthParam) {
        this.AuthParam = AuthParam;
    }

    /**
     * Get Authentication timestamp. it cannot be the same as the value of the authparam field.<br>note: this field is required when authtype is typed. 
     * @return TimeParam Authentication timestamp. it cannot be the same as the value of the authparam field.<br>note: this field is required when authtype is typed.
     */
    public String getTimeParam() {
        return this.TimeParam;
    }

    /**
     * Set Authentication timestamp. it cannot be the same as the value of the authparam field.<br>note: this field is required when authtype is typed.
     * @param TimeParam Authentication timestamp. it cannot be the same as the value of the authparam field.<br>note: this field is required when authtype is typed.
     */
    public void setTimeParam(String TimeParam) {
        this.TimeParam = TimeParam;
    }

    /**
     * Get Authentication time format. values:.
<Li>Dec: decimal;</li>.
<Li>Hex: hexadecimal.</li>note: this field is required when authtype is typed. the default is hex. 
     * @return TimeFormat Authentication time format. values:.
<Li>Dec: decimal;</li>.
<Li>Hex: hexadecimal.</li>note: this field is required when authtype is typed. the default is hex.
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set Authentication time format. values:.
<Li>Dec: decimal;</li>.
<Li>Hex: hexadecimal.</li>note: this field is required when authtype is typed. the default is hex.
     * @param TimeFormat Authentication time format. values:.
<Li>Dec: decimal;</li>.
<Li>Hex: hexadecimal.</li>note: this field is required when authtype is typed. the default is hex.
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    public AuthenticationParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthenticationParameters(AuthenticationParameters source) {
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.BackupSecretKey != null) {
            this.BackupSecretKey = new String(source.BackupSecretKey);
        }
        if (source.AuthParam != null) {
            this.AuthParam = new String(source.AuthParam);
        }
        if (source.TimeParam != null) {
            this.TimeParam = new String(source.TimeParam);
        }
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "BackupSecretKey", this.BackupSecretKey);
        this.setParamSimple(map, prefix + "AuthParam", this.AuthParam);
        this.setParamSimple(map, prefix + "TimeParam", this.TimeParam);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);

    }
}

