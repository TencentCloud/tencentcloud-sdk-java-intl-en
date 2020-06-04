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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCFrequencyRule extends AbstractModel{

    /**
    * ID of the access frequency control rule for CC protection
    */
    @SerializedName("CCFrequencyRuleId")
    @Expose
    private String CCFrequencyRuleId;

    /**
    * URI string, which must start with `/`, such as `/abc/a.php`. Length limit: 31. If URI is `/`, only prefix match can be selected as the matching mode;
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * `User-Agent` string. Length limit: 80
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * Cookie string. Length limit: 40
    */
    @SerializedName("Cookie")
    @Expose
    private String Cookie;

    /**
    * Matching rule. Valid values: ["include" (prefix match), "equal" (exact match)]
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Reference period in seconds. Valid values: [10, 30, 60]
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Number of access requests. Value range: [1–10000]
    */
    @SerializedName("ReqNumber")
    @Expose
    private Long ReqNumber;

    /**
    * Action take. Valid values: ["alg" (CAPTCHA), "drop" (blocking)]
    */
    @SerializedName("Act")
    @Expose
    private String Act;

    /**
    * Execution duration in seconds. Valid range: [1-900]
    */
    @SerializedName("ExeDuration")
    @Expose
    private Long ExeDuration;

    /**
     * Get ID of the access frequency control rule for CC protection 
     * @return CCFrequencyRuleId ID of the access frequency control rule for CC protection
     */
    public String getCCFrequencyRuleId() {
        return this.CCFrequencyRuleId;
    }

    /**
     * Set ID of the access frequency control rule for CC protection
     * @param CCFrequencyRuleId ID of the access frequency control rule for CC protection
     */
    public void setCCFrequencyRuleId(String CCFrequencyRuleId) {
        this.CCFrequencyRuleId = CCFrequencyRuleId;
    }

    /**
     * Get URI string, which must start with `/`, such as `/abc/a.php`. Length limit: 31. If URI is `/`, only prefix match can be selected as the matching mode; 
     * @return Uri URI string, which must start with `/`, such as `/abc/a.php`. Length limit: 31. If URI is `/`, only prefix match can be selected as the matching mode;
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set URI string, which must start with `/`, such as `/abc/a.php`. Length limit: 31. If URI is `/`, only prefix match can be selected as the matching mode;
     * @param Uri URI string, which must start with `/`, such as `/abc/a.php`. Length limit: 31. If URI is `/`, only prefix match can be selected as the matching mode;
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * Get `User-Agent` string. Length limit: 80 
     * @return UserAgent `User-Agent` string. Length limit: 80
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set `User-Agent` string. Length limit: 80
     * @param UserAgent `User-Agent` string. Length limit: 80
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get Cookie string. Length limit: 40 
     * @return Cookie Cookie string. Length limit: 40
     */
    public String getCookie() {
        return this.Cookie;
    }

    /**
     * Set Cookie string. Length limit: 40
     * @param Cookie Cookie string. Length limit: 40
     */
    public void setCookie(String Cookie) {
        this.Cookie = Cookie;
    }

    /**
     * Get Matching rule. Valid values: ["include" (prefix match), "equal" (exact match)] 
     * @return Mode Matching rule. Valid values: ["include" (prefix match), "equal" (exact match)]
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Matching rule. Valid values: ["include" (prefix match), "equal" (exact match)]
     * @param Mode Matching rule. Valid values: ["include" (prefix match), "equal" (exact match)]
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Reference period in seconds. Valid values: [10, 30, 60] 
     * @return Period Reference period in seconds. Valid values: [10, 30, 60]
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Reference period in seconds. Valid values: [10, 30, 60]
     * @param Period Reference period in seconds. Valid values: [10, 30, 60]
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Number of access requests. Value range: [1–10000] 
     * @return ReqNumber Number of access requests. Value range: [1–10000]
     */
    public Long getReqNumber() {
        return this.ReqNumber;
    }

    /**
     * Set Number of access requests. Value range: [1–10000]
     * @param ReqNumber Number of access requests. Value range: [1–10000]
     */
    public void setReqNumber(Long ReqNumber) {
        this.ReqNumber = ReqNumber;
    }

    /**
     * Get Action take. Valid values: ["alg" (CAPTCHA), "drop" (blocking)] 
     * @return Act Action take. Valid values: ["alg" (CAPTCHA), "drop" (blocking)]
     */
    public String getAct() {
        return this.Act;
    }

    /**
     * Set Action take. Valid values: ["alg" (CAPTCHA), "drop" (blocking)]
     * @param Act Action take. Valid values: ["alg" (CAPTCHA), "drop" (blocking)]
     */
    public void setAct(String Act) {
        this.Act = Act;
    }

    /**
     * Get Execution duration in seconds. Valid range: [1-900] 
     * @return ExeDuration Execution duration in seconds. Valid range: [1-900]
     */
    public Long getExeDuration() {
        return this.ExeDuration;
    }

    /**
     * Set Execution duration in seconds. Valid range: [1-900]
     * @param ExeDuration Execution duration in seconds. Valid range: [1-900]
     */
    public void setExeDuration(Long ExeDuration) {
        this.ExeDuration = ExeDuration;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CCFrequencyRuleId", this.CCFrequencyRuleId);
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "Cookie", this.Cookie);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "ReqNumber", this.ReqNumber);
        this.setParamSimple(map, prefix + "Act", this.Act);
        this.setParamSimple(map, prefix + "ExeDuration", this.ExeDuration);

    }
}

