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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendSmsRequest extends AbstractModel{

    /**
    * Target mobile number in E.164 format (+[country/region code][subscriber number]). Up to 200 numbers, all of which should be either Chinese mainland numbers or international numbers, are supported in a single request.
Take the number +8613711112222 as an example. “86” is the country code (with a “+” sign in its front) and “13711112222” is the subscriber number.
Note: 11-digit Chinese mainland numbers prefixed by 0086 or 86 or those without any country/region code are also supported. The default prefix is +86.
    */
    @SerializedName("PhoneNumberSet")
    @Expose
    private String [] PhoneNumberSet;

    /**
    * The SMS `SdkAppId` generated after an application is added in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as 1400006666.
    */
    @SerializedName("SmsSdkAppId")
    @Expose
    private String SmsSdkAppId;

    /**
    * Template ID. You must enter the ID of an approved template, which can be viewed on the [Chinese Mainland SMS](https://console.cloud.tencent.com/smsv2/csms-template) or [Global SMS](https://console.cloud.tencent.com/smsv2/isms-template) body template management page. If you need to send SMS messages to global mobile numbers, you can only use a Global SMS template.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Content of the SMS signature, which should be encoded in UTF-8. You must enter an approved signature, such as Tencent Cloud. The signature information can be viewed on the [Chinese Mainland SMS](https://console.cloud.tencent.com/smsv2/csms-sign) or [Global SMS](https://console.cloud.tencent.com/smsv2/isms-sign) signature management page.
<dx-alert infotype="notice" title="Note">This parameter is required for Chinese Mainland SMS.</dx-alert>
    */
    @SerializedName("SignName")
    @Expose
    private String SignName;

    /**
    * Template parameter. If there is no template parameter, leave this field empty.
<dx-alert infotype="notice" title="Note">The number of template parameters should be consistent with that of the template variables of `TemplateId`.</dx-alert>
    */
    @SerializedName("TemplateParamSet")
    @Expose
    private String [] TemplateParamSet;

    /**
    * SMS code number extension, which is not activated by default. If you need to activate it, you can contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81).
    */
    @SerializedName("ExtendCode")
    @Expose
    private String ExtendCode;

    /**
    * User session content, which can carry context information such as user-side ID and will be returned as-is by the server.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * This parameter is not required for Chinese Mainland SMS. For Global SMS, if you have applied for a separate `SenderId`, this parameter is required. By default, the public `SenderId` is used, in which case you don't need to enter this parameter.
Note: if your monthly usage reaches the specified threshold, you can apply for an independent `SenderId`. For more information, contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81).
    */
    @SerializedName("SenderId")
    @Expose
    private String SenderId;

    /**
     * Get Target mobile number in E.164 format (+[country/region code][subscriber number]). Up to 200 numbers, all of which should be either Chinese mainland numbers or international numbers, are supported in a single request.
Take the number +8613711112222 as an example. “86” is the country code (with a “+” sign in its front) and “13711112222” is the subscriber number.
Note: 11-digit Chinese mainland numbers prefixed by 0086 or 86 or those without any country/region code are also supported. The default prefix is +86. 
     * @return PhoneNumberSet Target mobile number in E.164 format (+[country/region code][subscriber number]). Up to 200 numbers, all of which should be either Chinese mainland numbers or international numbers, are supported in a single request.
Take the number +8613711112222 as an example. “86” is the country code (with a “+” sign in its front) and “13711112222” is the subscriber number.
Note: 11-digit Chinese mainland numbers prefixed by 0086 or 86 or those without any country/region code are also supported. The default prefix is +86.
     */
    public String [] getPhoneNumberSet() {
        return this.PhoneNumberSet;
    }

    /**
     * Set Target mobile number in E.164 format (+[country/region code][subscriber number]). Up to 200 numbers, all of which should be either Chinese mainland numbers or international numbers, are supported in a single request.
Take the number +8613711112222 as an example. “86” is the country code (with a “+” sign in its front) and “13711112222” is the subscriber number.
Note: 11-digit Chinese mainland numbers prefixed by 0086 or 86 or those without any country/region code are also supported. The default prefix is +86.
     * @param PhoneNumberSet Target mobile number in E.164 format (+[country/region code][subscriber number]). Up to 200 numbers, all of which should be either Chinese mainland numbers or international numbers, are supported in a single request.
Take the number +8613711112222 as an example. “86” is the country code (with a “+” sign in its front) and “13711112222” is the subscriber number.
Note: 11-digit Chinese mainland numbers prefixed by 0086 or 86 or those without any country/region code are also supported. The default prefix is +86.
     */
    public void setPhoneNumberSet(String [] PhoneNumberSet) {
        this.PhoneNumberSet = PhoneNumberSet;
    }

    /**
     * Get The SMS `SdkAppId` generated after an application is added in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as 1400006666. 
     * @return SmsSdkAppId The SMS `SdkAppId` generated after an application is added in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as 1400006666.
     */
    public String getSmsSdkAppId() {
        return this.SmsSdkAppId;
    }

    /**
     * Set The SMS `SdkAppId` generated after an application is added in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as 1400006666.
     * @param SmsSdkAppId The SMS `SdkAppId` generated after an application is added in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as 1400006666.
     */
    public void setSmsSdkAppId(String SmsSdkAppId) {
        this.SmsSdkAppId = SmsSdkAppId;
    }

    /**
     * Get Template ID. You must enter the ID of an approved template, which can be viewed on the [Chinese Mainland SMS](https://console.cloud.tencent.com/smsv2/csms-template) or [Global SMS](https://console.cloud.tencent.com/smsv2/isms-template) body template management page. If you need to send SMS messages to global mobile numbers, you can only use a Global SMS template. 
     * @return TemplateId Template ID. You must enter the ID of an approved template, which can be viewed on the [Chinese Mainland SMS](https://console.cloud.tencent.com/smsv2/csms-template) or [Global SMS](https://console.cloud.tencent.com/smsv2/isms-template) body template management page. If you need to send SMS messages to global mobile numbers, you can only use a Global SMS template.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID. You must enter the ID of an approved template, which can be viewed on the [Chinese Mainland SMS](https://console.cloud.tencent.com/smsv2/csms-template) or [Global SMS](https://console.cloud.tencent.com/smsv2/isms-template) body template management page. If you need to send SMS messages to global mobile numbers, you can only use a Global SMS template.
     * @param TemplateId Template ID. You must enter the ID of an approved template, which can be viewed on the [Chinese Mainland SMS](https://console.cloud.tencent.com/smsv2/csms-template) or [Global SMS](https://console.cloud.tencent.com/smsv2/isms-template) body template management page. If you need to send SMS messages to global mobile numbers, you can only use a Global SMS template.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Content of the SMS signature, which should be encoded in UTF-8. You must enter an approved signature, such as Tencent Cloud. The signature information can be viewed on the [Chinese Mainland SMS](https://console.cloud.tencent.com/smsv2/csms-sign) or [Global SMS](https://console.cloud.tencent.com/smsv2/isms-sign) signature management page.
<dx-alert infotype="notice" title="Note">This parameter is required for Chinese Mainland SMS.</dx-alert> 
     * @return SignName Content of the SMS signature, which should be encoded in UTF-8. You must enter an approved signature, such as Tencent Cloud. The signature information can be viewed on the [Chinese Mainland SMS](https://console.cloud.tencent.com/smsv2/csms-sign) or [Global SMS](https://console.cloud.tencent.com/smsv2/isms-sign) signature management page.
<dx-alert infotype="notice" title="Note">This parameter is required for Chinese Mainland SMS.</dx-alert>
     */
    public String getSignName() {
        return this.SignName;
    }

    /**
     * Set Content of the SMS signature, which should be encoded in UTF-8. You must enter an approved signature, such as Tencent Cloud. The signature information can be viewed on the [Chinese Mainland SMS](https://console.cloud.tencent.com/smsv2/csms-sign) or [Global SMS](https://console.cloud.tencent.com/smsv2/isms-sign) signature management page.
<dx-alert infotype="notice" title="Note">This parameter is required for Chinese Mainland SMS.</dx-alert>
     * @param SignName Content of the SMS signature, which should be encoded in UTF-8. You must enter an approved signature, such as Tencent Cloud. The signature information can be viewed on the [Chinese Mainland SMS](https://console.cloud.tencent.com/smsv2/csms-sign) or [Global SMS](https://console.cloud.tencent.com/smsv2/isms-sign) signature management page.
<dx-alert infotype="notice" title="Note">This parameter is required for Chinese Mainland SMS.</dx-alert>
     */
    public void setSignName(String SignName) {
        this.SignName = SignName;
    }

    /**
     * Get Template parameter. If there is no template parameter, leave this field empty.
<dx-alert infotype="notice" title="Note">The number of template parameters should be consistent with that of the template variables of `TemplateId`.</dx-alert> 
     * @return TemplateParamSet Template parameter. If there is no template parameter, leave this field empty.
<dx-alert infotype="notice" title="Note">The number of template parameters should be consistent with that of the template variables of `TemplateId`.</dx-alert>
     */
    public String [] getTemplateParamSet() {
        return this.TemplateParamSet;
    }

    /**
     * Set Template parameter. If there is no template parameter, leave this field empty.
<dx-alert infotype="notice" title="Note">The number of template parameters should be consistent with that of the template variables of `TemplateId`.</dx-alert>
     * @param TemplateParamSet Template parameter. If there is no template parameter, leave this field empty.
<dx-alert infotype="notice" title="Note">The number of template parameters should be consistent with that of the template variables of `TemplateId`.</dx-alert>
     */
    public void setTemplateParamSet(String [] TemplateParamSet) {
        this.TemplateParamSet = TemplateParamSet;
    }

    /**
     * Get SMS code number extension, which is not activated by default. If you need to activate it, you can contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81). 
     * @return ExtendCode SMS code number extension, which is not activated by default. If you need to activate it, you can contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81).
     */
    public String getExtendCode() {
        return this.ExtendCode;
    }

    /**
     * Set SMS code number extension, which is not activated by default. If you need to activate it, you can contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81).
     * @param ExtendCode SMS code number extension, which is not activated by default. If you need to activate it, you can contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81).
     */
    public void setExtendCode(String ExtendCode) {
        this.ExtendCode = ExtendCode;
    }

    /**
     * Get User session content, which can carry context information such as user-side ID and will be returned as-is by the server. 
     * @return SessionContext User session content, which can carry context information such as user-side ID and will be returned as-is by the server.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set User session content, which can carry context information such as user-side ID and will be returned as-is by the server.
     * @param SessionContext User session content, which can carry context information such as user-side ID and will be returned as-is by the server.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get This parameter is not required for Chinese Mainland SMS. For Global SMS, if you have applied for a separate `SenderId`, this parameter is required. By default, the public `SenderId` is used, in which case you don't need to enter this parameter.
Note: if your monthly usage reaches the specified threshold, you can apply for an independent `SenderId`. For more information, contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81). 
     * @return SenderId This parameter is not required for Chinese Mainland SMS. For Global SMS, if you have applied for a separate `SenderId`, this parameter is required. By default, the public `SenderId` is used, in which case you don't need to enter this parameter.
Note: if your monthly usage reaches the specified threshold, you can apply for an independent `SenderId`. For more information, contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81).
     */
    public String getSenderId() {
        return this.SenderId;
    }

    /**
     * Set This parameter is not required for Chinese Mainland SMS. For Global SMS, if you have applied for a separate `SenderId`, this parameter is required. By default, the public `SenderId` is used, in which case you don't need to enter this parameter.
Note: if your monthly usage reaches the specified threshold, you can apply for an independent `SenderId`. For more information, contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81).
     * @param SenderId This parameter is not required for Chinese Mainland SMS. For Global SMS, if you have applied for a separate `SenderId`, this parameter is required. By default, the public `SenderId` is used, in which case you don't need to enter this parameter.
Note: if your monthly usage reaches the specified threshold, you can apply for an independent `SenderId`. For more information, contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81).
     */
    public void setSenderId(String SenderId) {
        this.SenderId = SenderId;
    }

    public SendSmsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendSmsRequest(SendSmsRequest source) {
        if (source.PhoneNumberSet != null) {
            this.PhoneNumberSet = new String[source.PhoneNumberSet.length];
            for (int i = 0; i < source.PhoneNumberSet.length; i++) {
                this.PhoneNumberSet[i] = new String(source.PhoneNumberSet[i]);
            }
        }
        if (source.SmsSdkAppId != null) {
            this.SmsSdkAppId = new String(source.SmsSdkAppId);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.SignName != null) {
            this.SignName = new String(source.SignName);
        }
        if (source.TemplateParamSet != null) {
            this.TemplateParamSet = new String[source.TemplateParamSet.length];
            for (int i = 0; i < source.TemplateParamSet.length; i++) {
                this.TemplateParamSet[i] = new String(source.TemplateParamSet[i]);
            }
        }
        if (source.ExtendCode != null) {
            this.ExtendCode = new String(source.ExtendCode);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SenderId != null) {
            this.SenderId = new String(source.SenderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PhoneNumberSet.", this.PhoneNumberSet);
        this.setParamSimple(map, prefix + "SmsSdkAppId", this.SmsSdkAppId);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "SignName", this.SignName);
        this.setParamArraySimple(map, prefix + "TemplateParamSet.", this.TemplateParamSet);
        this.setParamSimple(map, prefix + "ExtendCode", this.ExtendCode);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SenderId", this.SenderId);

    }
}

