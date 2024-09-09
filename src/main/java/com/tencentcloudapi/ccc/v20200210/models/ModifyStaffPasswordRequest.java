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

public class ModifyStaffPasswordRequest extends AbstractModel {

    /**
    * Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Agent email.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * The set password 
    */
    @SerializedName("Password")
    @Expose
    private String Password;

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
     * Get Agent email. 
     * @return Email Agent email.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Agent email.
     * @param Email Agent email.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get The set password  
     * @return Password The set password 
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set The set password 
     * @param Password The set password 
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public ModifyStaffPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStaffPasswordRequest(ModifyStaffPasswordRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

