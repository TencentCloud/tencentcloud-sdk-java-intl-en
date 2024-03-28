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

public class CreateStaffRequest extends AbstractModel {

    /**
    * Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Customer information, no more than 10.
    */
    @SerializedName("Staffs")
    @Expose
    private SeatUserInfo [] Staffs;

    /**
    * Whether to send a password mail or not (the default is true)
    */
    @SerializedName("SendPassword")
    @Expose
    private Boolean SendPassword;

    /**
     * Get Application ID (required) can be found at https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     * @param SdkAppId Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Customer information, no more than 10. 
     * @return Staffs Customer information, no more than 10.
     */
    public SeatUserInfo [] getStaffs() {
        return this.Staffs;
    }

    /**
     * Set Customer information, no more than 10.
     * @param Staffs Customer information, no more than 10.
     */
    public void setStaffs(SeatUserInfo [] Staffs) {
        this.Staffs = Staffs;
    }

    /**
     * Get Whether to send a password mail or not (the default is true) 
     * @return SendPassword Whether to send a password mail or not (the default is true)
     */
    public Boolean getSendPassword() {
        return this.SendPassword;
    }

    /**
     * Set Whether to send a password mail or not (the default is true)
     * @param SendPassword Whether to send a password mail or not (the default is true)
     */
    public void setSendPassword(Boolean SendPassword) {
        this.SendPassword = SendPassword;
    }

    public CreateStaffRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStaffRequest(CreateStaffRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Staffs != null) {
            this.Staffs = new SeatUserInfo[source.Staffs.length];
            for (int i = 0; i < source.Staffs.length; i++) {
                this.Staffs[i] = new SeatUserInfo(source.Staffs[i]);
            }
        }
        if (source.SendPassword != null) {
            this.SendPassword = new Boolean(source.SendPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArrayObj(map, prefix + "Staffs.", this.Staffs);
        this.setParamSimple(map, prefix + "SendPassword", this.SendPassword);

    }
}

