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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TencentVod extends AbstractModel {

    /**
    * The operation to perform on the media uploaded. The value of this parameter is the name of a task flow template. You can create a custom task flow template in Tencent Cloud VOD.
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * The expiration time of the media file, which is a time period (seconds) from the current time. For example, `86400` means to save the media file for one day. To save the file permanently, set this parameter to `0`.
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * The storage region. Set this parameter if you have special requirements on the storage region.
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * The category ID, which is returned after you create a category by calling an API. You can use categories to manage media files.
The default value is `0`, which means others.
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * The VOD subapplication ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * The task flow context, which is passed through after the task is completed.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * The upload context, which is passed through after upload is completed.
    */
    @SerializedName("SourceContext")
    @Expose
    private String SourceContext;

    /**
    * The format of recording files uploaded to VOD. `0` (default): MP4; `1`: HLS; `2`: AAC (valid only if `StreamType` is `1`); `3`: HLS+MP4; `4`: HLS+AAC.
    */
    @SerializedName("MediaType")
    @Expose
    private Long MediaType;

    /**
    * The custom prefix of recording files. This parameter is valid only if recording files are uploaded to VOD. It can contain letters, numbers, underscores, and hyphens and cannot exceed 64 bytes. This prefix and the automatically generated filename are connected with `__UserId_u_`.
    */
    @SerializedName("UserDefineRecordId")
    @Expose
    private String UserDefineRecordId;

    /**
     * Get The operation to perform on the media uploaded. The value of this parameter is the name of a task flow template. You can create a custom task flow template in Tencent Cloud VOD. 
     * @return Procedure The operation to perform on the media uploaded. The value of this parameter is the name of a task flow template. You can create a custom task flow template in Tencent Cloud VOD.
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set The operation to perform on the media uploaded. The value of this parameter is the name of a task flow template. You can create a custom task flow template in Tencent Cloud VOD.
     * @param Procedure The operation to perform on the media uploaded. The value of this parameter is the name of a task flow template. You can create a custom task flow template in Tencent Cloud VOD.
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get The expiration time of the media file, which is a time period (seconds) from the current time. For example, `86400` means to save the media file for one day. To save the file permanently, set this parameter to `0`. 
     * @return ExpireTime The expiration time of the media file, which is a time period (seconds) from the current time. For example, `86400` means to save the media file for one day. To save the file permanently, set this parameter to `0`.
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set The expiration time of the media file, which is a time period (seconds) from the current time. For example, `86400` means to save the media file for one day. To save the file permanently, set this parameter to `0`.
     * @param ExpireTime The expiration time of the media file, which is a time period (seconds) from the current time. For example, `86400` means to save the media file for one day. To save the file permanently, set this parameter to `0`.
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get The storage region. Set this parameter if you have special requirements on the storage region. 
     * @return StorageRegion The storage region. Set this parameter if you have special requirements on the storage region.
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set The storage region. Set this parameter if you have special requirements on the storage region.
     * @param StorageRegion The storage region. Set this parameter if you have special requirements on the storage region.
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get The category ID, which is returned after you create a category by calling an API. You can use categories to manage media files.
The default value is `0`, which means others. 
     * @return ClassId The category ID, which is returned after you create a category by calling an API. You can use categories to manage media files.
The default value is `0`, which means others.
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set The category ID, which is returned after you create a category by calling an API. You can use categories to manage media files.
The default value is `0`, which means others.
     * @param ClassId The category ID, which is returned after you create a category by calling an API. You can use categories to manage media files.
The default value is `0`, which means others.
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get The VOD subapplication ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty. 
     * @return SubAppId The VOD subapplication ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set The VOD subapplication ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
     * @param SubAppId The VOD subapplication ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get The task flow context, which is passed through after the task is completed. 
     * @return SessionContext The task flow context, which is passed through after the task is completed.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set The task flow context, which is passed through after the task is completed.
     * @param SessionContext The task flow context, which is passed through after the task is completed.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get The upload context, which is passed through after upload is completed. 
     * @return SourceContext The upload context, which is passed through after upload is completed.
     */
    public String getSourceContext() {
        return this.SourceContext;
    }

    /**
     * Set The upload context, which is passed through after upload is completed.
     * @param SourceContext The upload context, which is passed through after upload is completed.
     */
    public void setSourceContext(String SourceContext) {
        this.SourceContext = SourceContext;
    }

    /**
     * Get The format of recording files uploaded to VOD. `0` (default): MP4; `1`: HLS; `2`: AAC (valid only if `StreamType` is `1`); `3`: HLS+MP4; `4`: HLS+AAC. 
     * @return MediaType The format of recording files uploaded to VOD. `0` (default): MP4; `1`: HLS; `2`: AAC (valid only if `StreamType` is `1`); `3`: HLS+MP4; `4`: HLS+AAC.
     */
    public Long getMediaType() {
        return this.MediaType;
    }

    /**
     * Set The format of recording files uploaded to VOD. `0` (default): MP4; `1`: HLS; `2`: AAC (valid only if `StreamType` is `1`); `3`: HLS+MP4; `4`: HLS+AAC.
     * @param MediaType The format of recording files uploaded to VOD. `0` (default): MP4; `1`: HLS; `2`: AAC (valid only if `StreamType` is `1`); `3`: HLS+MP4; `4`: HLS+AAC.
     */
    public void setMediaType(Long MediaType) {
        this.MediaType = MediaType;
    }

    /**
     * Get The custom prefix of recording files. This parameter is valid only if recording files are uploaded to VOD. It can contain letters, numbers, underscores, and hyphens and cannot exceed 64 bytes. This prefix and the automatically generated filename are connected with `__UserId_u_`. 
     * @return UserDefineRecordId The custom prefix of recording files. This parameter is valid only if recording files are uploaded to VOD. It can contain letters, numbers, underscores, and hyphens and cannot exceed 64 bytes. This prefix and the automatically generated filename are connected with `__UserId_u_`.
     */
    public String getUserDefineRecordId() {
        return this.UserDefineRecordId;
    }

    /**
     * Set The custom prefix of recording files. This parameter is valid only if recording files are uploaded to VOD. It can contain letters, numbers, underscores, and hyphens and cannot exceed 64 bytes. This prefix and the automatically generated filename are connected with `__UserId_u_`.
     * @param UserDefineRecordId The custom prefix of recording files. This parameter is valid only if recording files are uploaded to VOD. It can contain letters, numbers, underscores, and hyphens and cannot exceed 64 bytes. This prefix and the automatically generated filename are connected with `__UserId_u_`.
     */
    public void setUserDefineRecordId(String UserDefineRecordId) {
        this.UserDefineRecordId = UserDefineRecordId;
    }

    public TencentVod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TencentVod(TencentVod source) {
        if (source.Procedure != null) {
            this.Procedure = new String(source.Procedure);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SourceContext != null) {
            this.SourceContext = new String(source.SourceContext);
        }
        if (source.MediaType != null) {
            this.MediaType = new Long(source.MediaType);
        }
        if (source.UserDefineRecordId != null) {
            this.UserDefineRecordId = new String(source.UserDefineRecordId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SourceContext", this.SourceContext);
        this.setParamSimple(map, prefix + "MediaType", this.MediaType);
        this.setParamSimple(map, prefix + "UserDefineRecordId", this.UserDefineRecordId);

    }
}

