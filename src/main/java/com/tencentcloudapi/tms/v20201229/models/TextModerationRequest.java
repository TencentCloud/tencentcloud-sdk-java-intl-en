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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextModerationRequest extends AbstractModel {

    /**
    * This field indicates the text content of the object to be moderated. The text needs to be encoded in utf-8 format and encrypted with Base64. It can contain up to 10,000 characters, calculated by unicode encoding.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * This field indicates the specific policy number, which is used for the API call and can be configured in the CMS console. If it's not entered (left empty), the default moderation policy is adopted. If it's entered, the moderation policies are specified for business scenarios. <br>Note: Biztype contains 3 to 32 characters, including numbers, letters and underscores only. Different Biztypes are associated with different business scenarios and moderation policies. Ensure that you use the Biztype corresponding to the policy you want to apply.
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * This field indicates the data ID you assigned to the object to be moderated, which is convenient for you to identify and manage the file. <br>Value: this field can contain **up to 64 characters**, including uppercase and lowercase letters, numbers and four special symbols (_, -, @, #)
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * This field indicates the user information related with the object to be moderated, which can be used to identify violating users at risk.
    */
    @SerializedName("User")
    @Expose
    private User User;

    /**
    * This field indicates the device information related with the object to be moderated, which can be used to identify violating devices at risk.
    */
    @SerializedName("Device")
    @Expose
    private Device Device;

    /**
     * Get This field indicates the text content of the object to be moderated. The text needs to be encoded in utf-8 format and encrypted with Base64. It can contain up to 10,000 characters, calculated by unicode encoding. 
     * @return Content This field indicates the text content of the object to be moderated. The text needs to be encoded in utf-8 format and encrypted with Base64. It can contain up to 10,000 characters, calculated by unicode encoding.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set This field indicates the text content of the object to be moderated. The text needs to be encoded in utf-8 format and encrypted with Base64. It can contain up to 10,000 characters, calculated by unicode encoding.
     * @param Content This field indicates the text content of the object to be moderated. The text needs to be encoded in utf-8 format and encrypted with Base64. It can contain up to 10,000 characters, calculated by unicode encoding.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get This field indicates the specific policy number, which is used for the API call and can be configured in the CMS console. If it's not entered (left empty), the default moderation policy is adopted. If it's entered, the moderation policies are specified for business scenarios. <br>Note: Biztype contains 3 to 32 characters, including numbers, letters and underscores only. Different Biztypes are associated with different business scenarios and moderation policies. Ensure that you use the Biztype corresponding to the policy you want to apply. 
     * @return BizType This field indicates the specific policy number, which is used for the API call and can be configured in the CMS console. If it's not entered (left empty), the default moderation policy is adopted. If it's entered, the moderation policies are specified for business scenarios. <br>Note: Biztype contains 3 to 32 characters, including numbers, letters and underscores only. Different Biztypes are associated with different business scenarios and moderation policies. Ensure that you use the Biztype corresponding to the policy you want to apply.
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set This field indicates the specific policy number, which is used for the API call and can be configured in the CMS console. If it's not entered (left empty), the default moderation policy is adopted. If it's entered, the moderation policies are specified for business scenarios. <br>Note: Biztype contains 3 to 32 characters, including numbers, letters and underscores only. Different Biztypes are associated with different business scenarios and moderation policies. Ensure that you use the Biztype corresponding to the policy you want to apply.
     * @param BizType This field indicates the specific policy number, which is used for the API call and can be configured in the CMS console. If it's not entered (left empty), the default moderation policy is adopted. If it's entered, the moderation policies are specified for business scenarios. <br>Note: Biztype contains 3 to 32 characters, including numbers, letters and underscores only. Different Biztypes are associated with different business scenarios and moderation policies. Ensure that you use the Biztype corresponding to the policy you want to apply.
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get This field indicates the data ID you assigned to the object to be moderated, which is convenient for you to identify and manage the file. <br>Value: this field can contain **up to 64 characters**, including uppercase and lowercase letters, numbers and four special symbols (_, -, @, #) 
     * @return DataId This field indicates the data ID you assigned to the object to be moderated, which is convenient for you to identify and manage the file. <br>Value: this field can contain **up to 64 characters**, including uppercase and lowercase letters, numbers and four special symbols (_, -, @, #)
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set This field indicates the data ID you assigned to the object to be moderated, which is convenient for you to identify and manage the file. <br>Value: this field can contain **up to 64 characters**, including uppercase and lowercase letters, numbers and four special symbols (_, -, @, #)
     * @param DataId This field indicates the data ID you assigned to the object to be moderated, which is convenient for you to identify and manage the file. <br>Value: this field can contain **up to 64 characters**, including uppercase and lowercase letters, numbers and four special symbols (_, -, @, #)
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get This field indicates the user information related with the object to be moderated, which can be used to identify violating users at risk. 
     * @return User This field indicates the user information related with the object to be moderated, which can be used to identify violating users at risk.
     */
    public User getUser() {
        return this.User;
    }

    /**
     * Set This field indicates the user information related with the object to be moderated, which can be used to identify violating users at risk.
     * @param User This field indicates the user information related with the object to be moderated, which can be used to identify violating users at risk.
     */
    public void setUser(User User) {
        this.User = User;
    }

    /**
     * Get This field indicates the device information related with the object to be moderated, which can be used to identify violating devices at risk. 
     * @return Device This field indicates the device information related with the object to be moderated, which can be used to identify violating devices at risk.
     */
    public Device getDevice() {
        return this.Device;
    }

    /**
     * Set This field indicates the device information related with the object to be moderated, which can be used to identify violating devices at risk.
     * @param Device This field indicates the device information related with the object to be moderated, which can be used to identify violating devices at risk.
     */
    public void setDevice(Device Device) {
        this.Device = Device;
    }

    public TextModerationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextModerationRequest(TextModerationRequest source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.User != null) {
            this.User = new User(source.User);
        }
        if (source.Device != null) {
            this.Device = new Device(source.Device);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamObj(map, prefix + "User.", this.User);
        this.setParamObj(map, prefix + "Device.", this.Device);

    }
}

