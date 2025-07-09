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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContactItem extends AbstractModel {

    /**
    * Recipient ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Recipient name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Recipient email.
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
     * Get Recipient ID. 
     * @return Id Recipient ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Recipient ID.
     * @param Id Recipient ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Recipient name. 
     * @return Name Recipient name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Recipient name.
     * @param Name Recipient name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Recipient email. 
     * @return Mail Recipient email.
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set Recipient email.
     * @param Mail Recipient email.
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public ContactItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContactItem(ContactItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mail != null) {
            this.Mail = new String(source.Mail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mail", this.Mail);

    }
}

