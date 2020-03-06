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

public class ApplyUploadRequest extends AbstractModel{

    /**
    * Media type. For the detailed valid values, please see [Upload Overview](/document/product/266/9760#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B).
    */
    @SerializedName("MediaType")
    @Expose
    private String MediaType;

    /**
    * Media name.
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * Cover type. For the detailed valid values, please see [Upload Overview](/document/product/266/9760#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B).
    */
    @SerializedName("CoverType")
    @Expose
    private String CoverType;

    /**
    * Subsequent task operation on a media file, i.e., after a media file is uploaded, task flow operations will be initiated automatically. This parameter value is a task flow template name. VOD supports [creating task flow templates](/document/product/266/33819) and naming the templates.
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * Expiration time of a media file in ISO 8601 format. For more information, please see [Notes on ISO Date Format](/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Specifies upload region. This is only applicable to users that have special requirements for the upload region.
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](/document/product/266/7812) API.
<li>Default value: 0, which means "Other".</li>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * Source context, which is used to pass through the user request information. The [upload callback](/document/product/266/7830) API will return the value of this field. It can contain up to 250 characters.
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
    * Session context, which is used to pass through the user request information. If the `Procedure` parameter is specified, the [task flow status change callback](/document/product/266/9636) API will return the value of this field. It can contain up to 1,000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * ID of a [subapplication](/document/product/266/14574) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Media type. For the detailed valid values, please see [Upload Overview](/document/product/266/9760#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B). 
     * @return MediaType Media type. For the detailed valid values, please see [Upload Overview](/document/product/266/9760#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B).
     */
    public String getMediaType() {
        return this.MediaType;
    }

    /**
     * Set Media type. For the detailed valid values, please see [Upload Overview](/document/product/266/9760#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B).
     * @param MediaType Media type. For the detailed valid values, please see [Upload Overview](/document/product/266/9760#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B).
     */
    public void setMediaType(String MediaType) {
        this.MediaType = MediaType;
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
     * Get Cover type. For the detailed valid values, please see [Upload Overview](/document/product/266/9760#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B). 
     * @return CoverType Cover type. For the detailed valid values, please see [Upload Overview](/document/product/266/9760#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B).
     */
    public String getCoverType() {
        return this.CoverType;
    }

    /**
     * Set Cover type. For the detailed valid values, please see [Upload Overview](/document/product/266/9760#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B).
     * @param CoverType Cover type. For the detailed valid values, please see [Upload Overview](/document/product/266/9760#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B).
     */
    public void setCoverType(String CoverType) {
        this.CoverType = CoverType;
    }

    /**
     * Get Subsequent task operation on a media file, i.e., after a media file is uploaded, task flow operations will be initiated automatically. This parameter value is a task flow template name. VOD supports [creating task flow templates](/document/product/266/33819) and naming the templates. 
     * @return Procedure Subsequent task operation on a media file, i.e., after a media file is uploaded, task flow operations will be initiated automatically. This parameter value is a task flow template name. VOD supports [creating task flow templates](/document/product/266/33819) and naming the templates.
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set Subsequent task operation on a media file, i.e., after a media file is uploaded, task flow operations will be initiated automatically. This parameter value is a task flow template name. VOD supports [creating task flow templates](/document/product/266/33819) and naming the templates.
     * @param Procedure Subsequent task operation on a media file, i.e., after a media file is uploaded, task flow operations will be initiated automatically. This parameter value is a task flow template name. VOD supports [creating task flow templates](/document/product/266/33819) and naming the templates.
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get Expiration time of a media file in ISO 8601 format. For more information, please see [Notes on ISO Date Format](/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F). 
     * @return ExpireTime Expiration time of a media file in ISO 8601 format. For more information, please see [Notes on ISO Date Format](/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time of a media file in ISO 8601 format. For more information, please see [Notes on ISO Date Format](/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     * @param ExpireTime Expiration time of a media file in ISO 8601 format. For more information, please see [Notes on ISO Date Format](/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Specifies upload region. This is only applicable to users that have special requirements for the upload region. 
     * @return StorageRegion Specifies upload region. This is only applicable to users that have special requirements for the upload region.
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set Specifies upload region. This is only applicable to users that have special requirements for the upload region.
     * @param StorageRegion Specifies upload region. This is only applicable to users that have special requirements for the upload region.
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](/document/product/266/7812) API.
<li>Default value: 0, which means "Other".</li> 
     * @return ClassId Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](/document/product/266/7812) API.
<li>Default value: 0, which means "Other".</li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](/document/product/266/7812) API.
<li>Default value: 0, which means "Other".</li>
     * @param ClassId Category ID, which is used to categorize the media for management. A category can be created and its ID can be obtained by using the [category creating](/document/product/266/7812) API.
<li>Default value: 0, which means "Other".</li>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get Source context, which is used to pass through the user request information. The [upload callback](/document/product/266/7830) API will return the value of this field. It can contain up to 250 characters. 
     * @return SourceContext Source context, which is used to pass through the user request information. The [upload callback](/document/product/266/7830) API will return the value of this field. It can contain up to 250 characters.
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set Source context, which is used to pass through the user request information. The [upload callback](/document/product/266/7830) API will return the value of this field. It can contain up to 250 characters.
     * @param SourceContext Source context, which is used to pass through the user request information. The [upload callback](/document/product/266/7830) API will return the value of this field. It can contain up to 250 characters.
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    /**
     * Get Session context, which is used to pass through the user request information. If the `Procedure` parameter is specified, the [task flow status change callback](/document/product/266/9636) API will return the value of this field. It can contain up to 1,000 characters. 
     * @return SessionContext Session context, which is used to pass through the user request information. If the `Procedure` parameter is specified, the [task flow status change callback](/document/product/266/9636) API will return the value of this field. It can contain up to 1,000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Session context, which is used to pass through the user request information. If the `Procedure` parameter is specified, the [task flow status change callback](/document/product/266/9636) API will return the value of this field. It can contain up to 1,000 characters.
     * @param SessionContext Session context, which is used to pass through the user request information. If the `Procedure` parameter is specified, the [task flow status change callback](/document/product/266/9636) API will return the value of this field. It can contain up to 1,000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get ID of a [subapplication](/document/product/266/14574) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty. 
     * @return SubAppId ID of a [subapplication](/document/product/266/14574) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set ID of a [subapplication](/document/product/266/14574) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     * @param SubAppId ID of a [subapplication](/document/product/266/14574) in VOD. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaType", this.MediaType);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "CoverType", this.CoverType);
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "SourceContext", this.SourceContext);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

