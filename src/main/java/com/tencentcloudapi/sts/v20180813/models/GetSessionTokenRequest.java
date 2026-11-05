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
package com.tencentcloudapi.sts.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetSessionTokenRequest extends AbstractModel {

    /**
    * MFA serial number, the identifier of the MFA device associated with the CAM user making the call. Format: qcs::CAM:uin/${ownerUin}::MFA/${mfaType}. mfaType supports softToken.
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * mfa identity verification code.
    */
    @SerializedName("TokenCode")
    @Expose
    private String TokenCode;

    /**
    * Validity period of the specified temporary certificate. Unit: second. Default value: 1800 seconds. The root account can set a validity period of up to 7200 seconds, and a sub-account can set a validity period of up to 129600 seconds.
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Long DurationSeconds;

    /**
     * Get MFA serial number, the identifier of the MFA device associated with the CAM user making the call. Format: qcs::CAM:uin/${ownerUin}::MFA/${mfaType}. mfaType supports softToken. 
     * @return SerialNumber MFA serial number, the identifier of the MFA device associated with the CAM user making the call. Format: qcs::CAM:uin/${ownerUin}::MFA/${mfaType}. mfaType supports softToken.
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set MFA serial number, the identifier of the MFA device associated with the CAM user making the call. Format: qcs::CAM:uin/${ownerUin}::MFA/${mfaType}. mfaType supports softToken.
     * @param SerialNumber MFA serial number, the identifier of the MFA device associated with the CAM user making the call. Format: qcs::CAM:uin/${ownerUin}::MFA/${mfaType}. mfaType supports softToken.
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get mfa identity verification code. 
     * @return TokenCode mfa identity verification code.
     */
    public String getTokenCode() {
        return this.TokenCode;
    }

    /**
     * Set mfa identity verification code.
     * @param TokenCode mfa identity verification code.
     */
    public void setTokenCode(String TokenCode) {
        this.TokenCode = TokenCode;
    }

    /**
     * Get Validity period of the specified temporary certificate. Unit: second. Default value: 1800 seconds. The root account can set a validity period of up to 7200 seconds, and a sub-account can set a validity period of up to 129600 seconds. 
     * @return DurationSeconds Validity period of the specified temporary certificate. Unit: second. Default value: 1800 seconds. The root account can set a validity period of up to 7200 seconds, and a sub-account can set a validity period of up to 129600 seconds.
     */
    public Long getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * Set Validity period of the specified temporary certificate. Unit: second. Default value: 1800 seconds. The root account can set a validity period of up to 7200 seconds, and a sub-account can set a validity period of up to 129600 seconds.
     * @param DurationSeconds Validity period of the specified temporary certificate. Unit: second. Default value: 1800 seconds. The root account can set a validity period of up to 7200 seconds, and a sub-account can set a validity period of up to 129600 seconds.
     */
    public void setDurationSeconds(Long DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    public GetSessionTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSessionTokenRequest(GetSessionTokenRequest source) {
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.TokenCode != null) {
            this.TokenCode = new String(source.TokenCode);
        }
        if (source.DurationSeconds != null) {
            this.DurationSeconds = new Long(source.DurationSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "TokenCode", this.TokenCode);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);

    }
}

