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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedAuthenticationTypeE extends AbstractModel{

    /**
    * Key used for signature calculation, allowing 6 to 32 bytes of letters and digits.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SignParam")
    @Expose
    private String SignParam;

    /**
    * ACL signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AclSignParam")
    @Expose
    private String AclSignParam;

    /**
    * Start time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTimeParam")
    @Expose
    private String StartTimeParam;

    /**
    * Expiration time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTimeParam")
    @Expose
    private String ExpireTimeParam;

    /**
    * Time format (dec)
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
     * Get Key used for signature calculation, allowing 6 to 32 bytes of letters and digits.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SecretKey Key used for signature calculation, allowing 6 to 32 bytes of letters and digits.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Key used for signature calculation, allowing 6 to 32 bytes of letters and digits.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SecretKey Key used for signature calculation, allowing 6 to 32 bytes of letters and digits.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SignParam Signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSignParam() {
        return this.SignParam;
    }

    /**
     * Set Signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SignParam Signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSignParam(String SignParam) {
        this.SignParam = SignParam;
    }

    /**
     * Get ACL signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AclSignParam ACL signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAclSignParam() {
        return this.AclSignParam;
    }

    /**
     * Set ACL signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AclSignParam ACL signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAclSignParam(String AclSignParam) {
        this.AclSignParam = AclSignParam;
    }

    /**
     * Get Start time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return StartTimeParam Start time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getStartTimeParam() {
        return this.StartTimeParam;
    }

    /**
     * Set Start time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param StartTimeParam Start time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStartTimeParam(String StartTimeParam) {
        this.StartTimeParam = StartTimeParam;
    }

    /**
     * Get Expiration time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ExpireTimeParam Expiration time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getExpireTimeParam() {
        return this.ExpireTimeParam;
    }

    /**
     * Set Expiration time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ExpireTimeParam Expiration time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setExpireTimeParam(String ExpireTimeParam) {
        this.ExpireTimeParam = ExpireTimeParam;
    }

    /**
     * Get Time format (dec)
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TimeFormat Time format (dec)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set Time format (dec)
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TimeFormat Time format (dec)
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "SignParam", this.SignParam);
        this.setParamSimple(map, prefix + "AclSignParam", this.AclSignParam);
        this.setParamSimple(map, prefix + "StartTimeParam", this.StartTimeParam);
        this.setParamSimple(map, prefix + "ExpireTimeParam", this.ExpireTimeParam);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);

    }
}

