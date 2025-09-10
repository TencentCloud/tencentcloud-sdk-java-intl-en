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

public class CreateUserSigRequest extends AbstractModel {

    /**
    * App ID (required). can be used to view https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * User ID, must be consistent with the Uid value in the ClientData field.
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * Valid period, in seconds, no more than 1 hr.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * Signature data of the user. required field. standard JSON format.
    */
    @SerializedName("ClientData")
    @Expose
    private String ClientData;

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
     * Get User ID, must be consistent with the Uid value in the ClientData field. 
     * @return Uid User ID, must be consistent with the Uid value in the ClientData field.
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set User ID, must be consistent with the Uid value in the ClientData field.
     * @param Uid User ID, must be consistent with the Uid value in the ClientData field.
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get Valid period, in seconds, no more than 1 hr. 
     * @return ExpiredTime Valid period, in seconds, no more than 1 hr.
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Valid period, in seconds, no more than 1 hr.
     * @param ExpiredTime Valid period, in seconds, no more than 1 hr.
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get Signature data of the user. required field. standard JSON format. 
     * @return ClientData Signature data of the user. required field. standard JSON format.
     */
    public String getClientData() {
        return this.ClientData;
    }

    /**
     * Set Signature data of the user. required field. standard JSON format.
     * @param ClientData Signature data of the user. required field. standard JSON format.
     */
    public void setClientData(String ClientData) {
        this.ClientData = ClientData;
    }

    public CreateUserSigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserSigRequest(CreateUserSigRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.ClientData != null) {
            this.ClientData = new String(source.ClientData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "ClientData", this.ClientData);

    }
}

