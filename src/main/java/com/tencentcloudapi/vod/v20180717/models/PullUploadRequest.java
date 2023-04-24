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

public class PullUploadRequest extends AbstractModel{

    /**
    * The URL of the media to pull, which can be in HLS format, but not DASH format.
For more information about supported extensions, see [Media types](https://intl.cloud.tencent.com/document/product/266/9760#media-types). Please make sure the URL is accessible.
    */
    @SerializedName("MediaUrl")
    @Expose
    private String MediaUrl;

    /**
    * The file format (extension). For information about supported extensions, see [Media Types](https://intl.cloud.tencent.com/document/product/266/9760?from_cn_redirect=1#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B).
If you do not specify this parameter or pass in an empty string, the file obtained will have the same extension as `MediaUrl`.
    */
    @SerializedName("MediaType")
    @Expose
    private String MediaType;

    /**
    * <b>The VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Media name.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * The URL of the video to pull. Supported formats include GIF, JPEG (JPG), and PNG.
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * Subsequent task for media. For more information, please see [Specifying Task Flow After Upload](https://intl.cloud.tencent.com/document/product/266/9759?from_cn_redirect=1).
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * Expiration time of media file in ISO 8601 format. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Specifies upload region. This is only applicable to users that have special requirements for the upload region:
<li>If it is left empty, the upload region is your [default region](https://intl.cloud.tencent.com/document/product/266/14059?from=11329?from_cn_redirect=1#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4);</li>
<li>If it is specified, please make sure that the upload region has been [enabled for storage](https://intl.cloud.tencent.com/document/product/266/14059?from=11329?from_cn_redirect=1#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4).</li>
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [CreateClass](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API.
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * The source context which is used to pass through the user request information. After `Procedure` is specified, the task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * Used to identify duplicate requests. After you send a request, if any request with the same `SessionId` has already been sent in the last three days (72 hours), an error message will be returned. `SessionId` contains up to 50 characters. If this parameter is not carried or is an empty string, no deduplication will be performed.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Reserved field for special purposes.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * Source context, which is used to pass through the user request information. The [upload callback](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) API will return the value of this field. It can contain up to 250 characters.
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
     * Get The URL of the media to pull, which can be in HLS format, but not DASH format.
For more information about supported extensions, see [Media types](https://intl.cloud.tencent.com/document/product/266/9760#media-types). Please make sure the URL is accessible. 
     * @return MediaUrl The URL of the media to pull, which can be in HLS format, but not DASH format.
For more information about supported extensions, see [Media types](https://intl.cloud.tencent.com/document/product/266/9760#media-types). Please make sure the URL is accessible.
     */
    public String getMediaUrl() {
        return this.MediaUrl;
    }

    /**
     * Set The URL of the media to pull, which can be in HLS format, but not DASH format.
For more information about supported extensions, see [Media types](https://intl.cloud.tencent.com/document/product/266/9760#media-types). Please make sure the URL is accessible.
     * @param MediaUrl The URL of the media to pull, which can be in HLS format, but not DASH format.
For more information about supported extensions, see [Media types](https://intl.cloud.tencent.com/document/product/266/9760#media-types). Please make sure the URL is accessible.
     */
    public void setMediaUrl(String MediaUrl) {
        this.MediaUrl = MediaUrl;
    }

    /**
     * Get The file format (extension). For information about supported extensions, see [Media Types](https://intl.cloud.tencent.com/document/product/266/9760?from_cn_redirect=1#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B).
If you do not specify this parameter or pass in an empty string, the file obtained will have the same extension as `MediaUrl`. 
     * @return MediaType The file format (extension). For information about supported extensions, see [Media Types](https://intl.cloud.tencent.com/document/product/266/9760?from_cn_redirect=1#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B).
If you do not specify this parameter or pass in an empty string, the file obtained will have the same extension as `MediaUrl`.
     */
    public String getMediaType() {
        return this.MediaType;
    }

    /**
     * Set The file format (extension). For information about supported extensions, see [Media Types](https://intl.cloud.tencent.com/document/product/266/9760?from_cn_redirect=1#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B).
If you do not specify this parameter or pass in an empty string, the file obtained will have the same extension as `MediaUrl`.
     * @param MediaType The file format (extension). For information about supported extensions, see [Media Types](https://intl.cloud.tencent.com/document/product/266/9760?from_cn_redirect=1#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B).
If you do not specify this parameter or pass in an empty string, the file obtained will have the same extension as `MediaUrl`.
     */
    public void setMediaType(String MediaType) {
        this.MediaType = MediaType;
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
     * Get Media name. 
     * @return MediaName Media name.
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set Media name.
     * @param MediaName Media name.
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get The URL of the video to pull. Supported formats include GIF, JPEG (JPG), and PNG. 
     * @return CoverUrl The URL of the video to pull. Supported formats include GIF, JPEG (JPG), and PNG.
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set The URL of the video to pull. Supported formats include GIF, JPEG (JPG), and PNG.
     * @param CoverUrl The URL of the video to pull. Supported formats include GIF, JPEG (JPG), and PNG.
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get Subsequent task for media. For more information, please see [Specifying Task Flow After Upload](https://intl.cloud.tencent.com/document/product/266/9759?from_cn_redirect=1). 
     * @return Procedure Subsequent task for media. For more information, please see [Specifying Task Flow After Upload](https://intl.cloud.tencent.com/document/product/266/9759?from_cn_redirect=1).
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set Subsequent task for media. For more information, please see [Specifying Task Flow After Upload](https://intl.cloud.tencent.com/document/product/266/9759?from_cn_redirect=1).
     * @param Procedure Subsequent task for media. For more information, please see [Specifying Task Flow After Upload](https://intl.cloud.tencent.com/document/product/266/9759?from_cn_redirect=1).
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get Expiration time of media file in ISO 8601 format. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return ExpireTime Expiration time of media file in ISO 8601 format. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time of media file in ISO 8601 format. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param ExpireTime Expiration time of media file in ISO 8601 format. For more information, please see [Notes on ISO Date Format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Specifies upload region. This is only applicable to users that have special requirements for the upload region:
<li>If it is left empty, the upload region is your [default region](https://intl.cloud.tencent.com/document/product/266/14059?from=11329?from_cn_redirect=1#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4);</li>
<li>If it is specified, please make sure that the upload region has been [enabled for storage](https://intl.cloud.tencent.com/document/product/266/14059?from=11329?from_cn_redirect=1#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4).</li> 
     * @return StorageRegion Specifies upload region. This is only applicable to users that have special requirements for the upload region:
<li>If it is left empty, the upload region is your [default region](https://intl.cloud.tencent.com/document/product/266/14059?from=11329?from_cn_redirect=1#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4);</li>
<li>If it is specified, please make sure that the upload region has been [enabled for storage](https://intl.cloud.tencent.com/document/product/266/14059?from=11329?from_cn_redirect=1#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4).</li>
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set Specifies upload region. This is only applicable to users that have special requirements for the upload region:
<li>If it is left empty, the upload region is your [default region](https://intl.cloud.tencent.com/document/product/266/14059?from=11329?from_cn_redirect=1#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4);</li>
<li>If it is specified, please make sure that the upload region has been [enabled for storage](https://intl.cloud.tencent.com/document/product/266/14059?from=11329?from_cn_redirect=1#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4).</li>
     * @param StorageRegion Specifies upload region. This is only applicable to users that have special requirements for the upload region:
<li>If it is left empty, the upload region is your [default region](https://intl.cloud.tencent.com/document/product/266/14059?from=11329?from_cn_redirect=1#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4);</li>
<li>If it is specified, please make sure that the upload region has been [enabled for storage](https://intl.cloud.tencent.com/document/product/266/14059?from=11329?from_cn_redirect=1#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4).</li>
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [CreateClass](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API. 
     * @return ClassId Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [CreateClass](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [CreateClass](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API.
     * @param ClassId Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [CreateClass](https://intl.cloud.tencent.com/document/product/266/7812?from_cn_redirect=1) API.
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get The source context which is used to pass through the user request information. After `Procedure` is specified, the task flow status change callback will return the value of this field. It can contain up to 1,000 characters. 
     * @return SessionContext The source context which is used to pass through the user request information. After `Procedure` is specified, the task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set The source context which is used to pass through the user request information. After `Procedure` is specified, the task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
     * @param SessionContext The source context which is used to pass through the user request information. After `Procedure` is specified, the task flow status change callback will return the value of this field. It can contain up to 1,000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get Used to identify duplicate requests. After you send a request, if any request with the same `SessionId` has already been sent in the last three days (72 hours), an error message will be returned. `SessionId` contains up to 50 characters. If this parameter is not carried or is an empty string, no deduplication will be performed. 
     * @return SessionId Used to identify duplicate requests. After you send a request, if any request with the same `SessionId` has already been sent in the last three days (72 hours), an error message will be returned. `SessionId` contains up to 50 characters. If this parameter is not carried or is an empty string, no deduplication will be performed.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Used to identify duplicate requests. After you send a request, if any request with the same `SessionId` has already been sent in the last three days (72 hours), an error message will be returned. `SessionId` contains up to 50 characters. If this parameter is not carried or is an empty string, no deduplication will be performed.
     * @param SessionId Used to identify duplicate requests. After you send a request, if any request with the same `SessionId` has already been sent in the last three days (72 hours), an error message will be returned. `SessionId` contains up to 50 characters. If this parameter is not carried or is an empty string, no deduplication will be performed.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Reserved field for special purposes. 
     * @return ExtInfo Reserved field for special purposes.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Reserved field for special purposes.
     * @param ExtInfo Reserved field for special purposes.
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get Source context, which is used to pass through the user request information. The [upload callback](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) API will return the value of this field. It can contain up to 250 characters. 
     * @return SourceContext Source context, which is used to pass through the user request information. The [upload callback](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) API will return the value of this field. It can contain up to 250 characters.
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set Source context, which is used to pass through the user request information. The [upload callback](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) API will return the value of this field. It can contain up to 250 characters.
     * @param SourceContext Source context, which is used to pass through the user request information. The [upload callback](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) API will return the value of this field. It can contain up to 250 characters.
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    public PullUploadRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PullUploadRequest(PullUploadRequest source) {
        if (source.MediaUrl != null) {
            this.MediaUrl = new String(source.MediaUrl);
        }
        if (source.MediaType != null) {
            this.MediaType = new String(source.MediaType);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.Procedure != null) {
            this.Procedure = new String(source.Procedure);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.SourceContext != null) {
            this.SourceContext = new String(source.SourceContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaUrl", this.MediaUrl);
        this.setParamSimple(map, prefix + "MediaType", this.MediaType);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "SourceContext", this.SourceContext);

    }
}

