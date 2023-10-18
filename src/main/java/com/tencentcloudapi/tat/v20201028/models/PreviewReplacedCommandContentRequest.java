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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PreviewReplacedCommandContentRequest extends AbstractModel {

    /**
    * Custom parameters for the preview. The field type is JSON encoded string. For example, {\"varA\": \"222\"}.
`key` is the name of the custom parameter and "value" is its specified value. Both "key" and "value" are strings.
At most 20 custom parameters are supported.
The name of the custom parameter cannot exceed 64 characters and can only contain [a-z], [A-Z], [0-9], [-_].
This parameter can be left empty if DefaultParameters is set for the previewed CommandId.
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * The command to be previewed. If DefaultParameters is set, it is combined with Parameters and Parameters takes priority.
`CommandId` or `Content` must be specified.
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * Base64-encoded command to be previewed. The maximum length is 64 KB.
CommandId or Content must be specified.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get Custom parameters for the preview. The field type is JSON encoded string. For example, {\"varA\": \"222\"}.
`key` is the name of the custom parameter and "value" is its specified value. Both "key" and "value" are strings.
At most 20 custom parameters are supported.
The name of the custom parameter cannot exceed 64 characters and can only contain [a-z], [A-Z], [0-9], [-_].
This parameter can be left empty if DefaultParameters is set for the previewed CommandId. 
     * @return Parameters Custom parameters for the preview. The field type is JSON encoded string. For example, {\"varA\": \"222\"}.
`key` is the name of the custom parameter and "value" is its specified value. Both "key" and "value" are strings.
At most 20 custom parameters are supported.
The name of the custom parameter cannot exceed 64 characters and can only contain [a-z], [A-Z], [0-9], [-_].
This parameter can be left empty if DefaultParameters is set for the previewed CommandId.
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set Custom parameters for the preview. The field type is JSON encoded string. For example, {\"varA\": \"222\"}.
`key` is the name of the custom parameter and "value" is its specified value. Both "key" and "value" are strings.
At most 20 custom parameters are supported.
The name of the custom parameter cannot exceed 64 characters and can only contain [a-z], [A-Z], [0-9], [-_].
This parameter can be left empty if DefaultParameters is set for the previewed CommandId.
     * @param Parameters Custom parameters for the preview. The field type is JSON encoded string. For example, {\"varA\": \"222\"}.
`key` is the name of the custom parameter and "value" is its specified value. Both "key" and "value" are strings.
At most 20 custom parameters are supported.
The name of the custom parameter cannot exceed 64 characters and can only contain [a-z], [A-Z], [0-9], [-_].
This parameter can be left empty if DefaultParameters is set for the previewed CommandId.
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get The command to be previewed. If DefaultParameters is set, it is combined with Parameters and Parameters takes priority.
`CommandId` or `Content` must be specified. 
     * @return CommandId The command to be previewed. If DefaultParameters is set, it is combined with Parameters and Parameters takes priority.
`CommandId` or `Content` must be specified.
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set The command to be previewed. If DefaultParameters is set, it is combined with Parameters and Parameters takes priority.
`CommandId` or `Content` must be specified.
     * @param CommandId The command to be previewed. If DefaultParameters is set, it is combined with Parameters and Parameters takes priority.
`CommandId` or `Content` must be specified.
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get Base64-encoded command to be previewed. The maximum length is 64 KB.
CommandId or Content must be specified. 
     * @return Content Base64-encoded command to be previewed. The maximum length is 64 KB.
CommandId or Content must be specified.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Base64-encoded command to be previewed. The maximum length is 64 KB.
CommandId or Content must be specified.
     * @param Content Base64-encoded command to be previewed. The maximum length is 64 KB.
CommandId or Content must be specified.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public PreviewReplacedCommandContentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreviewReplacedCommandContentRequest(PreviewReplacedCommandContentRequest source) {
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

