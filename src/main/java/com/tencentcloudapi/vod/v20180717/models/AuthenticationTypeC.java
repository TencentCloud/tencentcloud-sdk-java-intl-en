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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthenticationTypeC extends AbstractModel {

    /**
    * Key used for signature calculation.
Only allow upper- and lower-case letters and digits, with a length of 6 to 32 characters.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Signature expiration time settings;
In seconds. Maximum settable value: 630720000.
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * List of filename extensions for authentication/no authentication settings;
If it contains the character *, it means all files.
    */
    @SerializedName("FileExtensions")
    @Expose
    private String [] FileExtensions;

    /**
    * whitelist: allowlist, means to authenticate all types except the FileExtensions list;
blacklist: blocklist, which means authentication is only applicable to the types in FileExtensions.
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * Timestamp base settings:
<li>dec: decimal</li>
<li>hex: hexadecimal</li>
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * Secondary key for signature calculation.
Only allow upper- and lower-case letters and digits, with a length of 6 to 32 characters.
    */
    @SerializedName("BackupSecretKey")
    @Expose
    private String BackupSecretKey;

    /**
     * Get Key used for signature calculation.
Only allow upper- and lower-case letters and digits, with a length of 6 to 32 characters. 
     * @return SecretKey Key used for signature calculation.
Only allow upper- and lower-case letters and digits, with a length of 6 to 32 characters.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set Key used for signature calculation.
Only allow upper- and lower-case letters and digits, with a length of 6 to 32 characters.
     * @param SecretKey Key used for signature calculation.
Only allow upper- and lower-case letters and digits, with a length of 6 to 32 characters.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Signature expiration time settings;
In seconds. Maximum settable value: 630720000. 
     * @return ExpireTime Signature expiration time settings;
In seconds. Maximum settable value: 630720000.
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Signature expiration time settings;
In seconds. Maximum settable value: 630720000.
     * @param ExpireTime Signature expiration time settings;
In seconds. Maximum settable value: 630720000.
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get List of filename extensions for authentication/no authentication settings;
If it contains the character *, it means all files. 
     * @return FileExtensions List of filename extensions for authentication/no authentication settings;
If it contains the character *, it means all files.
     */
    public String [] getFileExtensions() {
        return this.FileExtensions;
    }

    /**
     * Set List of filename extensions for authentication/no authentication settings;
If it contains the character *, it means all files.
     * @param FileExtensions List of filename extensions for authentication/no authentication settings;
If it contains the character *, it means all files.
     */
    public void setFileExtensions(String [] FileExtensions) {
        this.FileExtensions = FileExtensions;
    }

    /**
     * Get whitelist: allowlist, means to authenticate all types except the FileExtensions list;
blacklist: blocklist, which means authentication is only applicable to the types in FileExtensions. 
     * @return FilterType whitelist: allowlist, means to authenticate all types except the FileExtensions list;
blacklist: blocklist, which means authentication is only applicable to the types in FileExtensions.
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set whitelist: allowlist, means to authenticate all types except the FileExtensions list;
blacklist: blocklist, which means authentication is only applicable to the types in FileExtensions.
     * @param FilterType whitelist: allowlist, means to authenticate all types except the FileExtensions list;
blacklist: blocklist, which means authentication is only applicable to the types in FileExtensions.
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get Timestamp base settings:
<li>dec: decimal</li>
<li>hex: hexadecimal</li> 
     * @return TimeFormat Timestamp base settings:
<li>dec: decimal</li>
<li>hex: hexadecimal</li>
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set Timestamp base settings:
<li>dec: decimal</li>
<li>hex: hexadecimal</li>
     * @param TimeFormat Timestamp base settings:
<li>dec: decimal</li>
<li>hex: hexadecimal</li>
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get Secondary key for signature calculation.
Only allow upper- and lower-case letters and digits, with a length of 6 to 32 characters. 
     * @return BackupSecretKey Secondary key for signature calculation.
Only allow upper- and lower-case letters and digits, with a length of 6 to 32 characters.
     */
    public String getBackupSecretKey() {
        return this.BackupSecretKey;
    }

    /**
     * Set Secondary key for signature calculation.
Only allow upper- and lower-case letters and digits, with a length of 6 to 32 characters.
     * @param BackupSecretKey Secondary key for signature calculation.
Only allow upper- and lower-case letters and digits, with a length of 6 to 32 characters.
     */
    public void setBackupSecretKey(String BackupSecretKey) {
        this.BackupSecretKey = BackupSecretKey;
    }

    public AuthenticationTypeC() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthenticationTypeC(AuthenticationTypeC source) {
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.FileExtensions != null) {
            this.FileExtensions = new String[source.FileExtensions.length];
            for (int i = 0; i < source.FileExtensions.length; i++) {
                this.FileExtensions[i] = new String(source.FileExtensions[i]);
            }
        }
        if (source.FilterType != null) {
            this.FilterType = new String(source.FilterType);
        }
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
        if (source.BackupSecretKey != null) {
            this.BackupSecretKey = new String(source.BackupSecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamArraySimple(map, prefix + "FileExtensions.", this.FileExtensions);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);
        this.setParamSimple(map, prefix + "BackupSecretKey", this.BackupSecretKey);

    }
}

