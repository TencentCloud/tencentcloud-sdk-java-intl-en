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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCustomersCreditData extends AbstractModel {

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Phone
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * Email
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Overdue payment flag
    */
    @SerializedName("Arrears")
    @Expose
    private String Arrears;

    /**
    * Binding time
    */
    @SerializedName("AssociationTime")
    @Expose
    private String AssociationTime;

    /**
    * Expiration time
    */
    @SerializedName("RecentExpiry")
    @Expose
    private String RecentExpiry;

    /**
    * The UIN of reseller’s customer
    */
    @SerializedName("ClientUin")
    @Expose
    private Long ClientUin;

    /**
    * Credit granted to reseller’s customer
    */
    @SerializedName("Credit")
    @Expose
    private Float Credit;

    /**
    * The remaining credit of reseller’s customer
    */
    @SerializedName("RemainingCredit")
    @Expose
    private Float RemainingCredit;

    /**
    * 0: Identity not verified; 1: Individual identity verified; 2: Enterprise identity verified.
    */
    @SerializedName("IdentifyType")
    @Expose
    private Long IdentifyType;

    /**
    * Customer remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Forced status
    */
    @SerializedName("Force")
    @Expose
    private Long Force;

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Type 
     * @return Type Type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type
     * @param Type Type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Phone 
     * @return Mobile Phone
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set Phone
     * @param Mobile Phone
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
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
     * Get Overdue payment flag 
     * @return Arrears Overdue payment flag
     */
    public String getArrears() {
        return this.Arrears;
    }

    /**
     * Set Overdue payment flag
     * @param Arrears Overdue payment flag
     */
    public void setArrears(String Arrears) {
        this.Arrears = Arrears;
    }

    /**
     * Get Binding time 
     * @return AssociationTime Binding time
     */
    public String getAssociationTime() {
        return this.AssociationTime;
    }

    /**
     * Set Binding time
     * @param AssociationTime Binding time
     */
    public void setAssociationTime(String AssociationTime) {
        this.AssociationTime = AssociationTime;
    }

    /**
     * Get Expiration time 
     * @return RecentExpiry Expiration time
     */
    public String getRecentExpiry() {
        return this.RecentExpiry;
    }

    /**
     * Set Expiration time
     * @param RecentExpiry Expiration time
     */
    public void setRecentExpiry(String RecentExpiry) {
        this.RecentExpiry = RecentExpiry;
    }

    /**
     * Get The UIN of reseller’s customer 
     * @return ClientUin The UIN of reseller’s customer
     */
    public Long getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set The UIN of reseller’s customer
     * @param ClientUin The UIN of reseller’s customer
     */
    public void setClientUin(Long ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get Credit granted to reseller’s customer 
     * @return Credit Credit granted to reseller’s customer
     */
    public Float getCredit() {
        return this.Credit;
    }

    /**
     * Set Credit granted to reseller’s customer
     * @param Credit Credit granted to reseller’s customer
     */
    public void setCredit(Float Credit) {
        this.Credit = Credit;
    }

    /**
     * Get The remaining credit of reseller’s customer 
     * @return RemainingCredit The remaining credit of reseller’s customer
     */
    public Float getRemainingCredit() {
        return this.RemainingCredit;
    }

    /**
     * Set The remaining credit of reseller’s customer
     * @param RemainingCredit The remaining credit of reseller’s customer
     */
    public void setRemainingCredit(Float RemainingCredit) {
        this.RemainingCredit = RemainingCredit;
    }

    /**
     * Get 0: Identity not verified; 1: Individual identity verified; 2: Enterprise identity verified. 
     * @return IdentifyType 0: Identity not verified; 1: Individual identity verified; 2: Enterprise identity verified.
     */
    public Long getIdentifyType() {
        return this.IdentifyType;
    }

    /**
     * Set 0: Identity not verified; 1: Individual identity verified; 2: Enterprise identity verified.
     * @param IdentifyType 0: Identity not verified; 1: Individual identity verified; 2: Enterprise identity verified.
     */
    public void setIdentifyType(Long IdentifyType) {
        this.IdentifyType = IdentifyType;
    }

    /**
     * Get Customer remarks 
     * @return Remark Customer remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Customer remarks
     * @param Remark Customer remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Forced status 
     * @return Force Forced status
     */
    public Long getForce() {
        return this.Force;
    }

    /**
     * Set Forced status
     * @param Force Forced status
     */
    public void setForce(Long Force) {
        this.Force = Force;
    }

    public QueryCustomersCreditData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCustomersCreditData(QueryCustomersCreditData source) {
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
        if (source.Credit != null) {
            this.Credit = new Float(source.Credit);
        }
        if (source.RemainingCredit != null) {
            this.RemainingCredit = new Float(source.RemainingCredit);
        }
        if (source.IdentifyType != null) {
            this.IdentifyType = new Long(source.IdentifyType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Force != null) {
            this.Force = new Long(source.Force);
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
        this.setParamSimple(map, prefix + "Credit", this.Credit);
        this.setParamSimple(map, prefix + "RemainingCredit", this.RemainingCredit);
        this.setParamSimple(map, prefix + "IdentifyType", this.IdentifyType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

