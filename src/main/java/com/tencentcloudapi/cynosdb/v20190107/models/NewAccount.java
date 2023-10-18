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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NewAccount extends AbstractModel {

    /**
    * Account name, which can contain 1-16 letters, digits, and underscores. It must begin with a letter and end with a letter or digit.
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * Password, which can contain 8-64 characters.
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * Host
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Maximum number of user connections, which cannot be above 10,240.
    */
    @SerializedName("MaxUserConnections")
    @Expose
    private Long MaxUserConnections;

    /**
     * Get Account name, which can contain 1-16 letters, digits, and underscores. It must begin with a letter and end with a letter or digit. 
     * @return AccountName Account name, which can contain 1-16 letters, digits, and underscores. It must begin with a letter and end with a letter or digit.
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Account name, which can contain 1-16 letters, digits, and underscores. It must begin with a letter and end with a letter or digit.
     * @param AccountName Account name, which can contain 1-16 letters, digits, and underscores. It must begin with a letter and end with a letter or digit.
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get Password, which can contain 8-64 characters. 
     * @return AccountPassword Password, which can contain 8-64 characters.
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * Set Password, which can contain 8-64 characters.
     * @param AccountPassword Password, which can contain 8-64 characters.
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * Get Host 
     * @return Host Host
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host
     * @param Host Host
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Maximum number of user connections, which cannot be above 10,240. 
     * @return MaxUserConnections Maximum number of user connections, which cannot be above 10,240.
     */
    public Long getMaxUserConnections() {
        return this.MaxUserConnections;
    }

    /**
     * Set Maximum number of user connections, which cannot be above 10,240.
     * @param MaxUserConnections Maximum number of user connections, which cannot be above 10,240.
     */
    public void setMaxUserConnections(Long MaxUserConnections) {
        this.MaxUserConnections = MaxUserConnections;
    }

    public NewAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NewAccount(NewAccount source) {
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.AccountPassword != null) {
            this.AccountPassword = new String(source.AccountPassword);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.MaxUserConnections != null) {
            this.MaxUserConnections = new Long(source.MaxUserConnections);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AccountPassword", this.AccountPassword);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MaxUserConnections", this.MaxUserConnections);

    }
}

