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

public class WebhookReceiver extends AbstractModel {

    /**
    * <p>Robot ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Bot name<br>Input limit: 1-20 characters in length</p>
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
    * <p>Webhook address, returned only if Type=WEBHOOK; otherwise empty</p>
    */
    @SerializedName("WebhookAddr")
    @Expose
    private String WebhookAddr;

    /**
    * <p>Function region. It is returned only when Type is SCF.</p>
    */
    @SerializedName("SCFRegion")
    @Expose
    private String SCFRegion;

    /**
    * <p>Function namespace, returned only when Type is SCF</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>SCF function name. It is returned only when Type is SCF.</p>
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * <p>Function version of the cloud function. It is returned only when Type is SCF.</p>
    */
    @SerializedName("FunctionVersion")
    @Expose
    private String FunctionVersion;

    /**
    * <p>SCF function alias, returned only when Type is SCF</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get <p>Robot ID</p> 
     * @return ID <p>Robot ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Robot ID</p>
     * @param ID <p>Robot ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Bot name<br>Input limit: 1-20 characters in length</p> 
     * @return Name <p>Bot name<br>Input limit: 1-20 characters in length</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Bot name<br>Input limit: 1-20 characters in length</p>
     * @param Name <p>Bot name<br>Input limit: 1-20 characters in length</p>
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
     * Get <p>Webhook address, returned only if Type=WEBHOOK; otherwise empty</p> 
     * @return WebhookAddr <p>Webhook address, returned only if Type=WEBHOOK; otherwise empty</p>
     */
    public String getWebhookAddr() {
        return this.WebhookAddr;
    }

    /**
     * Set <p>Webhook address, returned only if Type=WEBHOOK; otherwise empty</p>
     * @param WebhookAddr <p>Webhook address, returned only if Type=WEBHOOK; otherwise empty</p>
     */
    public void setWebhookAddr(String WebhookAddr) {
        this.WebhookAddr = WebhookAddr;
    }

    /**
     * Get <p>Function region. It is returned only when Type is SCF.</p> 
     * @return SCFRegion <p>Function region. It is returned only when Type is SCF.</p>
     */
    public String getSCFRegion() {
        return this.SCFRegion;
    }

    /**
     * Set <p>Function region. It is returned only when Type is SCF.</p>
     * @param SCFRegion <p>Function region. It is returned only when Type is SCF.</p>
     */
    public void setSCFRegion(String SCFRegion) {
        this.SCFRegion = SCFRegion;
    }

    /**
     * Get <p>Function namespace, returned only when Type is SCF</p> 
     * @return Namespace <p>Function namespace, returned only when Type is SCF</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>Function namespace, returned only when Type is SCF</p>
     * @param Namespace <p>Function namespace, returned only when Type is SCF</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>SCF function name. It is returned only when Type is SCF.</p> 
     * @return FunctionName <p>SCF function name. It is returned only when Type is SCF.</p>
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set <p>SCF function name. It is returned only when Type is SCF.</p>
     * @param FunctionName <p>SCF function name. It is returned only when Type is SCF.</p>
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get <p>Function version of the cloud function. It is returned only when Type is SCF.</p> 
     * @return FunctionVersion <p>Function version of the cloud function. It is returned only when Type is SCF.</p>
     */
    public String getFunctionVersion() {
        return this.FunctionVersion;
    }

    /**
     * Set <p>Function version of the cloud function. It is returned only when Type is SCF.</p>
     * @param FunctionVersion <p>Function version of the cloud function. It is returned only when Type is SCF.</p>
     */
    public void setFunctionVersion(String FunctionVersion) {
        this.FunctionVersion = FunctionVersion;
    }

    /**
     * Get <p>SCF function alias, returned only when Type is SCF</p> 
     * @return Alias <p>SCF function alias, returned only when Type is SCF</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>SCF function alias, returned only when Type is SCF</p>
     * @param Alias <p>SCF function alias, returned only when Type is SCF</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public WebhookReceiver() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebhookReceiver(WebhookReceiver source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "WebhookAddr", this.WebhookAddr);
        this.setParamSimple(map, prefix + "SCFRegion", this.SCFRegion);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "FunctionVersion", this.FunctionVersion);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}

