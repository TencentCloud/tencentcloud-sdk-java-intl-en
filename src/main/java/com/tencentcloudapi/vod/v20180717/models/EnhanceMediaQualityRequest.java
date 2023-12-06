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

public class EnhanceMediaQualityRequest extends AbstractModel {

    /**
    * Media file ID, that is, the globally unique identifier of the file on VOD, which is assigned by the VOD backend after successful upload. This field can be obtained from [video upload completion event notification](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media).
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Remaster template ID, please contact Tencent Cloud for details
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>VOD [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you want to access resources in the Subapplication, enter the Subapplication ID in this field; otherwise, you do not need to fill in this field.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Configuration of media files after Remaster
    */
    @SerializedName("OutputConfig")
    @Expose
    private EnhanceMediaQualityOutputConfig OutputConfig;

    /**
    * The identification code used for deduplication. If there has been a request with the same identification code within three days, this request will return an error. Up to 50 characters, without or with an empty string means no deduplication
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Source context, used to pass through user request information, Remaster completion callback will return this field value, up to 1000 characters
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * The priority of the task, the higher the value, the higher the priority, the range is -10 to 10, not filled in means 0
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
     * Get Media file ID, that is, the globally unique identifier of the file on VOD, which is assigned by the VOD backend after successful upload. This field can be obtained from [video upload completion event notification](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media). 
     * @return FileId Media file ID, that is, the globally unique identifier of the file on VOD, which is assigned by the VOD backend after successful upload. This field can be obtained from [video upload completion event notification](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media).
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Media file ID, that is, the globally unique identifier of the file on VOD, which is assigned by the VOD backend after successful upload. This field can be obtained from [video upload completion event notification](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media).
     * @param FileId Media file ID, that is, the globally unique identifier of the file on VOD, which is assigned by the VOD backend after successful upload. This field can be obtained from [video upload completion event notification](https://intl.cloud.tencent.com/document/product/266/7830?from_cn_redirect=1) or [vod console](https://console.cloud.tencent.com/vod/media).
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Remaster template ID, please contact Tencent Cloud for details 
     * @return Definition Remaster template ID, please contact Tencent Cloud for details
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Remaster template ID, please contact Tencent Cloud for details
     * @param Definition Remaster template ID, please contact Tencent Cloud for details
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <b>VOD [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you want to access resources in the Subapplication, enter the Subapplication ID in this field; otherwise, you do not need to fill in this field.</b> 
     * @return SubAppId <b>VOD [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you want to access resources in the Subapplication, enter the Subapplication ID in this field; otherwise, you do not need to fill in this field.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you want to access resources in the Subapplication, enter the Subapplication ID in this field; otherwise, you do not need to fill in this field.</b>
     * @param SubAppId <b>VOD [Subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you want to access resources in the Subapplication, enter the Subapplication ID in this field; otherwise, you do not need to fill in this field.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Configuration of media files after Remaster 
     * @return OutputConfig Configuration of media files after Remaster
     */
    public EnhanceMediaQualityOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * Set Configuration of media files after Remaster
     * @param OutputConfig Configuration of media files after Remaster
     */
    public void setOutputConfig(EnhanceMediaQualityOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * Get The identification code used for deduplication. If there has been a request with the same identification code within three days, this request will return an error. Up to 50 characters, without or with an empty string means no deduplication 
     * @return SessionId The identification code used for deduplication. If there has been a request with the same identification code within three days, this request will return an error. Up to 50 characters, without or with an empty string means no deduplication
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The identification code used for deduplication. If there has been a request with the same identification code within three days, this request will return an error. Up to 50 characters, without or with an empty string means no deduplication
     * @param SessionId The identification code used for deduplication. If there has been a request with the same identification code within three days, this request will return an error. Up to 50 characters, without or with an empty string means no deduplication
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Source context, used to pass through user request information, Remaster completion callback will return this field value, up to 1000 characters 
     * @return SessionContext Source context, used to pass through user request information, Remaster completion callback will return this field value, up to 1000 characters
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context, used to pass through user request information, Remaster completion callback will return this field value, up to 1000 characters
     * @param SessionContext Source context, used to pass through user request information, Remaster completion callback will return this field value, up to 1000 characters
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get The priority of the task, the higher the value, the higher the priority, the range is -10 to 10, not filled in means 0 
     * @return TasksPriority The priority of the task, the higher the value, the higher the priority, the range is -10 to 10, not filled in means 0
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set The priority of the task, the higher the value, the higher the priority, the range is -10 to 10, not filled in means 0
     * @param TasksPriority The priority of the task, the higher the value, the higher the priority, the range is -10 to 10, not filled in means 0
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    public EnhanceMediaQualityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnhanceMediaQualityRequest(EnhanceMediaQualityRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.OutputConfig != null) {
            this.OutputConfig = new EnhanceMediaQualityOutputConfig(source.OutputConfig);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);

    }
}

