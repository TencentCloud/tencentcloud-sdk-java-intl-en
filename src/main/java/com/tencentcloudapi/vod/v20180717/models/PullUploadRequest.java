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
    * URL of the media to be pulled. Media files in HLS and Dash formats cannot be pulled currently.
For the supported extensions, please see [Media Types](https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B).
    */
    @SerializedName("MediaUrl")
    @Expose
    private String MediaUrl;

    /**
    * Media name.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * URL of video cover to be pulled. Only gif, jpeg, and png formats are supported.
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * Subsequent task for media. For more information, please see [Specifying Task Flow After Upload](https://cloud.tencent.com/document/product/266/9759).
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * Expiration time of media file in ISO 8601 format. For more information, please see [Notes on ISO Date Format](https://cloud.tencent.com/document/product/266/11732#I).
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Specifies upload region. This is only applicable to users that have special requirements for the upload region (currently, only Beijing, Shanghai, and Chongqing regions are supported).
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [CreateClass](https://cloud.tencent.com/document/product/266/7812) API.
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
    * The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or a blank string is entered, no deduplication will be performed.
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
    * [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get URL of the media to be pulled. Media files in HLS and Dash formats cannot be pulled currently.
For the supported extensions, please see [Media Types](https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B). 
     * @return MediaUrl URL of the media to be pulled. Media files in HLS and Dash formats cannot be pulled currently.
For the supported extensions, please see [Media Types](https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B).
     */
    public String getMediaUrl() {
        return this.MediaUrl;
    }

    /**
     * Set URL of the media to be pulled. Media files in HLS and Dash formats cannot be pulled currently.
For the supported extensions, please see [Media Types](https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B).
     * @param MediaUrl URL of the media to be pulled. Media files in HLS and Dash formats cannot be pulled currently.
For the supported extensions, please see [Media Types](https://cloud.tencent.com/document/product/266/9760#.E5.AA.92.E4.BD.93.E7.B1.BB.E5.9E.8B).
     */
    public void setMediaUrl(String MediaUrl) {
        this.MediaUrl = MediaUrl;
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
     * Get URL of video cover to be pulled. Only gif, jpeg, and png formats are supported. 
     * @return CoverUrl URL of video cover to be pulled. Only gif, jpeg, and png formats are supported.
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set URL of video cover to be pulled. Only gif, jpeg, and png formats are supported.
     * @param CoverUrl URL of video cover to be pulled. Only gif, jpeg, and png formats are supported.
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get Subsequent task for media. For more information, please see [Specifying Task Flow After Upload](https://cloud.tencent.com/document/product/266/9759). 
     * @return Procedure Subsequent task for media. For more information, please see [Specifying Task Flow After Upload](https://cloud.tencent.com/document/product/266/9759).
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set Subsequent task for media. For more information, please see [Specifying Task Flow After Upload](https://cloud.tencent.com/document/product/266/9759).
     * @param Procedure Subsequent task for media. For more information, please see [Specifying Task Flow After Upload](https://cloud.tencent.com/document/product/266/9759).
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get Expiration time of media file in ISO 8601 format. For more information, please see [Notes on ISO Date Format](https://cloud.tencent.com/document/product/266/11732#I). 
     * @return ExpireTime Expiration time of media file in ISO 8601 format. For more information, please see [Notes on ISO Date Format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time of media file in ISO 8601 format. For more information, please see [Notes on ISO Date Format](https://cloud.tencent.com/document/product/266/11732#I).
     * @param ExpireTime Expiration time of media file in ISO 8601 format. For more information, please see [Notes on ISO Date Format](https://cloud.tencent.com/document/product/266/11732#I).
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Specifies upload region. This is only applicable to users that have special requirements for the upload region (currently, only Beijing, Shanghai, and Chongqing regions are supported). 
     * @return StorageRegion Specifies upload region. This is only applicable to users that have special requirements for the upload region (currently, only Beijing, Shanghai, and Chongqing regions are supported).
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set Specifies upload region. This is only applicable to users that have special requirements for the upload region (currently, only Beijing, Shanghai, and Chongqing regions are supported).
     * @param StorageRegion Specifies upload region. This is only applicable to users that have special requirements for the upload region (currently, only Beijing, Shanghai, and Chongqing regions are supported).
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [CreateClass](https://cloud.tencent.com/document/product/266/7812) API. 
     * @return ClassId Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [CreateClass](https://cloud.tencent.com/document/product/266/7812) API.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [CreateClass](https://cloud.tencent.com/document/product/266/7812) API.
     * @param ClassId Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [CreateClass](https://cloud.tencent.com/document/product/266/7812) API.
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
     * Get The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or a blank string is entered, no deduplication will be performed. 
     * @return SessionId The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or a blank string is entered, no deduplication will be performed.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or a blank string is entered, no deduplication will be performed.
     * @param SessionId The ID used for deduplication. If there was a request with the same ID in the last seven days, the current request will return an error. The ID can contain up to 50 characters. If this parameter is left empty or a blank string is entered, no deduplication will be performed.
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
     * Get [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty. 
     * @return SubAppId [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     * @param SubAppId [Subapplication](/document/product/266/14574) ID in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaUrl", this.MediaUrl);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

