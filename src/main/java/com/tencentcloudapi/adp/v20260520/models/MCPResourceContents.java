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

public class MCPResourceContents extends AbstractModel {

    /**
    * <p>Binary content. Either this parameter or text must be specified.</p>
    */
    @SerializedName("Blob")
    @Expose
    private String Blob;

    /**
    * <p>JSON: Original _meta of a single resource</p>
    */
    @SerializedName("Meta")
    @Expose
    private String Meta;

    /**
    * <p>MIME type. The HTML of the MCP App is text/html;profile=mcp-app</p>
    */
    @SerializedName("MimeType")
    @Expose
    private String MimeType;

    /**
    * <p>Text content. Either this field or blob is required.</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>Resource URI</p>
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
     * Get <p>Binary content. Either this parameter or text must be specified.</p> 
     * @return Blob <p>Binary content. Either this parameter or text must be specified.</p>
     */
    public String getBlob() {
        return this.Blob;
    }

    /**
     * Set <p>Binary content. Either this parameter or text must be specified.</p>
     * @param Blob <p>Binary content. Either this parameter or text must be specified.</p>
     */
    public void setBlob(String Blob) {
        this.Blob = Blob;
    }

    /**
     * Get <p>JSON: Original _meta of a single resource</p> 
     * @return Meta <p>JSON: Original _meta of a single resource</p>
     */
    public String getMeta() {
        return this.Meta;
    }

    /**
     * Set <p>JSON: Original _meta of a single resource</p>
     * @param Meta <p>JSON: Original _meta of a single resource</p>
     */
    public void setMeta(String Meta) {
        this.Meta = Meta;
    }

    /**
     * Get <p>MIME type. The HTML of the MCP App is text/html;profile=mcp-app</p> 
     * @return MimeType <p>MIME type. The HTML of the MCP App is text/html;profile=mcp-app</p>
     */
    public String getMimeType() {
        return this.MimeType;
    }

    /**
     * Set <p>MIME type. The HTML of the MCP App is text/html;profile=mcp-app</p>
     * @param MimeType <p>MIME type. The HTML of the MCP App is text/html;profile=mcp-app</p>
     */
    public void setMimeType(String MimeType) {
        this.MimeType = MimeType;
    }

    /**
     * Get <p>Text content. Either this field or blob is required.</p> 
     * @return Text <p>Text content. Either this field or blob is required.</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>Text content. Either this field or blob is required.</p>
     * @param Text <p>Text content. Either this field or blob is required.</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>Resource URI</p> 
     * @return Uri <p>Resource URI</p>
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set <p>Resource URI</p>
     * @param Uri <p>Resource URI</p>
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    public MCPResourceContents() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MCPResourceContents(MCPResourceContents source) {
        if (source.Blob != null) {
            this.Blob = new String(source.Blob);
        }
        if (source.Meta != null) {
            this.Meta = new String(source.Meta);
        }
        if (source.MimeType != null) {
            this.MimeType = new String(source.MimeType);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Blob", this.Blob);
        this.setParamSimple(map, prefix + "Meta", this.Meta);
        this.setParamSimple(map, prefix + "MimeType", this.MimeType);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Uri", this.Uri);

    }
}

