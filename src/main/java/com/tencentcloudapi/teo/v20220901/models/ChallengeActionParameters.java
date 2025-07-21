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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChallengeActionParameters extends AbstractModel {

    /**
    * Safe execution challenge actions. valid values: <li> InterstitialChallenge: interstitial challenge;</li> <li> InlineChallenge: embedded challenge;</li> <li> JSChallenge: JavaScript challenge;</li> <li> ManagedChallenge: managed challenge.</li>.
    */
    @SerializedName("ChallengeOption")
    @Expose
    private String ChallengeOption;

    /**
    * Specifies the time interval for challenge repetition. this field is required when Name is InterstitialChallenge/InlineChallenge. default value is 300s. supported units: <li>s: second, value ranges from 1 to 60;</li><li>m: minute, value ranges from 1 to 60;</li><li>h: hour, value ranges from 1 to 24.</li>.

    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * Client authentication method ID. this field is required when Name is InterstitialChallenge/InlineChallenge.
    */
    @SerializedName("AttesterId")
    @Expose
    private String AttesterId;

    /**
     * Get Safe execution challenge actions. valid values: <li> InterstitialChallenge: interstitial challenge;</li> <li> InlineChallenge: embedded challenge;</li> <li> JSChallenge: JavaScript challenge;</li> <li> ManagedChallenge: managed challenge.</li>. 
     * @return ChallengeOption Safe execution challenge actions. valid values: <li> InterstitialChallenge: interstitial challenge;</li> <li> InlineChallenge: embedded challenge;</li> <li> JSChallenge: JavaScript challenge;</li> <li> ManagedChallenge: managed challenge.</li>.
     */
    public String getChallengeOption() {
        return this.ChallengeOption;
    }

    /**
     * Set Safe execution challenge actions. valid values: <li> InterstitialChallenge: interstitial challenge;</li> <li> InlineChallenge: embedded challenge;</li> <li> JSChallenge: JavaScript challenge;</li> <li> ManagedChallenge: managed challenge.</li>.
     * @param ChallengeOption Safe execution challenge actions. valid values: <li> InterstitialChallenge: interstitial challenge;</li> <li> InlineChallenge: embedded challenge;</li> <li> JSChallenge: JavaScript challenge;</li> <li> ManagedChallenge: managed challenge.</li>.
     */
    public void setChallengeOption(String ChallengeOption) {
        this.ChallengeOption = ChallengeOption;
    }

    /**
     * Get Specifies the time interval for challenge repetition. this field is required when Name is InterstitialChallenge/InlineChallenge. default value is 300s. supported units: <li>s: second, value ranges from 1 to 60;</li><li>m: minute, value ranges from 1 to 60;</li><li>h: hour, value ranges from 1 to 24.</li>.
 
     * @return Interval Specifies the time interval for challenge repetition. this field is required when Name is InterstitialChallenge/InlineChallenge. default value is 300s. supported units: <li>s: second, value ranges from 1 to 60;</li><li>m: minute, value ranges from 1 to 60;</li><li>h: hour, value ranges from 1 to 24.</li>.

     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set Specifies the time interval for challenge repetition. this field is required when Name is InterstitialChallenge/InlineChallenge. default value is 300s. supported units: <li>s: second, value ranges from 1 to 60;</li><li>m: minute, value ranges from 1 to 60;</li><li>h: hour, value ranges from 1 to 24.</li>.

     * @param Interval Specifies the time interval for challenge repetition. this field is required when Name is InterstitialChallenge/InlineChallenge. default value is 300s. supported units: <li>s: second, value ranges from 1 to 60;</li><li>m: minute, value ranges from 1 to 60;</li><li>h: hour, value ranges from 1 to 24.</li>.

     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Client authentication method ID. this field is required when Name is InterstitialChallenge/InlineChallenge. 
     * @return AttesterId Client authentication method ID. this field is required when Name is InterstitialChallenge/InlineChallenge.
     */
    public String getAttesterId() {
        return this.AttesterId;
    }

    /**
     * Set Client authentication method ID. this field is required when Name is InterstitialChallenge/InlineChallenge.
     * @param AttesterId Client authentication method ID. this field is required when Name is InterstitialChallenge/InlineChallenge.
     */
    public void setAttesterId(String AttesterId) {
        this.AttesterId = AttesterId;
    }

    public ChallengeActionParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChallengeActionParameters(ChallengeActionParameters source) {
        if (source.ChallengeOption != null) {
            this.ChallengeOption = new String(source.ChallengeOption);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.AttesterId != null) {
            this.AttesterId = new String(source.AttesterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChallengeOption", this.ChallengeOption);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "AttesterId", this.AttesterId);

    }
}

