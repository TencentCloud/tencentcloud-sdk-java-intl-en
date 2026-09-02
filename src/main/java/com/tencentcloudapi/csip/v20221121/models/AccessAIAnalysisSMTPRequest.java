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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessAIAnalysisSMTPRequest extends AbstractModel {

    /**
    * <p>Email address</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>Mailbox type</p><p>Enumeration values:</p><ul><li>1: QQ Mail</li><li>2: GMail</li><li>3: OutLook</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Mailbox authorization code</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get <p>Email address</p> 
     * @return AccountName <p>Email address</p>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>Email address</p>
     * @param AccountName <p>Email address</p>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>Mailbox type</p><p>Enumeration values:</p><ul><li>1: QQ Mail</li><li>2: GMail</li><li>3: OutLook</li></ul> 
     * @return Type <p>Mailbox type</p><p>Enumeration values:</p><ul><li>1: QQ Mail</li><li>2: GMail</li><li>3: OutLook</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Mailbox type</p><p>Enumeration values:</p><ul><li>1: QQ Mail</li><li>2: GMail</li><li>3: OutLook</li></ul>
     * @param Type <p>Mailbox type</p><p>Enumeration values:</p><ul><li>1: QQ Mail</li><li>2: GMail</li><li>3: OutLook</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Mailbox authorization code</p> 
     * @return Password <p>Mailbox authorization code</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Mailbox authorization code</p>
     * @param Password <p>Mailbox authorization code</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public AccessAIAnalysisSMTPRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessAIAnalysisSMTPRequest(AccessAIAnalysisSMTPRequest source) {
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

