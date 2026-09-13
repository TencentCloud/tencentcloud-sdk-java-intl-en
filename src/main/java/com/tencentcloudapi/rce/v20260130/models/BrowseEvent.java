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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BrowseEvent extends AbstractModel {

    /**
    * <p>Current page type such as home page, search page</p>
    */
    @SerializedName("PageType")
    @Expose
    private String PageType;

    /**
    * <p>Currently page URL</p>
    */
    @SerializedName("PageUrl")
    @Expose
    private String PageUrl;

    /**
    * <p>Browsing duration</p><p>Measurement unit: ms</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>The type of the content in current page such as ad, video, article</p>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>The ID of the content in current page</p>
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

    /**
    * <p>Previous page type such as home page, search page</p>
    */
    @SerializedName("ReferPageType")
    @Expose
    private String ReferPageType;

    /**
    * <p>Previous page URL</p>
    */
    @SerializedName("ReferPageUrl")
    @Expose
    private String ReferPageUrl;

    /**
    * <p>The ID of the user as guest</p>
    */
    @SerializedName("GuestId")
    @Expose
    private String GuestId;

    /**
    * <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>Current page type such as home page, search page</p> 
     * @return PageType <p>Current page type such as home page, search page</p>
     */
    public String getPageType() {
        return this.PageType;
    }

    /**
     * Set <p>Current page type such as home page, search page</p>
     * @param PageType <p>Current page type such as home page, search page</p>
     */
    public void setPageType(String PageType) {
        this.PageType = PageType;
    }

    /**
     * Get <p>Currently page URL</p> 
     * @return PageUrl <p>Currently page URL</p>
     */
    public String getPageUrl() {
        return this.PageUrl;
    }

    /**
     * Set <p>Currently page URL</p>
     * @param PageUrl <p>Currently page URL</p>
     */
    public void setPageUrl(String PageUrl) {
        this.PageUrl = PageUrl;
    }

    /**
     * Get <p>Browsing duration</p><p>Measurement unit: ms</p> 
     * @return Duration <p>Browsing duration</p><p>Measurement unit: ms</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>Browsing duration</p><p>Measurement unit: ms</p>
     * @param Duration <p>Browsing duration</p><p>Measurement unit: ms</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>The type of the content in current page such as ad, video, article</p> 
     * @return ContentType <p>The type of the content in current page such as ad, video, article</p>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>The type of the content in current page such as ad, video, article</p>
     * @param ContentType <p>The type of the content in current page such as ad, video, article</p>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>The ID of the content in current page</p> 
     * @return ContentId <p>The ID of the content in current page</p>
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * Set <p>The ID of the content in current page</p>
     * @param ContentId <p>The ID of the content in current page</p>
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
    }

    /**
     * Get <p>Previous page type such as home page, search page</p> 
     * @return ReferPageType <p>Previous page type such as home page, search page</p>
     */
    public String getReferPageType() {
        return this.ReferPageType;
    }

    /**
     * Set <p>Previous page type such as home page, search page</p>
     * @param ReferPageType <p>Previous page type such as home page, search page</p>
     */
    public void setReferPageType(String ReferPageType) {
        this.ReferPageType = ReferPageType;
    }

    /**
     * Get <p>Previous page URL</p> 
     * @return ReferPageUrl <p>Previous page URL</p>
     */
    public String getReferPageUrl() {
        return this.ReferPageUrl;
    }

    /**
     * Set <p>Previous page URL</p>
     * @param ReferPageUrl <p>Previous page URL</p>
     */
    public void setReferPageUrl(String ReferPageUrl) {
        this.ReferPageUrl = ReferPageUrl;
    }

    /**
     * Get <p>The ID of the user as guest</p> 
     * @return GuestId <p>The ID of the user as guest</p>
     */
    public String getGuestId() {
        return this.GuestId;
    }

    /**
     * Set <p>The ID of the user as guest</p>
     * @param GuestId <p>The ID of the user as guest</p>
     */
    public void setGuestId(String GuestId) {
        this.GuestId = GuestId;
    }

    /**
     * Get <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p> 
     * @return Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     * @param Cust <p>The custom parameters agreed with RCE. An array of objects in K:V format. e.g.[{"Key": "ApproverName", "Value": "bob"},{"Key":"ApproverPhone","Value": "+86131****5678"}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public BrowseEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BrowseEvent(BrowseEvent source) {
        if (source.PageType != null) {
            this.PageType = new String(source.PageType);
        }
        if (source.PageUrl != null) {
            this.PageUrl = new String(source.PageUrl);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.ContentId != null) {
            this.ContentId = new String(source.ContentId);
        }
        if (source.ReferPageType != null) {
            this.ReferPageType = new String(source.ReferPageType);
        }
        if (source.ReferPageUrl != null) {
            this.ReferPageUrl = new String(source.ReferPageUrl);
        }
        if (source.GuestId != null) {
            this.GuestId = new String(source.GuestId);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageType", this.PageType);
        this.setParamSimple(map, prefix + "PageUrl", this.PageUrl);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);
        this.setParamSimple(map, prefix + "ReferPageType", this.ReferPageType);
        this.setParamSimple(map, prefix + "ReferPageUrl", this.ReferPageUrl);
        this.setParamSimple(map, prefix + "GuestId", this.GuestId);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

