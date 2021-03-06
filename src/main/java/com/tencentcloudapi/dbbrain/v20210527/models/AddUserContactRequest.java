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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddUserContactRequest extends AbstractModel{

    /**
    * Contact name, which must be unique, can contain 2–60 letters, digits, and underscores, and cannot start with an underscore.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Email address, which can contain letters, digits, and underscores and cannot start with an underscore.
    */
    @SerializedName("ContactInfo")
    @Expose
    private String ContactInfo;

    /**
    * Service type, which is fixed to `mysql`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get Contact name, which must be unique, can contain 2–60 letters, digits, and underscores, and cannot start with an underscore. 
     * @return Name Contact name, which must be unique, can contain 2–60 letters, digits, and underscores, and cannot start with an underscore.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Contact name, which must be unique, can contain 2–60 letters, digits, and underscores, and cannot start with an underscore.
     * @param Name Contact name, which must be unique, can contain 2–60 letters, digits, and underscores, and cannot start with an underscore.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Email address, which can contain letters, digits, and underscores and cannot start with an underscore. 
     * @return ContactInfo Email address, which can contain letters, digits, and underscores and cannot start with an underscore.
     */
    public String getContactInfo() {
        return this.ContactInfo;
    }

    /**
     * Set Email address, which can contain letters, digits, and underscores and cannot start with an underscore.
     * @param ContactInfo Email address, which can contain letters, digits, and underscores and cannot start with an underscore.
     */
    public void setContactInfo(String ContactInfo) {
        this.ContactInfo = ContactInfo;
    }

    /**
     * Get Service type, which is fixed to `mysql`. 
     * @return Product Service type, which is fixed to `mysql`.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Service type, which is fixed to `mysql`.
     * @param Product Service type, which is fixed to `mysql`.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public AddUserContactRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddUserContactRequest(AddUserContactRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ContactInfo != null) {
            this.ContactInfo = new String(source.ContactInfo);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ContactInfo", this.ContactInfo);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

