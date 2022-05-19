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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMediaProcessUsageDataRequest extends AbstractModel{

    /**
    * Start date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). The end date must be on or after the start date.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The type of media processing task. Valid values:
<li>Transcoding: General transcoding</li>
<li>Transcoding-TESHD: TESHD transcoding</li>
<li>Editing: Video editing</li>
<li>Editing-TESHD: TESHD editing</li>
<li>AdaptiveBitrateStreaming: Adaptive bitrate streaming</li>
<li>ContentAudit: Content moderation</li>
<li>RemoveWatermark: Watermark removal</li>
<li>Transcode: Transcoding, including general transcoding, TESHD transcoding, and video editing. This value is not recommended.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Start date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return StartTime Start date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param StartTime Start date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). The end date must be on or after the start date. 
     * @return EndTime End date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). The end date must be on or after the start date.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). The end date must be on or after the start date.
     * @param EndTime End date in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). The end date must be on or after the start date.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The type of media processing task. Valid values:
<li>Transcoding: General transcoding</li>
<li>Transcoding-TESHD: TESHD transcoding</li>
<li>Editing: Video editing</li>
<li>Editing-TESHD: TESHD editing</li>
<li>AdaptiveBitrateStreaming: Adaptive bitrate streaming</li>
<li>ContentAudit: Content moderation</li>
<li>RemoveWatermark: Watermark removal</li>
<li>Transcode: Transcoding, including general transcoding, TESHD transcoding, and video editing. This value is not recommended.</li> 
     * @return Type The type of media processing task. Valid values:
<li>Transcoding: General transcoding</li>
<li>Transcoding-TESHD: TESHD transcoding</li>
<li>Editing: Video editing</li>
<li>Editing-TESHD: TESHD editing</li>
<li>AdaptiveBitrateStreaming: Adaptive bitrate streaming</li>
<li>ContentAudit: Content moderation</li>
<li>RemoveWatermark: Watermark removal</li>
<li>Transcode: Transcoding, including general transcoding, TESHD transcoding, and video editing. This value is not recommended.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The type of media processing task. Valid values:
<li>Transcoding: General transcoding</li>
<li>Transcoding-TESHD: TESHD transcoding</li>
<li>Editing: Video editing</li>
<li>Editing-TESHD: TESHD editing</li>
<li>AdaptiveBitrateStreaming: Adaptive bitrate streaming</li>
<li>ContentAudit: Content moderation</li>
<li>RemoveWatermark: Watermark removal</li>
<li>Transcode: Transcoding, including general transcoding, TESHD transcoding, and video editing. This value is not recommended.</li>
     * @param Type The type of media processing task. Valid values:
<li>Transcoding: General transcoding</li>
<li>Transcoding-TESHD: TESHD transcoding</li>
<li>Editing: Video editing</li>
<li>Editing-TESHD: TESHD editing</li>
<li>AdaptiveBitrateStreaming: Adaptive bitrate streaming</li>
<li>ContentAudit: Content moderation</li>
<li>RemoveWatermark: Watermark removal</li>
<li>Transcode: Transcoding, including general transcoding, TESHD transcoding, and video editing. This value is not recommended.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty. 
     * @return SubAppId [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     * @param SubAppId [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public DescribeMediaProcessUsageDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMediaProcessUsageDataRequest(DescribeMediaProcessUsageDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

