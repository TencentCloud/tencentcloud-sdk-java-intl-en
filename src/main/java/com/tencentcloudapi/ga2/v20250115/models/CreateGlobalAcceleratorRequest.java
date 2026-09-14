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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGlobalAcceleratorRequest extends AbstractModel {

    /**
    * <p>Name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Billing mode. PREPAID: prepaid mode, i.e., Monthly Subscription. POSTPAID: postpaid, i.e., pay-as-you-go. Default: POSTPAID. Currently, only pay-as-you-go is supported.</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>Description.</p><p>Parameter format: should not exceed 100 characters.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Cross-border type; HighQuality: dedicated BGP-IP cross-border; Unicom: China Unicom Direct Connect cross-border.</p>
    */
    @SerializedName("CrossBorderType")
    @Expose
    private String CrossBorderType;

    /**
    * <p>This Flag represents signing the cross-border service commitment. When using cross-border service, this field is required. True: represents signed.</p>
    */
    @SerializedName("CrossBorderPromiseFlag")
    @Expose
    private Boolean CrossBorderPromiseFlag;

    /**
    * <p>Tag information.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>Name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p> 
     * @return Name <p>Name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
     * @param Name <p>Name.</p><p>Parameter format: starting with a letter or Chinese characters, 2–128 characters in length, supporting letters, digits, Chinese characters, . - _</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Billing mode. PREPAID: prepaid mode, i.e., Monthly Subscription. POSTPAID: postpaid, i.e., pay-as-you-go. Default: POSTPAID. Currently, only pay-as-you-go is supported.</p> 
     * @return InstanceChargeType <p>Billing mode. PREPAID: prepaid mode, i.e., Monthly Subscription. POSTPAID: postpaid, i.e., pay-as-you-go. Default: POSTPAID. Currently, only pay-as-you-go is supported.</p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>Billing mode. PREPAID: prepaid mode, i.e., Monthly Subscription. POSTPAID: postpaid, i.e., pay-as-you-go. Default: POSTPAID. Currently, only pay-as-you-go is supported.</p>
     * @param InstanceChargeType <p>Billing mode. PREPAID: prepaid mode, i.e., Monthly Subscription. POSTPAID: postpaid, i.e., pay-as-you-go. Default: POSTPAID. Currently, only pay-as-you-go is supported.</p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>Description.</p><p>Parameter format: should not exceed 100 characters.</p> 
     * @return Description <p>Description.</p><p>Parameter format: should not exceed 100 characters.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p><p>Parameter format: should not exceed 100 characters.</p>
     * @param Description <p>Description.</p><p>Parameter format: should not exceed 100 characters.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Cross-border type; HighQuality: dedicated BGP-IP cross-border; Unicom: China Unicom Direct Connect cross-border.</p> 
     * @return CrossBorderType <p>Cross-border type; HighQuality: dedicated BGP-IP cross-border; Unicom: China Unicom Direct Connect cross-border.</p>
     */
    public String getCrossBorderType() {
        return this.CrossBorderType;
    }

    /**
     * Set <p>Cross-border type; HighQuality: dedicated BGP-IP cross-border; Unicom: China Unicom Direct Connect cross-border.</p>
     * @param CrossBorderType <p>Cross-border type; HighQuality: dedicated BGP-IP cross-border; Unicom: China Unicom Direct Connect cross-border.</p>
     */
    public void setCrossBorderType(String CrossBorderType) {
        this.CrossBorderType = CrossBorderType;
    }

    /**
     * Get <p>This Flag represents signing the cross-border service commitment. When using cross-border service, this field is required. True: represents signed.</p> 
     * @return CrossBorderPromiseFlag <p>This Flag represents signing the cross-border service commitment. When using cross-border service, this field is required. True: represents signed.</p>
     */
    public Boolean getCrossBorderPromiseFlag() {
        return this.CrossBorderPromiseFlag;
    }

    /**
     * Set <p>This Flag represents signing the cross-border service commitment. When using cross-border service, this field is required. True: represents signed.</p>
     * @param CrossBorderPromiseFlag <p>This Flag represents signing the cross-border service commitment. When using cross-border service, this field is required. True: represents signed.</p>
     */
    public void setCrossBorderPromiseFlag(Boolean CrossBorderPromiseFlag) {
        this.CrossBorderPromiseFlag = CrossBorderPromiseFlag;
    }

    /**
     * Get <p>Tag information.</p> 
     * @return Tags <p>Tag information.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag information.</p>
     * @param Tags <p>Tag information.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateGlobalAcceleratorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGlobalAcceleratorRequest(CreateGlobalAcceleratorRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CrossBorderType != null) {
            this.CrossBorderType = new String(source.CrossBorderType);
        }
        if (source.CrossBorderPromiseFlag != null) {
            this.CrossBorderPromiseFlag = new Boolean(source.CrossBorderPromiseFlag);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CrossBorderType", this.CrossBorderType);
        this.setParamSimple(map, prefix + "CrossBorderPromiseFlag", this.CrossBorderPromiseFlag);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

