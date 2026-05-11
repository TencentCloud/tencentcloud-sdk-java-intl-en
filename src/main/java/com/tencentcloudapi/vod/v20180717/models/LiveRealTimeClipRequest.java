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

public class LiveRealTimeClipRequest extends AbstractModel {

    /**
    * Push stream live code.
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * Start time of stream clipping. Format reference [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time of stream clipping. Format reference [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <b>VOD [app](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who have enabled VOD since December 25, 2023, to access resources in an VOD application (whether it is a default application or a newly created application), this field must be filled in as the application ID. </b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Whether solidified. 0 not solidified, 1 solidified. Default non-permanent.
    */
    @SerializedName("IsPersistence")
    @Expose
    private Long IsPersistence;

    /**
    * Video storage expiry time after editing solidification. Format reference [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). Enter "9999-12-31T23:59:59Z" to indicate the video never expires. After expiry, the media file and its related resources (transcoding result, sprites) will be permanently deleted. Valid at that time only when IsPersistence is 1. The default video editing never expires.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Post-editing Solidified Video On-demand Task Flow Processing. For details, see [upload specified task flow](https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1). Valid only when IsPersistence is 1.
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [Create Category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicating other categories.</li>
Valid when IsPersistence is 1.
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * Source context, used for passing through user request information. The [callback on upload completion](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) will return the value of this field, up to 250 characters. Valid only when IsPersistence is 1.
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
    * Session context, used to pass through user request information. When specifying the Procedure parameter, the [task flow status change callback](https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1) will return the value of this field, up to 1000 characters. Valid at that time only when IsPersistence is 1.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * Whether to return edited video metadata. 0: not required, 1: required. By default, does not need.
    */
    @SerializedName("MetaDataRequired")
    @Expose
    private Long MetaDataRequired;

    /**
    * The domain name added in VOD for time shift playback must be associated with a recording template and have the time-shift service enabled in Cloud Streaming Services (https://www.tencentcloud.com/document/product/266/52220?from_cn_redirect=1#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E). **If the first call time of this interface is after 2021-01-01T00:00:00Z, this field is a required field.**
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Edited live stream information
<li>Default video editing for the original stream.</li>
<li>When the Type specified in StreamInfo is Transcoding, edit the live streaming transcoding stream corresponding to TemplateId.</li>
    */
    @SerializedName("StreamInfo")
    @Expose
    private LiveRealTimeClipStreamInfo StreamInfo;

    /**
    * System reserved field. Do not fill in.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get Push stream live code. 
     * @return StreamId Push stream live code.
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set Push stream live code.
     * @param StreamId Push stream live code.
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get Start time of stream clipping. Format reference [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return StartTime Start time of stream clipping. Format reference [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of stream clipping. Format reference [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param StartTime Start time of stream clipping. Format reference [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time of stream clipping. Format reference [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return EndTime End time of stream clipping. Format reference [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of stream clipping. Format reference [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param EndTime End time of stream clipping. Format reference [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <b>VOD [app](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who have enabled VOD since December 25, 2023, to access resources in an VOD application (whether it is a default application or a newly created application), this field must be filled in as the application ID. </b> 
     * @return SubAppId <b>VOD [app](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who have enabled VOD since December 25, 2023, to access resources in an VOD application (whether it is a default application or a newly created application), this field must be filled in as the application ID. </b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [app](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who have enabled VOD since December 25, 2023, to access resources in an VOD application (whether it is a default application or a newly created application), this field must be filled in as the application ID. </b>
     * @param SubAppId <b>VOD [app](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who have enabled VOD since December 25, 2023, to access resources in an VOD application (whether it is a default application or a newly created application), this field must be filled in as the application ID. </b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Whether solidified. 0 not solidified, 1 solidified. Default non-permanent. 
     * @return IsPersistence Whether solidified. 0 not solidified, 1 solidified. Default non-permanent.
     */
    public Long getIsPersistence() {
        return this.IsPersistence;
    }

    /**
     * Set Whether solidified. 0 not solidified, 1 solidified. Default non-permanent.
     * @param IsPersistence Whether solidified. 0 not solidified, 1 solidified. Default non-permanent.
     */
    public void setIsPersistence(Long IsPersistence) {
        this.IsPersistence = IsPersistence;
    }

    /**
     * Get Video storage expiry time after editing solidification. Format reference [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). Enter "9999-12-31T23:59:59Z" to indicate the video never expires. After expiry, the media file and its related resources (transcoding result, sprites) will be permanently deleted. Valid at that time only when IsPersistence is 1. The default video editing never expires. 
     * @return ExpireTime Video storage expiry time after editing solidification. Format reference [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). Enter "9999-12-31T23:59:59Z" to indicate the video never expires. After expiry, the media file and its related resources (transcoding result, sprites) will be permanently deleted. Valid at that time only when IsPersistence is 1. The default video editing never expires.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Video storage expiry time after editing solidification. Format reference [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). Enter "9999-12-31T23:59:59Z" to indicate the video never expires. After expiry, the media file and its related resources (transcoding result, sprites) will be permanently deleted. Valid at that time only when IsPersistence is 1. The default video editing never expires.
     * @param ExpireTime Video storage expiry time after editing solidification. Format reference [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). Enter "9999-12-31T23:59:59Z" to indicate the video never expires. After expiry, the media file and its related resources (transcoding result, sprites) will be permanently deleted. Valid at that time only when IsPersistence is 1. The default video editing never expires.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Post-editing Solidified Video On-demand Task Flow Processing. For details, see [upload specified task flow](https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1). Valid only when IsPersistence is 1. 
     * @return Procedure Post-editing Solidified Video On-demand Task Flow Processing. For details, see [upload specified task flow](https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1). Valid only when IsPersistence is 1.
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set Post-editing Solidified Video On-demand Task Flow Processing. For details, see [upload specified task flow](https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1). Valid only when IsPersistence is 1.
     * @param Procedure Post-editing Solidified Video On-demand Task Flow Processing. For details, see [upload specified task flow](https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1). Valid only when IsPersistence is 1.
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [Create Category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicating other categories.</li>
Valid when IsPersistence is 1. 
     * @return ClassId Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [Create Category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicating other categories.</li>
Valid when IsPersistence is 1.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [Create Category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicating other categories.</li>
Valid when IsPersistence is 1.
     * @param ClassId Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [Create Category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicating other categories.</li>
Valid when IsPersistence is 1.
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get Source context, used for passing through user request information. The [callback on upload completion](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) will return the value of this field, up to 250 characters. Valid only when IsPersistence is 1. 
     * @return SourceContext Source context, used for passing through user request information. The [callback on upload completion](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) will return the value of this field, up to 250 characters. Valid only when IsPersistence is 1.
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set Source context, used for passing through user request information. The [callback on upload completion](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) will return the value of this field, up to 250 characters. Valid only when IsPersistence is 1.
     * @param SourceContext Source context, used for passing through user request information. The [callback on upload completion](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) will return the value of this field, up to 250 characters. Valid only when IsPersistence is 1.
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    /**
     * Get Session context, used to pass through user request information. When specifying the Procedure parameter, the [task flow status change callback](https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1) will return the value of this field, up to 1000 characters. Valid at that time only when IsPersistence is 1. 
     * @return SessionContext Session context, used to pass through user request information. When specifying the Procedure parameter, the [task flow status change callback](https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1) will return the value of this field, up to 1000 characters. Valid at that time only when IsPersistence is 1.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Session context, used to pass through user request information. When specifying the Procedure parameter, the [task flow status change callback](https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1) will return the value of this field, up to 1000 characters. Valid at that time only when IsPersistence is 1.
     * @param SessionContext Session context, used to pass through user request information. When specifying the Procedure parameter, the [task flow status change callback](https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1) will return the value of this field, up to 1000 characters. Valid at that time only when IsPersistence is 1.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get Whether to return edited video metadata. 0: not required, 1: required. By default, does not need. 
     * @return MetaDataRequired Whether to return edited video metadata. 0: not required, 1: required. By default, does not need.
     */
    public Long getMetaDataRequired() {
        return this.MetaDataRequired;
    }

    /**
     * Set Whether to return edited video metadata. 0: not required, 1: required. By default, does not need.
     * @param MetaDataRequired Whether to return edited video metadata. 0: not required, 1: required. By default, does not need.
     */
    public void setMetaDataRequired(Long MetaDataRequired) {
        this.MetaDataRequired = MetaDataRequired;
    }

    /**
     * Get The domain name added in VOD for time shift playback must be associated with a recording template and have the time-shift service enabled in Cloud Streaming Services (https://www.tencentcloud.com/document/product/266/52220?from_cn_redirect=1#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E). **If the first call time of this interface is after 2021-01-01T00:00:00Z, this field is a required field.** 
     * @return Host The domain name added in VOD for time shift playback must be associated with a recording template and have the time-shift service enabled in Cloud Streaming Services (https://www.tencentcloud.com/document/product/266/52220?from_cn_redirect=1#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E). **If the first call time of this interface is after 2021-01-01T00:00:00Z, this field is a required field.**
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set The domain name added in VOD for time shift playback must be associated with a recording template and have the time-shift service enabled in Cloud Streaming Services (https://www.tencentcloud.com/document/product/266/52220?from_cn_redirect=1#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E). **If the first call time of this interface is after 2021-01-01T00:00:00Z, this field is a required field.**
     * @param Host The domain name added in VOD for time shift playback must be associated with a recording template and have the time-shift service enabled in Cloud Streaming Services (https://www.tencentcloud.com/document/product/266/52220?from_cn_redirect=1#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E). **If the first call time of this interface is after 2021-01-01T00:00:00Z, this field is a required field.**
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Edited live stream information
<li>Default video editing for the original stream.</li>
<li>When the Type specified in StreamInfo is Transcoding, edit the live streaming transcoding stream corresponding to TemplateId.</li> 
     * @return StreamInfo Edited live stream information
<li>Default video editing for the original stream.</li>
<li>When the Type specified in StreamInfo is Transcoding, edit the live streaming transcoding stream corresponding to TemplateId.</li>
     */
    public LiveRealTimeClipStreamInfo getStreamInfo() {
        return this.StreamInfo;
    }

    /**
     * Set Edited live stream information
<li>Default video editing for the original stream.</li>
<li>When the Type specified in StreamInfo is Transcoding, edit the live streaming transcoding stream corresponding to TemplateId.</li>
     * @param StreamInfo Edited live stream information
<li>Default video editing for the original stream.</li>
<li>When the Type specified in StreamInfo is Transcoding, edit the live streaming transcoding stream corresponding to TemplateId.</li>
     */
    public void setStreamInfo(LiveRealTimeClipStreamInfo StreamInfo) {
        this.StreamInfo = StreamInfo;
    }

    /**
     * Get System reserved field. Do not fill in. 
     * @return ExtInfo System reserved field. Do not fill in.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set System reserved field. Do not fill in.
     * @param ExtInfo System reserved field. Do not fill in.
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public LiveRealTimeClipRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveRealTimeClipRequest(LiveRealTimeClipRequest source) {
        if (source.StreamId != null) {
            this.StreamId = new String(source.StreamId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.IsPersistence != null) {
            this.IsPersistence = new Long(source.IsPersistence);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Procedure != null) {
            this.Procedure = new String(source.Procedure);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.SourceContext != null) {
            this.SourceContext = new String(source.SourceContext);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.MetaDataRequired != null) {
            this.MetaDataRequired = new Long(source.MetaDataRequired);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.StreamInfo != null) {
            this.StreamInfo = new LiveRealTimeClipStreamInfo(source.StreamInfo);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "IsPersistence", this.IsPersistence);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "SourceContext", this.SourceContext);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "MetaDataRequired", this.MetaDataRequired);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamObj(map, prefix + "StreamInfo.", this.StreamInfo);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

