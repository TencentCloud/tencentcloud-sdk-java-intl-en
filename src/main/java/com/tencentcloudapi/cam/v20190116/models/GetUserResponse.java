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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetUserResponse extends AbstractModel{

    /**
    * Sub-user UIN
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Sub-user username
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Sub-user UID
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * Sub-user remarks
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Whether the sub-user can log in to the console. `0`: No; `1`: Yes.
    */
    @SerializedName("ConsoleLogin")
    @Expose
    private Long ConsoleLogin;

    /**
    * Mobile number
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * Country/Area code
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * Email
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Last login IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecentlyLoginIP")
    @Expose
    private String RecentlyLoginIP;

    /**
    * Last login time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecentlyLoginTime")
    @Expose
    private String RecentlyLoginTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Sub-user UIN 
     * @return Uin Sub-user UIN
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set Sub-user UIN
     * @param Uin Sub-user UIN
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Sub-user username 
     * @return Name Sub-user username
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Sub-user username
     * @param Name Sub-user username
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Sub-user UID 
     * @return Uid Sub-user UID
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set Sub-user UID
     * @param Uid Sub-user UID
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get Sub-user remarks
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Remark Sub-user remarks
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Sub-user remarks
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Remark Sub-user remarks
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Whether the sub-user can log in to the console. `0`: No; `1`: Yes. 
     * @return ConsoleLogin Whether the sub-user can log in to the console. `0`: No; `1`: Yes.
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * Set Whether the sub-user can log in to the console. `0`: No; `1`: Yes.
     * @param ConsoleLogin Whether the sub-user can log in to the console. `0`: No; `1`: Yes.
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
    }

    /**
     * Get Mobile number 
     * @return PhoneNum Mobile number
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set Mobile number
     * @param PhoneNum Mobile number
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get Country/Area code 
     * @return CountryCode Country/Area code
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set Country/Area code
     * @param CountryCode Country/Area code
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get Email 
     * @return Email Email
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Email
     * @param Email Email
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Last login IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecentlyLoginIP Last login IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRecentlyLoginIP() {
        return this.RecentlyLoginIP;
    }

    /**
     * Set Last login IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecentlyLoginIP Last login IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecentlyLoginIP(String RecentlyLoginIP) {
        this.RecentlyLoginIP = RecentlyLoginIP;
    }

    /**
     * Get Last login time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecentlyLoginTime Last login time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRecentlyLoginTime() {
        return this.RecentlyLoginTime;
    }

    /**
     * Set Last login time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecentlyLoginTime Last login time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecentlyLoginTime(String RecentlyLoginTime) {
        this.RecentlyLoginTime = RecentlyLoginTime;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetUserResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetUserResponse(GetUserResponse source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ConsoleLogin != null) {
            this.ConsoleLogin = new Long(source.ConsoleLogin);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.RecentlyLoginIP != null) {
            this.RecentlyLoginIP = new String(source.RecentlyLoginIP);
        }
        if (source.RecentlyLoginTime != null) {
            this.RecentlyLoginTime = new String(source.RecentlyLoginTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ConsoleLogin", this.ConsoleLogin);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "RecentlyLoginIP", this.RecentlyLoginIP);
        this.setParamSimple(map, prefix + "RecentlyLoginTime", this.RecentlyLoginTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

