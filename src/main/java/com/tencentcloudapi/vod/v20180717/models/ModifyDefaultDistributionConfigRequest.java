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

public class ModifyDefaultDistributionConfigRequest extends AbstractModel {

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Distribution domain name. The value is a domain name in the VOD domain name list. Leave it empty or fill in the blank to indicate no domain name modification.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Distribution protocol. Value: HTTP or HTTPS.
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * Playback key, consisting of upper- and lower-case letters (a - Z) or numbers (0 - 9), with a length between 8 and 20 characters.
    */
    @SerializedName("PlayKey")
    @Expose
    private String PlayKey;

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Distribution domain name. The value is a domain name in the VOD domain name list. Leave it empty or fill in the blank to indicate no domain name modification. 
     * @return Domain Distribution domain name. The value is a domain name in the VOD domain name list. Leave it empty or fill in the blank to indicate no domain name modification.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Distribution domain name. The value is a domain name in the VOD domain name list. Leave it empty or fill in the blank to indicate no domain name modification.
     * @param Domain Distribution domain name. The value is a domain name in the VOD domain name list. Leave it empty or fill in the blank to indicate no domain name modification.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Distribution protocol. Value: HTTP or HTTPS. 
     * @return Scheme Distribution protocol. Value: HTTP or HTTPS.
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set Distribution protocol. Value: HTTP or HTTPS.
     * @param Scheme Distribution protocol. Value: HTTP or HTTPS.
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get Playback key, consisting of upper- and lower-case letters (a - Z) or numbers (0 - 9), with a length between 8 and 20 characters. 
     * @return PlayKey Playback key, consisting of upper- and lower-case letters (a - Z) or numbers (0 - 9), with a length between 8 and 20 characters.
     */
    public String getPlayKey() {
        return this.PlayKey;
    }

    /**
     * Set Playback key, consisting of upper- and lower-case letters (a - Z) or numbers (0 - 9), with a length between 8 and 20 characters.
     * @param PlayKey Playback key, consisting of upper- and lower-case letters (a - Z) or numbers (0 - 9), with a length between 8 and 20 characters.
     */
    public void setPlayKey(String PlayKey) {
        this.PlayKey = PlayKey;
    }

    public ModifyDefaultDistributionConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDefaultDistributionConfigRequest(ModifyDefaultDistributionConfigRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.PlayKey != null) {
            this.PlayKey = new String(source.PlayKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "PlayKey", this.PlayKey);

    }
}

