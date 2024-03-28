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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCallOutSessionRequest extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Customer Service User ID usually refers to the customer service email.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Called number must be preceded by 0086.
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * Caller number (obsolete one and use Callers) must be preceded by 0086.
    */
    @SerializedName("Caller")
    @Expose
    private String Caller;

    /**
    * Designated caller number list. If the prior number fails, it will automatically switch to the next number that must be preceded by 0086.
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * Whether to force the use of cell phone outbound call or not, currently only supports true, if true, please ensure that the allowlist has been configured.
    */
    @SerializedName("IsForceUseMobile")
    @Expose
    private Boolean IsForceUseMobile;

    /**
    * Custom data, length limited to 1024 bytes.
    */
    @SerializedName("Uui")
    @Expose
    private String Uui;

    /**
    * Custom data, length limited to 1024 bytes.
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
     * Get Application ID 
     * @return SdkAppId Application ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application ID
     * @param SdkAppId Application ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Customer Service User ID usually refers to the customer service email. 
     * @return UserId Customer Service User ID usually refers to the customer service email.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set Customer Service User ID usually refers to the customer service email.
     * @param UserId Customer Service User ID usually refers to the customer service email.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Called number must be preceded by 0086. 
     * @return Callee Called number must be preceded by 0086.
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set Called number must be preceded by 0086.
     * @param Callee Called number must be preceded by 0086.
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get Caller number (obsolete one and use Callers) must be preceded by 0086. 
     * @return Caller Caller number (obsolete one and use Callers) must be preceded by 0086.
     */
    public String getCaller() {
        return this.Caller;
    }

    /**
     * Set Caller number (obsolete one and use Callers) must be preceded by 0086.
     * @param Caller Caller number (obsolete one and use Callers) must be preceded by 0086.
     */
    public void setCaller(String Caller) {
        this.Caller = Caller;
    }

    /**
     * Get Designated caller number list. If the prior number fails, it will automatically switch to the next number that must be preceded by 0086. 
     * @return Callers Designated caller number list. If the prior number fails, it will automatically switch to the next number that must be preceded by 0086.
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set Designated caller number list. If the prior number fails, it will automatically switch to the next number that must be preceded by 0086.
     * @param Callers Designated caller number list. If the prior number fails, it will automatically switch to the next number that must be preceded by 0086.
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get Whether to force the use of cell phone outbound call or not, currently only supports true, if true, please ensure that the allowlist has been configured. 
     * @return IsForceUseMobile Whether to force the use of cell phone outbound call or not, currently only supports true, if true, please ensure that the allowlist has been configured.
     */
    public Boolean getIsForceUseMobile() {
        return this.IsForceUseMobile;
    }

    /**
     * Set Whether to force the use of cell phone outbound call or not, currently only supports true, if true, please ensure that the allowlist has been configured.
     * @param IsForceUseMobile Whether to force the use of cell phone outbound call or not, currently only supports true, if true, please ensure that the allowlist has been configured.
     */
    public void setIsForceUseMobile(Boolean IsForceUseMobile) {
        this.IsForceUseMobile = IsForceUseMobile;
    }

    /**
     * Get Custom data, length limited to 1024 bytes. 
     * @return Uui Custom data, length limited to 1024 bytes.
     * @deprecated
     */
    @Deprecated
    public String getUui() {
        return this.Uui;
    }

    /**
     * Set Custom data, length limited to 1024 bytes.
     * @param Uui Custom data, length limited to 1024 bytes.
     * @deprecated
     */
    @Deprecated
    public void setUui(String Uui) {
        this.Uui = Uui;
    }

    /**
     * Get Custom data, length limited to 1024 bytes. 
     * @return UUI Custom data, length limited to 1024 bytes.
     */
    public String getUUI() {
        return this.UUI;
    }

    /**
     * Set Custom data, length limited to 1024 bytes.
     * @param UUI Custom data, length limited to 1024 bytes.
     */
    public void setUUI(String UUI) {
        this.UUI = UUI;
    }

    public CreateCallOutSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCallOutSessionRequest(CreateCallOutSessionRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.Caller != null) {
            this.Caller = new String(source.Caller);
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.IsForceUseMobile != null) {
            this.IsForceUseMobile = new Boolean(source.IsForceUseMobile);
        }
        if (source.Uui != null) {
            this.Uui = new String(source.Uui);
        }
        if (source.UUI != null) {
            this.UUI = new String(source.UUI);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "Caller", this.Caller);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamSimple(map, prefix + "IsForceUseMobile", this.IsForceUseMobile);
        this.setParamSimple(map, prefix + "Uui", this.Uui);
        this.setParamSimple(map, prefix + "UUI", this.UUI);

    }
}

