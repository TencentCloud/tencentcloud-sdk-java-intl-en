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

public class Billing extends AbstractModel {

    /**
    * <p>The billing address associated with this user</p>
    */
    @SerializedName("Address")
    @Expose
    private Address Address;

    /**
    * <p>The phone number associated with the bill</p><p>Parameter format: Complies with the E.164 standard, using the format with "+", region code, and number</p>
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * <p>The email associated with the bill</p>
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * <p>The name of the receiver associated with the bill</p>
    */
    @SerializedName("Recipient")
    @Expose
    private String Recipient;

    /**
     * Get <p>The billing address associated with this user</p> 
     * @return Address <p>The billing address associated with this user</p>
     */
    public Address getAddress() {
        return this.Address;
    }

    /**
     * Set <p>The billing address associated with this user</p>
     * @param Address <p>The billing address associated with this user</p>
     */
    public void setAddress(Address Address) {
        this.Address = Address;
    }

    /**
     * Get <p>The phone number associated with the bill</p><p>Parameter format: Complies with the E.164 standard, using the format with "+", region code, and number</p> 
     * @return Phone <p>The phone number associated with the bill</p><p>Parameter format: Complies with the E.164 standard, using the format with "+", region code, and number</p>
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set <p>The phone number associated with the bill</p><p>Parameter format: Complies with the E.164 standard, using the format with "+", region code, and number</p>
     * @param Phone <p>The phone number associated with the bill</p><p>Parameter format: Complies with the E.164 standard, using the format with "+", region code, and number</p>
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get <p>The email associated with the bill</p> 
     * @return Email <p>The email associated with the bill</p>
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set <p>The email associated with the bill</p>
     * @param Email <p>The email associated with the bill</p>
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get <p>The name of the receiver associated with the bill</p> 
     * @return Recipient <p>The name of the receiver associated with the bill</p>
     */
    public String getRecipient() {
        return this.Recipient;
    }

    /**
     * Set <p>The name of the receiver associated with the bill</p>
     * @param Recipient <p>The name of the receiver associated with the bill</p>
     */
    public void setRecipient(String Recipient) {
        this.Recipient = Recipient;
    }

    public Billing() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Billing(Billing source) {
        if (source.Address != null) {
            this.Address = new Address(source.Address);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Recipient != null) {
            this.Recipient = new String(source.Recipient);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Recipient", this.Recipient);

    }
}

