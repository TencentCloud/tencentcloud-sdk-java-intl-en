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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportScreenPageRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Page ID.
    */
    @SerializedName("PageId")
    @Expose
    private String PageId;

    /**
    * Canvas type. Grid canvas: GRID; Free canvas: FREE.
    */
    @SerializedName("CanvasType")
    @Expose
    private String CanvasType;

    /**
    * Image export type. Valid values: Base64, and URL (valid period: 1 day).
    */
    @SerializedName("PicType")
    @Expose
    private String PicType;

    /**
    * Component IDs. When empty, export the entire page.
    */
    @SerializedName("WidgetIds")
    @Expose
    private String [] WidgetIds;

    /**
    * Whether it is an async request.
    */
    @SerializedName("AsyncRequest")
    @Expose
    private Boolean AsyncRequest;

    /**
    * Transaction ID.
    */
    @SerializedName("TranId")
    @Expose
    private String TranId;

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Page ID. 
     * @return PageId Page ID.
     */
    public String getPageId() {
        return this.PageId;
    }

    /**
     * Set Page ID.
     * @param PageId Page ID.
     */
    public void setPageId(String PageId) {
        this.PageId = PageId;
    }

    /**
     * Get Canvas type. Grid canvas: GRID; Free canvas: FREE. 
     * @return CanvasType Canvas type. Grid canvas: GRID; Free canvas: FREE.
     */
    public String getCanvasType() {
        return this.CanvasType;
    }

    /**
     * Set Canvas type. Grid canvas: GRID; Free canvas: FREE.
     * @param CanvasType Canvas type. Grid canvas: GRID; Free canvas: FREE.
     */
    public void setCanvasType(String CanvasType) {
        this.CanvasType = CanvasType;
    }

    /**
     * Get Image export type. Valid values: Base64, and URL (valid period: 1 day). 
     * @return PicType Image export type. Valid values: Base64, and URL (valid period: 1 day).
     */
    public String getPicType() {
        return this.PicType;
    }

    /**
     * Set Image export type. Valid values: Base64, and URL (valid period: 1 day).
     * @param PicType Image export type. Valid values: Base64, and URL (valid period: 1 day).
     */
    public void setPicType(String PicType) {
        this.PicType = PicType;
    }

    /**
     * Get Component IDs. When empty, export the entire page. 
     * @return WidgetIds Component IDs. When empty, export the entire page.
     */
    public String [] getWidgetIds() {
        return this.WidgetIds;
    }

    /**
     * Set Component IDs. When empty, export the entire page.
     * @param WidgetIds Component IDs. When empty, export the entire page.
     */
    public void setWidgetIds(String [] WidgetIds) {
        this.WidgetIds = WidgetIds;
    }

    /**
     * Get Whether it is an async request. 
     * @return AsyncRequest Whether it is an async request.
     */
    public Boolean getAsyncRequest() {
        return this.AsyncRequest;
    }

    /**
     * Set Whether it is an async request.
     * @param AsyncRequest Whether it is an async request.
     */
    public void setAsyncRequest(Boolean AsyncRequest) {
        this.AsyncRequest = AsyncRequest;
    }

    /**
     * Get Transaction ID. 
     * @return TranId Transaction ID.
     */
    public String getTranId() {
        return this.TranId;
    }

    /**
     * Set Transaction ID.
     * @param TranId Transaction ID.
     */
    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    public ExportScreenPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportScreenPageRequest(ExportScreenPageRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageId != null) {
            this.PageId = new String(source.PageId);
        }
        if (source.CanvasType != null) {
            this.CanvasType = new String(source.CanvasType);
        }
        if (source.PicType != null) {
            this.PicType = new String(source.PicType);
        }
        if (source.WidgetIds != null) {
            this.WidgetIds = new String[source.WidgetIds.length];
            for (int i = 0; i < source.WidgetIds.length; i++) {
                this.WidgetIds[i] = new String(source.WidgetIds[i]);
            }
        }
        if (source.AsyncRequest != null) {
            this.AsyncRequest = new Boolean(source.AsyncRequest);
        }
        if (source.TranId != null) {
            this.TranId = new String(source.TranId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "CanvasType", this.CanvasType);
        this.setParamSimple(map, prefix + "PicType", this.PicType);
        this.setParamArraySimple(map, prefix + "WidgetIds.", this.WidgetIds);
        this.setParamSimple(map, prefix + "AsyncRequest", this.AsyncRequest);
        this.setParamSimple(map, prefix + "TranId", this.TranId);

    }
}

