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

public class DisableCCCPhoneNumberRequest extends AbstractModel {

    /**
    * Number list starting with 0086.
    */
    @SerializedName("PhoneNumbers")
    @Expose
    private String [] PhoneNumbers;

    /**
    * Disable switch: 0 for enable, 1 for disable.
    */
    @SerializedName("Disabled")
    @Expose
    private Long Disabled;

    /**
    * TCCC instance application ID.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
     * Get Number list starting with 0086. 
     * @return PhoneNumbers Number list starting with 0086.
     */
    public String [] getPhoneNumbers() {
        return this.PhoneNumbers;
    }

    /**
     * Set Number list starting with 0086.
     * @param PhoneNumbers Number list starting with 0086.
     */
    public void setPhoneNumbers(String [] PhoneNumbers) {
        this.PhoneNumbers = PhoneNumbers;
    }

    /**
     * Get Disable switch: 0 for enable, 1 for disable. 
     * @return Disabled Disable switch: 0 for enable, 1 for disable.
     */
    public Long getDisabled() {
        return this.Disabled;
    }

    /**
     * Set Disable switch: 0 for enable, 1 for disable.
     * @param Disabled Disable switch: 0 for enable, 1 for disable.
     */
    public void setDisabled(Long Disabled) {
        this.Disabled = Disabled;
    }

    /**
     * Get TCCC instance application ID. 
     * @return SdkAppId TCCC instance application ID.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TCCC instance application ID.
     * @param SdkAppId TCCC instance application ID.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    public DisableCCCPhoneNumberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisableCCCPhoneNumberRequest(DisableCCCPhoneNumberRequest source) {
        if (source.PhoneNumbers != null) {
            this.PhoneNumbers = new String[source.PhoneNumbers.length];
            for (int i = 0; i < source.PhoneNumbers.length; i++) {
                this.PhoneNumbers[i] = new String(source.PhoneNumbers[i]);
            }
        }
        if (source.Disabled != null) {
            this.Disabled = new Long(source.Disabled);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PhoneNumbers.", this.PhoneNumbers);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);

    }
}

