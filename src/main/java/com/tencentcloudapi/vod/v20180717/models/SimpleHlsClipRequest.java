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

public class SimpleHlsClipRequest extends AbstractModel {

    /**
    * URL of the HLS video in VOD that needs to be clipped.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Start offset time of clipping in seconds. Default value: 0, which means to clip from the beginning of the video. A negative number indicates how many seconds from the end of the video clipping will start at. For example, -10 means that clipping will start at the 10th second from the end.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End offset time of clipping in seconds. Default value: 0, which means to clip till the end of the video. A negative number indicates how many seconds from the end of the video clipping will end. For example, -10 means that clipping will end at the 10th second from the end.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * Whether to store the video clip persistently. 0: no (default), 1: yes.
    */
    @SerializedName("IsPersistence")
    @Expose
    private Long IsPersistence;

    /**
    * The expiration time of the video clip that is to be saved, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). `9999-12-31T23:59:59Z` is the default value, which means the video clip will never expire. After expiration, the media file and its related resources (such as transcoding results and image sprites) will be permanently deleted. This parameter is valid only if `IsPersistence` is 1.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * The task flow to execute on the video clipped for persistent storage. For details, see [Upload from Server](https://intl.cloud.tencent.com/document/product/266/33912). This parameter is valid only if `IsPersistence` is 1.
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * The ID of the media file's category. You can use the [CreateClass](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API to create a category and get the category ID.
<li>The default value is `0`, which means the "Other" category.</li>
This parameter is valid only if `IsPersistence` is `1`.
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * The source context, which is used to pass through user request information. The [NewFileUpload](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) callback will return the value of this parameter. It can contain up to 250 characters and is valid only if `IsPersistence` is `1`.
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
    * The session context, which is used to pass through user request information. If the `Procedure` parameter is specified, the [ProcedureStateChanged](https://intl.cloud.tencent.com/document/product/266/9636?from_cn_redirect=1) callback will return the value of this parameter. It can contain up to 1,000 characters and is valid only if `IsPersistence` is `1`.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 
    */
    @SerializedName("Precision")
    @Expose
    private String Precision;

    /**
    * 
    */
    @SerializedName("OutputMediaType")
    @Expose
    private String OutputMediaType;

    /**
    * 
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get URL of the HLS video in VOD that needs to be clipped. 
     * @return Url URL of the HLS video in VOD that needs to be clipped.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL of the HLS video in VOD that needs to be clipped.
     * @param Url URL of the HLS video in VOD that needs to be clipped.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Start offset time of clipping in seconds. Default value: 0, which means to clip from the beginning of the video. A negative number indicates how many seconds from the end of the video clipping will start at. For example, -10 means that clipping will start at the 10th second from the end. 
     * @return StartTimeOffset Start offset time of clipping in seconds. Default value: 0, which means to clip from the beginning of the video. A negative number indicates how many seconds from the end of the video clipping will start at. For example, -10 means that clipping will start at the 10th second from the end.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start offset time of clipping in seconds. Default value: 0, which means to clip from the beginning of the video. A negative number indicates how many seconds from the end of the video clipping will start at. For example, -10 means that clipping will start at the 10th second from the end.
     * @param StartTimeOffset Start offset time of clipping in seconds. Default value: 0, which means to clip from the beginning of the video. A negative number indicates how many seconds from the end of the video clipping will start at. For example, -10 means that clipping will start at the 10th second from the end.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End offset time of clipping in seconds. Default value: 0, which means to clip till the end of the video. A negative number indicates how many seconds from the end of the video clipping will end. For example, -10 means that clipping will end at the 10th second from the end. 
     * @return EndTimeOffset End offset time of clipping in seconds. Default value: 0, which means to clip till the end of the video. A negative number indicates how many seconds from the end of the video clipping will end. For example, -10 means that clipping will end at the 10th second from the end.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End offset time of clipping in seconds. Default value: 0, which means to clip till the end of the video. A negative number indicates how many seconds from the end of the video clipping will end. For example, -10 means that clipping will end at the 10th second from the end.
     * @param EndTimeOffset End offset time of clipping in seconds. Default value: 0, which means to clip till the end of the video. A negative number indicates how many seconds from the end of the video clipping will end. For example, -10 means that clipping will end at the 10th second from the end.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Whether to store the video clip persistently. 0: no (default), 1: yes. 
     * @return IsPersistence Whether to store the video clip persistently. 0: no (default), 1: yes.
     */
    public Long getIsPersistence() {
        return this.IsPersistence;
    }

    /**
     * Set Whether to store the video clip persistently. 0: no (default), 1: yes.
     * @param IsPersistence Whether to store the video clip persistently. 0: no (default), 1: yes.
     */
    public void setIsPersistence(Long IsPersistence) {
        this.IsPersistence = IsPersistence;
    }

    /**
     * Get The expiration time of the video clip that is to be saved, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). `9999-12-31T23:59:59Z` is the default value, which means the video clip will never expire. After expiration, the media file and its related resources (such as transcoding results and image sprites) will be permanently deleted. This parameter is valid only if `IsPersistence` is 1. 
     * @return ExpireTime The expiration time of the video clip that is to be saved, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). `9999-12-31T23:59:59Z` is the default value, which means the video clip will never expire. After expiration, the media file and its related resources (such as transcoding results and image sprites) will be permanently deleted. This parameter is valid only if `IsPersistence` is 1.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set The expiration time of the video clip that is to be saved, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). `9999-12-31T23:59:59Z` is the default value, which means the video clip will never expire. After expiration, the media file and its related resources (such as transcoding results and image sprites) will be permanently deleted. This parameter is valid only if `IsPersistence` is 1.
     * @param ExpireTime The expiration time of the video clip that is to be saved, in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). `9999-12-31T23:59:59Z` is the default value, which means the video clip will never expire. After expiration, the media file and its related resources (such as transcoding results and image sprites) will be permanently deleted. This parameter is valid only if `IsPersistence` is 1.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get The task flow to execute on the video clipped for persistent storage. For details, see [Upload from Server](https://intl.cloud.tencent.com/document/product/266/33912). This parameter is valid only if `IsPersistence` is 1. 
     * @return Procedure The task flow to execute on the video clipped for persistent storage. For details, see [Upload from Server](https://intl.cloud.tencent.com/document/product/266/33912). This parameter is valid only if `IsPersistence` is 1.
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set The task flow to execute on the video clipped for persistent storage. For details, see [Upload from Server](https://intl.cloud.tencent.com/document/product/266/33912). This parameter is valid only if `IsPersistence` is 1.
     * @param Procedure The task flow to execute on the video clipped for persistent storage. For details, see [Upload from Server](https://intl.cloud.tencent.com/document/product/266/33912). This parameter is valid only if `IsPersistence` is 1.
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get The ID of the media file's category. You can use the [CreateClass](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API to create a category and get the category ID.
<li>The default value is `0`, which means the "Other" category.</li>
This parameter is valid only if `IsPersistence` is `1`. 
     * @return ClassId The ID of the media file's category. You can use the [CreateClass](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API to create a category and get the category ID.
<li>The default value is `0`, which means the "Other" category.</li>
This parameter is valid only if `IsPersistence` is `1`.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set The ID of the media file's category. You can use the [CreateClass](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API to create a category and get the category ID.
<li>The default value is `0`, which means the "Other" category.</li>
This parameter is valid only if `IsPersistence` is `1`.
     * @param ClassId The ID of the media file's category. You can use the [CreateClass](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API to create a category and get the category ID.
<li>The default value is `0`, which means the "Other" category.</li>
This parameter is valid only if `IsPersistence` is `1`.
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get The source context, which is used to pass through user request information. The [NewFileUpload](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) callback will return the value of this parameter. It can contain up to 250 characters and is valid only if `IsPersistence` is `1`. 
     * @return SourceContext The source context, which is used to pass through user request information. The [NewFileUpload](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) callback will return the value of this parameter. It can contain up to 250 characters and is valid only if `IsPersistence` is `1`.
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set The source context, which is used to pass through user request information. The [NewFileUpload](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) callback will return the value of this parameter. It can contain up to 250 characters and is valid only if `IsPersistence` is `1`.
     * @param SourceContext The source context, which is used to pass through user request information. The [NewFileUpload](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) callback will return the value of this parameter. It can contain up to 250 characters and is valid only if `IsPersistence` is `1`.
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    /**
     * Get The session context, which is used to pass through user request information. If the `Procedure` parameter is specified, the [ProcedureStateChanged](https://intl.cloud.tencent.com/document/product/266/9636?from_cn_redirect=1) callback will return the value of this parameter. It can contain up to 1,000 characters and is valid only if `IsPersistence` is `1`. 
     * @return SessionContext The session context, which is used to pass through user request information. If the `Procedure` parameter is specified, the [ProcedureStateChanged](https://intl.cloud.tencent.com/document/product/266/9636?from_cn_redirect=1) callback will return the value of this parameter. It can contain up to 1,000 characters and is valid only if `IsPersistence` is `1`.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set The session context, which is used to pass through user request information. If the `Procedure` parameter is specified, the [ProcedureStateChanged](https://intl.cloud.tencent.com/document/product/266/9636?from_cn_redirect=1) callback will return the value of this parameter. It can contain up to 1,000 characters and is valid only if `IsPersistence` is `1`.
     * @param SessionContext The session context, which is used to pass through user request information. If the `Procedure` parameter is specified, the [ProcedureStateChanged](https://intl.cloud.tencent.com/document/product/266/9636?from_cn_redirect=1) callback will return the value of this parameter. It can contain up to 1,000 characters and is valid only if `IsPersistence` is `1`.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get  
     * @return Precision 
     */
    public String getPrecision() {
        return this.Precision;
    }

    /**
     * Set 
     * @param Precision 
     */
    public void setPrecision(String Precision) {
        this.Precision = Precision;
    }

    /**
     * Get  
     * @return OutputMediaType 
     */
    public String getOutputMediaType() {
        return this.OutputMediaType;
    }

    /**
     * Set 
     * @param OutputMediaType 
     */
    public void setOutputMediaType(String OutputMediaType) {
        this.OutputMediaType = OutputMediaType;
    }

    /**
     * Get  
     * @return ExtInfo 
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 
     * @param ExtInfo 
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

