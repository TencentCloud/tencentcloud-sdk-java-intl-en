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

public class QuerySubAgentsDetailV2ResponseData extends AbstractModel {

    /**
    * Second-level reseller UIN.
    */
    @SerializedName("SubAgentUin")
    @Expose
    private Long SubAgentUin;

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Mobile number.
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * Specifies the mailbox.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Number of secondary dealer sub-customers.
    */
    @SerializedName("CountOfCustomers")
    @Expose
    private Long CountOfCustomers;

    /**
    * Binding time.
    */
    @SerializedName("BindTime")
    @Expose
    private String BindTime;

    /**
    * Credit limit pool of second-level reseller.
    */
    @SerializedName("Credit")
    @Expose
    private Float Credit;

    /**
    * Value pool of unconsumed credit limit for second-level reseller.
    */
    @SerializedName("RemainingCredit")
    @Expose
    private Float RemainingCredit;

    /**
    * Cash coupon quota pool for second-level reseller.
    */
    @SerializedName("Voucher")
    @Expose
    private Float Voucher;

    /**
    * Balance of cash coupon quota pool for second-level reseller.
    */
    @SerializedName("RemainingVoucher")
    @Expose
    private Float RemainingVoucher;

    /**
     * Get Second-level reseller UIN. 
     * @return SubAgentUin Second-level reseller UIN.
     */
    public Long getSubAgentUin() {
        return this.SubAgentUin;
    }

    /**
     * Set Second-level reseller UIN.
     * @param SubAgentUin Second-level reseller UIN.
     */
    public void setSubAgentUin(Long SubAgentUin) {
        this.SubAgentUin = SubAgentUin;
    }

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
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Mobile number. 
     * @return Mobile Mobile number.
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set Mobile number.
     * @param Mobile Mobile number.
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get Specifies the mailbox. 
     * @return Email Specifies the mailbox.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Specifies the mailbox.
     * @param Email Specifies the mailbox.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Number of secondary dealer sub-customers. 
     * @return CountOfCustomers Number of secondary dealer sub-customers.
     */
    public Long getCountOfCustomers() {
        return this.CountOfCustomers;
    }

    /**
     * Set Number of secondary dealer sub-customers.
     * @param CountOfCustomers Number of secondary dealer sub-customers.
     */
    public void setCountOfCustomers(Long CountOfCustomers) {
        this.CountOfCustomers = CountOfCustomers;
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
     * Get Credit limit pool of second-level reseller. 
     * @return Credit Credit limit pool of second-level reseller.
     */
    public Float getCredit() {
        return this.Credit;
    }

    /**
     * Set Credit limit pool of second-level reseller.
     * @param Credit Credit limit pool of second-level reseller.
     */
    public void setCredit(Float Credit) {
        this.Credit = Credit;
    }

    /**
     * Get Value pool of unconsumed credit limit for second-level reseller. 
     * @return RemainingCredit Value pool of unconsumed credit limit for second-level reseller.
     */
    public Float getRemainingCredit() {
        return this.RemainingCredit;
    }

    /**
     * Set Value pool of unconsumed credit limit for second-level reseller.
     * @param RemainingCredit Value pool of unconsumed credit limit for second-level reseller.
     */
    public void setRemainingCredit(Float RemainingCredit) {
        this.RemainingCredit = RemainingCredit;
    }

    /**
     * Get Cash coupon quota pool for second-level reseller. 
     * @return Voucher Cash coupon quota pool for second-level reseller.
     */
    public Float getVoucher() {
        return this.Voucher;
    }

    /**
     * Set Cash coupon quota pool for second-level reseller.
     * @param Voucher Cash coupon quota pool for second-level reseller.
     */
    public void setVoucher(Float Voucher) {
        this.Voucher = Voucher;
    }

    /**
     * Get Balance of cash coupon quota pool for second-level reseller. 
     * @return RemainingVoucher Balance of cash coupon quota pool for second-level reseller.
     */
    public Float getRemainingVoucher() {
        return this.RemainingVoucher;
    }

    /**
     * Set Balance of cash coupon quota pool for second-level reseller.
     * @param RemainingVoucher Balance of cash coupon quota pool for second-level reseller.
     */
    public void setRemainingVoucher(Float RemainingVoucher) {
        this.RemainingVoucher = RemainingVoucher;
    }

    public QuerySubAgentsDetailV2ResponseData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuerySubAgentsDetailV2ResponseData(QuerySubAgentsDetailV2ResponseData source) {
        if (source.SubAgentUin != null) {
            this.SubAgentUin = new Long(source.SubAgentUin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.CountOfCustomers != null) {
            this.CountOfCustomers = new Long(source.CountOfCustomers);
        }
        if (source.BindTime != null) {
            this.BindTime = new String(source.BindTime);
        }
        if (source.Credit != null) {
            this.Credit = new Float(source.Credit);
        }
        if (source.RemainingCredit != null) {
            this.RemainingCredit = new Float(source.RemainingCredit);
        }
        if (source.Voucher != null) {
            this.Voucher = new Float(source.Voucher);
        }
        if (source.RemainingVoucher != null) {
            this.RemainingVoucher = new Float(source.RemainingVoucher);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAgentUin", this.SubAgentUin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "CountOfCustomers", this.CountOfCustomers);
        this.setParamSimple(map, prefix + "BindTime", this.BindTime);
        this.setParamSimple(map, prefix + "Credit", this.Credit);
        this.setParamSimple(map, prefix + "RemainingCredit", this.RemainingCredit);
        this.setParamSimple(map, prefix + "Voucher", this.Voucher);
        this.setParamSimple(map, prefix + "RemainingVoucher", this.RemainingVoucher);

    }
}

