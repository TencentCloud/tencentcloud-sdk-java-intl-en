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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddressTemplateItem extends AbstractModel {

    /**
    * ipm-xxxxxxxx
    */
    @SerializedName("AddressTemplateId")
    @Expose
    private String AddressTemplateId;

    /**
    * IP template name
    */
    @SerializedName("AddressTemplateName")
    @Expose
    private String AddressTemplateName;

    /**
    * Disused
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Disused
    */
    @SerializedName("To")
    @Expose
    private String To;

    /**
     * Get ipm-xxxxxxxx 
     * @return AddressTemplateId ipm-xxxxxxxx
     */
    public String getAddressTemplateId() {
        return this.AddressTemplateId;
    }

    /**
     * Set ipm-xxxxxxxx
     * @param AddressTemplateId ipm-xxxxxxxx
     */
    public void setAddressTemplateId(String AddressTemplateId) {
        this.AddressTemplateId = AddressTemplateId;
    }

    /**
     * Get IP template name 
     * @return AddressTemplateName IP template name
     */
    public String getAddressTemplateName() {
        return this.AddressTemplateName;
    }

    /**
     * Set IP template name
     * @param AddressTemplateName IP template name
     */
    public void setAddressTemplateName(String AddressTemplateName) {
        this.AddressTemplateName = AddressTemplateName;
    }

    /**
     * Get Disused 
     * @return From Disused
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Disused
     * @param From Disused
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get Disused 
     * @return To Disused
     */
    public String getTo() {
        return this.To;
    }

    /**
     * Set Disused
     * @param To Disused
     */
    public void setTo(String To) {
        this.To = To;
    }

    public AddressTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddressTemplateItem(AddressTemplateItem source) {
        if (source.AddressTemplateId != null) {
            this.AddressTemplateId = new String(source.AddressTemplateId);
        }
        if (source.AddressTemplateName != null) {
            this.AddressTemplateName = new String(source.AddressTemplateName);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.To != null) {
            this.To = new String(source.To);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateId", this.AddressTemplateId);
        this.setParamSimple(map, prefix + "AddressTemplateName", this.AddressTemplateName);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);

    }
}

