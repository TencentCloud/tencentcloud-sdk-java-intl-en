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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSdkVerificationResultResponse extends AbstractModel{

    /**
    * The result of the entire verification process.
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * The result description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The charge count.
    */
    @SerializedName("ChargeCount")
    @Expose
    private Long ChargeCount;

    /**
    * The results of multiple OCR processes (in order). The result of the final process is taken as the valid result.
    */
    @SerializedName("CardVerifyResults")
    @Expose
    private CardVerifyResult [] CardVerifyResults;

    /**
    * The results of multiple liveness detection processes (in order). The result of the final process is taken as the valid result.
    */
    @SerializedName("CompareResults")
    @Expose
    private CompareResult [] CompareResults;

    /**
    * Info passed in the process of getting the token.
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The result of the entire verification process. 
     * @return Result The result of the entire verification process.
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set The result of the entire verification process.
     * @param Result The result of the entire verification process.
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get The result description. 
     * @return Description The result description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set The result description.
     * @param Description The result description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The charge count. 
     * @return ChargeCount The charge count.
     */
    public Long getChargeCount() {
        return this.ChargeCount;
    }

    /**
     * Set The charge count.
     * @param ChargeCount The charge count.
     */
    public void setChargeCount(Long ChargeCount) {
        this.ChargeCount = ChargeCount;
    }

    /**
     * Get The results of multiple OCR processes (in order). The result of the final process is taken as the valid result. 
     * @return CardVerifyResults The results of multiple OCR processes (in order). The result of the final process is taken as the valid result.
     */
    public CardVerifyResult [] getCardVerifyResults() {
        return this.CardVerifyResults;
    }

    /**
     * Set The results of multiple OCR processes (in order). The result of the final process is taken as the valid result.
     * @param CardVerifyResults The results of multiple OCR processes (in order). The result of the final process is taken as the valid result.
     */
    public void setCardVerifyResults(CardVerifyResult [] CardVerifyResults) {
        this.CardVerifyResults = CardVerifyResults;
    }

    /**
     * Get The results of multiple liveness detection processes (in order). The result of the final process is taken as the valid result. 
     * @return CompareResults The results of multiple liveness detection processes (in order). The result of the final process is taken as the valid result.
     */
    public CompareResult [] getCompareResults() {
        return this.CompareResults;
    }

    /**
     * Set The results of multiple liveness detection processes (in order). The result of the final process is taken as the valid result.
     * @param CompareResults The results of multiple liveness detection processes (in order). The result of the final process is taken as the valid result.
     */
    public void setCompareResults(CompareResult [] CompareResults) {
        this.CompareResults = CompareResults;
    }

    /**
     * Get Info passed in the process of getting the token. 
     * @return Extra Info passed in the process of getting the token.
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set Info passed in the process of getting the token.
     * @param Extra Info passed in the process of getting the token.
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetSdkVerificationResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSdkVerificationResultResponse(GetSdkVerificationResultResponse source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ChargeCount != null) {
            this.ChargeCount = new Long(source.ChargeCount);
        }
        if (source.CardVerifyResults != null) {
            this.CardVerifyResults = new CardVerifyResult[source.CardVerifyResults.length];
            for (int i = 0; i < source.CardVerifyResults.length; i++) {
                this.CardVerifyResults[i] = new CardVerifyResult(source.CardVerifyResults[i]);
            }
        }
        if (source.CompareResults != null) {
            this.CompareResults = new CompareResult[source.CompareResults.length];
            for (int i = 0; i < source.CompareResults.length; i++) {
                this.CompareResults[i] = new CompareResult(source.CompareResults[i]);
            }
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ChargeCount", this.ChargeCount);
        this.setParamArrayObj(map, prefix + "CardVerifyResults.", this.CardVerifyResults);
        this.setParamArrayObj(map, prefix + "CompareResults.", this.CompareResults);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

