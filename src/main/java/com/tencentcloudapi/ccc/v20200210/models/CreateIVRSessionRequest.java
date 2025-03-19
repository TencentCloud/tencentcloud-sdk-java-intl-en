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

public class CreateIVRSessionRequest extends AbstractModel {

    /**
    * Application id (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Called.
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * Specified ivr id. currently, it supports inbound and automatic outbound types.
    */
    @SerializedName("IVRId")
    @Expose
    private Long IVRId;

    /**
    * List of calling numbers.
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * Custom variable.
    */
    @SerializedName("Variables")
    @Expose
    private Variable [] Variables;

    /**
    * User data.
    */
    @SerializedName("UUI")
    @Expose
    private String UUI;

    /**
     * Get Application id (required) can be found at https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     * @param SdkAppId Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Called. 
     * @return Callee Called.
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set Called.
     * @param Callee Called.
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get Specified ivr id. currently, it supports inbound and automatic outbound types. 
     * @return IVRId Specified ivr id. currently, it supports inbound and automatic outbound types.
     */
    public Long getIVRId() {
        return this.IVRId;
    }

    /**
     * Set Specified ivr id. currently, it supports inbound and automatic outbound types.
     * @param IVRId Specified ivr id. currently, it supports inbound and automatic outbound types.
     */
    public void setIVRId(Long IVRId) {
        this.IVRId = IVRId;
    }

    /**
     * Get List of calling numbers. 
     * @return Callers List of calling numbers.
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set List of calling numbers.
     * @param Callers List of calling numbers.
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get Custom variable. 
     * @return Variables Custom variable.
     */
    public Variable [] getVariables() {
        return this.Variables;
    }

    /**
     * Set Custom variable.
     * @param Variables Custom variable.
     */
    public void setVariables(Variable [] Variables) {
        this.Variables = Variables;
    }

    /**
     * Get User data. 
     * @return UUI User data.
     */
    public String getUUI() {
        return this.UUI;
    }

    /**
     * Set User data.
     * @param UUI User data.
     */
    public void setUUI(String UUI) {
        this.UUI = UUI;
    }

    public CreateIVRSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIVRSessionRequest(CreateIVRSessionRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.IVRId != null) {
            this.IVRId = new Long(source.IVRId);
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.Variables != null) {
            this.Variables = new Variable[source.Variables.length];
            for (int i = 0; i < source.Variables.length; i++) {
                this.Variables[i] = new Variable(source.Variables[i]);
            }
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
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "IVRId", this.IVRId);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamArrayObj(map, prefix + "Variables.", this.Variables);
        this.setParamSimple(map, prefix + "UUI", this.UUI);

    }
}

