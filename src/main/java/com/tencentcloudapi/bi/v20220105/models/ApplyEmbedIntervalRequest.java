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

public class ApplyEmbedIntervalRequest extends AbstractModel {

    /**
    * Shares the project ID. Required.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Shares the page ID. This field is empty (0) for embedding a dashboard and is not passed for embedding ChatBI.

    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * Token requiring extension.
    */
    @SerializedName("BIToken")
    @Expose
    private String BIToken;

    /**
    * Alternate field.
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
    * embed: page/dashboard embedding.
chatBIEmbed: ChatBI embedding.
    */
    @SerializedName("Intention")
    @Expose
    private String Intention;

    /**
    * panel: dashboard; page: page.
project, during ChatBI embedding.
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
     * Get Shares the project ID. Required. 
     * @return ProjectId Shares the project ID. Required.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Shares the project ID. Required.
     * @param ProjectId Shares the project ID. Required.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Shares the page ID. This field is empty (0) for embedding a dashboard and is not passed for embedding ChatBI.
 
     * @return PageId Shares the page ID. This field is empty (0) for embedding a dashboard and is not passed for embedding ChatBI.

     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set Shares the page ID. This field is empty (0) for embedding a dashboard and is not passed for embedding ChatBI.

     * @param PageId Shares the page ID. This field is empty (0) for embedding a dashboard and is not passed for embedding ChatBI.

     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get Token requiring extension. 
     * @return BIToken Token requiring extension.
     */
    public String getBIToken() {
        return this.BIToken;
    }

    /**
     * Set Token requiring extension.
     * @param BIToken Token requiring extension.
     */
    public void setBIToken(String BIToken) {
        this.BIToken = BIToken;
    }

    /**
     * Get Alternate field. 
     * @return ExtraParam Alternate field.
     */
    public String getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set Alternate field.
     * @param ExtraParam Alternate field.
     */
    public void setExtraParam(String ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    /**
     * Get embed: page/dashboard embedding.
chatBIEmbed: ChatBI embedding. 
     * @return Intention embed: page/dashboard embedding.
chatBIEmbed: ChatBI embedding.
     */
    public String getIntention() {
        return this.Intention;
    }

    /**
     * Set embed: page/dashboard embedding.
chatBIEmbed: ChatBI embedding.
     * @param Intention embed: page/dashboard embedding.
chatBIEmbed: ChatBI embedding.
     */
    public void setIntention(String Intention) {
        this.Intention = Intention;
    }

    /**
     * Get panel: dashboard; page: page.
project, during ChatBI embedding. 
     * @return Scope panel: dashboard; page: page.
project, during ChatBI embedding.
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set panel: dashboard; page: page.
project, during ChatBI embedding.
     * @param Scope panel: dashboard; page: page.
project, during ChatBI embedding.
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    public ApplyEmbedIntervalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyEmbedIntervalRequest(ApplyEmbedIntervalRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.PageId != null) {
            this.PageId = new Long(source.PageId);
        }
        if (source.BIToken != null) {
            this.BIToken = new String(source.BIToken);
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new String(source.ExtraParam);
        }
        if (source.Intention != null) {
            this.Intention = new String(source.Intention);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "BIToken", this.BIToken);
        this.setParamSimple(map, prefix + "ExtraParam", this.ExtraParam);
        this.setParamSimple(map, prefix + "Intention", this.Intention);
        this.setParamSimple(map, prefix + "Scope", this.Scope);

    }
}

