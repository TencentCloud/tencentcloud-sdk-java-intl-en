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

public class ModifyAigcQuotaRequest extends AbstractModel {

    /**
    * <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Quota type</p><p>Enumeration value:</p><ul><li>Image: AIGC image generation task</li><li>Video: AIGC video generation task</li><li>Text: AIGC text generation task</li></ul>
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * <p>Task quota quantity</p><p>Unit:</p><ul><li>When QuotaLimit=Image, unit: sheets</li><li>When QuotaLimit=Video, unit: seconds</li><li>When QuotaLimit=Text, unit: tokens</li></ul>
    */
    @SerializedName("QuotaLimit")
    @Expose
    private Long QuotaLimit;

    /**
    * <p>Valid only when QuotaLimit=Text, used to select the ApiToken that needs quota limit</p>
    */
    @SerializedName("ApiToken")
    @Expose
    private String ApiToken;

    /**
     * Get <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b></p> 
     * @return SubAppId <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b></p>
     * @param SubAppId <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Quota type</p><p>Enumeration value:</p><ul><li>Image: AIGC image generation task</li><li>Video: AIGC video generation task</li><li>Text: AIGC text generation task</li></ul> 
     * @return QuotaType <p>Quota type</p><p>Enumeration value:</p><ul><li>Image: AIGC image generation task</li><li>Video: AIGC video generation task</li><li>Text: AIGC text generation task</li></ul>
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set <p>Quota type</p><p>Enumeration value:</p><ul><li>Image: AIGC image generation task</li><li>Video: AIGC video generation task</li><li>Text: AIGC text generation task</li></ul>
     * @param QuotaType <p>Quota type</p><p>Enumeration value:</p><ul><li>Image: AIGC image generation task</li><li>Video: AIGC video generation task</li><li>Text: AIGC text generation task</li></ul>
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get <p>Task quota quantity</p><p>Unit:</p><ul><li>When QuotaLimit=Image, unit: sheets</li><li>When QuotaLimit=Video, unit: seconds</li><li>When QuotaLimit=Text, unit: tokens</li></ul> 
     * @return QuotaLimit <p>Task quota quantity</p><p>Unit:</p><ul><li>When QuotaLimit=Image, unit: sheets</li><li>When QuotaLimit=Video, unit: seconds</li><li>When QuotaLimit=Text, unit: tokens</li></ul>
     */
    public Long getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * Set <p>Task quota quantity</p><p>Unit:</p><ul><li>When QuotaLimit=Image, unit: sheets</li><li>When QuotaLimit=Video, unit: seconds</li><li>When QuotaLimit=Text, unit: tokens</li></ul>
     * @param QuotaLimit <p>Task quota quantity</p><p>Unit:</p><ul><li>When QuotaLimit=Image, unit: sheets</li><li>When QuotaLimit=Video, unit: seconds</li><li>When QuotaLimit=Text, unit: tokens</li></ul>
     */
    public void setQuotaLimit(Long QuotaLimit) {
        this.QuotaLimit = QuotaLimit;
    }

    /**
     * Get <p>Valid only when QuotaLimit=Text, used to select the ApiToken that needs quota limit</p> 
     * @return ApiToken <p>Valid only when QuotaLimit=Text, used to select the ApiToken that needs quota limit</p>
     */
    public String getApiToken() {
        return this.ApiToken;
    }

    /**
     * Set <p>Valid only when QuotaLimit=Text, used to select the ApiToken that needs quota limit</p>
     * @param ApiToken <p>Valid only when QuotaLimit=Text, used to select the ApiToken that needs quota limit</p>
     */
    public void setApiToken(String ApiToken) {
        this.ApiToken = ApiToken;
    }

    public ModifyAigcQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAigcQuotaRequest(ModifyAigcQuotaRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.QuotaLimit != null) {
            this.QuotaLimit = new Long(source.QuotaLimit);
        }
        if (source.ApiToken != null) {
            this.ApiToken = new String(source.ApiToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "QuotaLimit", this.QuotaLimit);
        this.setParamSimple(map, prefix + "ApiToken", this.ApiToken);

    }
}

