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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountDescriptionRequest extends AbstractModel {

    /**
    * Database account name
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * Database account description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Host. Default value: `%`
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get Database account name 
     * @return AccountName Database account name
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set Database account name
     * @param AccountName Database account name
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get Database account description 
     * @return Description Database account description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Database account description
     * @param Description Database account description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Host. Default value: `%` 
     * @return Host Host. Default value: `%`
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host. Default value: `%`
     * @param Host Host. Default value: `%`
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public ModifyAccountDescriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountDescriptionRequest(ModifyAccountDescriptionRequest source) {
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

