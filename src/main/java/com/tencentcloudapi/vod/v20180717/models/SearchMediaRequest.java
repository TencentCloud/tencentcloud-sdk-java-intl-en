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
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * 
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * 
    */
    @SerializedName("NamePrefixes")
    @Expose
    private String [] NamePrefixes;

    /**
    * 
    */
    @SerializedName("Descriptions")
    @Expose
    private String [] Descriptions;

    /**
    * 
    */
    @SerializedName("ClassIds")
    @Expose
    private Long [] ClassIds;

    /**
    * 
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 
    */
    @SerializedName("Categories")
    @Expose
    private String [] Categories;

    /**
    * 
    */
    @SerializedName("SourceTypes")
    @Expose
    private String [] SourceTypes;

    /**
    * 
    */
    @SerializedName("StreamIds")
    @Expose
    private String [] StreamIds;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private TimeRange CreateTime;

    /**
    * 
    */
    @SerializedName("ExpireTime")
    @Expose
    private TimeRange ExpireTime;

    /**
    * 
    */
    @SerializedName("StorageRegions")
    @Expose
    private String [] StorageRegions;

    /**
    * 
    */
    @SerializedName("StorageClasses")
    @Expose
    private String [] StorageClasses;

    /**
    * 
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
    * 
    */
    @SerializedName("TrtcSdkAppIds")
    @Expose
    private Long [] TrtcSdkAppIds;

    /**
    * 
    */
    @SerializedName("TrtcRoomIds")
    @Expose
    private String [] TrtcRoomIds;

    /**
    * 
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
    * 
    */
    @SerializedName("Sort")
    @Expose
    private SortBy Sort;

    /**
    * 
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * 
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 
    */
    @SerializedName("Vids")
    @Expose
    private String [] Vids;

    /**
    * 
    */
    @SerializedName("Vid")
    @Expose
    private String Vid;

    /**
    * 
    */
    @SerializedName("StreamDomains")
    @Expose
    private String [] StreamDomains;

    /**
    * 
    */
    @SerializedName("StreamPaths")
    @Expose
    private String [] StreamPaths;

    /**
    * 
    */
    @SerializedName("KnowledgeBases")
    @Expose
    private String [] KnowledgeBases;

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return FileIds 
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set 
     * @param FileIds 
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get  
     * @return Names 
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 
     * @param Names 
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get  
     * @return NamePrefixes 
     */
    public String [] getNamePrefixes() {
        return this.NamePrefixes;
    }

    /**
     * Set 
     * @param NamePrefixes 
     */
    public void setNamePrefixes(String [] NamePrefixes) {
        this.NamePrefixes = NamePrefixes;
    }

    /**
     * Get  
     * @return Descriptions 
     */
    public String [] getDescriptions() {
        return this.Descriptions;
    }

    /**
     * Set 
     * @param Descriptions 
     */
    public void setDescriptions(String [] Descriptions) {
        this.Descriptions = Descriptions;
    }

    /**
     * Get  
     * @return ClassIds 
     */
    public Long [] getClassIds() {
        return this.ClassIds;
    }

    /**
     * Set 
     * @param ClassIds 
     */
    public void setClassIds(Long [] ClassIds) {
        this.ClassIds = ClassIds;
    }

    /**
     * Get  
     * @return Tags 
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 
     * @param Tags 
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get  
     * @return Categories 
     */
    public String [] getCategories() {
        return this.Categories;
    }

    /**
     * Set 
     * @param Categories 
     */
    public void setCategories(String [] Categories) {
        this.Categories = Categories;
    }

    /**
     * Get  
     * @return SourceTypes 
     */
    public String [] getSourceTypes() {
        return this.SourceTypes;
    }

    /**
     * Set 
     * @param SourceTypes 
     */
    public void setSourceTypes(String [] SourceTypes) {
        this.SourceTypes = SourceTypes;
    }

    /**
     * Get  
     * @return StreamIds 
     */
    public String [] getStreamIds() {
        return this.StreamIds;
    }

    /**
     * Set 
     * @param StreamIds 
     */
    public void setStreamIds(String [] StreamIds) {
        this.StreamIds = StreamIds;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public TimeRange getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(TimeRange CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return ExpireTime 
     */
    public TimeRange getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 
     * @param ExpireTime 
     */
    public void setExpireTime(TimeRange ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get  
     * @return StorageRegions 
     */
    public String [] getStorageRegions() {
        return this.StorageRegions;
    }

    /**
     * Set 
     * @param StorageRegions 
     */
    public void setStorageRegions(String [] StorageRegions) {
        this.StorageRegions = StorageRegions;
    }

    /**
     * Get  
     * @return StorageClasses 
     */
    public String [] getStorageClasses() {
        return this.StorageClasses;
    }

    /**
     * Set 
     * @param StorageClasses 
     */
    public void setStorageClasses(String [] StorageClasses) {
        this.StorageClasses = StorageClasses;
    }

    /**
     * Get  
     * @return MediaTypes 
     */
    public String [] getMediaTypes() {
        return this.MediaTypes;
    }

    /**
     * Set 
     * @param MediaTypes 
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
     * Get  
     * @return TrtcSdkAppIds 
     */
    public Long [] getTrtcSdkAppIds() {
        return this.TrtcSdkAppIds;
    }

    /**
     * Set 
     * @param TrtcSdkAppIds 
     */
    public void setTrtcSdkAppIds(Long [] TrtcSdkAppIds) {
        this.TrtcSdkAppIds = TrtcSdkAppIds;
    }

    /**
     * Get  
     * @return TrtcRoomIds 
     */
    public String [] getTrtcRoomIds() {
        return this.TrtcRoomIds;
    }

    /**
     * Set 
     * @param TrtcRoomIds 
     */
    public void setTrtcRoomIds(String [] TrtcRoomIds) {
        this.TrtcRoomIds = TrtcRoomIds;
    }

    /**
     * Get  
     * @return Filters 
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 
     * @param Filters 
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get  
     * @return Sort 
     */
    public SortBy getSort() {
        return this.Sort;
    }

    /**
     * Set 
     * @param Sort 
     */
    public void setSort(SortBy Sort) {
        this.Sort = Sort;
    }

    /**
     * Get  
     * @return Offset 
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 
     * @param Offset 
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get  
     * @return Limit 
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 
     * @param Limit 
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get  
     * @return Text 
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 
     * @param Text 
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get  
     * @return SourceType 
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 
     * @param SourceType 
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get  
     * @return StreamId 
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set 
     * @param StreamId 
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get  
     * @return StartTime 
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 
     * @param StartTime 
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get  
     * @return EndTime 
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 
     * @param EndTime 
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get  
     * @return Vids 
     */
    public String [] getVids() {
        return this.Vids;
    }

    /**
     * Set 
     * @param Vids 
     */
    public void setVids(String [] Vids) {
        this.Vids = Vids;
    }

    /**
     * Get  
     * @return Vid 
     */
    public String getVid() {
        return this.Vid;
    }

    /**
     * Set 
     * @param Vid 
     */
    public void setVid(String Vid) {
        this.Vid = Vid;
    }

    /**
     * Get  
     * @return StreamDomains 
     */
    public String [] getStreamDomains() {
        return this.StreamDomains;
    }

    /**
     * Set 
     * @param StreamDomains 
     */
    public void setStreamDomains(String [] StreamDomains) {
        this.StreamDomains = StreamDomains;
    }

    /**
     * Get  
     * @return StreamPaths 
     */
    public String [] getStreamPaths() {
        return this.StreamPaths;
    }

    /**
     * Set 
     * @param StreamPaths 
     */
    public void setStreamPaths(String [] StreamPaths) {
        this.StreamPaths = StreamPaths;
    }

    /**
     * Get  
     * @return KnowledgeBases 
     */
    public String [] getKnowledgeBases() {
        return this.KnowledgeBases;
    }

    /**
     * Set 
     * @param KnowledgeBases 
     */
    public void setKnowledgeBases(String [] KnowledgeBases) {
        this.KnowledgeBases = KnowledgeBases;
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
        if (source.KnowledgeBases != null) {
            this.KnowledgeBases = new String[source.KnowledgeBases.length];
            for (int i = 0; i < source.KnowledgeBases.length; i++) {
                this.KnowledgeBases[i] = new String(source.KnowledgeBases[i]);
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
        this.setParamArraySimple(map, prefix + "KnowledgeBases.", this.KnowledgeBases);

    }
}

