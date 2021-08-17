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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomHeaderResponse extends AbstractModel{

    /**
    * Rule ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * List of custom headers
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Headers")
    @Expose
    private HttpHeaderParam [] Headers;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Rule ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RuleId Rule ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RuleId Rule ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get List of custom headers
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Headers List of custom headers
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public HttpHeaderParam [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set List of custom headers
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Headers List of custom headers
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setHeaders(HttpHeaderParam [] Headers) {
        this.Headers = Headers;
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

    public DescribeCustomHeaderResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomHeaderResponse(DescribeCustomHeaderResponse source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Headers != null) {
            this.Headers = new HttpHeaderParam[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new HttpHeaderParam(source.Headers[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

