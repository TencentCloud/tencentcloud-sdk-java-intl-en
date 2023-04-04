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

public class SearchMediaRequest extends AbstractModel{

    /**
    * <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * File ID set. Any element in the set can be matched.
<li>Array length limit: 10.</li>
<li>ID length limit: 40 characters.</li>
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * The file names to use for fuzzy search, which are sorted by relevance in descending order.
<li>Name length limit: 100 characters.</li>
<li>Array length limit: 10</li>
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * The file name prefixes to search.
<li>Prefix length limit: 100 characters.</li>
<li>Array length limit: 10.</li>
    */
    @SerializedName("NamePrefixes")
    @Expose
    private String [] NamePrefixes;

    /**
    * File description set. Media file descriptions are fuzzily matched. The higher the match rate, the higher-ranked the result.
<li>Length limit for a single description: 100 characters</li>
<li>Array length limit: 10</li>
    */
    @SerializedName("Descriptions")
    @Expose
    private String [] Descriptions;

    /**
    * Category ID set. The categories of the specified IDs and all subcategories in the set are matched.
<li>Array length limit: 10.</li>
    */
    @SerializedName("ClassIds")
    @Expose
    private Long [] ClassIds;

    /**
    * The tags to search. A file is considered a match if it has any of the tags specified.
<li>Tag length limit: 32 characters.</li>
<li>Array length limit: 16.</li>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * File type. Any element in the set can be matched.
<li>Video: video file</li>
<li>Audio: audio file</li>
<li>Image: image file</li>
    */
    @SerializedName("Categories")
    @Expose
    private String [] Categories;

    /**
    * Media file source set. For valid values, please see [SourceType](https://intl.cloud.tencent.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData).
<li>Array length limit: 10.</li>
    */
    @SerializedName("SourceTypes")
    @Expose
    private String [] SourceTypes;

    /**
    * The live stream code array. A media file will be returned if it matches any element in the array.
<li>Array length limit: 10</li>
    */
    @SerializedName("StreamIds")
    @Expose
    private String [] StreamIds;

    /**
    * Matches files created within the time period.
<li>Includes specified start and end points in time.</li>
    */
    @SerializedName("CreateTime")
    @Expose
    private TimeRange CreateTime;

    /**
    * Files whose expiration time points are within the specified time range will be returned. Expired files will not be returned.
<li>The files whose expiration time points are on the start or end time of the specified range will also be returned.</li>
    */
    @SerializedName("ExpireTime")
    @Expose
    private TimeRange ExpireTime;

    /**
    * Sorting order.
<li>Valid value of `Sort.Field`: CreateTime.</li>
<li>If `Text`, `Names`, or `Descriptions` is not empty, the `Sort.Field` field will not take effect, and the search results will be sorted by match rate.</li>
    */
    @SerializedName("Sort")
    @Expose
    private SortBy Sort;

    /**
    * <div id="p_offset">Start offset of a paged return. Default value: 0. Entries from No. "Offset" to No. "Offset + Limit - 1" will be returned.
<li>Value range: "Offset + Limit" cannot be more than 5,000. (For more information, please see <a href="#maxResultsDesc">Limit on the Number of Results Returned by API</a>)</li></div>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <div id="p_limit">Number of entries returned by a paged query. Default value: 10. Entries from No. "Offset" to No. "Offset + Limit - 1" will be returned.
<li>Value range: "Offset + Limit" cannot be more than 5,000. (For more information, please see <a href="#maxResultsDesc">Limit on the Number of Results Returned by API</a>)</li></div>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Specifies information entry that needs to be returned for all media files. Multiple entries can be specified simultaneously. N starts from 0. If this field is left empty, all information entries will be returned by default. Valid values:
<li>basicInfo (basic video information).</li>
<li>metaData (video metadata).</li>
<li>transcodeInfo (result information of video transcoding).</li>
<li>animatedGraphicsInfo (result information of animated image generating task).</li>
<li>imageSpriteInfo (image sprite information).</li>
<li>snapshotByTimeOffsetInfo (point-in-time screenshot information).</li>
<li>sampleSnapshotInfo (sampled screenshot information).</li>
<li>keyFrameDescInfo (timestamp information).</li>
<li>adaptiveDynamicStreamingInfo (information of adaptive bitrate streaming).</li>
<li>miniProgramReviewInfo (WeChat Mini Program audit information).</li>
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
    * Regions where media files are stored, such as `ap-chongqing`. For more regions, see [Storage Regions](https://intl.cloud.tencent.com/document/product/266/9760?from_cn_redirect=1#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8).
<li>Length limit for a single region: 20 characters</li>
<li>Array length limit: 20</li>
    */
    @SerializedName("StorageRegions")
    @Expose
    private String [] StorageRegions;

    /**
    * An array of storage classes. Valid values:
<li>STANDARD</li>
<li>STANDARD_IA</li>
<li>ARCHIVE</li>
<li>DEEP_ARCHIVE</li>
    */
    @SerializedName("StorageClasses")
    @Expose
    private String [] StorageClasses;

    /**
    * The file formats.
<li>Array length limit: 10</li>
    */
    @SerializedName("MediaTypes")
    @Expose
    private String [] MediaTypes;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * 
    */
    @SerializedName("ReviewResults")
    @Expose
    private String [] ReviewResults;

    /**
    * The TRTC application IDs. Any file that matches one of the application IDs will be returned.
<li>Array length limit: 10</li>
    */
    @SerializedName("TrtcSdkAppIds")
    @Expose
    private Long [] TrtcSdkAppIds;

    /**
    * The TRTC room IDs. Any file that matches one of the room IDs will be returned.
<li>Element length limit: 64 characters.</li>
<li>Array length limit: 10.</li>
    */
    @SerializedName("TrtcRoomIds")
    @Expose
    private String [] TrtcRoomIds;

    /**
    * (This is not recommended. `Names`, `NamePrefixes`, or `Descriptions` should be used instead)
Search text, which fuzzily matches the media file name or description. The more matching items and the higher the match rate, the higher-ranked the result. It can contain up to 64 characters.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * (This is not recommended. `SourceTypes` should be used instead)
Media file source. For valid values, please see [SourceType](https://intl.cloud.tencent.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData).
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * (Not recommended. Consider using `StreamIds` instead.)
The live stream code.
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * (This is not recommended. `CreateTime` should be used instead)
Start time in the creation time range.
<li>After or at the start time.</li>
<li>If `CreateTime.After` also exists, it will be used first.</li>
<li>In ISO 8601 format. For more information, please see [ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).</li>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * (This is not recommended. `CreateTime` should be used instead)
End time in the creation time range.
<li>Before the end time.</li>
<li>If `CreateTime.Before` also exists, it will be used first.</li>
<li>In ISO 8601 format. For more information, please see [ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).</li>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * This parameter is invalid now.
    */
    @SerializedName("Vids")
    @Expose
    private String [] Vids;

    /**
    * This parameter is invalid now.
    */
    @SerializedName("Vid")
    @Expose
    private String Vid;

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
     * Get File ID set. Any element in the set can be matched.
<li>Array length limit: 10.</li>
<li>ID length limit: 40 characters.</li> 
     * @return FileIds File ID set. Any element in the set can be matched.
<li>Array length limit: 10.</li>
<li>ID length limit: 40 characters.</li>
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set File ID set. Any element in the set can be matched.
<li>Array length limit: 10.</li>
<li>ID length limit: 40 characters.</li>
     * @param FileIds File ID set. Any element in the set can be matched.
<li>Array length limit: 10.</li>
<li>ID length limit: 40 characters.</li>
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get The file names to use for fuzzy search, which are sorted by relevance in descending order.
<li>Name length limit: 100 characters.</li>
<li>Array length limit: 10</li> 
     * @return Names The file names to use for fuzzy search, which are sorted by relevance in descending order.
<li>Name length limit: 100 characters.</li>
<li>Array length limit: 10</li>
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set The file names to use for fuzzy search, which are sorted by relevance in descending order.
<li>Name length limit: 100 characters.</li>
<li>Array length limit: 10</li>
     * @param Names The file names to use for fuzzy search, which are sorted by relevance in descending order.
<li>Name length limit: 100 characters.</li>
<li>Array length limit: 10</li>
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get The file name prefixes to search.
<li>Prefix length limit: 100 characters.</li>
<li>Array length limit: 10.</li> 
     * @return NamePrefixes The file name prefixes to search.
<li>Prefix length limit: 100 characters.</li>
<li>Array length limit: 10.</li>
     */
    public String [] getNamePrefixes() {
        return this.NamePrefixes;
    }

    /**
     * Set The file name prefixes to search.
<li>Prefix length limit: 100 characters.</li>
<li>Array length limit: 10.</li>
     * @param NamePrefixes The file name prefixes to search.
<li>Prefix length limit: 100 characters.</li>
<li>Array length limit: 10.</li>
     */
    public void setNamePrefixes(String [] NamePrefixes) {
        this.NamePrefixes = NamePrefixes;
    }

    /**
     * Get File description set. Media file descriptions are fuzzily matched. The higher the match rate, the higher-ranked the result.
<li>Length limit for a single description: 100 characters</li>
<li>Array length limit: 10</li> 
     * @return Descriptions File description set. Media file descriptions are fuzzily matched. The higher the match rate, the higher-ranked the result.
<li>Length limit for a single description: 100 characters</li>
<li>Array length limit: 10</li>
     */
    public String [] getDescriptions() {
        return this.Descriptions;
    }

    /**
     * Set File description set. Media file descriptions are fuzzily matched. The higher the match rate, the higher-ranked the result.
<li>Length limit for a single description: 100 characters</li>
<li>Array length limit: 10</li>
     * @param Descriptions File description set. Media file descriptions are fuzzily matched. The higher the match rate, the higher-ranked the result.
<li>Length limit for a single description: 100 characters</li>
<li>Array length limit: 10</li>
     */
    public void setDescriptions(String [] Descriptions) {
        this.Descriptions = Descriptions;
    }

    /**
     * Get Category ID set. The categories of the specified IDs and all subcategories in the set are matched.
<li>Array length limit: 10.</li> 
     * @return ClassIds Category ID set. The categories of the specified IDs and all subcategories in the set are matched.
<li>Array length limit: 10.</li>
     */
    public Long [] getClassIds() {
        return this.ClassIds;
    }

    /**
     * Set Category ID set. The categories of the specified IDs and all subcategories in the set are matched.
<li>Array length limit: 10.</li>
     * @param ClassIds Category ID set. The categories of the specified IDs and all subcategories in the set are matched.
<li>Array length limit: 10.</li>
     */
    public void setClassIds(Long [] ClassIds) {
        this.ClassIds = ClassIds;
    }

    /**
     * Get The tags to search. A file is considered a match if it has any of the tags specified.
<li>Tag length limit: 32 characters.</li>
<li>Array length limit: 16.</li> 
     * @return Tags The tags to search. A file is considered a match if it has any of the tags specified.
<li>Tag length limit: 32 characters.</li>
<li>Array length limit: 16.</li>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set The tags to search. A file is considered a match if it has any of the tags specified.
<li>Tag length limit: 32 characters.</li>
<li>Array length limit: 16.</li>
     * @param Tags The tags to search. A file is considered a match if it has any of the tags specified.
<li>Tag length limit: 32 characters.</li>
<li>Array length limit: 16.</li>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get File type. Any element in the set can be matched.
<li>Video: video file</li>
<li>Audio: audio file</li>
<li>Image: image file</li> 
     * @return Categories File type. Any element in the set can be matched.
<li>Video: video file</li>
<li>Audio: audio file</li>
<li>Image: image file</li>
     */
    public String [] getCategories() {
        return this.Categories;
    }

    /**
     * Set File type. Any element in the set can be matched.
<li>Video: video file</li>
<li>Audio: audio file</li>
<li>Image: image file</li>
     * @param Categories File type. Any element in the set can be matched.
<li>Video: video file</li>
<li>Audio: audio file</li>
<li>Image: image file</li>
     */
    public void setCategories(String [] Categories) {
        this.Categories = Categories;
    }

    /**
     * Get Media file source set. For valid values, please see [SourceType](https://intl.cloud.tencent.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData).
<li>Array length limit: 10.</li> 
     * @return SourceTypes Media file source set. For valid values, please see [SourceType](https://intl.cloud.tencent.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData).
<li>Array length limit: 10.</li>
     */
    public String [] getSourceTypes() {
        return this.SourceTypes;
    }

    /**
     * Set Media file source set. For valid values, please see [SourceType](https://intl.cloud.tencent.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData).
<li>Array length limit: 10.</li>
     * @param SourceTypes Media file source set. For valid values, please see [SourceType](https://intl.cloud.tencent.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData).
<li>Array length limit: 10.</li>
     */
    public void setSourceTypes(String [] SourceTypes) {
        this.SourceTypes = SourceTypes;
    }

    /**
     * Get The live stream code array. A media file will be returned if it matches any element in the array.
<li>Array length limit: 10</li> 
     * @return StreamIds The live stream code array. A media file will be returned if it matches any element in the array.
<li>Array length limit: 10</li>
     */
    public String [] getStreamIds() {
        return this.StreamIds;
    }

    /**
     * Set The live stream code array. A media file will be returned if it matches any element in the array.
<li>Array length limit: 10</li>
     * @param StreamIds The live stream code array. A media file will be returned if it matches any element in the array.
<li>Array length limit: 10</li>
     */
    public void setStreamIds(String [] StreamIds) {
        this.StreamIds = StreamIds;
    }

    /**
     * Get Matches files created within the time period.
<li>Includes specified start and end points in time.</li> 
     * @return CreateTime Matches files created within the time period.
<li>Includes specified start and end points in time.</li>
     */
    public TimeRange getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Matches files created within the time period.
<li>Includes specified start and end points in time.</li>
     * @param CreateTime Matches files created within the time period.
<li>Includes specified start and end points in time.</li>
     */
    public void setCreateTime(TimeRange CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Files whose expiration time points are within the specified time range will be returned. Expired files will not be returned.
<li>The files whose expiration time points are on the start or end time of the specified range will also be returned.</li> 
     * @return ExpireTime Files whose expiration time points are within the specified time range will be returned. Expired files will not be returned.
<li>The files whose expiration time points are on the start or end time of the specified range will also be returned.</li>
     */
    public TimeRange getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Files whose expiration time points are within the specified time range will be returned. Expired files will not be returned.
<li>The files whose expiration time points are on the start or end time of the specified range will also be returned.</li>
     * @param ExpireTime Files whose expiration time points are within the specified time range will be returned. Expired files will not be returned.
<li>The files whose expiration time points are on the start or end time of the specified range will also be returned.</li>
     */
    public void setExpireTime(TimeRange ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Sorting order.
<li>Valid value of `Sort.Field`: CreateTime.</li>
<li>If `Text`, `Names`, or `Descriptions` is not empty, the `Sort.Field` field will not take effect, and the search results will be sorted by match rate.</li> 
     * @return Sort Sorting order.
<li>Valid value of `Sort.Field`: CreateTime.</li>
<li>If `Text`, `Names`, or `Descriptions` is not empty, the `Sort.Field` field will not take effect, and the search results will be sorted by match rate.</li>
     */
    public SortBy getSort() {
        return this.Sort;
    }

    /**
     * Set Sorting order.
<li>Valid value of `Sort.Field`: CreateTime.</li>
<li>If `Text`, `Names`, or `Descriptions` is not empty, the `Sort.Field` field will not take effect, and the search results will be sorted by match rate.</li>
     * @param Sort Sorting order.
<li>Valid value of `Sort.Field`: CreateTime.</li>
<li>If `Text`, `Names`, or `Descriptions` is not empty, the `Sort.Field` field will not take effect, and the search results will be sorted by match rate.</li>
     */
    public void setSort(SortBy Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <div id="p_offset">Start offset of a paged return. Default value: 0. Entries from No. "Offset" to No. "Offset + Limit - 1" will be returned.
<li>Value range: "Offset + Limit" cannot be more than 5,000. (For more information, please see <a href="#maxResultsDesc">Limit on the Number of Results Returned by API</a>)</li></div> 
     * @return Offset <div id="p_offset">Start offset of a paged return. Default value: 0. Entries from No. "Offset" to No. "Offset + Limit - 1" will be returned.
<li>Value range: "Offset + Limit" cannot be more than 5,000. (For more information, please see <a href="#maxResultsDesc">Limit on the Number of Results Returned by API</a>)</li></div>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <div id="p_offset">Start offset of a paged return. Default value: 0. Entries from No. "Offset" to No. "Offset + Limit - 1" will be returned.
<li>Value range: "Offset + Limit" cannot be more than 5,000. (For more information, please see <a href="#maxResultsDesc">Limit on the Number of Results Returned by API</a>)</li></div>
     * @param Offset <div id="p_offset">Start offset of a paged return. Default value: 0. Entries from No. "Offset" to No. "Offset + Limit - 1" will be returned.
<li>Value range: "Offset + Limit" cannot be more than 5,000. (For more information, please see <a href="#maxResultsDesc">Limit on the Number of Results Returned by API</a>)</li></div>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <div id="p_limit">Number of entries returned by a paged query. Default value: 10. Entries from No. "Offset" to No. "Offset + Limit - 1" will be returned.
<li>Value range: "Offset + Limit" cannot be more than 5,000. (For more information, please see <a href="#maxResultsDesc">Limit on the Number of Results Returned by API</a>)</li></div> 
     * @return Limit <div id="p_limit">Number of entries returned by a paged query. Default value: 10. Entries from No. "Offset" to No. "Offset + Limit - 1" will be returned.
<li>Value range: "Offset + Limit" cannot be more than 5,000. (For more information, please see <a href="#maxResultsDesc">Limit on the Number of Results Returned by API</a>)</li></div>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <div id="p_limit">Number of entries returned by a paged query. Default value: 10. Entries from No. "Offset" to No. "Offset + Limit - 1" will be returned.
<li>Value range: "Offset + Limit" cannot be more than 5,000. (For more information, please see <a href="#maxResultsDesc">Limit on the Number of Results Returned by API</a>)</li></div>
     * @param Limit <div id="p_limit">Number of entries returned by a paged query. Default value: 10. Entries from No. "Offset" to No. "Offset + Limit - 1" will be returned.
<li>Value range: "Offset + Limit" cannot be more than 5,000. (For more information, please see <a href="#maxResultsDesc">Limit on the Number of Results Returned by API</a>)</li></div>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Specifies information entry that needs to be returned for all media files. Multiple entries can be specified simultaneously. N starts from 0. If this field is left empty, all information entries will be returned by default. Valid values:
<li>basicInfo (basic video information).</li>
<li>metaData (video metadata).</li>
<li>transcodeInfo (result information of video transcoding).</li>
<li>animatedGraphicsInfo (result information of animated image generating task).</li>
<li>imageSpriteInfo (image sprite information).</li>
<li>snapshotByTimeOffsetInfo (point-in-time screenshot information).</li>
<li>sampleSnapshotInfo (sampled screenshot information).</li>
<li>keyFrameDescInfo (timestamp information).</li>
<li>adaptiveDynamicStreamingInfo (information of adaptive bitrate streaming).</li>
<li>miniProgramReviewInfo (WeChat Mini Program audit information).</li> 
     * @return Filters Specifies information entry that needs to be returned for all media files. Multiple entries can be specified simultaneously. N starts from 0. If this field is left empty, all information entries will be returned by default. Valid values:
<li>basicInfo (basic video information).</li>
<li>metaData (video metadata).</li>
<li>transcodeInfo (result information of video transcoding).</li>
<li>animatedGraphicsInfo (result information of animated image generating task).</li>
<li>imageSpriteInfo (image sprite information).</li>
<li>snapshotByTimeOffsetInfo (point-in-time screenshot information).</li>
<li>sampleSnapshotInfo (sampled screenshot information).</li>
<li>keyFrameDescInfo (timestamp information).</li>
<li>adaptiveDynamicStreamingInfo (information of adaptive bitrate streaming).</li>
<li>miniProgramReviewInfo (WeChat Mini Program audit information).</li>
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Specifies information entry that needs to be returned for all media files. Multiple entries can be specified simultaneously. N starts from 0. If this field is left empty, all information entries will be returned by default. Valid values:
<li>basicInfo (basic video information).</li>
<li>metaData (video metadata).</li>
<li>transcodeInfo (result information of video transcoding).</li>
<li>animatedGraphicsInfo (result information of animated image generating task).</li>
<li>imageSpriteInfo (image sprite information).</li>
<li>snapshotByTimeOffsetInfo (point-in-time screenshot information).</li>
<li>sampleSnapshotInfo (sampled screenshot information).</li>
<li>keyFrameDescInfo (timestamp information).</li>
<li>adaptiveDynamicStreamingInfo (information of adaptive bitrate streaming).</li>
<li>miniProgramReviewInfo (WeChat Mini Program audit information).</li>
     * @param Filters Specifies information entry that needs to be returned for all media files. Multiple entries can be specified simultaneously. N starts from 0. If this field is left empty, all information entries will be returned by default. Valid values:
<li>basicInfo (basic video information).</li>
<li>metaData (video metadata).</li>
<li>transcodeInfo (result information of video transcoding).</li>
<li>animatedGraphicsInfo (result information of animated image generating task).</li>
<li>imageSpriteInfo (image sprite information).</li>
<li>snapshotByTimeOffsetInfo (point-in-time screenshot information).</li>
<li>sampleSnapshotInfo (sampled screenshot information).</li>
<li>keyFrameDescInfo (timestamp information).</li>
<li>adaptiveDynamicStreamingInfo (information of adaptive bitrate streaming).</li>
<li>miniProgramReviewInfo (WeChat Mini Program audit information).</li>
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Regions where media files are stored, such as `ap-chongqing`. For more regions, see [Storage Regions](https://intl.cloud.tencent.com/document/product/266/9760?from_cn_redirect=1#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8).
<li>Length limit for a single region: 20 characters</li>
<li>Array length limit: 20</li> 
     * @return StorageRegions Regions where media files are stored, such as `ap-chongqing`. For more regions, see [Storage Regions](https://intl.cloud.tencent.com/document/product/266/9760?from_cn_redirect=1#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8).
<li>Length limit for a single region: 20 characters</li>
<li>Array length limit: 20</li>
     */
    public String [] getStorageRegions() {
        return this.StorageRegions;
    }

    /**
     * Set Regions where media files are stored, such as `ap-chongqing`. For more regions, see [Storage Regions](https://intl.cloud.tencent.com/document/product/266/9760?from_cn_redirect=1#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8).
<li>Length limit for a single region: 20 characters</li>
<li>Array length limit: 20</li>
     * @param StorageRegions Regions where media files are stored, such as `ap-chongqing`. For more regions, see [Storage Regions](https://intl.cloud.tencent.com/document/product/266/9760?from_cn_redirect=1#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8).
<li>Length limit for a single region: 20 characters</li>
<li>Array length limit: 20</li>
     */
    public void setStorageRegions(String [] StorageRegions) {
        this.StorageRegions = StorageRegions;
    }

    /**
     * Get An array of storage classes. Valid values:
<li>STANDARD</li>
<li>STANDARD_IA</li>
<li>ARCHIVE</li>
<li>DEEP_ARCHIVE</li> 
     * @return StorageClasses An array of storage classes. Valid values:
<li>STANDARD</li>
<li>STANDARD_IA</li>
<li>ARCHIVE</li>
<li>DEEP_ARCHIVE</li>
     */
    public String [] getStorageClasses() {
        return this.StorageClasses;
    }

    /**
     * Set An array of storage classes. Valid values:
<li>STANDARD</li>
<li>STANDARD_IA</li>
<li>ARCHIVE</li>
<li>DEEP_ARCHIVE</li>
     * @param StorageClasses An array of storage classes. Valid values:
<li>STANDARD</li>
<li>STANDARD_IA</li>
<li>ARCHIVE</li>
<li>DEEP_ARCHIVE</li>
     */
    public void setStorageClasses(String [] StorageClasses) {
        this.StorageClasses = StorageClasses;
    }

    /**
     * Get The file formats.
<li>Array length limit: 10</li> 
     * @return MediaTypes The file formats.
<li>Array length limit: 10</li>
     */
    public String [] getMediaTypes() {
        return this.MediaTypes;
    }

    /**
     * Set The file formats.
<li>Array length limit: 10</li>
     * @param MediaTypes The file formats.
<li>Array length limit: 10</li>
     */
    public void setMediaTypes(String [] MediaTypes) {
        this.MediaTypes = MediaTypes;
    }

    /**
     * Get  
     * @return Status 
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return ReviewResults 
     */
    public String [] getReviewResults() {
        return this.ReviewResults;
    }

    /**
     * Set 
     * @param ReviewResults 
     */
    public void setReviewResults(String [] ReviewResults) {
        this.ReviewResults = ReviewResults;
    }

    /**
     * Get The TRTC application IDs. Any file that matches one of the application IDs will be returned.
<li>Array length limit: 10</li> 
     * @return TrtcSdkAppIds The TRTC application IDs. Any file that matches one of the application IDs will be returned.
<li>Array length limit: 10</li>
     */
    public Long [] getTrtcSdkAppIds() {
        return this.TrtcSdkAppIds;
    }

    /**
     * Set The TRTC application IDs. Any file that matches one of the application IDs will be returned.
<li>Array length limit: 10</li>
     * @param TrtcSdkAppIds The TRTC application IDs. Any file that matches one of the application IDs will be returned.
<li>Array length limit: 10</li>
     */
    public void setTrtcSdkAppIds(Long [] TrtcSdkAppIds) {
        this.TrtcSdkAppIds = TrtcSdkAppIds;
    }

    /**
     * Get The TRTC room IDs. Any file that matches one of the room IDs will be returned.
<li>Element length limit: 64 characters.</li>
<li>Array length limit: 10.</li> 
     * @return TrtcRoomIds The TRTC room IDs. Any file that matches one of the room IDs will be returned.
<li>Element length limit: 64 characters.</li>
<li>Array length limit: 10.</li>
     */
    public String [] getTrtcRoomIds() {
        return this.TrtcRoomIds;
    }

    /**
     * Set The TRTC room IDs. Any file that matches one of the room IDs will be returned.
<li>Element length limit: 64 characters.</li>
<li>Array length limit: 10.</li>
     * @param TrtcRoomIds The TRTC room IDs. Any file that matches one of the room IDs will be returned.
<li>Element length limit: 64 characters.</li>
<li>Array length limit: 10.</li>
     */
    public void setTrtcRoomIds(String [] TrtcRoomIds) {
        this.TrtcRoomIds = TrtcRoomIds;
    }

    /**
     * Get (This is not recommended. `Names`, `NamePrefixes`, or `Descriptions` should be used instead)
Search text, which fuzzily matches the media file name or description. The more matching items and the higher the match rate, the higher-ranked the result. It can contain up to 64 characters. 
     * @return Text (This is not recommended. `Names`, `NamePrefixes`, or `Descriptions` should be used instead)
Search text, which fuzzily matches the media file name or description. The more matching items and the higher the match rate, the higher-ranked the result. It can contain up to 64 characters.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set (This is not recommended. `Names`, `NamePrefixes`, or `Descriptions` should be used instead)
Search text, which fuzzily matches the media file name or description. The more matching items and the higher the match rate, the higher-ranked the result. It can contain up to 64 characters.
     * @param Text (This is not recommended. `Names`, `NamePrefixes`, or `Descriptions` should be used instead)
Search text, which fuzzily matches the media file name or description. The more matching items and the higher the match rate, the higher-ranked the result. It can contain up to 64 characters.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get (This is not recommended. `SourceTypes` should be used instead)
Media file source. For valid values, please see [SourceType](https://intl.cloud.tencent.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData). 
     * @return SourceType (This is not recommended. `SourceTypes` should be used instead)
Media file source. For valid values, please see [SourceType](https://intl.cloud.tencent.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData).
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set (This is not recommended. `SourceTypes` should be used instead)
Media file source. For valid values, please see [SourceType](https://intl.cloud.tencent.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData).
     * @param SourceType (This is not recommended. `SourceTypes` should be used instead)
Media file source. For valid values, please see [SourceType](https://intl.cloud.tencent.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData).
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get (Not recommended. Consider using `StreamIds` instead.)
The live stream code. 
     * @return StreamId (Not recommended. Consider using `StreamIds` instead.)
The live stream code.
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set (Not recommended. Consider using `StreamIds` instead.)
The live stream code.
     * @param StreamId (Not recommended. Consider using `StreamIds` instead.)
The live stream code.
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get (This is not recommended. `CreateTime` should be used instead)
Start time in the creation time range.
<li>After or at the start time.</li>
<li>If `CreateTime.After` also exists, it will be used first.</li>
<li>In ISO 8601 format. For more information, please see [ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).</li> 
     * @return StartTime (This is not recommended. `CreateTime` should be used instead)
Start time in the creation time range.
<li>After or at the start time.</li>
<li>If `CreateTime.After` also exists, it will be used first.</li>
<li>In ISO 8601 format. For more information, please see [ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set (This is not recommended. `CreateTime` should be used instead)
Start time in the creation time range.
<li>After or at the start time.</li>
<li>If `CreateTime.After` also exists, it will be used first.</li>
<li>In ISO 8601 format. For more information, please see [ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     * @param StartTime (This is not recommended. `CreateTime` should be used instead)
Start time in the creation time range.
<li>After or at the start time.</li>
<li>If `CreateTime.After` also exists, it will be used first.</li>
<li>In ISO 8601 format. For more information, please see [ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get (This is not recommended. `CreateTime` should be used instead)
End time in the creation time range.
<li>Before the end time.</li>
<li>If `CreateTime.Before` also exists, it will be used first.</li>
<li>In ISO 8601 format. For more information, please see [ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).</li> 
     * @return EndTime (This is not recommended. `CreateTime` should be used instead)
End time in the creation time range.
<li>Before the end time.</li>
<li>If `CreateTime.Before` also exists, it will be used first.</li>
<li>In ISO 8601 format. For more information, please see [ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set (This is not recommended. `CreateTime` should be used instead)
End time in the creation time range.
<li>Before the end time.</li>
<li>If `CreateTime.Before` also exists, it will be used first.</li>
<li>In ISO 8601 format. For more information, please see [ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     * @param EndTime (This is not recommended. `CreateTime` should be used instead)
End time in the creation time range.
<li>Before the end time.</li>
<li>If `CreateTime.Before` also exists, it will be used first.</li>
<li>In ISO 8601 format. For more information, please see [ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get This parameter is invalid now. 
     * @return Vids This parameter is invalid now.
     */
    public String [] getVids() {
        return this.Vids;
    }

    /**
     * Set This parameter is invalid now.
     * @param Vids This parameter is invalid now.
     */
    public void setVids(String [] Vids) {
        this.Vids = Vids;
    }

    /**
     * Get This parameter is invalid now. 
     * @return Vid This parameter is invalid now.
     */
    public String getVid() {
        return this.Vid;
    }

    /**
     * Set This parameter is invalid now.
     * @param Vid This parameter is invalid now.
     */
    public void setVid(String Vid) {
        this.Vid = Vid;
    }

    public SearchMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchMediaRequest(SearchMediaRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.NamePrefixes != null) {
            this.NamePrefixes = new String[source.NamePrefixes.length];
            for (int i = 0; i < source.NamePrefixes.length; i++) {
                this.NamePrefixes[i] = new String(source.NamePrefixes[i]);
            }
        }
        if (source.Descriptions != null) {
            this.Descriptions = new String[source.Descriptions.length];
            for (int i = 0; i < source.Descriptions.length; i++) {
                this.Descriptions[i] = new String(source.Descriptions[i]);
            }
        }
        if (source.ClassIds != null) {
            this.ClassIds = new Long[source.ClassIds.length];
            for (int i = 0; i < source.ClassIds.length; i++) {
                this.ClassIds[i] = new Long(source.ClassIds[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Categories != null) {
            this.Categories = new String[source.Categories.length];
            for (int i = 0; i < source.Categories.length; i++) {
                this.Categories[i] = new String(source.Categories[i]);
            }
        }
        if (source.SourceTypes != null) {
            this.SourceTypes = new String[source.SourceTypes.length];
            for (int i = 0; i < source.SourceTypes.length; i++) {
                this.SourceTypes[i] = new String(source.SourceTypes[i]);
            }
        }
        if (source.StreamIds != null) {
            this.StreamIds = new String[source.StreamIds.length];
            for (int i = 0; i < source.StreamIds.length; i++) {
                this.StreamIds[i] = new String(source.StreamIds[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new TimeRange(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new TimeRange(source.ExpireTime);
        }
        if (source.Sort != null) {
            this.Sort = new SortBy(source.Sort);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new String[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new String(source.Filters[i]);
            }
        }
        if (source.StorageRegions != null) {
            this.StorageRegions = new String[source.StorageRegions.length];
            for (int i = 0; i < source.StorageRegions.length; i++) {
                this.StorageRegions[i] = new String(source.StorageRegions[i]);
            }
        }
        if (source.StorageClasses != null) {
            this.StorageClasses = new String[source.StorageClasses.length];
            for (int i = 0; i < source.StorageClasses.length; i++) {
                this.StorageClasses[i] = new String(source.StorageClasses[i]);
            }
        }
        if (source.MediaTypes != null) {
            this.MediaTypes = new String[source.MediaTypes.length];
            for (int i = 0; i < source.MediaTypes.length; i++) {
                this.MediaTypes[i] = new String(source.MediaTypes[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
        if (source.ReviewResults != null) {
            this.ReviewResults = new String[source.ReviewResults.length];
            for (int i = 0; i < source.ReviewResults.length; i++) {
                this.ReviewResults[i] = new String(source.ReviewResults[i]);
            }
        }
        if (source.TrtcSdkAppIds != null) {
            this.TrtcSdkAppIds = new Long[source.TrtcSdkAppIds.length];
            for (int i = 0; i < source.TrtcSdkAppIds.length; i++) {
                this.TrtcSdkAppIds[i] = new Long(source.TrtcSdkAppIds[i]);
            }
        }
        if (source.TrtcRoomIds != null) {
            this.TrtcRoomIds = new String[source.TrtcRoomIds.length];
            for (int i = 0; i < source.TrtcRoomIds.length; i++) {
                this.TrtcRoomIds[i] = new String(source.TrtcRoomIds[i]);
            }
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.StreamId != null) {
            this.StreamId = new String(source.StreamId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Vids != null) {
            this.Vids = new String[source.Vids.length];
            for (int i = 0; i < source.Vids.length; i++) {
                this.Vids[i] = new String(source.Vids[i]);
            }
        }
        if (source.Vid != null) {
            this.Vid = new String(source.Vid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamArraySimple(map, prefix + "NamePrefixes.", this.NamePrefixes);
        this.setParamArraySimple(map, prefix + "Descriptions.", this.Descriptions);
        this.setParamArraySimple(map, prefix + "ClassIds.", this.ClassIds);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "Categories.", this.Categories);
        this.setParamArraySimple(map, prefix + "SourceTypes.", this.SourceTypes);
        this.setParamArraySimple(map, prefix + "StreamIds.", this.StreamIds);
        this.setParamObj(map, prefix + "CreateTime.", this.CreateTime);
        this.setParamObj(map, prefix + "ExpireTime.", this.ExpireTime);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "StorageRegions.", this.StorageRegions);
        this.setParamArraySimple(map, prefix + "StorageClasses.", this.StorageClasses);
        this.setParamArraySimple(map, prefix + "MediaTypes.", this.MediaTypes);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "ReviewResults.", this.ReviewResults);
        this.setParamArraySimple(map, prefix + "TrtcSdkAppIds.", this.TrtcSdkAppIds);
        this.setParamArraySimple(map, prefix + "TrtcRoomIds.", this.TrtcRoomIds);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Vids.", this.Vids);
        this.setParamSimple(map, prefix + "Vid", this.Vid);

    }
}

