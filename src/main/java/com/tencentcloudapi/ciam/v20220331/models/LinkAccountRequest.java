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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LinkAccountRequest extends AbstractModel {

    /**
    * User directory ID
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * Primary user ID
    */
    @SerializedName("PrimaryUserId")
    @Expose
    private String PrimaryUserId;

    /**
    * Secondary user ID
    */
    @SerializedName("SecondaryUserId")
    @Expose
    private String SecondaryUserId;

    /**
    * Fusion attribute

<li> **PHONENUMBER** </li>	  Mobile number
<li> **EMAIL** </li>  Email
    */
    @SerializedName("UserLinkedOnAttribute")
    @Expose
    private String UserLinkedOnAttribute;

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
     * Get Primary user ID 
     * @return PrimaryUserId Primary user ID
     */
    public String getPrimaryUserId() {
        return this.PrimaryUserId;
    }

    /**
     * Set Primary user ID
     * @param PrimaryUserId Primary user ID
     */
    public void setPrimaryUserId(String PrimaryUserId) {
        this.PrimaryUserId = PrimaryUserId;
    }

    /**
     * Get Secondary user ID 
     * @return SecondaryUserId Secondary user ID
     */
    public String getSecondaryUserId() {
        return this.SecondaryUserId;
    }

    /**
     * Set Secondary user ID
     * @param SecondaryUserId Secondary user ID
     */
    public void setSecondaryUserId(String SecondaryUserId) {
        this.SecondaryUserId = SecondaryUserId;
    }

    /**
     * Get Fusion attribute

<li> **PHONENUMBER** </li>	  Mobile number
<li> **EMAIL** </li>  Email 
     * @return UserLinkedOnAttribute Fusion attribute

<li> **PHONENUMBER** </li>	  Mobile number
<li> **EMAIL** </li>  Email
     */
    public String getUserLinkedOnAttribute() {
        return this.UserLinkedOnAttribute;
    }

    /**
     * Set Fusion attribute

<li> **PHONENUMBER** </li>	  Mobile number
<li> **EMAIL** </li>  Email
     * @param UserLinkedOnAttribute Fusion attribute

<li> **PHONENUMBER** </li>	  Mobile number
<li> **EMAIL** </li>  Email
     */
    public void setUserLinkedOnAttribute(String UserLinkedOnAttribute) {
        this.UserLinkedOnAttribute = UserLinkedOnAttribute;
    }

    public LinkAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LinkAccountRequest(LinkAccountRequest source) {
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.PrimaryUserId != null) {
            this.PrimaryUserId = new String(source.PrimaryUserId);
        }
        if (source.SecondaryUserId != null) {
            this.SecondaryUserId = new String(source.SecondaryUserId);
        }
        if (source.UserLinkedOnAttribute != null) {
            this.UserLinkedOnAttribute = new String(source.UserLinkedOnAttribute);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamSimple(map, prefix + "PrimaryUserId", this.PrimaryUserId);
        this.setParamSimple(map, prefix + "SecondaryUserId", this.SecondaryUserId);
        this.setParamSimple(map, prefix + "UserLinkedOnAttribute", this.UserLinkedOnAttribute);

    }
}

