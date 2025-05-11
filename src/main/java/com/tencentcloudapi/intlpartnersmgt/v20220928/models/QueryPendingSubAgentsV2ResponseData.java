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

public class QueryPendingSubAgentsV2ResponseData extends AbstractModel {

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
    * Application time
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * Approval status

{Reviewing: pending review}.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Application material.
    */
    @SerializedName("MaterialUrl")
    @Expose
    private String MaterialUrl;

    /**
    * Identity verification status -1: file not uploaded 0: pending review 1: under review; 2: review error; 3: approved.
    */
    @SerializedName("AuthState")
    @Expose
    private Long AuthState;

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
     * Get Application time 
     * @return ApplyTime Application time
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set Application time
     * @param ApplyTime Application time
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get Approval status

{Reviewing: pending review}. 
     * @return Status Approval status

{Reviewing: pending review}.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Approval status

{Reviewing: pending review}.
     * @param Status Approval status

{Reviewing: pending review}.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Application material. 
     * @return MaterialUrl Application material.
     */
    public String getMaterialUrl() {
        return this.MaterialUrl;
    }

    /**
     * Set Application material.
     * @param MaterialUrl Application material.
     */
    public void setMaterialUrl(String MaterialUrl) {
        this.MaterialUrl = MaterialUrl;
    }

    /**
     * Get Identity verification status -1: file not uploaded 0: pending review 1: under review; 2: review error; 3: approved. 
     * @return AuthState Identity verification status -1: file not uploaded 0: pending review 1: under review; 2: review error; 3: approved.
     */
    public Long getAuthState() {
        return this.AuthState;
    }

    /**
     * Set Identity verification status -1: file not uploaded 0: pending review 1: under review; 2: review error; 3: approved.
     * @param AuthState Identity verification status -1: file not uploaded 0: pending review 1: under review; 2: review error; 3: approved.
     */
    public void setAuthState(Long AuthState) {
        this.AuthState = AuthState;
    }

    public QueryPendingSubAgentsV2ResponseData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryPendingSubAgentsV2ResponseData(QueryPendingSubAgentsV2ResponseData source) {
        if (source.SubAgentUin != null) {
            this.SubAgentUin = new Long(source.SubAgentUin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new String(source.ApplyTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.MaterialUrl != null) {
            this.MaterialUrl = new String(source.MaterialUrl);
        }
        if (source.AuthState != null) {
            this.AuthState = new Long(source.AuthState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAgentUin", this.SubAgentUin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MaterialUrl", this.MaterialUrl);
        this.setParamSimple(map, prefix + "AuthState", this.AuthState);

    }
}

