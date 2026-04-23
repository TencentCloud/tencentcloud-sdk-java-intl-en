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

public class SearchMediaRequest extends AbstractModel {

    /**
    * <p><b>Video-on-demand (VOD) <a href="/document/product/266/33987">application</a> ID. For customers who activate on-demand services from December 25, 2023, they must fill this field with the app ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>File id collection, match any element in the collection.</p><li>Array length limit: 10.</li><li>Single ID length limit: 40 character.</li>
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * <p>File name collection. Fuzzy match media files by file name. The higher the matching degree, the higher the priority in sorting.</p><li>Single file name length limit: 100 characters.</li><li>Array length limit: 10.</li>
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * <p>File name prefix. Prefix match media files.</p><li>Single file name prefix length limit: 100 characters.</li><li>Array length limit: 10.</li>
    */
    @SerializedName("NamePrefixes")
    @Expose
    private String [] NamePrefixes;

    /**
    * <p>File description set, fuzzy match media files. The higher the matching degree, higher priority in sorting.</p><li>Single description length limit: 100 characters.</li><li>Array length limit: 10.</li>
    */
    @SerializedName("Descriptions")
    @Expose
    private String [] Descriptions;

    /**
    * <p>Category id collection, match the specified ID in the collection and all its subclasses.</p><li>Array length limit: 10.</li>
    */
    @SerializedName("ClassIds")
    @Expose
    private Long [] ClassIds;

    /**
    * <p>Tag set, match any element in the collection.</p><li>Single tag length limit: 32 character.</li><li>Array length limit: 16.</li>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>File type. Match any element in the collection:</p><li>Video: video file</li><li>Audio: audio file</li><li>Image: image file</li>
    */
    @SerializedName("Categories")
    @Expose
    private String [] Categories;

    /**
    * <p>Media file source collection. Source value reference <a href="https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData">SourceType</a>.</p><li>Array length limit: 10.</li>
    */
    @SerializedName("SourceTypes")
    @Expose
    private String [] SourceTypes;

    /**
    * <p>Push stream live code collection. Match any element in the collection.</p><li>Array length limit: 10.</li>
    */
    @SerializedName("StreamIds")
    @Expose
    private String [] StreamIds;

    /**
    * <p>Match files with creation time within this time period.</p><li>Include the specified start and end points in time.</li>
    */
    @SerializedName("CreateTime")
    @Expose
    private TimeRange CreateTime;

    /**
    * <p>Match files with expiration time within this period. Unable to retrieve expired files.</p><li>Include the specified start and end points in time.</li>
    */
    @SerializedName("ExpireTime")
    @Expose
    private TimeRange ExpireTime;

    /**
    * <p>Media file storage region, such as ap-chongqing. Please refer to <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a>.</p><li>Single storage region length limit: 20 characters.</li><li>Array length limit: 20.</li>
    */
    @SerializedName("StorageRegions")
    @Expose
    private String [] StorageRegions;

    /**
    * <p>Storage type array. Optional values:</p><li> STANDARD: Standard storage.</li><li> STANDARD_IA: Infrequent storage.</li><li> ARCHIVE: Archive storage.</li><li> DEEP_ARCHIVE: Deep archive storage.</li>
    */
    @SerializedName("StorageClasses")
    @Expose
    private String [] StorageClasses;

    /**
    * <p>Media file packaging format collection, match any element in the collection.</p><li>Array length limit: 10.</li>
    */
    @SerializedName("MediaTypes")
    @Expose
    private String [] MediaTypes;

    /**
    * <p>Media file status, match any element in the collection.</p><li> Normal: normal;</li><li> SystemForbidden: Platform Ban;</li><li> Forbidden: proactive ban.</li>
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
    * <p>Media file review result, match any element in the collection.</p><li> pass: Pass review;</li><li> review: Suspected violation, suggest re-examination;</li><li> block: Confirmed violation, suggest banning;</li><li> notModerated: Not moderated.</li>
    */
    @SerializedName("ReviewResults")
    @Expose
    private String [] ReviewResults;

    /**
    * <p>TRTC application ID collection. Matches any element in the collection.</p><li>Array length limit: 10.</li>
    */
    @SerializedName("TrtcSdkAppIds")
    @Expose
    private Long [] TrtcSdkAppIds;

    /**
    * <p>TRTC room ID collection. Matches any element in the collection.</p><li>Single room ID length limit: 64 characters;</li><li>Array length limit: 10.</li>
    */
    @SerializedName("TrtcRoomIds")
    @Expose
    private String [] TrtcRoomIds;

    /**
    * <p>Information to be returned for all specified media files, multiple information can be specified simultaneously, N starts incrementing from 0. If this field is not filled in, default return all information. Options include:</p><li>basicInfo (video basic information).</li><li>metaData (video metadata).</li><li>transcodeInfo (video transcoding result information).</li><li>animatedGraphicsInfo (video motion graphic result information).</li><li>imageSpriteInfo (video thumbnail information).</li><li>snapshotByTimeOffsetInfo (video screenshot by specified time point).</li><li>sampleSnapshotInfo (sampling screenshot information).</li><li>keyFrameDescInfo (Dotting Information).</li><li>adaptiveDynamicStreamingInfo (Adaptive Bitrate Streaming information).</li><li>miniProgramReviewInfo (miniProgramReviewInfo).</li>
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
    * <p>Sorting method.</p><li>Sort.Field optional CreateTime.</li><li>When Text, Names, or Descriptions is not empty, the Sort.Field field is invalid. Search results sorted by relevance.</li>
    */
    @SerializedName("Sort")
    @Expose
    private SortBy Sort;

    /**
    * <div id="p_offset">Starting offset amount for pagination return, default value: 0. Returns entries from Offset to Offset+Limit-1.<li>Value ranges from...to... Offset + Limit is no more than 5000. (See: <a href="#maxResultsDesc">API return result count limit</a>)</li></div>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <div id="p_limit">Number of records returned in pages. Default value: 10. Records from Offset to Offset+Limit-1 will be returned.<li>Value ranges from...to... Offset + Limit is no more than 5000. (Refer to: <a href="#maxResultsDesc">API return result count limit</a>)</li></div>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>(Not recommended: Use Names, NamePrefixes, or Descriptions as alternatives)<br>Search text, fuzzy match media file name or description information. The higher the matching degree and more matches, the higher priority in sorting. Length limit: 64 characters.</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>(Not recommended: Use SourceTypes as an alternative)<br>Media file source. Source value reference <a href="https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData">SourceType</a>.</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>(Not recommended: Use StreamIds as an alternative)<br>Push stream live code.</p>
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * <p>(Not recommended: Use CreateTime instead)<br>Start time of creation time.</p><li>Greater than or equal to start time.</li><li>When CreateTime.After also exists, CreateTime.After will be used first.</li><li>Format according to ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>(Not recommended: Use CreateTime instead)<br>End time of creation time.</p><li>Less than end time.</li><li>When CreateTime.Before also exists, CreateTime.Before will be used first.</li><li>Format according to ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>This field is invalid.</p>
    */
    @SerializedName("Vids")
    @Expose
    private String [] Vids;

    /**
    * <p>This field is invalid.</p>
    */
    @SerializedName("Vid")
    @Expose
    private String Vid;

    /**
    * <p>Live streaming push Domain. Valid when the media source is Live streaming Recording.</p>
    */
    @SerializedName("StreamDomains")
    @Expose
    private String [] StreamDomains;

    /**
    * <p>Live streaming push Path. Valid at that time when the source is live recording.</p>
    */
    @SerializedName("StreamPaths")
    @Expose
    private String [] StreamPaths;

    /**
     * Get <p><b>Video-on-demand (VOD) <a href="/document/product/266/33987">application</a> ID. For customers who activate on-demand services from December 25, 2023, they must fill this field with the app ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="/document/product/266/33987">application</a> ID. For customers who activate on-demand services from December 25, 2023, they must fill this field with the app ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="/document/product/266/33987">application</a> ID. For customers who activate on-demand services from December 25, 2023, they must fill this field with the app ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="/document/product/266/33987">application</a> ID. For customers who activate on-demand services from December 25, 2023, they must fill this field with the app ID when accessing resources in on-demand applications (whether it's the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>File id collection, match any element in the collection.</p><li>Array length limit: 10.</li><li>Single ID length limit: 40 character.</li> 
     * @return FileIds <p>File id collection, match any element in the collection.</p><li>Array length limit: 10.</li><li>Single ID length limit: 40 character.</li>
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set <p>File id collection, match any element in the collection.</p><li>Array length limit: 10.</li><li>Single ID length limit: 40 character.</li>
     * @param FileIds <p>File id collection, match any element in the collection.</p><li>Array length limit: 10.</li><li>Single ID length limit: 40 character.</li>
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get <p>File name collection. Fuzzy match media files by file name. The higher the matching degree, the higher the priority in sorting.</p><li>Single file name length limit: 100 characters.</li><li>Array length limit: 10.</li> 
     * @return Names <p>File name collection. Fuzzy match media files by file name. The higher the matching degree, the higher the priority in sorting.</p><li>Single file name length limit: 100 characters.</li><li>Array length limit: 10.</li>
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set <p>File name collection. Fuzzy match media files by file name. The higher the matching degree, the higher the priority in sorting.</p><li>Single file name length limit: 100 characters.</li><li>Array length limit: 10.</li>
     * @param Names <p>File name collection. Fuzzy match media files by file name. The higher the matching degree, the higher the priority in sorting.</p><li>Single file name length limit: 100 characters.</li><li>Array length limit: 10.</li>
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get <p>File name prefix. Prefix match media files.</p><li>Single file name prefix length limit: 100 characters.</li><li>Array length limit: 10.</li> 
     * @return NamePrefixes <p>File name prefix. Prefix match media files.</p><li>Single file name prefix length limit: 100 characters.</li><li>Array length limit: 10.</li>
     */
    public String [] getNamePrefixes() {
        return this.NamePrefixes;
    }

    /**
     * Set <p>File name prefix. Prefix match media files.</p><li>Single file name prefix length limit: 100 characters.</li><li>Array length limit: 10.</li>
     * @param NamePrefixes <p>File name prefix. Prefix match media files.</p><li>Single file name prefix length limit: 100 characters.</li><li>Array length limit: 10.</li>
     */
    public void setNamePrefixes(String [] NamePrefixes) {
        this.NamePrefixes = NamePrefixes;
    }

    /**
     * Get <p>File description set, fuzzy match media files. The higher the matching degree, higher priority in sorting.</p><li>Single description length limit: 100 characters.</li><li>Array length limit: 10.</li> 
     * @return Descriptions <p>File description set, fuzzy match media files. The higher the matching degree, higher priority in sorting.</p><li>Single description length limit: 100 characters.</li><li>Array length limit: 10.</li>
     */
    public String [] getDescriptions() {
        return this.Descriptions;
    }

    /**
     * Set <p>File description set, fuzzy match media files. The higher the matching degree, higher priority in sorting.</p><li>Single description length limit: 100 characters.</li><li>Array length limit: 10.</li>
     * @param Descriptions <p>File description set, fuzzy match media files. The higher the matching degree, higher priority in sorting.</p><li>Single description length limit: 100 characters.</li><li>Array length limit: 10.</li>
     */
    public void setDescriptions(String [] Descriptions) {
        this.Descriptions = Descriptions;
    }

    /**
     * Get <p>Category id collection, match the specified ID in the collection and all its subclasses.</p><li>Array length limit: 10.</li> 
     * @return ClassIds <p>Category id collection, match the specified ID in the collection and all its subclasses.</p><li>Array length limit: 10.</li>
     */
    public Long [] getClassIds() {
        return this.ClassIds;
    }

    /**
     * Set <p>Category id collection, match the specified ID in the collection and all its subclasses.</p><li>Array length limit: 10.</li>
     * @param ClassIds <p>Category id collection, match the specified ID in the collection and all its subclasses.</p><li>Array length limit: 10.</li>
     */
    public void setClassIds(Long [] ClassIds) {
        this.ClassIds = ClassIds;
    }

    /**
     * Get <p>Tag set, match any element in the collection.</p><li>Single tag length limit: 32 character.</li><li>Array length limit: 16.</li> 
     * @return Tags <p>Tag set, match any element in the collection.</p><li>Single tag length limit: 32 character.</li><li>Array length limit: 16.</li>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag set, match any element in the collection.</p><li>Single tag length limit: 32 character.</li><li>Array length limit: 16.</li>
     * @param Tags <p>Tag set, match any element in the collection.</p><li>Single tag length limit: 32 character.</li><li>Array length limit: 16.</li>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>File type. Match any element in the collection:</p><li>Video: video file</li><li>Audio: audio file</li><li>Image: image file</li> 
     * @return Categories <p>File type. Match any element in the collection:</p><li>Video: video file</li><li>Audio: audio file</li><li>Image: image file</li>
     */
    public String [] getCategories() {
        return this.Categories;
    }

    /**
     * Set <p>File type. Match any element in the collection:</p><li>Video: video file</li><li>Audio: audio file</li><li>Image: image file</li>
     * @param Categories <p>File type. Match any element in the collection:</p><li>Video: video file</li><li>Audio: audio file</li><li>Image: image file</li>
     */
    public void setCategories(String [] Categories) {
        this.Categories = Categories;
    }

    /**
     * Get <p>Media file source collection. Source value reference <a href="https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData">SourceType</a>.</p><li>Array length limit: 10.</li> 
     * @return SourceTypes <p>Media file source collection. Source value reference <a href="https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData">SourceType</a>.</p><li>Array length limit: 10.</li>
     */
    public String [] getSourceTypes() {
        return this.SourceTypes;
    }

    /**
     * Set <p>Media file source collection. Source value reference <a href="https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData">SourceType</a>.</p><li>Array length limit: 10.</li>
     * @param SourceTypes <p>Media file source collection. Source value reference <a href="https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData">SourceType</a>.</p><li>Array length limit: 10.</li>
     */
    public void setSourceTypes(String [] SourceTypes) {
        this.SourceTypes = SourceTypes;
    }

    /**
     * Get <p>Push stream live code collection. Match any element in the collection.</p><li>Array length limit: 10.</li> 
     * @return StreamIds <p>Push stream live code collection. Match any element in the collection.</p><li>Array length limit: 10.</li>
     */
    public String [] getStreamIds() {
        return this.StreamIds;
    }

    /**
     * Set <p>Push stream live code collection. Match any element in the collection.</p><li>Array length limit: 10.</li>
     * @param StreamIds <p>Push stream live code collection. Match any element in the collection.</p><li>Array length limit: 10.</li>
     */
    public void setStreamIds(String [] StreamIds) {
        this.StreamIds = StreamIds;
    }

    /**
     * Get <p>Match files with creation time within this time period.</p><li>Include the specified start and end points in time.</li> 
     * @return CreateTime <p>Match files with creation time within this time period.</p><li>Include the specified start and end points in time.</li>
     */
    public TimeRange getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Match files with creation time within this time period.</p><li>Include the specified start and end points in time.</li>
     * @param CreateTime <p>Match files with creation time within this time period.</p><li>Include the specified start and end points in time.</li>
     */
    public void setCreateTime(TimeRange CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Match files with expiration time within this period. Unable to retrieve expired files.</p><li>Include the specified start and end points in time.</li> 
     * @return ExpireTime <p>Match files with expiration time within this period. Unable to retrieve expired files.</p><li>Include the specified start and end points in time.</li>
     */
    public TimeRange getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Match files with expiration time within this period. Unable to retrieve expired files.</p><li>Include the specified start and end points in time.</li>
     * @param ExpireTime <p>Match files with expiration time within this period. Unable to retrieve expired files.</p><li>Include the specified start and end points in time.</li>
     */
    public void setExpireTime(TimeRange ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>Media file storage region, such as ap-chongqing. Please refer to <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a>.</p><li>Single storage region length limit: 20 characters.</li><li>Array length limit: 20.</li> 
     * @return StorageRegions <p>Media file storage region, such as ap-chongqing. Please refer to <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a>.</p><li>Single storage region length limit: 20 characters.</li><li>Array length limit: 20.</li>
     */
    public String [] getStorageRegions() {
        return this.StorageRegions;
    }

    /**
     * Set <p>Media file storage region, such as ap-chongqing. Please refer to <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a>.</p><li>Single storage region length limit: 20 characters.</li><li>Array length limit: 20.</li>
     * @param StorageRegions <p>Media file storage region, such as ap-chongqing. Please refer to <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E5.B7.B2.E6.94.AF.E6.8C.81.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8">region list</a>.</p><li>Single storage region length limit: 20 characters.</li><li>Array length limit: 20.</li>
     */
    public void setStorageRegions(String [] StorageRegions) {
        this.StorageRegions = StorageRegions;
    }

    /**
     * Get <p>Storage type array. Optional values:</p><li> STANDARD: Standard storage.</li><li> STANDARD_IA: Infrequent storage.</li><li> ARCHIVE: Archive storage.</li><li> DEEP_ARCHIVE: Deep archive storage.</li> 
     * @return StorageClasses <p>Storage type array. Optional values:</p><li> STANDARD: Standard storage.</li><li> STANDARD_IA: Infrequent storage.</li><li> ARCHIVE: Archive storage.</li><li> DEEP_ARCHIVE: Deep archive storage.</li>
     */
    public String [] getStorageClasses() {
        return this.StorageClasses;
    }

    /**
     * Set <p>Storage type array. Optional values:</p><li> STANDARD: Standard storage.</li><li> STANDARD_IA: Infrequent storage.</li><li> ARCHIVE: Archive storage.</li><li> DEEP_ARCHIVE: Deep archive storage.</li>
     * @param StorageClasses <p>Storage type array. Optional values:</p><li> STANDARD: Standard storage.</li><li> STANDARD_IA: Infrequent storage.</li><li> ARCHIVE: Archive storage.</li><li> DEEP_ARCHIVE: Deep archive storage.</li>
     */
    public void setStorageClasses(String [] StorageClasses) {
        this.StorageClasses = StorageClasses;
    }

    /**
     * Get <p>Media file packaging format collection, match any element in the collection.</p><li>Array length limit: 10.</li> 
     * @return MediaTypes <p>Media file packaging format collection, match any element in the collection.</p><li>Array length limit: 10.</li>
     */
    public String [] getMediaTypes() {
        return this.MediaTypes;
    }

    /**
     * Set <p>Media file packaging format collection, match any element in the collection.</p><li>Array length limit: 10.</li>
     * @param MediaTypes <p>Media file packaging format collection, match any element in the collection.</p><li>Array length limit: 10.</li>
     */
    public void setMediaTypes(String [] MediaTypes) {
        this.MediaTypes = MediaTypes;
    }

    /**
     * Get <p>Media file status, match any element in the collection.</p><li> Normal: normal;</li><li> SystemForbidden: Platform Ban;</li><li> Forbidden: proactive ban.</li> 
     * @return Status <p>Media file status, match any element in the collection.</p><li> Normal: normal;</li><li> SystemForbidden: Platform Ban;</li><li> Forbidden: proactive ban.</li>
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Media file status, match any element in the collection.</p><li> Normal: normal;</li><li> SystemForbidden: Platform Ban;</li><li> Forbidden: proactive ban.</li>
     * @param Status <p>Media file status, match any element in the collection.</p><li> Normal: normal;</li><li> SystemForbidden: Platform Ban;</li><li> Forbidden: proactive ban.</li>
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Media file review result, match any element in the collection.</p><li> pass: Pass review;</li><li> review: Suspected violation, suggest re-examination;</li><li> block: Confirmed violation, suggest banning;</li><li> notModerated: Not moderated.</li> 
     * @return ReviewResults <p>Media file review result, match any element in the collection.</p><li> pass: Pass review;</li><li> review: Suspected violation, suggest re-examination;</li><li> block: Confirmed violation, suggest banning;</li><li> notModerated: Not moderated.</li>
     */
    public String [] getReviewResults() {
        return this.ReviewResults;
    }

    /**
     * Set <p>Media file review result, match any element in the collection.</p><li> pass: Pass review;</li><li> review: Suspected violation, suggest re-examination;</li><li> block: Confirmed violation, suggest banning;</li><li> notModerated: Not moderated.</li>
     * @param ReviewResults <p>Media file review result, match any element in the collection.</p><li> pass: Pass review;</li><li> review: Suspected violation, suggest re-examination;</li><li> block: Confirmed violation, suggest banning;</li><li> notModerated: Not moderated.</li>
     */
    public void setReviewResults(String [] ReviewResults) {
        this.ReviewResults = ReviewResults;
    }

    /**
     * Get <p>TRTC application ID collection. Matches any element in the collection.</p><li>Array length limit: 10.</li> 
     * @return TrtcSdkAppIds <p>TRTC application ID collection. Matches any element in the collection.</p><li>Array length limit: 10.</li>
     */
    public Long [] getTrtcSdkAppIds() {
        return this.TrtcSdkAppIds;
    }

    /**
     * Set <p>TRTC application ID collection. Matches any element in the collection.</p><li>Array length limit: 10.</li>
     * @param TrtcSdkAppIds <p>TRTC application ID collection. Matches any element in the collection.</p><li>Array length limit: 10.</li>
     */
    public void setTrtcSdkAppIds(Long [] TrtcSdkAppIds) {
        this.TrtcSdkAppIds = TrtcSdkAppIds;
    }

    /**
     * Get <p>TRTC room ID collection. Matches any element in the collection.</p><li>Single room ID length limit: 64 characters;</li><li>Array length limit: 10.</li> 
     * @return TrtcRoomIds <p>TRTC room ID collection. Matches any element in the collection.</p><li>Single room ID length limit: 64 characters;</li><li>Array length limit: 10.</li>
     */
    public String [] getTrtcRoomIds() {
        return this.TrtcRoomIds;
    }

    /**
     * Set <p>TRTC room ID collection. Matches any element in the collection.</p><li>Single room ID length limit: 64 characters;</li><li>Array length limit: 10.</li>
     * @param TrtcRoomIds <p>TRTC room ID collection. Matches any element in the collection.</p><li>Single room ID length limit: 64 characters;</li><li>Array length limit: 10.</li>
     */
    public void setTrtcRoomIds(String [] TrtcRoomIds) {
        this.TrtcRoomIds = TrtcRoomIds;
    }

    /**
     * Get <p>Information to be returned for all specified media files, multiple information can be specified simultaneously, N starts incrementing from 0. If this field is not filled in, default return all information. Options include:</p><li>basicInfo (video basic information).</li><li>metaData (video metadata).</li><li>transcodeInfo (video transcoding result information).</li><li>animatedGraphicsInfo (video motion graphic result information).</li><li>imageSpriteInfo (video thumbnail information).</li><li>snapshotByTimeOffsetInfo (video screenshot by specified time point).</li><li>sampleSnapshotInfo (sampling screenshot information).</li><li>keyFrameDescInfo (Dotting Information).</li><li>adaptiveDynamicStreamingInfo (Adaptive Bitrate Streaming information).</li><li>miniProgramReviewInfo (miniProgramReviewInfo).</li> 
     * @return Filters <p>Information to be returned for all specified media files, multiple information can be specified simultaneously, N starts incrementing from 0. If this field is not filled in, default return all information. Options include:</p><li>basicInfo (video basic information).</li><li>metaData (video metadata).</li><li>transcodeInfo (video transcoding result information).</li><li>animatedGraphicsInfo (video motion graphic result information).</li><li>imageSpriteInfo (video thumbnail information).</li><li>snapshotByTimeOffsetInfo (video screenshot by specified time point).</li><li>sampleSnapshotInfo (sampling screenshot information).</li><li>keyFrameDescInfo (Dotting Information).</li><li>adaptiveDynamicStreamingInfo (Adaptive Bitrate Streaming information).</li><li>miniProgramReviewInfo (miniProgramReviewInfo).</li>
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Information to be returned for all specified media files, multiple information can be specified simultaneously, N starts incrementing from 0. If this field is not filled in, default return all information. Options include:</p><li>basicInfo (video basic information).</li><li>metaData (video metadata).</li><li>transcodeInfo (video transcoding result information).</li><li>animatedGraphicsInfo (video motion graphic result information).</li><li>imageSpriteInfo (video thumbnail information).</li><li>snapshotByTimeOffsetInfo (video screenshot by specified time point).</li><li>sampleSnapshotInfo (sampling screenshot information).</li><li>keyFrameDescInfo (Dotting Information).</li><li>adaptiveDynamicStreamingInfo (Adaptive Bitrate Streaming information).</li><li>miniProgramReviewInfo (miniProgramReviewInfo).</li>
     * @param Filters <p>Information to be returned for all specified media files, multiple information can be specified simultaneously, N starts incrementing from 0. If this field is not filled in, default return all information. Options include:</p><li>basicInfo (video basic information).</li><li>metaData (video metadata).</li><li>transcodeInfo (video transcoding result information).</li><li>animatedGraphicsInfo (video motion graphic result information).</li><li>imageSpriteInfo (video thumbnail information).</li><li>snapshotByTimeOffsetInfo (video screenshot by specified time point).</li><li>sampleSnapshotInfo (sampling screenshot information).</li><li>keyFrameDescInfo (Dotting Information).</li><li>adaptiveDynamicStreamingInfo (Adaptive Bitrate Streaming information).</li><li>miniProgramReviewInfo (miniProgramReviewInfo).</li>
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Sorting method.</p><li>Sort.Field optional CreateTime.</li><li>When Text, Names, or Descriptions is not empty, the Sort.Field field is invalid. Search results sorted by relevance.</li> 
     * @return Sort <p>Sorting method.</p><li>Sort.Field optional CreateTime.</li><li>When Text, Names, or Descriptions is not empty, the Sort.Field field is invalid. Search results sorted by relevance.</li>
     */
    public SortBy getSort() {
        return this.Sort;
    }

    /**
     * Set <p>Sorting method.</p><li>Sort.Field optional CreateTime.</li><li>When Text, Names, or Descriptions is not empty, the Sort.Field field is invalid. Search results sorted by relevance.</li>
     * @param Sort <p>Sorting method.</p><li>Sort.Field optional CreateTime.</li><li>When Text, Names, or Descriptions is not empty, the Sort.Field field is invalid. Search results sorted by relevance.</li>
     */
    public void setSort(SortBy Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <div id="p_offset">Starting offset amount for pagination return, default value: 0. Returns entries from Offset to Offset+Limit-1.<li>Value ranges from...to... Offset + Limit is no more than 5000. (See: <a href="#maxResultsDesc">API return result count limit</a>)</li></div> 
     * @return Offset <div id="p_offset">Starting offset amount for pagination return, default value: 0. Returns entries from Offset to Offset+Limit-1.<li>Value ranges from...to... Offset + Limit is no more than 5000. (See: <a href="#maxResultsDesc">API return result count limit</a>)</li></div>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <div id="p_offset">Starting offset amount for pagination return, default value: 0. Returns entries from Offset to Offset+Limit-1.<li>Value ranges from...to... Offset + Limit is no more than 5000. (See: <a href="#maxResultsDesc">API return result count limit</a>)</li></div>
     * @param Offset <div id="p_offset">Starting offset amount for pagination return, default value: 0. Returns entries from Offset to Offset+Limit-1.<li>Value ranges from...to... Offset + Limit is no more than 5000. (See: <a href="#maxResultsDesc">API return result count limit</a>)</li></div>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <div id="p_limit">Number of records returned in pages. Default value: 10. Records from Offset to Offset+Limit-1 will be returned.<li>Value ranges from...to... Offset + Limit is no more than 5000. (Refer to: <a href="#maxResultsDesc">API return result count limit</a>)</li></div> 
     * @return Limit <div id="p_limit">Number of records returned in pages. Default value: 10. Records from Offset to Offset+Limit-1 will be returned.<li>Value ranges from...to... Offset + Limit is no more than 5000. (Refer to: <a href="#maxResultsDesc">API return result count limit</a>)</li></div>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <div id="p_limit">Number of records returned in pages. Default value: 10. Records from Offset to Offset+Limit-1 will be returned.<li>Value ranges from...to... Offset + Limit is no more than 5000. (Refer to: <a href="#maxResultsDesc">API return result count limit</a>)</li></div>
     * @param Limit <div id="p_limit">Number of records returned in pages. Default value: 10. Records from Offset to Offset+Limit-1 will be returned.<li>Value ranges from...to... Offset + Limit is no more than 5000. (Refer to: <a href="#maxResultsDesc">API return result count limit</a>)</li></div>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>(Not recommended: Use Names, NamePrefixes, or Descriptions as alternatives)<br>Search text, fuzzy match media file name or description information. The higher the matching degree and more matches, the higher priority in sorting. Length limit: 64 characters.</p> 
     * @return Text <p>(Not recommended: Use Names, NamePrefixes, or Descriptions as alternatives)<br>Search text, fuzzy match media file name or description information. The higher the matching degree and more matches, the higher priority in sorting. Length limit: 64 characters.</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>(Not recommended: Use Names, NamePrefixes, or Descriptions as alternatives)<br>Search text, fuzzy match media file name or description information. The higher the matching degree and more matches, the higher priority in sorting. Length limit: 64 characters.</p>
     * @param Text <p>(Not recommended: Use Names, NamePrefixes, or Descriptions as alternatives)<br>Search text, fuzzy match media file name or description information. The higher the matching degree and more matches, the higher priority in sorting. Length limit: 64 characters.</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>(Not recommended: Use SourceTypes as an alternative)<br>Media file source. Source value reference <a href="https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData">SourceType</a>.</p> 
     * @return SourceType <p>(Not recommended: Use SourceTypes as an alternative)<br>Media file source. Source value reference <a href="https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData">SourceType</a>.</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>(Not recommended: Use SourceTypes as an alternative)<br>Media file source. Source value reference <a href="https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData">SourceType</a>.</p>
     * @param SourceType <p>(Not recommended: Use SourceTypes as an alternative)<br>Media file source. Source value reference <a href="https://www.tencentcloud.com/document/product/266/31773?from_cn_redirect=1#MediaSourceData">SourceType</a>.</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>(Not recommended: Use StreamIds as an alternative)<br>Push stream live code.</p> 
     * @return StreamId <p>(Not recommended: Use StreamIds as an alternative)<br>Push stream live code.</p>
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set <p>(Not recommended: Use StreamIds as an alternative)<br>Push stream live code.</p>
     * @param StreamId <p>(Not recommended: Use StreamIds as an alternative)<br>Push stream live code.</p>
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get <p>(Not recommended: Use CreateTime instead)<br>Start time of creation time.</p><li>Greater than or equal to start time.</li><li>When CreateTime.After also exists, CreateTime.After will be used first.</li><li>Format according to ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li> 
     * @return StartTime <p>(Not recommended: Use CreateTime instead)<br>Start time of creation time.</p><li>Greater than or equal to start time.</li><li>When CreateTime.After also exists, CreateTime.After will be used first.</li><li>Format according to ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>(Not recommended: Use CreateTime instead)<br>Start time of creation time.</p><li>Greater than or equal to start time.</li><li>When CreateTime.After also exists, CreateTime.After will be used first.</li><li>Format according to ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     * @param StartTime <p>(Not recommended: Use CreateTime instead)<br>Start time of creation time.</p><li>Greater than or equal to start time.</li><li>When CreateTime.After also exists, CreateTime.After will be used first.</li><li>Format according to ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>(Not recommended: Use CreateTime instead)<br>End time of creation time.</p><li>Less than end time.</li><li>When CreateTime.Before also exists, CreateTime.Before will be used first.</li><li>Format according to ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li> 
     * @return EndTime <p>(Not recommended: Use CreateTime instead)<br>End time of creation time.</p><li>Less than end time.</li><li>When CreateTime.Before also exists, CreateTime.Before will be used first.</li><li>Format according to ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>(Not recommended: Use CreateTime instead)<br>End time of creation time.</p><li>Less than end time.</li><li>When CreateTime.Before also exists, CreateTime.Before will be used first.</li><li>Format according to ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     * @param EndTime <p>(Not recommended: Use CreateTime instead)<br>End time of creation time.</p><li>Less than end time.</li><li>When CreateTime.Before also exists, CreateTime.Before will be used first.</li><li>Format according to ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).</li>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>This field is invalid.</p> 
     * @return Vids <p>This field is invalid.</p>
     */
    public String [] getVids() {
        return this.Vids;
    }

    /**
     * Set <p>This field is invalid.</p>
     * @param Vids <p>This field is invalid.</p>
     */
    public void setVids(String [] Vids) {
        this.Vids = Vids;
    }

    /**
     * Get <p>This field is invalid.</p> 
     * @return Vid <p>This field is invalid.</p>
     */
    public String getVid() {
        return this.Vid;
    }

    /**
     * Set <p>This field is invalid.</p>
     * @param Vid <p>This field is invalid.</p>
     */
    public void setVid(String Vid) {
        this.Vid = Vid;
    }

    /**
     * Get <p>Live streaming push Domain. Valid when the media source is Live streaming Recording.</p> 
     * @return StreamDomains <p>Live streaming push Domain. Valid when the media source is Live streaming Recording.</p>
     */
    public String [] getStreamDomains() {
        return this.StreamDomains;
    }

    /**
     * Set <p>Live streaming push Domain. Valid when the media source is Live streaming Recording.</p>
     * @param StreamDomains <p>Live streaming push Domain. Valid when the media source is Live streaming Recording.</p>
     */
    public void setStreamDomains(String [] StreamDomains) {
        this.StreamDomains = StreamDomains;
    }

    /**
     * Get <p>Live streaming push Path. Valid at that time when the source is live recording.</p> 
     * @return StreamPaths <p>Live streaming push Path. Valid at that time when the source is live recording.</p>
     */
    public String [] getStreamPaths() {
        return this.StreamPaths;
    }

    /**
     * Set <p>Live streaming push Path. Valid at that time when the source is live recording.</p>
     * @param StreamPaths <p>Live streaming push Path. Valid at that time when the source is live recording.</p>
     */
    public void setStreamPaths(String [] StreamPaths) {
        this.StreamPaths = StreamPaths;
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
        if (source.Filters != null) {
            this.Filters = new String[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new String(source.Filters[i]);
            }
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
        if (source.StreamDomains != null) {
            this.StreamDomains = new String[source.StreamDomains.length];
            for (int i = 0; i < source.StreamDomains.length; i++) {
                this.StreamDomains[i] = new String(source.StreamDomains[i]);
            }
        }
        if (source.StreamPaths != null) {
            this.StreamPaths = new String[source.StreamPaths.length];
            for (int i = 0; i < source.StreamPaths.length; i++) {
                this.StreamPaths[i] = new String(source.StreamPaths[i]);
            }
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
        this.setParamArraySimple(map, prefix + "StorageRegions.", this.StorageRegions);
        this.setParamArraySimple(map, prefix + "StorageClasses.", this.StorageClasses);
        this.setParamArraySimple(map, prefix + "MediaTypes.", this.MediaTypes);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "ReviewResults.", this.ReviewResults);
        this.setParamArraySimple(map, prefix + "TrtcSdkAppIds.", this.TrtcSdkAppIds);
        this.setParamArraySimple(map, prefix + "TrtcRoomIds.", this.TrtcRoomIds);
        this.setParamArraySimple(map, prefix + "Filters.", this.Filters);
        this.setParamObj(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "Vids.", this.Vids);
        this.setParamSimple(map, prefix + "Vid", this.Vid);
        this.setParamArraySimple(map, prefix + "StreamDomains.", this.StreamDomains);
        this.setParamArraySimple(map, prefix + "StreamPaths.", this.StreamPaths);

    }
}

