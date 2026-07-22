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
    * <p>Push stream live code.</p>
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * <p>Start time of stream clipping. Format reference: <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>The end time of stream clipping. Format reference <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether it is the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Whether solidified. 0 for default non-permanent, 1 for solidified. Default non-permanent.</p>
    */
    @SerializedName("IsPersistence")
    @Expose
    private Long IsPersistence;

    /**
    * <p>Video storage expiry time after editing solidification. Format reference <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>. Enter "9999-12-31T23:59:59Z" to indicate the video never expires. After expiry, the media file and its related resources (transcoding result, sprites) will be permanently deleted. Valid at that time only when IsPersistence is 1. The default video editing never expires.</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>Post-editing Solidified Video On-demand Task Flow Processing. For details, see <a href="https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1">upload specified task flow</a>. Valid when IsPersistence is 1.</p>
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the <a href="/document/product/266/31772">Create Category</a> API.</p><li>Default value: 0, indicating other categories.</li>Valid at that time only when IsPersistence is 1.
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * <p>Source context. This is used to pass user request information. The <a href="/document/product/266/7830">upload completion callback</a> returns the value of this field. The maximum length is 250 characters. Valid only when IsPersistence is 1.</p>
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
    * <p>Session context. This is used to pass through user request information. When specifying the Procedure parameter, the <a href="/document/product/266/9636">task flow status change callback</a> returns the value of this field. The maximum length is 1000 characters. Valid only when IsPersistence is 1.</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>Whether to return edited video metadata. 0: not required, 1: required. By default, does not need.</p>
    */
    @SerializedName("MetaDataRequired")
    @Expose
    private Long MetaDataRequired;

    /**
    * <p>The domain name added in VOD for time-shifting playback must have <a href="https://www.tencentcloud.com/document/product/266/52220?from_cn_redirect=1#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E">recording template binding and time-shift service enabled</a> in Cloud Streaming Services. <strong>If the first call time of this interface is after 2021-01-01T00:00:00Z, this field is a required field.</strong></p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>Live stream information for editing:</p><li>Edit the original stream by default.</li><li>When the Type specified in StreamInfo is Transcoding, edit the live streaming transcoding corresponding to TemplateId.</li>
    */
    @SerializedName("StreamInfo")
    @Expose
    private LiveRealTimeClipStreamInfo StreamInfo;

    /**
    * <p>System reserved field. Do not fill in.</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p>Push stream live code.</p> 
     * @return StreamId <p>Push stream live code.</p>
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set <p>Push stream live code.</p>
     * @param StreamId <p>Push stream live code.</p>
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get <p>Start time of stream clipping. Format reference: <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p> 
     * @return StartTime <p>Start time of stream clipping. Format reference: <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time of stream clipping. Format reference: <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     * @param StartTime <p>Start time of stream clipping. Format reference: <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>The end time of stream clipping. Format reference <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p> 
     * @return EndTime <p>The end time of stream clipping. Format reference <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>The end time of stream clipping. Format reference <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     * @param EndTime <p>The end time of stream clipping. Format reference <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether it is the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether it is the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether it is the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>Video-on-demand (VOD) <a href="/document/product/266/14574">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether it is the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Whether solidified. 0 for default non-permanent, 1 for solidified. Default non-permanent.</p> 
     * @return IsPersistence <p>Whether solidified. 0 for default non-permanent, 1 for solidified. Default non-permanent.</p>
     */
    public Long getIsPersistence() {
        return this.IsPersistence;
    }

    /**
     * Set <p>Whether solidified. 0 for default non-permanent, 1 for solidified. Default non-permanent.</p>
     * @param IsPersistence <p>Whether solidified. 0 for default non-permanent, 1 for solidified. Default non-permanent.</p>
     */
    public void setIsPersistence(Long IsPersistence) {
        this.IsPersistence = IsPersistence;
    }

    /**
     * Get <p>Video storage expiry time after editing solidification. Format reference <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>. Enter "9999-12-31T23:59:59Z" to indicate the video never expires. After expiry, the media file and its related resources (transcoding result, sprites) will be permanently deleted. Valid at that time only when IsPersistence is 1. The default video editing never expires.</p> 
     * @return ExpireTime <p>Video storage expiry time after editing solidification. Format reference <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>. Enter "9999-12-31T23:59:59Z" to indicate the video never expires. After expiry, the media file and its related resources (transcoding result, sprites) will be permanently deleted. Valid at that time only when IsPersistence is 1. The default video editing never expires.</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Video storage expiry time after editing solidification. Format reference <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>. Enter "9999-12-31T23:59:59Z" to indicate the video never expires. After expiry, the media file and its related resources (transcoding result, sprites) will be permanently deleted. Valid at that time only when IsPersistence is 1. The default video editing never expires.</p>
     * @param ExpireTime <p>Video storage expiry time after editing solidification. Format reference <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>. Enter "9999-12-31T23:59:59Z" to indicate the video never expires. After expiry, the media file and its related resources (transcoding result, sprites) will be permanently deleted. Valid at that time only when IsPersistence is 1. The default video editing never expires.</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>Post-editing Solidified Video On-demand Task Flow Processing. For details, see <a href="https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1">upload specified task flow</a>. Valid when IsPersistence is 1.</p> 
     * @return Procedure <p>Post-editing Solidified Video On-demand Task Flow Processing. For details, see <a href="https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1">upload specified task flow</a>. Valid when IsPersistence is 1.</p>
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set <p>Post-editing Solidified Video On-demand Task Flow Processing. For details, see <a href="https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1">upload specified task flow</a>. Valid when IsPersistence is 1.</p>
     * @param Procedure <p>Post-editing Solidified Video On-demand Task Flow Processing. For details, see <a href="https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1">upload specified task flow</a>. Valid when IsPersistence is 1.</p>
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the <a href="/document/product/266/31772">Create Category</a> API.</p><li>Default value: 0, indicating other categories.</li>Valid at that time only when IsPersistence is 1. 
     * @return ClassId <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the <a href="/document/product/266/31772">Create Category</a> API.</p><li>Default value: 0, indicating other categories.</li>Valid at that time only when IsPersistence is 1.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the <a href="/document/product/266/31772">Create Category</a> API.</p><li>Default value: 0, indicating other categories.</li>Valid at that time only when IsPersistence is 1.
     * @param ClassId <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the <a href="/document/product/266/31772">Create Category</a> API.</p><li>Default value: 0, indicating other categories.</li>Valid at that time only when IsPersistence is 1.
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get <p>Source context. This is used to pass user request information. The <a href="/document/product/266/7830">upload completion callback</a> returns the value of this field. The maximum length is 250 characters. Valid only when IsPersistence is 1.</p> 
     * @return SourceContext <p>Source context. This is used to pass user request information. The <a href="/document/product/266/7830">upload completion callback</a> returns the value of this field. The maximum length is 250 characters. Valid only when IsPersistence is 1.</p>
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set <p>Source context. This is used to pass user request information. The <a href="/document/product/266/7830">upload completion callback</a> returns the value of this field. The maximum length is 250 characters. Valid only when IsPersistence is 1.</p>
     * @param SourceContext <p>Source context. This is used to pass user request information. The <a href="/document/product/266/7830">upload completion callback</a> returns the value of this field. The maximum length is 250 characters. Valid only when IsPersistence is 1.</p>
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    /**
     * Get <p>Session context. This is used to pass through user request information. When specifying the Procedure parameter, the <a href="/document/product/266/9636">task flow status change callback</a> returns the value of this field. The maximum length is 1000 characters. Valid only when IsPersistence is 1.</p> 
     * @return SessionContext <p>Session context. This is used to pass through user request information. When specifying the Procedure parameter, the <a href="/document/product/266/9636">task flow status change callback</a> returns the value of this field. The maximum length is 1000 characters. Valid only when IsPersistence is 1.</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>Session context. This is used to pass through user request information. When specifying the Procedure parameter, the <a href="/document/product/266/9636">task flow status change callback</a> returns the value of this field. The maximum length is 1000 characters. Valid only when IsPersistence is 1.</p>
     * @param SessionContext <p>Session context. This is used to pass through user request information. When specifying the Procedure parameter, the <a href="/document/product/266/9636">task flow status change callback</a> returns the value of this field. The maximum length is 1000 characters. Valid only when IsPersistence is 1.</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>Whether to return edited video metadata. 0: not required, 1: required. By default, does not need.</p> 
     * @return MetaDataRequired <p>Whether to return edited video metadata. 0: not required, 1: required. By default, does not need.</p>
     */
    public Long getMetaDataRequired() {
        return this.MetaDataRequired;
    }

    /**
     * Set <p>Whether to return edited video metadata. 0: not required, 1: required. By default, does not need.</p>
     * @param MetaDataRequired <p>Whether to return edited video metadata. 0: not required, 1: required. By default, does not need.</p>
     */
    public void setMetaDataRequired(Long MetaDataRequired) {
        this.MetaDataRequired = MetaDataRequired;
    }

    /**
     * Get <p>The domain name added in VOD for time-shifting playback must have <a href="https://www.tencentcloud.com/document/product/266/52220?from_cn_redirect=1#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E">recording template binding and time-shift service enabled</a> in Cloud Streaming Services. <strong>If the first call time of this interface is after 2021-01-01T00:00:00Z, this field is a required field.</strong></p> 
     * @return Host <p>The domain name added in VOD for time-shifting playback must have <a href="https://www.tencentcloud.com/document/product/266/52220?from_cn_redirect=1#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E">recording template binding and time-shift service enabled</a> in Cloud Streaming Services. <strong>If the first call time of this interface is after 2021-01-01T00:00:00Z, this field is a required field.</strong></p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>The domain name added in VOD for time-shifting playback must have <a href="https://www.tencentcloud.com/document/product/266/52220?from_cn_redirect=1#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E">recording template binding and time-shift service enabled</a> in Cloud Streaming Services. <strong>If the first call time of this interface is after 2021-01-01T00:00:00Z, this field is a required field.</strong></p>
     * @param Host <p>The domain name added in VOD for time-shifting playback must have <a href="https://www.tencentcloud.com/document/product/266/52220?from_cn_redirect=1#.E6.AD.A5.E9.AA.A43.EF.BC.9A.E5.85.B3.E8.81.94.E5.BD.95.E5.88.B6.E6.A8.A1.E6.9D.BF.3Ca-id.3D.22step3.22.3E.3C.2Fa.3E">recording template binding and time-shift service enabled</a> in Cloud Streaming Services. <strong>If the first call time of this interface is after 2021-01-01T00:00:00Z, this field is a required field.</strong></p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>Live stream information for editing:</p><li>Edit the original stream by default.</li><li>When the Type specified in StreamInfo is Transcoding, edit the live streaming transcoding corresponding to TemplateId.</li> 
     * @return StreamInfo <p>Live stream information for editing:</p><li>Edit the original stream by default.</li><li>When the Type specified in StreamInfo is Transcoding, edit the live streaming transcoding corresponding to TemplateId.</li>
     */
    public LiveRealTimeClipStreamInfo getStreamInfo() {
        return this.StreamInfo;
    }

    /**
     * Set <p>Live stream information for editing:</p><li>Edit the original stream by default.</li><li>When the Type specified in StreamInfo is Transcoding, edit the live streaming transcoding corresponding to TemplateId.</li>
     * @param StreamInfo <p>Live stream information for editing:</p><li>Edit the original stream by default.</li><li>When the Type specified in StreamInfo is Transcoding, edit the live streaming transcoding corresponding to TemplateId.</li>
     */
    public void setStreamInfo(LiveRealTimeClipStreamInfo StreamInfo) {
        this.StreamInfo = StreamInfo;
    }

    /**
     * Get <p>System reserved field. Do not fill in.</p> 
     * @return ExtInfo <p>System reserved field. Do not fill in.</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>System reserved field. Do not fill in.</p>
     * @param ExtInfo <p>System reserved field. Do not fill in.</p>
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

