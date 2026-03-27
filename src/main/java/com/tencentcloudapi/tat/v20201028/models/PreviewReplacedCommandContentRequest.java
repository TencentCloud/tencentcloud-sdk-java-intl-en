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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PreviewReplacedCommandContentRequest extends AbstractModel {

    /**
    * The preview uses custom parameters. field type is json encoded string, for example: {"varA": "222"}.
This parameter can be set only when the EnableParameter of the command is true. you can obtain the EnableParameter settings through the [DescribeCommands (detailed command information)](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api.
If DefaultParameters or DefaultParameterConfs has set, it will overlay with Parameters and prioritize the value of Parameters.

key specifies the custom parameter name, and value specifies the parameter. both kv are string-type.
Custom parameters are limited to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
If the previewed CommandId has DefaultParameters set, this parameter can be empty.
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * Perform the replace preview command.
Call the [DescribeCommands](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api to query command details.
CommandId and Content, you must provide one and can only provide one.
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
     * Get The preview uses custom parameters. field type is json encoded string, for example: {"varA": "222"}.
This parameter can be set only when the EnableParameter of the command is true. you can obtain the EnableParameter settings through the [DescribeCommands (detailed command information)](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api.
If DefaultParameters or DefaultParameterConfs has set, it will overlay with Parameters and prioritize the value of Parameters.

key specifies the custom parameter name, and value specifies the parameter. both kv are string-type.
Custom parameters are limited to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
If the previewed CommandId has DefaultParameters set, this parameter can be empty. 
     * @return Parameters The preview uses custom parameters. field type is json encoded string, for example: {"varA": "222"}.
This parameter can be set only when the EnableParameter of the command is true. you can obtain the EnableParameter settings through the [DescribeCommands (detailed command information)](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api.
If DefaultParameters or DefaultParameterConfs has set, it will overlay with Parameters and prioritize the value of Parameters.

key specifies the custom parameter name, and value specifies the parameter. both kv are string-type.
Custom parameters are limited to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
If the previewed CommandId has DefaultParameters set, this parameter can be empty.
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set The preview uses custom parameters. field type is json encoded string, for example: {"varA": "222"}.
This parameter can be set only when the EnableParameter of the command is true. you can obtain the EnableParameter settings through the [DescribeCommands (detailed command information)](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api.
If DefaultParameters or DefaultParameterConfs has set, it will overlay with Parameters and prioritize the value of Parameters.

key specifies the custom parameter name, and value specifies the parameter. both kv are string-type.
Custom parameters are limited to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
If the previewed CommandId has DefaultParameters set, this parameter can be empty.
     * @param Parameters The preview uses custom parameters. field type is json encoded string, for example: {"varA": "222"}.
This parameter can be set only when the EnableParameter of the command is true. you can obtain the EnableParameter settings through the [DescribeCommands (detailed command information)](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api.
If DefaultParameters or DefaultParameterConfs has set, it will overlay with Parameters and prioritize the value of Parameters.

key specifies the custom parameter name, and value specifies the parameter. both kv are string-type.
Custom parameters are limited to 20.
The custom parameter name must meet the following standard: the number of characters has a cap of 64, and the optional range is [a-zA-Z0-9-_].
If the previewed CommandId has DefaultParameters set, this parameter can be empty.
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get Perform the replace preview command.
Call the [DescribeCommands](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api to query command details.
CommandId and Content, you must provide one and can only provide one. 
     * @return CommandId Perform the replace preview command.
Call the [DescribeCommands](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api to query command details.
CommandId and Content, you must provide one and can only provide one.
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set Perform the replace preview command.
Call the [DescribeCommands](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api to query command details.
CommandId and Content, you must provide one and can only provide one.
     * @param CommandId Perform the replace preview command.
Call the [DescribeCommands](https://www.tencentcloud.com/document/api/1340/52681?from_cn_redirect=1) api to query command details.
CommandId and Content, you must provide one and can only provide one.
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

