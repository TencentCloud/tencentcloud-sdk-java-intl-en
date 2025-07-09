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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCorpRequest extends AbstractModel {

    /**
    * Full name of the corporate.
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * Contact person's name.
    */
    @SerializedName("ContactName")
    @Expose
    private String ContactName;

    /**
    * Contact person's mailbox.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Contact person's mobile phone number.
    */
    @SerializedName("Telephone")
    @Expose
    private String Telephone;

    /**
     * Get Full name of the corporate. 
     * @return FullName Full name of the corporate.
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set Full name of the corporate.
     * @param FullName Full name of the corporate.
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get Contact person's name. 
     * @return ContactName Contact person's name.
     */
    public String getContactName() {
        return this.ContactName;
    }

    /**
     * Set Contact person's name.
     * @param ContactName Contact person's name.
     */
    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
    }

    /**
     * Get Contact person's mailbox. 
     * @return Email Contact person's mailbox.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Contact person's mailbox.
     * @param Email Contact person's mailbox.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Contact person's mobile phone number. 
     * @return Telephone Contact person's mobile phone number.
     */
    public String getTelephone() {
        return this.Telephone;
    }

    /**
     * Set Contact person's mobile phone number.
     * @param Telephone Contact person's mobile phone number.
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    public CreateCorpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCorpRequest(CreateCorpRequest source) {
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.ContactName != null) {
            this.ContactName = new String(source.ContactName);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Telephone != null) {
            this.Telephone = new String(source.Telephone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "ContactName", this.ContactName);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Telephone", this.Telephone);

    }
}

