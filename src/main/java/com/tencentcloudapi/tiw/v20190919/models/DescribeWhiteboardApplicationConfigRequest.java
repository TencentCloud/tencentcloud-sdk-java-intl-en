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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWhiteboardApplicationConfigRequest extends AbstractModel {

    /**
    * SdkAppId of the whiteboard application.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Task types to be queried.
recording: Real-time recording.
transcode: Document transcoding.
    */
    @SerializedName("TaskTypes")
    @Expose
    private String [] TaskTypes;

    /**
    * SdkAppIds to be used to query configurations.
    */
    @SerializedName("SdkAppIds")
    @Expose
    private Long [] SdkAppIds;

    /**
     * Get SdkAppId of the whiteboard application. 
     * @return SdkAppId SdkAppId of the whiteboard application.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId of the whiteboard application.
     * @param SdkAppId SdkAppId of the whiteboard application.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Task types to be queried.
recording: Real-time recording.
transcode: Document transcoding. 
     * @return TaskTypes Task types to be queried.
recording: Real-time recording.
transcode: Document transcoding.
     */
    public String [] getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * Set Task types to be queried.
recording: Real-time recording.
transcode: Document transcoding.
     * @param TaskTypes Task types to be queried.
recording: Real-time recording.
transcode: Document transcoding.
     */
    public void setTaskTypes(String [] TaskTypes) {
        this.TaskTypes = TaskTypes;
    }

    /**
     * Get SdkAppIds to be used to query configurations. 
     * @return SdkAppIds SdkAppIds to be used to query configurations.
     */
    public Long [] getSdkAppIds() {
        return this.SdkAppIds;
    }

    /**
     * Set SdkAppIds to be used to query configurations.
     * @param SdkAppIds SdkAppIds to be used to query configurations.
     */
    public void setSdkAppIds(Long [] SdkAppIds) {
        this.SdkAppIds = SdkAppIds;
    }

    public DescribeWhiteboardApplicationConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWhiteboardApplicationConfigRequest(DescribeWhiteboardApplicationConfigRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TaskTypes != null) {
            this.TaskTypes = new String[source.TaskTypes.length];
            for (int i = 0; i < source.TaskTypes.length; i++) {
                this.TaskTypes[i] = new String(source.TaskTypes[i]);
            }
        }
        if (source.SdkAppIds != null) {
            this.SdkAppIds = new Long[source.SdkAppIds.length];
            for (int i = 0; i < source.SdkAppIds.length; i++) {
                this.SdkAppIds[i] = new Long(source.SdkAppIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);
        this.setParamArraySimple(map, prefix + "SdkAppIds.", this.SdkAppIds);

    }
}

