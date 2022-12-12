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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSecurityDropPageRequest extends AbstractModel{

    /**
    * The site ID. You must specify either "ZoneId+Entity" or "TemplateId".
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The subdomain name/L4 proxy. You must specify either "ZoneId+Entity" or "TemplateId".
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * Name of the block page file.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The block page content, which is passed after being URL-encoded.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * How to build the block page. Values:
<li>`file`: Upload a file to be URL-encoded.</li>
<li>`url`: Upload a URL to be URL-encoded.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The module that applies on the block page. Values:
<li>`waf`: Managed rules</li>
<li>`rate`: Custom rules</li>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * The template ID. You must specify either this field or "ZoneId+Entity".
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get The site ID. You must specify either "ZoneId+Entity" or "TemplateId". 
     * @return ZoneId The site ID. You must specify either "ZoneId+Entity" or "TemplateId".
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID. You must specify either "ZoneId+Entity" or "TemplateId".
     * @param ZoneId The site ID. You must specify either "ZoneId+Entity" or "TemplateId".
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The subdomain name/L4 proxy. You must specify either "ZoneId+Entity" or "TemplateId". 
     * @return Entity The subdomain name/L4 proxy. You must specify either "ZoneId+Entity" or "TemplateId".
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set The subdomain name/L4 proxy. You must specify either "ZoneId+Entity" or "TemplateId".
     * @param Entity The subdomain name/L4 proxy. You must specify either "ZoneId+Entity" or "TemplateId".
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get Name of the block page file. 
     * @return Name Name of the block page file.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the block page file.
     * @param Name Name of the block page file.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The block page content, which is passed after being URL-encoded. 
     * @return Content The block page content, which is passed after being URL-encoded.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set The block page content, which is passed after being URL-encoded.
     * @param Content The block page content, which is passed after being URL-encoded.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get How to build the block page. Values:
<li>`file`: Upload a file to be URL-encoded.</li>
<li>`url`: Upload a URL to be URL-encoded.</li> 
     * @return Type How to build the block page. Values:
<li>`file`: Upload a file to be URL-encoded.</li>
<li>`url`: Upload a URL to be URL-encoded.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set How to build the block page. Values:
<li>`file`: Upload a file to be URL-encoded.</li>
<li>`url`: Upload a URL to be URL-encoded.</li>
     * @param Type How to build the block page. Values:
<li>`file`: Upload a file to be URL-encoded.</li>
<li>`url`: Upload a URL to be URL-encoded.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The module that applies on the block page. Values:
<li>`waf`: Managed rules</li>
<li>`rate`: Custom rules</li> 
     * @return Module The module that applies on the block page. Values:
<li>`waf`: Managed rules</li>
<li>`rate`: Custom rules</li>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set The module that applies on the block page. Values:
<li>`waf`: Managed rules</li>
<li>`rate`: Custom rules</li>
     * @param Module The module that applies on the block page. Values:
<li>`waf`: Managed rules</li>
<li>`rate`: Custom rules</li>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get The template ID. You must specify either this field or "ZoneId+Entity". 
     * @return TemplateId The template ID. You must specify either this field or "ZoneId+Entity".
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set The template ID. You must specify either this field or "ZoneId+Entity".
     * @param TemplateId The template ID. You must specify either this field or "ZoneId+Entity".
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public CreateSecurityDropPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecurityDropPageRequest(CreateSecurityDropPageRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

