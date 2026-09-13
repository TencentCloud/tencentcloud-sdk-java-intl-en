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

public class Inviter extends AbstractModel {

    /**
    * <p>The ID of the inviter</p>
    */
    @SerializedName("InviterUserId")
    @Expose
    private String InviterUserId;

    /**
    * <p>The phone number of the inviter</p><p>Parameter format: Complies with the E.164 standard format, which includes "+", region code, and number.</p>
    */
    @SerializedName("InviterPhone")
    @Expose
    private String InviterPhone;

    /**
    * <p>The code that the inviter sent to the user</p>
    */
    @SerializedName("InviteCode")
    @Expose
    private String InviteCode;

    /**
    * <p>The channel that inviter used to invite the user</p>
    */
    @SerializedName("InviteChannel")
    @Expose
    private String InviteChannel;

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
     * Get <p>The phone number of the inviter</p><p>Parameter format: Complies with the E.164 standard format, which includes "+", region code, and number.</p> 
     * @return InviterPhone <p>The phone number of the inviter</p><p>Parameter format: Complies with the E.164 standard format, which includes "+", region code, and number.</p>
     */
    public String getInviterPhone() {
        return this.InviterPhone;
    }

    /**
     * Set <p>The phone number of the inviter</p><p>Parameter format: Complies with the E.164 standard format, which includes "+", region code, and number.</p>
     * @param InviterPhone <p>The phone number of the inviter</p><p>Parameter format: Complies with the E.164 standard format, which includes "+", region code, and number.</p>
     */
    public void setInviterPhone(String InviterPhone) {
        this.InviterPhone = InviterPhone;
    }

    /**
     * Get <p>The code that the inviter sent to the user</p> 
     * @return InviteCode <p>The code that the inviter sent to the user</p>
     */
    public String getInviteCode() {
        return this.InviteCode;
    }

    /**
     * Set <p>The code that the inviter sent to the user</p>
     * @param InviteCode <p>The code that the inviter sent to the user</p>
     */
    public void setInviteCode(String InviteCode) {
        this.InviteCode = InviteCode;
    }

    /**
     * Get <p>The channel that inviter used to invite the user</p> 
     * @return InviteChannel <p>The channel that inviter used to invite the user</p>
     */
    public String getInviteChannel() {
        return this.InviteChannel;
    }

    /**
     * Set <p>The channel that inviter used to invite the user</p>
     * @param InviteChannel <p>The channel that inviter used to invite the user</p>
     */
    public void setInviteChannel(String InviteChannel) {
        this.InviteChannel = InviteChannel;
    }

    public Inviter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Inviter(Inviter source) {
        if (source.InviterUserId != null) {
            this.InviterUserId = new String(source.InviterUserId);
        }
        if (source.InviterPhone != null) {
            this.InviterPhone = new String(source.InviterPhone);
        }
        if (source.InviteCode != null) {
            this.InviteCode = new String(source.InviteCode);
        }
        if (source.InviteChannel != null) {
            this.InviteChannel = new String(source.InviteChannel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InviterUserId", this.InviterUserId);
        this.setParamSimple(map, prefix + "InviterPhone", this.InviterPhone);
        this.setParamSimple(map, prefix + "InviteCode", this.InviteCode);
        this.setParamSimple(map, prefix + "InviteChannel", this.InviteChannel);

    }
}

