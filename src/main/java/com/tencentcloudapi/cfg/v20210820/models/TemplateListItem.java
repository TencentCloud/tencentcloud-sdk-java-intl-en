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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateListItem extends AbstractModel {

    /**
    * Template library ID
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Template library name
    */
    @SerializedName("TemplateTitle")
    @Expose
    private String TemplateTitle;

    /**
    * Template library description
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
    * Template library tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TemplateTag")
    @Expose
    private String TemplateTag;

    /**
    * Template library status. 1: in use; 2: not in use.
    */
    @SerializedName("TemplateIsUsed")
    @Expose
    private Long TemplateIsUsed;

    /**
    * Template library creation time
    */
    @SerializedName("TemplateCreateTime")
    @Expose
    private String TemplateCreateTime;

    /**
    * Template library update time
    */
    @SerializedName("TemplateUpdateTime")
    @Expose
    private String TemplateUpdateTime;

    /**
    * Number of tasks associated with the template library
    */
    @SerializedName("TemplateUsedNum")
    @Expose
    private Long TemplateUsedNum;

    /**
    * Template library source. 0: self-built; 1: recommended by experts.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TemplateSource")
    @Expose
    private Long TemplateSource;

    /**
     * Get Template library ID 
     * @return TemplateId Template library ID
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template library ID
     * @param TemplateId Template library ID
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Template library name 
     * @return TemplateTitle Template library name
     */
    public String getTemplateTitle() {
        return this.TemplateTitle;
    }

    /**
     * Set Template library name
     * @param TemplateTitle Template library name
     */
    public void setTemplateTitle(String TemplateTitle) {
        this.TemplateTitle = TemplateTitle;
    }

    /**
     * Get Template library description 
     * @return TemplateDescription Template library description
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set Template library description
     * @param TemplateDescription Template library description
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    /**
     * Get Template library tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TemplateTag Template library tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTemplateTag() {
        return this.TemplateTag;
    }

    /**
     * Set Template library tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TemplateTag Template library tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTemplateTag(String TemplateTag) {
        this.TemplateTag = TemplateTag;
    }

    /**
     * Get Template library status. 1: in use; 2: not in use. 
     * @return TemplateIsUsed Template library status. 1: in use; 2: not in use.
     */
    public Long getTemplateIsUsed() {
        return this.TemplateIsUsed;
    }

    /**
     * Set Template library status. 1: in use; 2: not in use.
     * @param TemplateIsUsed Template library status. 1: in use; 2: not in use.
     */
    public void setTemplateIsUsed(Long TemplateIsUsed) {
        this.TemplateIsUsed = TemplateIsUsed;
    }

    /**
     * Get Template library creation time 
     * @return TemplateCreateTime Template library creation time
     */
    public String getTemplateCreateTime() {
        return this.TemplateCreateTime;
    }

    /**
     * Set Template library creation time
     * @param TemplateCreateTime Template library creation time
     */
    public void setTemplateCreateTime(String TemplateCreateTime) {
        this.TemplateCreateTime = TemplateCreateTime;
    }

    /**
     * Get Template library update time 
     * @return TemplateUpdateTime Template library update time
     */
    public String getTemplateUpdateTime() {
        return this.TemplateUpdateTime;
    }

    /**
     * Set Template library update time
     * @param TemplateUpdateTime Template library update time
     */
    public void setTemplateUpdateTime(String TemplateUpdateTime) {
        this.TemplateUpdateTime = TemplateUpdateTime;
    }

    /**
     * Get Number of tasks associated with the template library 
     * @return TemplateUsedNum Number of tasks associated with the template library
     */
    public Long getTemplateUsedNum() {
        return this.TemplateUsedNum;
    }

    /**
     * Set Number of tasks associated with the template library
     * @param TemplateUsedNum Number of tasks associated with the template library
     */
    public void setTemplateUsedNum(Long TemplateUsedNum) {
        this.TemplateUsedNum = TemplateUsedNum;
    }

    /**
     * Get Template library source. 0: self-built; 1: recommended by experts.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TemplateSource Template library source. 0: self-built; 1: recommended by experts.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTemplateSource() {
        return this.TemplateSource;
    }

    /**
     * Set Template library source. 0: self-built; 1: recommended by experts.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TemplateSource Template library source. 0: self-built; 1: recommended by experts.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTemplateSource(Long TemplateSource) {
        this.TemplateSource = TemplateSource;
    }

    public TemplateListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateListItem(TemplateListItem source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateTitle != null) {
            this.TemplateTitle = new String(source.TemplateTitle);
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
        if (source.TemplateTag != null) {
            this.TemplateTag = new String(source.TemplateTag);
        }
        if (source.TemplateIsUsed != null) {
            this.TemplateIsUsed = new Long(source.TemplateIsUsed);
        }
        if (source.TemplateCreateTime != null) {
            this.TemplateCreateTime = new String(source.TemplateCreateTime);
        }
        if (source.TemplateUpdateTime != null) {
            this.TemplateUpdateTime = new String(source.TemplateUpdateTime);
        }
        if (source.TemplateUsedNum != null) {
            this.TemplateUsedNum = new Long(source.TemplateUsedNum);
        }
        if (source.TemplateSource != null) {
            this.TemplateSource = new Long(source.TemplateSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateTitle", this.TemplateTitle);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);
        this.setParamSimple(map, prefix + "TemplateTag", this.TemplateTag);
        this.setParamSimple(map, prefix + "TemplateIsUsed", this.TemplateIsUsed);
        this.setParamSimple(map, prefix + "TemplateCreateTime", this.TemplateCreateTime);
        this.setParamSimple(map, prefix + "TemplateUpdateTime", this.TemplateUpdateTime);
        this.setParamSimple(map, prefix + "TemplateUsedNum", this.TemplateUsedNum);
        this.setParamSimple(map, prefix + "TemplateSource", this.TemplateSource);

    }
}

