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
package com.tencentcloudapi.organization.v20181225.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendOrganizationInvitationRequest extends AbstractModel{

    /**
    * UIN of the invitee
    */
    @SerializedName("InviteUin")
    @Expose
    private Long InviteUin;

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Notes
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get UIN of the invitee 
     * @return InviteUin UIN of the invitee
     */
    public Long getInviteUin() {
        return this.InviteUin;
    }

    /**
     * Set UIN of the invitee
     * @param InviteUin UIN of the invitee
     */
    public void setInviteUin(Long InviteUin) {
        this.InviteUin = InviteUin;
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
     * Get Notes 
     * @return Remark Notes
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Notes
     * @param Remark Notes
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public SendOrganizationInvitationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendOrganizationInvitationRequest(SendOrganizationInvitationRequest source) {
        if (source.InviteUin != null) {
            this.InviteUin = new Long(source.InviteUin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InviteUin", this.InviteUin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

