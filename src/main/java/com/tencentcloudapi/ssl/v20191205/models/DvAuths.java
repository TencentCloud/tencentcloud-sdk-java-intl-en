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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DvAuths extends AbstractModel {

    /**
    * Certificate domain name verification record key.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthKey")
    @Expose
    private String DvAuthKey;

    /**
    * Certificate domain name verification record value.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthValue")
    @Expose
    private String DvAuthValue;

    /**
    * Certificate domain name verification domain value.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthDomain")
    @Expose
    private String DvAuthDomain;

    /**
    * Certificate domain name verification file path, used only for file and file_proxy.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthPath")
    @Expose
    private String DvAuthPath;

    /**
    * Certificate domain name verification subdomain.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthSubDomain")
    @Expose
    private String DvAuthSubDomain;

    /**
    * Certificate domain verification type, valid values:.
TXT: add txt record for dns domain verification.
FILE: domain file verification.
CNAME: add cname record for dns domain verification.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthVerifyType")
    @Expose
    private String DvAuthVerifyType;

    /**
     * Get Certificate domain name verification record key.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthKey Certificate domain name verification record key.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthKey() {
        return this.DvAuthKey;
    }

    /**
     * Set Certificate domain name verification record key.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthKey Certificate domain name verification record key.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthKey(String DvAuthKey) {
        this.DvAuthKey = DvAuthKey;
    }

    /**
     * Get Certificate domain name verification record value.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthValue Certificate domain name verification record value.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthValue() {
        return this.DvAuthValue;
    }

    /**
     * Set Certificate domain name verification record value.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthValue Certificate domain name verification record value.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthValue(String DvAuthValue) {
        this.DvAuthValue = DvAuthValue;
    }

    /**
     * Get Certificate domain name verification domain value.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthDomain Certificate domain name verification domain value.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthDomain() {
        return this.DvAuthDomain;
    }

    /**
     * Set Certificate domain name verification domain value.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthDomain Certificate domain name verification domain value.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthDomain(String DvAuthDomain) {
        this.DvAuthDomain = DvAuthDomain;
    }

    /**
     * Get Certificate domain name verification file path, used only for file and file_proxy.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthPath Certificate domain name verification file path, used only for file and file_proxy.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthPath() {
        return this.DvAuthPath;
    }

    /**
     * Set Certificate domain name verification file path, used only for file and file_proxy.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthPath Certificate domain name verification file path, used only for file and file_proxy.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthPath(String DvAuthPath) {
        this.DvAuthPath = DvAuthPath;
    }

    /**
     * Get Certificate domain name verification subdomain.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthSubDomain Certificate domain name verification subdomain.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthSubDomain() {
        return this.DvAuthSubDomain;
    }

    /**
     * Set Certificate domain name verification subdomain.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthSubDomain Certificate domain name verification subdomain.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthSubDomain(String DvAuthSubDomain) {
        this.DvAuthSubDomain = DvAuthSubDomain;
    }

    /**
     * Get Certificate domain verification type, valid values:.
TXT: add txt record for dns domain verification.
FILE: domain file verification.
CNAME: add cname record for dns domain verification.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthVerifyType Certificate domain verification type, valid values:.
TXT: add txt record for dns domain verification.
FILE: domain file verification.
CNAME: add cname record for dns domain verification.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthVerifyType() {
        return this.DvAuthVerifyType;
    }

    /**
     * Set Certificate domain verification type, valid values:.
TXT: add txt record for dns domain verification.
FILE: domain file verification.
CNAME: add cname record for dns domain verification.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthVerifyType Certificate domain verification type, valid values:.
TXT: add txt record for dns domain verification.
FILE: domain file verification.
CNAME: add cname record for dns domain verification.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthVerifyType(String DvAuthVerifyType) {
        this.DvAuthVerifyType = DvAuthVerifyType;
    }

    public DvAuths() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DvAuths(DvAuths source) {
        if (source.DvAuthKey != null) {
            this.DvAuthKey = new String(source.DvAuthKey);
        }
        if (source.DvAuthValue != null) {
            this.DvAuthValue = new String(source.DvAuthValue);
        }
        if (source.DvAuthDomain != null) {
            this.DvAuthDomain = new String(source.DvAuthDomain);
        }
        if (source.DvAuthPath != null) {
            this.DvAuthPath = new String(source.DvAuthPath);
        }
        if (source.DvAuthSubDomain != null) {
            this.DvAuthSubDomain = new String(source.DvAuthSubDomain);
        }
        if (source.DvAuthVerifyType != null) {
            this.DvAuthVerifyType = new String(source.DvAuthVerifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DvAuthKey", this.DvAuthKey);
        this.setParamSimple(map, prefix + "DvAuthValue", this.DvAuthValue);
        this.setParamSimple(map, prefix + "DvAuthDomain", this.DvAuthDomain);
        this.setParamSimple(map, prefix + "DvAuthPath", this.DvAuthPath);
        this.setParamSimple(map, prefix + "DvAuthSubDomain", this.DvAuthSubDomain);
        this.setParamSimple(map, prefix + "DvAuthVerifyType", this.DvAuthVerifyType);

    }
}

