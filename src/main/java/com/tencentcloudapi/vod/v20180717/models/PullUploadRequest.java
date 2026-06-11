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

public class PullUploadRequest extends AbstractModel {

    /**
    * Media URL to be pulled. Temporary not support pull Dash format (support HLS).
Supported extensions are listed in [Media type](https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B). Please ensure the media URL can access.
    */
    @SerializedName("MediaUrl")
    @Expose
    private String MediaUrl;

    /**
    * Media type (extension). Supported types are detailed in [media type](https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B).
If MediaType is not filled in or takes an empty string, the file type will be automatically obtained based on MediaUrl.
    */
    @SerializedName("MediaType")
    @Expose
    private String MediaType;

    /**
    * <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
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
    * Video cover URL to pull. Supported file formats: gif, jpeg (jpg), png.
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * Media subsequent task operation. For details, see [Upload Specified Task Flow](https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1).
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * The media file expiry time, format according to ISO 8601. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Designate the upload park, applicable only to the user with special requirement for upload target region.
<li>If left blank, files will be uploaded to your [default region](https://www.tencentcloud.com/zh/document/product/266/18874?has_map=1#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4) by default.</li>
<li>If a designated upload park is specified, please confirm the [upload storage settings](https://www.tencentcloud.com/zh/document/product/266/18874) have already enabled corresponding storage regions.</li>
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/31772?from_cn_redirect=1) API.
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * Task priority. The higher the value, the higher the priority. The value ranges from -10 to 10. If left blank, the default value is 0.
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * Source context, used for passing through user request information. When specifying a Procedure task, the task flow status change callback will return the value of this field, up to 1000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Reserved field, used when special purpose.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * Source context, used to pass through user request information. The [callback on upload completion](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) will return the value of this field, up to 250 characters.
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
    * Media storage path, starting with /.
Only sub-apps in [FileID + Path mode](https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1) can specify the storage path.
    */
    @SerializedName("MediaStoragePath")
    @Expose
    private String MediaStoragePath;

    /**
     * Get Media URL to be pulled. Temporary not support pull Dash format (support HLS).
Supported extensions are listed in [Media type](https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B). Please ensure the media URL can access. 
     * @return MediaUrl Media URL to be pulled. Temporary not support pull Dash format (support HLS).
Supported extensions are listed in [Media type](https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B). Please ensure the media URL can access.
     */
    public String getMediaUrl() {
        return this.MediaUrl;
    }

    /**
     * Set Media URL to be pulled. Temporary not support pull Dash format (support HLS).
Supported extensions are listed in [Media type](https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B). Please ensure the media URL can access.
     * @param MediaUrl Media URL to be pulled. Temporary not support pull Dash format (support HLS).
Supported extensions are listed in [Media type](https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B). Please ensure the media URL can access.
     */
    public void setMediaUrl(String MediaUrl) {
        this.MediaUrl = MediaUrl;
    }

    /**
     * Get Media type (extension). Supported types are detailed in [media type](https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B).
If MediaType is not filled in or takes an empty string, the file type will be automatically obtained based on MediaUrl. 
     * @return MediaType Media type (extension). Supported types are detailed in [media type](https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B).
If MediaType is not filled in or takes an empty string, the file type will be automatically obtained based on MediaUrl.
     */
    public String getMediaType() {
        return this.MediaType;
    }

    /**
     * Set Media type (extension). Supported types are detailed in [media type](https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B).
If MediaType is not filled in or takes an empty string, the file type will be automatically obtained based on MediaUrl.
     * @param MediaType Media type (extension). Supported types are detailed in [media type](https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B).
If MediaType is not filled in or takes an empty string, the file type will be automatically obtained based on MediaUrl.
     */
    public void setMediaType(String MediaType) {
        this.MediaType = MediaType;
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
     * Get Video cover URL to pull. Supported file formats: gif, jpeg (jpg), png. 
     * @return CoverUrl Video cover URL to pull. Supported file formats: gif, jpeg (jpg), png.
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set Video cover URL to pull. Supported file formats: gif, jpeg (jpg), png.
     * @param CoverUrl Video cover URL to pull. Supported file formats: gif, jpeg (jpg), png.
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get Media subsequent task operation. For details, see [Upload Specified Task Flow](https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1). 
     * @return Procedure Media subsequent task operation. For details, see [Upload Specified Task Flow](https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1).
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set Media subsequent task operation. For details, see [Upload Specified Task Flow](https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1).
     * @param Procedure Media subsequent task operation. For details, see [Upload Specified Task Flow](https://www.tencentcloud.com/document/product/266/9759?from_cn_redirect=1).
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get The media file expiry time, format according to ISO 8601. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return ExpireTime The media file expiry time, format according to ISO 8601. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set The media file expiry time, format according to ISO 8601. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param ExpireTime The media file expiry time, format according to ISO 8601. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Designate the upload park, applicable only to the user with special requirement for upload target region.
<li>If left blank, files will be uploaded to your [default region](https://www.tencentcloud.com/zh/document/product/266/18874?has_map=1#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4) by default.</li>
<li>If a designated upload park is specified, please confirm the [upload storage settings](https://www.tencentcloud.com/zh/document/product/266/18874) have already enabled corresponding storage regions.</li> 
     * @return StorageRegion Designate the upload park, applicable only to the user with special requirement for upload target region.
<li>If left blank, files will be uploaded to your [default region](https://www.tencentcloud.com/zh/document/product/266/18874?has_map=1#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4) by default.</li>
<li>If a designated upload park is specified, please confirm the [upload storage settings](https://www.tencentcloud.com/zh/document/product/266/18874) have already enabled corresponding storage regions.</li>
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set Designate the upload park, applicable only to the user with special requirement for upload target region.
<li>If left blank, files will be uploaded to your [default region](https://www.tencentcloud.com/zh/document/product/266/18874?has_map=1#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4) by default.</li>
<li>If a designated upload park is specified, please confirm the [upload storage settings](https://www.tencentcloud.com/zh/document/product/266/18874) have already enabled corresponding storage regions.</li>
     * @param StorageRegion Designate the upload park, applicable only to the user with special requirement for upload target region.
<li>If left blank, files will be uploaded to your [default region](https://www.tencentcloud.com/zh/document/product/266/18874?has_map=1#.E5.AD.98.E5.82.A8.E5.9C.B0.E5.9F.9F.E6.AD.A5.E9.AA.A4) by default.</li>
<li>If a designated upload park is specified, please confirm the [upload storage settings](https://www.tencentcloud.com/zh/document/product/266/18874) have already enabled corresponding storage regions.</li>
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/31772?from_cn_redirect=1) API. 
     * @return ClassId Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/31772?from_cn_redirect=1) API.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/31772?from_cn_redirect=1) API.
     * @param ClassId Category ID, used to categorize and manage media. You can create a category and obtain the category ID via the [create category](https://www.tencentcloud.com/document/product/266/31772?from_cn_redirect=1) API.
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get Task priority. The higher the value, the higher the priority. The value ranges from -10 to 10. If left blank, the default value is 0. 
     * @return TasksPriority Task priority. The higher the value, the higher the priority. The value ranges from -10 to 10. If left blank, the default value is 0.
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set Task priority. The higher the value, the higher the priority. The value ranges from -10 to 10. If left blank, the default value is 0.
     * @param TasksPriority Task priority. The higher the value, the higher the priority. The value ranges from -10 to 10. If left blank, the default value is 0.
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get Source context, used for passing through user request information. When specifying a Procedure task, the task flow status change callback will return the value of this field, up to 1000 characters. 
     * @return SessionContext Source context, used for passing through user request information. When specifying a Procedure task, the task flow status change callback will return the value of this field, up to 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context, used for passing through user request information. When specifying a Procedure task, the task flow status change callback will return the value of this field, up to 1000 characters.
     * @param SessionContext Source context, used for passing through user request information. When specifying a Procedure task, the task flow status change callback will return the value of this field, up to 1000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed. 
     * @return SessionId Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.
     * @param SessionId Identifier for deduplication. If a request with the same identifier has been sent within the past three days, an error is returned for the current request. The maximum length is 50 characters. If this is not specified or left empty, deduplication is not performed.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Reserved field, used when special purpose. 
     * @return ExtInfo Reserved field, used when special purpose.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set Reserved field, used when special purpose.
     * @param ExtInfo Reserved field, used when special purpose.
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get Source context, used to pass through user request information. The [callback on upload completion](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) will return the value of this field, up to 250 characters. 
     * @return SourceContext Source context, used to pass through user request information. The [callback on upload completion](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) will return the value of this field, up to 250 characters.
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set Source context, used to pass through user request information. The [callback on upload completion](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) will return the value of this field, up to 250 characters.
     * @param SourceContext Source context, used to pass through user request information. The [callback on upload completion](https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1) will return the value of this field, up to 250 characters.
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    /**
     * Get Media storage path, starting with /.
Only sub-apps in [FileID + Path mode](https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1) can specify the storage path. 
     * @return MediaStoragePath Media storage path, starting with /.
Only sub-apps in [FileID + Path mode](https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1) can specify the storage path.
     */
    public String getMediaStoragePath() {
        return this.MediaStoragePath;
    }

    /**
     * Set Media storage path, starting with /.
Only sub-apps in [FileID + Path mode](https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1) can specify the storage path.
     * @param MediaStoragePath Media storage path, starting with /.
Only sub-apps in [FileID + Path mode](https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1) can specify the storage path.
     */
    public void setMediaStoragePath(String MediaStoragePath) {
        this.MediaStoragePath = MediaStoragePath;
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
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
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
        if (source.MediaStoragePath != null) {
            this.MediaStoragePath = new String(source.MediaStoragePath);
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
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "SourceContext", this.SourceContext);
        this.setParamSimple(map, prefix + "MediaStoragePath", this.MediaStoragePath);

    }
}

