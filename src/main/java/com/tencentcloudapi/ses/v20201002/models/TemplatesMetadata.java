/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class TemplatesMetadata extends AbstractModel {

    /**
    * Creation time.
    */
    @SerializedName("CreatedTimestamp")
    @Expose
    private Long CreatedTimestamp;

    /**
    * Template name.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Template status. 1: under review; 0: approved; 2: rejected; other values: unavailable.
    */
    @SerializedName("TemplateStatus")
    @Expose
    private Long TemplateStatus;

    /**
    * Template ID.
    */
    @SerializedName("TemplateID")
    @Expose
    private Long TemplateID;

    /**
    * Review reply
    */
    @SerializedName("ReviewReason")
    @Expose
    private String ReviewReason;

    /**
     * Get Creation time. 
     * @return CreatedTimestamp Creation time.
     */
    public Long getCreatedTimestamp() {
        return this.CreatedTimestamp;
    }

    /**
     * Set Creation time.
     * @param CreatedTimestamp Creation time.
     */
    public void setCreatedTimestamp(Long CreatedTimestamp) {
        this.CreatedTimestamp = CreatedTimestamp;
    }

    /**
     * Get Template name. 
     * @return TemplateName Template name.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Template name.
     * @param TemplateName Template name.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Template status. 1: under review; 0: approved; 2: rejected; other values: unavailable. 
     * @return TemplateStatus Template status. 1: under review; 0: approved; 2: rejected; other values: unavailable.
     */
    public Long getTemplateStatus() {
        return this.TemplateStatus;
    }

    /**
     * Set Template status. 1: under review; 0: approved; 2: rejected; other values: unavailable.
     * @param TemplateStatus Template status. 1: under review; 0: approved; 2: rejected; other values: unavailable.
     */
    public void setTemplateStatus(Long TemplateStatus) {
        this.TemplateStatus = TemplateStatus;
    }

    /**
     * Get Template ID. 
     * @return TemplateID Template ID.
     */
    public Long getTemplateID() {
        return this.TemplateID;
    }

    /**
     * Set Template ID.
     * @param TemplateID Template ID.
     */
    public void setTemplateID(Long TemplateID) {
        this.TemplateID = TemplateID;
    }

    /**
     * Get Review reply 
     * @return ReviewReason Review reply
     */
    public String getReviewReason() {
        return this.ReviewReason;
    }

    /**
     * Set Review reply
     * @param ReviewReason Review reply
     */
    public void setReviewReason(String ReviewReason) {
        this.ReviewReason = ReviewReason;
    }

    public TemplatesMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplatesMetadata(TemplatesMetadata source) {
        if (source.CreatedTimestamp != null) {
            this.CreatedTimestamp = new Long(source.CreatedTimestamp);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.TemplateStatus != null) {
            this.TemplateStatus = new Long(source.TemplateStatus);
        }
        if (source.TemplateID != null) {
            this.TemplateID = new Long(source.TemplateID);
        }
        if (source.ReviewReason != null) {
            this.ReviewReason = new String(source.ReviewReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreatedTimestamp", this.CreatedTimestamp);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "TemplateStatus", this.TemplateStatus);
        this.setParamSimple(map, prefix + "TemplateID", this.TemplateID);
        this.setParamSimple(map, prefix + "ReviewReason", this.ReviewReason);

    }
}

