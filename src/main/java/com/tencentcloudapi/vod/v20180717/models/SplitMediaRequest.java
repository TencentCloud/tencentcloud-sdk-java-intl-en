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

public class SplitMediaRequest extends AbstractModel {

    /**
    * The video ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Video splitting task information list, supporting up to 100 splitting messages at the same time.
    */
    @SerializedName("Segments")
    @Expose
    private SplitMediaTaskConfig [] Segments;

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Identifies the source context, which is used to transparently transmit user request information. This field value will be returned in the SplitMediaComplete callback and task flow status change callback, with a maximum length of 1000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * The identification code used for task deduplication. If there is a request with the same identification code within three days, this request will return an error. The maximum length is 50 characters, without or with an empty string to indicate no deduplication.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * The priority of the task. The larger the value, the higher the priority. The value range is -10 to 10. If left blank, it means 0.
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
     * Get The video ID. 
     * @return FileId The video ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set The video ID.
     * @param FileId The video ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Video splitting task information list, supporting up to 100 splitting messages at the same time. 
     * @return Segments Video splitting task information list, supporting up to 100 splitting messages at the same time.
     */
    public SplitMediaTaskConfig [] getSegments() {
        return this.Segments;
    }

    /**
     * Set Video splitting task information list, supporting up to 100 splitting messages at the same time.
     * @param Segments Video splitting task information list, supporting up to 100 splitting messages at the same time.
     */
    public void setSegments(SplitMediaTaskConfig [] Segments) {
        this.Segments = Segments;
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
     * Get Identifies the source context, which is used to transparently transmit user request information. This field value will be returned in the SplitMediaComplete callback and task flow status change callback, with a maximum length of 1000 characters. 
     * @return SessionContext Identifies the source context, which is used to transparently transmit user request information. This field value will be returned in the SplitMediaComplete callback and task flow status change callback, with a maximum length of 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Identifies the source context, which is used to transparently transmit user request information. This field value will be returned in the SplitMediaComplete callback and task flow status change callback, with a maximum length of 1000 characters.
     * @param SessionContext Identifies the source context, which is used to transparently transmit user request information. This field value will be returned in the SplitMediaComplete callback and task flow status change callback, with a maximum length of 1000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get The identification code used for task deduplication. If there is a request with the same identification code within three days, this request will return an error. The maximum length is 50 characters, without or with an empty string to indicate no deduplication. 
     * @return SessionId The identification code used for task deduplication. If there is a request with the same identification code within three days, this request will return an error. The maximum length is 50 characters, without or with an empty string to indicate no deduplication.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The identification code used for task deduplication. If there is a request with the same identification code within three days, this request will return an error. The maximum length is 50 characters, without or with an empty string to indicate no deduplication.
     * @param SessionId The identification code used for task deduplication. If there is a request with the same identification code within three days, this request will return an error. The maximum length is 50 characters, without or with an empty string to indicate no deduplication.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get The priority of the task. The larger the value, the higher the priority. The value range is -10 to 10. If left blank, it means 0. 
     * @return TasksPriority The priority of the task. The larger the value, the higher the priority. The value range is -10 to 10. If left blank, it means 0.
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set The priority of the task. The larger the value, the higher the priority. The value range is -10 to 10. If left blank, it means 0.
     * @param TasksPriority The priority of the task. The larger the value, the higher the priority. The value range is -10 to 10. If left blank, it means 0.
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    public SplitMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SplitMediaRequest(SplitMediaRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Segments != null) {
            this.Segments = new SplitMediaTaskConfig[source.Segments.length];
            for (int i = 0; i < source.Segments.length; i++) {
                this.Segments[i] = new SplitMediaTaskConfig(source.Segments[i]);
            }
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
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
        this.setParamArrayObj(map, prefix + "Segments.", this.Segments);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);

    }
}

