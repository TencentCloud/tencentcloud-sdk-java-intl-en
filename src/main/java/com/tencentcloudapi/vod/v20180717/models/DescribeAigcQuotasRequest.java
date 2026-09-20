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

public class DescribeAigcQuotasRequest extends AbstractModel {

    /**
    * <p><strong>VOD application ID. For customers who activate VOD services on or after December 25, 2023, when accessing resources in VOD applications (whether the default application or a newly created application), this field must be filled in with the app ID.</strong></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Quota type</p><p>Enumeration values:</p><ul><li>Image: AIGC image task</li><li>Video: AIGC video task</li><li>Text: AIGC text task</li></ul>
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * <p>Valid only when QuotaType is Text. Used to select the ApiToken for quota limit</p>
    */
    @SerializedName("ApiToken")
    @Expose
    private String ApiToken;

    /**
    * <p>Number of records returned in pages, from the Offset-th to the (Offset+Limit-1)-th record.</p><p>Value range: [1, 100]</p><p>Default value: 10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Starting offset amount for pagination return. Default value: 0. It returns records from Offset to Offset + Limit - 1.</p><p>Default value: 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p><strong>VOD application ID. For customers who activate VOD services on or after December 25, 2023, when accessing resources in VOD applications (whether the default application or a newly created application), this field must be filled in with the app ID.</strong></p> 
     * @return SubAppId <p><strong>VOD application ID. For customers who activate VOD services on or after December 25, 2023, when accessing resources in VOD applications (whether the default application or a newly created application), this field must be filled in with the app ID.</strong></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><strong>VOD application ID. For customers who activate VOD services on or after December 25, 2023, when accessing resources in VOD applications (whether the default application or a newly created application), this field must be filled in with the app ID.</strong></p>
     * @param SubAppId <p><strong>VOD application ID. For customers who activate VOD services on or after December 25, 2023, when accessing resources in VOD applications (whether the default application or a newly created application), this field must be filled in with the app ID.</strong></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Quota type</p><p>Enumeration values:</p><ul><li>Image: AIGC image task</li><li>Video: AIGC video task</li><li>Text: AIGC text task</li></ul> 
     * @return QuotaType <p>Quota type</p><p>Enumeration values:</p><ul><li>Image: AIGC image task</li><li>Video: AIGC video task</li><li>Text: AIGC text task</li></ul>
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set <p>Quota type</p><p>Enumeration values:</p><ul><li>Image: AIGC image task</li><li>Video: AIGC video task</li><li>Text: AIGC text task</li></ul>
     * @param QuotaType <p>Quota type</p><p>Enumeration values:</p><ul><li>Image: AIGC image task</li><li>Video: AIGC video task</li><li>Text: AIGC text task</li></ul>
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get <p>Valid only when QuotaType is Text. Used to select the ApiToken for quota limit</p> 
     * @return ApiToken <p>Valid only when QuotaType is Text. Used to select the ApiToken for quota limit</p>
     */
    public String getApiToken() {
        return this.ApiToken;
    }

    /**
     * Set <p>Valid only when QuotaType is Text. Used to select the ApiToken for quota limit</p>
     * @param ApiToken <p>Valid only when QuotaType is Text. Used to select the ApiToken for quota limit</p>
     */
    public void setApiToken(String ApiToken) {
        this.ApiToken = ApiToken;
    }

    /**
     * Get <p>Number of records returned in pages, from the Offset-th to the (Offset+Limit-1)-th record.</p><p>Value range: [1, 100]</p><p>Default value: 10</p> 
     * @return Limit <p>Number of records returned in pages, from the Offset-th to the (Offset+Limit-1)-th record.</p><p>Value range: [1, 100]</p><p>Default value: 10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of records returned in pages, from the Offset-th to the (Offset+Limit-1)-th record.</p><p>Value range: [1, 100]</p><p>Default value: 10</p>
     * @param Limit <p>Number of records returned in pages, from the Offset-th to the (Offset+Limit-1)-th record.</p><p>Value range: [1, 100]</p><p>Default value: 10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Starting offset amount for pagination return. Default value: 0. It returns records from Offset to Offset + Limit - 1.</p><p>Default value: 0</p> 
     * @return Offset <p>Starting offset amount for pagination return. Default value: 0. It returns records from Offset to Offset + Limit - 1.</p><p>Default value: 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Starting offset amount for pagination return. Default value: 0. It returns records from Offset to Offset + Limit - 1.</p><p>Default value: 0</p>
     * @param Offset <p>Starting offset amount for pagination return. Default value: 0. It returns records from Offset to Offset + Limit - 1.</p><p>Default value: 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeAigcQuotasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAigcQuotasRequest(DescribeAigcQuotasRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.ApiToken != null) {
            this.ApiToken = new String(source.ApiToken);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "ApiToken", this.ApiToken);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

