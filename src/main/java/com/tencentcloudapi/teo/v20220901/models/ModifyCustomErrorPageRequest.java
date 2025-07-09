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

public class ModifyCustomErrorPageRequest extends AbstractModel {

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
    * Custom error page name. The name must be 2-60 characters long.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Custom error page description, not exceeding 60 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Custom error page type, with values:<li>text/html. </li><li>application/json.</li><li>plain/text.</li><li>text/xml.</li>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * Custom error page content, not exceeding 2 KB.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

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
     * Get Custom error page name. The name must be 2-60 characters long. 
     * @return Name Custom error page name. The name must be 2-60 characters long.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Custom error page name. The name must be 2-60 characters long.
     * @param Name Custom error page name. The name must be 2-60 characters long.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Custom error page description, not exceeding 60 characters. 
     * @return Description Custom error page description, not exceeding 60 characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Custom error page description, not exceeding 60 characters.
     * @param Description Custom error page description, not exceeding 60 characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Custom error page type, with values:<li>text/html. </li><li>application/json.</li><li>plain/text.</li><li>text/xml.</li> 
     * @return ContentType Custom error page type, with values:<li>text/html. </li><li>application/json.</li><li>plain/text.</li><li>text/xml.</li>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set Custom error page type, with values:<li>text/html. </li><li>application/json.</li><li>plain/text.</li><li>text/xml.</li>
     * @param ContentType Custom error page type, with values:<li>text/html. </li><li>application/json.</li><li>plain/text.</li><li>text/xml.</li>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get Custom error page content, not exceeding 2 KB. 
     * @return Content Custom error page content, not exceeding 2 KB.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Custom error page content, not exceeding 2 KB.
     * @param Content Custom error page content, not exceeding 2 KB.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public ModifyCustomErrorPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCustomErrorPageRequest(ModifyCustomErrorPageRequest source) {
        if (source.PageId != null) {
            this.PageId = new String(source.PageId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

