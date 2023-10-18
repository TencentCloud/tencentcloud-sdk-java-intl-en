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
    * The key for signature calculation 6-32 characters. Only digits and letters are allowed.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Signature parameter name Only upper and lower-case letters, digits, and underscores (_) are allowed. It cannot start with a digit. Length limit: 1-100 characters.
    */
    @SerializedName("SignParam")
    @Expose
    private String SignParam;

    /**
    * Signature expiration time;Unit: second. The maximum value is 630720000.
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * File extension list settings determining if authentication should be performed;If it contains an asterisk (*), this indicates all files.
    */
    @SerializedName("FileExtensions")
    @Expose
    private String [] FileExtensions;

    /**
    * whitelist: All file types apart from the FileExtensions list are authenticated;blacklist: Only the file types in the FileExtensions list are authenticated.
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * Backup key, which is used to calculate a signature. 6-32 characters. Only digits and letters are allowed.
    */
    @SerializedName("BackupSecretKey")
    @Expose
    private String BackupSecretKey;

    /**
     * Get The key for signature calculation 6-32 characters. Only digits and letters are allowed. 
     * @return SecretKey The key for signature calculation 6-32 characters. Only digits and letters are allowed.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set The key for signature calculation 6-32 characters. Only digits and letters are allowed.
     * @param SecretKey The key for signature calculation 6-32 characters. Only digits and letters are allowed.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Signature parameter name Only upper and lower-case letters, digits, and underscores (_) are allowed. It cannot start with a digit. Length limit: 1-100 characters. 
     * @return SignParam Signature parameter name Only upper and lower-case letters, digits, and underscores (_) are allowed. It cannot start with a digit. Length limit: 1-100 characters.
     */
    public String getSignParam() {
        return this.SignParam;
    }

    /**
     * Set Signature parameter name Only upper and lower-case letters, digits, and underscores (_) are allowed. It cannot start with a digit. Length limit: 1-100 characters.
     * @param SignParam Signature parameter name Only upper and lower-case letters, digits, and underscores (_) are allowed. It cannot start with a digit. Length limit: 1-100 characters.
     */
    public void setSignParam(String SignParam) {
        this.SignParam = SignParam;
    }

    /**
     * Get Signature expiration time;Unit: second. The maximum value is 630720000. 
     * @return ExpireTime Signature expiration time;Unit: second. The maximum value is 630720000.
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Signature expiration time;Unit: second. The maximum value is 630720000.
     * @param ExpireTime Signature expiration time;Unit: second. The maximum value is 630720000.
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get File extension list settings determining if authentication should be performed;If it contains an asterisk (*), this indicates all files. 
     * @return FileExtensions File extension list settings determining if authentication should be performed;If it contains an asterisk (*), this indicates all files.
     */
    public String [] getFileExtensions() {
        return this.FileExtensions;
    }

    /**
     * Set File extension list settings determining if authentication should be performed;If it contains an asterisk (*), this indicates all files.
     * @param FileExtensions File extension list settings determining if authentication should be performed;If it contains an asterisk (*), this indicates all files.
     */
    public void setFileExtensions(String [] FileExtensions) {
        this.FileExtensions = FileExtensions;
    }

    /**
     * Get whitelist: All file types apart from the FileExtensions list are authenticated;blacklist: Only the file types in the FileExtensions list are authenticated. 
     * @return FilterType whitelist: All file types apart from the FileExtensions list are authenticated;blacklist: Only the file types in the FileExtensions list are authenticated.
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set whitelist: All file types apart from the FileExtensions list are authenticated;blacklist: Only the file types in the FileExtensions list are authenticated.
     * @param FilterType whitelist: All file types apart from the FileExtensions list are authenticated;blacklist: Only the file types in the FileExtensions list are authenticated.
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get Backup key, which is used to calculate a signature. 6-32 characters. Only digits and letters are allowed. 
     * @return BackupSecretKey Backup key, which is used to calculate a signature. 6-32 characters. Only digits and letters are allowed.
     */
    public String getBackupSecretKey() {
        return this.BackupSecretKey;
    }

    /**
     * Set Backup key, which is used to calculate a signature. 6-32 characters. Only digits and letters are allowed.
     * @param BackupSecretKey Backup key, which is used to calculate a signature. 6-32 characters. Only digits and letters are allowed.
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

