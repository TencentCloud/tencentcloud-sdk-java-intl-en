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
    * User ID assigned by Huaxida, which contains up to 128 characters.
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * User secret key ID assigned by SDMC, which contains up to 128 characters.
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * User key content assigned by Huaxida. Maximum length: 128 characters.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * FairPlay certificate address assigned by SDMC. This address must use HTTPS and can contain up to 1,024 characters.
    */
    @SerializedName("FairPlayCertificateUrl")
    @Expose
    private String FairPlayCertificateUrl;

    /**
     * Get User ID assigned by Huaxida, which contains up to 128 characters. 
     * @return Uid User ID assigned by Huaxida, which contains up to 128 characters.
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set User ID assigned by Huaxida, which contains up to 128 characters.
     * @param Uid User ID assigned by Huaxida, which contains up to 128 characters.
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get User secret key ID assigned by SDMC, which contains up to 128 characters. 
     * @return SecretId User secret key ID assigned by SDMC, which contains up to 128 characters.
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set User secret key ID assigned by SDMC, which contains up to 128 characters.
     * @param SecretId User secret key ID assigned by SDMC, which contains up to 128 characters.
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get User key content assigned by Huaxida. Maximum length: 128 characters. 
     * @return SecretKey User key content assigned by Huaxida. Maximum length: 128 characters.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set User key content assigned by Huaxida. Maximum length: 128 characters.
     * @param SecretKey User key content assigned by Huaxida. Maximum length: 128 characters.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get FairPlay certificate address assigned by SDMC. This address must use HTTPS and can contain up to 1,024 characters. 
     * @return FairPlayCertificateUrl FairPlay certificate address assigned by SDMC. This address must use HTTPS and can contain up to 1,024 characters.
     */
    public String getFairPlayCertificateUrl() {
        return this.FairPlayCertificateUrl;
    }

    /**
     * Set FairPlay certificate address assigned by SDMC. This address must use HTTPS and can contain up to 1,024 characters.
     * @param FairPlayCertificateUrl FairPlay certificate address assigned by SDMC. This address must use HTTPS and can contain up to 1,024 characters.
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

