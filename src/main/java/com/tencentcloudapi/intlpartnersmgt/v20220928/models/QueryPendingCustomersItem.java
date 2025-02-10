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

public class QueryPendingCustomersItem extends AbstractModel {

    /**
    * Application time.
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * Sub-Account uin.
    */
    @SerializedName("ClientUin")
    @Expose
    private Long ClientUin;

    /**
    * Email.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Mobile number.
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * Name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Approval status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Sub-Customer type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

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
     * Get Sub-Account uin. 
     * @return ClientUin Sub-Account uin.
     */
    public Long getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set Sub-Account uin.
     * @param ClientUin Sub-Account uin.
     */
    public void setClientUin(Long ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get Email. 
     * @return Email Email.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Email.
     * @param Email Email.
     */
    public void setEmail(String Email) {
        this.Email = Email;
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
     * Get Name. 
     * @return Name Name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name.
     * @param Name Name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Approval status. 
     * @return Status Approval status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Approval status.
     * @param Status Approval status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Sub-Customer type. 
     * @return Type Sub-Customer type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Sub-Customer type.
     * @param Type Sub-Customer type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public QueryPendingCustomersItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryPendingCustomersItem(QueryPendingCustomersItem source) {
        if (source.ApplyTime != null) {
            this.ApplyTime = new String(source.ApplyTime);
        }
        if (source.ClientUin != null) {
            this.ClientUin = new Long(source.ClientUin);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

