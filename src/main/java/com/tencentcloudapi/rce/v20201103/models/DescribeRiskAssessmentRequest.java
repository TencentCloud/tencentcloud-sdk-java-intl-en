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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRiskAssessmentRequest extends AbstractModel {

    /**
    * Business parameters
    */
    @SerializedName("BizCryptoData")
    @Expose
    private InputBizCryptoData BizCryptoData;

    /**
     * Get Business parameters 
     * @return BizCryptoData Business parameters
     */
    public InputBizCryptoData getBizCryptoData() {
        return this.BizCryptoData;
    }

    /**
     * Set Business parameters
     * @param BizCryptoData Business parameters
     */
    public void setBizCryptoData(InputBizCryptoData BizCryptoData) {
        this.BizCryptoData = BizCryptoData;
    }

    public DescribeRiskAssessmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskAssessmentRequest(DescribeRiskAssessmentRequest source) {
        if (source.BizCryptoData != null) {
            this.BizCryptoData = new InputBizCryptoData(source.BizCryptoData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BizCryptoData.", this.BizCryptoData);

    }
}

