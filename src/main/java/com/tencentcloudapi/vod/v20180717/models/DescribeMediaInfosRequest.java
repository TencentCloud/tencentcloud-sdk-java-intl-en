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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMediaInfosRequest extends AbstractModel {

    /**
    * List of media file IDs. N starts from 0 and can be up to 19.
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * The types of information to return. You can specify multiple information types. `N` starts from 0. If you do not specify this parameter, all information will be returned. The supported information types are as follows:
<li>`basicInfo` (basic information)</li>
<li>`metaData` (video metadata)</li>
<li>`transcodeInfo` (transcoding information)</li>
<li>`animatedGraphicsInfo` (animated image information)</li>
<li>`imageSpriteInfo` (image sprite information)</li>
<li>`snapshotByTimeOffsetInfo` (time point screenshot information)</li>
<li>`sampleSnapshotInfo` (sampled screenshot information)</li>
<li>`keyFrameDescInfo` (timestamp information)</li>
<li>`adaptiveDynamicStreamingInfo` (adaptive bitrate information)</li>
<li>`miniProgramReviewInfo` (WeChat Mini Program moderation information)</li>
<li>`subtitleInfo` (subtitle information)</li>
<li>`reviewInfo` (moderation information)</li>
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
     * Get List of media file IDs. N starts from 0 and can be up to 19. 
     * @return FileIds List of media file IDs. N starts from 0 and can be up to 19.
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set List of media file IDs. N starts from 0 and can be up to 19.
     * @param FileIds List of media file IDs. N starts from 0 and can be up to 19.
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b> 
     * @return SubAppId <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     * @param SubAppId <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get The types of information to return. You can specify multiple information types. `N` starts from 0. If you do not specify this parameter, all information will be returned. The supported information types are as follows:
<li>`basicInfo` (basic information)</li>
<li>`metaData` (video metadata)</li>
<li>`transcodeInfo` (transcoding information)</li>
<li>`animatedGraphicsInfo` (animated image information)</li>
<li>`imageSpriteInfo` (image sprite information)</li>
<li>`snapshotByTimeOffsetInfo` (time point screenshot information)</li>
<li>`sampleSnapshotInfo` (sampled screenshot information)</li>
<li>`keyFrameDescInfo` (timestamp information)</li>
<li>`adaptiveDynamicStreamingInfo` (adaptive bitrate information)</li>
<li>`miniProgramReviewInfo` (WeChat Mini Program moderation information)</li>
<li>`subtitleInfo` (subtitle information)</li>
<li>`reviewInfo` (moderation information)</li> 
     * @return Filters The types of information to return. You can specify multiple information types. `N` starts from 0. If you do not specify this parameter, all information will be returned. The supported information types are as follows:
<li>`basicInfo` (basic information)</li>
<li>`metaData` (video metadata)</li>
<li>`transcodeInfo` (transcoding information)</li>
<li>`animatedGraphicsInfo` (animated image information)</li>
<li>`imageSpriteInfo` (image sprite information)</li>
<li>`snapshotByTimeOffsetInfo` (time point screenshot information)</li>
<li>`sampleSnapshotInfo` (sampled screenshot information)</li>
<li>`keyFrameDescInfo` (timestamp information)</li>
<li>`adaptiveDynamicStreamingInfo` (adaptive bitrate information)</li>
<li>`miniProgramReviewInfo` (WeChat Mini Program moderation information)</li>
<li>`subtitleInfo` (subtitle information)</li>
<li>`reviewInfo` (moderation information)</li>
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set The types of information to return. You can specify multiple information types. `N` starts from 0. If you do not specify this parameter, all information will be returned. The supported information types are as follows:
<li>`basicInfo` (basic information)</li>
<li>`metaData` (video metadata)</li>
<li>`transcodeInfo` (transcoding information)</li>
<li>`animatedGraphicsInfo` (animated image information)</li>
<li>`imageSpriteInfo` (image sprite information)</li>
<li>`snapshotByTimeOffsetInfo` (time point screenshot information)</li>
<li>`sampleSnapshotInfo` (sampled screenshot information)</li>
<li>`keyFrameDescInfo` (timestamp information)</li>
<li>`adaptiveDynamicStreamingInfo` (adaptive bitrate information)</li>
<li>`miniProgramReviewInfo` (WeChat Mini Program moderation information)</li>
<li>`subtitleInfo` (subtitle information)</li>
<li>`reviewInfo` (moderation information)</li>
     * @param Filters The types of information to return. You can specify multiple information types. `N` starts from 0. If you do not specify this parameter, all information will be returned. The supported information types are as follows:
<li>`basicInfo` (basic information)</li>
<li>`metaData` (video metadata)</li>
<li>`transcodeInfo` (transcoding information)</li>
<li>`animatedGraphicsInfo` (animated image information)</li>
<li>`imageSpriteInfo` (image sprite information)</li>
<li>`snapshotByTimeOffsetInfo` (time point screenshot information)</li>
<li>`sampleSnapshotInfo` (sampled screenshot information)</li>
<li>`keyFrameDescInfo` (timestamp information)</li>
<li>`adaptiveDynamicStreamingInfo` (adaptive bitrate information)</li>
<li>`miniProgramReviewInfo` (WeChat Mini Program moderation information)</li>
<li>`subtitleInfo` (subtitle information)</li>
<li>`reviewInfo` (moderation information)</li>
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    public DescribeMediaInfosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMediaInfosRequest(DescribeMediaInfosRequest source) {
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Filters != null) {
            this.Filters = new String[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new String(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArraySimple(map, prefix + "Filters.", this.Filters);

    }
}

