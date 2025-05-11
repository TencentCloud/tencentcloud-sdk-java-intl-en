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

public class CreateAndSendClientInvitationMailRequest extends AbstractModel {

    /**
    * Email address that receives the customer invitation link.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Invite a role.
Note: if no value is passed, it defaults to the sub - customer.
Client: customer.
SubAgent: second-level reseller.
    */
    @SerializedName("InvitationRole")
    @Expose
    private String InvitationRole;

    /**
    * Specifies the application material.
Note: this field takes effect only in the scenario of inviting a second-level reseller.
    */
    @SerializedName("MaterialUrl")
    @Expose
    private String MaterialUrl;

    /**
     * Get Email address that receives the customer invitation link. 
     * @return Email Email address that receives the customer invitation link.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Email address that receives the customer invitation link.
     * @param Email Email address that receives the customer invitation link.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Invite a role.
Note: if no value is passed, it defaults to the sub - customer.
Client: customer.
SubAgent: second-level reseller. 
     * @return InvitationRole Invite a role.
Note: if no value is passed, it defaults to the sub - customer.
Client: customer.
SubAgent: second-level reseller.
     */
    public String getInvitationRole() {
        return this.InvitationRole;
    }

    /**
     * Set Invite a role.
Note: if no value is passed, it defaults to the sub - customer.
Client: customer.
SubAgent: second-level reseller.
     * @param InvitationRole Invite a role.
Note: if no value is passed, it defaults to the sub - customer.
Client: customer.
SubAgent: second-level reseller.
     */
    public void setInvitationRole(String InvitationRole) {
        this.InvitationRole = InvitationRole;
    }

    /**
     * Get Specifies the application material.
Note: this field takes effect only in the scenario of inviting a second-level reseller. 
     * @return MaterialUrl Specifies the application material.
Note: this field takes effect only in the scenario of inviting a second-level reseller.
     */
    public String getMaterialUrl() {
        return this.MaterialUrl;
    }

    /**
     * Set Specifies the application material.
Note: this field takes effect only in the scenario of inviting a second-level reseller.
     * @param MaterialUrl Specifies the application material.
Note: this field takes effect only in the scenario of inviting a second-level reseller.
     */
    public void setMaterialUrl(String MaterialUrl) {
        this.MaterialUrl = MaterialUrl;
    }

    public CreateAndSendClientInvitationMailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAndSendClientInvitationMailRequest(CreateAndSendClientInvitationMailRequest source) {
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.InvitationRole != null) {
            this.InvitationRole = new String(source.InvitationRole);
        }
        if (source.MaterialUrl != null) {
            this.MaterialUrl = new String(source.MaterialUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "InvitationRole", this.InvitationRole);
        this.setParamSimple(map, prefix + "MaterialUrl", this.MaterialUrl);

    }
}

