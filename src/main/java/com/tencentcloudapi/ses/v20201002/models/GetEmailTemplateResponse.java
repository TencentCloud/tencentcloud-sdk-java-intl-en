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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetEmailTemplateResponse extends AbstractModel {

    /**
    * Template content.
    */
    @SerializedName("TemplateContent")
    @Expose
    private TemplateContent TemplateContent;

    /**
    * Template status. Valid values: `0` (approved); `1` (pending approval); `2` (rejected).
    */
    @SerializedName("TemplateStatus")
    @Expose
    private Long TemplateStatus;

    /**
    * Template name
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Template content. 
     * @return TemplateContent Template content.
     */
    public TemplateContent getTemplateContent() {
        return this.TemplateContent;
    }

    /**
     * Set Template content.
     * @param TemplateContent Template content.
     */
    public void setTemplateContent(TemplateContent TemplateContent) {
        this.TemplateContent = TemplateContent;
    }

    /**
     * Get Template status. Valid values: `0` (approved); `1` (pending approval); `2` (rejected). 
     * @return TemplateStatus Template status. Valid values: `0` (approved); `1` (pending approval); `2` (rejected).
     */
    public Long getTemplateStatus() {
        return this.TemplateStatus;
    }

    /**
     * Set Template status. Valid values: `0` (approved); `1` (pending approval); `2` (rejected).
     * @param TemplateStatus Template status. Valid values: `0` (approved); `1` (pending approval); `2` (rejected).
     */
    public void setTemplateStatus(Long TemplateStatus) {
        this.TemplateStatus = TemplateStatus;
    }

    /**
     * Get Template name 
     * @return TemplateName Template name
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name
     * @param TemplateName Template name
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetEmailTemplateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetEmailTemplateResponse(GetEmailTemplateResponse source) {
        if (source.TemplateContent != null) {
            this.TemplateContent = new TemplateContent(source.TemplateContent);
        }
        if (source.TemplateStatus != null) {
            this.TemplateStatus = new Long(source.TemplateStatus);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TemplateContent.", this.TemplateContent);
        this.setParamSimple(map, prefix + "TemplateStatus", this.TemplateStatus);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

