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

public class CommandDocument extends AbstractModel {

    /**
    * Base64-encoded command.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Command type.
    */
    @SerializedName("CommandType")
    @Expose
    private String CommandType;

    /**
    * Timeout period.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Execution path.
    */
    @SerializedName("WorkingDirectory")
    @Expose
    private String WorkingDirectory;

    /**
    * The user who executes the command.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * URL of the COS bucket to store the output
    */
    @SerializedName("OutputCOSBucketUrl")
    @Expose
    private String OutputCOSBucketUrl;

    /**
    * Prefix of the output file name 
    */
    @SerializedName("OutputCOSKeyPrefix")
    @Expose
    private String OutputCOSKeyPrefix;

    /**
     * Get Base64-encoded command. 
     * @return Content Base64-encoded command.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Base64-encoded command.
     * @param Content Base64-encoded command.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Command type. 
     * @return CommandType Command type.
     */
    public String getCommandType() {
        return this.CommandType;
    }

    /**
     * Set Command type.
     * @param CommandType Command type.
     */
    public void setCommandType(String CommandType) {
        this.CommandType = CommandType;
    }

    /**
     * Get Timeout period. 
     * @return Timeout Timeout period.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Timeout period.
     * @param Timeout Timeout period.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Execution path. 
     * @return WorkingDirectory Execution path.
     */
    public String getWorkingDirectory() {
        return this.WorkingDirectory;
    }

    /**
     * Set Execution path.
     * @param WorkingDirectory Execution path.
     */
    public void setWorkingDirectory(String WorkingDirectory) {
        this.WorkingDirectory = WorkingDirectory;
    }

    /**
     * Get The user who executes the command. 
     * @return Username The user who executes the command.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set The user who executes the command.
     * @param Username The user who executes the command.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get URL of the COS bucket to store the output 
     * @return OutputCOSBucketUrl URL of the COS bucket to store the output
     */
    public String getOutputCOSBucketUrl() {
        return this.OutputCOSBucketUrl;
    }

    /**
     * Set URL of the COS bucket to store the output
     * @param OutputCOSBucketUrl URL of the COS bucket to store the output
     */
    public void setOutputCOSBucketUrl(String OutputCOSBucketUrl) {
        this.OutputCOSBucketUrl = OutputCOSBucketUrl;
    }

    /**
     * Get Prefix of the output file name  
     * @return OutputCOSKeyPrefix Prefix of the output file name 
     */
    public String getOutputCOSKeyPrefix() {
        return this.OutputCOSKeyPrefix;
    }

    /**
     * Set Prefix of the output file name 
     * @param OutputCOSKeyPrefix Prefix of the output file name 
     */
    public void setOutputCOSKeyPrefix(String OutputCOSKeyPrefix) {
        this.OutputCOSKeyPrefix = OutputCOSKeyPrefix;
    }

    public CommandDocument() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommandDocument(CommandDocument source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.CommandType != null) {
            this.CommandType = new String(source.CommandType);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.WorkingDirectory != null) {
            this.WorkingDirectory = new String(source.WorkingDirectory);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.OutputCOSBucketUrl != null) {
            this.OutputCOSBucketUrl = new String(source.OutputCOSBucketUrl);
        }
        if (source.OutputCOSKeyPrefix != null) {
            this.OutputCOSKeyPrefix = new String(source.OutputCOSKeyPrefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "CommandType", this.CommandType);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "WorkingDirectory", this.WorkingDirectory);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "OutputCOSBucketUrl", this.OutputCOSBucketUrl);
        this.setParamSimple(map, prefix + "OutputCOSKeyPrefix", this.OutputCOSKeyPrefix);

    }
}

