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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PluginProfile extends AbstractModel {

    /**
    * Plug-in author
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * Plugin description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Plug-in icon url
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * Plugin name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Plug-in product type</p><p>Enumeration values:</p><ul><li>0: ordinary plug-in</li><li>1: connector plug-in</li></ul>
    */
    @SerializedName("PluginClass")
    @Expose
    private Long PluginClass;

    /**
    * <p>Plugin type</p><p>Enumeration values:</p><ul><li>0: API</li><li>1: Code</li><li>2: MCP</li><li>3: Application</li></ul>
    */
    @SerializedName("PluginKind")
    @Expose
    private Long PluginKind;

    /**
    * <p>Plug-in source</p><p>Enumeration values:</p><ul><li>0: custom plugin</li><li>1: official plug-in</li><li>2: third-party plugin</li></ul>
    */
    @SerializedName("PluginSource")
    @Expose
    private Long PluginSource;

    /**
     * Get Plug-in author 
     * @return Author Plug-in author
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set Plug-in author
     * @param Author Plug-in author
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * Get Plugin description 
     * @return Description Plugin description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Plugin description
     * @param Description Plugin description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Plug-in icon url 
     * @return IconUrl Plug-in icon url
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set Plug-in icon url
     * @param IconUrl Plug-in icon url
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get Plugin name 
     * @return Name Plugin name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Plugin name
     * @param Name Plugin name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Plug-in product type</p><p>Enumeration values:</p><ul><li>0: ordinary plug-in</li><li>1: connector plug-in</li></ul> 
     * @return PluginClass <p>Plug-in product type</p><p>Enumeration values:</p><ul><li>0: ordinary plug-in</li><li>1: connector plug-in</li></ul>
     */
    public Long getPluginClass() {
        return this.PluginClass;
    }

    /**
     * Set <p>Plug-in product type</p><p>Enumeration values:</p><ul><li>0: ordinary plug-in</li><li>1: connector plug-in</li></ul>
     * @param PluginClass <p>Plug-in product type</p><p>Enumeration values:</p><ul><li>0: ordinary plug-in</li><li>1: connector plug-in</li></ul>
     */
    public void setPluginClass(Long PluginClass) {
        this.PluginClass = PluginClass;
    }

    /**
     * Get <p>Plugin type</p><p>Enumeration values:</p><ul><li>0: API</li><li>1: Code</li><li>2: MCP</li><li>3: Application</li></ul> 
     * @return PluginKind <p>Plugin type</p><p>Enumeration values:</p><ul><li>0: API</li><li>1: Code</li><li>2: MCP</li><li>3: Application</li></ul>
     */
    public Long getPluginKind() {
        return this.PluginKind;
    }

    /**
     * Set <p>Plugin type</p><p>Enumeration values:</p><ul><li>0: API</li><li>1: Code</li><li>2: MCP</li><li>3: Application</li></ul>
     * @param PluginKind <p>Plugin type</p><p>Enumeration values:</p><ul><li>0: API</li><li>1: Code</li><li>2: MCP</li><li>3: Application</li></ul>
     */
    public void setPluginKind(Long PluginKind) {
        this.PluginKind = PluginKind;
    }

    /**
     * Get <p>Plug-in source</p><p>Enumeration values:</p><ul><li>0: custom plugin</li><li>1: official plug-in</li><li>2: third-party plugin</li></ul> 
     * @return PluginSource <p>Plug-in source</p><p>Enumeration values:</p><ul><li>0: custom plugin</li><li>1: official plug-in</li><li>2: third-party plugin</li></ul>
     */
    public Long getPluginSource() {
        return this.PluginSource;
    }

    /**
     * Set <p>Plug-in source</p><p>Enumeration values:</p><ul><li>0: custom plugin</li><li>1: official plug-in</li><li>2: third-party plugin</li></ul>
     * @param PluginSource <p>Plug-in source</p><p>Enumeration values:</p><ul><li>0: custom plugin</li><li>1: official plug-in</li><li>2: third-party plugin</li></ul>
     */
    public void setPluginSource(Long PluginSource) {
        this.PluginSource = PluginSource;
    }

    public PluginProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginProfile(PluginProfile source) {
        if (source.Author != null) {
            this.Author = new String(source.Author);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PluginClass != null) {
            this.PluginClass = new Long(source.PluginClass);
        }
        if (source.PluginKind != null) {
            this.PluginKind = new Long(source.PluginKind);
        }
        if (source.PluginSource != null) {
            this.PluginSource = new Long(source.PluginSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Author", this.Author);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PluginClass", this.PluginClass);
        this.setParamSimple(map, prefix + "PluginKind", this.PluginKind);
        this.setParamSimple(map, prefix + "PluginSource", this.PluginSource);

    }
}

