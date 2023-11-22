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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthenticationTypeA extends AbstractModel {

    /**
    * The key to calculate the signature; only uppercase and lowercase letters and numbers are allowed, with a length of 6~32 characters.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Signature parameter name setting; only uppercase and lowercase letters, numbers or underscores are allowed, the length is 1~100 characters, and it cannot start with a number.
    */
    @SerializedName("SignParam")
    @Expose
    private String SignParam;

    /**
    * Signature expiration time setting; the unit is seconds, and the maximum value can be set to 630720000.
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * File extension list settings for authentication/non-authentication; if the character * is included, it means all files.
    */
    @SerializedName("FileExtensions")
    @Expose
    private String [] FileExtensions;

    /**
    * whitelist: whitelist, indicating that all types except the FileExtensions list will be authenticated; blacklist: blacklist, indicating that only the types in FileExtensions will be authenticated.
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * Alternate key for calculating signature; only uppercase and lowercase letters and numbers are allowed, length 6~32 characters.
    */
    @SerializedName("BackupSecretKey")
    @Expose
    private String BackupSecretKey;

    /**
     * Get The key to calculate the signature; only uppercase and lowercase letters and numbers are allowed, with a length of 6~32 characters. 
     * @return SecretKey The key to calculate the signature; only uppercase and lowercase letters and numbers are allowed, with a length of 6~32 characters.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set The key to calculate the signature; only uppercase and lowercase letters and numbers are allowed, with a length of 6~32 characters.
     * @param SecretKey The key to calculate the signature; only uppercase and lowercase letters and numbers are allowed, with a length of 6~32 characters.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Signature parameter name setting; only uppercase and lowercase letters, numbers or underscores are allowed, the length is 1~100 characters, and it cannot start with a number. 
     * @return SignParam Signature parameter name setting; only uppercase and lowercase letters, numbers or underscores are allowed, the length is 1~100 characters, and it cannot start with a number.
     */
    public String getSignParam() {
        return this.SignParam;
    }

    /**
     * Set Signature parameter name setting; only uppercase and lowercase letters, numbers or underscores are allowed, the length is 1~100 characters, and it cannot start with a number.
     * @param SignParam Signature parameter name setting; only uppercase and lowercase letters, numbers or underscores are allowed, the length is 1~100 characters, and it cannot start with a number.
     */
    public void setSignParam(String SignParam) {
        this.SignParam = SignParam;
    }

    /**
     * Get Signature expiration time setting; the unit is seconds, and the maximum value can be set to 630720000. 
     * @return ExpireTime Signature expiration time setting; the unit is seconds, and the maximum value can be set to 630720000.
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Signature expiration time setting; the unit is seconds, and the maximum value can be set to 630720000.
     * @param ExpireTime Signature expiration time setting; the unit is seconds, and the maximum value can be set to 630720000.
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get File extension list settings for authentication/non-authentication; if the character * is included, it means all files. 
     * @return FileExtensions File extension list settings for authentication/non-authentication; if the character * is included, it means all files.
     */
    public String [] getFileExtensions() {
        return this.FileExtensions;
    }

    /**
     * Set File extension list settings for authentication/non-authentication; if the character * is included, it means all files.
     * @param FileExtensions File extension list settings for authentication/non-authentication; if the character * is included, it means all files.
     */
    public void setFileExtensions(String [] FileExtensions) {
        this.FileExtensions = FileExtensions;
    }

    /**
     * Get whitelist: whitelist, indicating that all types except the FileExtensions list will be authenticated; blacklist: blacklist, indicating that only the types in FileExtensions will be authenticated. 
     * @return FilterType whitelist: whitelist, indicating that all types except the FileExtensions list will be authenticated; blacklist: blacklist, indicating that only the types in FileExtensions will be authenticated.
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set whitelist: whitelist, indicating that all types except the FileExtensions list will be authenticated; blacklist: blacklist, indicating that only the types in FileExtensions will be authenticated.
     * @param FilterType whitelist: whitelist, indicating that all types except the FileExtensions list will be authenticated; blacklist: blacklist, indicating that only the types in FileExtensions will be authenticated.
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get Alternate key for calculating signature; only uppercase and lowercase letters and numbers are allowed, length 6~32 characters. 
     * @return BackupSecretKey Alternate key for calculating signature; only uppercase and lowercase letters and numbers are allowed, length 6~32 characters.
     */
    public String getBackupSecretKey() {
        return this.BackupSecretKey;
    }

    /**
     * Set Alternate key for calculating signature; only uppercase and lowercase letters and numbers are allowed, length 6~32 characters.
     * @param BackupSecretKey Alternate key for calculating signature; only uppercase and lowercase letters and numbers are allowed, length 6~32 characters.
     */
    public void setBackupSecretKey(String BackupSecretKey) {
        this.BackupSecretKey = BackupSecretKey;
    }

    public AuthenticationTypeA() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthenticationTypeA(AuthenticationTypeA source) {
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.SignParam != null) {
            this.SignParam = new String(source.SignParam);
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
        if (source.BackupSecretKey != null) {
            this.BackupSecretKey = new String(source.BackupSecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "SignParam", this.SignParam);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamArraySimple(map, prefix + "FileExtensions.", this.FileExtensions);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamSimple(map, prefix + "BackupSecretKey", this.BackupSecretKey);

    }
}

