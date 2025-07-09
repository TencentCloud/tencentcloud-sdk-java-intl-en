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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddOrganizationMemberEmailRequest extends AbstractModel {

    /**
    * Member uin.
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * Email address.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * International area code.
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * Mobile number.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
     * Get Member uin. 
     * @return MemberUin Member uin.
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set Member uin.
     * @param MemberUin Member uin.
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
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
     * Get Mobile number. 
     * @return Phone Mobile number.
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set Mobile number.
     * @param Phone Mobile number.
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public AddOrganizationMemberEmailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOrganizationMemberEmailRequest(AddOrganizationMemberEmailRequest source) {
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "Phone", this.Phone);

    }
}

