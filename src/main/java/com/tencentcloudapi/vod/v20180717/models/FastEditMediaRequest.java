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

public class FastEditMediaRequest extends AbstractModel {

    /**
    * Input media file information. Supports up to 100 incoming media.
    */
    @SerializedName("FileInfos")
    @Expose
    private FastEditMediaFileInfo [] FileInfos;

    /**
    * ClipMode indicates whether to include a shard when the editing time point falls in the middle of a TS segment. There are two parameter values: <li>StartInclusiveEndInclusive: When both the start time point and end time point fall in the middle of a shard, the shard will be included;</li> <li>StartInclusiveEndExclusive: When the start time point falls in the middle of a shard, the shard will be included; when the end time point falls in the middle of a shard, the shard will not be included.</li> Default value: StartInclusiveEndInclusive.
    */
    @SerializedName("ClipMode")
    @Expose
    private String ClipMode;

    /**
    * <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Input media file information. Supports up to 100 incoming media. 
     * @return FileInfos Input media file information. Supports up to 100 incoming media.
     */
    public FastEditMediaFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set Input media file information. Supports up to 100 incoming media.
     * @param FileInfos Input media file information. Supports up to 100 incoming media.
     */
    public void setFileInfos(FastEditMediaFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get ClipMode indicates whether to include a shard when the editing time point falls in the middle of a TS segment. There are two parameter values: <li>StartInclusiveEndInclusive: When both the start time point and end time point fall in the middle of a shard, the shard will be included;</li> <li>StartInclusiveEndExclusive: When the start time point falls in the middle of a shard, the shard will be included; when the end time point falls in the middle of a shard, the shard will not be included.</li> Default value: StartInclusiveEndInclusive. 
     * @return ClipMode ClipMode indicates whether to include a shard when the editing time point falls in the middle of a TS segment. There are two parameter values: <li>StartInclusiveEndInclusive: When both the start time point and end time point fall in the middle of a shard, the shard will be included;</li> <li>StartInclusiveEndExclusive: When the start time point falls in the middle of a shard, the shard will be included; when the end time point falls in the middle of a shard, the shard will not be included.</li> Default value: StartInclusiveEndInclusive.
     */
    public String getClipMode() {
        return this.ClipMode;
    }

    /**
     * Set ClipMode indicates whether to include a shard when the editing time point falls in the middle of a TS segment. There are two parameter values: <li>StartInclusiveEndInclusive: When both the start time point and end time point fall in the middle of a shard, the shard will be included;</li> <li>StartInclusiveEndExclusive: When the start time point falls in the middle of a shard, the shard will be included; when the end time point falls in the middle of a shard, the shard will not be included.</li> Default value: StartInclusiveEndInclusive.
     * @param ClipMode ClipMode indicates whether to include a shard when the editing time point falls in the middle of a TS segment. There are two parameter values: <li>StartInclusiveEndInclusive: When both the start time point and end time point fall in the middle of a shard, the shard will be included;</li> <li>StartInclusiveEndExclusive: When the start time point falls in the middle of a shard, the shard will be included; when the end time point falls in the middle of a shard, the shard will not be included.</li> Default value: StartInclusiveEndInclusive.
     */
    public void setClipMode(String ClipMode) {
        this.ClipMode = ClipMode;
    }

    /**
     * Get <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public FastEditMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FastEditMediaRequest(FastEditMediaRequest source) {
        if (source.FileInfos != null) {
            this.FileInfos = new FastEditMediaFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new FastEditMediaFileInfo(source.FileInfos[i]);
            }
        }
        if (source.ClipMode != null) {
            this.ClipMode = new String(source.ClipMode);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamSimple(map, prefix + "ClipMode", this.ClipMode);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

