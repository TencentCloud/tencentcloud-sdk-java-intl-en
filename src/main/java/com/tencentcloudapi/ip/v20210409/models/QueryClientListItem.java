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
package com.tencentcloudapi.ip.v20210409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryClientListItem extends AbstractModel{

    /**
    * Name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Type
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Phone
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * Email
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Overdue payment flag
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Arrears")
    @Expose
    private String Arrears;

    /**
    * Binding time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssociationTime")
    @Expose
    private String AssociationTime;

    /**
    * Expiration time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecentExpiry")
    @Expose
    private String RecentExpiry;

    /**
    * Customer UIN
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientUin")
    @Expose
    private Long ClientUin;

    /**
    * Credit granted to customer
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreditAmount")
    @Expose
    private Float CreditAmount;

    /**
    * Customer's remaining credit
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RestCreditAmount")
    @Expose
    private Float RestCreditAmount;

    /**
     * Get Name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Name Name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Name Name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Type
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Type Type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Type Type
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Phone
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Mobile Phone
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set Phone
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Mobile Phone
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get Email
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Email Email
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Email
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Email Email
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Overdue payment flag
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Arrears Overdue payment flag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getArrears() {
        return this.Arrears;
    }

    /**
     * Set Overdue payment flag
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Arrears Overdue payment flag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setArrears(String Arrears) {
        this.Arrears = Arrears;
    }

    /**
     * Get Binding time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AssociationTime Binding time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAssociationTime() {
        return this.AssociationTime;
    }

    /**
     * Set Binding time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AssociationTime Binding time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAssociationTime(String AssociationTime) {
        this.AssociationTime = AssociationTime;
    }

    /**
     * Get Expiration time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RecentExpiry Expiration time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRecentExpiry() {
        return this.RecentExpiry;
    }

    /**
     * Set Expiration time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RecentExpiry Expiration time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRecentExpiry(String RecentExpiry) {
        this.RecentExpiry = RecentExpiry;
    }

    /**
     * Get Customer UIN
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClientUin Customer UIN
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set Customer UIN
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClientUin Customer UIN
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClientUin(Long ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get Credit granted to customer
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreditAmount Credit granted to customer
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getCreditAmount() {
        return this.CreditAmount;
    }

    /**
     * Set Credit granted to customer
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreditAmount Credit granted to customer
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreditAmount(Float CreditAmount) {
        this.CreditAmount = CreditAmount;
    }

    /**
     * Get Customer's remaining credit
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RestCreditAmount Customer's remaining credit
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Float getRestCreditAmount() {
        return this.RestCreditAmount;
    }

    /**
     * Set Customer's remaining credit
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RestCreditAmount Customer's remaining credit
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRestCreditAmount(Float RestCreditAmount) {
        this.RestCreditAmount = RestCreditAmount;
    }

    public QueryClientListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryClientListItem(QueryClientListItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Arrears != null) {
            this.Arrears = new String(source.Arrears);
        }
        if (source.AssociationTime != null) {
            this.AssociationTime = new String(source.AssociationTime);
        }
        if (source.RecentExpiry != null) {
            this.RecentExpiry = new String(source.RecentExpiry);
        }
        if (source.ClientUin != null) {
            this.ClientUin = new Long(source.ClientUin);
        }
        if (source.CreditAmount != null) {
            this.CreditAmount = new Float(source.CreditAmount);
        }
        if (source.RestCreditAmount != null) {
            this.RestCreditAmount = new Float(source.RestCreditAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Arrears", this.Arrears);
        this.setParamSimple(map, prefix + "AssociationTime", this.AssociationTime);
        this.setParamSimple(map, prefix + "RecentExpiry", this.RecentExpiry);
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "CreditAmount", this.CreditAmount);
        this.setParamSimple(map, prefix + "RestCreditAmount", this.RestCreditAmount);

    }
}

