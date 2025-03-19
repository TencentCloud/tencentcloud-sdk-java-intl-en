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

public class DvAuthDetail extends AbstractModel {

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
    @SerializedName("DvAuthKeySubDomain")
    @Expose
    private String DvAuthKeySubDomain;

    /**
    * Certificate domain verification information; multiple domain verifications use this field.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuths")
    @Expose
    private DvAuths [] DvAuths;

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
     * @return DvAuthKeySubDomain Certificate domain name verification subdomain.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthKeySubDomain() {
        return this.DvAuthKeySubDomain;
    }

    /**
     * Set Certificate domain name verification subdomain.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthKeySubDomain Certificate domain name verification subdomain.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthKeySubDomain(String DvAuthKeySubDomain) {
        this.DvAuthKeySubDomain = DvAuthKeySubDomain;
    }

    /**
     * Get Certificate domain verification information; multiple domain verifications use this field.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuths Certificate domain verification information; multiple domain verifications use this field.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DvAuths [] getDvAuths() {
        return this.DvAuths;
    }

    /**
     * Set Certificate domain verification information; multiple domain verifications use this field.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuths Certificate domain verification information; multiple domain verifications use this field.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuths(DvAuths [] DvAuths) {
        this.DvAuths = DvAuths;
    }

    public DvAuthDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DvAuthDetail(DvAuthDetail source) {
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
        if (source.DvAuthKeySubDomain != null) {
            this.DvAuthKeySubDomain = new String(source.DvAuthKeySubDomain);
        }
        if (source.DvAuths != null) {
            this.DvAuths = new DvAuths[source.DvAuths.length];
            for (int i = 0; i < source.DvAuths.length; i++) {
                this.DvAuths[i] = new DvAuths(source.DvAuths[i]);
            }
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
        this.setParamSimple(map, prefix + "DvAuthKeySubDomain", this.DvAuthKeySubDomain);
        this.setParamArrayObj(map, prefix + "DvAuths.", this.DvAuths);

    }
}

