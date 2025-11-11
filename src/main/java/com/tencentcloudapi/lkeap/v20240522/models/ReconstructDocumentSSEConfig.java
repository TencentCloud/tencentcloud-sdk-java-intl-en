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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReconstructDocumentSSEConfig extends AbstractModel {

    /**
    * The form in which tables in a Markdown file are returned.
- 0: returned as MD.
- 1: returned as HTML.
The default is 0.
    */
    @SerializedName("TableResultType")
    @Expose
    private String TableResultType;

    /**
    * The form in which images in a Markdown file are returned.
- 0: returned as URL.
- 1: only return the text content extracted from the image in markdown.
The default value is 0.
    */
    @SerializedName("MarkdownImageResponseType")
    @Expose
    private String MarkdownImageResponseType;

    /**
    * Whether the Markdown file contains page number information.
    */
    @SerializedName("ReturnPageFormat")
    @Expose
    private Boolean ReturnPageFormat;

    /**
    * The custom output page number style. {{p}} is a placeholder for the page number. Enable ReturnPageFormat to take effect. If empty, the default style is: <page_num>page {{p}}</page_num>.
    */
    @SerializedName("PageFormat")
    @Expose
    private String PageFormat;

    /**
     * Get The form in which tables in a Markdown file are returned.
- 0: returned as MD.
- 1: returned as HTML.
The default is 0. 
     * @return TableResultType The form in which tables in a Markdown file are returned.
- 0: returned as MD.
- 1: returned as HTML.
The default is 0.
     */
    public String getTableResultType() {
        return this.TableResultType;
    }

    /**
     * Set The form in which tables in a Markdown file are returned.
- 0: returned as MD.
- 1: returned as HTML.
The default is 0.
     * @param TableResultType The form in which tables in a Markdown file are returned.
- 0: returned as MD.
- 1: returned as HTML.
The default is 0.
     */
    public void setTableResultType(String TableResultType) {
        this.TableResultType = TableResultType;
    }

    /**
     * Get The form in which images in a Markdown file are returned.
- 0: returned as URL.
- 1: only return the text content extracted from the image in markdown.
The default value is 0. 
     * @return MarkdownImageResponseType The form in which images in a Markdown file are returned.
- 0: returned as URL.
- 1: only return the text content extracted from the image in markdown.
The default value is 0.
     */
    public String getMarkdownImageResponseType() {
        return this.MarkdownImageResponseType;
    }

    /**
     * Set The form in which images in a Markdown file are returned.
- 0: returned as URL.
- 1: only return the text content extracted from the image in markdown.
The default value is 0.
     * @param MarkdownImageResponseType The form in which images in a Markdown file are returned.
- 0: returned as URL.
- 1: only return the text content extracted from the image in markdown.
The default value is 0.
     */
    public void setMarkdownImageResponseType(String MarkdownImageResponseType) {
        this.MarkdownImageResponseType = MarkdownImageResponseType;
    }

    /**
     * Get Whether the Markdown file contains page number information. 
     * @return ReturnPageFormat Whether the Markdown file contains page number information.
     */
    public Boolean getReturnPageFormat() {
        return this.ReturnPageFormat;
    }

    /**
     * Set Whether the Markdown file contains page number information.
     * @param ReturnPageFormat Whether the Markdown file contains page number information.
     */
    public void setReturnPageFormat(Boolean ReturnPageFormat) {
        this.ReturnPageFormat = ReturnPageFormat;
    }

    /**
     * Get The custom output page number style. {{p}} is a placeholder for the page number. Enable ReturnPageFormat to take effect. If empty, the default style is: <page_num>page {{p}}</page_num>. 
     * @return PageFormat The custom output page number style. {{p}} is a placeholder for the page number. Enable ReturnPageFormat to take effect. If empty, the default style is: <page_num>page {{p}}</page_num>.
     */
    public String getPageFormat() {
        return this.PageFormat;
    }

    /**
     * Set The custom output page number style. {{p}} is a placeholder for the page number. Enable ReturnPageFormat to take effect. If empty, the default style is: <page_num>page {{p}}</page_num>.
     * @param PageFormat The custom output page number style. {{p}} is a placeholder for the page number. Enable ReturnPageFormat to take effect. If empty, the default style is: <page_num>page {{p}}</page_num>.
     */
    public void setPageFormat(String PageFormat) {
        this.PageFormat = PageFormat;
    }

    public ReconstructDocumentSSEConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReconstructDocumentSSEConfig(ReconstructDocumentSSEConfig source) {
        if (source.TableResultType != null) {
            this.TableResultType = new String(source.TableResultType);
        }
        if (source.MarkdownImageResponseType != null) {
            this.MarkdownImageResponseType = new String(source.MarkdownImageResponseType);
        }
        if (source.ReturnPageFormat != null) {
            this.ReturnPageFormat = new Boolean(source.ReturnPageFormat);
        }
        if (source.PageFormat != null) {
            this.PageFormat = new String(source.PageFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableResultType", this.TableResultType);
        this.setParamSimple(map, prefix + "MarkdownImageResponseType", this.MarkdownImageResponseType);
        this.setParamSimple(map, prefix + "ReturnPageFormat", this.ReturnPageFormat);
        this.setParamSimple(map, prefix + "PageFormat", this.PageFormat);

    }
}

