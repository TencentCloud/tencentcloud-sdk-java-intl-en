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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVoiceConversationRequest extends AbstractModel {

    /**
    * The TRTC [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid). It must be the same SdkAppId as the conversation room.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Unique ID of the conversation task. Returned when the conversation task starts successfully.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Whether to include the conversation history.
Valid values:
- 0: Do not include the conversation history.
- 1: Include the conversation history.

Default: 0
    */
    @SerializedName("DescribeType")
    @Expose
    private Long DescribeType;

    /**
     * Get The TRTC [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid). It must be the same SdkAppId as the conversation room. 
     * @return SdkAppId The TRTC [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid). It must be the same SdkAppId as the conversation room.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The TRTC [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid). It must be the same SdkAppId as the conversation room.
     * @param SdkAppId The TRTC [SdkAppId](https://www.tencentcloud.com/document/product/647/46351?from_cn_redirect=1#sdkappid). It must be the same SdkAppId as the conversation room.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Unique ID of the conversation task. Returned when the conversation task starts successfully. 
     * @return TaskId Unique ID of the conversation task. Returned when the conversation task starts successfully.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Unique ID of the conversation task. Returned when the conversation task starts successfully.
     * @param TaskId Unique ID of the conversation task. Returned when the conversation task starts successfully.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Whether to include the conversation history.
Valid values:
- 0: Do not include the conversation history.
- 1: Include the conversation history.

Default: 0 
     * @return DescribeType Whether to include the conversation history.
Valid values:
- 0: Do not include the conversation history.
- 1: Include the conversation history.

Default: 0
     */
    public Long getDescribeType() {
        return this.DescribeType;
    }

    /**
     * Set Whether to include the conversation history.
Valid values:
- 0: Do not include the conversation history.
- 1: Include the conversation history.

Default: 0
     * @param DescribeType Whether to include the conversation history.
Valid values:
- 0: Do not include the conversation history.
- 1: Include the conversation history.

Default: 0
     */
    public void setDescribeType(Long DescribeType) {
        this.DescribeType = DescribeType;
    }

    public DescribeVoiceConversationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVoiceConversationRequest(DescribeVoiceConversationRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.DescribeType != null) {
            this.DescribeType = new Long(source.DescribeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DescribeType", this.DescribeType);

    }
}

