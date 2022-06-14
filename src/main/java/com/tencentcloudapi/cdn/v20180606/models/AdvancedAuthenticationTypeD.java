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

public class AdvancedAuthenticationTypeD extends AbstractModel{

    /**
    * Key used for signature calculation, allowing 6 to 32 bytes of letters and digits.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Alternative key used for authentication after the authentication key (`SecretKey`) failed
    */
    @SerializedName("BackupSecretKey")
    @Expose
    private String BackupSecretKey;

    /**
    * Signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
    */
    @SerializedName("SignParam")
    @Expose
    private String SignParam;

    /**
    * Time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
    */
    @SerializedName("TimeParam")
    @Expose
    private String TimeParam;

    /**
    * Expiration time in seconds
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * Time format. Valid values: dec (decimal), hex (hexadecimal).
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
     * Get Key used for signature calculation, allowing 6 to 32 bytes of letters and digits. 
     * @return SecretKey Key used for signature calculation, allowing 6 to 32 bytes of letters and digits.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Key used for signature calculation, allowing 6 to 32 bytes of letters and digits.
     * @param SecretKey Key used for signature calculation, allowing 6 to 32 bytes of letters and digits.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Alternative key used for authentication after the authentication key (`SecretKey`) failed 
     * @return BackupSecretKey Alternative key used for authentication after the authentication key (`SecretKey`) failed
     */
    public String getBackupSecretKey() {
        return this.BackupSecretKey;
    }

    /**
     * Set Alternative key used for authentication after the authentication key (`SecretKey`) failed
     * @param BackupSecretKey Alternative key used for authentication after the authentication key (`SecretKey`) failed
     */
    public void setBackupSecretKey(String BackupSecretKey) {
        this.BackupSecretKey = BackupSecretKey;
    }

    /**
     * Get Signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores. 
     * @return SignParam Signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
     */
    public String getSignParam() {
        return this.SignParam;
    }

    /**
     * Set Signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
     * @param SignParam Signature field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
     */
    public void setSignParam(String SignParam) {
        this.SignParam = SignParam;
    }

    /**
     * Get Time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores. 
     * @return TimeParam Time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
     */
    public String getTimeParam() {
        return this.TimeParam;
    }

    /**
     * Set Time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
     * @param TimeParam Time field name in the URI string, starting with a letter, and consisting of letters, digits, and underscores.
     */
    public void setTimeParam(String TimeParam) {
        this.TimeParam = TimeParam;
    }

    /**
     * Get Expiration time in seconds 
     * @return ExpireTime Expiration time in seconds
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time in seconds
     * @param ExpireTime Expiration time in seconds
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Time format. Valid values: dec (decimal), hex (hexadecimal). 
     * @return TimeFormat Time format. Valid values: dec (decimal), hex (hexadecimal).
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set Time format. Valid values: dec (decimal), hex (hexadecimal).
     * @param TimeFormat Time format. Valid values: dec (decimal), hex (hexadecimal).
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    public AdvancedAuthenticationTypeD() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedAuthenticationTypeD(AdvancedAuthenticationTypeD source) {
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.BackupSecretKey != null) {
            this.BackupSecretKey = new String(source.BackupSecretKey);
        }
        if (source.SignParam != null) {
            this.SignParam = new String(source.SignParam);
        }
        if (source.TimeParam != null) {
            this.TimeParam = new String(source.TimeParam);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "BackupSecretKey", this.BackupSecretKey);
        this.setParamSimple(map, prefix + "SignParam", this.SignParam);
        this.setParamSimple(map, prefix + "TimeParam", this.TimeParam);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);

    }
}

