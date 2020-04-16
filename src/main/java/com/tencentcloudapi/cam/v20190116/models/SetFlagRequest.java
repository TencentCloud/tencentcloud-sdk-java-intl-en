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

public class SetFlagRequest extends AbstractModel{

    /**
    * Set user UIN
    */
    @SerializedName("OpUin")
    @Expose
    private Long OpUin;

    /**
    * Login settings
    */
    @SerializedName("LoginFlag")
    @Expose
    private LoginActionFlag LoginFlag;

    /**
    * Sensitive operation settings
    */
    @SerializedName("ActionFlag")
    @Expose
    private LoginActionFlag ActionFlag;

    /**
    * Remote login settings
    */
    @SerializedName("OffsiteFlag")
    @Expose
    private OffsiteFlag OffsiteFlag;

    /**
    * Whether or not to reset MFA
    */
    @SerializedName("NeedResetMfa")
    @Expose
    private Long NeedResetMfa;

    /**
     * Get Set user UIN 
     * @return OpUin Set user UIN
     */
    public Long getOpUin() {
        return this.OpUin;
    }

    /**
     * Set Set user UIN
     * @param OpUin Set user UIN
     */
    public void setOpUin(Long OpUin) {
        this.OpUin = OpUin;
    }

    /**
     * Get Login settings 
     * @return LoginFlag Login settings
     */
    public LoginActionFlag getLoginFlag() {
        return this.LoginFlag;
    }

    /**
     * Set Login settings
     * @param LoginFlag Login settings
     */
    public void setLoginFlag(LoginActionFlag LoginFlag) {
        this.LoginFlag = LoginFlag;
    }

    /**
     * Get Sensitive operation settings 
     * @return ActionFlag Sensitive operation settings
     */
    public LoginActionFlag getActionFlag() {
        return this.ActionFlag;
    }

    /**
     * Set Sensitive operation settings
     * @param ActionFlag Sensitive operation settings
     */
    public void setActionFlag(LoginActionFlag ActionFlag) {
        this.ActionFlag = ActionFlag;
    }

    /**
     * Get Remote login settings 
     * @return OffsiteFlag Remote login settings
     */
    public OffsiteFlag getOffsiteFlag() {
        return this.OffsiteFlag;
    }

    /**
     * Set Remote login settings
     * @param OffsiteFlag Remote login settings
     */
    public void setOffsiteFlag(OffsiteFlag OffsiteFlag) {
        this.OffsiteFlag = OffsiteFlag;
    }

    /**
     * Get Whether or not to reset MFA 
     * @return NeedResetMfa Whether or not to reset MFA
     */
    public Long getNeedResetMfa() {
        return this.NeedResetMfa;
    }

    /**
     * Set Whether or not to reset MFA
     * @param NeedResetMfa Whether or not to reset MFA
     */
    public void setNeedResetMfa(Long NeedResetMfa) {
        this.NeedResetMfa = NeedResetMfa;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpUin", this.OpUin);
        this.setParamObj(map, prefix + "LoginFlag.", this.LoginFlag);
        this.setParamObj(map, prefix + "ActionFlag.", this.ActionFlag);
        this.setParamObj(map, prefix + "OffsiteFlag.", this.OffsiteFlag);
        this.setParamSimple(map, prefix + "NeedResetMfa", this.NeedResetMfa);

    }
}

