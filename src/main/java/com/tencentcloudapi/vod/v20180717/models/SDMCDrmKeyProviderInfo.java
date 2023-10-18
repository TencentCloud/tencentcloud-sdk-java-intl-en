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

public class SDMCDrmKeyProviderInfo extends AbstractModel {

    /**
    * The user ID assigned by SDMC, which can contain up to 128 characters.
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * The secret ID assigned by SDMC, which can contain up to 128 characters.
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * The secret key assigned by SDMC, which can contain up to 128 characters.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * The URL of the FairPlay certificate issued by SDMC. It must be an HTTPS address and can contain up to 1,024 characters.
    */
    @SerializedName("FairPlayCertificateUrl")
    @Expose
    private String FairPlayCertificateUrl;

    /**
     * Get The user ID assigned by SDMC, which can contain up to 128 characters. 
     * @return Uid The user ID assigned by SDMC, which can contain up to 128 characters.
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set The user ID assigned by SDMC, which can contain up to 128 characters.
     * @param Uid The user ID assigned by SDMC, which can contain up to 128 characters.
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get The secret ID assigned by SDMC, which can contain up to 128 characters. 
     * @return SecretId The secret ID assigned by SDMC, which can contain up to 128 characters.
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set The secret ID assigned by SDMC, which can contain up to 128 characters.
     * @param SecretId The secret ID assigned by SDMC, which can contain up to 128 characters.
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get The secret key assigned by SDMC, which can contain up to 128 characters. 
     * @return SecretKey The secret key assigned by SDMC, which can contain up to 128 characters.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set The secret key assigned by SDMC, which can contain up to 128 characters.
     * @param SecretKey The secret key assigned by SDMC, which can contain up to 128 characters.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get The URL of the FairPlay certificate issued by SDMC. It must be an HTTPS address and can contain up to 1,024 characters. 
     * @return FairPlayCertificateUrl The URL of the FairPlay certificate issued by SDMC. It must be an HTTPS address and can contain up to 1,024 characters.
     */
    public String getFairPlayCertificateUrl() {
        return this.FairPlayCertificateUrl;
    }

    /**
     * Set The URL of the FairPlay certificate issued by SDMC. It must be an HTTPS address and can contain up to 1,024 characters.
     * @param FairPlayCertificateUrl The URL of the FairPlay certificate issued by SDMC. It must be an HTTPS address and can contain up to 1,024 characters.
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

