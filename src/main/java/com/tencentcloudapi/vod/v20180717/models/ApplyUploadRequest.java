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

public class ApplyUploadRequest extends AbstractModel {

    /**
    * <p>Media type. For available values, see <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B">upload capability summary</a>.</p>
    */
    @SerializedName("MediaType")
    @Expose
    private String MediaType;

    /**
    * <p><b>Video-on-Demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD services on or after December 25, 2023, this field must be set to the application ID when accessing resources in VOD applications, whether the default application or a newly created application.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Media name.</p>
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * <p>Cover Type. For available values, see <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B">upload capability summary</a>.</p>
    */
    @SerializedName("CoverType")
    @Expose
    private String CoverType;

    /**
    * <p>Subsequent media task processing operations, i.e., automatic task initiation after media upload is completed. The parameter value is the task flow template name. VOD supports <a href="https://www.tencentcloud.com/document/product/266/33819?from_cn_redirect=1">creating a task flow template</a> and naming the template.</p>
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * <p>Media file expiry time, format according to the ISO 8601 standard representation. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>Specify the upload park. This is applicable only to the user with special requirements for the upload target region.</p>
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the <a href="https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1">Create Category</a> API.</p><li>Default value: 0, indicating other categories.</li>
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * <p>Source context. This is used to pass user request information. The <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">upload completion callback</a> returns the value of this field. The maximum length is 250 characters.</p>
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
    * <p>Session context. This is used to pass user request information. When the Procedure parameter is specified, the <a href="https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1">task flow status change callback</a> returns the value of this field. The maximum length is 1000 characters.</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>Reserved field, used for special purposes.</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * <p>Media storage path, starting with /.<br>Only sub-apps in <a href="https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1">FileID + Path mode</a> can specify a storage path.</p>
    */
    @SerializedName("MediaStoragePath")
    @Expose
    private String MediaStoragePath;

    /**
     * Get <p>Media type. For available values, see <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B">upload capability summary</a>.</p> 
     * @return MediaType <p>Media type. For available values, see <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B">upload capability summary</a>.</p>
     */
    public String getMediaType() {
        return this.MediaType;
    }

    /**
     * Set <p>Media type. For available values, see <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B">upload capability summary</a>.</p>
     * @param MediaType <p>Media type. For available values, see <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B">upload capability summary</a>.</p>
     */
    public void setMediaType(String MediaType) {
        this.MediaType = MediaType;
    }

    /**
     * Get <p><b>Video-on-Demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD services on or after December 25, 2023, this field must be set to the application ID when accessing resources in VOD applications, whether the default application or a newly created application.</b></p> 
     * @return SubAppId <p><b>Video-on-Demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD services on or after December 25, 2023, this field must be set to the application ID when accessing resources in VOD applications, whether the default application or a newly created application.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>Video-on-Demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD services on or after December 25, 2023, this field must be set to the application ID when accessing resources in VOD applications, whether the default application or a newly created application.</b></p>
     * @param SubAppId <p><b>Video-on-Demand (VOD) <a href="https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1">application</a> ID. For customers who activate VOD services on or after December 25, 2023, this field must be set to the application ID when accessing resources in VOD applications, whether the default application or a newly created application.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Media name.</p> 
     * @return MediaName <p>Media name.</p>
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set <p>Media name.</p>
     * @param MediaName <p>Media name.</p>
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get <p>Cover Type. For available values, see <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B">upload capability summary</a>.</p> 
     * @return CoverType <p>Cover Type. For available values, see <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B">upload capability summary</a>.</p>
     */
    public String getCoverType() {
        return this.CoverType;
    }

    /**
     * Set <p>Cover Type. For available values, see <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B">upload capability summary</a>.</p>
     * @param CoverType <p>Cover Type. For available values, see <a href="https://www.tencentcloud.com/document/product/266/9760?from_cn_redirect=1#.E6.96.87.E4.BB.B6.E7.B1.BB.E5.9E.8B">upload capability summary</a>.</p>
     */
    public void setCoverType(String CoverType) {
        this.CoverType = CoverType;
    }

    /**
     * Get <p>Subsequent media task processing operations, i.e., automatic task initiation after media upload is completed. The parameter value is the task flow template name. VOD supports <a href="https://www.tencentcloud.com/document/product/266/33819?from_cn_redirect=1">creating a task flow template</a> and naming the template.</p> 
     * @return Procedure <p>Subsequent media task processing operations, i.e., automatic task initiation after media upload is completed. The parameter value is the task flow template name. VOD supports <a href="https://www.tencentcloud.com/document/product/266/33819?from_cn_redirect=1">creating a task flow template</a> and naming the template.</p>
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set <p>Subsequent media task processing operations, i.e., automatic task initiation after media upload is completed. The parameter value is the task flow template name. VOD supports <a href="https://www.tencentcloud.com/document/product/266/33819?from_cn_redirect=1">creating a task flow template</a> and naming the template.</p>
     * @param Procedure <p>Subsequent media task processing operations, i.e., automatic task initiation after media upload is completed. The parameter value is the task flow template name. VOD supports <a href="https://www.tencentcloud.com/document/product/266/33819?from_cn_redirect=1">creating a task flow template</a> and naming the template.</p>
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get <p>Media file expiry time, format according to the ISO 8601 standard representation. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p> 
     * @return ExpireTime <p>Media file expiry time, format according to the ISO 8601 standard representation. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Media file expiry time, format according to the ISO 8601 standard representation. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     * @param ExpireTime <p>Media file expiry time, format according to the ISO 8601 standard representation. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>Specify the upload park. This is applicable only to the user with special requirements for the upload target region.</p> 
     * @return StorageRegion <p>Specify the upload park. This is applicable only to the user with special requirements for the upload target region.</p>
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set <p>Specify the upload park. This is applicable only to the user with special requirements for the upload target region.</p>
     * @param StorageRegion <p>Specify the upload park. This is applicable only to the user with special requirements for the upload target region.</p>
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the <a href="https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1">Create Category</a> API.</p><li>Default value: 0, indicating other categories.</li> 
     * @return ClassId <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the <a href="https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1">Create Category</a> API.</p><li>Default value: 0, indicating other categories.</li>
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the <a href="https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1">Create Category</a> API.</p><li>Default value: 0, indicating other categories.</li>
     * @param ClassId <p>Category ID, used to categorize and manage media. You can create a category and obtain the category ID through the <a href="https://www.tencentcloud.com/document/product/266/7812?from_cn_redirect=1">Create Category</a> API.</p><li>Default value: 0, indicating other categories.</li>
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get <p>Source context. This is used to pass user request information. The <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">upload completion callback</a> returns the value of this field. The maximum length is 250 characters.</p> 
     * @return SourceContext <p>Source context. This is used to pass user request information. The <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">upload completion callback</a> returns the value of this field. The maximum length is 250 characters.</p>
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set <p>Source context. This is used to pass user request information. The <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">upload completion callback</a> returns the value of this field. The maximum length is 250 characters.</p>
     * @param SourceContext <p>Source context. This is used to pass user request information. The <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">upload completion callback</a> returns the value of this field. The maximum length is 250 characters.</p>
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    /**
     * Get <p>Session context. This is used to pass user request information. When the Procedure parameter is specified, the <a href="https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1">task flow status change callback</a> returns the value of this field. The maximum length is 1000 characters.</p> 
     * @return SessionContext <p>Session context. This is used to pass user request information. When the Procedure parameter is specified, the <a href="https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1">task flow status change callback</a> returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>Session context. This is used to pass user request information. When the Procedure parameter is specified, the <a href="https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1">task flow status change callback</a> returns the value of this field. The maximum length is 1000 characters.</p>
     * @param SessionContext <p>Session context. This is used to pass user request information. When the Procedure parameter is specified, the <a href="https://www.tencentcloud.com/document/product/266/9636?from_cn_redirect=1">task flow status change callback</a> returns the value of this field. The maximum length is 1000 characters.</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>Reserved field, used for special purposes.</p> 
     * @return ExtInfo <p>Reserved field, used for special purposes.</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>Reserved field, used for special purposes.</p>
     * @param ExtInfo <p>Reserved field, used for special purposes.</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get <p>Media storage path, starting with /.<br>Only sub-apps in <a href="https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1">FileID + Path mode</a> can specify a storage path.</p> 
     * @return MediaStoragePath <p>Media storage path, starting with /.<br>Only sub-apps in <a href="https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1">FileID + Path mode</a> can specify a storage path.</p>
     */
    public String getMediaStoragePath() {
        return this.MediaStoragePath;
    }

    /**
     * Set <p>Media storage path, starting with /.<br>Only sub-apps in <a href="https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1">FileID + Path mode</a> can specify a storage path.</p>
     * @param MediaStoragePath <p>Media storage path, starting with /.<br>Only sub-apps in <a href="https://www.tencentcloud.com/document/product/266/126825?from_cn_redirect=1">FileID + Path mode</a> can specify a storage path.</p>
     */
    public void setMediaStoragePath(String MediaStoragePath) {
        this.MediaStoragePath = MediaStoragePath;
    }

    public ApplyUploadRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyUploadRequest(ApplyUploadRequest source) {
        if (source.MediaType != null) {
            this.MediaType = new String(source.MediaType);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.CoverType != null) {
            this.CoverType = new String(source.CoverType);
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
        if (source.SourceContext != null) {
            this.SourceContext = new String(source.SourceContext);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.MediaStoragePath != null) {
            this.MediaStoragePath = new String(source.MediaStoragePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaType", this.MediaType);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "CoverType", this.CoverType);
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "SourceContext", this.SourceContext);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "MediaStoragePath", this.MediaStoragePath);

    }
}

