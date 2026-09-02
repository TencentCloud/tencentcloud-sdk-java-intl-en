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

public class ModifyWebhookReceiverRequest extends AbstractModel {

    /**
    * <p>Bot name<br>Input limits: 1-20 characters in length, tenant-unique</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Robot type<br>Enumeration values:<br>WEBHOOK: webhook type<br>SCF: function type</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Robot ID. More than 0 means modifying existing records; equal to 0 or not passed means adding new<br>Default value: 0</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Webhook address<br>Input parameter limit: required when Type=WEBHOOK, length 1-2048, must be a valid http(s) URL, and intranet addresses are not allowed</p>
    */
    @SerializedName("WebhookAddr")
    @Expose
    private String WebhookAddr;

    /**
    * <p>Function region, for example, ap-guangzhou<br>Input limit: required when Type is SCF</p>
    */
    @SerializedName("SCFRegion")
    @Expose
    private String SCFRegion;

    /**
    * <p>Function namespace<br>Input parameter limit: required when Type=SCF<br>Value for reference: obtain through the DescribeSCFNamespaceList API</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>SCF function name<br>Input parameter limit: required when Type=SCF<br>Parameter value reference: obtain through the DescribeSCFFunctionList API</p>
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * <p>Function version<br>Input parameter limit: required when Type is SCF, for example $LATEST<br>Parameter value for reference: obtain through the DescribeSCFFunctionVersionList API</p>
    */
    @SerializedName("FunctionVersion")
    @Expose
    private String FunctionVersion;

    /**
    * <p>Function alias<br>Input parameter limit: required when Type=SCF, for example, $DEFAULT<br>Parameter value for reference: obtain through the DescribeSCFAliasList API</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get <p>Bot name<br>Input limits: 1-20 characters in length, tenant-unique</p> 
     * @return Name <p>Bot name<br>Input limits: 1-20 characters in length, tenant-unique</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Bot name<br>Input limits: 1-20 characters in length, tenant-unique</p>
     * @param Name <p>Bot name<br>Input limits: 1-20 characters in length, tenant-unique</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Robot type<br>Enumeration values:<br>WEBHOOK: webhook type<br>SCF: function type</p> 
     * @return Type <p>Robot type<br>Enumeration values:<br>WEBHOOK: webhook type<br>SCF: function type</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Robot type<br>Enumeration values:<br>WEBHOOK: webhook type<br>SCF: function type</p>
     * @param Type <p>Robot type<br>Enumeration values:<br>WEBHOOK: webhook type<br>SCF: function type</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Robot ID. More than 0 means modifying existing records; equal to 0 or not passed means adding new<br>Default value: 0</p> 
     * @return ID <p>Robot ID. More than 0 means modifying existing records; equal to 0 or not passed means adding new<br>Default value: 0</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Robot ID. More than 0 means modifying existing records; equal to 0 or not passed means adding new<br>Default value: 0</p>
     * @param ID <p>Robot ID. More than 0 means modifying existing records; equal to 0 or not passed means adding new<br>Default value: 0</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Webhook address<br>Input parameter limit: required when Type=WEBHOOK, length 1-2048, must be a valid http(s) URL, and intranet addresses are not allowed</p> 
     * @return WebhookAddr <p>Webhook address<br>Input parameter limit: required when Type=WEBHOOK, length 1-2048, must be a valid http(s) URL, and intranet addresses are not allowed</p>
     */
    public String getWebhookAddr() {
        return this.WebhookAddr;
    }

    /**
     * Set <p>Webhook address<br>Input parameter limit: required when Type=WEBHOOK, length 1-2048, must be a valid http(s) URL, and intranet addresses are not allowed</p>
     * @param WebhookAddr <p>Webhook address<br>Input parameter limit: required when Type=WEBHOOK, length 1-2048, must be a valid http(s) URL, and intranet addresses are not allowed</p>
     */
    public void setWebhookAddr(String WebhookAddr) {
        this.WebhookAddr = WebhookAddr;
    }

    /**
     * Get <p>Function region, for example, ap-guangzhou<br>Input limit: required when Type is SCF</p> 
     * @return SCFRegion <p>Function region, for example, ap-guangzhou<br>Input limit: required when Type is SCF</p>
     */
    public String getSCFRegion() {
        return this.SCFRegion;
    }

    /**
     * Set <p>Function region, for example, ap-guangzhou<br>Input limit: required when Type is SCF</p>
     * @param SCFRegion <p>Function region, for example, ap-guangzhou<br>Input limit: required when Type is SCF</p>
     */
    public void setSCFRegion(String SCFRegion) {
        this.SCFRegion = SCFRegion;
    }

    /**
     * Get <p>Function namespace<br>Input parameter limit: required when Type=SCF<br>Value for reference: obtain through the DescribeSCFNamespaceList API</p> 
     * @return Namespace <p>Function namespace<br>Input parameter limit: required when Type=SCF<br>Value for reference: obtain through the DescribeSCFNamespaceList API</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>Function namespace<br>Input parameter limit: required when Type=SCF<br>Value for reference: obtain through the DescribeSCFNamespaceList API</p>
     * @param Namespace <p>Function namespace<br>Input parameter limit: required when Type=SCF<br>Value for reference: obtain through the DescribeSCFNamespaceList API</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>SCF function name<br>Input parameter limit: required when Type=SCF<br>Parameter value reference: obtain through the DescribeSCFFunctionList API</p> 
     * @return FunctionName <p>SCF function name<br>Input parameter limit: required when Type=SCF<br>Parameter value reference: obtain through the DescribeSCFFunctionList API</p>
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set <p>SCF function name<br>Input parameter limit: required when Type=SCF<br>Parameter value reference: obtain through the DescribeSCFFunctionList API</p>
     * @param FunctionName <p>SCF function name<br>Input parameter limit: required when Type=SCF<br>Parameter value reference: obtain through the DescribeSCFFunctionList API</p>
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get <p>Function version<br>Input parameter limit: required when Type is SCF, for example $LATEST<br>Parameter value for reference: obtain through the DescribeSCFFunctionVersionList API</p> 
     * @return FunctionVersion <p>Function version<br>Input parameter limit: required when Type is SCF, for example $LATEST<br>Parameter value for reference: obtain through the DescribeSCFFunctionVersionList API</p>
     */
    public String getFunctionVersion() {
        return this.FunctionVersion;
    }

    /**
     * Set <p>Function version<br>Input parameter limit: required when Type is SCF, for example $LATEST<br>Parameter value for reference: obtain through the DescribeSCFFunctionVersionList API</p>
     * @param FunctionVersion <p>Function version<br>Input parameter limit: required when Type is SCF, for example $LATEST<br>Parameter value for reference: obtain through the DescribeSCFFunctionVersionList API</p>
     */
    public void setFunctionVersion(String FunctionVersion) {
        this.FunctionVersion = FunctionVersion;
    }

    /**
     * Get <p>Function alias<br>Input parameter limit: required when Type=SCF, for example, $DEFAULT<br>Parameter value for reference: obtain through the DescribeSCFAliasList API</p> 
     * @return Alias <p>Function alias<br>Input parameter limit: required when Type=SCF, for example, $DEFAULT<br>Parameter value for reference: obtain through the DescribeSCFAliasList API</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>Function alias<br>Input parameter limit: required when Type=SCF, for example, $DEFAULT<br>Parameter value for reference: obtain through the DescribeSCFAliasList API</p>
     * @param Alias <p>Function alias<br>Input parameter limit: required when Type=SCF, for example, $DEFAULT<br>Parameter value for reference: obtain through the DescribeSCFAliasList API</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public ModifyWebhookReceiverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebhookReceiverRequest(ModifyWebhookReceiverRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.WebhookAddr != null) {
            this.WebhookAddr = new String(source.WebhookAddr);
        }
        if (source.SCFRegion != null) {
            this.SCFRegion = new String(source.SCFRegion);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.FunctionVersion != null) {
            this.FunctionVersion = new String(source.FunctionVersion);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "WebhookAddr", this.WebhookAddr);
        this.setParamSimple(map, prefix + "SCFRegion", this.SCFRegion);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "FunctionVersion", this.FunctionVersion);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}

