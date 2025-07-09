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

public class PullSmsSendStatus extends AbstractModel {

    /**
    * Actual time of SMS receipt by user in seconds in the format of UNIX timestamp.
    */
    @SerializedName("UserReceiveTime")
    @Expose
    private Long UserReceiveTime;

    /**
    * Country (or region) code.
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * User's mobile number in a common format such as 13711112222.
    */
    @SerializedName("SubscriberNumber")
    @Expose
    private String SubscriberNumber;

    /**
    * Mobile number in the E.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
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
    * User session content, which is the same as the `SessionContext` in the request and is empty by default. If you need to activate it, contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
     * Get Actual time of SMS receipt by user in seconds in the format of UNIX timestamp. 
     * @return UserReceiveTime Actual time of SMS receipt by user in seconds in the format of UNIX timestamp.
     */
    public Long getUserReceiveTime() {
        return this.UserReceiveTime;
    }

    /**
     * Set Actual time of SMS receipt by user in seconds in the format of UNIX timestamp.
     * @param UserReceiveTime Actual time of SMS receipt by user in seconds in the format of UNIX timestamp.
     */
    public void setUserReceiveTime(Long UserReceiveTime) {
        this.UserReceiveTime = UserReceiveTime;
    }

    /**
     * Get Country (or region) code. 
     * @return CountryCode Country (or region) code.
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set Country (or region) code.
     * @param CountryCode Country (or region) code.
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get User's mobile number in a common format such as 13711112222. 
     * @return SubscriberNumber User's mobile number in a common format such as 13711112222.
     */
    public String getSubscriberNumber() {
        return this.SubscriberNumber;
    }

    /**
     * Set User's mobile number in a common format such as 13711112222.
     * @param SubscriberNumber User's mobile number in a common format such as 13711112222.
     */
    public void setSubscriberNumber(String SubscriberNumber) {
        this.SubscriberNumber = SubscriberNumber;
    }

    /**
     * Get Mobile number in the E.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number). 
     * @return PhoneNumber Mobile number in the E.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set Mobile number in the E.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
     * @param PhoneNumber Mobile number in the E.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
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

    /**
     * Get User session content, which is the same as the `SessionContext` in the request and is empty by default. If you need to activate it, contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SessionContext User session content, which is the same as the `SessionContext` in the request and is empty by default. If you need to activate it, contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set User session content, which is the same as the `SessionContext` in the request and is empty by default. If you need to activate it, contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SessionContext User session content, which is the same as the `SessionContext` in the request and is empty by default. If you need to activate it, contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    public PullSmsSendStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PullSmsSendStatus(PullSmsSendStatus source) {
        if (source.UserReceiveTime != null) {
            this.UserReceiveTime = new Long(source.UserReceiveTime);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.SubscriberNumber != null) {
            this.SubscriberNumber = new String(source.SubscriberNumber);
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
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserReceiveTime", this.UserReceiveTime);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "SubscriberNumber", this.SubscriberNumber);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamSimple(map, prefix + "ReportStatus", this.ReportStatus);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

