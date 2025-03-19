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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationMemberEmailBindResponse extends AbstractModel {

    /**
    * Bound ID.
    */
    @SerializedName("BindId")
    @Expose
    private Long BindId;

    /**
    * Application time.
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * Email address.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Verification mobile number.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * Binding status: unbound indicates not bound; valid indicates to be activated; success indicates bound successfully; failed indicates binding failed.
    */
    @SerializedName("BindStatus")
    @Expose
    private String BindStatus;

    /**
    * Binding time.
    */
    @SerializedName("BindTime")
    @Expose
    private String BindTime;

    /**
    * Failure description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Verification mobile number binding status. 0 indicates unbound and 1 indicates bound.
    */
    @SerializedName("PhoneBind")
    @Expose
    private Long PhoneBind;

    /**
    * International area code.
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Bound ID. 
     * @return BindId Bound ID.
     */
    public Long getBindId() {
        return this.BindId;
    }

    /**
     * Set Bound ID.
     * @param BindId Bound ID.
     */
    public void setBindId(Long BindId) {
        this.BindId = BindId;
    }

    /**
     * Get Application time. 
     * @return ApplyTime Application time.
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set Application time.
     * @param ApplyTime Application time.
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get Email address. 
     * @return Email Email address.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Email address.
     * @param Email Email address.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Verification mobile number. 
     * @return Phone Verification mobile number.
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set Verification mobile number.
     * @param Phone Verification mobile number.
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get Binding status: unbound indicates not bound; valid indicates to be activated; success indicates bound successfully; failed indicates binding failed. 
     * @return BindStatus Binding status: unbound indicates not bound; valid indicates to be activated; success indicates bound successfully; failed indicates binding failed.
     */
    public String getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set Binding status: unbound indicates not bound; valid indicates to be activated; success indicates bound successfully; failed indicates binding failed.
     * @param BindStatus Binding status: unbound indicates not bound; valid indicates to be activated; success indicates bound successfully; failed indicates binding failed.
     */
    public void setBindStatus(String BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get Binding time. 
     * @return BindTime Binding time.
     */
    public String getBindTime() {
        return this.BindTime;
    }

    /**
     * Set Binding time.
     * @param BindTime Binding time.
     */
    public void setBindTime(String BindTime) {
        this.BindTime = BindTime;
    }

    /**
     * Get Failure description. 
     * @return Description Failure description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Failure description.
     * @param Description Failure description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Verification mobile number binding status. 0 indicates unbound and 1 indicates bound. 
     * @return PhoneBind Verification mobile number binding status. 0 indicates unbound and 1 indicates bound.
     */
    public Long getPhoneBind() {
        return this.PhoneBind;
    }

    /**
     * Set Verification mobile number binding status. 0 indicates unbound and 1 indicates bound.
     * @param PhoneBind Verification mobile number binding status. 0 indicates unbound and 1 indicates bound.
     */
    public void setPhoneBind(Long PhoneBind) {
        this.PhoneBind = PhoneBind;
    }

    /**
     * Get International area code. 
     * @return CountryCode International area code.
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set International area code.
     * @param CountryCode International area code.
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeOrganizationMemberEmailBindResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationMemberEmailBindResponse(DescribeOrganizationMemberEmailBindResponse source) {
        if (source.BindId != null) {
            this.BindId = new Long(source.BindId);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new String(source.ApplyTime);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.BindStatus != null) {
            this.BindStatus = new String(source.BindStatus);
        }
        if (source.BindTime != null) {
            this.BindTime = new String(source.BindTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PhoneBind != null) {
            this.PhoneBind = new Long(source.PhoneBind);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BindId", this.BindId);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamSimple(map, prefix + "BindTime", this.BindTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PhoneBind", this.PhoneBind);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

