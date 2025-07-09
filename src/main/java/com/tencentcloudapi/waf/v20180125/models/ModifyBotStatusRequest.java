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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBotStatusRequest extends AbstractModel {

    /**
    * Category
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Whether it is the bot 4.0 version
    */
    @SerializedName("IsVersionFour")
    @Expose
    private Boolean IsVersionFour;

    /**
    * Enter the bot version number, scenario-based version: 4.1.0
    */
    @SerializedName("BotVersion")
    @Expose
    private String BotVersion;

    /**
    * List of domain names on which bot detection is to be enabled or disabled in batch
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
     * Get Category 
     * @return Category Category
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Category
     * @param Category Category
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Instance ID 
     * @return InstanceID Instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID
     * @param InstanceID Instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Whether it is the bot 4.0 version 
     * @return IsVersionFour Whether it is the bot 4.0 version
     */
    public Boolean getIsVersionFour() {
        return this.IsVersionFour;
    }

    /**
     * Set Whether it is the bot 4.0 version
     * @param IsVersionFour Whether it is the bot 4.0 version
     */
    public void setIsVersionFour(Boolean IsVersionFour) {
        this.IsVersionFour = IsVersionFour;
    }

    /**
     * Get Enter the bot version number, scenario-based version: 4.1.0 
     * @return BotVersion Enter the bot version number, scenario-based version: 4.1.0
     */
    public String getBotVersion() {
        return this.BotVersion;
    }

    /**
     * Set Enter the bot version number, scenario-based version: 4.1.0
     * @param BotVersion Enter the bot version number, scenario-based version: 4.1.0
     */
    public void setBotVersion(String BotVersion) {
        this.BotVersion = BotVersion;
    }

    /**
     * Get List of domain names on which bot detection is to be enabled or disabled in batch 
     * @return DomainList List of domain names on which bot detection is to be enabled or disabled in batch
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set List of domain names on which bot detection is to be enabled or disabled in batch
     * @param DomainList List of domain names on which bot detection is to be enabled or disabled in batch
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    public ModifyBotStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBotStatusRequest(ModifyBotStatusRequest source) {
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.IsVersionFour != null) {
            this.IsVersionFour = new Boolean(source.IsVersionFour);
        }
        if (source.BotVersion != null) {
            this.BotVersion = new String(source.BotVersion);
        }
        if (source.DomainList != null) {
            this.DomainList = new String[source.DomainList.length];
            for (int i = 0; i < source.DomainList.length; i++) {
                this.DomainList[i] = new String(source.DomainList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "IsVersionFour", this.IsVersionFour);
        this.setParamSimple(map, prefix + "BotVersion", this.BotVersion);
        this.setParamArraySimple(map, prefix + "DomainList.", this.DomainList);

    }
}

