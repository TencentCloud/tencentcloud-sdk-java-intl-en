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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PutEvaluationsRequest extends AbstractModel {

    /**
    * Callback token. Obtained from the ResultToken value in the Context of the selected Serverless Cloud Function (SCF) for the custom rule.
    */
    @SerializedName("ResultToken")
    @Expose
    private String ResultToken;

    /**
    * Custom rule evaluation result information.
    */
    @SerializedName("Evaluations")
    @Expose
    private Evaluation [] Evaluations;

    /**
     * Get Callback token. Obtained from the ResultToken value in the Context of the selected Serverless Cloud Function (SCF) for the custom rule. 
     * @return ResultToken Callback token. Obtained from the ResultToken value in the Context of the selected Serverless Cloud Function (SCF) for the custom rule.
     */
    public String getResultToken() {
        return this.ResultToken;
    }

    /**
     * Set Callback token. Obtained from the ResultToken value in the Context of the selected Serverless Cloud Function (SCF) for the custom rule.
     * @param ResultToken Callback token. Obtained from the ResultToken value in the Context of the selected Serverless Cloud Function (SCF) for the custom rule.
     */
    public void setResultToken(String ResultToken) {
        this.ResultToken = ResultToken;
    }

    /**
     * Get Custom rule evaluation result information. 
     * @return Evaluations Custom rule evaluation result information.
     */
    public Evaluation [] getEvaluations() {
        return this.Evaluations;
    }

    /**
     * Set Custom rule evaluation result information.
     * @param Evaluations Custom rule evaluation result information.
     */
    public void setEvaluations(Evaluation [] Evaluations) {
        this.Evaluations = Evaluations;
    }

    public PutEvaluationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PutEvaluationsRequest(PutEvaluationsRequest source) {
        if (source.ResultToken != null) {
            this.ResultToken = new String(source.ResultToken);
        }
        if (source.Evaluations != null) {
            this.Evaluations = new Evaluation[source.Evaluations.length];
            for (int i = 0; i < source.Evaluations.length; i++) {
                this.Evaluations[i] = new Evaluation(source.Evaluations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultToken", this.ResultToken);
        this.setParamArrayObj(map, prefix + "Evaluations.", this.Evaluations);

    }
}

