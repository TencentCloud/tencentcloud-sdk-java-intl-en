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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCReqLimitPolicyRecord extends AbstractModel {

    /**
    * Sampling interval (in seconds). Valid values: `1`, `10`, `30`, and `60`.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Number of requests. Value range: 1-2000.
    */
    @SerializedName("RequestNum")
    @Expose
    private Long RequestNum;

    /**
    * Action of limiting request frequency. Valid values: `alg` (limit request frequency via verification codes) and `drop`(drop requests).
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Sets an interval of the frequency limit policy. Value range: 1-86400 (in seconds).
    */
    @SerializedName("ExecuteDuration")
    @Expose
    private Long ExecuteDuration;

    /**
    * Filters values of configuration fields. `include`: The value is included. `equal`: The value matches the configuration field.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * URI, which cannot be used together with `User-Agent` and `Cookie`.
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * User-Agent, which cannot be used together with `Uri` and `Cookie`.
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * Cookie, which cannot be used together with `Uri` and `User-Agent`.
    */
    @SerializedName("Cookie")
    @Expose
    private String Cookie;

    /**
     * Get Sampling interval (in seconds). Valid values: `1`, `10`, `30`, and `60`. 
     * @return Period Sampling interval (in seconds). Valid values: `1`, `10`, `30`, and `60`.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Sampling interval (in seconds). Valid values: `1`, `10`, `30`, and `60`.
     * @param Period Sampling interval (in seconds). Valid values: `1`, `10`, `30`, and `60`.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Number of requests. Value range: 1-2000. 
     * @return RequestNum Number of requests. Value range: 1-2000.
     */
    public Long getRequestNum() {
        return this.RequestNum;
    }

    /**
     * Set Number of requests. Value range: 1-2000.
     * @param RequestNum Number of requests. Value range: 1-2000.
     */
    public void setRequestNum(Long RequestNum) {
        this.RequestNum = RequestNum;
    }

    /**
     * Get Action of limiting request frequency. Valid values: `alg` (limit request frequency via verification codes) and `drop`(drop requests). 
     * @return Action Action of limiting request frequency. Valid values: `alg` (limit request frequency via verification codes) and `drop`(drop requests).
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action of limiting request frequency. Valid values: `alg` (limit request frequency via verification codes) and `drop`(drop requests).
     * @param Action Action of limiting request frequency. Valid values: `alg` (limit request frequency via verification codes) and `drop`(drop requests).
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Sets an interval of the frequency limit policy. Value range: 1-86400 (in seconds). 
     * @return ExecuteDuration Sets an interval of the frequency limit policy. Value range: 1-86400 (in seconds).
     */
    public Long getExecuteDuration() {
        return this.ExecuteDuration;
    }

    /**
     * Set Sets an interval of the frequency limit policy. Value range: 1-86400 (in seconds).
     * @param ExecuteDuration Sets an interval of the frequency limit policy. Value range: 1-86400 (in seconds).
     */
    public void setExecuteDuration(Long ExecuteDuration) {
        this.ExecuteDuration = ExecuteDuration;
    }

    /**
     * Get Filters values of configuration fields. `include`: The value is included. `equal`: The value matches the configuration field. 
     * @return Mode Filters values of configuration fields. `include`: The value is included. `equal`: The value matches the configuration field.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Filters values of configuration fields. `include`: The value is included. `equal`: The value matches the configuration field.
     * @param Mode Filters values of configuration fields. `include`: The value is included. `equal`: The value matches the configuration field.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get URI, which cannot be used together with `User-Agent` and `Cookie`. 
     * @return Uri URI, which cannot be used together with `User-Agent` and `Cookie`.
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set URI, which cannot be used together with `User-Agent` and `Cookie`.
     * @param Uri URI, which cannot be used together with `User-Agent` and `Cookie`.
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * Get User-Agent, which cannot be used together with `Uri` and `Cookie`. 
     * @return UserAgent User-Agent, which cannot be used together with `Uri` and `Cookie`.
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set User-Agent, which cannot be used together with `Uri` and `Cookie`.
     * @param UserAgent User-Agent, which cannot be used together with `Uri` and `Cookie`.
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get Cookie, which cannot be used together with `Uri` and `User-Agent`. 
     * @return Cookie Cookie, which cannot be used together with `Uri` and `User-Agent`.
     */
    public String getCookie() {
        return this.Cookie;
    }

    /**
     * Set Cookie, which cannot be used together with `Uri` and `User-Agent`.
     * @param Cookie Cookie, which cannot be used together with `Uri` and `User-Agent`.
     */
    public void setCookie(String Cookie) {
        this.Cookie = Cookie;
    }

    public CCReqLimitPolicyRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCReqLimitPolicyRecord(CCReqLimitPolicyRecord source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RequestNum != null) {
            this.RequestNum = new Long(source.RequestNum);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.ExecuteDuration != null) {
            this.ExecuteDuration = new Long(source.ExecuteDuration);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
        }
        if (source.UserAgent != null) {
            this.UserAgent = new String(source.UserAgent);
        }
        if (source.Cookie != null) {
            this.Cookie = new String(source.Cookie);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RequestNum", this.RequestNum);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ExecuteDuration", this.ExecuteDuration);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "Cookie", this.Cookie);

    }
}

