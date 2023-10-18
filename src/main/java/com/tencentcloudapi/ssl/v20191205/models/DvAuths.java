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
    * DV authentication key
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthKey")
    @Expose
    private String DvAuthKey;

    /**
    * DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthValue")
    @Expose
    private String DvAuthValue;

    /**
    * Domain name of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthDomain")
    @Expose
    private String DvAuthDomain;

    /**
    * Path of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthPath")
    @Expose
    private String DvAuthPath;

    /**
    * DV authentication sub-domain name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthSubDomain")
    @Expose
    private String DvAuthSubDomain;

    /**
    * DV authentication type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DvAuthVerifyType")
    @Expose
    private String DvAuthVerifyType;

    /**
     * Get DV authentication key
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthKey DV authentication key
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthKey() {
        return this.DvAuthKey;
    }

    /**
     * Set DV authentication key
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthKey DV authentication key
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthKey(String DvAuthKey) {
        this.DvAuthKey = DvAuthKey;
    }

    /**
     * Get DV authentication value
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthValue DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthValue() {
        return this.DvAuthValue;
    }

    /**
     * Set DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthValue DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthValue(String DvAuthValue) {
        this.DvAuthValue = DvAuthValue;
    }

    /**
     * Get Domain name of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthDomain Domain name of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthDomain() {
        return this.DvAuthDomain;
    }

    /**
     * Set Domain name of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthDomain Domain name of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthDomain(String DvAuthDomain) {
        this.DvAuthDomain = DvAuthDomain;
    }

    /**
     * Get Path of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthPath Path of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthPath() {
        return this.DvAuthPath;
    }

    /**
     * Set Path of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthPath Path of the DV authentication value
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthPath(String DvAuthPath) {
        this.DvAuthPath = DvAuthPath;
    }

    /**
     * Get DV authentication sub-domain name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthSubDomain DV authentication sub-domain name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthSubDomain() {
        return this.DvAuthSubDomain;
    }

    /**
     * Set DV authentication sub-domain name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthSubDomain DV authentication sub-domain name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDvAuthSubDomain(String DvAuthSubDomain) {
        this.DvAuthSubDomain = DvAuthSubDomain;
    }

    /**
     * Get DV authentication type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DvAuthVerifyType DV authentication type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDvAuthVerifyType() {
        return this.DvAuthVerifyType;
    }

    /**
     * Set DV authentication type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DvAuthVerifyType DV authentication type
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

