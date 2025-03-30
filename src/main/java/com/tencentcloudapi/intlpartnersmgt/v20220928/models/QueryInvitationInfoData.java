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

public class QueryInvitationInfoData extends AbstractModel {

    /**
    * Invitation link token.
    */
    @SerializedName("InvitationToken")
    @Expose
    private String InvitationToken;

    /**
    * Creation time of the invitation link.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Invite link status.
1: Unused.
2: Used.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Indicates the usage time of the invitation link.
    */
    @SerializedName("UseTime")
    @Expose
    private String UseTime;

    /**
    * Customer uin.
    */
    @SerializedName("ClientUin")
    @Expose
    private Long ClientUin;

    /**
    * Customer mailbox.
    */
    @SerializedName("ClientMail")
    @Expose
    private String ClientMail;

    /**
    * Customer type.
1: Second-Level reseller.
2: Sub-Customer.
    */
    @SerializedName("ClientType")
    @Expose
    private Long ClientType;

    /**
    * The binding time of the customer.
    */
    @SerializedName("BindTime")
    @Expose
    private String BindTime;

    /**
     * Get Invitation link token. 
     * @return InvitationToken Invitation link token.
     */
    public String getInvitationToken() {
        return this.InvitationToken;
    }

    /**
     * Set Invitation link token.
     * @param InvitationToken Invitation link token.
     */
    public void setInvitationToken(String InvitationToken) {
        this.InvitationToken = InvitationToken;
    }

    /**
     * Get Creation time of the invitation link. 
     * @return CreateTime Creation time of the invitation link.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the invitation link.
     * @param CreateTime Creation time of the invitation link.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Invite link status.
1: Unused.
2: Used. 
     * @return Status Invite link status.
1: Unused.
2: Used.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Invite link status.
1: Unused.
2: Used.
     * @param Status Invite link status.
1: Unused.
2: Used.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Indicates the usage time of the invitation link. 
     * @return UseTime Indicates the usage time of the invitation link.
     */
    public String getUseTime() {
        return this.UseTime;
    }

    /**
     * Set Indicates the usage time of the invitation link.
     * @param UseTime Indicates the usage time of the invitation link.
     */
    public void setUseTime(String UseTime) {
        this.UseTime = UseTime;
    }

    /**
     * Get Customer uin. 
     * @return ClientUin Customer uin.
     */
    public Long getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set Customer uin.
     * @param ClientUin Customer uin.
     */
    public void setClientUin(Long ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get Customer mailbox. 
     * @return ClientMail Customer mailbox.
     */
    public String getClientMail() {
        return this.ClientMail;
    }

    /**
     * Set Customer mailbox.
     * @param ClientMail Customer mailbox.
     */
    public void setClientMail(String ClientMail) {
        this.ClientMail = ClientMail;
    }

    /**
     * Get Customer type.
1: Second-Level reseller.
2: Sub-Customer. 
     * @return ClientType Customer type.
1: Second-Level reseller.
2: Sub-Customer.
     */
    public Long getClientType() {
        return this.ClientType;
    }

    /**
     * Set Customer type.
1: Second-Level reseller.
2: Sub-Customer.
     * @param ClientType Customer type.
1: Second-Level reseller.
2: Sub-Customer.
     */
    public void setClientType(Long ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * Get The binding time of the customer. 
     * @return BindTime The binding time of the customer.
     */
    public String getBindTime() {
        return this.BindTime;
    }

    /**
     * Set The binding time of the customer.
     * @param BindTime The binding time of the customer.
     */
    public void setBindTime(String BindTime) {
        this.BindTime = BindTime;
    }

    public QueryInvitationInfoData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryInvitationInfoData(QueryInvitationInfoData source) {
        if (source.InvitationToken != null) {
            this.InvitationToken = new String(source.InvitationToken);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UseTime != null) {
            this.UseTime = new String(source.UseTime);
        }
        if (source.ClientUin != null) {
            this.ClientUin = new Long(source.ClientUin);
        }
        if (source.ClientMail != null) {
            this.ClientMail = new String(source.ClientMail);
        }
        if (source.ClientType != null) {
            this.ClientType = new Long(source.ClientType);
        }
        if (source.BindTime != null) {
            this.BindTime = new String(source.BindTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvitationToken", this.InvitationToken);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UseTime", this.UseTime);
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "ClientMail", this.ClientMail);
        this.setParamSimple(map, prefix + "ClientType", this.ClientType);
        this.setParamSimple(map, prefix + "BindTime", this.BindTime);

    }
}

