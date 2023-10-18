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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsPackagesStatisticsRequest extends AbstractModel {

    /**
    * SMS `SdkAppid` actually generated after an application is added in the [SMS Console](https://console.cloud.tencent.com/sms/smslist), such as 1400006666.
    */
    @SerializedName("SmsSdkAppid")
    @Expose
    private String SmsSdkAppid;

    /**
    * Upper limit (number of packages to be pulled).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset.
Note: this parameter is currently fixed at 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get SMS `SdkAppid` actually generated after an application is added in the [SMS Console](https://console.cloud.tencent.com/sms/smslist), such as 1400006666. 
     * @return SmsSdkAppid SMS `SdkAppid` actually generated after an application is added in the [SMS Console](https://console.cloud.tencent.com/sms/smslist), such as 1400006666.
     */
    public String getSmsSdkAppid() {
        return this.SmsSdkAppid;
    }

    /**
     * Set SMS `SdkAppid` actually generated after an application is added in the [SMS Console](https://console.cloud.tencent.com/sms/smslist), such as 1400006666.
     * @param SmsSdkAppid SMS `SdkAppid` actually generated after an application is added in the [SMS Console](https://console.cloud.tencent.com/sms/smslist), such as 1400006666.
     */
    public void setSmsSdkAppid(String SmsSdkAppid) {
        this.SmsSdkAppid = SmsSdkAppid;
    }

    /**
     * Get Upper limit (number of packages to be pulled). 
     * @return Limit Upper limit (number of packages to be pulled).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Upper limit (number of packages to be pulled).
     * @param Limit Upper limit (number of packages to be pulled).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset.
Note: this parameter is currently fixed at 0. 
     * @return Offset Offset.
Note: this parameter is currently fixed at 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
Note: this parameter is currently fixed at 0.
     * @param Offset Offset.
Note: this parameter is currently fixed at 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public SmsPackagesStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmsPackagesStatisticsRequest(SmsPackagesStatisticsRequest source) {
        if (source.SmsSdkAppid != null) {
            this.SmsSdkAppid = new String(source.SmsSdkAppid);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SmsSdkAppid", this.SmsSdkAppid);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

