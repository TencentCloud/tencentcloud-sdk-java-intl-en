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

public class DescribeIvrAudioListRequest extends AbstractModel {

    /**
    * Application id (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Page size, upper limit 50.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Page number starting from 0.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * File alias.
    */
    @SerializedName("CustomFileName")
    @Expose
    private String [] CustomFileName;

    /**
    * Filename.
    */
    @SerializedName("AudioFileName")
    @Expose
    private String [] AudioFileName;

    /**
    * File id.
    */
    @SerializedName("FileId")
    @Expose
    private Long [] FileId;

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
     * Get Page size, upper limit 50. 
     * @return PageSize Page size, upper limit 50.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size, upper limit 50.
     * @param PageSize Page size, upper limit 50.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Page number starting from 0. 
     * @return PageNumber Page number starting from 0.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number starting from 0.
     * @param PageNumber Page number starting from 0.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get File alias. 
     * @return CustomFileName File alias.
     */
    public String [] getCustomFileName() {
        return this.CustomFileName;
    }

    /**
     * Set File alias.
     * @param CustomFileName File alias.
     */
    public void setCustomFileName(String [] CustomFileName) {
        this.CustomFileName = CustomFileName;
    }

    /**
     * Get Filename. 
     * @return AudioFileName Filename.
     */
    public String [] getAudioFileName() {
        return this.AudioFileName;
    }

    /**
     * Set Filename.
     * @param AudioFileName Filename.
     */
    public void setAudioFileName(String [] AudioFileName) {
        this.AudioFileName = AudioFileName;
    }

    /**
     * Get File id. 
     * @return FileId File id.
     */
    public Long [] getFileId() {
        return this.FileId;
    }

    /**
     * Set File id.
     * @param FileId File id.
     */
    public void setFileId(Long [] FileId) {
        this.FileId = FileId;
    }

    public DescribeIvrAudioListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIvrAudioListRequest(DescribeIvrAudioListRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.CustomFileName != null) {
            this.CustomFileName = new String[source.CustomFileName.length];
            for (int i = 0; i < source.CustomFileName.length; i++) {
                this.CustomFileName[i] = new String(source.CustomFileName[i]);
            }
        }
        if (source.AudioFileName != null) {
            this.AudioFileName = new String[source.AudioFileName.length];
            for (int i = 0; i < source.AudioFileName.length; i++) {
                this.AudioFileName[i] = new String(source.AudioFileName[i]);
            }
        }
        if (source.FileId != null) {
            this.FileId = new Long[source.FileId.length];
            for (int i = 0; i < source.FileId.length; i++) {
                this.FileId[i] = new Long(source.FileId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamArraySimple(map, prefix + "CustomFileName.", this.CustomFileName);
        this.setParamArraySimple(map, prefix + "AudioFileName.", this.AudioFileName);
        this.setParamArraySimple(map, prefix + "FileId.", this.FileId);

    }
}

