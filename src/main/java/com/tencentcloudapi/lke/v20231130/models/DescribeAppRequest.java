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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAppRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction.
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * Whether it is the configuration after release.
    */
    @SerializedName("IsRelease")
    @Expose
    private Boolean IsRelease;

    /**
     * Get Application ID. 
     * @return AppBizId Application ID.
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set Application ID.
     * @param AppBizId Application ID.
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction. 
     * @return AppType Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction.
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction.
     * @param AppType Application type; knowledge_qa - knowledge Q&A management; summary - knowledge summary; classifys - knowledge label extraction.
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get Whether it is the configuration after release. 
     * @return IsRelease Whether it is the configuration after release.
     */
    public Boolean getIsRelease() {
        return this.IsRelease;
    }

    /**
     * Set Whether it is the configuration after release.
     * @param IsRelease Whether it is the configuration after release.
     */
    public void setIsRelease(Boolean IsRelease) {
        this.IsRelease = IsRelease;
    }

    public DescribeAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAppRequest(DescribeAppRequest source) {
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.IsRelease != null) {
            this.IsRelease = new Boolean(source.IsRelease);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "IsRelease", this.IsRelease);

    }
}

