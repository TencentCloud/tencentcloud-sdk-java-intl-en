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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthenticationParameters extends AbstractModel {

    /**
    * Authentication type. Valid values:

<li>TypeA: authentication method type A. For its specific meaning, refer to [Authentication Method A](https://www.tencentcloud.com/document/product/1552/109329?from_cn_redirect=1);</li>
<li>TypeB: authentication method B type. For its specific meaning, refer to [Authentication Method B](https://www.tencentcloud.com/document/product/1552/109330?from_cn_redirect=1);</li>
<li>TypeC: authentication method C type. For its specific meaning, refer to [Authentication Method C](https://www.tencentcloud.com/document/product/1552/109331?from_cn_redirect=1);</li>
<li>TypeD: authentication method D type. For its specific meaning, refer to [Authentication Method D](https://www.tencentcloud.com/document/product/1552/109332?from_cn_redirect=1);</li>
<li>TypeVOD: authentication method V type. For its specific meaning, refer to [Authentication Method V](https://www.tencentcloud.com/document/product/1552/109333?from_cn_redirect=1).</li>
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * Primary authentication key. It contains 6–40 uppercase/lowercase letters or digits and cannot contain " or $.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Valid duration of the authentication URL, in seconds. Value range: 1–630720000. It is used to determine whether the client access request is expired:
<li>If the current time exceeds the "timestamp + valid duration" time, the request is expired and 403 is returned directly.</li>
<li>If the current time has not exceeded the "timestamp + valid duration" time, the request is not expired. Proceed to validate the md5 string.</li>Note: This field is required when AuthType is one of TypeA, TypeB, TypeC, or TypeD.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Backup authentication key. It contains 6–40 uppercase/lowercase letters or digits and cannot contain " or $.
    */
    @SerializedName("BackupSecretKey")
    @Expose
    private String BackupSecretKey;

    /**
    * Authentication parameter name. The node will validate the value corresponding to this parameter name. It consists of 1–100 upper- and lower-case letters, digits, or underscores.<br>Note: This field is required when AuthType is one of TypeA and TypeD.
    */
    @SerializedName("AuthParam")
    @Expose
    private String AuthParam;

    /**
    * Authentication timestamp. It cannot be the same as the AuthParam field value.<br>Note: This field is required when AuthType is TypeD.
    */
    @SerializedName("TimeParam")
    @Expose
    private String TimeParam;

    /**
    * Authentication time format. Valid values:
<li>dec: decimal;</li>
<li>hex: hexadecimal.</li>Note: This field is required when AuthType is TypeD. Default value: hex.
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
     * Get Authentication type. Valid values:

<li>TypeA: authentication method type A. For its specific meaning, refer to [Authentication Method A](https://www.tencentcloud.com/document/product/1552/109329?from_cn_redirect=1);</li>
<li>TypeB: authentication method B type. For its specific meaning, refer to [Authentication Method B](https://www.tencentcloud.com/document/product/1552/109330?from_cn_redirect=1);</li>
<li>TypeC: authentication method C type. For its specific meaning, refer to [Authentication Method C](https://www.tencentcloud.com/document/product/1552/109331?from_cn_redirect=1);</li>
<li>TypeD: authentication method D type. For its specific meaning, refer to [Authentication Method D](https://www.tencentcloud.com/document/product/1552/109332?from_cn_redirect=1);</li>
<li>TypeVOD: authentication method V type. For its specific meaning, refer to [Authentication Method V](https://www.tencentcloud.com/document/product/1552/109333?from_cn_redirect=1).</li> 
     * @return AuthType Authentication type. Valid values:

<li>TypeA: authentication method type A. For its specific meaning, refer to [Authentication Method A](https://www.tencentcloud.com/document/product/1552/109329?from_cn_redirect=1);</li>
<li>TypeB: authentication method B type. For its specific meaning, refer to [Authentication Method B](https://www.tencentcloud.com/document/product/1552/109330?from_cn_redirect=1);</li>
<li>TypeC: authentication method C type. For its specific meaning, refer to [Authentication Method C](https://www.tencentcloud.com/document/product/1552/109331?from_cn_redirect=1);</li>
<li>TypeD: authentication method D type. For its specific meaning, refer to [Authentication Method D](https://www.tencentcloud.com/document/product/1552/109332?from_cn_redirect=1);</li>
<li>TypeVOD: authentication method V type. For its specific meaning, refer to [Authentication Method V](https://www.tencentcloud.com/document/product/1552/109333?from_cn_redirect=1).</li>
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set Authentication type. Valid values:

<li>TypeA: authentication method type A. For its specific meaning, refer to [Authentication Method A](https://www.tencentcloud.com/document/product/1552/109329?from_cn_redirect=1);</li>
<li>TypeB: authentication method B type. For its specific meaning, refer to [Authentication Method B](https://www.tencentcloud.com/document/product/1552/109330?from_cn_redirect=1);</li>
<li>TypeC: authentication method C type. For its specific meaning, refer to [Authentication Method C](https://www.tencentcloud.com/document/product/1552/109331?from_cn_redirect=1);</li>
<li>TypeD: authentication method D type. For its specific meaning, refer to [Authentication Method D](https://www.tencentcloud.com/document/product/1552/109332?from_cn_redirect=1);</li>
<li>TypeVOD: authentication method V type. For its specific meaning, refer to [Authentication Method V](https://www.tencentcloud.com/document/product/1552/109333?from_cn_redirect=1).</li>
     * @param AuthType Authentication type. Valid values:

<li>TypeA: authentication method type A. For its specific meaning, refer to [Authentication Method A](https://www.tencentcloud.com/document/product/1552/109329?from_cn_redirect=1);</li>
<li>TypeB: authentication method B type. For its specific meaning, refer to [Authentication Method B](https://www.tencentcloud.com/document/product/1552/109330?from_cn_redirect=1);</li>
<li>TypeC: authentication method C type. For its specific meaning, refer to [Authentication Method C](https://www.tencentcloud.com/document/product/1552/109331?from_cn_redirect=1);</li>
<li>TypeD: authentication method D type. For its specific meaning, refer to [Authentication Method D](https://www.tencentcloud.com/document/product/1552/109332?from_cn_redirect=1);</li>
<li>TypeVOD: authentication method V type. For its specific meaning, refer to [Authentication Method V](https://www.tencentcloud.com/document/product/1552/109333?from_cn_redirect=1).</li>
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get Primary authentication key. It contains 6–40 uppercase/lowercase letters or digits and cannot contain " or $. 
     * @return SecretKey Primary authentication key. It contains 6–40 uppercase/lowercase letters or digits and cannot contain " or $.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Primary authentication key. It contains 6–40 uppercase/lowercase letters or digits and cannot contain " or $.
     * @param SecretKey Primary authentication key. It contains 6–40 uppercase/lowercase letters or digits and cannot contain " or $.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Valid duration of the authentication URL, in seconds. Value range: 1–630720000. It is used to determine whether the client access request is expired:
<li>If the current time exceeds the "timestamp + valid duration" time, the request is expired and 403 is returned directly.</li>
<li>If the current time has not exceeded the "timestamp + valid duration" time, the request is not expired. Proceed to validate the md5 string.</li>Note: This field is required when AuthType is one of TypeA, TypeB, TypeC, or TypeD. 
     * @return Timeout Valid duration of the authentication URL, in seconds. Value range: 1–630720000. It is used to determine whether the client access request is expired:
<li>If the current time exceeds the "timestamp + valid duration" time, the request is expired and 403 is returned directly.</li>
<li>If the current time has not exceeded the "timestamp + valid duration" time, the request is not expired. Proceed to validate the md5 string.</li>Note: This field is required when AuthType is one of TypeA, TypeB, TypeC, or TypeD.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Valid duration of the authentication URL, in seconds. Value range: 1–630720000. It is used to determine whether the client access request is expired:
<li>If the current time exceeds the "timestamp + valid duration" time, the request is expired and 403 is returned directly.</li>
<li>If the current time has not exceeded the "timestamp + valid duration" time, the request is not expired. Proceed to validate the md5 string.</li>Note: This field is required when AuthType is one of TypeA, TypeB, TypeC, or TypeD.
     * @param Timeout Valid duration of the authentication URL, in seconds. Value range: 1–630720000. It is used to determine whether the client access request is expired:
<li>If the current time exceeds the "timestamp + valid duration" time, the request is expired and 403 is returned directly.</li>
<li>If the current time has not exceeded the "timestamp + valid duration" time, the request is not expired. Proceed to validate the md5 string.</li>Note: This field is required when AuthType is one of TypeA, TypeB, TypeC, or TypeD.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Backup authentication key. It contains 6–40 uppercase/lowercase letters or digits and cannot contain " or $. 
     * @return BackupSecretKey Backup authentication key. It contains 6–40 uppercase/lowercase letters or digits and cannot contain " or $.
     */
    public String getBackupSecretKey() {
        return this.BackupSecretKey;
    }

    /**
     * Set Backup authentication key. It contains 6–40 uppercase/lowercase letters or digits and cannot contain " or $.
     * @param BackupSecretKey Backup authentication key. It contains 6–40 uppercase/lowercase letters or digits and cannot contain " or $.
     */
    public void setBackupSecretKey(String BackupSecretKey) {
        this.BackupSecretKey = BackupSecretKey;
    }

    /**
     * Get Authentication parameter name. The node will validate the value corresponding to this parameter name. It consists of 1–100 upper- and lower-case letters, digits, or underscores.<br>Note: This field is required when AuthType is one of TypeA and TypeD. 
     * @return AuthParam Authentication parameter name. The node will validate the value corresponding to this parameter name. It consists of 1–100 upper- and lower-case letters, digits, or underscores.<br>Note: This field is required when AuthType is one of TypeA and TypeD.
     */
    public String getAuthParam() {
        return this.AuthParam;
    }

    /**
     * Set Authentication parameter name. The node will validate the value corresponding to this parameter name. It consists of 1–100 upper- and lower-case letters, digits, or underscores.<br>Note: This field is required when AuthType is one of TypeA and TypeD.
     * @param AuthParam Authentication parameter name. The node will validate the value corresponding to this parameter name. It consists of 1–100 upper- and lower-case letters, digits, or underscores.<br>Note: This field is required when AuthType is one of TypeA and TypeD.
     */
    public void setAuthParam(String AuthParam) {
        this.AuthParam = AuthParam;
    }

    /**
     * Get Authentication timestamp. It cannot be the same as the AuthParam field value.<br>Note: This field is required when AuthType is TypeD. 
     * @return TimeParam Authentication timestamp. It cannot be the same as the AuthParam field value.<br>Note: This field is required when AuthType is TypeD.
     */
    public String getTimeParam() {
        return this.TimeParam;
    }

    /**
     * Set Authentication timestamp. It cannot be the same as the AuthParam field value.<br>Note: This field is required when AuthType is TypeD.
     * @param TimeParam Authentication timestamp. It cannot be the same as the AuthParam field value.<br>Note: This field is required when AuthType is TypeD.
     */
    public void setTimeParam(String TimeParam) {
        this.TimeParam = TimeParam;
    }

    /**
     * Get Authentication time format. Valid values:
<li>dec: decimal;</li>
<li>hex: hexadecimal.</li>Note: This field is required when AuthType is TypeD. Default value: hex. 
     * @return TimeFormat Authentication time format. Valid values:
<li>dec: decimal;</li>
<li>hex: hexadecimal.</li>Note: This field is required when AuthType is TypeD. Default value: hex.
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set Authentication time format. Valid values:
<li>dec: decimal;</li>
<li>hex: hexadecimal.</li>Note: This field is required when AuthType is TypeD. Default value: hex.
     * @param TimeFormat Authentication time format. Valid values:
<li>dec: decimal;</li>
<li>hex: hexadecimal.</li>Note: This field is required when AuthType is TypeD. Default value: hex.
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

