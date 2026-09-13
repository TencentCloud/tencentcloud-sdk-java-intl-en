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

public class ClaimRedPacketEvent extends AbstractModel {

    /**
    * <p>The ID of the promotion</p>
    */
    @SerializedName("PromotionId")
    @Expose
    private String PromotionId;

    /**
    * <p>The Name of the promotion</p>
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
    * <p>The ID of the inviter</p>
    */
    @SerializedName("InviterUserId")
    @Expose
    private String InviterUserId;

    /**
    * <p>The ID of the red packet</p>
    */
    @SerializedName("RedPacketId")
    @Expose
    private String RedPacketId;

    /**
    * <p>The type of red packet, for example, random amount, passcode, standard</p>
    */
    @SerializedName("RedPacketType")
    @Expose
    private String RedPacketType;

    /**
    * <p>The amount  in the red packet</p>
    */
    @SerializedName("RedPacketAmount")
    @Expose
    private Amount RedPacketAmount;

    /**
    * <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

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
     * Get <p>The Name of the promotion</p> 
     * @return PromotionName <p>The Name of the promotion</p>
     */
    public String getPromotionName() {
        return this.PromotionName;
    }

    /**
     * Set <p>The Name of the promotion</p>
     * @param PromotionName <p>The Name of the promotion</p>
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
     * Get <p>The ID of the inviter</p> 
     * @return InviterUserId <p>The ID of the inviter</p>
     */
    public String getInviterUserId() {
        return this.InviterUserId;
    }

    /**
     * Set <p>The ID of the inviter</p>
     * @param InviterUserId <p>The ID of the inviter</p>
     */
    public void setInviterUserId(String InviterUserId) {
        this.InviterUserId = InviterUserId;
    }

    /**
     * Get <p>The ID of the red packet</p> 
     * @return RedPacketId <p>The ID of the red packet</p>
     */
    public String getRedPacketId() {
        return this.RedPacketId;
    }

    /**
     * Set <p>The ID of the red packet</p>
     * @param RedPacketId <p>The ID of the red packet</p>
     */
    public void setRedPacketId(String RedPacketId) {
        this.RedPacketId = RedPacketId;
    }

    /**
     * Get <p>The type of red packet, for example, random amount, passcode, standard</p> 
     * @return RedPacketType <p>The type of red packet, for example, random amount, passcode, standard</p>
     */
    public String getRedPacketType() {
        return this.RedPacketType;
    }

    /**
     * Set <p>The type of red packet, for example, random amount, passcode, standard</p>
     * @param RedPacketType <p>The type of red packet, for example, random amount, passcode, standard</p>
     */
    public void setRedPacketType(String RedPacketType) {
        this.RedPacketType = RedPacketType;
    }

    /**
     * Get <p>The amount  in the red packet</p> 
     * @return RedPacketAmount <p>The amount  in the red packet</p>
     */
    public Amount getRedPacketAmount() {
        return this.RedPacketAmount;
    }

    /**
     * Set <p>The amount  in the red packet</p>
     * @param RedPacketAmount <p>The amount  in the red packet</p>
     */
    public void setRedPacketAmount(Amount RedPacketAmount) {
        this.RedPacketAmount = RedPacketAmount;
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

    public ClaimRedPacketEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClaimRedPacketEvent(ClaimRedPacketEvent source) {
        if (source.PromotionId != null) {
            this.PromotionId = new String(source.PromotionId);
        }
        if (source.PromotionName != null) {
            this.PromotionName = new String(source.PromotionName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InviterUserId != null) {
            this.InviterUserId = new String(source.InviterUserId);
        }
        if (source.RedPacketId != null) {
            this.RedPacketId = new String(source.RedPacketId);
        }
        if (source.RedPacketType != null) {
            this.RedPacketType = new String(source.RedPacketType);
        }
        if (source.RedPacketAmount != null) {
            this.RedPacketAmount = new Amount(source.RedPacketAmount);
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
        this.setParamSimple(map, prefix + "PromotionId", this.PromotionId);
        this.setParamSimple(map, prefix + "PromotionName", this.PromotionName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InviterUserId", this.InviterUserId);
        this.setParamSimple(map, prefix + "RedPacketId", this.RedPacketId);
        this.setParamSimple(map, prefix + "RedPacketType", this.RedPacketType);
        this.setParamObj(map, prefix + "RedPacketAmount.", this.RedPacketAmount);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

