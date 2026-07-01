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

public class AigcQuotaItem extends AbstractModel {

    /**
    * <p>Quota type</p><p>Enumeration value:</p><ul><li>Image: AIGC image generation task</li><li>Video: AIGC video generation task</li><li>Text: AIGC text generation task</li></ul>
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * <p>Valid only when QuotaLimit=Text, used to select the ApiToken that needs quota limit</p>
    */
    @SerializedName("ApiToken")
    @Expose
    private String ApiToken;

    /**
    * <p>Number of task quotas</p><p>Unit:</p><ul><li>When QuotaLimit=Image, unit: piece</li><li>When QuotaLimit=Video, unit: seconds</li><li>When QuotaLimit=Text, unit: token</li></ul>
    */
    @SerializedName("QuotaLimit")
    @Expose
    private Long QuotaLimit;

    /**
    * <p>Amount already used</p><p>Unit:</p><ul><li>When QuotaLimit=Image, unit: piece</li><li>When QuotaLimit=Video, unit: seconds</li><li>When QuotaLimit=Text, unit: token</li></ul>
    */
    @SerializedName("Usage")
    @Expose
    private Long Usage;

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

    /**
     * Get <p>Number of task quotas</p><p>Unit:</p><ul><li>When QuotaLimit=Image, unit: piece</li><li>When QuotaLimit=Video, unit: seconds</li><li>When QuotaLimit=Text, unit: token</li></ul> 
     * @return QuotaLimit <p>Number of task quotas</p><p>Unit:</p><ul><li>When QuotaLimit=Image, unit: piece</li><li>When QuotaLimit=Video, unit: seconds</li><li>When QuotaLimit=Text, unit: token</li></ul>
     */
    public Long getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * Set <p>Number of task quotas</p><p>Unit:</p><ul><li>When QuotaLimit=Image, unit: piece</li><li>When QuotaLimit=Video, unit: seconds</li><li>When QuotaLimit=Text, unit: token</li></ul>
     * @param QuotaLimit <p>Number of task quotas</p><p>Unit:</p><ul><li>When QuotaLimit=Image, unit: piece</li><li>When QuotaLimit=Video, unit: seconds</li><li>When QuotaLimit=Text, unit: token</li></ul>
     */
    public void setQuotaLimit(Long QuotaLimit) {
        this.QuotaLimit = QuotaLimit;
    }

    /**
     * Get <p>Amount already used</p><p>Unit:</p><ul><li>When QuotaLimit=Image, unit: piece</li><li>When QuotaLimit=Video, unit: seconds</li><li>When QuotaLimit=Text, unit: token</li></ul> 
     * @return Usage <p>Amount already used</p><p>Unit:</p><ul><li>When QuotaLimit=Image, unit: piece</li><li>When QuotaLimit=Video, unit: seconds</li><li>When QuotaLimit=Text, unit: token</li></ul>
     */
    public Long getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>Amount already used</p><p>Unit:</p><ul><li>When QuotaLimit=Image, unit: piece</li><li>When QuotaLimit=Video, unit: seconds</li><li>When QuotaLimit=Text, unit: token</li></ul>
     * @param Usage <p>Amount already used</p><p>Unit:</p><ul><li>When QuotaLimit=Image, unit: piece</li><li>When QuotaLimit=Video, unit: seconds</li><li>When QuotaLimit=Text, unit: token</li></ul>
     */
    public void setUsage(Long Usage) {
        this.Usage = Usage;
    }

    public AigcQuotaItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcQuotaItem(AigcQuotaItem source) {
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.ApiToken != null) {
            this.ApiToken = new String(source.ApiToken);
        }
        if (source.QuotaLimit != null) {
            this.QuotaLimit = new Long(source.QuotaLimit);
        }
        if (source.Usage != null) {
            this.Usage = new Long(source.Usage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "ApiToken", this.ApiToken);
        this.setParamSimple(map, prefix + "QuotaLimit", this.QuotaLimit);
        this.setParamSimple(map, prefix + "Usage", this.Usage);

    }
}

