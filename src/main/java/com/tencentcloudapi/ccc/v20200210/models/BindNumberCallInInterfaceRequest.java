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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindNumberCallInInterfaceRequest extends AbstractModel {

    /**
    * App ID (required). can be used to view https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Number to be bound.
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * Specifies the callback url to be bound.
    */
    @SerializedName("CallInInterface")
    @Expose
    private Interface CallInInterface;

    /**
     * Get App ID (required). can be used to view https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId App ID (required). can be used to view https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set App ID (required). can be used to view https://console.cloud.tencent.com/ccc.
     * @param SdkAppId App ID (required). can be used to view https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Number to be bound. 
     * @return Number Number to be bound.
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set Number to be bound.
     * @param Number Number to be bound.
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get Specifies the callback url to be bound. 
     * @return CallInInterface Specifies the callback url to be bound.
     */
    public Interface getCallInInterface() {
        return this.CallInInterface;
    }

    /**
     * Set Specifies the callback url to be bound.
     * @param CallInInterface Specifies the callback url to be bound.
     */
    public void setCallInInterface(Interface CallInInterface) {
        this.CallInInterface = CallInInterface;
    }

    public BindNumberCallInInterfaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindNumberCallInInterfaceRequest(BindNumberCallInInterfaceRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.CallInInterface != null) {
            this.CallInInterface = new Interface(source.CallInInterface);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamObj(map, prefix + "CallInInterface.", this.CallInInterface);

    }
}

