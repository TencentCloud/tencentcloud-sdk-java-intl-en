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

public class CreateSDKLoginTokenRequest extends AbstractModel {

    /**
    * Application id (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Agent account.
    */
    @SerializedName("SeatUserId")
    @Expose
    private String SeatUserId;

    /**
    * Whether the generated token is for one-time verification?.
    */
    @SerializedName("OnlyOnce")
    @Expose
    private Boolean OnlyOnce;

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
     * Get Agent account. 
     * @return SeatUserId Agent account.
     */
    public String getSeatUserId() {
        return this.SeatUserId;
    }

    /**
     * Set Agent account.
     * @param SeatUserId Agent account.
     */
    public void setSeatUserId(String SeatUserId) {
        this.SeatUserId = SeatUserId;
    }

    /**
     * Get Whether the generated token is for one-time verification?. 
     * @return OnlyOnce Whether the generated token is for one-time verification?.
     */
    public Boolean getOnlyOnce() {
        return this.OnlyOnce;
    }

    /**
     * Set Whether the generated token is for one-time verification?.
     * @param OnlyOnce Whether the generated token is for one-time verification?.
     */
    public void setOnlyOnce(Boolean OnlyOnce) {
        this.OnlyOnce = OnlyOnce;
    }

    public CreateSDKLoginTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSDKLoginTokenRequest(CreateSDKLoginTokenRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SeatUserId != null) {
            this.SeatUserId = new String(source.SeatUserId);
        }
        if (source.OnlyOnce != null) {
            this.OnlyOnce = new Boolean(source.OnlyOnce);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SeatUserId", this.SeatUserId);
        this.setParamSimple(map, prefix + "OnlyOnce", this.OnlyOnce);

    }
}

