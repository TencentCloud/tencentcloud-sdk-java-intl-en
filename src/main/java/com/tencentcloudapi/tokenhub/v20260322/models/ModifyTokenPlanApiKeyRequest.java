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

public class ModifyTokenPlanApiKeyRequest extends AbstractModel {

    /**
    * API Key ID.
    */
    @SerializedName("ApiKeyId")
    @Expose
    private String ApiKeyId;

    /**
    * Available model list. If this parameter is not specified, no modification is made.

- If the package type is enterprise professional:
1) Input "all": use all models supported by the package
2) Import Model ID: specify a specific model. "all" and a specific Model ID cannot be specified at the same time.

-If the package type is enterprise lightweight edition, do not pass in this parameter.
    */
    @SerializedName("AllowedModels")
    @Expose
    private String [] AllowedModels;

    /**
    * Dedicated limit. If this parameter is not specified, no modification will be made. Unit:

-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token.
    */
    @SerializedName("ExclusiveQuota")
    @Expose
    private Long ExclusiveQuota;

    /**
    * Total credit limit. -1 means unlimited. It must be -1 or greater than or equal to the current ExclusiveQuota of the API Key. If not passed, no modification is made. Measurement units are as follows:
-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token.
    */
    @SerializedName("TotalQuota")
    @Expose
    private Long TotalQuota;

    /**
    * Whether to enable the API Key. Values: enable (enable), disable (disable). If not passed, no modification is made.
    */
    @SerializedName("UseStatus")
    @Expose
    private String UseStatus;

    /**
    * TPM (Tokens Per Minute) limit. If not passed, no modification will be made. Must be >= 0 and <= the package TPM.
    */
    @SerializedName("TPM")
    @Expose
    private Long TPM;

    /**
     * Get API Key ID. 
     * @return ApiKeyId API Key ID.
     */
    public String getApiKeyId() {
        return this.ApiKeyId;
    }

    /**
     * Set API Key ID.
     * @param ApiKeyId API Key ID.
     */
    public void setApiKeyId(String ApiKeyId) {
        this.ApiKeyId = ApiKeyId;
    }

    /**
     * Get Available model list. If this parameter is not specified, no modification is made.

- If the package type is enterprise professional:
1) Input "all": use all models supported by the package
2) Import Model ID: specify a specific model. "all" and a specific Model ID cannot be specified at the same time.

-If the package type is enterprise lightweight edition, do not pass in this parameter. 
     * @return AllowedModels Available model list. If this parameter is not specified, no modification is made.

- If the package type is enterprise professional:
1) Input "all": use all models supported by the package
2) Import Model ID: specify a specific model. "all" and a specific Model ID cannot be specified at the same time.

-If the package type is enterprise lightweight edition, do not pass in this parameter.
     */
    public String [] getAllowedModels() {
        return this.AllowedModels;
    }

    /**
     * Set Available model list. If this parameter is not specified, no modification is made.

- If the package type is enterprise professional:
1) Input "all": use all models supported by the package
2) Import Model ID: specify a specific model. "all" and a specific Model ID cannot be specified at the same time.

-If the package type is enterprise lightweight edition, do not pass in this parameter.
     * @param AllowedModels Available model list. If this parameter is not specified, no modification is made.

- If the package type is enterprise professional:
1) Input "all": use all models supported by the package
2) Import Model ID: specify a specific model. "all" and a specific Model ID cannot be specified at the same time.

-If the package type is enterprise lightweight edition, do not pass in this parameter.
     */
    public void setAllowedModels(String [] AllowedModels) {
        this.AllowedModels = AllowedModels;
    }

    /**
     * Get Dedicated limit. If this parameter is not specified, no modification will be made. Unit:

-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token. 
     * @return ExclusiveQuota Dedicated limit. If this parameter is not specified, no modification will be made. Unit:

-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token.
     */
    public Long getExclusiveQuota() {
        return this.ExclusiveQuota;
    }

    /**
     * Set Dedicated limit. If this parameter is not specified, no modification will be made. Unit:

-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token.
     * @param ExclusiveQuota Dedicated limit. If this parameter is not specified, no modification will be made. Unit:

-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token.
     */
    public void setExclusiveQuota(Long ExclusiveQuota) {
        this.ExclusiveQuota = ExclusiveQuota;
    }

    /**
     * Get Total credit limit. -1 means unlimited. It must be -1 or greater than or equal to the current ExclusiveQuota of the API Key. If not passed, no modification is made. Measurement units are as follows:
-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token. 
     * @return TotalQuota Total credit limit. -1 means unlimited. It must be -1 or greater than or equal to the current ExclusiveQuota of the API Key. If not passed, no modification is made. Measurement units are as follows:
-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token.
     */
    public Long getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set Total credit limit. -1 means unlimited. It must be -1 or greater than or equal to the current ExclusiveQuota of the API Key. If not passed, no modification is made. Measurement units are as follows:
-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token.
     * @param TotalQuota Total credit limit. -1 means unlimited. It must be -1 or greater than or equal to the current ExclusiveQuota of the API Key. If not passed, no modification is made. Measurement units are as follows:
-Package type: professional. Measurement unit: point.
- Package type is lite package, and the measurement unit is token.
     */
    public void setTotalQuota(Long TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get Whether to enable the API Key. Values: enable (enable), disable (disable). If not passed, no modification is made. 
     * @return UseStatus Whether to enable the API Key. Values: enable (enable), disable (disable). If not passed, no modification is made.
     */
    public String getUseStatus() {
        return this.UseStatus;
    }

    /**
     * Set Whether to enable the API Key. Values: enable (enable), disable (disable). If not passed, no modification is made.
     * @param UseStatus Whether to enable the API Key. Values: enable (enable), disable (disable). If not passed, no modification is made.
     */
    public void setUseStatus(String UseStatus) {
        this.UseStatus = UseStatus;
    }

    /**
     * Get TPM (Tokens Per Minute) limit. If not passed, no modification will be made. Must be >= 0 and <= the package TPM. 
     * @return TPM TPM (Tokens Per Minute) limit. If not passed, no modification will be made. Must be >= 0 and <= the package TPM.
     */
    public Long getTPM() {
        return this.TPM;
    }

    /**
     * Set TPM (Tokens Per Minute) limit. If not passed, no modification will be made. Must be >= 0 and <= the package TPM.
     * @param TPM TPM (Tokens Per Minute) limit. If not passed, no modification will be made. Must be >= 0 and <= the package TPM.
     */
    public void setTPM(Long TPM) {
        this.TPM = TPM;
    }

    public ModifyTokenPlanApiKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTokenPlanApiKeyRequest(ModifyTokenPlanApiKeyRequest source) {
        if (source.ApiKeyId != null) {
            this.ApiKeyId = new String(source.ApiKeyId);
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
        if (source.UseStatus != null) {
            this.UseStatus = new String(source.UseStatus);
        }
        if (source.TPM != null) {
            this.TPM = new Long(source.TPM);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiKeyId", this.ApiKeyId);
        this.setParamArraySimple(map, prefix + "AllowedModels.", this.AllowedModels);
        this.setParamSimple(map, prefix + "ExclusiveQuota", this.ExclusiveQuota);
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "UseStatus", this.UseStatus);
        this.setParamSimple(map, prefix + "TPM", this.TPM);

    }
}

