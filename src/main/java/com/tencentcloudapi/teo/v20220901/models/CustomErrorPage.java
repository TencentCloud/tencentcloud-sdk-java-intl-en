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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomErrorPage extends AbstractModel {

    /**
    * Custom error page ID.
    */
    @SerializedName("PageId")
    @Expose
    private String PageId;

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Custom error page name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Custom error page type.
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * Custom error page description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Custom error page content.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Custom error page reference.
    */
    @SerializedName("References")
    @Expose
    private ErrorPageReference [] References;

    /**
     * Get Custom error page ID. 
     * @return PageId Custom error page ID.
     */
    public String getPageId() {
        return this.PageId;
    }

    /**
     * Set Custom error page ID.
     * @param PageId Custom error page ID.
     */
    public void setPageId(String PageId) {
        this.PageId = PageId;
    }

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Custom error page name. 
     * @return Name Custom error page name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Custom error page name.
     * @param Name Custom error page name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Custom error page type. 
     * @return ContentType Custom error page type.
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set Custom error page type.
     * @param ContentType Custom error page type.
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get Custom error page description. 
     * @return Description Custom error page description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Custom error page description.
     * @param Description Custom error page description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Custom error page content. 
     * @return Content Custom error page content.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Custom error page content.
     * @param Content Custom error page content.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Custom error page reference. 
     * @return References Custom error page reference.
     */
    public ErrorPageReference [] getReferences() {
        return this.References;
    }

    /**
     * Set Custom error page reference.
     * @param References Custom error page reference.
     */
    public void setReferences(ErrorPageReference [] References) {
        this.References = References;
    }

    public CustomErrorPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomErrorPage(CustomErrorPage source) {
        if (source.PageId != null) {
            this.PageId = new String(source.PageId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.References != null) {
            this.References = new ErrorPageReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new ErrorPageReference(source.References[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "References.", this.References);

    }
}

