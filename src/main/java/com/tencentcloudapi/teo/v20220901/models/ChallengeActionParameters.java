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
    * <p>Specific challenge action for safe execution.</p><p>Enumeration values:</p><ul><li>InterstitialChallenge: interstitial challenge;</li><li>InlineChallenge: embedded challenge (SDK challenge);</li><li>ManagedChallenge: managed challenge. Applicable only to HTML web pages directly accessed by users through a browser. Verification cannot be completed in scenarios such as API interfaces, XHR/AJAX async requests within web pages, mobile apps, and command line tools. Do not configure it;</li><li>JSChallenge: JavaScript challenge. Applicable only to HTML web pages directly accessed by users through a browser. Verification cannot be completed in scenarios such as API interfaces, XHR/AJAX async requests within web pages, mobile apps, and command line tools. Do not configure it.</li></ul>
    */
    @SerializedName("ChallengeOption")
    @Expose
    private String ChallengeOption;

    /**
    * <p>Time interval for repeating the challenge. This field is required when ChallengeOption is InterstitialChallenge/InlineChallenge. Default value: 300s. Supported units: <li>s: second, value ranges from 1 to 60;</li><li>m: minute, value ranges from 1 to 60;</li><li>h: hour, value ranges from 1 to 24.</li></p>
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * <p>Client authentication method ID. This field is required when Name is InterstitialChallenge/InlineChallenge.</p>
    */
    @SerializedName("AttesterId")
    @Expose
    private String AttesterId;

    /**
     * Get <p>Specific challenge action for safe execution.</p><p>Enumeration values:</p><ul><li>InterstitialChallenge: interstitial challenge;</li><li>InlineChallenge: embedded challenge (SDK challenge);</li><li>ManagedChallenge: managed challenge. Applicable only to HTML web pages directly accessed by users through a browser. Verification cannot be completed in scenarios such as API interfaces, XHR/AJAX async requests within web pages, mobile apps, and command line tools. Do not configure it;</li><li>JSChallenge: JavaScript challenge. Applicable only to HTML web pages directly accessed by users through a browser. Verification cannot be completed in scenarios such as API interfaces, XHR/AJAX async requests within web pages, mobile apps, and command line tools. Do not configure it.</li></ul> 
     * @return ChallengeOption <p>Specific challenge action for safe execution.</p><p>Enumeration values:</p><ul><li>InterstitialChallenge: interstitial challenge;</li><li>InlineChallenge: embedded challenge (SDK challenge);</li><li>ManagedChallenge: managed challenge. Applicable only to HTML web pages directly accessed by users through a browser. Verification cannot be completed in scenarios such as API interfaces, XHR/AJAX async requests within web pages, mobile apps, and command line tools. Do not configure it;</li><li>JSChallenge: JavaScript challenge. Applicable only to HTML web pages directly accessed by users through a browser. Verification cannot be completed in scenarios such as API interfaces, XHR/AJAX async requests within web pages, mobile apps, and command line tools. Do not configure it.</li></ul>
     */
    public String getChallengeOption() {
        return this.ChallengeOption;
    }

    /**
     * Set <p>Specific challenge action for safe execution.</p><p>Enumeration values:</p><ul><li>InterstitialChallenge: interstitial challenge;</li><li>InlineChallenge: embedded challenge (SDK challenge);</li><li>ManagedChallenge: managed challenge. Applicable only to HTML web pages directly accessed by users through a browser. Verification cannot be completed in scenarios such as API interfaces, XHR/AJAX async requests within web pages, mobile apps, and command line tools. Do not configure it;</li><li>JSChallenge: JavaScript challenge. Applicable only to HTML web pages directly accessed by users through a browser. Verification cannot be completed in scenarios such as API interfaces, XHR/AJAX async requests within web pages, mobile apps, and command line tools. Do not configure it.</li></ul>
     * @param ChallengeOption <p>Specific challenge action for safe execution.</p><p>Enumeration values:</p><ul><li>InterstitialChallenge: interstitial challenge;</li><li>InlineChallenge: embedded challenge (SDK challenge);</li><li>ManagedChallenge: managed challenge. Applicable only to HTML web pages directly accessed by users through a browser. Verification cannot be completed in scenarios such as API interfaces, XHR/AJAX async requests within web pages, mobile apps, and command line tools. Do not configure it;</li><li>JSChallenge: JavaScript challenge. Applicable only to HTML web pages directly accessed by users through a browser. Verification cannot be completed in scenarios such as API interfaces, XHR/AJAX async requests within web pages, mobile apps, and command line tools. Do not configure it.</li></ul>
     */
    public void setChallengeOption(String ChallengeOption) {
        this.ChallengeOption = ChallengeOption;
    }

    /**
     * Get <p>Time interval for repeating the challenge. This field is required when ChallengeOption is InterstitialChallenge/InlineChallenge. Default value: 300s. Supported units: <li>s: second, value ranges from 1 to 60;</li><li>m: minute, value ranges from 1 to 60;</li><li>h: hour, value ranges from 1 to 24.</li></p> 
     * @return Interval <p>Time interval for repeating the challenge. This field is required when ChallengeOption is InterstitialChallenge/InlineChallenge. Default value: 300s. Supported units: <li>s: second, value ranges from 1 to 60;</li><li>m: minute, value ranges from 1 to 60;</li><li>h: hour, value ranges from 1 to 24.</li></p>
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>Time interval for repeating the challenge. This field is required when ChallengeOption is InterstitialChallenge/InlineChallenge. Default value: 300s. Supported units: <li>s: second, value ranges from 1 to 60;</li><li>m: minute, value ranges from 1 to 60;</li><li>h: hour, value ranges from 1 to 24.</li></p>
     * @param Interval <p>Time interval for repeating the challenge. This field is required when ChallengeOption is InterstitialChallenge/InlineChallenge. Default value: 300s. Supported units: <li>s: second, value ranges from 1 to 60;</li><li>m: minute, value ranges from 1 to 60;</li><li>h: hour, value ranges from 1 to 24.</li></p>
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>Client authentication method ID. This field is required when Name is InterstitialChallenge/InlineChallenge.</p> 
     * @return AttesterId <p>Client authentication method ID. This field is required when Name is InterstitialChallenge/InlineChallenge.</p>
     */
    public String getAttesterId() {
        return this.AttesterId;
    }

    /**
     * Set <p>Client authentication method ID. This field is required when Name is InterstitialChallenge/InlineChallenge.</p>
     * @param AttesterId <p>Client authentication method ID. This field is required when Name is InterstitialChallenge/InlineChallenge.</p>
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

