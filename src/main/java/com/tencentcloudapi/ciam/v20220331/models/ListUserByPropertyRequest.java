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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListUserByPropertyRequest extends AbstractModel{

    /**
    * User directory ID
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * Query attribute

<li> **phoneNumber** </li>	  Mobile number
<li> **email** </li>  Email
    */
    @SerializedName("PropertyCode")
    @Expose
    private String PropertyCode;

    /**
    * Attribute value
    */
    @SerializedName("PropertyValue")
    @Expose
    private String PropertyValue;

    /**
    * 
    */
    @SerializedName("Original")
    @Expose
    private Boolean Original;

    /**
     * Get User directory ID 
     * @return UserStoreId User directory ID
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set User directory ID
     * @param UserStoreId User directory ID
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get Query attribute

<li> **phoneNumber** </li>	  Mobile number
<li> **email** </li>  Email 
     * @return PropertyCode Query attribute

<li> **phoneNumber** </li>	  Mobile number
<li> **email** </li>  Email
     */
    public String getPropertyCode() {
        return this.PropertyCode;
    }

    /**
     * Set Query attribute

<li> **phoneNumber** </li>	  Mobile number
<li> **email** </li>  Email
     * @param PropertyCode Query attribute

<li> **phoneNumber** </li>	  Mobile number
<li> **email** </li>  Email
     */
    public void setPropertyCode(String PropertyCode) {
        this.PropertyCode = PropertyCode;
    }

    /**
     * Get Attribute value 
     * @return PropertyValue Attribute value
     */
    public String getPropertyValue() {
        return this.PropertyValue;
    }

    /**
     * Set Attribute value
     * @param PropertyValue Attribute value
     */
    public void setPropertyValue(String PropertyValue) {
        this.PropertyValue = PropertyValue;
    }

    /**
     * Get  
     * @return Original 
     */
    public Boolean getOriginal() {
        return this.Original;
    }

    /**
     * Set 
     * @param Original 
     */
    public void setOriginal(Boolean Original) {
        this.Original = Original;
    }

    public ListUserByPropertyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListUserByPropertyRequest(ListUserByPropertyRequest source) {
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.PropertyCode != null) {
            this.PropertyCode = new String(source.PropertyCode);
        }
        if (source.PropertyValue != null) {
            this.PropertyValue = new String(source.PropertyValue);
        }
        if (source.Original != null) {
            this.Original = new Boolean(source.Original);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamSimple(map, prefix + "PropertyCode", this.PropertyCode);
        this.setParamSimple(map, prefix + "PropertyValue", this.PropertyValue);
        this.setParamSimple(map, prefix + "Original", this.Original);

    }
}

