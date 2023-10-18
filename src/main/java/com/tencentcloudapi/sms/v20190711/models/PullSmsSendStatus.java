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

public class PullSmsSendStatus extends AbstractModel {

    /**
    * Actual time of SMS receipt by user.
    */
    @SerializedName("UserReceiveTime")
    @Expose
    private String UserReceiveTime;

    /**
    * Actual time of SMS receipt by user in seconds in the format of UNIX timestamp.
    */
    @SerializedName("UserReceiveUnixTime")
    @Expose
    private Long UserReceiveUnixTime;

    /**
    * Country (or region) code.
    */
    @SerializedName("NationCode")
    @Expose
    private String NationCode;

    /**
    * Mobile number in the e.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
    */
    @SerializedName("PurePhoneNumber")
    @Expose
    private String PurePhoneNumber;

    /**
    * Mobile number in a common format such as 13711112222.
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * ID of the current delivery.
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * Whether the SMS message is actually received. Valid values: SUCCESS (success), FAIL (failure).
    */
    @SerializedName("ReportStatus")
    @Expose
    private String ReportStatus;

    /**
    * Description of SMS receipt by user.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Actual time of SMS receipt by user. 
     * @return UserReceiveTime Actual time of SMS receipt by user.
     */
    public String getUserReceiveTime() {
        return this.UserReceiveTime;
    }

    /**
     * Set Actual time of SMS receipt by user.
     * @param UserReceiveTime Actual time of SMS receipt by user.
     */
    public void setUserReceiveTime(String UserReceiveTime) {
        this.UserReceiveTime = UserReceiveTime;
    }

    /**
     * Get Actual time of SMS receipt by user in seconds in the format of UNIX timestamp. 
     * @return UserReceiveUnixTime Actual time of SMS receipt by user in seconds in the format of UNIX timestamp.
     */
    public Long getUserReceiveUnixTime() {
        return this.UserReceiveUnixTime;
    }

    /**
     * Set Actual time of SMS receipt by user in seconds in the format of UNIX timestamp.
     * @param UserReceiveUnixTime Actual time of SMS receipt by user in seconds in the format of UNIX timestamp.
     */
    public void setUserReceiveUnixTime(Long UserReceiveUnixTime) {
        this.UserReceiveUnixTime = UserReceiveUnixTime;
    }

    /**
     * Get Country (or region) code. 
     * @return NationCode Country (or region) code.
     */
    public String getNationCode() {
        return this.NationCode;
    }

    /**
     * Set Country (or region) code.
     * @param NationCode Country (or region) code.
     */
    public void setNationCode(String NationCode) {
        this.NationCode = NationCode;
    }

    /**
     * Get Mobile number in the e.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number). 
     * @return PurePhoneNumber Mobile number in the e.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
     */
    public String getPurePhoneNumber() {
        return this.PurePhoneNumber;
    }

    /**
     * Set Mobile number in the e.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
     * @param PurePhoneNumber Mobile number in the e.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
     */
    public void setPurePhoneNumber(String PurePhoneNumber) {
        this.PurePhoneNumber = PurePhoneNumber;
    }

    /**
     * Get Mobile number in a common format such as 13711112222. 
     * @return PhoneNumber Mobile number in a common format such as 13711112222.
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set Mobile number in a common format such as 13711112222.
     * @param PhoneNumber Mobile number in a common format such as 13711112222.
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get ID of the current delivery. 
     * @return SerialNo ID of the current delivery.
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set ID of the current delivery.
     * @param SerialNo ID of the current delivery.
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get Whether the SMS message is actually received. Valid values: SUCCESS (success), FAIL (failure). 
     * @return ReportStatus Whether the SMS message is actually received. Valid values: SUCCESS (success), FAIL (failure).
     */
    public String getReportStatus() {
        return this.ReportStatus;
    }

    /**
     * Set Whether the SMS message is actually received. Valid values: SUCCESS (success), FAIL (failure).
     * @param ReportStatus Whether the SMS message is actually received. Valid values: SUCCESS (success), FAIL (failure).
     */
    public void setReportStatus(String ReportStatus) {
        this.ReportStatus = ReportStatus;
    }

    /**
     * Get Description of SMS receipt by user. 
     * @return Description Description of SMS receipt by user.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of SMS receipt by user.
     * @param Description Description of SMS receipt by user.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public PullSmsSendStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PullSmsSendStatus(PullSmsSendStatus source) {
        if (source.UserReceiveTime != null) {
            this.UserReceiveTime = new String(source.UserReceiveTime);
        }
        if (source.UserReceiveUnixTime != null) {
            this.UserReceiveUnixTime = new Long(source.UserReceiveUnixTime);
        }
        if (source.NationCode != null) {
            this.NationCode = new String(source.NationCode);
        }
        if (source.PurePhoneNumber != null) {
            this.PurePhoneNumber = new String(source.PurePhoneNumber);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.SerialNo != null) {
            this.SerialNo = new String(source.SerialNo);
        }
        if (source.ReportStatus != null) {
            this.ReportStatus = new String(source.ReportStatus);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserReceiveTime", this.UserReceiveTime);
        this.setParamSimple(map, prefix + "UserReceiveUnixTime", this.UserReceiveUnixTime);
        this.setParamSimple(map, prefix + "NationCode", this.NationCode);
        this.setParamSimple(map, prefix + "PurePhoneNumber", this.PurePhoneNumber);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamSimple(map, prefix + "ReportStatus", this.ReportStatus);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

