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

public class SDMCDrmKeyProviderInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * 
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 
    */
    @SerializedName("FairPlayCertificateUrl")
    @Expose
    private String FairPlayCertificateUrl;

    /**
     * Get  
     * @return Uid 
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 
     * @param Uid 
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get  
     * @return SecretId 
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set 
     * @param SecretId 
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get  
     * @return SecretKey 
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 
     * @param SecretKey 
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get  
     * @return FairPlayCertificateUrl 
     */
    public String getFairPlayCertificateUrl() {
        return this.FairPlayCertificateUrl;
    }

    /**
     * Set 
     * @param FairPlayCertificateUrl 
     */
    public void setFairPlayCertificateUrl(String FairPlayCertificateUrl) {
        this.FairPlayCertificateUrl = FairPlayCertificateUrl;
    }

    public SDMCDrmKeyProviderInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SDMCDrmKeyProviderInfo(SDMCDrmKeyProviderInfo source) {
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.FairPlayCertificateUrl != null) {
            this.FairPlayCertificateUrl = new String(source.FairPlayCertificateUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "FairPlayCertificateUrl", this.FairPlayCertificateUrl);

    }
}

