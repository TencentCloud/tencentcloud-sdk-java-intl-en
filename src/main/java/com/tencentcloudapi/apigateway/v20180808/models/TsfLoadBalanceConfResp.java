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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TsfLoadBalanceConfResp extends AbstractModel {

    /**
    * Whether load balancing is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsLoadBalance")
    @Expose
    private Boolean IsLoadBalance;

    /**
    * Load balancing method.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Whether session persistence is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionStickRequired")
    @Expose
    private Boolean SessionStickRequired;

    /**
    * Session persistence timeout period.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionStickTimeout")
    @Expose
    private Long SessionStickTimeout;

    /**
     * Get Whether load balancing is enabled.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsLoadBalance Whether load balancing is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsLoadBalance() {
        return this.IsLoadBalance;
    }

    /**
     * Set Whether load balancing is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsLoadBalance Whether load balancing is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsLoadBalance(Boolean IsLoadBalance) {
        this.IsLoadBalance = IsLoadBalance;
    }

    /**
     * Get Load balancing method.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Method Load balancing method.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Load balancing method.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Method Load balancing method.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Whether session persistence is enabled.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SessionStickRequired Whether session persistence is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSessionStickRequired() {
        return this.SessionStickRequired;
    }

    /**
     * Set Whether session persistence is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SessionStickRequired Whether session persistence is enabled.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionStickRequired(Boolean SessionStickRequired) {
        this.SessionStickRequired = SessionStickRequired;
    }

    /**
     * Get Session persistence timeout period.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SessionStickTimeout Session persistence timeout period.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSessionStickTimeout() {
        return this.SessionStickTimeout;
    }

    /**
     * Set Session persistence timeout period.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SessionStickTimeout Session persistence timeout period.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionStickTimeout(Long SessionStickTimeout) {
        this.SessionStickTimeout = SessionStickTimeout;
    }

    public TsfLoadBalanceConfResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TsfLoadBalanceConfResp(TsfLoadBalanceConfResp source) {
        if (source.IsLoadBalance != null) {
            this.IsLoadBalance = new Boolean(source.IsLoadBalance);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.SessionStickRequired != null) {
            this.SessionStickRequired = new Boolean(source.SessionStickRequired);
        }
        if (source.SessionStickTimeout != null) {
            this.SessionStickTimeout = new Long(source.SessionStickTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsLoadBalance", this.IsLoadBalance);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "SessionStickRequired", this.SessionStickRequired);
        this.setParamSimple(map, prefix + "SessionStickTimeout", this.SessionStickTimeout);

    }
}

