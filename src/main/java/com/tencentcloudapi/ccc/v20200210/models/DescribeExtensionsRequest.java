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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExtensionsRequest extends AbstractModel {

    /**
    * Application id (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Page number (starting from 0).
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Filtering extension number list.
    */
    @SerializedName("ExtensionIds")
    @Expose
    private String [] ExtensionIds;

    /**
    * Page size.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Fuzzy query field (fuzzy query for extension number, extension name, agent email, and agent name).
    */
    @SerializedName("FuzzingKeyWord")
    @Expose
    private String FuzzingKeyWord;

    /**
    * Whether to return the current status of the telephone or not.
    */
    @SerializedName("IsNeedStatus")
    @Expose
    private Boolean IsNeedStatus;

    /**
     * Get Application id (required) can be found at https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     * @param SdkAppId Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Page number (starting from 0). 
     * @return PageNumber Page number (starting from 0).
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number (starting from 0).
     * @param PageNumber Page number (starting from 0).
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Filtering extension number list. 
     * @return ExtensionIds Filtering extension number list.
     */
    public String [] getExtensionIds() {
        return this.ExtensionIds;
    }

    /**
     * Set Filtering extension number list.
     * @param ExtensionIds Filtering extension number list.
     */
    public void setExtensionIds(String [] ExtensionIds) {
        this.ExtensionIds = ExtensionIds;
    }

    /**
     * Get Page size. 
     * @return PageSize Page size.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size.
     * @param PageSize Page size.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Fuzzy query field (fuzzy query for extension number, extension name, agent email, and agent name). 
     * @return FuzzingKeyWord Fuzzy query field (fuzzy query for extension number, extension name, agent email, and agent name).
     */
    public String getFuzzingKeyWord() {
        return this.FuzzingKeyWord;
    }

    /**
     * Set Fuzzy query field (fuzzy query for extension number, extension name, agent email, and agent name).
     * @param FuzzingKeyWord Fuzzy query field (fuzzy query for extension number, extension name, agent email, and agent name).
     */
    public void setFuzzingKeyWord(String FuzzingKeyWord) {
        this.FuzzingKeyWord = FuzzingKeyWord;
    }

    /**
     * Get Whether to return the current status of the telephone or not. 
     * @return IsNeedStatus Whether to return the current status of the telephone or not.
     */
    public Boolean getIsNeedStatus() {
        return this.IsNeedStatus;
    }

    /**
     * Set Whether to return the current status of the telephone or not.
     * @param IsNeedStatus Whether to return the current status of the telephone or not.
     */
    public void setIsNeedStatus(Boolean IsNeedStatus) {
        this.IsNeedStatus = IsNeedStatus;
    }

    public DescribeExtensionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExtensionsRequest(DescribeExtensionsRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.ExtensionIds != null) {
            this.ExtensionIds = new String[source.ExtensionIds.length];
            for (int i = 0; i < source.ExtensionIds.length; i++) {
                this.ExtensionIds[i] = new String(source.ExtensionIds[i]);
            }
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.FuzzingKeyWord != null) {
            this.FuzzingKeyWord = new String(source.FuzzingKeyWord);
        }
        if (source.IsNeedStatus != null) {
            this.IsNeedStatus = new Boolean(source.IsNeedStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamArraySimple(map, prefix + "ExtensionIds.", this.ExtensionIds);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "FuzzingKeyWord", this.FuzzingKeyWord);
        this.setParamSimple(map, prefix + "IsNeedStatus", this.IsNeedStatus);

    }
}

