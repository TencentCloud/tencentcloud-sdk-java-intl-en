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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddSmsTemplateRequest extends AbstractModel {

    /**
    * Template name.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Template content.
    */
    @SerializedName("TemplateContent")
    @Expose
    private String TemplateContent;

    /**
    * SMS type. 1: Marketing SMS, 2: Notification SMS, 3: OTP SMS.
Note: The "Regular SMS" type template currently still supports submission. However, in order to further improve the quality of SMS service and increase the approval rate of SMS templates, it is recommended to apply for a new template according to the "Notification SMS" type or the "OTP SMS" type. You can Refer to [Optimization of Tencent Cloud SMS Template Types](https://www.tencentcloud.com/document/product/382/60410).
    */
    @SerializedName("SmsType")
    @Expose
    private Long SmsType;

    /**
    * Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS.
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * Template remarks, such as reason for application and use case.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Template name. 
     * @return TemplateName Template name.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name.
     * @param TemplateName Template name.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Template content. 
     * @return TemplateContent Template content.
     */
    public String getTemplateContent() {
        return this.TemplateContent;
    }

    /**
     * Set Template content.
     * @param TemplateContent Template content.
     */
    public void setTemplateContent(String TemplateContent) {
        this.TemplateContent = TemplateContent;
    }

    /**
     * Get SMS type. 1: Marketing SMS, 2: Notification SMS, 3: OTP SMS.
Note: The "Regular SMS" type template currently still supports submission. However, in order to further improve the quality of SMS service and increase the approval rate of SMS templates, it is recommended to apply for a new template according to the "Notification SMS" type or the "OTP SMS" type. You can Refer to [Optimization of Tencent Cloud SMS Template Types](https://www.tencentcloud.com/document/product/382/60410). 
     * @return SmsType SMS type. 1: Marketing SMS, 2: Notification SMS, 3: OTP SMS.
Note: The "Regular SMS" type template currently still supports submission. However, in order to further improve the quality of SMS service and increase the approval rate of SMS templates, it is recommended to apply for a new template according to the "Notification SMS" type or the "OTP SMS" type. You can Refer to [Optimization of Tencent Cloud SMS Template Types](https://www.tencentcloud.com/document/product/382/60410).
     */
    public Long getSmsType() {
        return this.SmsType;
    }

    /**
     * Set SMS type. 1: Marketing SMS, 2: Notification SMS, 3: OTP SMS.
Note: The "Regular SMS" type template currently still supports submission. However, in order to further improve the quality of SMS service and increase the approval rate of SMS templates, it is recommended to apply for a new template according to the "Notification SMS" type or the "OTP SMS" type. You can Refer to [Optimization of Tencent Cloud SMS Template Types](https://www.tencentcloud.com/document/product/382/60410).
     * @param SmsType SMS type. 1: Marketing SMS, 2: Notification SMS, 3: OTP SMS.
Note: The "Regular SMS" type template currently still supports submission. However, in order to further improve the quality of SMS service and increase the approval rate of SMS templates, it is recommended to apply for a new template according to the "Notification SMS" type or the "OTP SMS" type. You can Refer to [Optimization of Tencent Cloud SMS Template Types](https://www.tencentcloud.com/document/product/382/60410).
     */
    public void setSmsType(Long SmsType) {
        this.SmsType = SmsType;
    }

    /**
     * Get Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS. 
     * @return International Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS.
     */
    public Long getInternational() {
        return this.International;
    }

    /**
     * Set Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS.
     * @param International Whether it is Global SMS:
0: Mainland China SMS.
1: Global SMS.
     */
    public void setInternational(Long International) {
        this.International = International;
    }

    /**
     * Get Template remarks, such as reason for application and use case. 
     * @return Remark Template remarks, such as reason for application and use case.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Template remarks, such as reason for application and use case.
     * @param Remark Template remarks, such as reason for application and use case.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public AddSmsTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddSmsTemplateRequest(AddSmsTemplateRequest source) {
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.TemplateContent != null) {
            this.TemplateContent = new String(source.TemplateContent);
        }
        if (source.SmsType != null) {
            this.SmsType = new Long(source.SmsType);
        }
        if (source.International != null) {
            this.International = new Long(source.International);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "TemplateContent", this.TemplateContent);
        this.setParamSimple(map, prefix + "SmsType", this.SmsType);
        this.setParamSimple(map, prefix + "International", this.International);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

