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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiSmsInfo extends AbstractModel {

    /**
    * Target mobile number in the E.164 standard in the format of +[country/region code][mobile number]. Up to 200 mobile numbers are supported in one request (which should be all global mobile numbers). For example, +60198890000, which has a + sign followed by 60 (country/region code) and then by 198890000 (mobile number).
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * Template ID, which can be viewed on the **Body Templates** page in [Global SMS](https://console.cloud.tencent.com/smsv2/isms-template). You must enter the ID of an approved template.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Template parameter. If there is no template parameter, leave this field empty.
<dx-alert infotype="notice" title="Note">The number of template parameters should be consistent with that of the template variables of `TemplateId`.</dx-alert>
    */
    @SerializedName("TemplateParamSet")
    @Expose
    private String [] TemplateParamSet;

    /**
    * Sender ID for Global SMS. For detail, please refer to the [Sender ID](https://www.tencentcloud.com/document/product/382/58270) Guidelines.
Note: This parameter applies solely to Global SMS. If you do not require a dedicated Sender ID, the public Sender ID will be used by default, and this parameter may be left blank.
Example: Qsms
    */
    @SerializedName("SenderId")
    @Expose
    private String SenderId;

    /**
    * User session content, which can carry context information such as user-side ID and will be returned as-is by the server. Note that the length must be less than 512 bytes.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
     * Get Target mobile number in the E.164 standard in the format of +[country/region code][mobile number]. Up to 200 mobile numbers are supported in one request (which should be all global mobile numbers). For example, +60198890000, which has a + sign followed by 60 (country/region code) and then by 198890000 (mobile number). 
     * @return PhoneNumber Target mobile number in the E.164 standard in the format of +[country/region code][mobile number]. Up to 200 mobile numbers are supported in one request (which should be all global mobile numbers). For example, +60198890000, which has a + sign followed by 60 (country/region code) and then by 198890000 (mobile number).
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set Target mobile number in the E.164 standard in the format of +[country/region code][mobile number]. Up to 200 mobile numbers are supported in one request (which should be all global mobile numbers). For example, +60198890000, which has a + sign followed by 60 (country/region code) and then by 198890000 (mobile number).
     * @param PhoneNumber Target mobile number in the E.164 standard in the format of +[country/region code][mobile number]. Up to 200 mobile numbers are supported in one request (which should be all global mobile numbers). For example, +60198890000, which has a + sign followed by 60 (country/region code) and then by 198890000 (mobile number).
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get Template ID, which can be viewed on the **Body Templates** page in [Global SMS](https://console.cloud.tencent.com/smsv2/isms-template). You must enter the ID of an approved template. 
     * @return TemplateId Template ID, which can be viewed on the **Body Templates** page in [Global SMS](https://console.cloud.tencent.com/smsv2/isms-template). You must enter the ID of an approved template.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID, which can be viewed on the **Body Templates** page in [Global SMS](https://console.cloud.tencent.com/smsv2/isms-template). You must enter the ID of an approved template.
     * @param TemplateId Template ID, which can be viewed on the **Body Templates** page in [Global SMS](https://console.cloud.tencent.com/smsv2/isms-template). You must enter the ID of an approved template.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
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
     * Get Sender ID for Global SMS. For detail, please refer to the [Sender ID](https://www.tencentcloud.com/document/product/382/58270) Guidelines.
Note: This parameter applies solely to Global SMS. If you do not require a dedicated Sender ID, the public Sender ID will be used by default, and this parameter may be left blank.
Example: Qsms 
     * @return SenderId Sender ID for Global SMS. For detail, please refer to the [Sender ID](https://www.tencentcloud.com/document/product/382/58270) Guidelines.
Note: This parameter applies solely to Global SMS. If you do not require a dedicated Sender ID, the public Sender ID will be used by default, and this parameter may be left blank.
Example: Qsms
     */
    public String getSenderId() {
        return this.SenderId;
    }

    /**
     * Set Sender ID for Global SMS. For detail, please refer to the [Sender ID](https://www.tencentcloud.com/document/product/382/58270) Guidelines.
Note: This parameter applies solely to Global SMS. If you do not require a dedicated Sender ID, the public Sender ID will be used by default, and this parameter may be left blank.
Example: Qsms
     * @param SenderId Sender ID for Global SMS. For detail, please refer to the [Sender ID](https://www.tencentcloud.com/document/product/382/58270) Guidelines.
Note: This parameter applies solely to Global SMS. If you do not require a dedicated Sender ID, the public Sender ID will be used by default, and this parameter may be left blank.
Example: Qsms
     */
    public void setSenderId(String SenderId) {
        this.SenderId = SenderId;
    }

    /**
     * Get User session content, which can carry context information such as user-side ID and will be returned as-is by the server. Note that the length must be less than 512 bytes. 
     * @return SessionContext User session content, which can carry context information such as user-side ID and will be returned as-is by the server. Note that the length must be less than 512 bytes.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set User session content, which can carry context information such as user-side ID and will be returned as-is by the server. Note that the length must be less than 512 bytes.
     * @param SessionContext User session content, which can carry context information such as user-side ID and will be returned as-is by the server. Note that the length must be less than 512 bytes.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    public MultiSmsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiSmsInfo(MultiSmsInfo source) {
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateParamSet != null) {
            this.TemplateParamSet = new String[source.TemplateParamSet.length];
            for (int i = 0; i < source.TemplateParamSet.length; i++) {
                this.TemplateParamSet[i] = new String(source.TemplateParamSet[i]);
            }
        }
        if (source.SenderId != null) {
            this.SenderId = new String(source.SenderId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArraySimple(map, prefix + "TemplateParamSet.", this.TemplateParamSet);
        this.setParamSimple(map, prefix + "SenderId", this.SenderId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

