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

public class CreateCustomizeErrorPageRequest extends AbstractModel {

    /**
    * <p>Zone ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>Custom response page name, which must contain 2-30 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Custom response page type, with values:</p><ul><li>text/html</li><li>application/json</li><li>plain/text</li><li>text/xml</li><li>text/css</li><li>text/javascript</li><li>application/javascript</li><li>text/markdown</li></ul>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>Custom response page description, no more than 60 characters.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Custom response page content, no more than 16KB.</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get <p>Zone ID.</p> 
     * @return ZoneId <p>Zone ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Zone ID.</p>
     * @param ZoneId <p>Zone ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>Custom response page name, which must contain 2-30 characters.</p> 
     * @return Name <p>Custom response page name, which must contain 2-30 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Custom response page name, which must contain 2-30 characters.</p>
     * @param Name <p>Custom response page name, which must contain 2-30 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Custom response page type, with values:</p><ul><li>text/html</li><li>application/json</li><li>plain/text</li><li>text/xml</li><li>text/css</li><li>text/javascript</li><li>application/javascript</li><li>text/markdown</li></ul> 
     * @return ContentType <p>Custom response page type, with values:</p><ul><li>text/html</li><li>application/json</li><li>plain/text</li><li>text/xml</li><li>text/css</li><li>text/javascript</li><li>application/javascript</li><li>text/markdown</li></ul>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>Custom response page type, with values:</p><ul><li>text/html</li><li>application/json</li><li>plain/text</li><li>text/xml</li><li>text/css</li><li>text/javascript</li><li>application/javascript</li><li>text/markdown</li></ul>
     * @param ContentType <p>Custom response page type, with values:</p><ul><li>text/html</li><li>application/json</li><li>plain/text</li><li>text/xml</li><li>text/css</li><li>text/javascript</li><li>application/javascript</li><li>text/markdown</li></ul>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>Custom response page description, no more than 60 characters.</p> 
     * @return Description <p>Custom response page description, no more than 60 characters.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Custom response page description, no more than 60 characters.</p>
     * @param Description <p>Custom response page description, no more than 60 characters.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Custom response page content, no more than 16KB.</p> 
     * @return Content <p>Custom response page content, no more than 16KB.</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>Custom response page content, no more than 16KB.</p>
     * @param Content <p>Custom response page content, no more than 16KB.</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public CreateCustomizeErrorPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomizeErrorPageRequest(CreateCustomizeErrorPageRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

