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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTemplateListStatus extends AbstractModel{

    /**
    * Template ID
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Whether it is Global SMS. Valid values:
0: Mainland China SMS.
1: Global SMS
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
    * Signature application status. Valid values:
0: approved.
-1: rejected or failed.
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
     * Get Template ID 
     * @return TemplateId Template ID
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID
     * @param TemplateId Template ID
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Whether it is Global SMS. Valid values:
0: Mainland China SMS.
1: Global SMS 
     * @return International Whether it is Global SMS. Valid values:
0: Mainland China SMS.
1: Global SMS
     */
    public Long getInternational() {
        return this.International;
    }

    /**
     * Set Whether it is Global SMS. Valid values:
0: Mainland China SMS.
1: Global SMS
     * @param International Whether it is Global SMS. Valid values:
0: Mainland China SMS.
1: Global SMS
     */
    public void setInternational(Long International) {
        this.International = International;
    }

    /**
     * Get Signature application status. Valid values:
0: approved.
-1: rejected or failed. 
     * @return StatusCode Signature application status. Valid values:
0: approved.
-1: rejected or failed.
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set Signature application status. Valid values:
0: approved.
-1: rejected or failed.
     * @param StatusCode Signature application status. Valid values:
0: approved.
-1: rejected or failed.
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "International", this.International);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "ReviewReply", this.ReviewReply);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

