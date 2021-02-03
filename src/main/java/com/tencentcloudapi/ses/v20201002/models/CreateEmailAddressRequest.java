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

public class CreateEmailAddressRequest extends AbstractModel{

    /**
    * Your sender address. (You can create up to 10 sender addresses for each domain.)
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
    * Sender name.
    */
    @SerializedName("EmailSenderName")
    @Expose
    private String EmailSenderName;

    /**
     * Get Your sender address. (You can create up to 10 sender addresses for each domain.) 
     * @return EmailAddress Your sender address. (You can create up to 10 sender addresses for each domain.)
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set Your sender address. (You can create up to 10 sender addresses for each domain.)
     * @param EmailAddress Your sender address. (You can create up to 10 sender addresses for each domain.)
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    /**
     * Get Sender name. 
     * @return EmailSenderName Sender name.
     */
    public String getEmailSenderName() {
        return this.EmailSenderName;
    }

    /**
     * Set Sender name.
     * @param EmailSenderName Sender name.
     */
    public void setEmailSenderName(String EmailSenderName) {
        this.EmailSenderName = EmailSenderName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);
        this.setParamSimple(map, prefix + "EmailSenderName", this.EmailSenderName);

    }
}

