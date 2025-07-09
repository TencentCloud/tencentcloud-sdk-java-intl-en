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
    * Account status.
0: normal.
1: forcibly mandatory (this function is not supported yet).
2: mandatory arrears. 
    */
    @SerializedName("AccountStatus")
    @Expose
    private String AccountStatus;

    /**
    * Specifies the identity verification status.
-999: account information not found.
-1: file not uploaded.
0: pending review.
Under review.
Error in review: 2.
3: pass review.
    */
    @SerializedName("AuthStatus")
    @Expose
    private String AuthStatus;

    /**
    * Real-Name type.
-1: default value. no such information. 
0: personal type. 
1: enterprise type.
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * Specifies the registration time of the cid.
    */
    @SerializedName("CidRegisterTime")
    @Expose
    private String CidRegisterTime;

    /**
    * Specifies the registration time of the uin.
    */
    @SerializedName("UinRegisterTime")
    @Expose
    private String UinRegisterTime;

    /**
    * Time when real-name authentication passed.
    */
    @SerializedName("AuthPassTime")
    @Expose
    private String AuthPassTime;

    /**
    * Whether there is consumption.
0: no consumption; 1: consumption.
    */
    @SerializedName("HasExpense")
    @Expose
    private Long HasExpense;

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
     * Get Account status.
0: normal.
1: forcibly mandatory (this function is not supported yet).
2: mandatory arrears.  
     * @return AccountStatus Account status.
0: normal.
1: forcibly mandatory (this function is not supported yet).
2: mandatory arrears. 
     */
    public String getAccountStatus() {
        return this.AccountStatus;
    }

    /**
     * Set Account status.
0: normal.
1: forcibly mandatory (this function is not supported yet).
2: mandatory arrears. 
     * @param AccountStatus Account status.
0: normal.
1: forcibly mandatory (this function is not supported yet).
2: mandatory arrears. 
     */
    public void setAccountStatus(String AccountStatus) {
        this.AccountStatus = AccountStatus;
    }

    /**
     * Get Specifies the identity verification status.
-999: account information not found.
-1: file not uploaded.
0: pending review.
Under review.
Error in review: 2.
3: pass review. 
     * @return AuthStatus Specifies the identity verification status.
-999: account information not found.
-1: file not uploaded.
0: pending review.
Under review.
Error in review: 2.
3: pass review.
     */
    public String getAuthStatus() {
        return this.AuthStatus;
    }

    /**
     * Set Specifies the identity verification status.
-999: account information not found.
-1: file not uploaded.
0: pending review.
Under review.
Error in review: 2.
3: pass review.
     * @param AuthStatus Specifies the identity verification status.
-999: account information not found.
-1: file not uploaded.
0: pending review.
Under review.
Error in review: 2.
3: pass review.
     */
    public void setAuthStatus(String AuthStatus) {
        this.AuthStatus = AuthStatus;
    }

    /**
     * Get Real-Name type.
-1: default value. no such information. 
0: personal type. 
1: enterprise type. 
     * @return AuthType Real-Name type.
-1: default value. no such information. 
0: personal type. 
1: enterprise type.
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set Real-Name type.
-1: default value. no such information. 
0: personal type. 
1: enterprise type.
     * @param AuthType Real-Name type.
-1: default value. no such information. 
0: personal type. 
1: enterprise type.
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get Specifies the registration time of the cid. 
     * @return CidRegisterTime Specifies the registration time of the cid.
     */
    public String getCidRegisterTime() {
        return this.CidRegisterTime;
    }

    /**
     * Set Specifies the registration time of the cid.
     * @param CidRegisterTime Specifies the registration time of the cid.
     */
    public void setCidRegisterTime(String CidRegisterTime) {
        this.CidRegisterTime = CidRegisterTime;
    }

    /**
     * Get Specifies the registration time of the uin. 
     * @return UinRegisterTime Specifies the registration time of the uin.
     */
    public String getUinRegisterTime() {
        return this.UinRegisterTime;
    }

    /**
     * Set Specifies the registration time of the uin.
     * @param UinRegisterTime Specifies the registration time of the uin.
     */
    public void setUinRegisterTime(String UinRegisterTime) {
        this.UinRegisterTime = UinRegisterTime;
    }

    /**
     * Get Time when real-name authentication passed. 
     * @return AuthPassTime Time when real-name authentication passed.
     */
    public String getAuthPassTime() {
        return this.AuthPassTime;
    }

    /**
     * Set Time when real-name authentication passed.
     * @param AuthPassTime Time when real-name authentication passed.
     */
    public void setAuthPassTime(String AuthPassTime) {
        this.AuthPassTime = AuthPassTime;
    }

    /**
     * Get Whether there is consumption.
0: no consumption; 1: consumption. 
     * @return HasExpense Whether there is consumption.
0: no consumption; 1: consumption.
     */
    public Long getHasExpense() {
        return this.HasExpense;
    }

    /**
     * Set Whether there is consumption.
0: no consumption; 1: consumption.
     * @param HasExpense Whether there is consumption.
0: no consumption; 1: consumption.
     */
    public void setHasExpense(Long HasExpense) {
        this.HasExpense = HasExpense;
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
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.CidRegisterTime != null) {
            this.CidRegisterTime = new String(source.CidRegisterTime);
        }
        if (source.UinRegisterTime != null) {
            this.UinRegisterTime = new String(source.UinRegisterTime);
        }
        if (source.AuthPassTime != null) {
            this.AuthPassTime = new String(source.AuthPassTime);
        }
        if (source.HasExpense != null) {
            this.HasExpense = new Long(source.HasExpense);
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
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "CidRegisterTime", this.CidRegisterTime);
        this.setParamSimple(map, prefix + "UinRegisterTime", this.UinRegisterTime);
        this.setParamSimple(map, prefix + "AuthPassTime", this.AuthPassTime);
        this.setParamSimple(map, prefix + "HasExpense", this.HasExpense);

    }
}

