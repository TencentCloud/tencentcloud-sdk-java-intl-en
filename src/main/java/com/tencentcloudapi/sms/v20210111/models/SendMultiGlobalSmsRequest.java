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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendMultiGlobalSmsRequest extends AbstractModel {

    /**
    * The SMS `SdkAppId` generated after an application is added in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as 2400006666.
    */
    @SerializedName("SmsSdkAppId")
    @Expose
    private String SmsSdkAppId;

    /**
    * Multi SMS information list. Up to 200 phone numbers are supported in one request, which should be all Global SMS numbers. Each element contains a phone number and its corresponding template, template parameters, and other information.
    */
    @SerializedName("MultiSmsInfoSet")
    @Expose
    private MultiSmsInfo [] MultiSmsInfoSet;

    /**
     * Get The SMS `SdkAppId` generated after an application is added in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as 2400006666. 
     * @return SmsSdkAppId The SMS `SdkAppId` generated after an application is added in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as 2400006666.
     */
    public String getSmsSdkAppId() {
        return this.SmsSdkAppId;
    }

    /**
     * Set The SMS `SdkAppId` generated after an application is added in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as 2400006666.
     * @param SmsSdkAppId The SMS `SdkAppId` generated after an application is added in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as 2400006666.
     */
    public void setSmsSdkAppId(String SmsSdkAppId) {
        this.SmsSdkAppId = SmsSdkAppId;
    }

    /**
     * Get Multi SMS information list. Up to 200 phone numbers are supported in one request, which should be all Global SMS numbers. Each element contains a phone number and its corresponding template, template parameters, and other information. 
     * @return MultiSmsInfoSet Multi SMS information list. Up to 200 phone numbers are supported in one request, which should be all Global SMS numbers. Each element contains a phone number and its corresponding template, template parameters, and other information.
     */
    public MultiSmsInfo [] getMultiSmsInfoSet() {
        return this.MultiSmsInfoSet;
    }

    /**
     * Set Multi SMS information list. Up to 200 phone numbers are supported in one request, which should be all Global SMS numbers. Each element contains a phone number and its corresponding template, template parameters, and other information.
     * @param MultiSmsInfoSet Multi SMS information list. Up to 200 phone numbers are supported in one request, which should be all Global SMS numbers. Each element contains a phone number and its corresponding template, template parameters, and other information.
     */
    public void setMultiSmsInfoSet(MultiSmsInfo [] MultiSmsInfoSet) {
        this.MultiSmsInfoSet = MultiSmsInfoSet;
    }

    public SendMultiGlobalSmsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendMultiGlobalSmsRequest(SendMultiGlobalSmsRequest source) {
        if (source.SmsSdkAppId != null) {
            this.SmsSdkAppId = new String(source.SmsSdkAppId);
        }
        if (source.MultiSmsInfoSet != null) {
            this.MultiSmsInfoSet = new MultiSmsInfo[source.MultiSmsInfoSet.length];
            for (int i = 0; i < source.MultiSmsInfoSet.length; i++) {
                this.MultiSmsInfoSet[i] = new MultiSmsInfo(source.MultiSmsInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SmsSdkAppId", this.SmsSdkAppId);
        this.setParamArrayObj(map, prefix + "MultiSmsInfoSet.", this.MultiSmsInfoSet);

    }
}

