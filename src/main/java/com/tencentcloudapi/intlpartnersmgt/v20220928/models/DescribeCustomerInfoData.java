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
    * Customer UIN Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomerUin")
    @Expose
    private String CustomerUin;

    /**
    * Email Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Mobile number Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * Remarks Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mark")
    @Expose
    private String Mark;

    /**
    * Displayed name Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Binding time Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindTime")
    @Expose
    private String BindTime;

    /**
    * Account status
0: Normal
1: Forcibly mandatory (this function is not supported yet)
2. Mandatory arrears
Note: The return value may be null, indicating that no valid data can be obtained.
    */
    @SerializedName("AccountStatus")
    @Expose
    private String AccountStatus;

    /**
    * Identity verification status
-1: Files not uploaded
0: Not submitted for review
1: Under review
2: Review error
3: Approved
Note: The return value may be null, indicating that no valid data can be obtained.
    */
    @SerializedName("AuthStatus")
    @Expose
    private String AuthStatus;

    /**
     * Get Customer UIN Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CustomerUin Customer UIN Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCustomerUin() {
        return this.CustomerUin;
    }

    /**
     * Set Customer UIN Note: This field may return null, indicating that no valid values can be obtained.
     * @param CustomerUin Customer UIN Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomerUin(String CustomerUin) {
        this.CustomerUin = CustomerUin;
    }

    /**
     * Get Email Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Email Email Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Email Note: This field may return null, indicating that no valid values can be obtained.
     * @param Email Email Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Mobile number Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Phone Mobile number Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set Mobile number Note: This field may return null, indicating that no valid values can be obtained.
     * @param Phone Mobile number Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get Remarks Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Mark Remarks Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMark() {
        return this.Mark;
    }

    /**
     * Set Remarks Note: This field may return null, indicating that no valid values can be obtained.
     * @param Mark Remarks Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    /**
     * Get Displayed name Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Displayed name Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Displayed name Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Displayed name Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Binding time Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BindTime Binding time Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBindTime() {
        return this.BindTime;
    }

    /**
     * Set Binding time Note: This field may return null, indicating that no valid values can be obtained.
     * @param BindTime Binding time Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBindTime(String BindTime) {
        this.BindTime = BindTime;
    }

    /**
     * Get Account status
0: Normal
1: Forcibly mandatory (this function is not supported yet)
2. Mandatory arrears
Note: The return value may be null, indicating that no valid data can be obtained. 
     * @return AccountStatus Account status
0: Normal
1: Forcibly mandatory (this function is not supported yet)
2. Mandatory arrears
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public String getAccountStatus() {
        return this.AccountStatus;
    }

    /**
     * Set Account status
0: Normal
1: Forcibly mandatory (this function is not supported yet)
2. Mandatory arrears
Note: The return value may be null, indicating that no valid data can be obtained.
     * @param AccountStatus Account status
0: Normal
1: Forcibly mandatory (this function is not supported yet)
2. Mandatory arrears
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public void setAccountStatus(String AccountStatus) {
        this.AccountStatus = AccountStatus;
    }

    /**
     * Get Identity verification status
-1: Files not uploaded
0: Not submitted for review
1: Under review
2: Review error
3: Approved
Note: The return value may be null, indicating that no valid data can be obtained. 
     * @return AuthStatus Identity verification status
-1: Files not uploaded
0: Not submitted for review
1: Under review
2: Review error
3: Approved
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public String getAuthStatus() {
        return this.AuthStatus;
    }

    /**
     * Set Identity verification status
-1: Files not uploaded
0: Not submitted for review
1: Under review
2: Review error
3: Approved
Note: The return value may be null, indicating that no valid data can be obtained.
     * @param AuthStatus Identity verification status
-1: Files not uploaded
0: Not submitted for review
1: Under review
2: Review error
3: Approved
Note: The return value may be null, indicating that no valid data can be obtained.
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

