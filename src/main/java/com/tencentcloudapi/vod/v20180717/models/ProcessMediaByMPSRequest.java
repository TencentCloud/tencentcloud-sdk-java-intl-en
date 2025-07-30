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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessMediaByMPSRequest extends AbstractModel {

    /**
    * Media file ID, i.e., the globally unique ID of a file in VOD assigned by the VOD backend after successful upload. This field can be obtained through the [video upload completion event notification](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) or [VOD Console](https://console.cloud.tencent.com/vod/media).
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * This parameter is used for passing through to media processing service (MPS) so that video processing tasks can be triggered from VOD.
For detailed information on video processing parameters, please refer to [MPS Initiate Media Processing](https://www.tencentcloud.com/document/product/1041/33640). 
Instructions: 
1. Currently, only the AiAnalysisTask parameter in the MPS "ProcessMedia" API needs to be configured. Other parameters are not required. If other parameters are included, the system will automatically ignore them. 
2. Currently, this is the only method used to initiate Smart Erase tasks. If parameters related to other task types are configured, the system will automatically ignore them.

    */
    @SerializedName("MPSProcessMediaParams")
    @Expose
    private String MPSProcessMediaParams;

    /**
     * Get Media file ID, i.e., the globally unique ID of a file in VOD assigned by the VOD backend after successful upload. This field can be obtained through the [video upload completion event notification](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) or [VOD Console](https://console.cloud.tencent.com/vod/media). 
     * @return FileId Media file ID, i.e., the globally unique ID of a file in VOD assigned by the VOD backend after successful upload. This field can be obtained through the [video upload completion event notification](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) or [VOD Console](https://console.cloud.tencent.com/vod/media).
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID, i.e., the globally unique ID of a file in VOD assigned by the VOD backend after successful upload. This field can be obtained through the [video upload completion event notification](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) or [VOD Console](https://console.cloud.tencent.com/vod/media).
     * @param FileId Media file ID, i.e., the globally unique ID of a file in VOD assigned by the VOD backend after successful upload. This field can be obtained through the [video upload completion event notification](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) or [VOD Console](https://console.cloud.tencent.com/vod/media).
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get This parameter is used for passing through to media processing service (MPS) so that video processing tasks can be triggered from VOD.
For detailed information on video processing parameters, please refer to [MPS Initiate Media Processing](https://www.tencentcloud.com/document/product/1041/33640). 
Instructions: 
1. Currently, only the AiAnalysisTask parameter in the MPS "ProcessMedia" API needs to be configured. Other parameters are not required. If other parameters are included, the system will automatically ignore them. 
2. Currently, this is the only method used to initiate Smart Erase tasks. If parameters related to other task types are configured, the system will automatically ignore them.
 
     * @return MPSProcessMediaParams This parameter is used for passing through to media processing service (MPS) so that video processing tasks can be triggered from VOD.
For detailed information on video processing parameters, please refer to [MPS Initiate Media Processing](https://www.tencentcloud.com/document/product/1041/33640). 
Instructions: 
1. Currently, only the AiAnalysisTask parameter in the MPS "ProcessMedia" API needs to be configured. Other parameters are not required. If other parameters are included, the system will automatically ignore them. 
2. Currently, this is the only method used to initiate Smart Erase tasks. If parameters related to other task types are configured, the system will automatically ignore them.

     */
    public String getMPSProcessMediaParams() {
        return this.MPSProcessMediaParams;
    }

    /**
     * Set This parameter is used for passing through to media processing service (MPS) so that video processing tasks can be triggered from VOD.
For detailed information on video processing parameters, please refer to [MPS Initiate Media Processing](https://www.tencentcloud.com/document/product/1041/33640). 
Instructions: 
1. Currently, only the AiAnalysisTask parameter in the MPS "ProcessMedia" API needs to be configured. Other parameters are not required. If other parameters are included, the system will automatically ignore them. 
2. Currently, this is the only method used to initiate Smart Erase tasks. If parameters related to other task types are configured, the system will automatically ignore them.

     * @param MPSProcessMediaParams This parameter is used for passing through to media processing service (MPS) so that video processing tasks can be triggered from VOD.
For detailed information on video processing parameters, please refer to [MPS Initiate Media Processing](https://www.tencentcloud.com/document/product/1041/33640). 
Instructions: 
1. Currently, only the AiAnalysisTask parameter in the MPS "ProcessMedia" API needs to be configured. Other parameters are not required. If other parameters are included, the system will automatically ignore them. 
2. Currently, this is the only method used to initiate Smart Erase tasks. If parameters related to other task types are configured, the system will automatically ignore them.

     */
    public void setMPSProcessMediaParams(String MPSProcessMediaParams) {
        this.MPSProcessMediaParams = MPSProcessMediaParams;
    }

    public ProcessMediaByMPSRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessMediaByMPSRequest(ProcessMediaByMPSRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.MPSProcessMediaParams != null) {
            this.MPSProcessMediaParams = new String(source.MPSProcessMediaParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "MPSProcessMediaParams", this.MPSProcessMediaParams);

    }
}

