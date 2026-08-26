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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTokenPlanApiKeysRequest extends AbstractModel {

    /**
    * Package ID. You can obtain it through the DescribeTokenPlanList API.
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * API key name, up to 128 characters. If the number of API keys created exceeds 1, the actual name format is {ApiKeyName}-{serial number} (for example, mykey-1, mykey-2).
    */
    @SerializedName("ApiKeyName")
    @Expose
    private String ApiKeyName;

    /**
    * Number of creations. Value range: 1–10.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * List of available models. If the package type is the enterprise edition professional package, you can specify a model or pass in "all". "all" means all models supported by the package are available for use. To specify specific models, pass in Model IDs. "all" and specific Model IDs cannot be specified at the same time. If not provided, it indicates the API Key does not support any models, thereby impacting normal use of the API Key. If the package type is the enterprise edition lite package, this field will be force overwritten to ["auto"] regardless of whether it is provided and what value is passed in.
    */
    @SerializedName("AllowedModels")
    @Expose
    private String [] AllowedModels;

    /**
    * Exclusive reserved quota. If not passed in, the value is `0`, which means no exclusive reserved quota is assigned to the API Key. Measurement units are as follows:
-Package type is professional, unit value is points;
-Package type is lite package, and the measurement unit is token.
    */
    @SerializedName("ExclusiveQuota")
    @Expose
    private Long ExclusiveQuota;

    /**
    * Total credit limit. -1 means unlimited. It must be -1 or greater than or equal to the current ExclusiveQuota of the API Key. If not passed, no upper limit is set. The units are as follows:
-Package type is professional, unit value is points;
-Package type is lite package, and the measurement unit is token.
    */
    @SerializedName("TotalQuota")
    @Expose
    private Long TotalQuota;

    /**
    * TPM (Tokens Per Minute) limit. If not passed, the plan-level TPM is used. Must be >= 0 and <= the package TPM.
    */
    @SerializedName("TPM")
    @Expose
    private Long TPM;

    /**
     * Get Package ID. You can obtain it through the DescribeTokenPlanList API. 
     * @return TeamId Package ID. You can obtain it through the DescribeTokenPlanList API.
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Package ID. You can obtain it through the DescribeTokenPlanList API.
     * @param TeamId Package ID. You can obtain it through the DescribeTokenPlanList API.
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get API key name, up to 128 characters. If the number of API keys created exceeds 1, the actual name format is {ApiKeyName}-{serial number} (for example, mykey-1, mykey-2). 
     * @return ApiKeyName API key name, up to 128 characters. If the number of API keys created exceeds 1, the actual name format is {ApiKeyName}-{serial number} (for example, mykey-1, mykey-2).
     */
    public String getApiKeyName() {
        return this.ApiKeyName;
    }

    /**
     * Set API key name, up to 128 characters. If the number of API keys created exceeds 1, the actual name format is {ApiKeyName}-{serial number} (for example, mykey-1, mykey-2).
     * @param ApiKeyName API key name, up to 128 characters. If the number of API keys created exceeds 1, the actual name format is {ApiKeyName}-{serial number} (for example, mykey-1, mykey-2).
     */
    public void setApiKeyName(String ApiKeyName) {
        this.ApiKeyName = ApiKeyName;
    }

    /**
     * Get Number of creations. Value range: 1–10. 
     * @return Count Number of creations. Value range: 1–10.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of creations. Value range: 1–10.
     * @param Count Number of creations. Value range: 1–10.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get List of available models. If the package type is the enterprise edition professional package, you can specify a model or pass in "all". "all" means all models supported by the package are available for use. To specify specific models, pass in Model IDs. "all" and specific Model IDs cannot be specified at the same time. If not provided, it indicates the API Key does not support any models, thereby impacting normal use of the API Key. If the package type is the enterprise edition lite package, this field will be force overwritten to ["auto"] regardless of whether it is provided and what value is passed in. 
     * @return AllowedModels List of available models. If the package type is the enterprise edition professional package, you can specify a model or pass in "all". "all" means all models supported by the package are available for use. To specify specific models, pass in Model IDs. "all" and specific Model IDs cannot be specified at the same time. If not provided, it indicates the API Key does not support any models, thereby impacting normal use of the API Key. If the package type is the enterprise edition lite package, this field will be force overwritten to ["auto"] regardless of whether it is provided and what value is passed in.
     */
    public String [] getAllowedModels() {
        return this.AllowedModels;
    }

    /**
     * Set List of available models. If the package type is the enterprise edition professional package, you can specify a model or pass in "all". "all" means all models supported by the package are available for use. To specify specific models, pass in Model IDs. "all" and specific Model IDs cannot be specified at the same time. If not provided, it indicates the API Key does not support any models, thereby impacting normal use of the API Key. If the package type is the enterprise edition lite package, this field will be force overwritten to ["auto"] regardless of whether it is provided and what value is passed in.
     * @param AllowedModels List of available models. If the package type is the enterprise edition professional package, you can specify a model or pass in "all". "all" means all models supported by the package are available for use. To specify specific models, pass in Model IDs. "all" and specific Model IDs cannot be specified at the same time. If not provided, it indicates the API Key does not support any models, thereby impacting normal use of the API Key. If the package type is the enterprise edition lite package, this field will be force overwritten to ["auto"] regardless of whether it is provided and what value is passed in.
     */
    public void setAllowedModels(String [] AllowedModels) {
        this.AllowedModels = AllowedModels;
    }

    /**
     * Get Exclusive reserved quota. If not passed in, the value is `0`, which means no exclusive reserved quota is assigned to the API Key. Measurement units are as follows:
-Package type is professional, unit value is points;
-Package type is lite package, and the measurement unit is token. 
     * @return ExclusiveQuota Exclusive reserved quota. If not passed in, the value is `0`, which means no exclusive reserved quota is assigned to the API Key. Measurement units are as follows:
-Package type is professional, unit value is points;
-Package type is lite package, and the measurement unit is token.
     */
    public Long getExclusiveQuota() {
        return this.ExclusiveQuota;
    }

    /**
     * Set Exclusive reserved quota. If not passed in, the value is `0`, which means no exclusive reserved quota is assigned to the API Key. Measurement units are as follows:
-Package type is professional, unit value is points;
-Package type is lite package, and the measurement unit is token.
     * @param ExclusiveQuota Exclusive reserved quota. If not passed in, the value is `0`, which means no exclusive reserved quota is assigned to the API Key. Measurement units are as follows:
-Package type is professional, unit value is points;
-Package type is lite package, and the measurement unit is token.
     */
    public void setExclusiveQuota(Long ExclusiveQuota) {
        this.ExclusiveQuota = ExclusiveQuota;
    }

    /**
     * Get Total credit limit. -1 means unlimited. It must be -1 or greater than or equal to the current ExclusiveQuota of the API Key. If not passed, no upper limit is set. The units are as follows:
-Package type is professional, unit value is points;
-Package type is lite package, and the measurement unit is token. 
     * @return TotalQuota Total credit limit. -1 means unlimited. It must be -1 or greater than or equal to the current ExclusiveQuota of the API Key. If not passed, no upper limit is set. The units are as follows:
-Package type is professional, unit value is points;
-Package type is lite package, and the measurement unit is token.
     */
    public Long getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set Total credit limit. -1 means unlimited. It must be -1 or greater than or equal to the current ExclusiveQuota of the API Key. If not passed, no upper limit is set. The units are as follows:
-Package type is professional, unit value is points;
-Package type is lite package, and the measurement unit is token.
     * @param TotalQuota Total credit limit. -1 means unlimited. It must be -1 or greater than or equal to the current ExclusiveQuota of the API Key. If not passed, no upper limit is set. The units are as follows:
-Package type is professional, unit value is points;
-Package type is lite package, and the measurement unit is token.
     */
    public void setTotalQuota(Long TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get TPM (Tokens Per Minute) limit. If not passed, the plan-level TPM is used. Must be >= 0 and <= the package TPM. 
     * @return TPM TPM (Tokens Per Minute) limit. If not passed, the plan-level TPM is used. Must be >= 0 and <= the package TPM.
     */
    public Long getTPM() {
        return this.TPM;
    }

    /**
     * Set TPM (Tokens Per Minute) limit. If not passed, the plan-level TPM is used. Must be >= 0 and <= the package TPM.
     * @param TPM TPM (Tokens Per Minute) limit. If not passed, the plan-level TPM is used. Must be >= 0 and <= the package TPM.
     */
    public void setTPM(Long TPM) {
        this.TPM = TPM;
    }

    public CreateTokenPlanApiKeysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTokenPlanApiKeysRequest(CreateTokenPlanApiKeysRequest source) {
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.ApiKeyName != null) {
            this.ApiKeyName = new String(source.ApiKeyName);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.AllowedModels != null) {
            this.AllowedModels = new String[source.AllowedModels.length];
            for (int i = 0; i < source.AllowedModels.length; i++) {
                this.AllowedModels[i] = new String(source.AllowedModels[i]);
            }
        }
        if (source.ExclusiveQuota != null) {
            this.ExclusiveQuota = new Long(source.ExclusiveQuota);
        }
        if (source.TotalQuota != null) {
            this.TotalQuota = new Long(source.TotalQuota);
        }
        if (source.TPM != null) {
            this.TPM = new Long(source.TPM);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "ApiKeyName", this.ApiKeyName);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArraySimple(map, prefix + "AllowedModels.", this.AllowedModels);
        this.setParamSimple(map, prefix + "ExclusiveQuota", this.ExclusiveQuota);
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "TPM", this.TPM);

    }
}

