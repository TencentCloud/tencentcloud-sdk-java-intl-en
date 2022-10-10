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

public class ReviewAudioVideoRequest extends AbstractModel{

    /**
    * The media file ID, which is assigned after upload and uniquely identifies a file in VOD. You can view the ID of a file in the [NewFileUpload](https://www.tencentcloud.com/document/product/266/33950) callback or in the [VOD console](https://console.tencentcloud.com/vod/media).
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <b>The VOD [subapplication](https://www.tencentcloud.com/document/product/266/33987) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * The priority of a task flow. The higher the value, the higher the priority. Value range: [-10, 10]. If this parameter is left empty, 0 will be used.
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * The source context, which is used to pass through user request information. The `ReviewAudioVideoComplete` callback will return the value of this parameter. It can contain up to 1,000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * The session ID, which is used to identify duplicate requests. If there was a request with the same session ID in the last three days, an error will be returned for the current request. The session ID can contain up to 50 characters. If you do not pass this parameter or pass in an empty string, duplicate sessions will not be identified.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * A reserved parameter.
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get The media file ID, which is assigned after upload and uniquely identifies a file in VOD. You can view the ID of a file in the [NewFileUpload](https://www.tencentcloud.com/document/product/266/33950) callback or in the [VOD console](https://console.tencentcloud.com/vod/media). 
     * @return FileId The media file ID, which is assigned after upload and uniquely identifies a file in VOD. You can view the ID of a file in the [NewFileUpload](https://www.tencentcloud.com/document/product/266/33950) callback or in the [VOD console](https://console.tencentcloud.com/vod/media).
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set The media file ID, which is assigned after upload and uniquely identifies a file in VOD. You can view the ID of a file in the [NewFileUpload](https://www.tencentcloud.com/document/product/266/33950) callback or in the [VOD console](https://console.tencentcloud.com/vod/media).
     * @param FileId The media file ID, which is assigned after upload and uniquely identifies a file in VOD. You can view the ID of a file in the [NewFileUpload](https://www.tencentcloud.com/document/product/266/33950) callback or in the [VOD console](https://console.tencentcloud.com/vod/media).
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <b>The VOD [subapplication](https://www.tencentcloud.com/document/product/266/33987) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b> 
     * @return SubAppId <b>The VOD [subapplication](https://www.tencentcloud.com/document/product/266/33987) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [subapplication](https://www.tencentcloud.com/document/product/266/33987) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     * @param SubAppId <b>The VOD [subapplication](https://www.tencentcloud.com/document/product/266/33987) ID. If you need to access a resource in a subapplication, set this parameter to the subapplication ID; otherwise, leave it empty.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get The priority of a task flow. The higher the value, the higher the priority. Value range: [-10, 10]. If this parameter is left empty, 0 will be used. 
     * @return TasksPriority The priority of a task flow. The higher the value, the higher the priority. Value range: [-10, 10]. If this parameter is left empty, 0 will be used.
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set The priority of a task flow. The higher the value, the higher the priority. Value range: [-10, 10]. If this parameter is left empty, 0 will be used.
     * @param TasksPriority The priority of a task flow. The higher the value, the higher the priority. Value range: [-10, 10]. If this parameter is left empty, 0 will be used.
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get The source context, which is used to pass through user request information. The `ReviewAudioVideoComplete` callback will return the value of this parameter. It can contain up to 1,000 characters. 
     * @return SessionContext The source context, which is used to pass through user request information. The `ReviewAudioVideoComplete` callback will return the value of this parameter. It can contain up to 1,000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set The source context, which is used to pass through user request information. The `ReviewAudioVideoComplete` callback will return the value of this parameter. It can contain up to 1,000 characters.
     * @param SessionContext The source context, which is used to pass through user request information. The `ReviewAudioVideoComplete` callback will return the value of this parameter. It can contain up to 1,000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get The session ID, which is used to identify duplicate requests. If there was a request with the same session ID in the last three days, an error will be returned for the current request. The session ID can contain up to 50 characters. If you do not pass this parameter or pass in an empty string, duplicate sessions will not be identified. 
     * @return SessionId The session ID, which is used to identify duplicate requests. If there was a request with the same session ID in the last three days, an error will be returned for the current request. The session ID can contain up to 50 characters. If you do not pass this parameter or pass in an empty string, duplicate sessions will not be identified.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The session ID, which is used to identify duplicate requests. If there was a request with the same session ID in the last three days, an error will be returned for the current request. The session ID can contain up to 50 characters. If you do not pass this parameter or pass in an empty string, duplicate sessions will not be identified.
     * @param SessionId The session ID, which is used to identify duplicate requests. If there was a request with the same session ID in the last three days, an error will be returned for the current request. The session ID can contain up to 50 characters. If you do not pass this parameter or pass in an empty string, duplicate sessions will not be identified.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get A reserved parameter. 
     * @return ExtInfo A reserved parameter.
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set A reserved parameter.
     * @param ExtInfo A reserved parameter.
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public ReviewAudioVideoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReviewAudioVideoRequest(ReviewAudioVideoRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

