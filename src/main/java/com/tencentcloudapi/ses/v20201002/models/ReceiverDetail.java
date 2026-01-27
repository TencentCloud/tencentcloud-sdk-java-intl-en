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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReceiverDetail extends AbstractModel {

    /**
    * Recipient's address.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Creation time.


    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Template parameter.
    */
    @SerializedName("TemplateData")
    @Expose
    private String TemplateData;

    /**
    * Invalid reason.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 1: valid; 2: invalid.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Recipient address id.
    */
    @SerializedName("EmailId")
    @Expose
    private Long EmailId;

    /**
     * Get Recipient's address. 
     * @return Email Recipient's address.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Recipient's address.
     * @param Email Recipient's address.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Creation time.

 
     * @return CreateTime Creation time.


     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.


     * @param CreateTime Creation time.


     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Template parameter. 
     * @return TemplateData Template parameter.
     */
    public String getTemplateData() {
        return this.TemplateData;
    }

    /**
     * Set Template parameter.
     * @param TemplateData Template parameter.
     */
    public void setTemplateData(String TemplateData) {
        this.TemplateData = TemplateData;
    }

    /**
     * Get Invalid reason. 
     * @return Reason Invalid reason.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Invalid reason.
     * @param Reason Invalid reason.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 1: valid; 2: invalid. 
     * @return Status 1: valid; 2: invalid.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1: valid; 2: invalid.
     * @param Status 1: valid; 2: invalid.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Recipient address id. 
     * @return EmailId Recipient address id.
     */
    public Long getEmailId() {
        return this.EmailId;
    }

    /**
     * Set Recipient address id.
     * @param EmailId Recipient address id.
     */
    public void setEmailId(Long EmailId) {
        this.EmailId = EmailId;
    }

    public ReceiverDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReceiverDetail(ReceiverDetail source) {
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.TemplateData != null) {
            this.TemplateData = new String(source.TemplateData);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.EmailId != null) {
            this.EmailId = new Long(source.EmailId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TemplateData", this.TemplateData);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EmailId", this.EmailId);

    }
}

