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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateEmailSmtpPassWordRequest extends AbstractModel{

    /**
    * SMTP password. Length limit: 64.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Email address. Length limit: 128.
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
     * Get SMTP password. Length limit: 64. 
     * @return Password SMTP password. Length limit: 64.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set SMTP password. Length limit: 64.
     * @param Password SMTP password. Length limit: 64.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Email address. Length limit: 128. 
     * @return EmailAddress Email address. Length limit: 128.
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set Email address. Length limit: 128.
     * @param EmailAddress Email address. Length limit: 128.
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public UpdateEmailSmtpPassWordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateEmailSmtpPassWordRequest(UpdateEmailSmtpPassWordRequest source) {
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.EmailAddress != null) {
            this.EmailAddress = new String(source.EmailAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);

    }
}

