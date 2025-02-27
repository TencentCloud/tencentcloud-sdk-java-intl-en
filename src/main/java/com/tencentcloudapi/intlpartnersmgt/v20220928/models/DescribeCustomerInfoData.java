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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomerInfoData extends AbstractModel {

    /**
    * Sub-Account uin.
    */
    @SerializedName("CustomerUin")
    @Expose
    private String CustomerUin;

    /**
    * Contact email.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Contact phone number.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * Remarks.
    */
    @SerializedName("Mark")
    @Expose
    private String Mark;

    /**
    * Display name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Binding time.
    */
    @SerializedName("BindTime")
    @Expose
    private String BindTime;

    /**
    * Account status
.
0: normal.
1: forcibly mandatory (this function is not supported yet).
2: mandatory arrears. 
    */
    @SerializedName("AccountStatus")
    @Expose
    private String AccountStatus;

    /**
    * Identity verification status.
-1: files not uploaded.
0: not submitted for review.
1: under review.
2: review error.
3: approved.
    */
    @SerializedName("AuthStatus")
    @Expose
    private String AuthStatus;

    /**
     * Get Sub-Account uin. 
     * @return CustomerUin Sub-Account uin.
     */
    public String getCustomerUin() {
        return this.CustomerUin;
    }

    /**
     * Set Sub-Account uin.
     * @param CustomerUin Sub-Account uin.
     */
    public void setCustomerUin(String CustomerUin) {
        this.CustomerUin = CustomerUin;
    }

    /**
     * Get Contact email. 
     * @return Email Contact email.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Contact email.
     * @param Email Contact email.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Contact phone number. 
     * @return Phone Contact phone number.
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set Contact phone number.
     * @param Phone Contact phone number.
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get Remarks. 
     * @return Mark Remarks.
     */
    public String getMark() {
        return this.Mark;
    }

    /**
     * Set Remarks.
     * @param Mark Remarks.
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    /**
     * Get Display name. 
     * @return Name Display name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Display name.
     * @param Name Display name.
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get Account status
.
0: normal.
1: forcibly mandatory (this function is not supported yet).
2: mandatory arrears.  
     * @return AccountStatus Account status
.
0: normal.
1: forcibly mandatory (this function is not supported yet).
2: mandatory arrears. 
     */
    public String getAccountStatus() {
        return this.AccountStatus;
    }

    /**
     * Set Account status
.
0: normal.
1: forcibly mandatory (this function is not supported yet).
2: mandatory arrears. 
     * @param AccountStatus Account status
.
0: normal.
1: forcibly mandatory (this function is not supported yet).
2: mandatory arrears. 
     */
    public void setAccountStatus(String AccountStatus) {
        this.AccountStatus = AccountStatus;
    }

    /**
     * Get Identity verification status.
-1: files not uploaded.
0: not submitted for review.
1: under review.
2: review error.
3: approved. 
     * @return AuthStatus Identity verification status.
-1: files not uploaded.
0: not submitted for review.
1: under review.
2: review error.
3: approved.
     */
    public String getAuthStatus() {
        return this.AuthStatus;
    }

    /**
     * Set Identity verification status.
-1: files not uploaded.
0: not submitted for review.
1: under review.
2: review error.
3: approved.
     * @param AuthStatus Identity verification status.
-1: files not uploaded.
0: not submitted for review.
1: under review.
2: review error.
3: approved.
     */
    public void setAuthStatus(String AuthStatus) {
        this.AuthStatus = AuthStatus;
    }

    public DescribeCustomerInfoData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomerInfoData(DescribeCustomerInfoData source) {
        if (source.CustomerUin != null) {
            this.CustomerUin = new String(source.CustomerUin);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Mark != null) {
            this.Mark = new String(source.Mark);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BindTime != null) {
            this.BindTime = new String(source.BindTime);
        }
        if (source.AccountStatus != null) {
            this.AccountStatus = new String(source.AccountStatus);
        }
        if (source.AuthStatus != null) {
            this.AuthStatus = new String(source.AuthStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerUin", this.CustomerUin);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Mark", this.Mark);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BindTime", this.BindTime);
        this.setParamSimple(map, prefix + "AccountStatus", this.AccountStatus);
        this.setParamSimple(map, prefix + "AuthStatus", this.AuthStatus);

    }
}

