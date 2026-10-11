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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyOrderAttributeRequest extends AbstractModel {

    /**
    * Authorization type. 0: Pro Edition - pay-as-you-go; 1: Pro Edition - monthly subscription; 2: Ultimate Edition - monthly subscription.
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Editable attribute name. Currently supported values: 
Resource alias
projectId Project ID
    */
    @SerializedName("AttrName")
    @Expose
    private String AttrName;

    /**
    * Attribute value
When AttrName is alias, any string with a maximum length of 15 characters.
When AttrName is projectId, the project ID must actually exist.
    */
    @SerializedName("AttrValue")
    @Expose
    private String AttrValue;

    /**
     * Get Authorization type. 0: Pro Edition - pay-as-you-go; 1: Pro Edition - monthly subscription; 2: Ultimate Edition - monthly subscription. 
     * @return LicenseType Authorization type. 0: Pro Edition - pay-as-you-go; 1: Pro Edition - monthly subscription; 2: Ultimate Edition - monthly subscription.
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set Authorization type. 0: Pro Edition - pay-as-you-go; 1: Pro Edition - monthly subscription; 2: Ultimate Edition - monthly subscription.
     * @param LicenseType Authorization type. 0: Pro Edition - pay-as-you-go; 1: Pro Edition - monthly subscription; 2: Ultimate Edition - monthly subscription.
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Editable attribute name. Currently supported values: 
Resource alias
projectId Project ID 
     * @return AttrName Editable attribute name. Currently supported values: 
Resource alias
projectId Project ID
     */
    public String getAttrName() {
        return this.AttrName;
    }

    /**
     * Set Editable attribute name. Currently supported values: 
Resource alias
projectId Project ID
     * @param AttrName Editable attribute name. Currently supported values: 
Resource alias
projectId Project ID
     */
    public void setAttrName(String AttrName) {
        this.AttrName = AttrName;
    }

    /**
     * Get Attribute value
When AttrName is alias, any string with a maximum length of 15 characters.
When AttrName is projectId, the project ID must actually exist. 
     * @return AttrValue Attribute value
When AttrName is alias, any string with a maximum length of 15 characters.
When AttrName is projectId, the project ID must actually exist.
     */
    public String getAttrValue() {
        return this.AttrValue;
    }

    /**
     * Set Attribute value
When AttrName is alias, any string with a maximum length of 15 characters.
When AttrName is projectId, the project ID must actually exist.
     * @param AttrValue Attribute value
When AttrName is alias, any string with a maximum length of 15 characters.
When AttrName is projectId, the project ID must actually exist.
     */
    public void setAttrValue(String AttrValue) {
        this.AttrValue = AttrValue;
    }

    public ModifyOrderAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOrderAttributeRequest(ModifyOrderAttributeRequest source) {
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AttrName != null) {
            this.AttrName = new String(source.AttrName);
        }
        if (source.AttrValue != null) {
            this.AttrValue = new String(source.AttrValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AttrName", this.AttrName);
        this.setParamSimple(map, prefix + "AttrValue", this.AttrValue);

    }
}

