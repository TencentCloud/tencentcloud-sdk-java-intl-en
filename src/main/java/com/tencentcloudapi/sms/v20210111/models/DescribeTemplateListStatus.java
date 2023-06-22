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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTemplateListStatus extends AbstractModel{

    /**
    * Template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Whether it is Global SMS. 0: Mainland China SMS; 1: Global SMS.
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * Template application status. Valid values: 0: approved and effective; 1: under review; 2: approved but to be effective; -1: application rejected or failed.
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * Review reply, i.e., response given by the reviewer, which is usually the reason for rejection.
    */
    @SerializedName("ReviewReply")
    @Expose
    private String ReviewReply;

    /**
    * Template name.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Application submission time in the format of UNIX timestamp in seconds.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Template content.
    */
    @SerializedName("TemplateContent")
    @Expose
    private String TemplateContent;

    /**
     * Get Template ID. 
     * @return TemplateId Template ID.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID.
     * @param TemplateId Template ID.
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Whether it is Global SMS. 0: Mainland China SMS; 1: Global SMS. 
     * @return International Whether it is Global SMS. 0: Mainland China SMS; 1: Global SMS.
     */
    public Long getInternational() {
        return this.International;
    }

    /**
     * Set Whether it is Global SMS. 0: Mainland China SMS; 1: Global SMS.
     * @param International Whether it is Global SMS. 0: Mainland China SMS; 1: Global SMS.
     */
    public void setInternational(Long International) {
        this.International = International;
    }

    /**
     * Get Template application status. Valid values: 0: approved and effective; 1: under review; 2: approved but to be effective; -1: application rejected or failed. 
     * @return StatusCode Template application status. Valid values: 0: approved and effective; 1: under review; 2: approved but to be effective; -1: application rejected or failed.
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set Template application status. Valid values: 0: approved and effective; 1: under review; 2: approved but to be effective; -1: application rejected or failed.
     * @param StatusCode Template application status. Valid values: 0: approved and effective; 1: under review; 2: approved but to be effective; -1: application rejected or failed.
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get Review reply, i.e., response given by the reviewer, which is usually the reason for rejection. 
     * @return ReviewReply Review reply, i.e., response given by the reviewer, which is usually the reason for rejection.
     */
    public String getReviewReply() {
        return this.ReviewReply;
    }

    /**
     * Set Review reply, i.e., response given by the reviewer, which is usually the reason for rejection.
     * @param ReviewReply Review reply, i.e., response given by the reviewer, which is usually the reason for rejection.
     */
    public void setReviewReply(String ReviewReply) {
        this.ReviewReply = ReviewReply;
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
     * Get Application submission time in the format of UNIX timestamp in seconds. 
     * @return CreateTime Application submission time in the format of UNIX timestamp in seconds.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Application submission time in the format of UNIX timestamp in seconds.
     * @param CreateTime Application submission time in the format of UNIX timestamp in seconds.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Template content. 
     * @return TemplateContent Template content.
     */
    public String getTemplateContent() {
        return this.TemplateContent;
    }

    /**
     * Set Template content.
     * @param TemplateContent Template content.
     */
    public void setTemplateContent(String TemplateContent) {
        this.TemplateContent = TemplateContent;
    }

    public DescribeTemplateListStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTemplateListStatus(DescribeTemplateListStatus source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.International != null) {
            this.International = new Long(source.International);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.ReviewReply != null) {
            this.ReviewReply = new String(source.ReviewReply);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.TemplateContent != null) {
            this.TemplateContent = new String(source.TemplateContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "International", this.International);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "ReviewReply", this.ReviewReply);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TemplateContent", this.TemplateContent);

    }
}

