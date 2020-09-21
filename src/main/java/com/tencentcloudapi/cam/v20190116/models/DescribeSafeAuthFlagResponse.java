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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSafeAuthFlagResponse extends AbstractModel{

    /**
    * Login protection settings
    */
    @SerializedName("LoginFlag")
    @Expose
    private LoginActionFlag LoginFlag;

    /**
    * Sensitive operation protection settings
    */
    @SerializedName("ActionFlag")
    @Expose
    private LoginActionFlag ActionFlag;

    /**
    * Unusual login location protection settings
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
    public LoginActionFlag getLoginFlag() {
        return this.LoginFlag;
    }

    /**
     * Set Login protection settings
     * @param LoginFlag Login protection settings
     */
    public void setLoginFlag(LoginActionFlag LoginFlag) {
        this.LoginFlag = LoginFlag;
    }

    /**
     * Get Sensitive operation protection settings 
     * @return ActionFlag Sensitive operation protection settings
     */
    public LoginActionFlag getActionFlag() {
        return this.ActionFlag;
    }

    /**
     * Set Sensitive operation protection settings
     * @param ActionFlag Sensitive operation protection settings
     */
    public void setActionFlag(LoginActionFlag ActionFlag) {
        this.ActionFlag = ActionFlag;
    }

    /**
     * Get Unusual login location protection settings 
     * @return OffsiteFlag Unusual login location protection settings
     */
    public OffsiteFlag getOffsiteFlag() {
        return this.OffsiteFlag;
    }

    /**
     * Set Unusual login location protection settings
     * @param OffsiteFlag Unusual login location protection settings
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

