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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendSmsCodeRequest extends AbstractModel {

    /**
    * Captcha target, currently supported: rebind super administrator account, BindSuperAdmin; trial version business upgrade, ChannelUpdateVerify.
    */
    @SerializedName("Purpose")
    @Expose
    private String Purpose;

    /**
    * Specifies the mobile number as the super admin account.
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * Official cloud disk instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the country code of the mobile number that serves as the super administrator account. defaults to +86.
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
     * Get Captcha target, currently supported: rebind super administrator account, BindSuperAdmin; trial version business upgrade, ChannelUpdateVerify. 
     * @return Purpose Captcha target, currently supported: rebind super administrator account, BindSuperAdmin; trial version business upgrade, ChannelUpdateVerify.
     */
    public String getPurpose() {
        return this.Purpose;
    }

    /**
     * Set Captcha target, currently supported: rebind super administrator account, BindSuperAdmin; trial version business upgrade, ChannelUpdateVerify.
     * @param Purpose Captcha target, currently supported: rebind super administrator account, BindSuperAdmin; trial version business upgrade, ChannelUpdateVerify.
     */
    public void setPurpose(String Purpose) {
        this.Purpose = Purpose;
    }

    /**
     * Get Specifies the mobile number as the super admin account. 
     * @return PhoneNumber Specifies the mobile number as the super admin account.
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set Specifies the mobile number as the super admin account.
     * @param PhoneNumber Specifies the mobile number as the super admin account.
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get Official cloud disk instance ID. 
     * @return InstanceId Official cloud disk instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Official cloud disk instance ID.
     * @param InstanceId Official cloud disk instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the country code of the mobile number that serves as the super administrator account. defaults to +86. 
     * @return CountryCode Specifies the country code of the mobile number that serves as the super administrator account. defaults to +86.
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set Specifies the country code of the mobile number that serves as the super administrator account. defaults to +86.
     * @param CountryCode Specifies the country code of the mobile number that serves as the super administrator account. defaults to +86.
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    public SendSmsCodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendSmsCodeRequest(SendSmsCodeRequest source) {
        if (source.Purpose != null) {
            this.Purpose = new String(source.Purpose);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Purpose", this.Purpose);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);

    }
}

