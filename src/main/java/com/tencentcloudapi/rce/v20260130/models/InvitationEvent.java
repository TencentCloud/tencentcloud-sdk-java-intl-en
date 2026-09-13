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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvitationEvent extends AbstractModel {

    /**
    * <p>The ID of the invitee</p>
    */
    @SerializedName("InviteeUserId")
    @Expose
    private String InviteeUserId;

    /**
    * <p>The ID of the promotion</p>
    */
    @SerializedName("PromotionId")
    @Expose
    private String PromotionId;

    /**
    * <p>The name of the promotion</p>
    */
    @SerializedName("PromotionName")
    @Expose
    private String PromotionName;

    /**
    * <p>The description of the promotion</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>The phone number of the invitee</p><p>Parameter format: Complies with the E.164 standard format, which includes "+", region code, and number.</p>
    */
    @SerializedName("InviteePhone")
    @Expose
    private String InviteePhone;

    /**
    * <p>The code that the inviter sent to the user</p>
    */
    @SerializedName("InvitationCode")
    @Expose
    private String InvitationCode;

    /**
    * <p>The url that the inviter sent to the user</p>
    */
    @SerializedName("InvitationUrl")
    @Expose
    private String InvitationUrl;

    /**
    * <p>The channel that inviter used to invite the user </p>
    */
    @SerializedName("InvitationChannel")
    @Expose
    private String InvitationChannel;

    /**
    * <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>The ID of the invitee</p> 
     * @return InviteeUserId <p>The ID of the invitee</p>
     */
    public String getInviteeUserId() {
        return this.InviteeUserId;
    }

    /**
     * Set <p>The ID of the invitee</p>
     * @param InviteeUserId <p>The ID of the invitee</p>
     */
    public void setInviteeUserId(String InviteeUserId) {
        this.InviteeUserId = InviteeUserId;
    }

    /**
     * Get <p>The ID of the promotion</p> 
     * @return PromotionId <p>The ID of the promotion</p>
     */
    public String getPromotionId() {
        return this.PromotionId;
    }

    /**
     * Set <p>The ID of the promotion</p>
     * @param PromotionId <p>The ID of the promotion</p>
     */
    public void setPromotionId(String PromotionId) {
        this.PromotionId = PromotionId;
    }

    /**
     * Get <p>The name of the promotion</p> 
     * @return PromotionName <p>The name of the promotion</p>
     */
    public String getPromotionName() {
        return this.PromotionName;
    }

    /**
     * Set <p>The name of the promotion</p>
     * @param PromotionName <p>The name of the promotion</p>
     */
    public void setPromotionName(String PromotionName) {
        this.PromotionName = PromotionName;
    }

    /**
     * Get <p>The description of the promotion</p> 
     * @return Description <p>The description of the promotion</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>The description of the promotion</p>
     * @param Description <p>The description of the promotion</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>The phone number of the invitee</p><p>Parameter format: Complies with the E.164 standard format, which includes "+", region code, and number.</p> 
     * @return InviteePhone <p>The phone number of the invitee</p><p>Parameter format: Complies with the E.164 standard format, which includes "+", region code, and number.</p>
     */
    public String getInviteePhone() {
        return this.InviteePhone;
    }

    /**
     * Set <p>The phone number of the invitee</p><p>Parameter format: Complies with the E.164 standard format, which includes "+", region code, and number.</p>
     * @param InviteePhone <p>The phone number of the invitee</p><p>Parameter format: Complies with the E.164 standard format, which includes "+", region code, and number.</p>
     */
    public void setInviteePhone(String InviteePhone) {
        this.InviteePhone = InviteePhone;
    }

    /**
     * Get <p>The code that the inviter sent to the user</p> 
     * @return InvitationCode <p>The code that the inviter sent to the user</p>
     */
    public String getInvitationCode() {
        return this.InvitationCode;
    }

    /**
     * Set <p>The code that the inviter sent to the user</p>
     * @param InvitationCode <p>The code that the inviter sent to the user</p>
     */
    public void setInvitationCode(String InvitationCode) {
        this.InvitationCode = InvitationCode;
    }

    /**
     * Get <p>The url that the inviter sent to the user</p> 
     * @return InvitationUrl <p>The url that the inviter sent to the user</p>
     */
    public String getInvitationUrl() {
        return this.InvitationUrl;
    }

    /**
     * Set <p>The url that the inviter sent to the user</p>
     * @param InvitationUrl <p>The url that the inviter sent to the user</p>
     */
    public void setInvitationUrl(String InvitationUrl) {
        this.InvitationUrl = InvitationUrl;
    }

    /**
     * Get <p>The channel that inviter used to invite the user </p> 
     * @return InvitationChannel <p>The channel that inviter used to invite the user </p>
     */
    public String getInvitationChannel() {
        return this.InvitationChannel;
    }

    /**
     * Set <p>The channel that inviter used to invite the user </p>
     * @param InvitationChannel <p>The channel that inviter used to invite the user </p>
     */
    public void setInvitationChannel(String InvitationChannel) {
        this.InvitationChannel = InvitationChannel;
    }

    /**
     * Get <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p> 
     * @return Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     * @param Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public InvitationEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvitationEvent(InvitationEvent source) {
        if (source.InviteeUserId != null) {
            this.InviteeUserId = new String(source.InviteeUserId);
        }
        if (source.PromotionId != null) {
            this.PromotionId = new String(source.PromotionId);
        }
        if (source.PromotionName != null) {
            this.PromotionName = new String(source.PromotionName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InviteePhone != null) {
            this.InviteePhone = new String(source.InviteePhone);
        }
        if (source.InvitationCode != null) {
            this.InvitationCode = new String(source.InvitationCode);
        }
        if (source.InvitationUrl != null) {
            this.InvitationUrl = new String(source.InvitationUrl);
        }
        if (source.InvitationChannel != null) {
            this.InvitationChannel = new String(source.InvitationChannel);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InviteeUserId", this.InviteeUserId);
        this.setParamSimple(map, prefix + "PromotionId", this.PromotionId);
        this.setParamSimple(map, prefix + "PromotionName", this.PromotionName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InviteePhone", this.InviteePhone);
        this.setParamSimple(map, prefix + "InvitationCode", this.InvitationCode);
        this.setParamSimple(map, prefix + "InvitationUrl", this.InvitationUrl);
        this.setParamSimple(map, prefix + "InvitationChannel", this.InvitationChannel);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

