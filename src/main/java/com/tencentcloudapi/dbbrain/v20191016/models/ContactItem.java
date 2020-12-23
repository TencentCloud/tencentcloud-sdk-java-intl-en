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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContactItem extends AbstractModel{

    /**
    * Contact ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Contact name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The mailbox bound to the contact.
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
     * Get Contact ID. 
     * @return Id Contact ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Contact ID.
     * @param Id Contact ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Contact name. 
     * @return Name Contact name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Contact name.
     * @param Name Contact name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The mailbox bound to the contact. 
     * @return Mail The mailbox bound to the contact.
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set The mailbox bound to the contact.
     * @param Mail The mailbox bound to the contact.
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
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

