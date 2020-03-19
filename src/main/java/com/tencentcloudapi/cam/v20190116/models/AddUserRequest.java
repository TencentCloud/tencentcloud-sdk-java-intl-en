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

public class AddUserRequest extends AbstractModel{

    /**
    * Sub-user username
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Sub-user remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Whether or not the sub-user is allowed to log in to the console. 0: No; 1: Yes.
    */
    @SerializedName("ConsoleLogin")
    @Expose
    private Long ConsoleLogin;

    /**
    * Whether or not to generate keys for sub-users. 0: No; 1: Yes.
    */
    @SerializedName("UseApi")
    @Expose
    private Long UseApi;

    /**
    * Sub-user's console login password. If no password rules have been set, the password must have a minimum of 8 characters containing uppercase letters, lowercase letters, digits, and special characters by default. This parameter will be valid only when the sub-user is allowed to log in to the console. If it is not specified and console login is allowed, the system will automatically generate a random 32-character password that contains uppercase letters, lowercase letters, digits, and special characters.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * If the sub-user needs to reset their password when they next log in to the console. 0: No; 1: Yes.
    */
    @SerializedName("NeedResetPassword")
    @Expose
    private Long NeedResetPassword;

    /**
    * Mobile number
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * Country/Area Code
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
     * Get Sub-user remarks 
     * @return Remark Sub-user remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Sub-user remarks
     * @param Remark Sub-user remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Whether or not the sub-user is allowed to log in to the console. 0: No; 1: Yes. 
     * @return ConsoleLogin Whether or not the sub-user is allowed to log in to the console. 0: No; 1: Yes.
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * Set Whether or not the sub-user is allowed to log in to the console. 0: No; 1: Yes.
     * @param ConsoleLogin Whether or not the sub-user is allowed to log in to the console. 0: No; 1: Yes.
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
    }

    /**
     * Get Whether or not to generate keys for sub-users. 0: No; 1: Yes. 
     * @return UseApi Whether or not to generate keys for sub-users. 0: No; 1: Yes.
     */
    public Long getUseApi() {
        return this.UseApi;
    }

    /**
     * Set Whether or not to generate keys for sub-users. 0: No; 1: Yes.
     * @param UseApi Whether or not to generate keys for sub-users. 0: No; 1: Yes.
     */
    public void setUseApi(Long UseApi) {
        this.UseApi = UseApi;
    }

    /**
     * Get Sub-user's console login password. If no password rules have been set, the password must have a minimum of 8 characters containing uppercase letters, lowercase letters, digits, and special characters by default. This parameter will be valid only when the sub-user is allowed to log in to the console. If it is not specified and console login is allowed, the system will automatically generate a random 32-character password that contains uppercase letters, lowercase letters, digits, and special characters. 
     * @return Password Sub-user's console login password. If no password rules have been set, the password must have a minimum of 8 characters containing uppercase letters, lowercase letters, digits, and special characters by default. This parameter will be valid only when the sub-user is allowed to log in to the console. If it is not specified and console login is allowed, the system will automatically generate a random 32-character password that contains uppercase letters, lowercase letters, digits, and special characters.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Sub-user's console login password. If no password rules have been set, the password must have a minimum of 8 characters containing uppercase letters, lowercase letters, digits, and special characters by default. This parameter will be valid only when the sub-user is allowed to log in to the console. If it is not specified and console login is allowed, the system will automatically generate a random 32-character password that contains uppercase letters, lowercase letters, digits, and special characters.
     * @param Password Sub-user's console login password. If no password rules have been set, the password must have a minimum of 8 characters containing uppercase letters, lowercase letters, digits, and special characters by default. This parameter will be valid only when the sub-user is allowed to log in to the console. If it is not specified and console login is allowed, the system will automatically generate a random 32-character password that contains uppercase letters, lowercase letters, digits, and special characters.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get If the sub-user needs to reset their password when they next log in to the console. 0: No; 1: Yes. 
     * @return NeedResetPassword If the sub-user needs to reset their password when they next log in to the console. 0: No; 1: Yes.
     */
    public Long getNeedResetPassword() {
        return this.NeedResetPassword;
    }

    /**
     * Set If the sub-user needs to reset their password when they next log in to the console. 0: No; 1: Yes.
     * @param NeedResetPassword If the sub-user needs to reset their password when they next log in to the console. 0: No; 1: Yes.
     */
    public void setNeedResetPassword(Long NeedResetPassword) {
        this.NeedResetPassword = NeedResetPassword;
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
     * Get Country/Area Code 
     * @return CountryCode Country/Area Code
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set Country/Area Code
     * @param CountryCode Country/Area Code
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ConsoleLogin", this.ConsoleLogin);
        this.setParamSimple(map, prefix + "UseApi", this.UseApi);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "NeedResetPassword", this.NeedResetPassword);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

