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

public class SimpleHlsClipRequest extends AbstractModel {

    /**
    * Tencent Cloud VOD HLS video URL that needs to be cropped.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Crop start offset time, in seconds. Default 0, crop from the beginning of the video. Negative numbers indicate how many seconds from the end of the video to start cropping. For example, -10 means start trimming from 10 seconds before the end.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * Crop end offset time in seconds. Default is 0, which means crop to the end of the video. Negative numbers indicate how many seconds from the end of the video to end cropping. For example, -10 means end cropping at 10 seconds before the end.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * Whether solidified. 0: not solidified, 1: solidified. Default non-permanent.
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
    * Post-editing Solidified Video On-demand Task Flow Processing. For details, see upload specified task flow (https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1). Valid only when IsPersistence is 1.
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicating other categories.</li>
Valid when IsPersistence is 1.
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * Source context, used to pass through user request information. The [callback on upload completion](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) will return the value of this field, up to 250 characters. Valid when IsPersistence is 1.
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
    * Session context, used to pass through user request information. When specifying the Procedure parameter, the [task flow status change callback](https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1) will return the value of this field, up to 1000 characters. Valid only when IsPersistence is 1.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * Deprecated.
    */
    @SerializedName("Precision")
    @Expose
    private String Precision;

    /**
    * Output video type. Valid values: <li>hls: Output hls file.</li>Default value hls.
    */
    @SerializedName("OutputMediaType")
    @Expose
    private String OutputMediaType;

    /**
    * Reserved field, used when special purpose. Example value: ""
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get Tencent Cloud VOD HLS video URL that needs to be cropped. 
     * @return Url Tencent Cloud VOD HLS video URL that needs to be cropped.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Tencent Cloud VOD HLS video URL that needs to be cropped.
     * @param Url Tencent Cloud VOD HLS video URL that needs to be cropped.
     */
    public void setUrl(String Url) {
        this.Url = Url;
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

    /**
     * Get Crop start offset time, in seconds. Default 0, crop from the beginning of the video. Negative numbers indicate how many seconds from the end of the video to start cropping. For example, -10 means start trimming from 10 seconds before the end. 
     * @return StartTimeOffset Crop start offset time, in seconds. Default 0, crop from the beginning of the video. Negative numbers indicate how many seconds from the end of the video to start cropping. For example, -10 means start trimming from 10 seconds before the end.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Crop start offset time, in seconds. Default 0, crop from the beginning of the video. Negative numbers indicate how many seconds from the end of the video to start cropping. For example, -10 means start trimming from 10 seconds before the end.
     * @param StartTimeOffset Crop start offset time, in seconds. Default 0, crop from the beginning of the video. Negative numbers indicate how many seconds from the end of the video to start cropping. For example, -10 means start trimming from 10 seconds before the end.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get Crop end offset time in seconds. Default is 0, which means crop to the end of the video. Negative numbers indicate how many seconds from the end of the video to end cropping. For example, -10 means end cropping at 10 seconds before the end. 
     * @return EndTimeOffset Crop end offset time in seconds. Default is 0, which means crop to the end of the video. Negative numbers indicate how many seconds from the end of the video to end cropping. For example, -10 means end cropping at 10 seconds before the end.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set Crop end offset time in seconds. Default is 0, which means crop to the end of the video. Negative numbers indicate how many seconds from the end of the video to end cropping. For example, -10 means end cropping at 10 seconds before the end.
     * @param EndTimeOffset Crop end offset time in seconds. Default is 0, which means crop to the end of the video. Negative numbers indicate how many seconds from the end of the video to end cropping. For example, -10 means end cropping at 10 seconds before the end.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Whether solidified. 0: not solidified, 1: solidified. Default non-permanent. 
     * @return IsPersistence Whether solidified. 0: not solidified, 1: solidified. Default non-permanent.
     */
    public Long getIsPersistence() {
        return this.IsPersistence;
    }

    /**
     * Set Whether solidified. 0: not solidified, 1: solidified. Default non-permanent.
     * @param IsPersistence Whether solidified. 0: not solidified, 1: solidified. Default non-permanent.
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
     * Get Post-editing Solidified Video On-demand Task Flow Processing. For details, see upload specified task flow (https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1). Valid only when IsPersistence is 1. 
     * @return Procedure Post-editing Solidified Video On-demand Task Flow Processing. For details, see upload specified task flow (https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1). Valid only when IsPersistence is 1.
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set Post-editing Solidified Video On-demand Task Flow Processing. For details, see upload specified task flow (https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1). Valid only when IsPersistence is 1.
     * @param Procedure Post-editing Solidified Video On-demand Task Flow Processing. For details, see upload specified task flow (https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1). Valid only when IsPersistence is 1.
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicating other categories.</li>
Valid when IsPersistence is 1. 
     * @return ClassId Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicating other categories.</li>
Valid when IsPersistence is 1.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicating other categories.</li>
Valid when IsPersistence is 1.
     * @param ClassId Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1) API.
<li>Default value: 0, indicating other categories.</li>
Valid when IsPersistence is 1.
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get Source context, used to pass through user request information. The [callback on upload completion](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) will return the value of this field, up to 250 characters. Valid when IsPersistence is 1. 
     * @return SourceContext Source context, used to pass through user request information. The [callback on upload completion](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) will return the value of this field, up to 250 characters. Valid when IsPersistence is 1.
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set Source context, used to pass through user request information. The [callback on upload completion](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) will return the value of this field, up to 250 characters. Valid when IsPersistence is 1.
     * @param SourceContext Source context, used to pass through user request information. The [callback on upload completion](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) will return the value of this field, up to 250 characters. Valid when IsPersistence is 1.
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    /**
     * Get Session context, used to pass through user request information. When specifying the Procedure parameter, the [task flow status change callback](https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1) will return the value of this field, up to 1000 characters. Valid only when IsPersistence is 1. 
     * @return SessionContext Session context, used to pass through user request information. When specifying the Procedure parameter, the [task flow status change callback](https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1) will return the value of this field, up to 1000 characters. Valid only when IsPersistence is 1.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Session context, used to pass through user request information. When specifying the Procedure parameter, the [task flow status change callback](https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1) will return the value of this field, up to 1000 characters. Valid only when IsPersistence is 1.
     * @param SessionContext Session context, used to pass through user request information. When specifying the Procedure parameter, the [task flow status change callback](https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1) will return the value of this field, up to 1000 characters. Valid only when IsPersistence is 1.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get Deprecated. 
     * @return Precision Deprecated.
     * @deprecated
     */
    @Deprecated
    public String getPrecision() {
        return this.Precision;
    }

    /**
     * Set Deprecated.
     * @param Precision Deprecated.
     * @deprecated
     */
    @Deprecated
    public void setPrecision(String Precision) {
        this.Precision = Precision;
    }

    /**
     * Get Output video type. Valid values: <li>hls: Output hls file.</li>Default value hls. 
     * @return OutputMediaType Output video type. Valid values: <li>hls: Output hls file.</li>Default value hls.
     */
    public String getOutputMediaType() {
        return this.OutputMediaType;
    }

    /**
     * Set Output video type. Valid values: <li>hls: Output hls file.</li>Default value hls.
     * @param OutputMediaType Output video type. Valid values: <li>hls: Output hls file.</li>Default value hls.
     */
    public void setOutputMediaType(String OutputMediaType) {
        this.OutputMediaType = OutputMediaType;
    }

    /**
     * Get Reserved field, used when special purpose. Example value: "" 
     * @return ExtInfo Reserved field, used when special purpose. Example value: ""
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Reserved field, used when special purpose. Example value: ""
     * @param ExtInfo Reserved field, used when special purpose. Example value: ""
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public SimpleHlsClipRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleHlsClipRequest(SimpleHlsClipRequest source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
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
        if (source.Precision != null) {
            this.Precision = new String(source.Precision);
        }
        if (source.OutputMediaType != null) {
            this.OutputMediaType = new String(source.OutputMediaType);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "IsPersistence", this.IsPersistence);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "SourceContext", this.SourceContext);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "Precision", this.Precision);
        this.setParamSimple(map, prefix + "OutputMediaType", this.OutputMediaType);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

