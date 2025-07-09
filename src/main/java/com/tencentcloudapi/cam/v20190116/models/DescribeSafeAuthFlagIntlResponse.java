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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSafeAuthFlagIntlResponse extends AbstractModel {

    /**
    * Login protection settings
    */
    @SerializedName("LoginFlag")
    @Expose
    private LoginActionFlagIntl LoginFlag;

    /**
    * Sensitive operation protection settings
    */
    @SerializedName("ActionFlag")
    @Expose
    private LoginActionFlagIntl ActionFlag;

    /**
    * Suspicious login location protection settings
    */
    @SerializedName("OffsiteFlag")
    @Expose
    private OffsiteFlag OffsiteFlag;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Login protection settings 
     * @return LoginFlag Login protection settings
     */
    public LoginActionFlagIntl getLoginFlag() {
        return this.LoginFlag;
    }

    /**
     * Set Login protection settings
     * @param LoginFlag Login protection settings
     */
    public void setLoginFlag(LoginActionFlagIntl LoginFlag) {
        this.LoginFlag = LoginFlag;
    }

    /**
     * Get Sensitive operation protection settings 
     * @return ActionFlag Sensitive operation protection settings
     */
    public LoginActionFlagIntl getActionFlag() {
        return this.ActionFlag;
    }

    /**
     * Set Sensitive operation protection settings
     * @param ActionFlag Sensitive operation protection settings
     */
    public void setActionFlag(LoginActionFlagIntl ActionFlag) {
        this.ActionFlag = ActionFlag;
    }

    /**
     * Get Suspicious login location protection settings 
     * @return OffsiteFlag Suspicious login location protection settings
     */
    public OffsiteFlag getOffsiteFlag() {
        return this.OffsiteFlag;
    }

    /**
     * Set Suspicious login location protection settings
     * @param OffsiteFlag Suspicious login location protection settings
     */
    public void setOffsiteFlag(OffsiteFlag OffsiteFlag) {
        this.OffsiteFlag = OffsiteFlag;
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

    public DescribeSafeAuthFlagIntlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSafeAuthFlagIntlResponse(DescribeSafeAuthFlagIntlResponse source) {
        if (source.LoginFlag != null) {
            this.LoginFlag = new LoginActionFlagIntl(source.LoginFlag);
        }
        if (source.ActionFlag != null) {
            this.ActionFlag = new LoginActionFlagIntl(source.ActionFlag);
        }
        if (source.OffsiteFlag != null) {
            this.OffsiteFlag = new OffsiteFlag(source.OffsiteFlag);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LoginFlag.", this.LoginFlag);
        this.setParamObj(map, prefix + "ActionFlag.", this.ActionFlag);
        this.setParamObj(map, prefix + "OffsiteFlag.", this.OffsiteFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

