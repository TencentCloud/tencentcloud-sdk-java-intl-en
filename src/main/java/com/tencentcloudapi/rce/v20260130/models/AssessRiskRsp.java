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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssessRiskRsp extends AbstractModel {

    /**
    * <p>Decision information</p>
    */
    @SerializedName("Decision")
    @Expose
    private Decision Decision;

    /**
    * <p>Risk score, a scoring result calculated based on the product services you have enabled</p>
    */
    @SerializedName("Score")
    @Expose
    private Score Score;

    /**
    * <p>Extended information</p>
    */
    @SerializedName("ExtraInfo")
    @Expose
    private Cust [] ExtraInfo;

    /**
     * Get <p>Decision information</p> 
     * @return Decision <p>Decision information</p>
     */
    public Decision getDecision() {
        return this.Decision;
    }

    /**
     * Set <p>Decision information</p>
     * @param Decision <p>Decision information</p>
     */
    public void setDecision(Decision Decision) {
        this.Decision = Decision;
    }

    /**
     * Get <p>Risk score, a scoring result calculated based on the product services you have enabled</p> 
     * @return Score <p>Risk score, a scoring result calculated based on the product services you have enabled</p>
     */
    public Score getScore() {
        return this.Score;
    }

    /**
     * Set <p>Risk score, a scoring result calculated based on the product services you have enabled</p>
     * @param Score <p>Risk score, a scoring result calculated based on the product services you have enabled</p>
     */
    public void setScore(Score Score) {
        this.Score = Score;
    }

    /**
     * Get <p>Extended information</p> 
     * @return ExtraInfo <p>Extended information</p>
     */
    public Cust [] getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set <p>Extended information</p>
     * @param ExtraInfo <p>Extended information</p>
     */
    public void setExtraInfo(Cust [] ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    public AssessRiskRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssessRiskRsp(AssessRiskRsp source) {
        if (source.Decision != null) {
            this.Decision = new Decision(source.Decision);
        }
        if (source.Score != null) {
            this.Score = new Score(source.Score);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new Cust[source.ExtraInfo.length];
            for (int i = 0; i < source.ExtraInfo.length; i++) {
                this.ExtraInfo[i] = new Cust(source.ExtraInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Decision.", this.Decision);
        this.setParamObj(map, prefix + "Score.", this.Score);
        this.setParamArrayObj(map, prefix + "ExtraInfo.", this.ExtraInfo);

    }
}

